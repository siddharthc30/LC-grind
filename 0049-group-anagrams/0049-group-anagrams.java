class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s:strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sortedarr = new String(arr);
            map.putIfAbsent(sortedarr, new ArrayList<>());
            map.get(sortedarr).add(s);
        }
        return new ArrayList<>(map.values());
    }
}