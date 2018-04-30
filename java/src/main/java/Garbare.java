
public class Garbare {


    public static void main(String [] args)
    {
        Garbare t1 = new Garbare();

        System.out.println("Hash t1 " + t1.hashCode());
        Garbare t2 = m1(t1); // line 6

        System.out.println("Hash t2 " + t2.hashCode());

        Garbare t3 = new Garbare();

        System.out.println("Hash t3 " + t3.hashCode());
        t2 = t3; // line 8

        System.out.println("Hsh t2 " + t2.hashCode());

        System.gc();

    }

    static Garbare m1(Garbare temp)
    {
        temp = new Garbare();
        return temp;
    }

    @Override
    protected void finalize() throws Throwable {

        System.out.println("wew " + this.hashCode());
        super.finalize();
    }
}
