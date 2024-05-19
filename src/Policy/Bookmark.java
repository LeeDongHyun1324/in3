package Policy;

public class Bookmark {
    private String bookmarkId; // 북마크 ID
    private String policyId; // 정책 ID

    // bookmarkId의 getter
    public String getBookmarkId() {
        return bookmarkId;
    }

    // bookmarkId의 setter
    public void setBookmarkId(String bookmarkId) {
        this.bookmarkId = bookmarkId;
    }

    // policyId의 getter
    public String getPolicyId() {
        return policyId;
    }

    // policyId의 setter
    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }
}