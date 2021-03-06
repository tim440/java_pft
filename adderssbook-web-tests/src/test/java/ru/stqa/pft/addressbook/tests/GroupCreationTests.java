package ru.stqa.pft.addressbook.tests;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.thoughtworks.xstream.XStream;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.Groups;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class GroupCreationTests extends TestBase {

  @DataProvider
  public Iterator<Object[]> validGroupsFromXml() throws IOException {
    List<Object[]> list = new ArrayList<Object[]>();
    BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/groups.xml")));
    String xml = "";

    String line = reader.readLine();
    while (line != null && !"".equals(line.trim())) {
      xml += line;
      //  String[] split = line.split(";"); // Для файлов CSV
      //list.add (new Object[] {new GroupData().withName(split[0]).withHeader(split[1]).withFooter(split[2])});
      line = reader.readLine();
    }
    XStream xStream = new XStream();
    xStream.processAnnotations(GroupData.class);
    List<GroupData> groups = (List<GroupData>) xStream.fromXML(xml);
    return groups.stream().map((g) -> new Object[]{g}).collect(Collectors.toList()).iterator();
  }
    @DataProvider
    public Iterator<Object[]> validGroupsFromJson() throws IOException {
      List<Object[]> list = new ArrayList<Object[]>();
      BufferedReader reader= new BufferedReader( new FileReader(new File("src/test/resources/groups.json")));
      String json ="";
      String line = reader.readLine();
      while (line != null && !"".equals(line.trim())){
        json +=line;
        //  String[] split = line.split(";"); // Для файлов CSV
        //list.add (new Object[] {new GroupData().withName(split[0]).withHeader(split[1]).withFooter(split[2])});
        line = reader.readLine();
      }
      Gson gson = new Gson();
      List<GroupData> groups = gson.fromJson(json, new TypeToken<List<GroupData>>(){}.getType());
      return groups.stream().map((g) -> new Object[] {g}).collect(Collectors.toList()).iterator();

  }

  @Test (dataProvider = "validGroupsFromJson")
  public void testGroupCreation(GroupData group) {


    int n = 1; // Количество создаваемых групп
    for (int i = 1; i <= n; i++) {

      app.goTo().groupPage();
      Groups before = app.group().all();

      app.group().create(group);
      assertThat(app.group().count(),equalTo( before.size() + 1));
      Groups after = app.group().all();

      assertThat(after, equalTo(
              before.withAdded(group.withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt()))));

    }
  }

  @Test
  public void testBadGroupCreation() {
    int n = 1; // Количество создаваемых групп
    for (int i = 1; i <= n; i++) {

      app.goTo().groupPage();
      Groups before = app.group().all();
      GroupData group = new GroupData().withName("test1'");
      app.group().create(group);
      assertThat(app.group().count(),equalTo( before.size()));
      Groups after = app.group().all();

      assertThat(after, equalTo(before));

    }
  }
}
