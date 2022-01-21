import java.util.ArrayList;

public class ParityOutlier {
    public static void main(String[] args) {

        int[] integers = {2, 6, 8, 10, 3};

        System.out.println(FindOutlier.find(integers));

    }

    public class FindOutlier {
        static int find(int[] integers) {

            ArrayList<Integer> odd = new ArrayList();
            ArrayList<Integer> even = new ArrayList();

            for (int i = 0; i < integers.length; i++) {
                if (integers[i] % 2 == 0) {
                    even.add(integers[i]);
                } else {
                    odd.add(integers[i]);
                    ;
                }
            }

            if (even.size() < odd.size()) {
                return even.get(0);
            }
            return odd.get(0);
        }
    }
}

