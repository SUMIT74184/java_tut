

interface MY{
    void show(int i, int j);
}

public class LamdaExperssion {
    public static void main(String []a){
        MY obj =( i, k)->
        {
            System.out.println("in :"+ i+" "+ k);
        };
        obj.show(3,6);
    }

}
