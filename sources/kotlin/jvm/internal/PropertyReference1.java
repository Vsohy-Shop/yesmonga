package kotlin.jvm.internal;

import kotlin.C11665v0;
import kotlin.reflect.C11492c;
import kotlin.reflect.C11516p;

public abstract class PropertyReference1 extends PropertyReference implements C11516p {
    public PropertyReference1() {
    }

    public C11492c computeReflected() {
        return C11342l0.m43564u(this);
    }

    public Object invoke(Object obj) {
        return get(obj);
    }

    @C11665v0(version = "1.1")
    /* renamed from: l0 */
    public Object mo22734l0(Object obj) {
        return ((C11516p) getReflected()).mo22734l0(obj);
    }

    @C11665v0(version = "1.1")
    public PropertyReference1(Object obj) {
        super(obj);
    }

    public C11516p.C11517a getGetter() {
        return ((C11516p) getReflected()).getGetter();
    }

    @C11665v0(version = "1.4")
    public PropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
