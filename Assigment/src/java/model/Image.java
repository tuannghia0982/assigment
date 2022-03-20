/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author tuann
 */
public class Image {
    private int id; 
    private String info;
    private int chapid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getChapid() {
        return chapid;
    }

    public void setChapid(int chapid) {
        this.chapid = chapid;
    }

    @Override
    public String toString() {
        return "Image{" + "id=" + id + ", info=" + info + ", chapid=" + chapid + '}';
    }
    
    
}
