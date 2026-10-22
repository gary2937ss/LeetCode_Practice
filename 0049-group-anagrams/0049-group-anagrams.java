class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // key = "ate" ; value = ["ate","tea","eat"] 
        Map<String, List<String>> map = new HashMap<>();
        
        // 透過 strs 一個一個找出 完全相同英文字母，並排序後存成Key值
        for (String word : strs) {
            char[] charGroup = word.toCharArray();
            Arrays.sort(charGroup);       
            String key = new String(charGroup);

            if (!(map.containsKey(key))) {
                map.put(key , new ArrayList<>());
            }
            List<String> mapList = map.get(key);
            mapList.add(word);
        }
        return new ArrayList<>(map.values());
        
    }
}