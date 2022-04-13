package monitor.price.domain.Ci;

import com.google.gson.annotations.SerializedName;

//@Entity
public class Offers {
   // @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String price;
    private String availability;
    @SerializedName("priceValidUntil")
    private String priceValid;

   // @ManyToMany (cascade = CascadeType.ALL)
    //@JoinColumn (name = "product_id")
    private CiProduct ciProduct;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getPriceValid() {
        return priceValid;
    }

    public void setPriceValid(String priceValid) {
        this.priceValid = priceValid;
    }

    public CiProduct getCiProduct() {
        return ciProduct;
    }

    public void setCiProduct(CiProduct ciProduct) {
        this.ciProduct = ciProduct;
    }
}
