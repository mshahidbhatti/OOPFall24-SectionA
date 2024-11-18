package ArrayList_revision;

public class TextClass {
    public static String longText="Text fields in Access web apps\n" +
            "Long Text    In Access web apps, the Long Text field can store up to 2^30-1 bytes, and is equivalent to the SQL Server data type of nvarchar(max). If you want, you can set a character limit to prevent your users from using the full capacity of the field. You can’t store Rich Text in Access web apps.\n" +
            "\n" +
            "Short Text    In Access web apps the Short Text field is set to store 255 characters by default, but you can adjust the Character Limit property all the way up to 4000 characters. Its SQL Server equivalent is nvarchar, with length from 1 to 4000.\n" +
            "\n" +
            "Learn more about data types for Access web apps.\n" +
            "\n" +
            "Default controls for Long Text and Short Text fields\n" +
            "In most cases, Access uses Text Box controls to display Short Text or Long Text fields. However, when you add a Long Text field to a view in an Access web app, Access creates a Multiline Textbox. When using a Multiline Textbox in the browser, you can press Enter to move to a new line in the textbox. If you’re in a datasheet, you’ll need to use the scrollbars to see anything below the first line.\n" +
            "\n" +
            "In Desktop databases, if a Long Text field is configured to show Rich Text, and you add that field to a form or report, Access automatically applies the Rich Text setting to the text box.";
}
