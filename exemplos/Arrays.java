public class Arrays{

    public static void main(String[] args){
        // int[] array = new int[10];
        int[] array = {10, 20, 30, 40, 50};

        System.out.printf("%s%8s%n", "Index", "Value");

        for(int counter=0; counter<array.length; counter++){
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }

}