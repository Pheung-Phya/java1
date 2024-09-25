
package Introduction_java.collection_all;


public class Two_D_array {

    public static void main(String[] args) {
        String[][] product = {{"123\t","Phya\t","99.99"},
                              {"234\t","titi\t","80.08"},
                              {"45\t","title\t","44.44"}};
        for(int i=0;i<product.length;i++){
            for(int j=0;j<product.length;j++){
                System.out.print("Product["+i+"]["+j+"]  : " +product[i][j]);
            }
            System.out.println("");
        }
    }
    
}
