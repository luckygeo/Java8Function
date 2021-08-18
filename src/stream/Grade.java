package stream;

/**
 * @author: i
 * @createDate: 2021/8/13
 * @version: 1.0
 */
public class Grade {

    private String subject;
    private String grade;

    private String book;

    public Grade(String subject, String grade, String book) {
        this.subject = subject;
        this.grade = grade;
        this.book = book;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }
}
