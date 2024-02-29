public class AdjMatrix {
    private  int v;
    private int [][] matrix;

    public AdjMatrix(int v){
        this.v=v;
        matrix=new int[v][v];
    }

    public void addvertex(int edge1, int edge2){
        matrix[edge1][edge2]=1;
        matrix[edge2][edge1]=1;
    }

    public void display(){
        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[row].length;col++){
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    AdjMatrix graph=new AdjMatrix(4);
    graph.addvertex(0,1);
    graph.addvertex(1,2);
    graph.addvertex(2,0);
    graph.addvertex(1,3);
    graph.display();

    }
}
