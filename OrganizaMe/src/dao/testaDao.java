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
        
        // adiciona
        /*Filme filmes = new Filme();
        
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
        
        
        //lista
        /*
        
        FilmeDao dao = new FilmeDao();
        
        List<Filme> minhalista = dao.getLista();   
        
            for (Filme filmes : minhalista){
                
                System.out.println("ID: " + filmes.getId());
                System.out.println("Titulo: " + filmes.getTitulo());
                System.out.println("País: " + filmes.getPais());
                System.out.println("Diretor: " + filmes.getDiretor());
                System.out.println("Trilha sonora: " + filmes.getTrilha_sonora());
                System.out.println("tempo de duração: " + filmes.getTempo_duracao());
                System.out.println("lançamento: " + filmes.getAno_lancamento());
                System.out.println("idioma: " + filmes.getIdioma());
                System.out.println("trailer: " + filmes.getTrailer());
                System.out.println("genero: " + filmes.getGenero());
                System.out.println("ja assistiu?: " + filmes.getJa_assistiu());
                System.out.println("ja sinopse: " + filmes.getSinopse());
                System.out.println("---------------------------------------------------------------");                
    }*/
            
            
        //altera
        /*Filme filmes = new Filme();
        
        filmes.setId(Long.valueOf(2));
        filmes.setTitulo("AAAAAAAAA");
        filmes.setPais("AAAAAAAAA");
        filmes.setDiretor("AAAAAAAAA");
        filmes.setTrilha_sonora("AAAAAAAAA");
        filmes.setTempo_duracao("AAAAAAAAA");
        filmes.setAno_lancamento("AAAAAAAAA");
        filmes.setIdioma("AAAAAAAAA");
        filmes.setTrailer("AAAAAAAAA");
        filmes.setGenero("AAAAAAAAA");
        filmes.setJa_assistiu("A");
        filmes.setSinopse("AAAAAAAAA");
        
        FilmeDao dao = new FilmeDao();
        dao.altera(filmes);
        */
        
        
        //remove
        /*        
        
        Filme filmes = new Filme();
        filmes.setId(Long.valueOf(2));
        
        FilmeDao dao = new FilmeDao();
        dao.remove(filmes);*/ 
}
    
}
