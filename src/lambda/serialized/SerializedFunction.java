package lambda.serialized;

import java.io.Serializable;
@FunctionalInterface
public interface SerializedFunction<R>{
    void accept(R r);
}
