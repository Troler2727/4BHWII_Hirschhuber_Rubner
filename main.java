public class main {

    public static void main(String[] args) {
        int number = 6;

        System.out.printf("Ergebnis der Rekursiven Methode ist: %d", sum_function_recursive(number));

        System.out.printf("\nErgebnis der Iterativer Methode ist: %d", sum_function_Iterative(number));




    }

    public static int sum_function_recursive(int number){

        if(number == 1){
            return number = 1;
        }
        else{
            return number = number + sum_function_recursive(number = number - 1);
        }
    }

    public static int sum_function_Iterative(int number){
        int num = 1;
        while(number > 1){
            num = num + number;
            number--;
        }
        return num;
    }


}
