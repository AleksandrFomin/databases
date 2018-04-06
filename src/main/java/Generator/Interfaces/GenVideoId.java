package Generator.Interfaces;

import Generator.Generators.VideoIdGenerator;
import io.dummymaker.annotation.PrimeGen;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@PrimeGen(VideoIdGenerator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface GenVideoId {
}
