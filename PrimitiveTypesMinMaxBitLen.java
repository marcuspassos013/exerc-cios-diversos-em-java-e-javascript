/**
 * Imprime o mínimo, máximo e comprimento de bits de todos os tipos primitivos (exceto booleanos)
 */
public class PrimitiveTypesMinMaxBitLen {
   public static void main(String[] args) {
      /* int (inteiro com sinal de 32 bits) */
      System.out.println("int(min) = " + Integer.MIN_VALUE);
      // int(min) = -2147483648
      System.out.println("int(max) = " + Integer.MAX_VALUE);
      // int(max) = 2147483647
      System.out.println("int(comprimento do bit) = " + Integer.SIZE);
      // int(comprimento do bit) = 32

      /* byte (inteiro com sinal de 8 bits) */
      System.out.println("byte(min) = " + Byte.MIN_VALUE);
      // byte(min) = -128
      System.out.println("byte(max) = " + Byte.MAX_VALUE);
      // byte(max) = 127
      System.out.println("byte(comprimento do bit) = " + Byte.SIZE);
      // byte(comprimento do bit) = 8

      /* short (inteiro com sinal de 16 bits) */
      System.out.println("short(min) = " + Short.MIN_VALUE);
      // short(min) = -32768
      System.out.println("short(max) = " + Short.MAX_VALUE);
      // short(max) = 32767
      System.out.println("short(bit-length) = " + Short.SIZE);
      // short(comprimento do bit) = 16

      /* long (inteiro com sinal de 64 bits) */
      System.out.println("long(min) = " + Long.MIN_VALUE);
      // long(min) = -9223372036854775808
      System.out.println("long(max) = " + Long.MAX_VALUE);
      // long(max) = 9223372036854775807
      System.out.println("long(comprimento do bit) = " + Long.SIZE);
      // long(comprimento do bit) = 64

      /* char (caractere de 16 bits ou inteiro sem sinal de 16 bits) */
      System.out.println("char(min) = " + (int)Character.MIN_VALUE);
      // char(min) = 0
      System.out.println("char(max) = " + (int)Character.MAX_VALUE);
      // char(max) = 65535
      System.out.println("char(comprimento do bit) = " + Character.SIZE);
      // char(tamanho do bit) = 16

      /* float (ponto flutuante de 32 bits) */
      System.out.println("float(min) = " + Float.MIN_VALUE);
      // float(min) = 1.4E-45
      System.out.println("float(max) = " + Float.MAX_VALUE);
      // float(max) = 3.4028235E38
      System.out.println("float(comprimento do bit) = " + Float.SIZE);
      // float(tamanho do bit) = 32

      /* duplo (ponto flutuante de 64 bits) */
      System.out.println("double(min) = " + Double.MIN_VALUE);
      // duplo(min) = 4.9E-324
      System.out.println("double(max) = " + Double.MAX_VALUE);
      // double(max) = 1.7976931348623157E308
      System.out.println("double(bit-length) = " + Double.SIZE);
      // double(comprimento do bit) = 64

      /* Nenhuma constante equivalente para o tipo booleano */
   }
}
