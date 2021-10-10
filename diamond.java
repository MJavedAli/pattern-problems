
/* Program to print the below pattern

* * * * * * * * * 
* * * *   * * * *
* * *       * * *
* *           * *
*               *
*               *
* *           * *
* * *       * * *
* * * *   * * * *
* * * * * * * * * 
	
	
*/	
	
public class Barfi {

	public static void main(String[] args) {
		int n = 5;
		int i, j; 
		
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=2*n;j++) {
				if(i>(n-j+1)) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				
				if(j>=n+i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(i=1;i<=n;i++) {
			for(j=1;j<=2*n;j++) {
				if(j>i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				
				if(j<=2*n-i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
 }
}
