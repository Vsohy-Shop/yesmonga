package androidx.constraintlayout.compose;

import androidx.compose.p004ui.layout.C15598s;
import androidx.compose.runtime.C8547h2;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
/* renamed from: androidx.constraintlayout.compose.g */
public final class C16595g implements C15598s {
    @C12579k

    /* renamed from: a */
    public final C16591e f41238a;
    @C12579k

    /* renamed from: b */
    public final C11300l<ConstrainScope, C11079d2> f41239b;
    @C12579k

    /* renamed from: c */
    public final Object f41240c;

    public C16595g(@C12579k C16591e eVar, @C12579k C11300l<? super ConstrainScope, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(eVar, "ref");
        Intrinsics.checkNotNullParameter(lVar, "constrain");
        this.f41238a = eVar;
        this.f41239b = lVar;
        this.f41240c = eVar.mo48480k();
    }

    @C12579k
    /* renamed from: a */
    public final C11300l<ConstrainScope, C11079d2> mo48495a() {
        return this.f41239b;
    }

    @C12579k
    /* renamed from: b */
    public final C16591e mo48496b() {
        return this.f41238a;
    }

    public boolean equals(@C12580l Object obj) {
        if (obj instanceof C16595g) {
            C16595g gVar = (C16595g) obj;
            if (!Intrinsics.areEqual(this.f41238a.mo48480k(), gVar.f41238a.mo48480k()) || !Intrinsics.areEqual((Object) this.f41239b, (Object) gVar.f41239b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f41238a.mo48480k().hashCode() * 31) + this.f41239b.hashCode();
    }

    @C12579k
    /* renamed from: u */
    public Object mo44449u() {
        return this.f41240c;
    }
}
