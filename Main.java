class Main {
    int globalVar = 20;
    public static void main(String[] args) {
        int age = 0;
        Main mainClass = new Main();
        System.out.println(mainClass.globalVar);
        age = 10;
        System.out.println("you are " + age + " years old." );
    }
}
