    public int findJudge(int N, int[][] trust) {
        int[] number = new int[N + 1];
        
        for (int[] item : trust) {
            number[item[0]]--;
            number[item[1]]++;
        }
        
        for (int i = 1; i <= N; i++) {
            if (number[i] == N - 1) {
                return i;
            }
        }
        
        return -1;
    }