package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16489j;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8547h2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.layout.n */
public final class C15585n implements C15568h0, C16479d {
    @C12579k

    /* renamed from: a */
    public final LayoutDirection f38736a;

    /* renamed from: b */
    public final /* synthetic */ C16479d f38737b;

    public C15585n(@C12579k C16479d dVar, @C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.f38736a = layoutDirection;
        this.f38737b = dVar;
    }

    @C8547h2
    /* renamed from: C2 */
    public float mo7415C2(long j) {
        return this.f38737b.mo7415C2(j);
    }

    @C8547h2
    /* renamed from: L */
    public float mo7416L(int i) {
        return this.f38737b.mo7416L(i);
    }

    @C8547h2
    @C12579k
    /* renamed from: L4 */
    public C15098i mo7417L4(@C12579k C16489j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return this.f38737b.mo7417L4(jVar);
    }

    @C8547h2
    /* renamed from: M */
    public float mo7418M(float f) {
        return this.f38737b.mo7418M(f);
    }

    /* renamed from: R4 */
    public float mo7419R4() {
        return this.f38737b.mo7419R4();
    }

    @C8547h2
    /* renamed from: V */
    public long mo7420V(long j) {
        return this.f38737b.mo7420V(j);
    }

    @C8547h2
    /* renamed from: g5 */
    public float mo7425g5(float f) {
        return this.f38737b.mo7425g5(f);
    }

    public float getDensity() {
        return this.f38737b.getDensity();
    }

    @C12579k
    public LayoutDirection getLayoutDirection() {
        return this.f38736a;
    }

    @C8547h2
    /* renamed from: m */
    public long mo7427m(float f) {
        return this.f38737b.mo7427m(f);
    }

    @C8547h2
    /* renamed from: n */
    public long mo7428n(long j) {
        return this.f38737b.mo7428n(j);
    }

    @C8547h2
    /* renamed from: n2 */
    public int mo7429n2(float f) {
        return this.f38737b.mo7429n2(f);
    }

    @C8547h2
    /* renamed from: q */
    public float mo7430q(long j) {
        return this.f38737b.mo7430q(j);
    }

    @C8547h2
    /* renamed from: t */
    public long mo7431t(int i) {
        return this.f38737b.mo7431t(i);
    }

    @C8547h2
    /* renamed from: u */
    public long mo7432u(float f) {
        return this.f38737b.mo7432u(f);
    }

    @C8547h2
    /* renamed from: u5 */
    public int mo7433u5(long j) {
        return this.f38737b.mo7433u5(j);
    }
}
