package br.senai.sp.jandira.model;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class Medico extends Pessoa {

//    private String nome;
//    private String email;
//    private String telefone;
//    private LocalDate dataDeNascimento;
    private Integer codigo;
    private static int contador = 100;
    private String crm;
    
    private Especialidade especialidade;
    private ArrayList<Especialidade> especialidades;
//    private ArrayList<Medico> medicos;

    public Medico() {
        atualizarCodigo();
    }

//    public Medico(String nome) {
//        this.nome = nome;
//        atualizarCodigo();
//    }

    public Medico(Integer codigo, String crm, String nome) {
        this.codigo = codigo;
        this.crm = crm;
        setNome(nome);
        this.contador = this.codigo;
    }
    
    public Medico(int codigo, String crm, String nome, String telefone, String email, LocalDate dataNascimento, ArrayList especialidades) {
        this.codigo = codigo;
        this.crm = crm;
        setNome(nome);
        setTelefone(telefone);
        setEmail(email);
        setDataDeNascimento(dataNascimento);
        this.especialidades = especialidades;
        this.contador = this.codigo;
    }

    private void atualizarCodigo() {
        contador++;
        this.codigo = contador;
    }

    //Métodos de acesso
//    public String getNome(){
//        return nome;
//    }
    public Integer getCodigo() {
        return codigo;
    }

    public static int getContador() {
        return contador;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }
    
    public void setEspecialidades(ArrayList<Especialidade> especialidades) {
        this.especialidades = especialidades;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

//    public void setEspecialidades(ArrayList<Especialidade> especialidades) {
//        this.especialidades = especialidades;
//    }
    public Integer getCodigoEspecialidadeMedico(Integer codigo) {
        return EspecialidadeDAO.listarTodos().get(codigo).getCodigo();
    }

    public String getMedicoSeparadoPorPontoEVirgula() {
//        String MedicoStr = this.codigo + ";" + this.crm + ";" + this.nome + ";" + this.telefone + ";" + this.email + ";" + this.dataDeNascimento + ";" + this.especialidades;
//        return MedicoStr;
        return this.codigo + ";" + this.crm + ";" + this.getNome() + ";" + this.getTelefone() + ";" + this.getEmail() + ";" + this.getDataDeNascimento() + ";" + this.getEspecialidades();
    }
}
