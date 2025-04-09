import java.util.Random;

public class Stop_watch {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100000);
        }
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Hoán đổi
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        stopwatch.stop();
        System.out.println("Thời gian thực thi selection sort: " + stopwatch.getElapsedTime() + " milliseconds");
    }
    public static class StopWatch {
        private long start_time;
        private long end_time;
        public StopWatch() {
            start_time = System.currentTimeMillis();
        }
        public void start() {
            start_time = System.currentTimeMillis();
        }
        public void stop() {
            end_time = System.currentTimeMillis();
        }

        public long getStart_time() {
            return start_time;

        }
        public long getEnd_time() {
            return end_time;
        }
        public long getElapsedTime() {
            return end_time - start_time;
        }
    }
}
