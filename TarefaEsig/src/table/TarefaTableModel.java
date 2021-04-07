
package table;

import model.tarefa;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;


public class TarefaTableModel extends AbstractTableModel{

    public static final int NUMERO = 0;
    public static final int TITULO = 1;
    public static final int RESPONSAVEL = 2;
    public ArrayList<tarefa> lista;
    
    public TarefaTableModel (ArrayList<tarefa>t){
        lista = new ArrayList<tarefa>(t);
    }

    public TarefaTableModel() {
    
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        tarefa tarefa = lista.get(linhas);
        if (colunas == NUMERO) return tarefa.getNumero();
        if (colunas == TITULO) return tarefa.getTitulo();
        if (colunas == RESPONSAVEL) return tarefa.getResponsavel();
        return "";
    }
    
    @Override
    public String getColumnName(int colunas){
        if (colunas == NUMERO) return "Número";
        if (colunas == TITULO) return "Título";
        if (colunas == RESPONSAVEL) return "Responsável";
        return "";
    }
    
    
    
}
