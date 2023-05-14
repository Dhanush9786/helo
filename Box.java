class Box {
    double width;
    double height;
    double depth;

    Box() {
        width = 11;
        height = 20;
        depth = 15;
    }

    void volume() {
        double vol;
        vol = width * height * depth;
        System.out.println("Volume is " + vol);
    }

    public static void main(String args[]) {
        Box mybox = new Box();
        mybox.volume();
    }
}
