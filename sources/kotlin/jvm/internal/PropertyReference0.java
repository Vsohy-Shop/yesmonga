package kotlin.jvm.internal;

import kotlin.C11665v0;
import kotlin.reflect.C11492c;
import kotlin.reflect.C11514o;

public abstract class PropertyReference0 extends PropertyReference implements C11514o {
    public PropertyReference0() {
    }

    public C11492c computeReflected() {
        return C11342l0.m43563t(this);
    }

    @C11665v0(version = "1.1")
    public Object getDelegate() {
        return ((C11514o) getReflected()).getDelegate();
    }

    public Object invoke() {
        return get();
    }

    @C11665v0(version = "1.1")
    public PropertyReference0(Object obj) {
        super(obj);
    }

    public C11514o.C11515a getGetter() {
        return ((C11514o) getReflected()).getGetter();
    }

    @C11665v0(version = "1.4")
    public PropertyReference0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
