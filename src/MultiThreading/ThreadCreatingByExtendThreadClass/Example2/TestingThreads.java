package MultiThreading.ThreadCreatingByExtendThreadClass.Example2;

public class TestingThreads {
    static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        System.out.print("\nFirst task start\n");
        PrintTask pt1 = new PrintTask('#');
        pt1.start(); //Start the first thread

        System.out.print("\nSecond task start\n");
        PrintTask pt2 = new PrintTask('@');
        pt2.start(); //Start the first thread

        System.out.print("\nThird task start\n");
        PrintTask pt3 = new PrintTask('*');
        pt3.start(); //Start the first thread

        System.out.print("\nForth task start\n");
        PrintTask pt4 = new PrintTask('$');
        pt4.start(); //Start the first thread

        System.out.print("\nForth task start\n");
        PrintTask pt5 = new PrintTask('(');
        pt5.start(); //Start the first thread

        System.out.print("\nForth task start\n");
        PrintTask pt6 = new PrintTask('>');
        pt6.start(); //Start the first thread

        System.out.print("\nForth task start\n");
        PrintTask pt7 = new PrintTask(')');
        pt7.start(); //Start the first thread

        long endTime = System.currentTimeMillis();
        System.out.printf("\nTotal time taken: %d\n", endTime - startTime);
    }
}
