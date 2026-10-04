package solutions._01_generics;

class Main {
    static class Pair<A,B>{
        A first;
        B second;

        public Pair(A first, B second){
            this.first = first;
            this.second = second;
        }

        public String toString(){
            return "(" + this.first + ", " + this.second + ")";
        }
    }

    public static void main(String[] args) {
        Pair<String,Integer> pair = new Pair<>("Ada",36);
        System.out.println(pair.toString());
    }
}
