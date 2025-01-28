public class ArrayElementComparison {
    public static void main(String[] args) {
        
        int[] array1 = {5, 10, 15, 20};
        int[] array2 = {10, 10, 10, 15};

                if (array1.length != array2.length) {
            System.out.println("The arrays are not of the same size.");
            return;
        }

                for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) {
                System.out.println("Element at index " + i + ": Equal");
            } else if (array1[i] > array2[i]) {
                System.out.println("Element at index " + i + ": Greater");
            } else {
                System.out.println("Element at index " + i + ": Lesser");
            }
        }
    }
}
