class RoomArea{
    int width=10,length=15;
    int getArea(){
        return width*length;
    }
}
class RoomVolume extends RoomArea{ //Single inheritance
    int height=12;
    int getVolume(){
        return width*length*height;
    }
}
class P13Le502{
    public static void main(String[] args) {
        RoomVolume obj = new RoomVolume();
        int area =obj.getArea();
        int volume =obj.getVolume();
        System.out.println("Area of Room is : "+area);
        System.out.println("volume of Room is : "+volume);
    }

}
