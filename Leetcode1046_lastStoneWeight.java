public class Leetcode1046_lastStoneWeight {

    public static void main(String[] args) {
        int[] stones = new int[]{2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones));
    }

    public static int lastStoneWeight(int[] stones){
        int nums = stones.length;
        while(nums > 1){
            nums = crash(stones);
        }
        if(nums == 1){
            for(int i : stones){
                if(i != 0){
                    return i;
                }
            }
        }
        return 0;
    }

    public static int crash(int[] stones){
        int maxIndex = 0;
        int secIndex = 0;
        int max = 0;
        int sec = 0;
        int count = 0;
        for(int i = 0; i < stones.length; i++){
            if(stones[i] != 0){
                count++;
            }
            if(stones[i] > max){
                sec = max;
                secIndex = maxIndex;
                max = stones[i];
                maxIndex = i;
            }
            else if(stones[i] <= max && stones[i] > sec){
                sec = stones[i];
                secIndex = i;
            }
        }
        if(max == sec){
            stones[maxIndex] = 0;
            stones[secIndex] = 0;
            count -= 2;
        }
        else{
            stones[secIndex] = 0;
            stones[maxIndex] = max - sec;
            count -= 1;
        }

        // for(int i : stones){
        //     System.out.print(i + " ");
        // }
        // System.out.println();
        return count;
    }
    
}
