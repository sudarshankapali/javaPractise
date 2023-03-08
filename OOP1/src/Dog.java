public  class Dog extends Animal{
    Dog(){
        System.out.println("Dog class constructor has been called");
    }

    @Override
    public void getname() {
        System.out.println("this is dog class");
    }


}
