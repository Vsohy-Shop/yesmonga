package kotlin.jvm.internal;

import kotlin.C11665v0;
import kotlin.reflect.C11494d;
import kotlin.reflect.C11499h;

public class MutablePropertyReference1Impl extends MutablePropertyReference1 {
    public MutablePropertyReference1Impl(C11499h hVar, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((C11362r) hVar).mo22787o(), str, str2, (hVar instanceof C11494d) ^ true ? 1 : 0);
    }

    /* renamed from: K1 */
    public void mo22735K1(Object obj, Object obj2) {
        getSetter().call(obj, obj2);
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    @C11665v0(version = "1.4")
    public MutablePropertyReference1Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    @C11665v0(version = "1.4")
    public MutablePropertyReference1Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
