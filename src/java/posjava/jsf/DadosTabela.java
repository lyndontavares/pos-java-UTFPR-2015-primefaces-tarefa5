package posjava.jsf;

import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import org.primefaces.event.SelectEvent;

@ManagedBean
public class DadosTabela {
    Pessoa pessoa = new Pessoa();
    ArrayList <Pessoa> lista = new ArrayList();
    
    public DadosTabela(){
        pessoa = new Pessoa("Joao","8945-9876", 40, 3000.00);
        lista.add(pessoa);
        pessoa = new Pessoa("Tiago","1717-7172", 18, 765.40);
        lista.add(pessoa);
        pessoa = new Pessoa("Allan","1234-1234", 24, 1500.00);
        lista.add(pessoa);
        pessoa = new Pessoa("Gabriela","9999-8888", 26, 2500.00);
        lista.add(pessoa);
        pessoa = new Pessoa("Amanda","2131-2224", 24, 1500.00);
        lista.add(pessoa);
        pessoa = new Pessoa("Jorge","5678-8767", 50, 5500.00);
        lista.add(pessoa);
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public ArrayList getLista() {
        return lista;
    }

    public void setLista(ArrayList lista) {
        this.lista = lista;
    }
    
}