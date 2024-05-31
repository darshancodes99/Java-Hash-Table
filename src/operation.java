public class operation {

    public static void main(String[] args) {
        int arr[]=new int[5];
        int p=0;

        p=insert(arr,p,10);
        p=insert(arr,p,20);
        p=insert(arr,p,30);
        p=insert(arr,p,40);
        p=insert(arr,p,50);
        p=insert(arr,p,60);

        //find(arr,p,50);
        //print(arr,p);
        System.out.println("before update");
        print(arr,p);

        System.out.println("After Update");
        update(arr,p,30,300);
        print(arr,p);

        p=delete(arr,p,300);
        print(arr,p);

        size(p);
        System.out.println(isempty(p));

    }
    public static boolean isempty(int p)
    {
        if(p==0)
        {
            return true;
        }
        return false;
    }
    private static int size(int p)
    {
        System.out.println(p);
        return p;
    }
    private static int delete(int arr[],int p,int value)
    {
        for (int i = 0; i < p; i++)
        {
            if (arr[i] == value)
            {
                for (int j= i; j < p-1; j++)
                {
                    arr[j]=arr[j+1];
                }
                p--;
            }
        }
        return p;
    }
    private static void update(int arr[],int p,int ovalue,int nvalue)
    {
        for (int i = 0; i < p; i++)
        {
            if (arr[i] == ovalue)
            {
                 arr[i]= nvalue;
            }
        }
    }
    private static void find(int arr[],int p,int value) {
        for (int i = 0; i < p; i++)
        {
            if (arr[i] == value)
            {
                System.out.println("present");
                return;
            }
        }
        System.out.println("not present");
    }
    private static void print(int arr[],int p)
    {
        for(int i=0;i<p;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    private static int insert(int arr[],int p,int value)
    {
        if(p==arr.length)
        {
            System.out.println("Array is full");
            return p;
        }
        arr[p]=value;
        p++;
        return p;
    }
}
