import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import groovy.time.*
//List title[]
//Date time[]
def NewsList = [].withDefault{[:]}
Locale.setDefault(Locale.US)
def url = "https://www.rt.com/sport/"
//@Grapes( @Grab('org.jsoup:jsoup:1.6.1'))
Document doc = Jsoup.connect("https://www.rt.com/sport/").get();
//Document doc = Jsoup.parse(url)
//Elements titles = doc.select("a.link link_hover")//.each {println it}
//String title = doc.class('link link_hover');
Elements cards = doc.getElementsByClass("card").each { card ->
    if( card.getElementsByClass("date").size() > 0) {
        Elements date = card.getElementsByClass("date")
        def Cdate = new Date().parse('MMM d, YYYY HH:mm',date.text()).format('YYYY-MM-d HH:mm')

        Elements title = card.getElementsByTag("a")
        def txt = title.text()
        NewsList << ["date":"$Cdate", "title":"$txt"]
        //it.getElementsByClass("date").
        //time[n] = card.
       
    }
    
    }
    
NewsList.sort { a,b -> a.date <=> b.date }    
NewsList.each{n -> println "${n.date} ${n.title} \n"}