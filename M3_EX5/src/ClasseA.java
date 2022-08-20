public class ClasseA {
    public String name;
    protected int age;
    private float height;

    public ClasseA(String name, int age, float height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
