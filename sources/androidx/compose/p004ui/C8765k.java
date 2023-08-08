package androidx.compose.p004ui;

import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8592o;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
/* renamed from: androidx.compose.ui.k */
public final class C8765k extends C8760f {
    @C12579k

    /* renamed from: e */
    public final String f23472e;
    @C12580l

    /* renamed from: f */
    public final Object f23473f;
    @C12580l

    /* renamed from: g */
    public final Object f23474g;
    @C12580l

    /* renamed from: v */
    public final Object f23475v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8765k(@C12579k String str, @C12580l Object obj, @C12580l Object obj2, @C12580l Object obj3, @C12579k C11300l<? super C15983v0, C11079d2> lVar, @C12579k C11305q<? super C8767m, ? super C8592o, ? super Integer, ? extends C8767m> qVar) {
        super(lVar, qVar);
        Intrinsics.checkNotNullParameter(str, "fqName");
        Intrinsics.checkNotNullParameter(lVar, "inspectorInfo");
        Intrinsics.checkNotNullParameter(qVar, "factory");
        this.f23472e = str;
        this.f23473f = obj;
        this.f23474g = obj2;
        this.f23475v = obj3;
    }

    public boolean equals(@C12580l Object obj) {
        if (obj instanceof C8765k) {
            C8765k kVar = (C8765k) obj;
            if (!Intrinsics.areEqual((Object) this.f23472e, (Object) kVar.f23472e) || !Intrinsics.areEqual(this.f23473f, kVar.f23473f) || !Intrinsics.areEqual(this.f23474g, kVar.f23474g) || !Intrinsics.areEqual(this.f23475v, kVar.f23475v)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int hashCode = this.f23472e.hashCode() * 31;
        Object obj = this.f23473f;
        int i3 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        Object obj2 = this.f23474g;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Object obj3 = this.f23475v;
        if (obj3 != null) {
            i3 = obj3.hashCode();
        }
        return i5 + i3;
    }

    @C12579k
    /* renamed from: s */
    public final String mo17216s() {
        return this.f23472e;
    }

    @C12580l
    /* renamed from: t */
    public final Object mo17217t() {
        return this.f23473f;
    }

    @C12580l
    /* renamed from: u */
    public final Object mo17218u() {
        return this.f23474g;
    }

    @C12580l
    /* renamed from: v */
    public final Object mo17219v() {
        return this.f23475v;
    }
}
