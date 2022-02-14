 static void product(int arr[], int n) {
        int a = arr[0];
        int b = arr[1];

        for (int j = 0; j <= n; j++)
            for (int k = j; k <= n; k++)
                if (arr[j] * arr[k] > a * b) {
                    a = arr[j];
                    b = arr[k];
                }


    }
