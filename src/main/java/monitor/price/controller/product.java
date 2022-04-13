package monitor.price.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import monitor.price.domain.Ci.CiProduct;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/product")
public class product {

//@Autowired
//CiProductService ciService;

@GetMapping
    public CiProduct getOne() throws IOException{

        String address = "https://www.citilink.ru/product/drel-shurupovert-deko-dkcd20fu-li-063-4093-1454707/";

        Document page = Jsoup.connect(address).get();
        String json = page.getElementsByAttributeValue("type", "application/ld+json").first().data();

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        CiProduct product = gson.fromJson(json, CiProduct.class);


       // LinkedHashMap map = gson.fromJson(json, LinkedHashMap.class);

        //CiProduct product = new CiProduct();
       // product.setName((String) map.get("name"));
       // product.setArticle((String) map.get("sku"));
       // product.setImage((String) map.get("image"));
       // product.setBrand((String) map.get("brand"));

        //String offers = gson.toJson(map.get("offers"));
       // CiOffers ciOffers = gson.fromJson((JsonElement) map.get("offers"), CiOffers.class);
       // LinkedHashMap offers = (LinkedHashMap) map.get("offers");

       System.out.println(json);
      // System.out.println(map.get("offers"));



    return product;
}




}
