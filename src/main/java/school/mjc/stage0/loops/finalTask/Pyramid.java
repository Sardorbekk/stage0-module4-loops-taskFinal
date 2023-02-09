package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for(int column=1;column<=cathetusLength;column++){
            for (int row=column;row<cathetusLength;row++){
                System.out.print(" ");
            }
            for (int row=column;row>0;row--){
                System.out.print(row);
            }

            for (int row=2;row<=column;row++){
                System.out.print(row);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
