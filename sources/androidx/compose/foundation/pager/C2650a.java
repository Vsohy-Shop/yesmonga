package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.nestedscroll.C15446a;
import androidx.compose.p004ui.input.nestedscroll.C15448b;
import androidx.compose.p004ui.unit.C16509w;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.pager.a */
public final class C2650a implements C15446a {
    @C12579k

    /* renamed from: a */
    public final Orientation f7020a;

    public C2650a(@C12579k Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.f7020a = orientation;
    }

    @C12580l
    /* renamed from: a */
    public Object mo7455a(long j, long j2, @C12579k C11045c<? super C16509w> cVar) {
        return C16509w.m74740b(mo9109d(j2, this.f7020a));
    }

    /* renamed from: c */
    public final long mo9108c(long j, @C12579k Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        if (orientation == Orientation.Vertical) {
            return C15094f.m64873i(j, 0.0f, 0.0f, 2, (Object) null);
        }
        return C15094f.m64873i(j, 0.0f, 0.0f, 1, (Object) null);
    }

    /* renamed from: d */
    public final long mo9109d(long j, @C12579k Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        if (orientation == Orientation.Vertical) {
            return C16509w.m74745g(j, 0.0f, 0.0f, 2, (Object) null);
        }
        return C16509w.m74745g(j, 0.0f, 0.0f, 1, (Object) null);
    }

    @C12579k
    /* renamed from: f */
    public final Orientation mo9110f() {
        return this.f7020a;
    }

    /* renamed from: g */
    public long mo7456g(long j, long j2, int i) {
        if (C15448b.m68343g(i, C15448b.f38435b.mo43965b())) {
            return mo9108c(j2, this.f7020a);
        }
        return C15094f.f37256b.mo42248e();
    }
}
