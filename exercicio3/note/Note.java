package note;
public class Note {
    private String name;
    private double firstNote;
    private double secondNote;

    // Construct

    public Note(String name, double firstNote, double secondNote) {
        this.name = name;
        this.firstNote = firstNote;
        this.secondNote = secondNote;
    }

    // Get

    public String getName() {
        return name;
    }
   
    public double getFirstNote() {
        return firstNote;
    }

    public double getSecondNote() {
        return secondNote;
    }

    // Sett  

    public void setFirstNote(double firstNote) {
        this.firstNote = firstNote;
    }
  
    public void setSecondNote(double secondNote) {
        this.secondNote = secondNote;
    }

    public void setName(String name) {
        this.name = name;
    }

    
   
}
