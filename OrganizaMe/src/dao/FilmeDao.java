package dao;

import Logica.Filme;
import conexao.banco.CriaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmeDao {

    private Connection conexao;

    public FilmeDao() throws SQLException {
        this.conexao = CriaConexao.getConexao();
    }

    public void adicionar(Filme filmes) throws SQLException {
        //prepara conexão
        String sql = "INSERT INTO filme (titulo, pais, diretor, trilha_sonora, tempo_duracao, ano_lancamento, "
                + "idioma, trailer, genero, ja_assistiu, sinopse) VALUES (?,?,?,?,?,?,?,?,?,?,?)";

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
        stmt.setLong(12, filmes.getId());

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

    public List<Filme> getLista() throws SQLException {

        String sql = "SELECT * from filme";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        //stmt.setString(1, titulo);
        ResultSet rs = stmt.executeQuery();

        List<Filme> minhaLista = new ArrayList<Filme>();

        while (rs.next()) {
            Filme filmes = new Filme();
           
            filmes.setId(Long.valueOf(rs.getString("id")));
            filmes.setTitulo(rs.getString("titulo"));
            filmes.setPais(rs.getString("pais"));
            filmes.setDiretor(rs.getString("diretor"));
            filmes.setTrilha_sonora(rs.getString("trilha_sonora"));
            filmes.setTempo_duracao(rs.getString("tempo_duracao"));
            filmes.setAno_lancamento(rs.getString("ano_lancamento"));
            filmes.setIdioma(rs.getString("idioma"));
            filmes.setTrailer(rs.getString("trailer"));
            filmes.setGenero(rs.getString("genero"));
            filmes.setJa_assistiu(rs.getString("ja_assistiu"));
            filmes.setSinopse(rs.getString("sinopse"));

            minhaLista.add(filmes);
        }
        rs.close();
        stmt.close();
        return minhaLista;

    }
}
