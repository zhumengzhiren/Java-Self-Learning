class Static {
    static int x = 10;
    public static void main(String[] args) {
        Static s1 = new Static();
        Static s2 = new Static();
        Static.x = 20;
        System.out.println(s1.x);
        System.out.println(s2.x);
    }
    
}