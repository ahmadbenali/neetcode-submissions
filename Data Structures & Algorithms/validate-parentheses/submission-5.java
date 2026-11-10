class Solution {
    public boolean isValid(String s) {
        Stack<Character> open=new Stack<>();
        int len=s.length();

      
        for(int i=0;i<len;i++){
            char c=s.charAt(i);
            if(c=='(' || c=='{' || c=='[') open.push(c);
            else{
                if(open.isEmpty()) return false;

                char x=open.pop();
	            if(c ==')' && x !='(') return false;
	            if(c ==']' && x !='[') return false;
	            if(c =='}' && x !='{') return false;
            }
            // else break and i should be not inside the scope of for
        }

        

        return open.isEmpty();
    }
}
