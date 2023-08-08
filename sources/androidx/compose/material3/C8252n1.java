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
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
/* renamed from: androidx.compose.material3.n1 */
public final class C8252n1 {

    /* renamed from: h */
    public static final int f20374h = 0;

    /* renamed from: a */
    public final long f20375a;

    /* renamed from: b */
    public final long f20376b;

    /* renamed from: c */
    public final long f20377c;

    /* renamed from: d */
    public final long f20378d;

    /* renamed from: e */
    public final long f20379e;

    /* renamed from: f */
    public final long f20380f;

    /* renamed from: g */
    public final long f20381g;

    public /* synthetic */ C8252n1(long j, long j2, long j3, long j4, long j5, long j6, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7);
    }

    /* renamed from: a */
    public final long mo12867a() {
        return this.f20377c;
    }

    @C8540g
    @C12579k
    /* renamed from: b */
    public final C8578k2<C15240j2> mo12868b(boolean z, boolean z2, @C12580l C8592o oVar, int i) {
        long j;
        oVar.mo14918M(-1012982249);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1012982249, i, -1, "androidx.compose.material3.NavigationBarItemColors.iconColor (NavigationBar.kt:350)");
        }
        if (!z2) {
            j = this.f20380f;
        } else if (z) {
            j = this.f20375a;
        } else {
            j = this.f20378d;
        }
        C8578k2<C15240j2> c = C2040p.m8743c(j, C1972h.m8392q(100, 0, (C2022z) null, 6, (Object) null), (String) null, (C11300l<? super C15240j2, C11079d2>) null, oVar, 48, 12);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return c;
    }

    @C8540g
    @C12579k
    /* renamed from: c */
    public final C8578k2<C15240j2> mo12869c(boolean z, boolean z2, @C12580l C8592o oVar, int i) {
        long j;
        oVar.mo14918M(-1833866293);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1833866293, i, -1, "androidx.compose.material3.NavigationBarItemColors.textColor (NavigationBar.kt:369)");
        }
        if (!z2) {
            j = this.f20381g;
        } else if (z) {
            j = this.f20376b;
        } else {
            j = this.f20379e;
        }
        C8578k2<C15240j2> c = C2040p.m8743c(j, C1972h.m8392q(100, 0, (C2022z) null, 6, (Object) null), (String) null, (C11300l<? super C15240j2, C11079d2>) null, oVar, 48, 12);
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
        if (obj == null || !(obj instanceof C8252n1)) {
            return false;
        }
        C8252n1 n1Var = (C8252n1) obj;
        if (C15240j2.m66082y(this.f20375a, n1Var.f20375a) && C15240j2.m66082y(this.f20378d, n1Var.f20378d) && C15240j2.m66082y(this.f20376b, n1Var.f20376b) && C15240j2.m66082y(this.f20379e, n1Var.f20379e) && C15240j2.m66082y(this.f20377c, n1Var.f20377c) && C15240j2.m66082y(this.f20380f, n1Var.f20380f) && C15240j2.m66082y(this.f20381g, n1Var.f20381g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((C15240j2.m66056K(this.f20375a) * 31) + C15240j2.m66056K(this.f20378d)) * 31) + C15240j2.m66056K(this.f20376b)) * 31) + C15240j2.m66056K(this.f20379e)) * 31) + C15240j2.m66056K(this.f20377c)) * 31) + C15240j2.m66056K(this.f20380f)) * 31) + C15240j2.m66056K(this.f20381g);
    }

    public C8252n1(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f20375a = j;
        this.f20376b = j2;
        this.f20377c = j3;
        this.f20378d = j4;
        this.f20379e = j5;
        this.f20380f = j6;
        this.f20381g = j7;
    }
}
