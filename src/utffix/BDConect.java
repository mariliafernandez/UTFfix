package utffix;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import javax.swing.JOptionPane;
import java.sql.Date;
import java.time.LocalDate;

public class BDConect{
    
       
	static Connection connection = null;
	static ResultSet result      = null;
	static Statement statement   = null;

	//Dados do SGBD
	static String  usuario = "postgres";
        static String  db = "utffix";
	//static String  senha  = "postgres"; //- Postgres 9.???
	static String  senha  = "bancodedados1";
	//static String url = "jdbc:postgresql://localhost:5432/lkdil"; // nome da fonte de dados - Postgres 9.??
        static String url = "jdbc:postgresql://localhost:5432/utffix"; // nome da fonte de dados - Postgres 9.??
	//static String url = "jdbc:postgresql://localhost:5433/Comercial"; // nome da fonte de dados - Postgres 10.??


	//m�todo para estabelecer uma conex�o com SGBD
	public static void getConect(){
		try{
			Class classe = Class.forName("org.postgresql.Driver");

			System.out.println("\nClasse - toString   : "+classe.toString());
			System.out.println("\nClasse - getName : "+classe.getName());

			connection = DriverManager.getConnection(url,usuario,senha);

			statement = connection.createStatement();
		}

		catch(ClassNotFoundException erro){
			System.out.println("\n\nNao encontrou o Driver do BD --> "+erro+"!");
                        		erro.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Ocorreu um erro: \n" +erro.getMessage().toString(), "Erro", JOptionPane.ERROR_MESSAGE );

		}
		catch(SQLException erro){
			System.out.println("\n\nProblemas na execucao do SQL--> "+erro+"!");
                        JOptionPane.showMessageDialog(null, "Ocorreu um erro: \n" +erro.getMessage().toString(), "Erro", JOptionPane.ERROR_MESSAGE );
			System.exit(0);
                        
		}
	}

	//metodo para a execucao de uma insercao
	public static void inSQL(String sql){
		boolean boolIns = false;
		try{
			getConect();
			boolIns = statement.execute(sql);
                                              
		}
		catch(SQLException erro){
			System.out.println("\n\nErro de SQL BDConecta "+erro+"! -- de SQL em BDConecta");
                        JOptionPane.showMessageDialog(null, "Ocorreu um erro: \n" +erro.getMessage().toString(), "Erro", JOptionPane.ERROR_MESSAGE );
		}
                
		close();
	}


	//metodo para a execucao de uma atualizacao
	public static void updSQL(String sql){
		int intUpd = 0;
		try{
			getConect();
			intUpd = statement.executeUpdate(sql);
                        
                        JOptionPane.showMessageDialog(null, "Alterado com sucesso", "Aviso", JOptionPane.INFORMATION_MESSAGE );
		}
		catch(SQLException erro){
			System.out.println("Erro ao Atualizar! "+erro);
                        JOptionPane.showMessageDialog(null, "Ocorreu um erro: \n" +erro.getMessage().toString(), "Erro", JOptionPane.ERROR_MESSAGE );
		}
		close();
	}

        //consulta
        public static Usuario setResult(String sql) {
            ResultSet result = null;
		try{
			getConect();
			result = statement.executeQuery(sql);

		}
		catch(SQLException erro){
			System.out.println("\n\nErro de SQL BDConecta "+erro+"! -- de SQL em BDConecta");
                        JOptionPane.showMessageDialog(null, "Ocorreu um erro. \n" +erro.getMessage().toString(), "Erro", JOptionPane.ERROR_MESSAGE );
			System.exit(0);
		}
                
                Usuario user = new Usuario();                
                
		
                
                return user;
        }
        
        public static ResultSet consult(String sql) {
            ResultSet result = null;
		try{
			getConect();
			result = statement.executeQuery(sql);

		}
		catch(SQLException erro){
			System.out.println("\n\nErro de SQL BDConecta "+erro+"! -- de SQL em BDConecta");
                        JOptionPane.showMessageDialog(null, "Ocorreu um erro. \n" +erro.getMessage().toString(), "Erro", JOptionPane.ERROR_MESSAGE );
			System.exit(0);
		}
     
                return result;
        }

	//metodo para encerrar a conexao
	public static void close(){

		try{
			if(!connection.isClosed()) connection.close();
		}
		catch(SQLException erro){
			System.out.println("\n\nErro ao desconectar a: "+url+"! -- Erro de Desconexao!");
                        JOptionPane.showMessageDialog(null, "Ocorreu um erro no cadastro. \n" +erro.getMessage().toString(), "Erro", JOptionPane.ERROR_MESSAGE );

		}
	}

}
