import ExercicioBD.ConexaoBanco;
import ExercicioIMC.InterfaceIMC;
import ExercicioIMC.MassaCorporal;
import ExercicioUrna.InterfaceUrna;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws SQLException {

        //InterfaceUrna interfaceUrna = new InterfaceUrna();

        //InterfaceIMC interfaceIMC = new InterfaceIMC();

        ConexaoBanco objConexao = new ConexaoBanco();

        if(objConexao.conexao != null)
        {
            //INSERT 1
            /*Statement insert = objConexao.conexao.createStatement();
            String query = "INSERT INTO pessoa(nome,sobrenome,nivelusuario) values ('JOAQUIM', 'SARAIVA',1)";
            insert.execute(query);*/

            //INSERT 2
            /*PreparedStatement psInsert = objConexao.conexao.prepareStatement("INSERT INTO pessoa(nome,sobrenome,nivelusuario) values (?,?,?)");
            psInsert.setString(1,"RENATA");
            psInsert.setString(2,"SILVA");
            psInsert.setInt(3,3);
            psInsert.execute();*/

            //SELECT
            /*Statement select = objConexao.conexao.createStatement();
            ResultSet resultadoSelect = select.executeQuery("SELECT * FROM pessoa");

            while (resultadoSelect.next())
            {
                System.out.println(resultadoSelect.getString("nome") + " " +
                        resultadoSelect.getString("sobrenome") + " Nivel: " +
                        resultadoSelect.getString("nivelusuario"));*/

            //UPDATE
            /*Statement update = objConexao.conexao.createStatement();
            update.execute("UPDATE pessoa SET nome = 'JOCA' where id = 1");*/

            //DELETE
            /*Statement delete = objConexao.conexao.createStatement();
            delete.execute("DELETE FROM PESSOA WHERE ID = 2");*/

            }

        }

    }