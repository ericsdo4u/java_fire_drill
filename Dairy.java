import InvalidPinException.InvalidPinException;

import java.util.ArrayList;

public class Dairy {

    private String userName;
    private String passWord;
    private boolean isLocked;
    private  ArrayList<Entry> entries;
    private int id = 0;

    public Dairy(String userName, String passWord){
        this.userName = userName;
        this.passWord = passWord;

        entries = new ArrayList<>();
    }

    public String getUserName(){
        return userName;
    }
    public String getPassWord() {
        return passWord;
    }
    public boolean isLocked() {
        return true;
    }
    public void unLockDairy(String passWord) {
        if (getPassWord().equals(passWord))
            this.isLocked = false;

    }
    public void lockDairy(){
        this.isLocked = true;
    }

    public int get_Id(){
        return this.id += 1;
    }
    public void createEntry(String titles, String body){
        Entry entry = new Entry(get_Id(), titles, body);
            entries.add(entry);
            id++;
    }
    public ArrayList<Entry> getNumberOfEntry() {
        return entries;
    }
    public void deleteEntry(int id) {
        for (int index = 0; index < entries.size(); index++) {
            Entry item = entries.get(index);
            if (item.getId() == id)
                entries.remove(item);
        }
    }

    public Entry findEntryById(int id) {
        for (Entry entry : entries) {
            if (entry.getId() == id)
                return entry;
        }
        throw new InvalidPinException("No matched id found");
    }

    public void updateEntry(int idNumber, String titles, String body) {
        Entry entry = findEntryById(idNumber);
        for(Entry entry1 :entries) {
             if(entry == entry1){
                 entry1.updateTitle(titles);
                 entry1.updateBody(body);
             }
        }
     //   throw new InvalidPinException("No matched id found");
    }
}