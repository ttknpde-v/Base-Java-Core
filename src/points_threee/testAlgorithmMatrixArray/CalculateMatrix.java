package points_threee.testAlgorithmMatrixArray;

public class CalculateMatrix {
    protected Integer [][]matrix = {
            /* 3 x 2*/
            {10 , 11} ,
            {20 , 22} ,
            {30 , 33}
    };

    protected Integer result ;
    protected Float average ;

    public CalculateMatrix() {
        /* using construct setter default value */
        this.result = 0;
        this.average = 0.0F;
    }

    protected void plusRows(Integer [][]matrix) {

        /* System.out.println(matrix.length); /* return rows */
        System.out.println("matrix 3 x 2 = {");
        for (int row = 0 ; row <= matrix.length-1 ; row++) {
            System.out.print("{");

            for (int colum = 0 ; colum <= matrix[row].length-1 ; colum++) {
                /* matrix[row].length-1 => means return size of colum */
                System.out.print(matrix[row][colum]);

                if (colum != matrix[row].length-1) {
                    System.out.print(",");
                }

                this.result = this.result+matrix[row][colum];

            }
            this.average = (float) (this.result/matrix[row].length);
            System.out.print("} the result plus is "+this.result+" and average is "+average+"\n");
            this.result = 0;
            this.average = 0.0f;
        }
        System.out.println("}");
    }
    protected void display() {
        plusRows(this.matrix);
    }
    public static void main(String[] args) {
        new CalculateMatrix().display();
    }
}
