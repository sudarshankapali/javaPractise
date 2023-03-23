public class Q5 {
    public void answer5(){
        char[] question = {'M','O','B','I','L','E',' ','P','H','O','N','E',' ','I','S',' ','D','E','A','D'};
        String newAnswer = " ";
        for(char temp:question){
            if(temp!= 'A' && temp!= 'E' && temp!= 'I' && temp!= 'O' && temp!= 'U'){
                newAnswer = newAnswer+temp;
            }
        }
        System.out.println(newAnswer);
    }
}
