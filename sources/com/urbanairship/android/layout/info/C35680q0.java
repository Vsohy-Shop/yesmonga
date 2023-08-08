package com.urbanairship.android.layout.info;

import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.info.q0 */
public final class C35680q0 implements C35678p0 {

    /* renamed from: a */
    public final boolean f88198a;

    public C35680q0(boolean z) {
        this.f88198a = z;
    }

    /* renamed from: c */
    public static /* synthetic */ C35680q0 m147146c(C35680q0 q0Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = q0Var.isRequired();
        }
        return q0Var.mo106830b(z);
    }

    /* renamed from: a */
    public final boolean mo106829a() {
        return isRequired();
    }

    @C12579k
    /* renamed from: b */
    public final C35680q0 mo106830b(boolean z) {
        return new C35680q0(z);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35680q0) && isRequired() == ((C35680q0) obj).isRequired();
    }

    public int hashCode() {
        boolean isRequired = isRequired();
        if (isRequired) {
            return 1;
        }
        return isRequired ? 1 : 0;
    }

    public boolean isRequired() {
        return this.f88198a;
    }

    @C12579k
    public String toString() {
        return "ValidatableInfo(isRequired=" + isRequired() + ')';
    }
}
