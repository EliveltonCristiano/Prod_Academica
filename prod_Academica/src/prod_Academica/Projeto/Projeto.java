package prod_Academica.Projeto;

import prod_Academica.Pessoas.Colaborador;
import prod_Academica.Producoes.Publicacao;
import java.util.ArrayList;

public class Projeto {

    private int idProj;
    private int status = 1;
    private String titulo;
    private int inicioDia;
    private int inicioMes;
    private int inicioAno;
    private int fimDia =-1;
    private int fimMes =-1;
    private int fimAno =-1;
    private String financiador;
    private int valorFinanciamento;
    private String objetivo;
    private String descricao;
    private final ArrayList <Colaborador> listaColaboradores = new ArrayList <>();
    private final ArrayList <Publicacao> listaPublicacoes = new ArrayList <>();
            

    public int getIdProj() {
        return idProj;
    }

    public void setIdProj(int idProj) {
        this.idProj = idProj;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getInicioDia() {
        return inicioDia;
    }

    public void setInicioDia(int inicioDia) {
        this.inicioDia = inicioDia;
    }

    public int getInicioMes() {
        return inicioMes;
    }

    public void setInicioMes(int inicioMes) {
        this.inicioMes = inicioMes;
    }

    public int getInicioAno() {
        return inicioAno;
    }

    public void setInicioAno(int iniciioAno) {
        this.inicioAno = iniciioAno;
    }

    public int getFimDia() {
        return fimDia;
    }

    public void setFimDia(int fimDia) {
        this.fimDia = fimDia;
    }

    public int getFimMes() {
        return fimMes;
    }

    public void setFimMes(int fimMes) {
        this.fimMes = fimMes;
    }
 
    public int getFimAno() {
        return fimAno;
    }

    public void setFimAno(int fimAno) {
        this.fimAno = fimAno;
    }

    public String getFinanciador() {
        return financiador;
    }
 
    public void setFinanciador(String financiador) {
        this.financiador = financiador;
    }

    public int getValorFinanciamento() {
        return valorFinanciamento;
    }

    public void setValorFinanciamento(int valorFinanciamento) {
        this.valorFinanciamento = valorFinanciamento;
    }
 
    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
  
    public String getDescricao() {
        return descricao;
    }
 
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public ArrayList <Colaborador> getListaColaboradores() {
        return this.listaColaboradores;
    }

    public void setListaColaboradores(Colaborador colabVinculado) {
        this.listaColaboradores.add(colabVinculado);
    }

    public ArrayList <Publicacao> getListaPublicacoes() {
        return listaPublicacoes;
    }

    public void setListaPublicacoes(Publicacao publiVinculada) {
        this.listaPublicacoes.add(publiVinculada);
    }

}
