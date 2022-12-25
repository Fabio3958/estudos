package DigitalInnovationOne.SpringExperience;

public class QuadradoPerfeito {

    public static int countPerfectSquare(int number){

        int count = 0;

        for (int i = 2; i <= number; i++){

            if (Math.sqrt(i) - Math.floor(Math.sqrt(i)) == 0)
                count++;

        }

        return count;
    }


    public static void main(String[] args) {
        System.out.println(countPerfectSquare(12));
    }

}
