class Counter {
    int myCount = 0;
    static int totalCount = 0;
    public void increment() {
        myCount++;
        totalCount++;
    }
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        c1.increment();
        c2.increment();
        c1.increment();
        c2.increment();
        System.out.println("c1.myCount: " + c1.myCount);
        System.out.println("c2.myCount: " + c2.myCount);
        System.out.println("Counter.totalCount: " + Counter.totalCount);
    }
    
}