public class Average {

    public static void main(String[] args) {
        int[] marks = {12,15,9,20,14};
        int sum = 0;

        for(int i = 0; i < marks.length; i++){
            sum += marks[i];
            System.out.println(i + ":" + marks[i]);
        }
        double average = sum/marks.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);


    }
}
