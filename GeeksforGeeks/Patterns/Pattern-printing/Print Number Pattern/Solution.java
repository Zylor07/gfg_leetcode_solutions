class Solution {
    public ArrayList<Integer> printPat(int n) {
        // write code here
        int num=n;
        int times=n;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1; i<=n;i++){
            for(int j=1;j<=n;j++){
                for(int k=1;k<=times;k++){
                    list.add(num);
                }
                num--;
                if (num==0) num =n;
            }
            times--;
            list.add(-1);
        }
        return list;
    }
}