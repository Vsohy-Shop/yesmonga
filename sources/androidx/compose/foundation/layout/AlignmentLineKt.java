package androidx.compose.foundation.layout;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15531a;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15576j;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.C16504t;
import androidx.compose.p004ui.unit.C16506u;
import androidx.compose.runtime.C8547h2;
import java.util.Map;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nAlignmentLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,325:1\n135#2:326\n135#2:327\n*S KotlinDebug\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n*L\n75#1:326\n121#1:327\n*E\n"})
public final class AlignmentLineKt {
    /* renamed from: c */
    public static final C15564g0 m9710c(C15568h0 h0Var, C15531a aVar, float f, float f2, C15557e0 e0Var, long j) {
        long j2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C15568h0 h0Var2 = h0Var;
        float f3 = f;
        float f4 = f2;
        if (m9711d(aVar)) {
            j2 = C16476b.m74351e(j, 0, 0, 0, 0, 11, (Object) null);
        } else {
            j2 = C16476b.m74351e(j, 0, 0, 0, 0, 14, (Object) null);
        }
        C15611w0 t0 = e0Var.mo44324t0(j2);
        C15531a aVar2 = aVar;
        int A = t0.mo44325A(aVar);
        if (A == Integer.MIN_VALUE) {
            A = 0;
        }
        if (m9711d(aVar)) {
            i = t0.mo44468G0();
        } else {
            i = t0.mo44471K0();
        }
        if (m9711d(aVar)) {
            i2 = C16476b.m74361o(j);
        } else {
            i2 = C16476b.m74362p(j);
        }
        C16483g.C16484a aVar3 = C16483g.f40871b;
        if (!C16483g.m74440e0(f3, aVar3.mo47828e())) {
            i3 = h0Var.mo7429n2(f3);
        } else {
            i3 = 0;
        }
        int i7 = i2 - i;
        int I = C11479u.m44334I(i3 - A, 0, i7);
        if (!C16483g.m74440e0(f4, aVar3.mo47828e())) {
            i4 = h0Var.mo7429n2(f4);
        } else {
            i4 = 0;
        }
        int I2 = C11479u.m44334I((i4 - i) + A, 0, i7 - I);
        if (m9711d(aVar)) {
            i5 = t0.mo44471K0();
        } else {
            i5 = Math.max(t0.mo44471K0() + I + I2, C16476b.m74364r(j));
        }
        int i8 = i5;
        if (m9711d(aVar)) {
            i6 = Math.max(t0.mo44468G0() + I + I2, C16476b.m74363q(j));
        } else {
            i6 = t0.mo44468G0();
        }
        int i9 = i6;
        return C15568h0.m69206r2(h0Var, i8, i9, (Map) null, new AlignmentLineKt$alignmentLineOffsetMeasure$1(aVar, f, I, i8, I2, t0, i9), 4, (Object) null);
    }

    /* renamed from: d */
    public static final boolean m9711d(C15531a aVar) {
        return aVar instanceof C15576j;
    }

    @C8547h2
    @C12579k
    /* renamed from: e */
    public static final C8767m m9712e(@C12579k C8767m mVar, @C12579k C15531a aVar, float f, float f2) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "$this$paddingFrom");
        Intrinsics.checkNotNullParameter(aVar, "alignmentLine");
        if (InspectableValueKt.m71063e()) {
            lVar = new C2258x29bde906(aVar, f, f2);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return mVar.mo17224k3(new C2340b(aVar, f, f2, lVar, (DefaultConstructorMarker) null));
    }

    /* renamed from: f */
    public static /* synthetic */ C8767m m9713f(C8767m mVar, C15531a aVar, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = C16483g.f40871b.mo47828e();
        }
        if ((i & 4) != 0) {
            f2 = C16483g.f40871b.mo47828e();
        }
        return m9712e(mVar, aVar, f, f2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: kotlin.jvm.functions.l<androidx.compose.ui.platform.v0, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-Y_r0B1c$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-Y_r0B1c$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8547h2
    @org.jetbrains.annotations.C12579k
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p004ui.C8767m m9714g(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.C8767m r9, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.layout.C15531a r10, long r11, long r13) {
        /*
            java.lang.String r0 = "$this$paddingFrom"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "alignmentLine"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            androidx.compose.foundation.layout.c r0 = new androidx.compose.foundation.layout.c
            boolean r1 = androidx.compose.p004ui.platform.InspectableValueKt.m71063e()
            if (r1 == 0) goto L_0x001c
            androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-Y_r0B1c$$inlined$debugInspectorInfo$1 r1 = new androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-Y_r0B1c$$inlined$debugInspectorInfo$1
            r2 = r1
            r3 = r10
            r4 = r11
            r6 = r13
            r2.<init>(r3, r4, r6)
            goto L_0x0020
        L_0x001c:
            kotlin.jvm.functions.l r1 = androidx.compose.p004ui.platform.InspectableValueKt.m71060b()
        L_0x0020:
            r7 = r1
            r8 = 0
            r1 = r0
            r2 = r10
            r3 = r11
            r5 = r13
            r1.<init>(r2, r3, r5, r7, r8)
            androidx.compose.ui.m r9 = r9.mo17224k3(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.AlignmentLineKt.m9714g(androidx.compose.ui.m, androidx.compose.ui.layout.a, long, long):androidx.compose.ui.m");
    }

    /* renamed from: h */
    public static /* synthetic */ C8767m m9715h(C8767m mVar, C15531a aVar, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j = C16504t.f40903b.mo47903b();
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = C16504t.f40903b.mo47903b();
        }
        return m9714g(mVar, aVar, j3, j2);
    }

    @C8547h2
    @C12579k
    /* renamed from: i */
    public static final C8767m m9716i(@C12579k C8767m mVar, float f, float f2) {
        C8767m mVar2;
        C8767m mVar3;
        Intrinsics.checkNotNullParameter(mVar, "$this$paddingFromBaseline");
        C16483g.C16484a aVar = C16483g.f40871b;
        if (!C16483g.m74440e0(f, aVar.mo47828e())) {
            mVar2 = m9713f(C8767m.f23478j, androidx.compose.p004ui.layout.AlignmentLineKt.m68885a(), f, 0.0f, 4, (Object) null);
        } else {
            mVar2 = C8767m.f23478j;
        }
        C8767m k3 = mVar.mo17224k3(mVar2);
        if (!C16483g.m74440e0(f2, aVar.mo47828e())) {
            mVar3 = m9713f(C8767m.f23478j, androidx.compose.p004ui.layout.AlignmentLineKt.m68886b(), 0.0f, f2, 2, (Object) null);
        } else {
            mVar3 = C8767m.f23478j;
        }
        return k3.mo17224k3(mVar3);
    }

    /* renamed from: j */
    public static /* synthetic */ C8767m m9717j(C8767m mVar, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C16483g.f40871b.mo47828e();
        }
        if ((i & 2) != 0) {
            f2 = C16483g.f40871b.mo47828e();
        }
        return m9716i(mVar, f, f2);
    }

    @C8547h2
    @C12579k
    /* renamed from: k */
    public static final C8767m m9718k(@C12579k C8767m mVar, long j, long j2) {
        C8767m mVar2;
        C8767m mVar3;
        Intrinsics.checkNotNullParameter(mVar, "$this$paddingFromBaseline");
        if (!C16506u.m74718s(j)) {
            mVar2 = m9715h(C8767m.f23478j, androidx.compose.p004ui.layout.AlignmentLineKt.m68885a(), j, 0, 4, (Object) null);
        } else {
            mVar2 = C8767m.f23478j;
        }
        C8767m k3 = mVar.mo17224k3(mVar2);
        if (!C16506u.m74718s(j2)) {
            mVar3 = m9715h(C8767m.f23478j, androidx.compose.p004ui.layout.AlignmentLineKt.m68886b(), 0, j2, 2, (Object) null);
        } else {
            mVar3 = C8767m.f23478j;
        }
        return k3.mo17224k3(mVar3);
    }

    /* renamed from: l */
    public static /* synthetic */ C8767m m9719l(C8767m mVar, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = C16504t.f40903b.mo47903b();
        }
        if ((i & 2) != 0) {
            j2 = C16504t.f40903b.mo47903b();
        }
        return m9718k(mVar, j, j2);
    }
}
