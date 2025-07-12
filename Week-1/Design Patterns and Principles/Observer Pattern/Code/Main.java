public class Main {
    public static void main(String[] args) {
        StockMarket belStock = new StockMarket("Bharat Electronics Limited",151.6);
        Observer mobile = new MobileApp("Groww");
        Observer web = new WebApp("WebBrowser");

        belStock.register(mobile);
        belStock.register(web);

        belStock.setPrice(405.35);
        belStock.unregister(web);
        belStock.setPrice(409.30);
    }
}