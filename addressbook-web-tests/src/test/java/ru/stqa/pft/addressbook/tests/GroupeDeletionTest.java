package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupeDeletionTest extends TestBase {


  @Test
  public void testGroupeDeletion() throws Exception {
    app.getGroupHelper().selectGroupe();
    app.getGroupHelper().deleteSelectedGroupe();
    app.getGroupHelper().reternGroupPage();
    app.loggoutPage();
  }


}
