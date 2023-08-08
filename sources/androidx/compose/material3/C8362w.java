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

@C8585m0
/* renamed from: androidx.compose.material3.w */
public final class C8362w {

    /* renamed from: d */
    public static final int f22444d = 0;

    /* renamed from: a */
    public final long f22445a;

    /* renamed from: b */
    public final long f22446b;

    /* renamed from: c */
    public final float f22447c;

    public /* synthetic */ C8362w(long j, long j2, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, f);
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8578k2<C2223i> mo14749a(boolean z, @C12580l C8592o oVar, int i) {
        long j;
        oVar.mo14918M(1899621712);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1899621712, i, -1, "androidx.compose.material3.ChipBorder.borderStroke (Chip.kt:2045)");
        }
        float f = this.f22447c;
        if (z) {
            j = this.f22445a;
        } else {
            j = this.f22446b;
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
        if (obj == null || !(obj instanceof C8362w)) {
            return false;
        }
        C8362w wVar = (C8362w) obj;
        if (C15240j2.m66082y(this.f22445a, wVar.f22445a) && C15240j2.m66082y(this.f22446b, wVar.f22446b) && C16483g.m74440e0(this.f22447c, wVar.f22447c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((C15240j2.m66056K(this.f22445a) * 31) + C15240j2.m66056K(this.f22446b)) * 31) + C16483g.m74442h0(this.f22447c);
    }

    public C8362w(long j, long j2, float f) {
        this.f22445a = j;
        this.f22446b = j2;
        this.f22447c = f;
    }
}
