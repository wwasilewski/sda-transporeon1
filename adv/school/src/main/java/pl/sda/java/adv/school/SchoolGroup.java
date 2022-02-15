package pl.sda.java.adv.school;

public class SchoolGroup {
    private byte schoolYear;
    private char classCode;

    public SchoolGroup(byte schoolYear, char classCode) {
        this.schoolYear = schoolYear;
        this.classCode = classCode;
    }

    public byte getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(byte schoolYear) {
        this.schoolYear = schoolYear;
    }

    public char getClassCode() {
        return classCode;
    }

    public void setClassCode(char classCode) {
        this.classCode = classCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SchoolGroup that = (SchoolGroup) o;

        if (schoolYear != that.schoolYear) return false;
        return classCode == that.classCode;
    }

    @Override
    public int hashCode() {
        int result = schoolYear;
        result = 31 * result + (int) classCode;
        return result;
    }
}
