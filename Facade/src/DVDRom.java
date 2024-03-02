public class DVDRom {
    private boolean data = false;
    public boolean hasData(){
        return data;
    }
    void Computer(){
        data = true;
    }
    void Power(){
        data = false;
    }
}
