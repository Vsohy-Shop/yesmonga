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
/* renamed from: androidx.compose.ui.i */
public final class C8763i extends C8760f {
    @C12579k

    /* renamed from: e */
    public final String f23467e;
    @C12580l

    /* renamed from: f */
    public final Object f23468f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8763i(@C12579k String str, @C12580l Object obj, @C12579k C11300l<? super C15983v0, C11079d2> lVar, @C12579k C11305q<? super C8767m, ? super C8592o, ? super Integer, ? extends C8767m> qVar) {
        super(lVar, qVar);
        Intrinsics.checkNotNullParameter(str, "fqName");
        Intrinsics.checkNotNullParameter(lVar, "inspectorInfo");
        Intrinsics.checkNotNullParameter(qVar, "factory");
        this.f23467e = str;
        this.f23468f = obj;
    }

    public boolean equals(@C12580l Object obj) {
        if (obj instanceof C8763i) {
            C8763i iVar = (C8763i) obj;
            if (!Intrinsics.areEqual((Object) this.f23467e, (Object) iVar.f23467e) || !Intrinsics.areEqual(this.f23468f, iVar.f23468f)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f23467e.hashCode() * 31;
        Object obj = this.f23468f;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    @C12579k
    /* renamed from: s */
    public final String mo17207s() {
        return this.f23467e;
    }

    @C12580l
    /* renamed from: t */
    public final Object mo17208t() {
        return this.f23468f;
    }
}
