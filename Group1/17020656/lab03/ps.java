/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps;
import java.util.Scanner;
/**
 *
 * @author CCNE
 */
class PhanSo
{
    int Tu,Mau;
    public void set(int t, int m)
    {
        this.Tu=t;
        this.Mau=m;
    }
    public void Cong(PhanSo a)
    {
        Tu=a.Tu*Mau+a.Mau*Tu;
        Mau=a.Mau*Mau;
    }
    public void Tru(PhanSo a)
    {
        Tu=a.Tu*Mau-a.Mau*Tu;
        Mau=a.Mau*Mau;
    }
    public void Nhan(PhanSo a)
    {
        Tu=a.Tu*Tu;
        Mau=a.Mau*Mau;
    }
    public void Chia(PhanSo a)
    {
        Tu=a.Tu*Mau;
        Mau=a.Mau*Tu;
    }
    public boolean equals(Object obj)
    {
        if(obj instanceof PhanSo)
        { 
        PhanSo other= (PhanSo) obj;
        int n=other.Tu*Mau-other.Mau*Tu;
        if(n==0){return true;}
        }
        return false;
    }
}
public class PS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
