class Main {
    public static void main(String[] argv) {
        System.out.println("My name is Nong");
        System.out.println("My name is Nong");
        System.out.println("Hello world 1");
        System.out.println("My name is Tom");
        System.out.println("My name is Nong");
        System.out.println("Hello world 2");
        System.out.println("My name is Auu");
        System.out.println("My name is Nong");
        
        System.out.println("Hello chunk1");
        System.out.println("Hello chunk2");
        System.out.println("Hello chunk3");
        
        System.out.println("Hello world 3");
        
        
        for(int i=0;i<10;i++){
            System.out.println(i);
            String myName = "nong" +i;
            Person a = new Person();
            System.out.println(myName.toString());
        }
    }
}
