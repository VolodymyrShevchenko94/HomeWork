package Ex01x05;

public class Ex4 {
    public class UserArray {

        public int[] increaseArray(int[] array) {
            int[] updated = new int[array.length + 1];
            for (int i = 0; i < array.length; i++) {
                updated[i] = array[i];
            }
            return updated;
        }


        public int[] addValueToArray(int[] array, int value) {
            int[] updated = new int[array.length + 1];
            updated[0] = value;
            for (int i = 0; i < array.length; i++) {
                updated[i + 1] = array[i];
            }
            return updated;
        }
    }
}
