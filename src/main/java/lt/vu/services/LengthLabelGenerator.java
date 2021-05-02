package lt.vu.services;

import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import java.util.Random;

@ApplicationScoped
public class LengthLabelGenerator implements Serializable {

    public String generateLabel(int characterCount) {
        if (characterCount < 50) {
            return "short!";
        } else if (characterCount < 200) {
            return "medium";
        } else {
            return "long";
        }
    }
}