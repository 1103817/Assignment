/*
    Author : (Abdul Basit)
*/
public class StudentArray {
    private String[] studentArray = new String[12];
    private int currentIndex;

    void insert(String value){
        if (currentIndex < studentArray.length){
            studentArray[currentIndex] = value;
            currentIndex++;
            System.out.println("Insertion done successfully");
        }
        else{
            System.out.println("Not inserted successfully");
        }
    }
    int find(String searchValue){
        int index = -1;
        for(int i=0; i < studentArray.length; i++){
            if (studentArray[i] == searchValue){
                index = i;
                break;
            }
        }
        return index;
    }

    void delete(int index){
        for(int i=0; i<studentArray.length - 1; i++){
            if (i >= index){
                studentArray[i] = studentArray[i+1];
            }
        }
        studentArray[studentArray.length - 1] = null;
        currentIndex--; 
    }
    void treverse(){
        for(int i=0; i<currentIndex; i++){
            System.out.println(i+1 + " : " + studentArray[i]);
        }
    }

}
