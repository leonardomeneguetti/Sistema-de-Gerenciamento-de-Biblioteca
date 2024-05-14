package model;

import controller.DataAccessObject;
import java.util.ArrayList;

public class TipoUsuario extends DataAccessObject {
    private int codigo;
    private String nome;
    private String administrativo;
    private String atendimento;

    public TipoUsuario() {
        super("tipo_usuario");
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo != this.codigo){
            this.codigo = codigo;
            addChange("codigo_tipo_usuario", this.codigo);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(!nome.equals(this.nome)){
            this.nome = nome;
            addChange("nome", this.nome);
        }
    }

    public String getAdministrativo() {
        return administrativo;
    }

    public void setAdministrativo(String administrativo) {
        if(!administrativo.equals(this.administrativo)){
            this.administrativo = administrativo;
            addChange("administrativo", this.administrativo);
        }
    }

    public String getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(String atendimento) {
        if(!atendimento.equals(this.atendimento)){
            this.atendimento = atendimento;
            addChange("atendimento", this.atendimento);
        }
    }

    @Override
    protected String getWhereClauseForOneEntry() {
        return " codigo_tipo_usuario = " + this.codigo;
    }

    @Override
    protected void fill(ArrayList<Object> data) throws Exception {
        this.codigo = (int) data.get(0);
        this.nome = (String) data.get(1);
        this.administrativo = (String) data.get(2);
        this.atendimento = (String) data.get(3);
    }
}
