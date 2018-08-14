public class TVActorDriver {
    public static void main(String[] args) {
        TVActor a = new TVActor();
        a.name = "Thomas Middleditch";
        a.role = "Richard Hendricks";
        a.age = 24;
        
        TVActor b = new TVActor();
        b.name = "Martin Starr";
        b.role = "Bertram Gilfoyle";
        b.age = 48;
        
        TVActor c = new TVActor();
        c.name = "Kumail Nanjiani";
        c.role = "Dinesh Chugtai";
        c.age = 64;
        
        System.out.println(a.name + " age " + a.age + ", played " + a.role);
        System.out.println(b.name + " age " + b.age + ", played " + b.role);
        System.out.println(c.name + " age " + c.age + ", played " + c.role);
    }
}