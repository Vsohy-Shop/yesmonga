package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.m2 */
public final class C8587m2<T> implements C8578k2<T> {

    /* renamed from: a */
    public final T f23017a;

    public C8587m2(T t) {
        this.f23017a = t;
    }

    /* renamed from: g */
    public static /* synthetic */ C8587m2 m31110g(C8587m2 m2Var, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = m2Var.getValue();
        }
        return m2Var.mo16261e(obj);
    }

    @C12579k
    /* renamed from: e */
    public final C8587m2<T> mo16261e(T t) {
        return new C8587m2<>(t);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8587m2) && Intrinsics.areEqual(getValue(), ((C8587m2) obj).getValue());
    }

    public T getValue() {
        return this.f23017a;
    }

    public int hashCode() {
        if (getValue() == null) {
            return 0;
        }
        return getValue().hashCode();
    }

    /* renamed from: j */
    public final T mo16264j() {
        return getValue();
    }

    @C12579k
    public String toString() {
        return "StaticValueHolder(value=" + getValue() + ')';
    }
}
