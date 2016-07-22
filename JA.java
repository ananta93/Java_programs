import java.io.*;
class JA 
{
	public static void main(String[] args) throws IOException
	{
        int[][] x=new int[3][];
		x[0]=new int[2];
		x[1]=new int[3];
		x[2]=new int[5];
		//InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		/*x[0][]={1,2,3,4,5};
        x[1]={1,2,3};
		x[2]={1,2,3,4,5,6};*/
        /*int[][] x={
		            {1,2,3,4,5},
					{1,2,3},
					{1,2,3,4,5,6}	 
		          };*/
		System.out.println("Enter elements to the jagged array : ");
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter "+x[i].length+" Elements to the row");
			for(int j=0;j<x[i].length;j++)
			{
				x[i][j]=Integer.parseInt(br.readLine());
				//System.out.print(x[i][j]);
			}
            System.out.println();
		}
		System.out.println("The resultant array is ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				System.out.print(x[i][j]);
			}
            System.out.println();
		}
	}
}
