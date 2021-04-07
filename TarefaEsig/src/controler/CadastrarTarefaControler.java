
package controler;

import dao.conexao;
import dao.tarefaDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.tarefa;
import view.TelaCadastrarTarefa;
import view.TelaListagemTarefa;

public class CadastrarTarefaControler {
    
    private TelaCadastrarTarefa view;

    public CadastrarTarefaControler(TelaCadastrarTarefa view) {
        this.view = view;
    }
    
    public void SalvarTarefa(){
        
        
        
        String titulo = view.getTituloField().getText();
        String descricao = view.getDescricaoArea().getText();
        String responsavel =(String) view.getResponsavelBox().getSelectedItem();
        String prioridade =(String) view.getPrioridadeBox().getSelectedItem();
        String deadline = view.getDeadlineField().getText();
        
        tarefa tar = new tarefa(titulo, descricao, responsavel, prioridade, deadline);
            
        try {
                
            java.sql.Connection con = new conexao().getConnection();
            tarefaDAO tdao = new tarefaDAO(con);
            tdao.inserir(tar);
            
                
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastrarTarefa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void AbrirListagem() throws SQLException{
        
        
        TelaListagemTarefa tlistagem = new TelaListagemTarefa();
        tlistagem.setVisible(true);
        view.setVisible(false);
        
    }
    
}
