class halvesAreAlike {
    public boolean halvesAreAlike(String s) {
        Set<Character>vowels = new HashSet<>();
        //intializing the values to vowels
        vowels.add('a'); vowels.add('e'); vowels.add('i'); vowels.add('o'); vowels.add('u');
        vowels.add('A'); vowels.add('E'); vowels.add('I'); vowels.add('O'); vowels.add('U');
        int length = s.length();
        //cutting the string into half
        int midpoint = length/2;
        //seperating the strings
        String firsthalf = s.substring(0,midpoint);
        String secondhalf = s.substring(midpoint);
        //counting the vowels and 
        return countvowels(firsthalf , vowels) == countvowels(secondhalf,vowels);
    }
    private int countvowels(String str,Set<Character>vowels){
        //count starting from 0
        int count = 0;
        for(char c: str.toCharArray()){
            if(vowels.contains(c)){
                count++;
            }
        }

            return count;
    }
    
}