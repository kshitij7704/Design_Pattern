class Orignator {
    private String content;

    public Orignator(String content) {
        this.content = content;
    }

    public void write(String text) {
        this.content += text;
    }

    public String getContent() {
        return this.content;
    }

    public Memento createMemento() {
        return new Memento(this.content);
    }

    public void restoreFromMemento(Memento memento) {
        this.content = memento.getSavedContent();
    }
}