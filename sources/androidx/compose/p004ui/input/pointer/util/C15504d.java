package androidx.compose.p004ui.input.pointer.util;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.pointer.util.VelocityTracker1D;
import androidx.compose.p004ui.unit.C16511x;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.input.pointer.util.d */
public final class C15504d {

    /* renamed from: d */
    public static final int f38560d = 8;
    @C12579k

    /* renamed from: a */
    public final VelocityTracker1D f38561a = new VelocityTracker1D(false, (VelocityTracker1D.Strategy) null, 3, (DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: b */
    public final VelocityTracker1D f38562b = new VelocityTracker1D(false, (VelocityTracker1D.Strategy) null, 3, (DefaultConstructorMarker) null);

    /* renamed from: c */
    public long f38563c = C15094f.f37256b.mo42248e();

    /* renamed from: a */
    public final void mo44157a(long j, long j2) {
        this.f38561a.mo44133a(j, C15094f.m64880p(j2));
        this.f38562b.mo44133a(j, C15094f.m64882r(j2));
    }

    /* renamed from: b */
    public final long mo44158b() {
        return C16511x.m74763a(this.f38561a.mo44135c(), this.f38562b.mo44135c());
    }

    /* renamed from: c */
    public final long mo44159c() {
        return this.f38563c;
    }

    /* renamed from: d */
    public final void mo44160d() {
        this.f38561a.mo44137e();
        this.f38562b.mo44137e();
    }

    /* renamed from: e */
    public final void mo44161e(long j) {
        this.f38563c = j;
    }
}
