package model;

import controller.DataAccessObject;
import java.util.ArrayList;

public class Emprestimo extends DataAccessObject {
    private int codigo;
    private String dataEmprestimo;
    private String dataDevolucao;
    private double multa;
    private Usuario usuario;
    private Exemplar exemplar;
    private Pessoa pessoa;

    public Emprestimo() {
        super("emprestimo");
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo != this.codigo){
            this.codigo = codigo;
            addChange("codigo_emprestimo", this.codigo);
        }
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        if(!dataEmprestimo.equals(this.dataEmprestimo)){
            this.dataEmprestimo = dataEmprestimo;
            addChange("data_emprestimo", this.dataEmprestimo);
        }
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        if(!dataDevolucao.equals(this.dataDevolucao)){
            this.dataDevolucao = dataDevolucao;
            addChange("data_devolucao", this.dataDevolucao);
        }
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        if(multa != this.multa){
            this.multa = multa;
            addChange("multa", this.multa);
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) throws Exception {
        if(this.usuario == null) {
            if(usuario != null) {
                this.usuario = new Usuario();
                this.usuario.setCodigo(usuario.getCodigo());
                this.usuario.load();
                addChange("codigo_usuario", this.usuario.getCodigo());
            }
        } else {
            if(usuario == null) {
                this.usuario = null;
                addChange("codigo_usuario", null);
            } else {
                if(!this.usuario.equals(usuario)) {
                    this.usuario.setCodigo(usuario.getCodigo());
                    this.usuario.load();
                    addChange("codigo_usuario", this.usuario.getCodigo());
                }
            }
        }
    }

    public Exemplar getExemplar() {
        return exemplar;
    }

    public void setExemplar(Exemplar exemplar) throws Exception {
        if(this.exemplar == null) {
            if(exemplar != null) {
                this.exemplar = new Exemplar();
                this.exemplar.setCodigo(exemplar.getCodigo());
                this.exemplar.load();
                addChange("codigo_exemplar", this.exemplar.getCodigo());
            }
        } else {
            if(exemplar == null) {
                this.exemplar = null;
                addChange("codigo_exemplar", null);
            } else {
                if(!this.exemplar.equals(exemplar)) {
                    this.exemplar.setCodigo(exemplar.getCodigo());
                    this.exemplar.load();
                    addChange("codigo_exemplar", this.exemplar.getCodigo());
                }
            }
        }
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) throws Exception {
        if(this.pessoa == null) {
            if(pessoa != null) {
                this.pessoa = new Pessoa();
                this.pessoa.setCodigo(pessoa.getCodigo());
                this.pessoa.load();
                addChange("codigo_pessoa", this.pessoa.getCodigo());
            }
        } else {
            if(pessoa == null) {
                this.pessoa = null;
                addChange("codigo_pessoa", null);
            } else {
                if(!this.pessoa.equals(pessoa)) {
                    this.pessoa.setCodigo(pessoa.getCodigo());
                    this.pessoa.load();
                    addChange("codigo_pessoa", this.pessoa.getCodigo());
                }
            }
        }
    }

    @Override
    protected String getWhereClauseForOneEntry() {
        return " codigo_emprestimo = " + this.codigo;
    }

    @Override
    protected void fill(ArrayList<Object> data) throws Exception {
        this.codigo = (int) data.get(0);
        if(data.get(1) != null){
            this.dataEmprestimo = data.get(1).toString();
        }
        if(data.get(2) != null){
            this.dataDevolucao = data.get(2).toString();
        }
        this.multa = (double) data.get(3);
        if(data.get(4) != null){
            if(usuario == null){
                usuario = new Usuario();
            }
            usuario.setCodigo((int) data.get(4));
            usuario.load();
        }
        if(data.get(5) != null){
            if(exemplar == null){
                exemplar = new Exemplar();
            }
            exemplar.setCodigo((int) data.get(5));
            exemplar.load();
        }
        if(data.get(6) != null){
            if(pessoa == null){
                pessoa = new Pessoa();
            }
            pessoa.setCodigo((int) data.get(6));
            pessoa.load();
        }
    }
}
