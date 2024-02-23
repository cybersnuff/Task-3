package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class Timer {

    //    @Autowired
//    @Qualifier("animalsCage")
//    private AnimalsCage animalsCage;
    private Long nanoTime = System.nanoTime();


    public Long getTime() {
        return nanoTime;
    }
}
