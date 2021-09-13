import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private String group;

    public Student(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getAge(){
        return age;
    }



    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (obj instanceof Student){
            Student temp = (Student) obj;
            return this.age == temp.age && this.group == temp.group && this.name == temp.name;
        }
        else return false;
    }


    @Override
    public int hashCode(){
        final int prime = 31;
        int result = prime * Objects.hash(this.age, this.age, this.group);
        return result;
    }
}
