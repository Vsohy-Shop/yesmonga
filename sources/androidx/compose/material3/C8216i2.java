package androidx.compose.material3;

import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.C2250j;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8585m0;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8251n0
@C8585m0
/* renamed from: androidx.compose.material3.i2 */
public final class C8216i2 {

    /* renamed from: g */
    public static final int f20182g = 0;

    /* renamed from: a */
    public final long f20183a;

    /* renamed from: b */
    public final long f20184b;

    /* renamed from: c */
    public final long f20185c;

    /* renamed from: d */
    public final long f20186d;

    /* renamed from: e */
    public final float f20187e;

    /* renamed from: f */
    public final float f20188f;

    public /* synthetic */ C8216i2(long j, long j2, long j3, long j4, float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, f, f2);
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8578k2<C2223i> mo12655a(boolean z, boolean z2, @C12580l C8592o oVar, int i) {
        long j;
        float f;
        oVar.mo14918M(670222826);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(670222826, i, -1, "androidx.compose.material3.SelectableChipBorder.borderStroke (Chip.kt:1993)");
        }
        if (z) {
            if (z2) {
                j = this.f20184b;
            } else {
                j = this.f20183a;
            }
        } else if (z2) {
            j = this.f20186d;
        } else {
            j = this.f20185c;
        }
        if (z2) {
            f = this.f20188f;
        } else {
            f = this.f20187e;
        }
        C8578k2<C2223i> t = C8415c2.m30251t(C2250j.m9695a(f, j), oVar, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return t;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C8216i2)) {
            return false;
        }
        C8216i2 i2Var = (C8216i2) obj;
        if (C15240j2.m66082y(this.f20183a, i2Var.f20183a) && C15240j2.m66082y(this.f20184b, i2Var.f20184b) && C15240j2.m66082y(this.f20185c, i2Var.f20185c) && C15240j2.m66082y(this.f20186d, i2Var.f20186d) && C16483g.m74440e0(this.f20187e, i2Var.f20187e) && C16483g.m74440e0(this.f20188f, i2Var.f20188f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((C15240j2.m66056K(this.f20183a) * 31) + C15240j2.m66056K(this.f20184b)) * 31) + C15240j2.m66056K(this.f20185c)) * 31) + C15240j2.m66056K(this.f20186d)) * 31) + C16483g.m74442h0(this.f20187e)) * 31) + C16483g.m74442h0(this.f20188f);
    }

    public C8216i2(long j, long j2, long j3, long j4, float f, float f2) {
        this.f20183a = j;
        this.f20184b = j2;
        this.f20185c = j3;
        this.f20186d = j4;
        this.f20187e = f;
        this.f20188f = f2;
    }
}
