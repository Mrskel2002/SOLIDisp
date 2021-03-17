class Vova implements Human,Writeable {
    @Override
    public void eat(){
        System.out.println("Vova eats cake");
    }

    @Override
    public void write() {
        System.out.println("Vova write a massage to Misha");
    }
}
class Misha implements Human,Readable{
    @Override
    public void eat() {
        System.out.println("Misha eats pancake");
    }

    @Override
    public void read() {
        System.out.println("Misha read Vova's massage");
    }
}
