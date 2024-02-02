interface MY{
    int show(int i, int j);
}

public class LamdaExperssion {
    public static void main(String []a){
        MY obj =( i, k)->
        {

            return i+k;
        };
     int result=obj.show(3,6);
     System.out.println(result);
    }

}
