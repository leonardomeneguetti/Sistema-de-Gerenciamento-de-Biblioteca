package model;

import controller.DataAccessObject;
import controller.LogTrack;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;

public class Usuario extends DataAccessObject {
    private int codigo;
    private String nome;
    private String dataNascimento;
    private String cpf;
    private String rg;
    private String orgaoEmissor;
    private String cidade;
    private String estado;
    private String telefone;
    private String email;
    private String senha;
    private TipoUsuario tipoUsuario;

    public Usuario() {
        super("usuario");
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo != this.codigo){
            this.codigo = codigo;
            addChange("codigo_usuario", this.codigo);
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if(!nome.equals(this.nome)){
            this.nome = nome;
            addChange("nome_completo", this.nome);
        }
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        if(!dataNascimento.equals(this.dataNascimento)){
            this.dataNascimento = dataNascimento;
            addChange("data_nascimento", this.dataNascimento);
        }
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        if(!cpf.equals(this.cpf)){
            this.cpf = cpf;
            addChange("cpf", this.cpf);
        }
    }

    public String getRg() {
        return this.rg;
    }

    public void setRg(String rg) {
        if(!rg.equals(this.rg)){
            this.rg = rg;
            addChange("rg", this.rg);
        }
    }

    public String getOrgaoEmissor() {
        return this.orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        if(!orgaoEmissor.equals(this.orgaoEmissor)){
            this.orgaoEmissor = orgaoEmissor;
            addChange("orgao_emissor", this.orgaoEmissor);
        }
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        if(!cidade.equals(this.cidade)){
            this.cidade = cidade;
            addChange("cidade", this.cidade);
        }
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        if(!estado.equals(this.estado)){
            this.estado = estado;
            addChange("estado", this.estado);
        }
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        if(!telefone.equals(this.telefone)){
            this.telefone = telefone;
            addChange("telefone", this.telefone);
        }
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        if(!email.equals(this.email)){
            this.email = email;
            addChange("email", this.email);
        }
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        if(!senha.equals(this.senha)){
            this.senha = getSenhaHash(senha);
            addChange("senha_acesso", this.senha);
        }
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) throws Exception {
        if(this.tipoUsuario == null) {
            if(tipoUsuario != null) {
                this.tipoUsuario = new TipoUsuario();
                this.tipoUsuario.setCodigo(tipoUsuario.getCodigo());
                this.tipoUsuario.load();
                addChange("codigo_tipo_usuario", this.tipoUsuario.getCodigo());
            }
        } else {
            if(tipoUsuario == null) {
                this.tipoUsuario = null;
                addChange("codigo_tipo_usuario", null);
            } else {
                if(!this.tipoUsuario.equals(tipoUsuario)) {
                    this.tipoUsuario.setCodigo(tipoUsuario.getCodigo());
                    this.tipoUsuario.load();
                    addChange("codigo_tipo_usuario", this.tipoUsuario.getCodigo());
                }
            }
        }
    }
    
    private String getSenhaHash(String senhaAcesso) {
        String senhaHash = "";
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            senhaAcesso += String.valueOf(getCodigo()); //Técnica de proteção de Morris-Thompson (Sal n-bits) - adiciona um codigo aleatoria à senha
            senhaHash = new BigInteger(1, md.digest(senhaAcesso.getBytes("UTF-8"))).toString(16);
        } catch (Exception ex){
            LogTrack.getInstance().addException(ex, true, null);
        }
        return senhaHash;
    }
    
    @Override
    protected String getWhereClauseForOneEntry() {
        return " codigo_usuario = " + this.codigo;
    }

    @Override
    protected void fill(ArrayList<Object> data) throws Exception {
        this.codigo = (int) data.get(0);
        this.nome = (String) data.get(1);
        if(data.get(2) != null){
            this.dataNascimento = data.get(2).toString();
        }
        this.cpf = (String) data.get(3);
        this.rg = (String) data.get(4);
        this.orgaoEmissor = (String) data.get(5);
        this.cidade = (String) data.get(6);
        this.estado = (String) data.get(7);
        this.telefone = (String) data.get(8);
        this.email = (String) data.get(9);
        if(data.get(10) != null){
            this.senha = (String) data.get(10);
        }
        if(data.get(11) != null) {
            if(tipoUsuario == null) {
                tipoUsuario = new TipoUsuario();
            }
            tipoUsuario.setCodigo((int) data.get(11));
            tipoUsuario.load();
        }
    }
    
    @Override
    public boolean equals(Object obj) {        
        if(obj instanceof Usuario) {
           Usuario aux;
           aux = (Usuario) obj;
            
            if(this.codigo == aux.getCodigo()) {
                return true;
            }             
        }        
        return false;
    }
}
