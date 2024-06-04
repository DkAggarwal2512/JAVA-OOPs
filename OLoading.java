
class OLoading {
    // Overloaded methods
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        OLoading math = new OLoading();
        System.out.println(math.add(5, 3)); // Outputs 8
        System.out.println(math.add(5.5, 3.3)); // Outputs 8.8
        System.out.println(math.add(5, 3, 2)); // Outputs 10
    }
}

