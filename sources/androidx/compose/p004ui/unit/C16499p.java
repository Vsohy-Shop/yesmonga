package androidx.compose.p004ui.unit;

import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.util.C16515d;
import androidx.compose.runtime.C8547h2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.unit.p */
public final class C16499p {
    @C8547h2
    @C12579k
    /* renamed from: a */
    public static final C16497o m74644a(long j, long j2) {
        return new C16497o(C16494m.m74581m(j), C16494m.m74583o(j), C16494m.m74581m(j2), C16494m.m74583o(j2));
    }

    @C8547h2
    @C12579k
    /* renamed from: b */
    public static final C16497o m74645b(long j, long j2) {
        return new C16497o(C16494m.m74581m(j), C16494m.m74583o(j), C16494m.m74581m(j) + C16500q.m74662m(j2), C16494m.m74583o(j) + C16500q.m74659j(j2));
    }

    @C8547h2
    @C12579k
    /* renamed from: c */
    public static final C16497o m74646c(long j, int i) {
        return new C16497o(C16494m.m74581m(j) - i, C16494m.m74583o(j) - i, C16494m.m74581m(j) + i, C16494m.m74583o(j) + i);
    }

    @C8547h2
    @C12579k
    /* renamed from: d */
    public static final C16497o m74647d(@C12579k C16497o oVar, @C12579k C16497o oVar2, float f) {
        Intrinsics.checkNotNullParameter(oVar, "start");
        Intrinsics.checkNotNullParameter(oVar2, "stop");
        return new C16497o(C16515d.m74782b(oVar.mo47886t(), oVar2.mo47886t(), f), C16515d.m74782b(oVar.mo47858B(), oVar2.mo47858B(), f), C16515d.m74782b(oVar.mo47890x(), oVar2.mo47890x(), f), C16515d.m74782b(oVar.mo47878j(), oVar2.mo47878j(), f));
    }

    @C8547h2
    @C12579k
    /* renamed from: e */
    public static final C16497o m74648e(@C12579k C15098i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return new C16497o(C11409d.m43851L0(iVar.mo42279t()), C11409d.m43851L0(iVar.mo42249B()), C11409d.m43851L0(iVar.mo42283x()), C11409d.m43851L0(iVar.mo42271j()));
    }

    @C8547h2
    @C12579k
    /* renamed from: f */
    public static final C15098i m74649f(@C12579k C16497o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        return new C15098i((float) oVar.mo47886t(), (float) oVar.mo47858B(), (float) oVar.mo47890x(), (float) oVar.mo47878j());
    }
}
