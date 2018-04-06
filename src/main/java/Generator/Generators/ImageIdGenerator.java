package Generator.Generators;

import io.dummymaker.generator.IGenerator;

import java.util.Random;

public class ImageIdGenerator implements IGenerator<Integer> {
    @Override
    public Integer generate() {
        int maxNumber = 20;

        Random r = new Random();
        return r.nextInt(maxNumber)+1;
    }
}
