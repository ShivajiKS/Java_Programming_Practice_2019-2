class AreaValume
    {
    int width,length,height;
    int getArea()
    {
        return width*length;
    }
    int getVolume()
    {
        return width*length*height;
    }
}
class P9Le502
    {
    public static void main(String[] args) {
        AreaValume obj= new AreaValume();
        obj.width=20;obj.height=30;obj.length=38;
        System.out.println("Area of Room is :"+obj.getArea());
        System.out.println("Volume of Room is :"+obj.getVolume());
    }
}
