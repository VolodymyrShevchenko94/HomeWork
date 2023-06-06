package Ex01x05;

    public class ReversedArray_Ex3_2 {

        public static int[] myReverse(int [] array) {
            int length = array.length;
            int[] updated = new int[length];
            for (int i = 0; i < length; i++) {
                updated[i] = array[length - i - 1];
                System.out.print(updated[i] + " ");
            }
            return updated;
        }

        public static int[] subArray (int [] array, int index, int count) {
            int[] updated = new int[count];
            for (int i = 0; i < count; i++) {
                if ((index + i) >= array.length) {
                    updated[i] = 1;
                } else {
                    updated[i] = array[index + i];
                }
                System.out.print(updated[i] + " ");
            }
            return updated;
        }

        public static void main(String[] args) {
            int [] userArray = {1,2,3,4,5,6,7};
            myReverse(userArray);
            System.out.println();
            subArray(userArray,0,10);

        }

        }



