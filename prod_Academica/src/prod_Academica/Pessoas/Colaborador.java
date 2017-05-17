package prod_Academica.Pessoas;

import prod_Academica.Producoes.Publicacao;
import java.util.ArrayList;
import prod_Academica.Projeto.Projeto;

public class Colaborador {

    private int idColab;
    private String nome;
    private String email;
    private ArrayList <Projeto> listaProjetos = new ArrayList<>();
    private ArrayList <Publicacao> listaPublicacoes = new ArrayList <>();
       
    public int getIdColab() {
        return idColab;
    }

    public void setIdColab(int idColab) {
        this.idColab = idColab;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList <Projeto> getListaProjetos() {
        return listaProjetos;
    }

    public void setListaProjetos(Projeto projVinculado) {
        this.listaProjetos.add(projVinculado);
    }

    public ArrayList <Publicacao> getListaPublicacoes() {
        return listaPublicacoes;
    }

    public void setListaPublicacoes(Publicacao publiVinculada) {
        this.listaPublicacoes.add (publiVinculada);
    }

}
