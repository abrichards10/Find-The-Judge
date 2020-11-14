
public class Judge {

    public int findJudge(int N, int[][] trust){
        // create two arrays to keep track of the inner/outer arrays
        int[] inner = new int[N + 1];
        int[] outer = new int[N + 1];

        // with the same length as the original array
        for(int i = 0; i < trust.length; i++){
            //looping through each value of the original array
            // we add the values to the inner and outer arrays
            outer[trust[i][0]]++;
            inner[trust[i][1]]++;
        }

        // here we look for the judge
        // if the inner value equals the value of one less than the number of people
        // and the outer value equals 0
        // return the index of that value --> it is equal to whatever value is the judge's number
        for(int i = 1; i <= N; i++){
            if((inner[i] == N - 1) && (outer[i] == 0)){
                return i;
            }
        }
        // if the judge does not exist
        // return -1
        return -1;
        
    }

    public static void main(String[] args) {

        // create a new judge object
        Judge main = new Judge();

        // example tests
        int[][] test1 = {{1,2}};
        int[][] test2 = {{1,3}, {2,3}};
        int[][] test3 = {{1,3},{2,3},{3,1}};
        int[][] test4 = {{1,2},{2,3}};
        int[][] test5 = {{1,3},{1,4},{2,3},{2,4},{4,3}};

        int judge1 = main.findJudge(2, test1);
        int judge2 = main.findJudge(3, test2);
        int judge3 = main.findJudge(3, test3);
        int judge4 = main.findJudge(3, test4);
        int judge5 = main.findJudge(4, test5);

        System.out.println(judge1);
        System.out.println(judge2);
        System.out.println(judge3);
        System.out.println(judge4);
        System.out.println(judge5);

    }
}
