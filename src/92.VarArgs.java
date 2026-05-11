 class VarArgs {
    static void main() {
        System.out.println(concatenate("Prashant"));
        System.out.println(concatenate("Prashant","Jain"));
        System.out.println(concatenate("Subscribe","to","kgcoding"));
    }
    public static String concatenate(String... strs){
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str).append(" ");
        }
        return sb.toString();
    }
}
