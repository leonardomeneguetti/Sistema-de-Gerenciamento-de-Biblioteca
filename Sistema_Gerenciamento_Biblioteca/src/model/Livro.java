package model;

import controller.DataAccessObject;
import java.util.ArrayList;

public class Livro extends DataAccessObject{
    private int codigo;
    private String isbn;
    private String titulo;
    private String autor;
    private String editora;
    private String qtdPaginas;

    public Livro() {
        super("livro");
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo != this.codigo){
            this.codigo = codigo;
            addChange("codigo_livro", this.codigo);
        }
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        if(!isbn.equals(this.isbn)){
            this.isbn = isbn;
            addChange("codigo_ISBN", this.isbn);
        }
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        if(!titulo.equals(this.titulo)){
            this.titulo = titulo;
            addChange("titulo", this.titulo);
        }
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        if(!autor.equals(this.autor)){
            this.autor = autor;
            addChange("autor", this.autor);
        }
    }

    public String getEditora() {
        return this.editora;
    }

    public void setEditora(String editora) {
        if(!editora.equals(this.editora)){
            this.editora = editora;
            addChange("editora", this.editora);
        }
    }

    public String getQtdPaginas() {
        return this.qtdPaginas;
    }

    public void setQtdPaginas(String qtdPaginas) {
        if(!qtdPaginas.equals(this.qtdPaginas)){
            this.qtdPaginas = qtdPaginas;
            addChange("qtd_paginas", this.qtdPaginas);
        }
    }
    
    @Override
    protected String getWhereClauseForOneEntry() {
        return " codigo_livro = " + this.codigo;
    }

    @Override
    protected void fill(ArrayList<Object> data) throws Exception {
        this.codigo = (int) data.get(0);
        this.isbn = (String) data.get(1);
        this.titulo = (String) data.get(2);
        this.autor = (String) data.get(3);
        this.editora = (String) data.get(4);
        this.qtdPaginas = (String) data.get(5);
    }
    
    @Override
    public boolean equals(Object obj) {        
        if(obj instanceof Livro) {
           
           Livro aux;
           aux = (Livro) obj;
            
            if(this.codigo == aux.getCodigo()) {
                return true;
            }             
        }        
        return false;
    }
}
