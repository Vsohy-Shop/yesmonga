package androidx.compose.material3;

import androidx.compose.animation.C2040p;
import androidx.compose.animation.core.C1972h;
import androidx.compose.animation.core.C2022z;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11079d2;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
/* renamed from: androidx.compose.material3.s1 */
public final class C8278s1 {

    /* renamed from: h */
    public static final int f20450h = 0;

    /* renamed from: a */
    public final long f20451a;

    /* renamed from: b */
    public final long f20452b;

    /* renamed from: c */
    public final long f20453c;

    /* renamed from: d */
    public final long f20454d;

    /* renamed from: e */
    public final long f20455e;

    /* renamed from: f */
    public final long f20456f;

    /* renamed from: g */
    public final long f20457g;

    public /* synthetic */ C8278s1(long j, long j2, long j3, long j4, long j5, long j6, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7);
    }

    @C8540g
    @C11314h(name = "getIndicatorColor")
    /* renamed from: a */
    public final long mo12977a(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(618271448);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(618271448, i, -1, "androidx.compose.material3.NavigationRailItemColors.<get-indicatorColor> (NavigationRail.kt:382)");
        }
        long j = this.f20453c;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return j;
    }

    @C8540g
    @C12579k
    /* renamed from: b */
    public final C8578k2<C15240j2> mo12978b(boolean z, boolean z2, @C12580l C8592o oVar, int i) {
        long j;
        oVar.mo14918M(2131995553);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(2131995553, i, -1, "androidx.compose.material3.NavigationRailItemColors.iconColor (NavigationRail.kt:348)");
        }
        if (!z2) {
            j = this.f20456f;
        } else if (z) {
            j = this.f20451a;
        } else {
            j = this.f20454d;
        }
        C8578k2<C15240j2> c = C2040p.m8743c(j, C1972h.m8392q(150, 0, (C2022z) null, 6, (Object) null), (String) null, (C11300l<? super C15240j2, C11079d2>) null, oVar, 48, 12);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return c;
    }

    @C8540g
    @C12579k
    /* renamed from: c */
    public final C8578k2<C15240j2> mo12979c(boolean z, boolean z2, @C12580l C8592o oVar, int i) {
        long j;
        oVar.mo14918M(-758555563);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-758555563, i, -1, "androidx.compose.material3.NavigationRailItemColors.textColor (NavigationRail.kt:367)");
        }
        if (!z2) {
            j = this.f20457g;
        } else if (z) {
            j = this.f20452b;
        } else {
            j = this.f20455e;
        }
        C8578k2<C15240j2> c = C2040p.m8743c(j, C1972h.m8392q(150, 0, (C2022z) null, 6, (Object) null), (String) null, (C11300l<? super C15240j2, C11079d2>) null, oVar, 48, 12);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return c;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C8278s1)) {
            return false;
        }
        C8278s1 s1Var = (C8278s1) obj;
        if (C15240j2.m66082y(this.f20451a, s1Var.f20451a) && C15240j2.m66082y(this.f20454d, s1Var.f20454d) && C15240j2.m66082y(this.f20452b, s1Var.f20452b) && C15240j2.m66082y(this.f20455e, s1Var.f20455e) && C15240j2.m66082y(this.f20453c, s1Var.f20453c) && C15240j2.m66082y(this.f20456f, s1Var.f20456f) && C15240j2.m66082y(this.f20457g, s1Var.f20457g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((C15240j2.m66056K(this.f20451a) * 31) + C15240j2.m66056K(this.f20454d)) * 31) + C15240j2.m66056K(this.f20452b)) * 31) + C15240j2.m66056K(this.f20455e)) * 31) + C15240j2.m66056K(this.f20453c)) * 31) + C15240j2.m66056K(this.f20456f)) * 31) + C15240j2.m66056K(this.f20457g);
    }

    public C8278s1(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f20451a = j;
        this.f20452b = j2;
        this.f20453c = j3;
        this.f20454d = j4;
        this.f20455e = j5;
        this.f20456f = j6;
        this.f20457g = j7;
    }
}
