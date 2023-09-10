package Ex04;

import java.util.Scanner;

public class Exercicio {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Ferramenta curso = new Ferramenta();

        System.out.println("Digite o serial do produto: ");
        int serial = sc.nextInt();
        curso.setCodigoDoltem(serial);
        sc.nextLine();

        System.out.println("Digite o nome: ");
        String nomeFerramenta = sc.nextLine();
        curso.setNomeDoltem(nomeFerramenta);

        System.out.println("Digite o valor: ");
        double valor = sc.nextDouble();
        curso.setValorDoltem(valor);
        sc.nextLine();

        System.out.println("Digite a categoria do item: ");
        String categoria = sc.nextLine();
        curso.setCategoria(categoria);

        System.out.println("Descrição do produto: ");
        String descricao = sc.nextLine();
        curso.setDescricaoDoltem(descricao);

        curso.mostrarInfo();

        System.out.println("    ");
        System.out.println("Deseja cadastrar o produto?");
        String cadastrar = sc.nextLine();
        System.out.println("     ");

        if( cadastrar.equalsIgnoreCase("sim")){
            curso.cadastrar();
        } else {
            System.out.println("OK! produto exlcuido com sucesso, até mais!");
        }






        

        
        




    }
}
