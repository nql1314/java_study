/**
 * 题目描述：在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 * 解题思路：从右上角开始查找。矩阵中的一个数，它左边的数都比它小，下边的数都比它大。
 * 因此，从右上角开始查找，就可以根据 target 和当前元素的大小关系来缩小查找区间。
 *
 * 复杂度：O(M + N) + O(1)
 */
public class Solution4 {
    public boolean Find(int target, int [][] array) {
        if (array == null || array.length == 0 || array[0].length == 0)
            return false;
        int rows = array.length;int cols = array[0].length;
        int r = 0,c = cols-1; //从右上角开始
        while(r<=rows-1&&c>=0){
            if(target == array[r][c]){
                return true;
            }else if(target<array[r][c]){
                c--;
            }else{
                r++;
            }
        }
        return false;
    }
}
