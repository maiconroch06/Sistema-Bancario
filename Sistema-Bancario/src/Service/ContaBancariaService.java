package service;

import classes.ContaBancaria;
import dados.Gravador;
import dados.Leitor;
import java.util.HashMap;

public class ContaBancariaService {
    
    HashMap<String, ContaBancaria> contas = new HashMap<>();

    private int sequenciaCorrente = 0;
    private int sequenciaPoupanca = 0;
    
    public ContaBancariaService() {
        Leitor leitor = new Leitor(contas);
        leitor.lerArquivo();
        atualizarSequencia();
    }
    
    public void cadastrar(ContaBancaria conta) {
        contas.put(conta.getNumero(), conta);
        salvar();
    }

    public boolean remover(String numero) {
        if (numero == null) {
            return false;
        }
        
        boolean removido = contas.remove(numero) != null;
        
        if (removido) {
            salvar();
        }
        
        return removido;
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
    
    public void atualizarSequencia() {
        for(String numero : contas.keySet()) {
            if (numero.startsWith("01")) {
                int num = Integer.parseInt(numero.substring(2));
                if (num > sequenciaCorrente) {
                    sequenciaCorrente = num;
                }
            } else if (numero.startsWith("02")) {
                int num = Integer.parseInt(numero.substring(2));
                if (num > sequenciaPoupanca) {
                    sequenciaPoupanca = num;
                }
            }
        }
    }
    
    public String gerarNumeroCorrente() {
        sequenciaCorrente++;
        return String.format("01%02d", sequenciaCorrente);
    }
    
    public String gerarNumeroPoupanca() {
        sequenciaPoupanca++;
        return String.format("02%02d", sequenciaPoupanca);
    }
    
    public void salvar() {
        Gravador gravar = new Gravador(contas);
        gravar.escritaEmArquivo();
    }

}
