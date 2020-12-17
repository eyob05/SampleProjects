package edu.miu.cs.formatter;

import edu.miu.cs.model.Phone;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class PhoneFormatter implements Formatter<Phone>{
    @Override
    public Phone parse(String s, Locale locale) throws ParseException {
        String[] temp=s.split("-");
        Phone phone=new Phone();
        phone.setCode(temp[0]);
        phone.setPrefex(temp[1]);
        phone.setNumber(temp[2]);
        return phone;
    }

    @Override
    public String print(Phone phone, Locale locale) {
        return null;
    }
}
