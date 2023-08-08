package kotlin.jvm.internal;

import kotlin.C11665v0;
import kotlin.reflect.C11492c;
import kotlin.reflect.C11518q;

public abstract class PropertyReference2 extends PropertyReference implements C11518q {
    public PropertyReference2() {
    }

    @C11665v0(version = "1.1")
    /* renamed from: N5 */
    public Object mo22736N5(Object obj, Object obj2) {
        return ((C11518q) getReflected()).mo22736N5(obj, obj2);
    }

    public C11492c computeReflected() {
        return C11342l0.m43565v(this);
    }

    public Object invoke(Object obj, Object obj2) {
        return mo22737B5(obj, obj2);
    }

    @C11665v0(version = "1.4")
    public PropertyReference2(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    public C11518q.C11519a getGetter() {
        return ((C11518q) getReflected()).getGetter();
    }
}
