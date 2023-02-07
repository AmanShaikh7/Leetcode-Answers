class Solution {
    public boolean isValid(String str) {
         Stack<Character> st = new Stack<>();
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(ch=='(' || ch=='{' || ch=='['){
				st.push(ch);
				continue;
			}
			if (st.isEmpty())
                return false;
			if(ch==')') 
				// if(st.peek() == '{' || st.peek()='['){
				// 	return false;
				// }else{
				// 	st.pop();
				// }
				{if(st.peek()=='('){
					st.pop();
					continue;
				}else{
					return false;
				}}
			
		
		if(ch=='}')
				{if(st.peek()=='{'){
					st.pop();
					continue;
				}else{
					return false;
				}}
				
			
			if(ch==']')
				{if(st.peek()=='['){
					st.pop();
					continue;
				}else{
					return false;
				}}
			
				
	    }
		return (st.empty());
    }
}