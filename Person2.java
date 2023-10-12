class Person {
    String name;
    int age;
    String gander;
    String goal;


    public void printPerson(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(gander);
        System.out.println(goal);
    }
    public Person(String name,int age,String gander, String Goal){
        this.name="Jane Doe";
        this.age=30;
        this.gander="Female";
        this.goal="Hi, I'm name, a age year old gender.";
    }
    
    public String getGoal(){
        //System.out.println("My goal is: Live for the moment!");
        return this.goal;
    }
}
