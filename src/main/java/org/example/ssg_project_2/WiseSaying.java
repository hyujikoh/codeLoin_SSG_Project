package org.example.ssg_project_2;

public class WiseSaying {
    int id;
    String content;
    String author;

    public WiseSaying(int i, String content, String author) {
    }

    @Override
    public String toString() {
        return "WiseSaying{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
