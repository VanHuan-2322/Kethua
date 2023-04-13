public class People {
    //    Tạo thuộc tính
    private String name;
    private boolean gender;
    private int age;

    //    Phương thức không tham số
    public People() {
        this.name = "Tên mặc định ";
        this.gender = false;
        this.age = 0;
    }

    //    Phương thức có tham số
    public People(String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    //getter và setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("People eating....");
    }

    public void sleep() {
        System.out.println("people sleeping.....");
    }

    //     ghi đè phương thức to String trả về chuỗi kí tự
    @Override
    public String toString() {
        return "A people with name: " + getName()
                + ", age: "
                + getAge()
                + " and gender: "
                + (isGender() ? "Nam" : "Nữ");
    }
}
