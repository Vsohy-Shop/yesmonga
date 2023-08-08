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
/* renamed from: androidx.compose.ui.j */
public final class C8764j extends C8760f {
    @C12579k

    /* renamed from: e */
    public final String f23469e;
    @C12580l

    /* renamed from: f */
    public final Object f23470f;
    @C12580l

    /* renamed from: g */
    public final Object f23471g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8764j(@C12579k String str, @C12580l Object obj, @C12580l Object obj2, @C12579k C11300l<? super C15983v0, C11079d2> lVar, @C12579k C11305q<? super C8767m, ? super C8592o, ? super Integer, ? extends C8767m> qVar) {
        super(lVar, qVar);
        Intrinsics.checkNotNullParameter(str, "fqName");
        Intrinsics.checkNotNullParameter(lVar, "inspectorInfo");
        Intrinsics.checkNotNullParameter(qVar, "factory");
        this.f23469e = str;
        this.f23470f = obj;
        this.f23471g = obj2;
    }

    public boolean equals(@C12580l Object obj) {
        if (obj instanceof C8764j) {
            C8764j jVar = (C8764j) obj;
            if (!Intrinsics.areEqual((Object) this.f23469e, (Object) jVar.f23469e) || !Intrinsics.areEqual(this.f23470f, jVar.f23470f) || !Intrinsics.areEqual(this.f23471g, jVar.f23471g)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f23469e.hashCode() * 31;
        Object obj = this.f23470f;
        int i2 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        Object obj2 = this.f23471g;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return i3 + i2;
    }

    @C12579k
    /* renamed from: s */
    public final String mo17211s() {
        return this.f23469e;
    }

    @C12580l
    /* renamed from: t */
    public final Object mo17212t() {
        return this.f23470f;
    }

    @C12580l
    /* renamed from: u */
    public final Object mo17213u() {
        return this.f23471g;
    }
}
