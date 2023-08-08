package androidx.compose.material3;

import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.material3.f0 */
public final class C8197f0 implements C8263p1 {

    /* renamed from: a */
    public final long f20121a;

    /* renamed from: b */
    public final long f20122b;

    /* renamed from: c */
    public final long f20123c;

    /* renamed from: d */
    public final long f20124d;

    /* renamed from: e */
    public final long f20125e;

    /* renamed from: f */
    public final long f20126f;

    /* renamed from: g */
    public final long f20127g;

    /* renamed from: h */
    public final long f20128h;

    public /* synthetic */ C8197f0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8);
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public C8578k2<C15240j2> mo12576a(boolean z, @C12580l C8592o oVar, int i) {
        long j;
        oVar.mo14918M(-433512770);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-433512770, i, -1, "androidx.compose.material3.DefaultDrawerItemsColor.containerColor (NavigationDrawer.kt:796)");
        }
        if (z) {
            j = this.f20125e;
        } else {
            j = this.f20126f;
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
    public C8578k2<C15240j2> mo12577b(boolean z, @C12580l C8592o oVar, int i) {
        long j;
        oVar.mo14918M(1141354218);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1141354218, i, -1, "androidx.compose.material3.DefaultDrawerItemsColor.iconColor (NavigationDrawer.kt:786)");
        }
        if (z) {
            j = this.f20121a;
        } else {
            j = this.f20122b;
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
    public C8578k2<C15240j2> mo12578c(boolean z, @C12580l C8592o oVar, int i) {
        long j;
        oVar.mo14918M(1275109558);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1275109558, i, -1, "androidx.compose.material3.DefaultDrawerItemsColor.textColor (NavigationDrawer.kt:791)");
        }
        if (z) {
            j = this.f20123c;
        } else {
            j = this.f20124d;
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
    /* renamed from: d */
    public C8578k2<C15240j2> mo12579d(boolean z, @C12580l C8592o oVar, int i) {
        long j;
        oVar.mo14918M(-561675044);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-561675044, i, -1, "androidx.compose.material3.DefaultDrawerItemsColor.badgeColor (NavigationDrawer.kt:803)");
        }
        if (z) {
            j = this.f20127g;
        } else {
            j = this.f20128h;
        }
        C8578k2<C15240j2> t = C8415c2.m30251t(C15240j2.m66071n(j), oVar, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return t;
    }

    /* renamed from: e */
    public final long mo12580e() {
        return this.f20127g;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8197f0)) {
            return false;
        }
        C8197f0 f0Var = (C8197f0) obj;
        if (C15240j2.m66082y(this.f20121a, f0Var.f20121a) && C15240j2.m66082y(this.f20122b, f0Var.f20122b) && C15240j2.m66082y(this.f20123c, f0Var.f20123c) && C15240j2.m66082y(this.f20124d, f0Var.f20124d) && C15240j2.m66082y(this.f20125e, f0Var.f20125e) && C15240j2.m66082y(this.f20126f, f0Var.f20126f) && C15240j2.m66082y(this.f20127g, f0Var.f20127g) && C15240j2.m66082y(this.f20128h, f0Var.f20128h)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final long mo12582f() {
        return this.f20125e;
    }

    /* renamed from: g */
    public final long mo12583g() {
        return this.f20121a;
    }

    /* renamed from: h */
    public final long mo12584h() {
        return this.f20123c;
    }

    public int hashCode() {
        return (((((((((((((C15240j2.m66056K(this.f20121a) * 31) + C15240j2.m66056K(this.f20122b)) * 31) + C15240j2.m66056K(this.f20123c)) * 31) + C15240j2.m66056K(this.f20124d)) * 31) + C15240j2.m66056K(this.f20125e)) * 31) + C15240j2.m66056K(this.f20126f)) * 31) + C15240j2.m66056K(this.f20127g)) * 31) + C15240j2.m66056K(this.f20128h);
    }

    /* renamed from: i */
    public final long mo12586i() {
        return this.f20128h;
    }

    /* renamed from: j */
    public final long mo12587j() {
        return this.f20126f;
    }

    /* renamed from: k */
    public final long mo12588k() {
        return this.f20122b;
    }

    /* renamed from: l */
    public final long mo12589l() {
        return this.f20124d;
    }

    public C8197f0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.f20121a = j;
        this.f20122b = j2;
        this.f20123c = j3;
        this.f20124d = j4;
        this.f20125e = j5;
        this.f20126f = j6;
        this.f20127g = j7;
        this.f20128h = j8;
    }
}
