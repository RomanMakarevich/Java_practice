package java_practic.lectures.lecture_24.task_4;

public class Food {
    private String kind;
    private String word;

    public Food(String kind, String word) {
        this.kind = kind;
        this.word = word;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Food{");
        sb.append("kind='").append(kind).append('\'');
        sb.append(", word='").append(word).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
