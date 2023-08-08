package com.google.accompanist.pager;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.nestedscroll.C15446a;
import androidx.compose.p004ui.input.nestedscroll.C15448b;
import androidx.compose.p004ui.unit.C16509w;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.google.accompanist.pager.a */
public final class C15027a implements C15446a {

    /* renamed from: a */
    public final boolean f37150a;

    /* renamed from: b */
    public final boolean f37151b;
    @C12579k

    /* renamed from: c */
    public final PagerState f37152c;

    public C15027a(boolean z, boolean z2, @C12579k PagerState pagerState) {
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        this.f37150a = z;
        this.f37151b = z2;
        this.f37152c = pagerState;
    }

    @C12580l
    /* renamed from: a */
    public Object mo7455a(long j, long j2, @C12579k C11045c<? super C16509w> cVar) {
        boolean z;
        long j3;
        if (this.f37152c.mo42012r() == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            j3 = C16509w.f40916b.mo47915a();
        } else {
            j3 = Pager.m64361h(j2, this.f37150a, this.f37151b);
        }
        return C16509w.m74740b(j3);
    }

    /* renamed from: g */
    public long mo7456g(long j, long j2, int i) {
        if (C15448b.m68343g(i, C15448b.f38435b.mo43965b())) {
            return Pager.m64360g(j2, this.f37150a, this.f37151b);
        }
        return C15094f.f37256b.mo42248e();
    }
}
