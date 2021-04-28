package algortithms;

public class ExtraSpace {
	static void arrange(long arr[], int n)
    {
        // your code here
        for (int i = 0; i < n; i++)
            arr[i] += (arr[(int)arr[i]] % n) * n;

        // Second Step: Divide all values by n
        for (int i = 0; i < n; i++)
            arr[i] /= n;
    }

}
