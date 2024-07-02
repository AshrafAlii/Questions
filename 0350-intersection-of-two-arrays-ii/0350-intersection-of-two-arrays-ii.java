class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        List<Integer> resultList = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while(i<len1 && j < len2){
            if(nums1[i] == nums2[j]){
                resultList.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] < nums2[j]) i++;
            else j++;
        }
        int [] result = new int[resultList.size()];
        for(int k = 0; k<resultList.size(); k++){
            result[k] = resultList.get(k);
        }
        return result;
    }
}