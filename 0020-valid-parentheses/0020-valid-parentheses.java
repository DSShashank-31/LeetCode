class Solution {
    public boolean isValid(String s) {
        String result="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='('||c==')'||c=='{'||c=='}'||c=='['||c==']')
            {
                result+=c;
            }
        }
        while(result.contains("()")||result.contains("{}")||result.contains("[]"))
        {
            result=result.replace("()","");
            result=result.replace("{}","");
            result=result.replace("[]","");
        }
        return result.length()==0;
    }
}