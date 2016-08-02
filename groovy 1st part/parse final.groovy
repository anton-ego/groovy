import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import groovy.time.*

def NewsList = []

Document doc = Jsoup.connect("https://www.rt.com/sport/").get();
Elements cards = doc.getElementsByClass("card").each { card ->
    if( card.getElementsByClass("date").size() > 0) {
    
        Elements date = card.getElementsByClass("date")
        Elements title = card.getElementsByTag("a")
        
        NewsList << ["date": new Date().parse('MMM d, yyyy HH:mm',date.text()).format('yyyy-MM-d HH:mm'), "title": title.text()]
    }
    
}
    
(NewsList.sort { a,b -> a.date <=> b.date }).each{n -> println "${n.date} ${n.title} \n"}