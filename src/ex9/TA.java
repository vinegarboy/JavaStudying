package ex9;

public class TA extends Student{
    private String subject,extension;
    public static void main(String[] args){
        TA t = new TA("123456","Test Name","Japan","000-0000-0000","çëåÍ","888-888-888");
        System.out.println("ã≥â»"+t.getSubject()+"\nì‡ê¸î‘çÜ"+t.getExtension());
        System.out.println(t.ToString());
        t.setExtension("777-777-777");
        t.setSubject("Java");
        System.out.println("ã≥â»"+t.getSubject()+"\nì‡ê¸î‘çÜ"+t.getExtension());
    }
    TA(String studentNumber, String name, String address, String tel,String subject ,String extension) {
        super(studentNumber, name, address, tel);
        this.subject = subject;
        this.extension = extension;
    }
    public String getSubject(){
        return subject;
    }
    public String getExtension(){
        return extension;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public void setExtension(String extension){
        this.extension = extension;
    }
    public String ToString(){
        return "a TA("+getStudentNumber()+", "+getName()+", "+getAddress()+", "+getTel()+", "+subject+", "+extension+")";
    }
}
