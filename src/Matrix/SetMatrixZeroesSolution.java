package Matrix;

/**
 * @author LENOVO
 * @project Top150Interview
 * @date 8/2/2024
 */
public class SetMatrixZeroesSolution {
    public void setZeroes(int[][] matrix) {
        // Lấy số hàng và số cột
        int m = matrix.length;
        int n = matrix[0].length;

        // Biến để kiểm tra xem hàng đầu tiên có chứa 0 hay không
        boolean firstRowHasZero = false;
        // Biến để kiểm tra xem cột đầu tiên có chứa 0 hay không
        boolean firstColHasZero = false;

        // Kiểm tra hàng đầu tiên
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRowHasZero = true;
                break;
            }
        }

        // Kiểm tra cột đầu tiên
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstColHasZero = true;
                break;
            }
        }

        // Sử dụng hàng đầu tiên và cột đầu tiên để đánh dấu các hàng và cột cần đặt về 0
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Đặt các hàng cần thiết về 0
        for (int i = 1; i < m; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Đặt các cột cần thiết về 0
        for (int j = 1; j < n; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Cuối cùng, xử lý hàng đầu tiên và cột đầu tiên
        if (firstRowHasZero) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        if (firstColHasZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
