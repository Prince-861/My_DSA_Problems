package com.arrays;

//You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
//
//You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [[7,4,1],[8,5,2],[9,6,3]]

//Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
//Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
public class RotateImage {
    public static void main(String[] args) {
        int matrix[][]={
                {5,1,9,11},
                {2,4,8,10},
                {13,3,6,7},
                {15,14,12,16}
        };

        rotate(matrix);

        for(int[] row : matrix){
            for(int value : row){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
//Method -1
//    public static void rotate(int[][] matrix) {
//        int n = matrix.length;
//
//        // Transpose
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[j][i];
//                matrix[j][i] = temp;
//            }
//        }
//
//        // Reverse rows
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n / 2; j++) {
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[i][n - 1 - j];
//                matrix[i][n - 1 - j] = temp;
//            }
//        }
//    }

//    Method-2
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[j][n-1-i]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=arr[i][j];
            }
        }
    }
}
