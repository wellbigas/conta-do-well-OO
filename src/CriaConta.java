public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(300,1375,13,1532750, "wellington Luís Moreno Bigas");

                primeiraConta.saca(300);

                System.out.println("Saldo da conta: " + primeiraConta.saldo);
                System.out.println("Agencia da conta: " + primeiraConta.agencia);
                System.out.println("Operação da Conta: " + primeiraConta.operacao);
                System.out.println("Número da Conta: " + primeiraConta.conta);

       //associa o cliente1 do wellington a primeiraConta
        Cliente cliente1 = new Cliente("Wellington Luís Moreno Bigas", "083.938.179-43", "Em processo de se tornar um Dev");

                primeiraConta.titular = cliente1.nome;
                System.out.println(primeiraConta.titular);

        System.out.println("");

        Conta segundaConta = new Conta(300, 1935,13,1786692,"Willliam Bigas Mauro");

                System.out.println("Saldo da conta: " + segundaConta.saldo);
                System.out.println("Agencia da conta: " + segundaConta.agencia);
                System.out.println("Operação da Conta: " + segundaConta.operacao);
                System.out.println("Número da Conta: " + segundaConta.conta);

        Cliente cliente2 = new Cliente("William Bigas Mauro","075.975.035-53","Dev Senior");

                segundaConta.titular = cliente2.nome;
                System.out.println(segundaConta.titular);
    }


}
