package solutions._08_records;

class Main {
    static final class Person {
        final private String name;
        final private int age;

        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }

        public String getName(){
            return this.name;
        }

        public int getAge(){
            return this.age;
        }

        public String toString(){
            return "Person[name=" + this.name + ", age=" + this.age + "]";
        }
    }

    public static void main(String[] args) throws Exception {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String name = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        // Build a Person and print it.
        System.out.println(new Person(name, age).toString());
    }
}