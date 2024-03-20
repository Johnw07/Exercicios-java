import java.util.Scanner;

public class logica {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int nota1, nota2, nota3;

        System.out.println("informe a primeira nota");
        nota1 = in.nextInt();

        System.out.println("informe a segunda nota");
        nota2 = in.nextInt();

        System.out.println("informe a terceira nota");
        nota3 = in.nextInt();

        int media = (nota1 + nota2 + nota3)/3;
        if(media < 7 ){
            System.out.println("O aluno foi reprovado !");
        }
        else if (media >= 7) {
            System.out.println("O aluno foi aprovado !");
            
        }
    }
}
