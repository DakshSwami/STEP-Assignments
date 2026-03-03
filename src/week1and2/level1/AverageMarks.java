class AverageMarks {
    public static void main(String[] args) {
        int maths = 94, physics = 95, chemistry = 96;
        int totalMarks = maths + physics + chemistry;
        double averagePercent = (double) totalMarks / 3;
        System.out.println("Sam's average mark in PCM is " + averagePercent);
    }
}