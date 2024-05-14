package model;

import controller.DataAccessObject;
import java.util.ArrayList;

public class Exemplar extends DataAccessObject {
    private int codigo;
    private int qtdCopias;
    private Livro livro;

    public Exemplar() {
        super("exemplar");
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo != this.codigo){
            this.codigo = codigo;
            addChange("codigo_exemplar", this.codigo);
        }
    }

    public int getQtdCopias() {
        return qtdCopias;
    }

    public void setQtdCopias(int qtdCopias) {
        if(qtdCopias != this.qtdCopias){
            this.qtdCopias = qtdCopias;
            addChange("qtd_copias", this.qtdCopias);
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
        return " codigo_exemplar = " + this.codigo;
    }

    @Override
    protected void fill(ArrayList<Object> data) throws Exception {
        this.codigo = (int) data.get(0);
        this.qtdCopias = (int) data.get(1);
        if(data.get(2) != null){
            if(livro == null){
                livro = new Livro();
            }
            livro.setCodigo((int) data.get(2));
            livro.load();
        }
    }
    
    @Override
    public boolean equals(Object obj) {        
        if(obj instanceof Exemplar) {
           
           Exemplar aux;
           aux = (Exemplar) obj;
            
            if(this.codigo == aux.getCodigo()) {
                return true;
            }             
        }        
        return false;
    }
}
