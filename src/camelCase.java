/*Sample Input

saveChangesInTheEditor
  Sample Output: 5 */

class Result {
    public static int camelcase(String s) {
    // Write your code here
        int n=1;
        for(char c : s.toCharArray()){
            if(c>='A' && c<='Z') n++;
        }
        return n;
    }
}
