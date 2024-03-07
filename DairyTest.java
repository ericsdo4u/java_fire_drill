import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DairyTest {
    private Dairy myDairy;
    @BeforeEach
    @Test
    public void testMyDairyNameValidity(){
        myDairy = new Dairy("ddon", "1234");
        assertEquals("ddon", myDairy.getUserName());
    }
    @Test
    public void testMyDairyPinValidy(){
        assertEquals("1234", myDairy.getPassWord());
    }
    @Test
    public void testMyDairyIsLocked() {
        assertTrue(myDairy.isLocked());
    }
    @Test
    public void testMyDairyEntry() {
        myDairy.createEntry("yesterday", "My system died while i was working on my assignmnt and no light");
        assertEquals(1, myDairy.getNumberOfEntry().size());
    }
    @Test
    public void testMyDairyEntryTwoItem() {
        myDairy.createEntry("yesterday", "My system died while i was working on my assignmnt and no light");
        myDairy.createEntry("yesterday", "I used the time for industrial science project");
        assertEquals(2, myDairy.getNumberOfEntry().size());
    }
    @Test
    public void testMyDairyEntryAddTwoItem_AndRemoveOne() {
        myDairy.createEntry("yesterday", "My system died while i was working on my assignmnt and no light");
        myDairy.createEntry("yesterday", "I used the time for industrial science project");
        myDairy.deleteEntry(1);
        assertEquals(1, myDairy.getNumberOfEntry().size());
    }
    @Test
    public void testMyDairyEntryThreeItem_AndRemoveTwo() {
        myDairy.createEntry("yesterday", "My system died while i was working on my assignmnt and no light");
        myDairy.createEntry("yesterday", "I used the time for industrial science project");
        myDairy.createEntry("yesterday", "My system died while i was working on my assignmnt and no light");
        myDairy.deleteEntry(0);
        assertEquals(2, myDairy.getNumberOfEntry().size());
    }
    @Test
    public void testMyDairyEntry_FindEntryById() {
        myDairy.createEntry("yesterday", "My system died while i was working on my assignmnt and no light");
        Entry entry = myDairy.findEntryById(1);
        assertEquals(entry, myDairy.getNumberOfEntry().get(0));
    }
    @Test
    public void testMyDairyEntryAddTwo_FindEntryByIdInIndexOne() {
        myDairy.createEntry("yesterday", "My system died while i was working on my assignmnt and no light");
        myDairy.createEntry("yesterday", "My system died while i was working on my assignmnt and no light");
        Entry entry = myDairy.findEntryById(1);
        assertEquals(entry, myDairy.getNumberOfEntry().get(0));
    }

    @Test
    public void testMyDairyEntryThreeItem_UpdateEntry() {
        myDairy.createEntry("yesterday", "My system died while i was working on my assignmnt and no light");
        Entry entry = myDairy.findEntryById(1);
        System.out.println(entry.getId());
        myDairy.updateEntry(1, "Today", " Is a good day");
        assertEquals(entry, myDairy.getNumberOfEntry().get(0));
        //tester
    }
    @Test
    public void testMyDairyEntryIsLocked_AndRemoveOne() {
        myDairy.createEntry("yesterday", "My system died while i was working on my assignmnt and no light");
        myDairy.createEntry("yesterday", "I used the time for industrial science project");
        myDairy.lockDairy();
        assertTrue(myDairy.isLocked());
        myDairy.unLockDairy("1234");
        assertFalse(myDairy.isLocked());
        myDairy.deleteEntry(1);
        assertEquals(1, myDairy.getNumberOfEntry().size());
    }


}