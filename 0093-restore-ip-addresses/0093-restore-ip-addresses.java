class Solution {

    public List<String> restoreIpAddresses(String s) {

        List<String> ans = new ArrayList<>();

        restoreIp(s, 0, 0, "", ans);

        return ans;
    }

    public void restoreIp(String s,
                          int index,
                          int parts,
                          String current,
                          List<String> ans) {

    if(parts == 4 && index == s.length()){
        ans.add(current.substring(0 , current.length()-1)) ;
        return ;

    }

    if(parts == 4 || index == s.length()){
        return ;

    }

    for(int len = 1; len<= 3 ; len++){
        if(index + len > s.length()){
            break;
        }
    String part = s.substring(index, index+ len);


    if(part.length() > 1 && part.charAt(0) == '0'){
        continue ;

    }

    int number = Integer.parseInt(part);

    if(number > 255){
        continue ;

    }
    restoreIp(s, index+len , parts + 1 ,current + part+"." , ans );
    }
                          }
}



