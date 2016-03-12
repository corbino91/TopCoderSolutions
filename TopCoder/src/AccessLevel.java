/**
 * Scored 237
 */
public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < rights.length; i++) {
            if (rights[i] >= minPermission) {
                sb.append("A");
            } else {
                sb.append("D");
            }
        }

        return sb.toString();
    }
}
