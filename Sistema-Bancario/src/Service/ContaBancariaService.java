package Service;

import classes.ContaBancaria;
import java.util.HashMap;

public class ContaBancariaService {
    
    HashMap<String, ContaBancaria> contas = new HashMap<>();
    
    private int sequenciaCorrente = 0;
    private int sequenciaPoupanca = 0;
    
    public void cadastrar(ContaBancaria conta) {
        contas.put(conta.getNumero(), conta);
    }

    public boolean remover(String numero) {
        if (numero == null) {
            return false;
        }
        return contas.remove(numero) != null;
    }
    
    public ContaBancaria buscar(String numero) {
        if (numero == null) {
            return null;
        }
        return contas.get(numero);
    }
    
    public HashMap<String, ContaBancaria> listar(){
        return contas;
    }
    
    public String gerarNumeroCorrente() {
        sequenciaCorrente++;
        return String.format("01%02d", sequenciaCorrente);
    }
    
    public String gerarNumeroPoupanca() {
        sequenciaPoupanca++;
        return String.format("02%02d", sequenciaPoupanca);
    }

}
