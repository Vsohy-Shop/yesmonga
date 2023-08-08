package kotlin.jvm.internal;

import kotlin.C11665v0;
import kotlin.reflect.C11494d;
import kotlin.reflect.C11499h;

public class PropertyReference0Impl extends PropertyReference0 {
    public PropertyReference0Impl(C11499h hVar, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((C11362r) hVar).mo22787o(), str, str2, (hVar instanceof C11494d) ^ true ? 1 : 0);
    }

    public Object get() {
        return getGetter().call(new Object[0]);
    }

    @C11665v0(version = "1.4")
    public PropertyReference0Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    @C11665v0(version = "1.4")
    public PropertyReference0Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
