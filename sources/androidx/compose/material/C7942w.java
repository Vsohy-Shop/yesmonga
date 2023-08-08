package androidx.compose.material;

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
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.material.w */
public final class C7942w implements C3027a1 {

    /* renamed from: a */
    public final long f19090a;

    /* renamed from: b */
    public final long f19091b;

    /* renamed from: c */
    public final long f19092c;

    public /* synthetic */ C7942w(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public C8578k2<C15240j2> mo10712a(boolean z, boolean z2, @C12580l C8592o oVar, int i) {
        long j;
        C8578k2<C15240j2> k2Var;
        oVar.mo14918M(1243421834);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1243421834, i, -1, "androidx.compose.material.DefaultRadioButtonColors.radioColor (RadioButton.kt:187)");
        }
        if (!z) {
            j = this.f19092c;
        } else if (!z2) {
            j = this.f19091b;
        } else {
            j = this.f19090a;
        }
        long j2 = j;
        if (z) {
            oVar.mo14918M(-1052799107);
            k2Var = C2040p.m8742b(j2, C1972h.m8392q(100, 0, (C2022z) null, 6, (Object) null), (C11300l) null, oVar, 48, 4);
            oVar.mo15002m0();
        } else {
            oVar.mo14918M(-1052799002);
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
        if (obj == null || C7942w.class != obj.getClass()) {
            return false;
        }
        C7942w wVar = (C7942w) obj;
        if (C15240j2.m66082y(this.f19090a, wVar.f19090a) && C15240j2.m66082y(this.f19091b, wVar.f19091b) && C15240j2.m66082y(this.f19092c, wVar.f19092c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((C15240j2.m66056K(this.f19090a) * 31) + C15240j2.m66056K(this.f19091b)) * 31) + C15240j2.m66056K(this.f19092c);
    }

    public C7942w(long j, long j2, long j3) {
        this.f19090a = j;
        this.f19091b = j2;
        this.f19092c = j3;
    }
}
