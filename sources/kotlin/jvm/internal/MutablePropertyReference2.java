package kotlin.jvm.internal;

import kotlin.C11665v0;
import kotlin.reflect.C11492c;
import kotlin.reflect.C11508m;
import kotlin.reflect.C11518q;

public abstract class MutablePropertyReference2 extends MutablePropertyReference implements C11508m {
    public MutablePropertyReference2() {
    }

    @C11665v0(version = "1.1")
    /* renamed from: N5 */
    public Object mo22736N5(Object obj, Object obj2) {
        return ((C11508m) getReflected()).mo22736N5(obj, obj2);
    }

    public C11492c computeReflected() {
        return C11342l0.m43555l(this);
    }

    public Object invoke(Object obj, Object obj2) {
        return mo22737B5(obj, obj2);
    }

    @C11665v0(version = "1.4")
    public MutablePropertyReference2(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    public C11518q.C11519a getGetter() {
        return ((C11508m) getReflected()).getGetter();
    }

    public C11508m.C11509a getSetter() {
        return ((C11508m) getReflected()).getSetter();
    }
}
