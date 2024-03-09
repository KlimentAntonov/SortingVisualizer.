import java.awt.*;

class GraphicElement {
    private final String image;
    private final int size;

    public GraphicElement(String image, int size) {
        this.image = image;
        this.size = size;
    }

    public String getImage() {
        return image;
    }

    public int getSize() {
        return size;
    }
}
