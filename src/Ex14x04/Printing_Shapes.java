package Ex14x04;

public class Printing_Shapes {
    public static void main(String[] args) {
        int rectangle = 5;


        for (int i = 2; i < rectangle; i++){
            for (int j = -5; j < rectangle; j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
        System.out.println();





        for (int i = 0; i < rectangle; i++){
            for (int j = i; j < rectangle; j++){
                System.out.print("+");
            }
            System.out.println();
        }
        System.out.println();





        for (int i = 0; i <= rectangle; i++){


            for (int j = rectangle; j > i; j--){
                System.out.print(" ");
            }


            for (int j1 = 0; j1 <= i; j1++){
                System.out.print("+");
            }


            for (int j = 0; j < i; j++){
                System.out.print("+");
            }


            for (int j = rectangle; j > i; j--){
                System.out.print(" ");
            }

            System.out.println();

        }
        System.out.println();


        for (int i = 0; i < rectangle; i++){


            for (int j = rectangle; j > i; j--){
                System.out.print(" ");
            }


            for (int j1 = 0; j1 <= i; j1++){
                System.out.print("+");
            }


            for (int j = 0; j < i; j++){
                System.out.print("+");
            }


            for (int j = rectangle; j > i; j--){
                System.out.print(" ");
            }

            System.out.println();
        }
        for (int i = rectangle; i >= 0; i--){


            for (int j = rectangle; j > i; j--){
                System.out.print(" ");
            }


            for (int j1 = 0; j1 <= i; j1++){
                System.out.print("+");
            }


            for (int j = 0; j < i; j++){
                System.out.print("+");
            }


            for (int j = rectangle; j > i; j--){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}



