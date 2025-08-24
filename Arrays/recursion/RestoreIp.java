import java.util.ArrayList;

public class RestoreIp {

    static void helper(String ip , String temp , ArrayList<String> ans, int num){

        System.out.println(temp+" == "+ip);
        if(ip.length()==0 && num<4) {
            return ;
        }
       
        if(num==3){
            if(ip.length()==1 && ip.charAt(0)=='0'){
                
                ans.add(temp+ip);
                
            }
            else if( ip.charAt(0)=='0'){
                
            }
            else if(Integer.parseInt(ip)>0 && Integer.parseInt(ip)<=255)
             {
                ans.add(temp+ip);
                
             }
            else if( Integer.parseInt(ip)>255){
                
            }
            return;
        }

        if(ip.charAt(0)=='0'){
            helper(ip.substring(1), temp+'0'+".", ans, num+1);
        }
        else{
            for(int i=0;i< ip.length() ;i++){
                
                String currtemp = ip.substring(0, i+1);
                if(Integer.parseInt(currtemp)>0 && Integer.parseInt(currtemp)<=255){
                    helper(ip.substring(i+1), temp+currtemp+".", ans, num+1);
                }
                else{
                    return; 
                }
            }
        }
    }
    public static void main(String[] args) {
        String ip = "101023";
        ArrayList<String> ans = new ArrayList<>();
        helper(ip ,"", ans, 0);
        System.out.println(ans);
    }
}
