package classes;

public class ContaPoupanca extends ContaBancaria {
    
    @Override
    public void debitar(double valor){
        if(valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
        }
    }
    
    @Override
    public void creditar(double valor){
        if(valor > 0) {
            setSaldo(getSaldo() + valor);
        }
    }
    
    @Override
    public double mostrarSaldo() {
        return getSaldo();
    }
    
    @Override
    public void debitarInfor(double valor){
        if(valor <= getInformacao()) {
            creditar(valor);
            setInformacao(getInformacao() - valor);
        }
    }
    
    @Override
    public void creditarInfor(double valor){
        if(valor > 0) {
            debitar(valor);
            setInformacao(getInformacao()+ valor);
        }
    }
    
}
