package Programs;
public class ThreeDimensArrayElemPrint 
{
	public static void main(String[] args) 
	{
	  int i,j,k;
	  int [][][] a = {{{1,2,3},{4,5,6},{5,6,7},{9,4}}};
	  for(i=0;i<a.length;i++)
	  {
		  for(j=0;j<a[i].length;j++)
		  {
			  for(k=0;k<a[i][j].length;k++)
			  {
				  System.out.println(a[i][j][k]);
			  }
		  }
	  }
	}
}
