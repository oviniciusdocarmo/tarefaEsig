
package controler;

import dao.conexao;
import dao.tarefaDAO;
import java.sql.SQLException;
import model.tarefa;
import view.TelaListagemTarefa;
import table.TarefaTableModel;
import view.TelaCadastrarTarefa;

public class ListagemTarefaControler {
    private TelaListagemTarefa view;

    public ListagemTarefaControler(TelaListagemTarefa view) {
        this.view = view;
    }


    public void atualizarTarefa() throws SQLException {
        
        tarefa tar = new tarefa();
        java.sql.Connection con = new conexao().getConnection();
        tarefaDAO tdao = new tarefaDAO(con);
        
        
        tar.setNumero(Integer.parseInt(view.getTxtNumero().getText()));
        if(view.getTxtNumero().getText().equals("")){
            tar.setNumero(0);
        }
        tar.setTitulo(view.getTxtTitulo().getText());
        tar.setDescricao(view.getTxtDescricao().getText());
        tar.setResponsavel((String) view.getTxtResponsavel().getSelectedItem());
        tar.setPrioridade((String) view.getTxtPrioridade().getSelectedItem());
        tar.setDeadline(view.getTxtDeadline().getText());
        
        
        tdao.alterar(tar);
        TelaListagemTarefa tlistagem = new TelaListagemTarefa();
        tlistagem.setVisible(true);
        
    }

    public void excluirTarefa(int numero) throws SQLException {
        java.sql.Connection con = new conexao().getConnection();
        tarefaDAO tdao = new tarefaDAO(con);
        
        tdao.excluir(numero);
    }

    public void concluirTarefa(int numero) throws SQLException {

        java.sql.Connection con = new conexao().getConnection();
        tarefaDAO tdao = new tarefaDAO(con);
        
        tdao.concluirTarefa(numero);
    }

    public void cadastrarTarefaVisivel() {
        TelaCadastrarTarefa t = new TelaCadastrarTarefa();
        t.setVisible(true);
        view.setVisible(false);
    }

    
    
}
