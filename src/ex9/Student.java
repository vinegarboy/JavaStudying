package ex9;

public class Student {
    private String studentNumber,name,address,tel;

    public static void main(String[] args){
        Student st = new Student("123456","Test Name","Japan","000-0000-0000");
        System.out.println("�w�Дԍ�"+st.getStudentNumber()+"\n���O"+st.getName()+"\n�Z��"+st.getAddress()+"\n�d�b�ԍ�"+st.getTel());
        System.out.println(st.toString());
        st.setAddress("America");
        st.setName("Name Test");
        st.setTel("181-0008-0008");
        System.out.println(st.toString());
    }
    Student(String studentNumber,String name,String address,String tel){
        this.studentNumber = studentNumber;
        this.name = name;
        this.address = address;
        this.tel = tel;
    }
    public String getStudentNumber(){
        return studentNumber;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getTel(){
        return tel;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setTel(String tel){
        this.tel = tel;
    }
    public String toString(){
        return "a Student(�w�Дԍ�"+this.studentNumber+", ����"+this.name+", �Z��"+this.address+", �d�b�ԍ�"+this.tel+")";
    }
}
