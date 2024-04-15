import java.util.Scanner;

public class OperacoesBancarias {

    private DadosCliente cliente;

    public OperacoesBancarias(DadosCliente cliente) {
        this.cliente = cliente;
    }
    Scanner leitor = new Scanner(System.in);
    public void MostrarSaldo(){

        System.out.printf("O saldo atualizado em conta: %.2f%n", cliente.getSaldo());
    }

    public void TransferirValor(){

        System.out.println("Digite o valor que você deseja transferir: ");
        double valor = leitor.nextDouble();

        if (valor > cliente.getSaldo()) {
            System.out.println("Erro! O valor solicitado é maior que o saldo bancario.");

        }else if (valor <= cliente.getSaldo()) {
            double saldo = cliente.getSaldo();
            cliente.setSaldo(saldo -= valor);
            System.out.println("Transferencia efetuada com sucesso!");

        }
    }
    public void receberValor(double valor){

        double saldo = cliente.getSaldo();
        cliente.setSaldo(saldo + valor);

    }

}
