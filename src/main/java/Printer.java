public class Printer {
    private int currentPaperLevel;
    private int filledPaperLevel;
    private int currentToner;
    private int filledToner;

    public Printer(int currentPaperLevel, int filledPaperLevel, int currentToner, int filledToner){
        this.currentPaperLevel = currentPaperLevel;
        this.filledPaperLevel = filledPaperLevel;
        this.currentToner = currentToner;
        this.filledToner = filledToner;
    }


    public int checkPaper() {
        return this.currentPaperLevel;
    }

    public int checkTonerLevel() {
        return this.currentToner;
    }


    public boolean print(int pages, int copies) {
        int totalPages = pages * copies;
        if (this.currentPaperLevel >= totalPages && this.currentToner >= totalPages) {
            this.currentPaperLevel -= totalPages;
            this.currentToner -= totalPages;
            System.out.println("Print Successful!");
            return true;
        } else {
            System.out.println("Not enough Paper!");
            return false;
        }
    }

    public int refillPaper() {
        return this.currentPaperLevel = this.filledPaperLevel;
    }
}
