package lab200;

import java.util.Objects;

public class Item {
    private String id;
    private ItemSpec spec;
    private String imageUrl;
    private Float price;
    private Integer quantity;
    String encode(ItemEncoder ie) {
        return ie.encode(this);
    }
}

// May notify => July, June

class ItemSpec {
    private  String name;
    private String type;
    Boolean compare(ItemSpec is) {
        return Objects.equals(this.name, is.name) &&
                Objects.equals(this.type, is.type);
    }
}
interface ItemEncoder {
    String encode(Item item);
}

class HTMLItemEncoder implements ItemEncoder {
    public String encode(Item item) {
        return "<html><body><h1>" + item + "</h1></body></html>";
    }
}

class JSONItemEncoder implements ItemEncoder {
    public String encode(Item item) {
        return "{ \"id\": \"" + item + "\" }";
    }
}
