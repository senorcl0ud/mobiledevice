package throwaways;



public class Main {
    public String even(Integer num){
        String response = "*** Output ***";
        for( int i = 0; i < num; i++ ){
            return response + "\n" + i ;
        }

        //do not type below here!!!
        return response;
    }


    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.even(20));
    }

}




