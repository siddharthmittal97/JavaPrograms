package Programs;
public class TwoDimensArrayElemPrint 
{
	public static void main(String[] args) 
	{
	int i,j;
	int[][] a = {{1,2,3},{2,3}};
	for(i=0;i<a.length;i++)
	{
		for(j=0;j<a[i].length;j++)
		{
			System.out.println(a[i][j]);
		}
	}
  }
}
