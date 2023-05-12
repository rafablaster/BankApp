import bank.Cliente;
import bank.Conta;

public class TestBank {
    public static void main(String[] args) {

        System.out.println("Criando o cliente Fortuna Delis ...");

        Cliente cliente = new Cliente("Fortuna", "Delis");

        System.out.println("Criando uma conta com saldo de R$ 1.000.000,00 para o cliente Fortuna Delis  ...");

        Conta conta = new Conta(1000000);
        cliente.setConta(conta);

        System.out.println("Sacando R$ 20.000,00 para um celta rebaixado: " + conta.sacar(200000));

        System.out.println("Depositando R$ 5.000,00 da biqueira: " + conta.depositar(5000));

        System.out.println("Sacando R$ 12.000,00 para pagar agiota: " + conta.sacar(12000) );

        System.out.println("Sacando R$ 1.000.000,00 para pagar outro agiota: " + conta.sacar(1000000) );

        System.out.println("O saldo da conta é R$ " + conta.getSaldo() + "   =  Pobre!");
    }
}
