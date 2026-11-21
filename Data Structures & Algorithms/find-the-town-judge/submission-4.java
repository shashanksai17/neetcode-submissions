class Solution {
    public int findJudge(int n, int[][] trust) {

        Set<String> a = new HashSet<>();

        for (int i[] : trust) {
            a.add(i[0] + " " + i[1]);
        }

        for (int i = 1; i <= n; i++) {

            boolean check = false;

            for (String j : a) {
                String[] x = j.split(" ");

                if (Integer.parseInt(x[0]) == i) {
                    check = true;
                    break;
                }
            }

            int count = 0;

            for (String j : a) {
                String[] x = j.split(" ");

                if (Integer.parseInt(x[1]) == i &&
                    Integer.parseInt(x[0]) != i) {
                    count++;
                }
            }

            if (count == n - 1 && !check) {
                return i;
            }
        }

        return -1;
    }
}