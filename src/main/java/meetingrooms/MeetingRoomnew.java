package meetingrooms;

public class MeetingRoomnew {

    private String name;
    private int length;
    private int width;

    public MeetingRoomnew(String name, int length, int width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea(){
        return width * length;
    }

    @Override
    public String toString() {
        return "MeetingRoomnew{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}