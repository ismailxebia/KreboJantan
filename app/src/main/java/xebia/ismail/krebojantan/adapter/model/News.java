package xebia.ismail.krebojantan.adapter.model;

/**
 * Created by Admin on 6/21/2017.
 */

public class News {

    public String news;
    public String des;
    public String date;
    public int imageNews;

    public News(String news, String des, String date, int imageNews) {
        this.news = news;
        this.des = des;
        this.date = date;
        this.imageNews = imageNews;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getImageNews() {
        return imageNews;
    }

    public void setImageNews(int imageNews) {
        this.imageNews = imageNews;
    }
}
