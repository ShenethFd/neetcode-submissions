class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        else{
            Map<Character, Integer> charCount = new HashMap<>();

            for (int i = 0; i < s.length(); i++){
                char character = s.charAt(i);

                if (charCount.containsKey(character)){
                    charCount.put(character,charCount.get(character)+1);
                }
                else{
                    charCount.put(character, 1);
                }
            }

            for (int j = 0; j < t.length(); j++){
                char character = t.charAt(j);

                if (charCount.containsKey(character) == false){
                    return false;
                }
                else{
                    int newValue = charCount.get(character) - 1;
                    if(newValue == 0){
                        charCount.remove(character);
                    }
                    else{
                        charCount.put(character, newValue);
                    }
                }
            }

            return charCount.isEmpty();
        }

    }
}
