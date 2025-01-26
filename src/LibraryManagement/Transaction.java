package LibraryManagement;

import java.io.Serializable;
import java.time.LocalDate;

public class Transaction implements Serializable {
    private int bookId;
    private int memberId;
    private LocalDate issueDate;
    private LocalDate returnDate;

    public Transaction(int bookId, int memberId, LocalDate issueDate) {
        this.bookId = bookId;
        this.memberId = memberId;
        this.issueDate = issueDate;
        this.returnDate = null;
    }

    public int getBookId() {
        return bookId;
    }

    public int getMemberId() {
        return memberId;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Transaction (Book ID: " + bookId + ", Member ID: " + memberId + 
               ", Issue Date: " + issueDate + ", Return Date: " + (returnDate != null ? returnDate : "Not Returned") + ")";
    }
}
