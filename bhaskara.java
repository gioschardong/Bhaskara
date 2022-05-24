import java.util.Scanner;

public class bhaskara {
    public static void main(String[] args){

        //Variaveis
        double A;
        double B;
        double C;
        double Delta;
        double x1;
        double x2;

        //Recolher os Valores das variaveis
        Scanner in = new Scanner(System.in);

        System.out.println("Calculador de equações de segundo Grau:");
        
        System.out.print("Insira o valor de A: ");
        A = in.nextDouble();

        System.out.print("Insira o valor de B: ");
        B = in.nextDouble();

        System.out.print("Insira o valor de C: ");
        C = in.nextDouble();

        Delta = ((B*B)-4*A*C);

        if (Delta>=0){
            x1 = (- B + Math.sqrt(Delta)) / (2*A);
            x2 = (- B - Math.sqrt(Delta)) / (2*A);
            if (x1 == x2){
                System.out.print("A raiz da equação é: " +x1); 
            }
            else{
                System.out.print("As raizes da equação são: " +x1 + " e " +x2);
            }
        }
        if (Delta<0){
            System.out.print("Essa equação não possue raizes reais");
        }
    }
}