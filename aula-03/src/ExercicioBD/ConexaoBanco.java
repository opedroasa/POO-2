package ExercicioBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class ConexaoBanco {

    //ATRIBUTOS
    public Connection conexao;
    private final String URL_Banco = "jdbc:mysql://localhost:3306/nomebd";
    private final String usuario = "root";
    private final String senha = "Ub3rl@nd1@";

    //CONSTRUTOR
    public ConexaoBanco()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(URL_Banco,usuario,senha);
            System.out.println("Conexao realizada com sucesso!");
        } catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Erro ao acesso o Banco de Dados!");
        }
    }

    //MÉTODOS
}
