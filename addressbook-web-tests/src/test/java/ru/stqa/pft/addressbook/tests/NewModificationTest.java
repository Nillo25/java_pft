package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class NewModificationTest extends TestBase {

  @Test
  public void testGroupModification(){
    app.getGroupHelper().selectGroupe();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("test11", "test22", "test33"));
    app.getGroupHelper().submitGroupModification();
  }
}

