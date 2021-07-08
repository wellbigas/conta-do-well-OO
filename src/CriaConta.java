public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(3000,1375,13,1532750, "Wellington Luís Moreno Bigas");

                primeiraConta.saca(300);

        System.out.println("------------------DADOS DO CONTA 1-------------------");

                System.out.println("Saldo da conta: " + primeiraConta.saldo);
                System.out.println("Agencia da conta: " + primeiraConta.agencia);
                System.out.println("Operação da Conta: " + primeiraConta.operacao);
                System.out.println("Número da Conta: " + primeiraConta.conta );
                System.out.println("Titular: " + primeiraConta.getTitular() + "\n");

        Cliente cliente1 = new Cliente("Wellington", "083.938.179-43", "Em processo de se tornar um Dev");

            System.out.println("------------------DADOS DO CLIENTE-------------------");
            System.out.println("Nome: " + primeiraConta.Cliente);
            System.out.println("Cpf: " + cliente1.getCpf() + "\n" + "Profissão: " + cliente1.getProfissao());


        System.out.println("");

        System.out.println("------------------DADOS DO CONTA 2-------------------");

        Conta segundaConta = new Conta(300, 1935,13,1786692,"Willliam Bigas Mauro");

                System.out.println("Saldo da conta: " + segundaConta.saldo);
                System.out.println("Agencia da conta: " + segundaConta.agencia);
                System.out.println("Operação da Conta: " + segundaConta.operacao);
                System.out.println("Número da Conta: " + segundaConta.conta);
                System.out.println("Titular: " + segundaConta.getTitular() + "\n");

        Cliente cliente2 = new Cliente("William Bigas Mauro","075.975.035-53","Dev Senior");

            System.out.println("------------------DADOS DO CLIENTE-------------------");
            System.out.println("Nome: " + segundaConta.Cliente);
            System.out.println("Cpf: " + cliente2.getCpf() + "\n" + "Profissão: " + cliente2.getProfissao());


    }
}
