package com.wisely.ch9_2.batch;

import com.wisely.ch9_2.domain.Person;
import org.springframework.batch.item.validator.ValidatingItemProcessor;
import org.springframework.batch.item.validator.ValidationException;

public class CsvItemProcessor extends ValidatingItemProcessor<Person> {
    
    @Override
    public Person process(Person item) throws ValidationException {
        super.process(item);
    
        if(item.getNation().equals("汉族")) {
            item.setNation("01");
        } else {
            item.setNation("02");
        }
        return item;
    }
    
    
}
