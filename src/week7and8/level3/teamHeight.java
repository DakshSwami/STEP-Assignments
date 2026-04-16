class FootballTeamHeightAnalysis {
    public int generateRandomHeight() {
        return (int) (Math.random() * (250 - 150 + 1)) + 150;
    }
    public int calculateSum(int[] heights) {
        int totalSum = 0;
        for (int i = 0; i < heights.length; i++) {
            totalSum += heights[i];
        }
        return totalSum;
    }
    public double findMeanHeight(int[] heights) {
        int sum = calculateSum(heights);
        return (double) sum / heights.length;
    }
    public int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < shortest) {
                shortest = heights[i];
            }
        }
        return shortest;
    }
    public int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }
        return tallest;
    }
    public static void main(String[] args) {
        FootballTeamHeightAnalysis analysis = new FootballTeamHeightAnalysis();
        int[] heights = new int[11];
        System.out.println("Player Heights (in cms):");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = analysis.generateRandomHeight();
            System.out.print(heights[i] + " ");
        }
        double meanHeight = analysis.findMeanHeight(heights);
        int shortest = analysis.findShortestHeight(heights);
        int tallest = analysis.findTallestHeight(heights);
        System.out.println("\n\n--- Football Team Height Analysis ---");
        System.out.println("Shortest Player Height: " + shortest + " cms");
        System.out.println("Tallest Player Height:  " + tallest + " cms");
        System.out.println("Mean Team Height:      " + Math.round(meanHeight * 100.0) / 100.0 + " cms");
    }
}