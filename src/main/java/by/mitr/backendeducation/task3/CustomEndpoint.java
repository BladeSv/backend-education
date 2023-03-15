package by.mitr.backendeducation.task3;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Endpoint(id = "customdata")
public class CustomEndpoint {
    @ReadOperation
    public CustomData getData() {
        return new CustomData("test", 5);
    }
}
class CustomData{
    private String text;
    private int number;

    public CustomData(String text, int number) {
        this.text = text;
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
