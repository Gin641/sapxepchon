public class SelectionSort {
    static double[] lish = {1, 9, 4.5, 6.6, 5.7, -4.5};
    public static void selectionSort(double[] lish){
        for (int i = 0; i < lish.length -1; i++){
            double currentMin = lish[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < lish.length;j++){
                if (currentMin > lish[j]){
                    currentMin = lish[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i){
                lish[currentMinIndex] = lish[i];
                lish[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(lish);
        for (int i = 0; i < lish.length;i++){
            System.out.print(lish[i] + " ");
        }
    }
}
