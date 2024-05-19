class Marathon {
    public static void main(String[] arguments) {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };
        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };

        // Print all participants' names and times
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
        }

        // Find and print the best runner
        int bestRunnerIndex = findLowestTimeIndex(times);
        System.out.println("\nBest Runner: " + names[bestRunnerIndex] + " with a time of " + times[bestRunnerIndex]);

        // Find and print the second best runner
        int secondBestRunnerIndex = findSecondLowestTimeIndex(times, bestRunnerIndex);
        System.out.println("Second Best Runner: " + names[secondBestRunnerIndex] + " with a time of " + times[secondBestRunnerIndex]);
    }

    // Method to find the index of the lowest time
    public static int findLowestTimeIndex(int[] times) {
        int minIndex = 0;
        for (int i = 1; i < times.length; i++) {
            if (times[i] < times[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Method to find the index of the second lowest time
    public static int findSecondLowestTimeIndex(int[] times, int lowestTimeIndex) {
        int secondMinIndex = -1;
        for (int i = 0; i < times.length; i++) {
            if (i == lowestTimeIndex) {
                continue; // Skip the best runner
            }
            if (secondMinIndex == -1 || times[i] < times[secondMinIndex]) {
                secondMinIndex = i;
            }
        }
        return secondMinIndex;
    }
}
