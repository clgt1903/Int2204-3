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
public class PS {
    private int ts;
    private int ms;
	
    public int getts(){
	return ts;
    }
    public int getms(){
	return ms;
    }
    public void setts(int a){
	this.ts=a;
    }
    public void setms(int a){
	this.ms=a;
    }
    public int ucln(int a, int b){
	if(a<0)a=0-a;
	if(b<0)b=0-b;
	while(a!=b){
            if(a>b)a=a-b;
            if(a<b)b=b-a;
	}
	return a;
    }
    public void cong(PS a){
	int tuso, mauso;
	mauso=a.ms*this.ms;
	tuso=a.ts*this.ms+this.ts*a.ms;
	int n=ucln(tuso,mauso);
	System.out.println(tuso/n+"/"+mauso/n);
    }
    public void tru(PS a){
	int tuso, mauso;
	mauso=a.ms*this.ms;
	tuso=this.ts*a.ms-a.ts*this.ms;
	int n=ucln(tuso,mauso);
	System.out.println(tuso/n+"/"+mauso/n);
    }
    public void nhan(PS a){
	int tuso, mauso;
	mauso=a.ms*this.ms;
	tuso=a.ts*this.ts;
	int n=ucln(tuso,mauso);
	System.out.println(tuso/n+"/"+mauso/n);
    }
    public void chia(PS a){
	int tuso, mauso;
	mauso=a.ms*this.ts;
	tuso=a.ts*this.ms;
	int n=ucln(tuso,mauso);
	System.out.println(tuso/n+"/"+mauso/n);
    }
    @Override
    public boolean equals(Object obj){    
	if(obj instanceof PS){
            PS other=((PS)obj);
            int a=this.ts*other.getms();
            int b=this.ms*other.getts();
            if(a==b)return true;
            else return false;
	}
	else return false; 
    }
}
