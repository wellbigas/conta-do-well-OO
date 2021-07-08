public class Conta {
    double saldo;
    int agencia;
    int operacao;
    int conta;
    String titular;

    public Conta(double saldo, int agencia, int operacao, int conta, String titular) {
        this.saldo = saldo;
        this.agencia = agencia;
        this.operacao = operacao;
        this.conta = conta;
        this.titular = titular;
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
}
