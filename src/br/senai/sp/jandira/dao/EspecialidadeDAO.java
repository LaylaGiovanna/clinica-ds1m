package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
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

public class EspecialidadeDAO {

    private Especialidade especialidade;
    private static ArrayList<Especialidade> especialidadeArray = new ArrayList<>();
    private static final String ARQUIVO = "C:\\Users\\22282096\\Documents\\NetBeansProjects\\especialidade.txt";
    private static final Path PATH = Paths.get(ARQUIVO);
    private static final String ARQUIVO_TEMP = "C:\\Users\\22282096\\Documents\\NetBeansProjects\\especialidade_temp.txt";
    private static final Path PATH_TEMP = Paths.get(ARQUIVO_TEMP);

    public EspecialidadeDAO(Especialidade especialidade) {
        this.especialidadeArray.add(especialidade);
    }

    public EspecialidadeDAO() {

    }

    public static void gravar(Especialidade especialidade) {
        especialidadeArray.add(especialidade);

        try {
            //Gravar a especialidade no arquivo Especialidade.txt
            BufferedWriter bw = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            bw.write(especialidade.getEspecialidadeSeparadoPorPontoEVirgula());
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
        for (Especialidade e : especialidadeArray) {
            if (e.getCodigo().equals(codigo)) {
                especialidadeArray.remove(e);
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

            for (Especialidade p : especialidadeArray) {
                bwTemp.write(p.getEspecialidadeSeparadoPorPontoEVirgula());
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

    public static Especialidade getEspecialidade(Integer codigo) {
        for (Especialidade e : especialidadeArray) {
            if (e.getCodigo().equals(codigo)) {
                return e;
            }
        }
        return null;
    }

    public static void atualizar(Especialidade especialidade) {
        for (Especialidade e : especialidadeArray) {
            if (e.getCodigo().equals(especialidade.getCodigo())) {
                especialidadeArray.set(especialidadeArray.indexOf(e), especialidade);
                break;
            }

        }

    }

    public static ArrayList<Especialidade> listarTodos() {
        return especialidadeArray;
    }

    public static void getListaEspecialidade() {
        try {
            BufferedReader br = Files.newBufferedReader(PATH);

            String linha = br.readLine();

            while (linha != null && !linha.isEmpty()) {
                String[] linhaVetor = linha.split(";");
                Especialidade novaEspecialidade = new Especialidade(
                        Integer.valueOf(linhaVetor[0]),
                        linhaVetor[1],
                        linhaVetor[2]);
                especialidadeArray.add(novaEspecialidade);
                linha = br.readLine();
            }
            br.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro.", "Erro na leitura", JOptionPane.ERROR_MESSAGE);
        }

        //        //"Banco de dados"
//        Especialidade e1 = new Especialidade("Cardiologia: ", "Especialidade que trabalha no diagnóstico e tratamento de doenças do coração e sistema circulatório.");
//        Especialidade e2 = new Especialidade("Infectologia", "Estudo de doenças provocadas por patógenos como bactérias, vírus, fungos, protozoários, príons e zoonoses.");
//        Especialidade e3 = new Especialidade("Nefrologia", "Destinada ao diagnóstico e tratamento clínico de doenças do aparelho urinário, em especial dos rins.");
//        Especialidade e4 = new Especialidade("Gastroenterologia", "Responsável pelo diagnóstico e tratamento de doenças do sistema digestivo.");
//        especialidadeArray.add(e1);
//        especialidadeArray.add(e2);
//        especialidadeArray.add(e3);
//        especialidadeArray.add(e4);
    }

    public static DefaultTableModel getTableModel() {

        //Matriz receberá planos de saúde
        //que serão utilizados na tabela (JTable)
        Object[][] dados = new Object[especialidadeArray.size()][3];

        //for each, para extrair cada plano de saude do
        //arraylist planos e separar cada dado na matriz dados
        int i = 0;
        for (Especialidade e : especialidadeArray) {
            dados[i][0] = e.getCodigo();
            dados[i][1] = e.getNome();
            dados[i][2] = e.getDescricao();
            i++;
        }
        //definir um vetor com os nome das da tabela
        String[] titulos = {"Código", "Nome da especialidade", "Descrição"};

        // Criar o modelo que será utilizado pelo JTable
        //para exibir os dados dos planos
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);

        return tableModel;

    }
}
