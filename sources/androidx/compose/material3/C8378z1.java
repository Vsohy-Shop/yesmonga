package androidx.compose.material3;

import androidx.compose.animation.C2040p;
import androidx.compose.animation.core.C1972h;
import androidx.compose.animation.core.C2022z;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8585m0;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.material3.z1 */
public final class C8378z1 {

    /* renamed from: e */
    public static final int f22526e = 0;

    /* renamed from: a */
    public final long f22527a;

    /* renamed from: b */
    public final long f22528b;

    /* renamed from: c */
    public final long f22529c;

    /* renamed from: d */
    public final long f22530d;

    public /* synthetic */ C8378z1(long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4);
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8578k2<C15240j2> mo14862a(boolean z, boolean z2, @C12580l C8592o oVar, int i) {
        long j;
        C8578k2<C15240j2> k2Var;
        oVar.mo14918M(-1840145292);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1840145292, i, -1, "androidx.compose.material3.RadioButtonColors.radioColor (RadioButton.kt:182)");
        }
        if (z && z2) {
            j = this.f22527a;
        } else if (z && !z2) {
            j = this.f22528b;
        } else if (z || !z2) {
            j = this.f22530d;
        } else {
            j = this.f22529c;
        }
        long j2 = j;
        if (z) {
            oVar.mo14918M(-1943770131);
            k2Var = C2040p.m8743c(j2, C1972h.m8392q(100, 0, (C2022z) null, 6, (Object) null), (String) null, (C11300l<? super C15240j2, C11079d2>) null, oVar, 48, 12);
            oVar.mo15002m0();
        } else {
            oVar.mo14918M(-1943770026);
            k2Var = C8415c2.m30251t(C15240j2.m66071n(j2), oVar, 0);
            oVar.mo15002m0();
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return k2Var;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C8378z1)) {
            return false;
        }
        C8378z1 z1Var = (C8378z1) obj;
        if (C15240j2.m66082y(this.f22527a, z1Var.f22527a) && C15240j2.m66082y(this.f22528b, z1Var.f22528b) && C15240j2.m66082y(this.f22529c, z1Var.f22529c) && C15240j2.m66082y(this.f22530d, z1Var.f22530d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((C15240j2.m66056K(this.f22527a) * 31) + C15240j2.m66056K(this.f22528b)) * 31) + C15240j2.m66056K(this.f22529c)) * 31) + C15240j2.m66056K(this.f22530d);
    }

    public C8378z1(long j, long j2, long j3, long j4) {
        this.f22527a = j;
        this.f22528b = j2;
        this.f22529c = j3;
        this.f22530d = j4;
    }
}
