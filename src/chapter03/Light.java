package chapter03;

public class Light {
    public static void main(String args[]){
        int ligytspeed;
        long days;
        long seconds;
        long distance;

        ligytspeed = 186_000;

        days = 1000;

        seconds = days * 24 * 60 * 60;

        distance = ligytspeed * seconds;

        System.out.print("За " + days);
        System.out.print("дней свет пройдет около ");
        System.out.println(distance + " миль.");
    }
}
