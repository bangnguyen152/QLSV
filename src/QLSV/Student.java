package QLSV;

public class Student {
    private String id;
    private String name;
    private int age;
    private String address;
    /* điểm trung bình của sinh viên */

    public Student() {
    }

    public Student(String id, String name, int age,
                   String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public void setAge(byte age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    void inTT(){
        System.out.println("---------------------------------------------");
        System.out.println("Mã SV: "+getId());
        System.out.println("Họ tên: "+getName());
        System.out.println("Tuổi: "+getAge());
        System.out.println("Địa chỉ: "+getAddress());

    }
}
