public class Main {
    public static void main(String[] args) {

        int[] weights=new int[]{90,91,23,45,56,12,12,23,34,45,56,0};
        weights[0]=90;
        int januaryWeights=weights[0];
        System.out.println(januaryWeights);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);

        }
    }
}