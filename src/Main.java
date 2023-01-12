public class Main {
    public static void main(String[] args) {
        Balyk bal = new Balyk();
        bal.setName("Rybka");
        bal.setAge(2);
        bal.setHost("Zhazira");
        bal.setFood("Nan");
        System.out.println(bal.getName()+ ". " +bal.getAge()+ ". " + bal.getHost() + ". " + bal.getFood());
        System.out.println();

        Popugay pop = new Popugay();
        pop.setName("Kesha");
        pop.setColor("blue");
        pop.setFunction("singing");
        System.out.println("Menin atym - " + pop.getName() +
               ". Menin tusum " + pop.getColor() + " tusto. " +
                "En negizgi jumushum - " + pop.getFunction());

        Myshyk mysh = new Myshyk();
        mysh.setName("Murka");
        mysh.setColor("brown");
        mysh.setTodo("sleeping");
        System.out.println("Myshygymdyn aty - " +
                mysh.getName() + ". Al " + mysh.getColor() +
                " tustuu. " + mysh.getTodo() + " - ayabay jakshy korot! ");

        It it = new It();
        it.setName("Skubi Du");
        it.setBestFriend("Murka");
        it.setNumberOfChildren(4);
        System.out.println("ittin aty - " + it.getName() +
                ". Anyn jakyn dosu - " + it.getBestFriend() +
                ". Baldarynyn sany "+ it.getNumberOfChildren());


    }
}