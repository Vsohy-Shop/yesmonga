package kotlin.jvm.internal;

import kotlin.C11665v0;
import kotlin.reflect.C11502j;

public abstract class MutablePropertyReference extends PropertyReference implements C11502j {
    public MutablePropertyReference() {
    }

    @C11665v0(version = "1.1")
    public MutablePropertyReference(Object obj) {
        super(obj);
    }

    @C11665v0(version = "1.4")
    public MutablePropertyReference(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
