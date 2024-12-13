import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int salarioInicial;
        double salarioFinal = 0;
        double aumento;
        double inflacao;

        Scanner scanner = new Scanner(System.in);
        System.out.println("escreva seu salario");
        salarioInicial = scanner.nextInt();

        if(salarioInicial > 280 ){
            aumento = salarioInicial * 0.2;
            salarioFinal = salarioInicial + aumento;
        }else{
            if((salarioInicial >= 280 )&&( salarioInicial < 700)){
                aumento = salarioInicial * 0.15;
                salarioFinal = salarioInicial + aumento;

            }else{
                if((salarioInicial >= 700 )&&( salarioInicial < 1500)){
                    aumento = salarioInicial * 0.1;
                    salarioFinal = salarioInicial + aumento;

                }else{
                    if(salarioInicial >= 1500 ){
                        aumento = salarioInicial * 0.05;
                        salarioFinal = salarioInicial + aumento;

                    }
                }
            }
        }
        inflacao = salarioFinal * 0.038;
        double salarioDesconto = salarioFinal - inflacao;
        System.out.println("Salario inicial :" + salarioInicial);
        System.out.println("Salario con el aumento :" + salarioFinal);
        System.out.println("Salario final condes cuento del 3,8% :" + salarioDesconto );
    }
}