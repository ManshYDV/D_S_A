public class wordSearch {
    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        String word = "ABCCED";
        System.out.println(backTrack(board, word));
    }



public static boolean backTrack(char[][] board, String word) {
    for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[0].length; j++) {
            if (exist(board, word, i, j, 0)) {
                return true;
            }
        }
    }
    return false;
}

public static boolean exist(char[][] board, String word, int i, int j, int count) {
    if (count == word.length()) {
        return true;
    }
    if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(count)) {
        return false;
    }
    char temp = board[i][j];
    board[i][j] = '*';
    boolean found = exist(board, word, i + 1, j, count + 1) ||
            exist(board, word, i - 1, j, count + 1) ||
            exist(board, word, i, j + 1, count + 1) ||
            exist(board, word, i, j - 1, count + 1);
    board[i][j] = temp;
    return found;
}
}
