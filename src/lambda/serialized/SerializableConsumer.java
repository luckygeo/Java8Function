package lambda.serialized;

import java.io.Serializable;

public interface SerializableConsumer<T> extends Serializable {
    void accept(T t);
}
