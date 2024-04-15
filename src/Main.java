import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        DadosCliente cliente =  new DadosCliente();

        //Criação de variaveis
         cliente.setNome("Eliziano Borges");
         cliente.setTipoConta("Corrente");
         cliente.setSaldo(2795.80);

         String nome = cliente.getNome();
         String tipoConta = cliente.getTipoConta();
         double saldo = cliente.getSaldo();
         int opcao = 0;

        //Apresentação inicial dos dados
        System.out.printf("""
        ###########################################
        \nNome do cliente: %s
        Tipo de conta: %s
        Saldo em conta: %.2f
        \n###########################################
        """,nome,tipoConta,saldo);

        //Criando menu de opções
       String menu = """
        **** Menu de Operacoes ****
        1 - Consultar saldo
        2 - Transferir valor
        3 - Receber valor
        4 - Sair
        """ ;
        //instanciando scanner
        Scanner leitor = new Scanner(System.in);

        //loop menu
        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitor.nextInt();

            OperacoesBancarias opcaoOperacao = new OperacoesBancarias(cliente);
            //Opcoes Operacoes bancarias
            if (opcao == 1) {
                opcaoOperacao.MostrarSaldo();
            } else if (opcao == 2) {
                opcaoOperacao.TransferirValor();
            } else if (opcao == 3) {
                System.out.println("Digite o valor à receber: ");
                double valor = leitor.nextDouble();
                opcaoOperacao.receberValor(valor);
            } else if (opcao == 4){
                System.exit(0);
            }else {
                System.out.println("Opcao invalida!");
            }
        }
    }
}