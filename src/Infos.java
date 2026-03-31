import Entidade.Produto;
import java.util.Locale;
import java.util.Scanner;

public class Infos {
    public static void main(String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();


        System.out.println("Digite as informações do produto: ");

        System.out.println("Nome: ");
        produto.setNome(sc.nextLine());

        System.out.println("Preço: ");
        produto.setPreco(sc.nextDouble());

        System.out.println("Quantidade em estoque: ");
        produto.setQuantidade(sc.nextInt());

        System.out.printf("Informações do Produto: %s, R$ %.2f, %d unidades, Total: R$ %.2f%n ", produto.getNome(), produto.getPreco(), produto.getQuantidade(), produto.valorTotal());

        while (true) {
            System.out.println("Deseja atualizar a quantidade no estoque? (S/N):");
            char voto = Character.toLowerCase(sc.next().charAt(0));
            if (voto == 's') {
                System.out.println("Deseja ADICIONAR ou REMOVER ?:");
                sc.nextLine();
                String decisao = sc.nextLine();
                if (decisao.equalsIgnoreCase("adicionar")) {
                    System.out.println("Digite a quantidade de produtos para adicionar ao estoque: ");
                    produto.adicaoProduto(sc.nextInt());
                    System.out.printf("Atualização do produto: %s, R$ %.2f, %d unidades, Total: %.2f%n", produto.getNome(), produto.getPreco(), produto.getQuantidade(), produto.valorTotal());
                }else if(decisao.equalsIgnoreCase("remover")) {
                        System.out.println("Digite a quantidade de produtos para remover do estoque: ");
                        produto.remocaoProduto(sc.nextInt());
                    System.out.printf("Atualização do produto: %s, R$ %.2f, %d unidades, Total: %.2f%n", produto.getNome(), produto.getPreco(), produto.getQuantidade(), produto.valorTotal());
                }
            }else if (voto == 'n') {
                break;
            }
        }





       sc.close();
    }
}
