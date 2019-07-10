package utffix;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Usuario {
    private String nome;
    private String login;
    private String senha;
    private int tipo;
    private int codigo;

    public Usuario consultarUsuario(String login) {
        BDConect con = new BDConect();      
        String sql = "SELECT * FROM usuario WHERE login_usuario = '" + login + "'";    
        ResultSet result = con.consult(sql);
        Usuario user = new Usuario();
        
        try{	            
            while(result.next()){
                user.setNome(result.getString("nome_usuario"));
                user.setLogin(result.getString("login_usuario"));
                user.setSenha(result.getString("senha_usuario"));
                user.setTipo(result.getInt("tipo_usuario"));
                user.setCodigo(result.getInt("codigo_usuario"));                                             
            }
        }
	catch(SQLException errSql){
            System.out.println("Error de SQL "+errSql+"! -- Erro na Consulta");
            JOptionPane.showMessageDialog(null, "Ocorreu um erro na validação.\n" +errSql.getMessage().toString(), "Erro", JOptionPane.ERROR_MESSAGE );
            System.exit(0);
	}
        
        return user;
    }
    
    public boolean validarSenha(Usuario user, char[] input) {
        boolean isCorrect = true;
        char[] senhaCorreta = user.getSenha().toCharArray();
        
        System.out.println(senhaCorreta.toString() + input.toString());
        //char[] correctPassword = { 'b', 'u', 'g', 'a', 'b', 'o', 'o' };

        if (input.length != senhaCorreta.length) {
            isCorrect = false;
        } else {
            isCorrect = input.equals(senhaCorreta);
        }

        return isCorrect;
    }
    
    public void cadastrarUsuario(String nome, String login, String senha, int tipo) {
        BDConect con = new BDConect();
        
        String sql = "INSERT INTO usuario (nome_usuario, login_usuario, senha_usuario, tipo_usuario)"
            + " VALUES('"+nome+"','"+login+"', '"+senha+"', "+tipo+")";
                    
        con.inSQL(sql); 
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
