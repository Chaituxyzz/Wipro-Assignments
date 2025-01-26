package LibraryManagement;

import java.io.Serializable;

public class Member implements Serializable {
    private int memberId;
    private String name;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

  
    public String toString() {
        return "Member ID: " + memberId + ", Name: " + name;
    }
}
