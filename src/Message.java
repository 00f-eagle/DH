public class Message {

    public void Send(){

        Alice Alice = new Alice();

        System.out.println("p = " + Alice.getP());
        System.out.println("g = " + Alice.getG());
        System.out.println("A = " + Alice.getA());

        Bob Bob = new Bob(Alice.getP(), Alice.getG());
        System.out.println("B = " + Bob.getB());

        Alice.Key(Bob.getB());
        Bob.Key(Alice.getA());

    }

}
