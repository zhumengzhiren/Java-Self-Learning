import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MagicSquareChecker {
    public static void main(String[] args) {
        checkMagicSquare("Mercury.txt");
        checkMagicSquare("Luna.txt");
    }

    public static void checkMagicSquare(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int rowCount = 0;
            int[] rowSums = null;
            int[] colSums = null;
            int diagonalSum1 = 0;
            int diagonalSum2 = 0;
            int constant = 0;

            while ((line = reader.readLine()) != null) {
                String[] values = line.split("\t");
                if (rowSums == null) {
                    rowSums = new int[values.length];
                    colSums = new int[values.length];
                    constant = calculateRowSum(values);
                }

                if (values.length != rowSums.length) {
                    System.out.println("Error: Number of columns is inconsistent.");
                    return;
                }

                if (calculateRowSum(values) != constant) {
                    System.out.println("Error: Row sum is inconsistent.");
                    return;
                }

                for (int i = 0; i < values.length; i++) {
                    int value = Integer.parseInt(values[i]);
                    rowSums[i] += value;
                    colSums[i] += value;

                    if (i == rowCount) {
                        diagonalSum1 += value;
                    }

                    if (i == values.length - 1 - rowCount) {
                        diagonalSum2 += value;
                    }
                }

                rowCount++;
            }

            for (int sum : rowSums) {
                if (sum != constant) {
                    System.out.println("Error: Column sum is inconsistent.");
                    return;
                }
            }

            for (int sum : colSums) {
                if (sum != constant) {
                    System.out.println("Error: Column sum is inconsistent.");
                    return;
                }
            }

            if (diagonalSum1 != constant || diagonalSum2 != constant) {
                System.out.println("Error: Diagonal sum is inconsistent.");
                return;
            }

            System.out.println(filename + " is a magic square.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static int calculateRowSum(String[] values) {
        int sum = 0;
        for (String value : values) {
            sum += Integer.parseInt(value);
        }
        return sum;
    }
}
