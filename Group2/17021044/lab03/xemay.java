/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class xemay {
    private String tenXe, namSanXuat, hangxeString;

    public xemay(String tenXe, String namSanXuat, String hangxeString) {
        this.tenXe = tenXe;
        this.namSanXuat = namSanXuat;
        this.hangxeString = hangxeString;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public String getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(String namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getHangxeString() {
        return hangxeString;
    }

    public void setHangxeString(String hangxeString) {
        this.hangxeString = hangxeString;
    }
    
}
