package monitor.price.domain.Ci;

import com.google.gson.annotations.SerializedName;

//@Entity
public class CiProduct {
   // @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @SerializedName("sku")
    private String article;
    private String name;
    private String image;
    private String brand;
   // @OneToMany(mappedBy = "offers", fetch = FetchType.EAGER)
    private Offers offers;

    public Offers getOffers() {
        return offers;
    }

    public void setOffers(Offers offers) {
        this.offers = offers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
