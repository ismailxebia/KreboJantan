package xebia.ismail.krebojantan.adapter.model;

/**
 * Created by Admin on 6/19/2017.
 */

public class Menu {

    public String title;
    public String min;
    public String harga;
    public String rate;
    public int imageId;

    public Menu(String title,String min, String harga, int imageId) {
        this.title = title;
        this.min = min;
        this.harga = harga;
        //this.rate = rate;
        this.imageId = imageId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMin(String min) {
        this.min = min;
    }


    public void setHarga(String harga) {
        this.harga = harga;
    }

    /*public void setRate(String rate) {
        this.rate = rate;
    }*/

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public String getMin() {
        return min;
    }

    public String getHarga() {
        return harga;
    }

    /*public String getRate() {
        return rate;
    }
    */

    public int getImageId() {
        return imageId;
    }
}
