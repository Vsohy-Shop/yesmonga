package com.carrefour.fid.android.design.libs.pager;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.nestedscroll.C15446a;
import androidx.compose.p004ui.input.nestedscroll.C15448b;
import androidx.compose.p004ui.unit.C16509w;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.design.libs.pager.a */
public final class C37464a implements C15446a {

    /* renamed from: a */
    public final boolean f94093a;

    /* renamed from: b */
    public final boolean f94094b;

    public C37464a(boolean z, boolean z2) {
        this.f94093a = z;
        this.f94094b = z2;
    }

    @C12580l
    /* renamed from: a */
    public Object mo7455a(long j, long j2, @C12579k C11045c<? super C16509w> cVar) {
        return C16509w.m74740b(PagerKt.m153672h(j2, this.f94093a, this.f94094b));
    }

    /* renamed from: g */
    public long mo7456g(long j, long j2, int i) {
        if (C15448b.m68343g(i, C15448b.f38435b.mo43965b())) {
            return PagerKt.m153671g(j2, this.f94093a, this.f94094b);
        }
        return C15094f.f37256b.mo42248e();
    }
}
