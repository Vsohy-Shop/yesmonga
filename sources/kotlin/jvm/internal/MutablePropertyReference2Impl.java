package kotlin.jvm.internal;

import kotlin.C11665v0;
import kotlin.reflect.C11494d;
import kotlin.reflect.C11499h;

public class MutablePropertyReference2Impl extends MutablePropertyReference2 {
    public MutablePropertyReference2Impl(C11499h hVar, String str, String str2) {
        super(((C11362r) hVar).mo22787o(), str, str2, (hVar instanceof C11494d) ^ true ? 1 : 0);
    }

    /* renamed from: B5 */
    public Object mo22737B5(Object obj, Object obj2) {
        return getGetter().call(obj, obj2);
    }

    /* renamed from: t3 */
    public void mo22738t3(Object obj, Object obj2, Object obj3) {
        getSetter().call(obj, obj2, obj3);
    }

    @C11665v0(version = "1.4")
    public MutablePropertyReference2Impl(Class cls, String str, String str2, int i) {
        super(cls, str, str2, i);
    }
}
