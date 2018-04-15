package Generator.Generators;

import Generator.Generator;
import io.dummymaker.generator.IGenerator;

import java.util.Random;

public class UserIdGenerator implements IGenerator<Integer> {
    @Override
    public Integer generate() {
        int maxNumber = 2000000;

        Random r = new Random();
        return r.nextInt(maxNumber)+1;
    }
}
