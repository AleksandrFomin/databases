package Generator.Interfaces;

import Generator.Generators.CommentIdGenerator;
import io.dummymaker.annotation.PrimeGen;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@PrimeGen(CommentIdGenerator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface GenCommentId {
}
