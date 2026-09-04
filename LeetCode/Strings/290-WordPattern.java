class Solution
{
    public boolean wordPattern(String pattern, String s)
    {
        String[] words = s.split(" ");

        if(pattern.length() != words.length)
        {
            return false;
        }

        java.util.HashMap<Character, String> map = new java.util.HashMap<>();
        java.util.HashMap<String, Character> reverse = new java.util.HashMap<>();

        for(int i = 0; i < pattern.length(); i++)
        {
            char ch = pattern.charAt(i);
            String word = words[i];

            if(map.containsKey(ch) && !map.get(ch).equals(word))
            {
                return false;
            }

            if(reverse.containsKey(word) && reverse.get(word) != ch)
            {
                return false;
            }

            map.put(ch, word);
            reverse.put(word, ch);
        }

        return true;
    }
}
