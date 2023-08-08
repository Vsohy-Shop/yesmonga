package androidx.compose.material3;

import androidx.compose.p004ui.layout.C15599s0;
import androidx.compose.p004ui.layout.C15603u;
import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.platform.C15988w0;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.runtime.C8547h2;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8547h2
public final class SwipeAnchorsModifier extends C15988w0 implements C15603u, C15599s0 {
    @C12579k

    /* renamed from: d */
    public final C11300l<C16479d, C11079d2> f19744d;
    @C12579k

    /* renamed from: e */
    public final C11300l<C16500q, C11079d2> f19745e;

    /* renamed from: f */
    public float f19746f = -1.0f;

    /* renamed from: g */
    public float f19747g = -1.0f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeAnchorsModifier(@C12579k C11300l<? super C16479d, C11079d2> lVar, @C12579k C11300l<? super C16500q, C11079d2> lVar2, @C12579k C11300l<? super C15983v0, C11079d2> lVar3) {
        super(lVar3);
        Intrinsics.checkNotNullParameter(lVar, "onDensityChanged");
        Intrinsics.checkNotNullParameter(lVar2, "onSizeChanged");
        Intrinsics.checkNotNullParameter(lVar3, "inspectorInfo");
        this.f19744d = lVar;
        this.f19745e = lVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r1 == false) goto L_0x0029;
     */
    @org.jetbrains.annotations.C12579k
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.p004ui.layout.C15564g0 mo6430i(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.layout.C15568h0 r8, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.layout.C15557e0 r9, long r10) {
        /*
            r7 = this;
            java.lang.String r0 = "$this$measure"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "measurable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            float r0 = r8.getDensity()
            float r1 = r7.f19746f
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0018
            r0 = r1
            goto L_0x0019
        L_0x0018:
            r0 = r2
        L_0x0019:
            if (r0 == 0) goto L_0x0029
            float r0 = r8.mo7419R4()
            float r3 = r7.f19747g
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r1 = r2
        L_0x0027:
            if (r1 != 0) goto L_0x0046
        L_0x0029:
            kotlin.jvm.functions.l<androidx.compose.ui.unit.d, kotlin.d2> r0 = r7.f19744d
            float r1 = r8.getDensity()
            float r2 = r8.mo7419R4()
            androidx.compose.ui.unit.d r1 = androidx.compose.p004ui.unit.C16482f.m74433a(r1, r2)
            r0.invoke(r1)
            float r0 = r8.getDensity()
            r7.f19746f = r0
            float r0 = r8.mo7419R4()
            r7.f19747g = r0
        L_0x0046:
            androidx.compose.ui.layout.w0 r9 = r9.mo44324t0(r10)
            int r1 = r9.mo44471K0()
            int r2 = r9.mo44468G0()
            r3 = 0
            androidx.compose.material3.SwipeAnchorsModifier$measure$1 r4 = new androidx.compose.material3.SwipeAnchorsModifier$measure$1
            r4.<init>(r9)
            r5 = 4
            r6 = 0
            r0 = r8
            androidx.compose.ui.layout.g0 r8 = androidx.compose.p004ui.layout.C15568h0.m69206r2(r0, r1, r2, r3, r4, r5, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeAnchorsModifier.mo6430i(androidx.compose.ui.layout.h0, androidx.compose.ui.layout.e0, long):androidx.compose.ui.layout.g0");
    }

    /* renamed from: k */
    public void mo7337k(long j) {
        this.f19745e.invoke(C16500q.m74651b(j));
    }

    @C12579k
    public String toString() {
        return "SwipeAnchorsModifierImpl(updateDensity=" + this.f19744d + ", onSizeChanged=" + this.f19745e + ')';
    }
}
