import java.util.*;
import java.lang.*;
import java.io.*;

class Code
{
    
static int getPersonWalking(int[] A, int n)
{
    int result = 0;
    for (int i = 0; i < n - 1; i++)
    {
    if (A[i] == 0)
    {
        for (int j = i + 1; j < n; j++)
            if (A[j] == 1)
                result++;
    }
    }
    return result;
}
 
public static void main(String[] args)
{
    int[] A = {0, 1, 0, 1, 1};
    int n = A.length;
    System.out.println(getPersonWalking(A, n));
}
}
 
	