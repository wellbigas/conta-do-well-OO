public class Conta {
    double saldo;
    int agencia;
    int operacao;
    int conta;
    String Cliente;

    public Conta(double saldo, int agencia, int operacao, int conta, String titular) {
        this.saldo = saldo;
        this.agencia = agencia;
        this.operacao = operacao;
        this.conta = conta;
        this.Cliente = titular;
    }

    void deposita(double valor){
        this.saldo += valor;

    }
    public boolean saca (double valor){
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }  else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getOperacao() {
        return operacao;
    }

    public void setOperacao(int operacao) {
        this.operacao = operacao;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getTitular() {
        return Cliente;
    }

    public void setTitular(String titular) {
        this.Cliente = titular;
    }
}
