class RoomArea{
    int width, length;
    RoomArea(int width, int length){
        this.width=width;this.length=length;
    }int getArea(){
        return width*length;
    }
}
class RoomVolume extends RoomArea{
    int height;
    RoomVolume(int width, int length, int height){
        super(width,length);
        this.height=height;
    }int getVolume(){
        System.out.println("Area is "+super.getArea());
        return width*length*height;
    }
}
class P15Le502{
    public static void main(String[] args) {
        RoomVolume obj=new RoomVolume(10,15,20);
        System.out.println("Area of Room is "+obj.getArea());
        System.out.println("volume of Room is "+obj.getArea());
    }
}
