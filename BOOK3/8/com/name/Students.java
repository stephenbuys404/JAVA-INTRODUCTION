package name;

public class Students implements Comparable<Students>{
    private String studentFirstName;
    private String studentLastName;

    public Students(String studentFirstName, String studentLastName){
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    /**
     *
     * @param other
     * @return
     */
    @Override
    public int compareTo(Students other) {

        int compareResults = this.studentLastName
                             .compareTo(other.studentLastName);

        if(compareResults == 0){
            if(this.studentFirstName.chars().count() ==
               other.studentFirstName.chars().count()) {
                compareResults = 0;
                return compareResults;
            }
            else if(this.studentFirstName.chars().count() >
                    other.studentFirstName.chars().count()){
               compareResults = 1;
               return compareResults;
            }
            else{
                compareResults =  -1;
                return compareResults;
            }
        }
        else{
            return compareResults;
        }
    }
}