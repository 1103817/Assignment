public class App {
    public static void main(String[] args) throws Exception {
        StudentArray studentArrayObj = new StudentArray();
        studentArrayObj.insert("Basit");
        studentArrayObj.insert("Majid");
        studentArrayObj.insert("Abdul");
        studentArrayObj.insert("Hameed");
        studentArrayObj.insert("Karim");
        studentArrayObj.insert("Imdad");
        
        studentArrayObj.treverse();
    }
}
