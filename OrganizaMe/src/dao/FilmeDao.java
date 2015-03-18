package dao;

import Logica.Filme;
import conexao.banco.CriaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FilmeDao {

    private Connection conexao;

    public FilmeDao() throws SQLException {
        this.conexao = CriaConexao.getConexao();
    }

    public void adicionar(Filme filmes) throws SQLException {
        //prepara conexão
        String sql = "INSERT INTO filme (titulo, pais, diretor, trilha_sonora, tempo_duracao, ano_lancamento, "
                + "idioma, trailer, genero, ja_assistiu, sinopse) VALUES (?,?,?,?,?,?,?,?,?,?, ?)";

        PreparedStatement stmt = conexao.prepareStatement(sql);

        //seta os valores
        stmt.setString(1, filmes.getTitulo());
        stmt.setString(2, filmes.getPais());
        stmt.setString(3, filmes.getDiretor());
        stmt.setString(4, filmes.getTrilha_sonora());
        stmt.setString(5, filmes.getTempo_duracao());
        stmt.setString(6, filmes.getAno_lancamento());
        stmt.setString(7, filmes.getIdioma());
        stmt.setString(8, filmes.getTrailer());
        stmt.setString(9, filmes.getGenero());
        stmt.setString(10, filmes.getJa_assistiu());
        stmt.setString(11, filmes.getSinopse());

        //executa código SQL e depois fecha conexão
        stmt.execute();
        stmt.close();
    }

    public void altera(Filme filmes) throws SQLException {

        String sql = "UPDATE filme set titulo=?, pais=?, diretor=?, trilha_sonora=?, tempo_duracao=?, "
                + "ano_lancamento=?, idioma=?, trailer=?, genero=?, ja_assistiu=?, sinopse=? where id=?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);

        stmt.setString(1, filmes.getTitulo());
        stmt.setString(2, filmes.getPais());
        stmt.setString(3, filmes.getDiretor());
        stmt.setString(4, filmes.getTrilha_sonora());
        stmt.setString(5, filmes.getTempo_duracao());
        stmt.setString(6, filmes.getAno_lancamento());
        stmt.setString(7, filmes.getIdioma());
        stmt.setString(8, filmes.getTrailer());
        stmt.setString(9, filmes.getGenero());
        stmt.setString(10, filmes.getJa_assistiu());
        stmt.setString(11, filmes.getSinopse());

        stmt.execute();
        stmt.close();
    }

    public void remove(Filme filmes) throws SQLException {

        String sql = "DELETE from filme where id=?";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setLong(1, filmes.getId());
        stmt.execute();
        stmt.close();
    }
}
