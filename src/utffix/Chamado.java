package utffix;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Chamado {
    private int codigo;
    private LocalDate dataAbertura;
    private LocalDate dataFechamento;
    private String local;
    private String codEquipamento;
    private String defeito;
    
    public void novoChamado(Chamado chamado, Usuario user) {
        Date date = Date.valueOf(chamado.getDataAbertura());
        BDConect con = new BDConect();         
        String sql = "INSERT INTO chamado (abertura_chamado, local_chamado, equipamento_chamado, defeito_chamado, chamado_fkey)" + 
                            " VALUES('"+ date +"', '" + chamado.getLocal() +"', '" +chamado.getCodEquipamento()+"', '" +chamado.getDefeito()+ "', '"+user.getCodigo()+"')";
        con.inSQL(sql);
    }
    
    public void finalizarChamado(int codigo) {
        BDConect con = new BDConect();
        LocalDate now = LocalDate.now();
        Date date = Date.valueOf(now);
        String sql = "UPDATE chamado SET fechamento_chamado= '"+date+"' WHERE codigo_chamado = "+ codigo;
        con.updSQL(sql);
    }
    
    public Chamado consultarChamado(int codigo) {
        BDConect con = new BDConect();      
        String sql = "SELECT * FROM chamado WHERE codigo_chamado = " +codigo;     
        ResultSet result = con.consult(sql);
        Chamado chamado = new Chamado();
        
        try{		    
            while(result.next()){           
                chamado.setCodigo(result.getInt("codigo_chamado"));
                chamado.setLocal(result.getString("local_chamado"));
                chamado.setDataAbertura(result.getDate("abertura_chamado").toLocalDate());
                if(result.getDate("fechamento_chamado") != null)
                    chamado.setDataFechamento(result.getDate("fechamento_chamado").toLocalDate());
                chamado.setCodEquipamento(result.getString("equipamento_chamado"));
                chamado.setDefeito(result.getString("defeito_chamado"));                                  
            }
        }
        catch(SQLException errSql){
            System.out.println("Error de SQL "+errSql+"! -- Erro na Consulta");
            JOptionPane.showMessageDialog(null, "Ocorreu um erro:\n" +errSql.getMessage().toString(), "Erro", JOptionPane.ERROR_MESSAGE );
            System.exit(0);
        }
        
        return chamado;
    }
    
    public ArrayList<Chamado> consultarChamadosUsuario(Usuario user) {
        BDConect con = new BDConect();        
        String sql = "SELECT * FROM chamado WHERE chamado_fkey = " +user.getCodigo()+ " ORDER BY codigo_chamado DESC";     
        ResultSet result = con.consult(sql);
        ArrayList<Chamado> chamados = new ArrayList();
        try{		    
            while(result.next()){ 
                Chamado chamado = new Chamado();
                chamado.setCodigo(result.getInt("codigo_chamado"));
                chamado.setLocal(result.getString("local_chamado"));
                chamado.setDataAbertura(result.getDate("abertura_chamado").toLocalDate());
                if(result.getDate("fechamento_chamado") != null)
                    chamado.setDataFechamento(result.getDate("fechamento_chamado").toLocalDate());
                chamado.setCodEquipamento(result.getString("equipamento_chamado"));
                chamado.setDefeito(result.getString("defeito_chamado"));                    
                chamados.add( chamado );     
                
            }
        }
        catch(SQLException errSql){
            System.out.println("Error de SQL "+errSql+"! -- Erro na Consulta");
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao registrar o chamado:\n" +errSql.getMessage().toString(), "Erro", JOptionPane.ERROR_MESSAGE );
            System.exit(0);
        }
        
        return chamados;
    }
     
    public ArrayList<Chamado> getAll() {
        BDConect con = new BDConect();      
        String sql = "SELECT * FROM chamado WHERE fechamento_chamado IS NULL";     
        ResultSet result = con.consult(sql);
        ArrayList<Chamado> chamados = new ArrayList();

        try{		    
            while(result.next()){    
                Chamado chamado = new Chamado();
                chamado.setCodigo(result.getInt("codigo_chamado"));
                chamado.setLocal(result.getString("local_chamado"));
                chamado.setDataAbertura(result.getDate("abertura_chamado").toLocalDate());
                if(result.getDate("fechamento_chamado") != null)
                    chamado.setDataFechamento(result.getDate("fechamento_chamado").toLocalDate());
                chamado.setCodEquipamento(result.getString("equipamento_chamado"));
                chamado.setDefeito(result.getString("defeito_chamado"));  
                chamados.add(chamado);
            }
        }
        catch(SQLException errSql){
            System.out.println("Error de SQL "+errSql+"! -- Erro na Consulta");
            JOptionPane.showMessageDialog(null, "Ocorreu um erro:\n" +errSql.getMessage().toString(), "Erro", JOptionPane.ERROR_MESSAGE );
            System.exit(0);
        }
        
        return chamados;
    }
    

    public ArrayList<Chamado> getAllByFiltro(String sql) {
        BDConect con = new BDConect();      
        //String sql = "SELECT * FROM chamado WHERE fechamento_chamado IS NULL";     
        ResultSet result = con.consult(sql);
        ArrayList<Chamado> chamados = new ArrayList();

        try{		    
            while(result.next()){    
                Chamado chamado = new Chamado();
                chamado.setCodigo(result.getInt("codigo_chamado"));
                chamado.setLocal(result.getString("local_chamado"));
                chamado.setDataAbertura(result.getDate("abertura_chamado").toLocalDate());
                if(result.getDate("fechamento_chamado") != null)
                    chamado.setDataFechamento(result.getDate("fechamento_chamado").toLocalDate());
                chamado.setCodEquipamento(result.getString("equipamento_chamado"));
                chamado.setDefeito(result.getString("defeito_chamado"));  
                chamados.add(chamado);
            }
        }
        catch(SQLException errSql){
            System.out.println("Error de SQL "+errSql+"! -- Erro na Consulta");
            JOptionPane.showMessageDialog(null, "Ocorreu um erro:\n" +errSql.getMessage().toString(), "Erro", JOptionPane.ERROR_MESSAGE );
            System.exit(0);
        }
        
        return chamados;
    }
    
    public String getDefeito() {
        return defeito;
    }

    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }  

    public String getCodEquipamento() {
        return codEquipamento;
    }

    public void setCodEquipamento(String codEquipamento) {
        this.codEquipamento = codEquipamento;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public LocalDate getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(LocalDate dataFechamento) {
        this.dataFechamento = dataFechamento;
    }
    
    @Override
    public String toString() {
        return "Chamado " + codigo;
    }
   
}
