package prod_Academica.Pessoas;

import java.util.ArrayList;
import prod_Academica.Producoes.Orienta;
import prod_Academica.Producoes.Publicacao;

public class Professor extends Colaborador{
    
    private final ArrayList <Publicacao> listaPublicacoes;
    private final ArrayList <Orienta> listaOrientacoes;
    
    public Professor(){
        listaPublicacoes = new ArrayList <Publicacao>();
        listaOrientacoes = new ArrayList <Orienta>();
    }
}
