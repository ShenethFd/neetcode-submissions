class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramT = new HashMap<>();

        for (int i = 0; i < strs.length; i++){
            String original_str = strs[i];

            char[] charstream = original_str.toCharArray();
            Arrays.sort(charstream);

            String sorted_str = new String(charstream);

            if(anagramT.containsKey(sorted_str) == false){
                List<String> newList = new ArrayList<>();
                newList.add(original_str);
                anagramT.put(sorted_str, newList);

            }else{

                List<String> existingList = anagramT.get(sorted_str);
                existingList.add(original_str);

            }
        }

        List<List<String>> anagramList = new ArrayList<>(anagramT.values());

        return anagramList;

    }
}
