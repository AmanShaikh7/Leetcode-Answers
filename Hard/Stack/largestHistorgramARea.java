class Solution {
    public int[] getNSTLI(int arr[]){
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(st.size()>0 && arr[i] < arr[st.peek()] ){
                ans[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        while(st.size() >0){
            ans[st.peek()] = -1;
            st.pop();
        }
        return ans;
    }
    public int[] getNSTRI(int arr[]){
         Stack<Integer> st = new Stack<>();
        int ans[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(st.size()>0 && arr[i] < arr[st.peek()] ){
                ans[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        while(st.size() >0){
            ans[st.peek()] = arr.length;
            st.pop();
        }
        return ans;
    }
    public int largestRectangleArea(int[] heights) {
        int OverAllMax =0;
        int NSTLI[] = getNSTLI(heights); // this will give me all the index for NSTL
        int NSTRI[] = getNSTRI(heights);
        for(int i=0;i<heights.length;i++){
            int width = NSTRI[i]-NSTLI[i]-1;
            int height = heights[i];
            int area = width*height;
            OverAllMax = Math.max(OverAllMax,area);
        }
        return OverAllMax;

    }
}