package Service;

import classes.ContaBancaria;

public class OperacoesBancarias extends ContaBancariaService {
    
    public boolean creditar(ContaBancaria conta, double valor) {
        if(valor <= 0) {
            return false;
        }
        conta.creditar(valor);
        return true;
    }

    public boolean debitar(ContaBancaria conta, double valor) {
        if(verificarSaldo(conta, valor)) {
            return false;
        }
        conta.debitar(valor);
        return true;
    }
    
    public boolean verificarSaldo(ContaBancaria conta, double valor) {
        return valor <= 0 || conta.mostrarSaldo() < valor ||
                conta.getSaldo() < -100 || conta.getSaldo() - valor < -100;
    }
    
    public boolean creditarEmPoupanca(ContaBancaria conta, double valor) {
        if(valor <= 0) {
            return false;
        }
        conta.creditarInfor(valor);
        return true;
    }

    public boolean debitarDaPoupanca(ContaBancaria conta, double valor) {
        if(verificarSaldoPoupanca(conta, valor)){
            return false;
        }
        conta.debitarInfor(valor);
        return true;
    }
    
    public boolean verificarSaldoPoupanca(ContaBancaria conta, double valor) {
        return valor <= 0 || conta.getInformacao() < valor;
    }

    public boolean transferenciaBancaria(ContaBancaria origem, ContaBancaria destino, double valor) {
        if(valor <= 0 || origem.mostrarSaldo() < valor){
            return false;
        }

        origem.debitar(valor);
        destino.creditar(valor);
        return true;
    }
}
