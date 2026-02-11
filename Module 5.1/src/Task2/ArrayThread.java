package Task2;

public class ArrayThread extends Thread {
    private int[] array;
    private int startIndex;
    private int endIndex;
    private long partialSum;

    public ArrayThread(int[] array, int startIndex, int endIndex) {
        this.array = array;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.partialSum = 0;
    }

    //@Override
    public void run() {
        for (int i = startIndex; i < endIndex; i++) {
            partialSum += array[i];
        }
    }

    public long getPartialSum() {
        return partialSum;
    }
}
