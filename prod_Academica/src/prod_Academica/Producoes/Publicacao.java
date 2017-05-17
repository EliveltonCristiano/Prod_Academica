package prod_Academica.Producoes;

import java.util.ArrayList;
import prod_Academica.Pessoas.Colaborador;
import prod_Academica.Projeto.Projetos;

public class Publicacao {
    
    private ArrayList <Colaborador> listaColaboradores = new ArrayList <>();
    private ArrayList <Projetos> listaProjetos = new ArrayList <>();
    private String titulo;
    private String confOndeFoiPublicada;
    private int anoDePublicacao;


    public ArrayList <Colaborador> getListaColaboradores() {
        return listaColaboradores;
    }

    public void setListaColaboradores(Colaborador colabVinculado) {
        this.listaColaboradores.add(colabVinculado);
    }

    public ArrayList <Projetos> getListaProjetos() {
        return listaProjetos;
    }

    public void setListaProjetos(Projetos projVinculado) {
        this.listaProjetos.add(projVinculado);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConfOndeFoiPublicada() {
        return confOndeFoiPublicada;
    }

    public void setConfOndeFoiPublicada(String confOndeFoiPublicada) {
        this.confOndeFoiPublicada = confOndeFoiPublicada;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }
}
