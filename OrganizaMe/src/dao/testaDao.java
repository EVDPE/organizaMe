/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import Logica.Filme;
import java.sql.SQLException;
import java.util.List;



public class testaDao {
    
    public static void main(String[] args) throws SQLException{
        
       /* Filme filmes = new Filme();
        
        filmes.setTitulo("homem aranha");
        filmes.setPais("EUA");
        filmes.setDiretor("Aranhoso");
        filmes.setTrilha_sonora("http://trilha");
        filmes.setTempo_duracao("1:50");
        filmes.setAno_lancamento("2006");
        filmes.setIdioma("Inglês");
        filmes.setTrailer("htto://trailer");
        filmes.setGenero("ação");
        filmes.setJa_assistiu("S");
        filmes.setSinopse("homem aranha, homem aranha, homem aranha");
        
        FilmeDao dao = new FilmeDao();
        dao.adicionar(filmes);
        System.out.println("Filme adicionado");
        */
        
        FilmeDao dao = new FilmeDao();
        
        List<Filme> minhaLista = dao.getLista();
        
        
    }
}
