public int compareStrings(String str1,String str2){
    for(int i = 0;i < str1.length() && i < str2.length();i++){
        if(str1.charAt(i) != str2.charAt(i)){
            return str1.charAt(i) - str2.charAt(i);
        }
    }
    return str1.length() - str2.length();
}
