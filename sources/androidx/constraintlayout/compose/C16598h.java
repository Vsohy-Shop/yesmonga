package androidx.constraintlayout.compose;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15605u0;
import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.platform.C15988w0;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.runtime.C8585m0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.constraintlayout.compose.h */
public final class C16598h extends C15988w0 implements C15605u0, C16600i {
    @C12579k

    /* renamed from: d */
    public final String f41247d;
    @C12579k

    /* renamed from: e */
    public final String f41248e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16598h(@C12579k String str, @C12579k String str2, @C12579k C11300l<? super C15983v0, C11079d2> lVar) {
        super(lVar);
        Intrinsics.checkNotNullParameter(str, "constraintLayoutTag");
        Intrinsics.checkNotNullParameter(str2, "constraintLayoutId");
        Intrinsics.checkNotNullParameter(lVar, "inspectorInfo");
        this.f41247d = str;
        this.f41248e = str2;
    }

    /* renamed from: A */
    public boolean mo17001A(@C12579k C11300l<? super C8767m.C8770c, Boolean> lVar) {
        return C15605u0.C15606a.m69375a(this, lVar);
    }

    @C12580l
    /* renamed from: N */
    public Object mo6431N(@C12579k C16479d dVar, @C12580l Object obj) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return this;
    }

    /* renamed from: T */
    public boolean mo17002T(@C12579k C11300l<? super C8767m.C8770c, Boolean> lVar) {
        return C15605u0.C15606a.m69376b(this, lVar);
    }

    /* renamed from: Z */
    public <R> R mo17003Z(R r, @C12579k C11304p<? super C8767m.C8770c, ? super R, ? extends R> pVar) {
        return C15605u0.C15606a.m69378d(this, r, pVar);
    }

    @C12579k
    /* renamed from: a */
    public String mo48513a() {
        return this.f41248e;
    }

    public boolean equals(@C12580l Object obj) {
        C16598h hVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C16598h) {
            hVar = (C16598h) obj;
        } else {
            hVar = null;
        }
        if (hVar == null) {
            return false;
        }
        return Intrinsics.areEqual((Object) mo48516m(), (Object) hVar.mo48516m());
    }

    public int hashCode() {
        return mo48516m().hashCode();
    }

    @C12579k
    /* renamed from: k3 */
    public C8767m mo17224k3(@C12579k C8767m mVar) {
        return C15605u0.C15606a.m69379e(this, mVar);
    }

    @C12579k
    /* renamed from: m */
    public String mo48516m() {
        return this.f41247d;
    }

    @C12579k
    public String toString() {
        return "ConstraintLayoutTag(id=" + mo48516m() + ')';
    }

    /* renamed from: w */
    public <R> R mo17009w(R r, @C12579k C11304p<? super R, ? super C8767m.C8770c, ? extends R> pVar) {
        return C15605u0.C15606a.m69377c(this, r, pVar);
    }
}
