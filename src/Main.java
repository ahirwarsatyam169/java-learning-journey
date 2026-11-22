import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        System.out.println("Hellow world");
        int number = 1;
        System.out.println(number);

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[4]);

        int[] five = new int[5];

        five[1]=15;
        five[3]=30;
        five[0]=5;
        System.out.println(five[4]);
        System.out.println(Arrays.toString(five));

        String[] names = new String[5];

        names[1] = "satyam2";
        names[2] = "satyam3";
        names[3] = "satyam4";
        names[4] = "satyam5";

        String listnames = Arrays.toString(names);
        System.out.println(listnames);
        System.out.println(Arrays.toString(names));

        //class
        Bike panigale_v4r = new Bike();
        panigale_v4r.brand = "ducati";
        panigale_v4r.speed = 373;
        panigale_v4r.color = "Red";

        panigale_v4r.about();


    }
    public static class Bike{

        int speed;
        String color;
        String brand;
        public void about(){
            System.out.println("top speed of bike is: "+ speed);
            System.out.println("color of the bike is: "+color);
            System.out.println("the brand of the bike is: "+brand);
        }
    }
}
