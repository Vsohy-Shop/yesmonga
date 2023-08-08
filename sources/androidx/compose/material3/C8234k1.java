package androidx.compose.material3;

import androidx.compose.p004ui.graphics.C15240j2;
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
/* renamed from: androidx.compose.material3.k1 */
public final class C8234k1 {

    /* renamed from: g */
    public static final int f20269g = 0;

    /* renamed from: a */
    public final long f20270a;

    /* renamed from: b */
    public final long f20271b;

    /* renamed from: c */
    public final long f20272c;

    /* renamed from: d */
    public final long f20273d;

    /* renamed from: e */
    public final long f20274e;

    /* renamed from: f */
    public final long f20275f;

    public /* synthetic */ C8234k1(long j, long j2, long j3, long j4, long j5, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6);
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8578k2<C15240j2> mo12751a(boolean z, @C12580l C8592o oVar, int i) {
        long j;
        oVar.mo14918M(1521013607);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1521013607, i, -1, "androidx.compose.material3.MenuItemColors.leadingIconColor (Menu.kt:393)");
        }
        if (z) {
            j = this.f20271b;
        } else {
            j = this.f20274e;
        }
        C8578k2<C15240j2> t = C8415c2.m30251t(C15240j2.m66071n(j), oVar, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return t;
    }

    @C8540g
    @C12579k
    /* renamed from: b */
    public final C8578k2<C15240j2> mo12752b(boolean z, @C12580l C8592o oVar, int i) {
        long j;
        oVar.mo14918M(-1023108655);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1023108655, i, -1, "androidx.compose.material3.MenuItemColors.textColor (Menu.kt:383)");
        }
        if (z) {
            j = this.f20270a;
        } else {
            j = this.f20273d;
        }
        C8578k2<C15240j2> t = C8415c2.m30251t(C15240j2.m66071n(j), oVar, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return t;
    }

    @C8540g
    @C12579k
    /* renamed from: c */
    public final C8578k2<C15240j2> mo12753c(boolean z, @C12580l C8592o oVar, int i) {
        long j;
        oVar.mo14918M(1024062809);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1024062809, i, -1, "androidx.compose.material3.MenuItemColors.trailingIconColor (Menu.kt:403)");
        }
        if (z) {
            j = this.f20272c;
        } else {
            j = this.f20275f;
        }
        C8578k2<C15240j2> t = C8415c2.m30251t(C15240j2.m66071n(j), oVar, 0);
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
        if (obj == null || !(obj instanceof C8234k1)) {
            return false;
        }
        C8234k1 k1Var = (C8234k1) obj;
        if (C15240j2.m66082y(this.f20270a, k1Var.f20270a) && C15240j2.m66082y(this.f20271b, k1Var.f20271b) && C15240j2.m66082y(this.f20272c, k1Var.f20272c) && C15240j2.m66082y(this.f20273d, k1Var.f20273d) && C15240j2.m66082y(this.f20274e, k1Var.f20274e) && C15240j2.m66082y(this.f20275f, k1Var.f20275f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((C15240j2.m66056K(this.f20270a) * 31) + C15240j2.m66056K(this.f20271b)) * 31) + C15240j2.m66056K(this.f20272c)) * 31) + C15240j2.m66056K(this.f20273d)) * 31) + C15240j2.m66056K(this.f20274e)) * 31) + C15240j2.m66056K(this.f20275f);
    }

    public C8234k1(long j, long j2, long j3, long j4, long j5, long j6) {
        this.f20270a = j;
        this.f20271b = j2;
        this.f20272c = j3;
        this.f20273d = j4;
        this.f20274e = j5;
        this.f20275f = j6;
    }
}
