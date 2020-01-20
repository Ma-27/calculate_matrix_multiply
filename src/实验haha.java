import java.util.Scanner;

public class 实验haha
{
    public static void main(String[] args)
    {
        int i = 0,j = 0;
        int m = 0,s = 0;
        System.out.printf("输入矩阵1的行数:\n");
        Scanner scanner = new Scanner(System.in);
                m = scanner.nextInt();
        System.out.printf("输入矩阵1的列数：\n");
                s = scanner.nextInt();
        int[][] matrix1 = new int[m][s];
        System.out.printf("输入矩阵1\n");
        for (i = 0;i<m;i++)
        {
            for (j = 0;j<s;j++)
            {
                System.out.printf("在这里输入矩阵1的%d,%d元\n",i+1,j+1);
                  matrix1[i][j] =scanner.nextInt();
            }
        }
        System.out.println("输入矩阵2的列");
        int n = scanner.nextInt();
        System.out.printf("矩阵2的规模为 %d X %d\n",s,n);
        System.out.println("输入矩阵2:");

        int[][] matrix2 = new int[s][n];
        for (j = 0;j<s;j++)
        {
            for (i = 0;i<n;i++)
            {
                System.out.printf("在这里输入矩阵2的%d,%d元\n",j+1,i+1);
                matrix2[j][i] =scanner.nextInt();
            }
        }
        int [][]matrixnew = new int[m][n];
        for (i = 0;i<m;i++)
        {
            for (j = 0;j<n;j++)
            {
                int t = 0,sum = 0;
                for (t = 0;t<s;t++)
                {
                     sum = sum + matrix1[i][t]*matrix2[t][j];
                }
                matrixnew[i][j] = sum;
            }
        }
        System.out.println("矩阵的计算结果为：");
        for (i = 0;i<m;i++)
        {
            for (j = 0;j<n;j++)
            {
                System.out.printf(" %d ",matrixnew[i][j]);
            }
            System.out.printf("\n");
        }

    }
}
