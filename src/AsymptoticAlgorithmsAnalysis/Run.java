package AsymptoticAlgorithmsAnalysis;

public class Run {

    // O(n) linear time
    int addUp_A(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    // O(1) const time
    int addUp_B(int n){
        int sum = n * (n + 1) / 2;
        return sum;
    }

    public static void main(String[] args) {
    }



}






