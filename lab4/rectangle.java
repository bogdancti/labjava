package lab4;

public class rectangle {

    private int width;
    private int length;

    public void setWidth(int width){
        this.width = width;
    }
    public int getWidth(){
        return width;
    }

    public void setLength(int length){
        this.length = length;
    }
    public int getLength(){
        return length;
    }

    public int getArie(){
        return width * length;
    }
    public int getPerimetru(){
        return (2 * width) + (2 * length);
    }
}
