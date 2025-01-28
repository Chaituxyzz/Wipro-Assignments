import java.util.HashMap;

public class FrequencyOfElements {
	
	
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 4, 3, 5, 2};

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (frequencyMap.containsKey(arr[i])) {
                frequencyMap.put(arr[i], frequencyMap.get(arr[i]) + 1);
            } else {
                frequencyMap.put(arr[i], 1);
            }
        }

        for (int key : frequencyMap.keySet()) {
            System.out.println("Element: " + key + ", Frequency: " + frequencyMap.get(key));
        }
    }
}
