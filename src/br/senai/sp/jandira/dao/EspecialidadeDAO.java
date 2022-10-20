package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {

    private Especialidade especialidade;
    private static ArrayList<Especialidade> especialidadeArray = new ArrayList<>();

    public EspecialidadeDAO(Especialidade especialidade) {
        this.especialidadeArray.add(especialidade);
    }

    public EspecialidadeDAO() {

    }

    public static void gravar(Especialidade especialidade) {
        especialidadeArray.add(especialidade);
    }

    public static boolean excluir(Integer codigo) {
        for (Especialidade e : especialidadeArray) {
            if (e.getCodigo().equals(codigo)) {
                especialidadeArray.remove(e);
                return true;
            }
        }
        return false;
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

    public static void criarEspecialidadeTeste() {
        //"Banco de dados"
        Especialidade e1 = new Especialidade("Cardiologia: ", "Especialidade que trabalha no diagnóstico e tratamento de doenças do coração e sistema circulatório.");
        Especialidade e2 = new Especialidade("Infectologia", "Estudo de doenças provocadas por patógenos como bactérias, vírus, fungos, protozoários, príons e zoonoses.");
        Especialidade e3 = new Especialidade("Nefrologia", "Destinada ao diagnóstico e tratamento clínico de doenças do aparelho urinário, em especial dos rins.");
        Especialidade e4 = new Especialidade("Gastroenterologia", "Responsável pelo diagnóstico e tratamento de doenças do sistema digestivo.");
        especialidadeArray.add(e1);
        especialidadeArray.add(e2);
        especialidadeArray.add(e3);
        especialidadeArray.add(e4);
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
