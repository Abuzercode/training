package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {


    public String getName()
    {
        String text = "operations_combobox_General_item_two";
        String pattern = ".*_combobox_(.*?)_item_.*";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(text);
        if (m.find()) {
            System.out.println(m.group(1));
            return m.group(1);
        }
        return "";
    }
}
