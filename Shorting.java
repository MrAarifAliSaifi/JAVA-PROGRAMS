package arrayBasic;

public class Shorting {

	public static void main(String[] args) {
		int[] arr= {5,6,3,2,6,25,6,8,};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					 temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			
		}
		for(int i:arr)
		{
			System.out.println(i);
		}
			

}
}
