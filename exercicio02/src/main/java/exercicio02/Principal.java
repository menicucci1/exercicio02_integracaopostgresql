package exercicio02;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        DAO dao = new DAO();

        dao.conectar();

        Scanner menu = new Scanner(System.in);

        while (true) {

            System.out.print("##--Estrutura de Menu--##\n\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("| Opção 1 - Listar     |\n");
            System.out.print("| Opção 2 - Inserir          |\n");
            System.out.print("| Opção 3 - Excluir          |\n");
            System.out.print("| Opção 4 - Atualizar          |\n");
            System.out.print("| Opção 5 - Sair              |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Digite uma opção: ");

            int opcao = menu.nextInt();

            if (opcao == 5) {
                System.out.print("\nAté logo!");
                menu.close();
            }

            switch (opcao) {
                case 1:
                    System.out.print("\nOpção Listar Selecionado\n");
                    carros = dao.getCarros();
                    System.out.println("==== Mostrar carros === ");
                    for (int i = 0; i < carros.length; i++) {
                        System.out.println(carros[i].toString());
                    }
                    break;

                case 2:
                    System.out.print("\nOpção Inserir Selecionado\n");
                    Carro carro = new Carro("Uno", "Fiat", 3, "vermelho");
                    if (dao.inserirCarro(carro) == true) {
                        System.out.println("Inserção com sucesso -> " + carro.toString());
                    }
                    break;

                case 3:
                    System.out.print("\nOpção Excluir Selecionado\n");
                    dao.excluirCarro(carro.getId());
                    break;

                case 4:
                    System.out.print("\nOpção Atualizar Selecionado\n");
                    carro.setNome("novo nome");
                    dao.atualizarCarro(carro);
                    break;
                default:
                    System.out.print("\nOpção Invalida!");
                    break;
            }
        }
        dao.close();
    }

}
