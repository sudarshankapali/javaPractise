public class Main {
    public static void main(String[] args) {
        //this will be created on the string pool
        String name = "Sudarshan";
        name += "kapali";
        System.out.println(name);

        StringBuffer name1 = new StringBuffer("sudarshan");
        name1.append(" kapali");

        System.out.println(name1);
    }
}