
package dao;

import java.sql.Connection;
import model.tarefa;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;


public class tarefaDAO {
    
    private final Connection connection;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private ArrayList<tarefa> lista = new ArrayList<tarefa>();
    

    public tarefaDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void inserir(tarefa tarefa) throws SQLException{
        
        String sql = "insert into tarefa (titulo, descricao, responsavel, prioridade, deadline, situacao) values ('"+ tarefa.getTitulo() +"','"+ tarefa.getDescricao() +"','"+ tarefa.getResponsavel() +"','"+ tarefa.getPrioridade() +"', '"+ tarefa.getDeadline() +"', 'Em andamento');";
        stmt = connection.prepareStatement(sql);
        if(tarefa.getTitulo().equals("") || tarefa.getDescricao().equals("") || tarefa.getDeadline().equals("")){
            JOptionPane.showMessageDialog(null, "Adicione as Informações");
        }else{
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Tarefa Cadastrada!");

        }
        connection.close();
        
    }

    public void alterar(tarefa tarefa) throws SQLException {
        
        String sql = "update tarefa set titulo = '"+tarefa.getTitulo()+"', descricao = '"+tarefa.getDescricao()+"', responsavel = '"+tarefa.getResponsavel()+"', prioridade = '"+tarefa.getPrioridade()+"', deadline = '"+tarefa.getDeadline()+"', situacao = 'Em andamento' where numero = '"+tarefa.getNumero()+"';";
        
        System.out.println(sql);
        try {
            stmt = connection.prepareStatement(sql);
            
            if(tarefa.getTitulo().equals("") || tarefa.getDescricao().equals("") || tarefa.getDeadline().equals("") || tarefa.getNumero() == 0){
                JOptionPane.showMessageDialog(null, "Adicione as Informações");
                if(tarefa.getNumero() == 0){
                    JOptionPane.showMessageDialog(null, "Selecione na tabela o item a ser atualizado");
                }
     
            }else{
                stmt.execute();
                JOptionPane.showMessageDialog(null, "Tarefa Atualizada!");

            }
            connection.close();
            
            
        } catch (Exception e) {
            
        }
        
        
    }

    public void excluir(int valor) throws SQLException {
        
        String sql = "delete from tarefa where numero = "+ valor;
        
        try {
            st = connection.createStatement();
            st.execute(sql);
            st.close();
            
        } catch (Exception e) {
        }
        
        
    }
    
    public ArrayList<tarefa> listarTodos(){
        
        String sql = "select * from tarefa";
        
        try {
            st = connection.createStatement();
            
            rs = st.executeQuery(sql);
            while(rs.next()){
                tarefa tar = new tarefa();
                tar.setNumero(rs.getInt("numero"));
                tar.setTitulo(rs.getString("titulo"));
                //tar.setDescricao(rs.getString("descricao"));
                tar.setResponsavel(rs.getString("responsavel"));
                //tar.setPrioridade(rs.getString("prioridade"));
                //tar.setDeadline(rs.getString("deadline"));
                //tar.setSituacao(rs.getString("situacao"));
                
                lista.add(tar);
            }
            
            st.close();
            
        } catch (Exception e) {
        }
        return lista;
    }
    
    public void concluirTarefa(int numero) {
        String sql = "update tarefa set situacao = 'Concluída' where numero ='"+ numero+"';";
        
        try {
            st = connection.createStatement();
            st.execute(sql);
            st.close();
            JOptionPane.showMessageDialog(null, "Tarefa "+numero+" Concluída!");
            
            
        } catch (Exception e) {
        }
        
    }
    
    public ArrayList<tarefa> listarTodosTitulo(String valor){
        
        
        String sql = "select * from tarefa where titulo like '%"+valor+"%'";
        try {
            st = connection.createStatement();
            
            rs = st.executeQuery(sql);
            while(rs.next()){
                tarefa tar = new tarefa();
                tar.setNumero(rs.getInt("numero"));
                tar.setTitulo(rs.getString("titulo"));
                tar.setResponsavel(rs.getString("responsavel"));
                
                lista.add(tar);
            }
            
            st.close();
            
        } catch (Exception e) {
        }
        return lista;
    }

    

    public ArrayList<tarefa> listarTodosNumeros(String valor) {
        
        String sql = "select * from tarefa where numero = '"+valor+"'";
        
       
        try {
            st = connection.createStatement();
            
            rs = st.executeQuery(sql);
            while(rs.next()){
                tarefa tar = new tarefa();
                tar.setNumero(rs.getInt("numero"));
                tar.setTitulo(rs.getString("titulo"));
                tar.setResponsavel(rs.getString("responsavel"));
                
                lista.add(tar);
            }
            
            st.close();
            
        } catch (Exception e) {
        }
        return lista;

    }
    
    public ArrayList<tarefa> listarTodosResponsavel(String valor){
        
        String sql = "select * from tarefa where responsavel like '%"+valor+"%'";
     
        
        try {
            st = connection.createStatement();
            
            rs = st.executeQuery(sql);
            while(rs.next()){
                tarefa tar = new tarefa();
                tar.setNumero(rs.getInt("numero"));
                tar.setTitulo(rs.getString("titulo"));
                tar.setResponsavel(rs.getString("responsavel"));
                
                lista.add(tar);
            }
            
            st.close();
            
        } catch (Exception e) {
        }
        return lista;
    }
    
    public ArrayList<tarefa> listarTodosSituacao(String valor){
        
        String sql = "select * from tarefa where situacao like '%"+valor+"%'";
       
        
        try {
            st = connection.createStatement();
            
            rs = st.executeQuery(sql);
            while(rs.next()){
                tarefa tar = new tarefa();
                tar.setNumero(rs.getInt("numero"));
                tar.setTitulo(rs.getString("titulo"));
                tar.setResponsavel(rs.getString("responsavel"));
                
                lista.add(tar);
            }
            
            st.close();
            
        } catch (Exception e) {
        }
        return lista;
    }
    
    
}
