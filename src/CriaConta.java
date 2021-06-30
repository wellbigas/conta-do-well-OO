public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 0;
        primeiraConta.deposita(1400);
        primeiraConta.agencia = 1375;
        primeiraConta.operacao = 13;
        primeiraConta.conta = 1532750;

        System.out.println("Saldo da conta: " + primeiraConta.saldo);
        System.out.println("Agencia da conta: " + primeiraConta.agencia);
        System.out.println("Operação da Conta: " + primeiraConta.operacao);
        System.out.println("Número da Conta: " + primeiraConta.conta);

        Cliente cliente1 = new Cliente();
        cliente1.nome = "Wellington Luís Moreno Bigas";
        cliente1.cpf = "083.938.179-43";
        cliente1.profissao = "Em processo de se tornar um Dev";

        primeiraConta.titular = cliente1.nome;
        System.out.println(primeiraConta.titular);

        System.out.println("");

        Conta segundaConta = new Conta();
        segundaConta.saldo = 300;
        segundaConta.deposita(3500);
        segundaConta.agencia = 1935;
        segundaConta.operacao = 13;
        segundaConta.conta = 178669;

        System.out.println("Saldo da conta: " + segundaConta.saldo);
        System.out.println("Agencia da conta: " + segundaConta.agencia);
        System.out.println("Operação da Conta: " + segundaConta.operacao);
        System.out.println("Número da Conta: " + segundaConta.conta);

        Cliente cliente2 = new Cliente();
        cliente2.nome = "William Bigas Mauro";
        cliente2.cpf = "075.975.035-53";
        cliente2.profissao = "Dev Senior";

        segundaConta.titular = cliente2.nome;
        System.out.println(segundaConta.titular);
    }


}
