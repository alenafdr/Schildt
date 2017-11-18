package chapter05;

public class IfElse {
    public static void main(String args[]){
        int mount = 4;
        String season;
        if(mount == 12 || mount == 1 || mount == 2)
            season = "зиме";
        else if(mount == 3 || mount == 4 || mount == 5)
            season = "весне";
        else if(mount == 6 || mount == 7 || mount == 8)
            season = "лету";
        else if(mount == 9 || mount == 10 || mount == 11)
            season = "осени";
        else
            season = "вымышленным месяцам";

        System.out.println("апрель относится к " + season + ".");

    }
}
