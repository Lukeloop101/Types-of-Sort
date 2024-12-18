//will only accept a array of ints to sort

class bubbleSort {
    public void bubbleSort(int[] arr) {
        int length= arr.length;
        //count<length; as count starts at 0 and length starts at 1 so we dont make it <=
        //goes through each number
        for (int count=0; count<length;count++)
        {
            for (int secondCount=0; secondCount<length-1-count;secondCount++)
            {
                //checks if a the value before a value is bigger than than it which will then begin the switch
                if (arr[secondCount] > arr[secondCount + 1]) {
                    //we need a temp value so we can change the first value into the second  while then still having access to the first value which we can replace with the second placement
                    int temp = arr[secondCount];
                    arr[secondCount] = arr[secondCount + 1];
                    arr[secondCount + 1] = temp;
                }
            }
        }
    }
}
