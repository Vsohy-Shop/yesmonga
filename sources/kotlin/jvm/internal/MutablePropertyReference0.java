package kotlin.jvm.internal;

import kotlin.C11665v0;
import kotlin.reflect.C11492c;
import kotlin.reflect.C11504k;
import kotlin.reflect.C11514o;

public abstract class MutablePropertyReference0 extends MutablePropertyReference implements C11504k {
    public MutablePropertyReference0() {
    }

    public C11492c computeReflected() {
        return C11342l0.m43553j(this);
    }

    @C11665v0(version = "1.1")
    public Object getDelegate() {
        return ((C11504k) getReflected()).getDelegate();
    }

    public Object invoke() {
        return get();
    }

    @C11665v0(version = "1.1")
    public MutablePropertyReference0(Object obj) {
        super(obj);
    }

    public C11514o.C11515a getGetter() {
        return ((C11504k) getReflected()).getGetter();
    }

    public C11504k.C11505a getSetter() {
        return ((C11504k) getReflected()).getSetter();
    }

    @C11665v0(version = "1.4")
    public MutablePropertyReference0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
