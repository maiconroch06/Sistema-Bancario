package classes;

public abstract class ContaBancaria {
    private String numero;
    private String nome;
    private double saldo = 0;
    private String tipoConta;
    private double acrescimoInformacao = 0;

    public ContaBancaria(String numero, String nome, double saldo, String tipoConta, double acrescimoInformacao) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        this.acrescimoInformacao = acrescimoInformacao;
    }

    public ContaBancaria() {}
    
    public abstract void creditar(double valor);
    
    public abstract void debitar(double valor);
    
    public abstract double mostrarSaldo();
    
    public abstract void debitarInfor(double valor);
    
    public abstract void creditarInfor(double valor);

    // Metodos Acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getInformacao() {
        return acrescimoInformacao;
    }

    public void setInformacao(double acrescimoInformacao) {
        this.acrescimoInformacao = acrescimoInformacao;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
    
}
