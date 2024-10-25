class animal
{
    void eat(){
        System.out.println("Aninmals eat animals");
    }
}
class lion extends animal{
    void roar(){
        System.out.println("Lions roar");
    }
}
class babylion extends lion{
    void cry(){
        System.out.println("Baby lion is crying");
    }
}
class program{
    public static void main(String[] args) {
        babylion i=new babylion();
        i.eat();
        i.roar();
        i.cry();
    }
}