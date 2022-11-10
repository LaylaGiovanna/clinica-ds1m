package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {

    private Medico medico;
    private static ArrayList<Medico> medicoArray = new ArrayList<>();
    private static final String ARQUIVO = "C:\\Users\\22282096\\Documents\\NetBeansProjects\\medico.txt";
    private static final Path PATH = Paths.get(ARQUIVO);
    private static final String ARQUIVO_TEMP = "C:\\Users\\22282096\\Documents\\NetBeansProjects\\medico_temp.txt";
    private static final Path PATH_TEMP = Paths.get(ARQUIVO_TEMP);

    public MedicoDAO() {

    }

    public MedicoDAO(Medico medico) {
        this.medicoArray.add(medico);
    }

    public static void gravar(Medico medico) {
        medicoArray.add(medico);

        try {
            //Gravar a especialidade no arquivo Especialidade.txt
            BufferedWriter bw = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            bw.write(medico.getMedicoSeparadoPorPontoEVirgula());
            bw.newLine();
            bw.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocorreu um erro ao gravar. \n\n Entre em contato com o suporte",
                    "Erro ao gravar",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    public static boolean excluir(Integer codigo) {
        for (Medico m : medicoArray) {
            if (m.getCodigo().equals(codigo)) {
                medicoArray.remove(m);
                break;
            }
        }

        atualizarArquivo();

        return false;
    }

    public static void atualizarArquivo() {
        //Reconstruir um arquivo atualizado, ou seja,
        //sem o plano que foi removido

        //PASSO 1 criar uma representação dos arquivos que serão manipulados
        File arquivoAtual = new File(ARQUIVO);
        File arquivoTemp = new File(ARQUIVO_TEMP);

        try {
            arquivoTemp.createNewFile();

            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            for (Medico m : medicoArray) {
                bwTemp.write(m.getMedicoSeparadoPorPontoEVirgula());
                bwTemp.newLine();
            }

            //Fechar o arquivo temporário
            bwTemp.close();

            //Excluir o arquivo atual - plano_de_saude.txt
            arquivoAtual.delete();

            //Renomear o arquivo temporário
            arquivoTemp.renameTo(arquivoAtual);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "Houve um erro ao criar o arquivo!!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static Medico getMedico(Integer codigo) {
        for (Medico m : medicoArray) {
            if (m.getCodigo().equals(codigo)) {
                return m;
            }
        }
        return null;
    }

    public static void atualizar(Medico medico) {
        for (Medico m : medicoArray) {
            if (m.getCodigo().equals(medico.getCodigo())) {
                medicoArray.set(medicoArray.indexOf(m), medico);
                break;
            }

        }
    }

    public static ArrayList<Medico> listarTodos() {
        return medicoArray;

    }

    public static void getListaMedico() {
        try {
            BufferedReader br = Files.newBufferedReader(PATH);

            String linha = br.readLine();

            while (linha != null && !linha.isEmpty()) {
                String[] linhaVetor = linha.split(";");
                Medico novoMedico = new Medico(
                        Integer.valueOf(linhaVetor[0]),
                        linhaVetor[1],
                        linhaVetor[2]);
                medicoArray.add(novoMedico);
                linha = br.readLine();
            }
            br.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro.", "Erro na leitura", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static DefaultTableModel getTableModel() {

        //Matriz receberá planos de saúde
        //que serão utilizados na tabela (JTable)
        Object[][] dados = new Object[medicoArray.size()][3];

        //for each, para extrair cada plano de saude do
        //arraylist planos e separar cada dado na matriz dados
        int i = 0;
        for (Medico m : medicoArray) {
            dados[i][0] = m.getCodigo();
            dados[i][1] = m.getCrm();
            dados[i][2] = m.getNome();
            i++;
        }
        //definir um vetor com os nome das da tabela
        String[] titulos = {"Código", "Nome do médico", "CRM"};

        // Criar o modelo que será utilizado pelo JTable
        //para exibir os dados dos planos
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);

        return tableModel;

    }

}
