package utffix;

import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Equipamento {
    private String codigo;
    private String nome;

    
    public Equipamento consultarEquipamento(String codigo) {
        BDConect con = new BDConect();            
        String sql = "SELECT * FROM equipamento WHERE codigo_equip = '" +codigo+ "'";
        ResultSet result = con.consult(sql);
        Equipamento equip = new Equipamento();
        
        try{		    
            while(result.next()){           
                equip.setNome(result.getString("nome_equip"));
                equip.setCodigo(result.getString("codigo_equip"));                
            }
        }
        catch(SQLException errSql){
            System.out.println("Error de SQL "+errSql+"! -- Erro na Consulta");
            JOptionPane.showMessageDialog(null, "Ocorreu um erro:\n" +errSql.getMessage().toString(), "Erro", JOptionPane.ERROR_MESSAGE );
            System.exit(0);
        }
            
        return equip;
        
    }
    
    public ArrayList<String> getNomes() {
        BDConect con = new BDConect();

        String sql = "SELECT DISTINCT nome_equip FROM equipamento";
        ResultSet result = con.consult(sql);
        Equipamento equip = new Equipamento();
        ArrayList<String> array = new ArrayList();
        
        try{		    
            while(result.next()){           
                array.add(result.getString("nome_equip"));
                //equip.setCodigo(result.getString("codigo_equip"));                
            }
        }
        catch(SQLException errSql){
            System.out.println("Error de SQL "+errSql+"! -- Erro na Consulta");
            JOptionPane.showMessageDialog(null, "Ocorreu um erro:\n" +errSql.getMessage().toString(), "Erro", JOptionPane.ERROR_MESSAGE );
            System.exit(0);
        }
        
        return array;
                    
    }
    
    public void cadastrarEquipamento(String nome, String codigo) {
        BDConect con = new BDConect();
        
        String sql = "INSERT INTO equipamento (nome_equip, codigo_equip)"
            + " VALUES('"+nome+"','"+codigo+"')";
                    
        con.inSQL(sql);        
    }
  
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
