class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int len=speed.length;
        Stack<Double> stack=new Stack<>();
        double[][] cars = new double[len][2];
        

        for (int i = 0; i < len; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        } 
        
        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));

        for (double[] car : cars) {
            double time = (target-car[0])/car[1];
            if (stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }
            
        }
        return stack.size();
    }
}
