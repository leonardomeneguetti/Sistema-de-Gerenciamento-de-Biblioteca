package model;

import controller.DataAccessObject;
import java.util.ArrayList;

public class Reserva extends DataAccessObject{
    private int codigo;
    private Pessoa pessoa;
    private Usuario usuario;
    private Livro livro;

    public Reserva() {
        super("reserva");
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo != this.codigo){
            this.codigo = codigo;
            addChange("codigo_reserva", this.codigo);
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

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) throws Exception {
        if(this.livro == null) {
            if(livro != null) {
                this.livro = new Livro();
                this.livro.setCodigo(livro.getCodigo());
                this.livro.load();
                addChange("codigo_livro", this.livro.getCodigo());
            }
        } else {
            if(livro == null) {
                this.livro = null;
                addChange("codigo_livro", null);
            } else {
                if(!this.livro.equals(livro)) {
                    this.livro.setCodigo(livro.getCodigo());
                    this.livro.load();
                    addChange("codigo_livro", this.livro.getCodigo());
                }
            }
        }
    }    

    @Override
    protected String getWhereClauseForOneEntry() {
        return " codigo_reserva = " + this.codigo;
    }

    @Override
    protected void fill(ArrayList<Object> data) throws Exception {
        this.codigo = (int) data.get(0);
        if(data.get(1) != null){
            if(pessoa == null){
                pessoa = new Pessoa();
            }
            pessoa.setCodigo((int) data.get(1));
            pessoa.load();
        }
        if(data.get(2) != null){
            if(usuario == null){
                usuario = new Usuario();
            }
            usuario.setCodigo((int) data.get(2));
            usuario.load();
        }
        if(data.get(3) != null){
            if(livro == null){
                livro = new Livro();
            }
            livro.setCodigo((int) data.get(3));
            livro.load();
        }
    }
}
