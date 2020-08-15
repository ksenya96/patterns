package observer;

public class Main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        NewsChannel channel = new NewsChannel();
        newsAgency.addObserver(channel);
        newsAgency.setNews("Hello World");
        System.out.println(channel.getNews()); //Hello World
    }
}
