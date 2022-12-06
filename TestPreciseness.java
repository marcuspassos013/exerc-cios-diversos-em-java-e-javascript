/**
 * Precisão de teste para int/float/double
 */ 
public class TestPreciseness {
   public static void main(String[] args) {
      // double é  preciso 
      System.out.println(2.2 + 4.4);       // 6.6000000000000005 
      System.out.println(6.6 - 2.2 - 4.4); // -8.881784197001252E-16 (NOT Zero!) 
      // Compara duas duplas 
      System.out.println((6.6) == (2.2 + 4.4));  // falso
 
      // int é preciso, float/double NÃO!
      int i1 = 123456789;
      System.out.println(i1*10); // 1234567890 (exato dentro do intervalo)

      float f1 = 123456789.0f;   // float mantém 6-7 dígitos significativos 
      System.out.println(f1);    // 1.23456792E8 (=1234567 92 próximo, mas não exato) 
      System.out.println(f1*10); // 1.23456794E9 (=1234567 940 )
   }
}
