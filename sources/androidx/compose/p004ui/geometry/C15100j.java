package androidx.compose.p004ui.geometry;

import androidx.compose.p004ui.util.C16515d;
import androidx.compose.runtime.C8547h2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.geometry.j */
public final class C15100j {
    @C8547h2
    @C12579k
    /* renamed from: a */
    public static final C15098i m64954a(long j, long j2) {
        return new C15098i(C15094f.m64880p(j), C15094f.m64882r(j), C15094f.m64880p(j2), C15094f.m64882r(j2));
    }

    @C8547h2
    @C12579k
    /* renamed from: b */
    public static final C15098i m64955b(long j, float f) {
        return new C15098i(C15094f.m64880p(j) - f, C15094f.m64882r(j) - f, C15094f.m64880p(j) + f, C15094f.m64882r(j) + f);
    }

    @C8547h2
    @C12579k
    /* renamed from: c */
    public static final C15098i m64956c(long j, long j2) {
        return new C15098i(C15094f.m64880p(j), C15094f.m64882r(j), C15094f.m64880p(j) + C15104m.m65023t(j2), C15094f.m64882r(j) + C15104m.m65016m(j2));
    }

    @C8547h2
    @C12579k
    /* renamed from: d */
    public static final C15098i m64957d(@C12579k C15098i iVar, @C12579k C15098i iVar2, float f) {
        Intrinsics.checkNotNullParameter(iVar, "start");
        Intrinsics.checkNotNullParameter(iVar2, "stop");
        return new C15098i(C16515d.m74781a(iVar.mo42279t(), iVar2.mo42279t(), f), C16515d.m74781a(iVar.mo42249B(), iVar2.mo42249B(), f), C16515d.m74781a(iVar.mo42283x(), iVar2.mo42283x(), f), C16515d.m74781a(iVar.mo42271j(), iVar2.mo42271j(), f));
    }
}
