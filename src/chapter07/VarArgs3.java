package chapter07;

public class VarArgs3 {
    static void vaTest(int ... v){
        System.out.print("vaTest(int...):" + "Количество аргументов : " + v.length +
                " Содержимое: ") ;
        for( int x : v) System.out.print(x + " ");
        System.out.println();
    }
    static void vaTest(boolean ... v){
        System.out.print("aTest boolean ..." + "Количество аргументов : " + v.length +
                " Содержимое: ") ;
        for( boolean x : v) System.out.print(x + " ");
        System.out.println();
    }
    static void vaTest(String str, int ... v){
        System.out.print(str + "Количество аргументов : " + v.length +
                " Содержимое: ") ;
        for( int x : v) System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1,2,3);
        vaTest("Проверка ", 10, 20);
        vaTest(true, false,false);
    }
}
