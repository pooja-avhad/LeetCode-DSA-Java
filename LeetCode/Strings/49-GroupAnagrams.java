class Solution
{
    public List<List<String>> groupAnagrams(String[] strs)
    {
        Map<String, List<String>> map = new HashMap<>();

        for(String word : strs)
        {
            int[] count = new int[26];

            for(int i = 0; i < word.length(); i++)
            {
                count[word.charAt(i) - 'a']++;
            }

            StringBuilder key = new StringBuilder();

            for(int i = 0; i < 26; i++)
            {
                key.append('#');
                key.append(count[i]);
            }

            String k = key.toString();

            if(!map.containsKey(k))
            {
                map.put(k, new ArrayList<>());
            }

            map.get(k).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
