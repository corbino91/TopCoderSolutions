/**
 * Scored 137
 */
public class ANDEquation {

    public int restoreY(int[] A) {
        int answer = -1;
        int value;

        for (int cursor1 = 0; cursor1 < A.length; cursor1++) {
            int cursor2 = cursor1 + 1;

            if (cursor2 == A.length) {
                cursor2 = 0;
            }

            for (; cursor2 < A.length; cursor2++) {
                value = A[cursor1] & A[cursor2];

                for (int i = 0; i < A.length; i++) {
                    if (i == cursor1 || i == cursor2) {
                        continue;
                    }
                    if (value == A[i]) {
                        return A[i];
                    }
                }
            }
        }

        return answer;
    }
}
