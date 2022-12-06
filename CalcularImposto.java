/**
* 1.Solicitar ao usuário o rendimento tributável em número inteiro.
* 2.Leia a entrada como "int".
* 3.Calcule o imposto a pagar usando if aninhado em double.
* 4.Imprima os valores arredondados em 2 casas decimais.
*/

import java.util.Scanner; // Para entrada de teclado

public class CalcularImposto{
    public static void main(String[] args){
        //Declaração de constantes
        final double TAX_RATE_ABOVE_20K = 0.1;
        final double TAX_RATE_ABOVE_40K = 0.2;
        final double TAX_RATE_ABOVE_60K = 0.3;

        //Declaração de variáveis
        int taxableIncome;
        double taxPayable;

       //Solicita e lê as entradas como "int".
       Scanner in = new Scanner(System.in);
       System.out.print("Digite o rendimento tributável: $");
       taxableIncome = in.nextInt();
       in.close();

       if (taxableIncome <= 20000) {         
         taxPayable = 0;
      } else if (taxableIncome <= 40000) {  
         taxPayable = (taxableIncome - 20000) * TAX_RATE_ABOVE_20K;
      } else if (taxableIncome <= 60000) {  
         taxPayable = 20000 * TAX_RATE_ABOVE_20K
                      + (taxableIncome - 40000) * TAX_RATE_ABOVE_40K;
      } else {                              
         taxPayable = 20000 * TAX_RATE_ABOVE_20K
                      + 20000 * TAX_RATE_ABOVE_40K
                      + (taxableIncome - 60000) * TAX_RATE_ABOVE_60K;
      }
      System.out.printf("O imposto de renda a pagar é: $%.2f%n", taxPayable);
   }

}
