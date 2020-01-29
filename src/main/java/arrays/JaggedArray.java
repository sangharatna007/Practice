package arrays;

public class JaggedArray {
    public static void main(String[] args) {
        int onedimenstionalArray1[] = {1,2,3};

        int onedimenstionalArray2[] = {4,5,6};

        int onedimenstionalArray3[] = {7,8,9};

        int jaggedArray[][] ={onedimenstionalArray1, onedimenstionalArray2, onedimenstionalArray3};

        // printing element of two dimesional ArrAY

        for(int i =0; i <= jaggedArray.length; i++)
        {
            for(int j =0 ; j < jaggedArray[i].length; j++){
                System.out.print(jaggedArray[i][j] + "\t");
        }
            System.out.println();
        }
    }
}
