/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author admin
 */
public class Lab3 {
 
    public void ucln(int a, int b){   
	if(a<0)a=0-a;
	if(b<0)b=0-b;
	while(a!=b){
		if(a>b)a=a-b;
		if(a<b)b=b-a;
	}
	System.out.println(a);
    }
    public void fibonaxi(int n){
	int a=1;
	int b=1;
	int sum=0;
	for(int i=2;i<=n;i++){
            sum=a+b;
            a=b;
            b=sum;
	}
	System.out.println(sum);
    }
    
        
}
