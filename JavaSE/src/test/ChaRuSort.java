package test;
//插入
public class ChaRuSort{
    public static void main(String[] args){
	int[] a = {7,8,5,6,4,2,1,3,9};

	//插入排序
	for(int i=0;i<a.length-1;i++){
	    for(int j=i+1;j>0;j--){
		if(a[j]<a[j-1]){
		   int temp=a[j];
		   a[j]=a[j-1];
	           a[j-1]=temp;
		}

		 //输出b数组
	        for(int k=0;k<a.length;k++){
	            System.out.print(a[k]+" ");
	        }
	        System.out.println();

	    }
	    
	}

	
   }
}