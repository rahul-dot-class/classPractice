class MetaObjectCreation {

    public static void main(String[] args) {
        Class c = Class.forName("Point");
        System.err.println(c.getName());

        Object o = c.newInstance();
        System.err.println(o);
    }

}

