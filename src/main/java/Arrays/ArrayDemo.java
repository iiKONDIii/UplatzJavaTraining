package Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        String[] car = new String[5];

        car[0]="Mercedez";
        car[1]="BMW";
        car[2]="Honda";
        car[3]="Renault";
        car[4]="Daewoo";
        String[] regPlate = {"PL66 URD","WM10 POI","WP06 YWC","KJ77 MNB","MN88 LKJ"};


        for (int x = 0;x<5;x++){

            System.out.println(car[x]);
        }
        for (String s1:regPlate){
            System.out.println(s1);
        }




    }
}
