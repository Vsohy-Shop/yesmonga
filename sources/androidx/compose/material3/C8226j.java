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
/* renamed from: androidx.compose.material3.j */
public final class C8226j {

    /* renamed from: e */
    public static final int f20222e = 0;

    /* renamed from: a */
    public final long f20223a;

    /* renamed from: b */
    public final long f20224b;

    /* renamed from: c */
    public final long f20225c;

    /* renamed from: d */
    public final long f20226d;

    public /* synthetic */ C8226j(long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4);
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8578k2<C15240j2> mo12703a(boolean z, @C12580l C8592o oVar, int i) {
        long j;
        oVar.mo14918M(-754887434);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-754887434, i, -1, "androidx.compose.material3.ButtonColors.containerColor (Button.kt:922)");
        }
        if (z) {
            j = this.f20223a;
        } else {
            j = this.f20225c;
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
    public final C8578k2<C15240j2> mo12704b(boolean z, @C12580l C8592o oVar, int i) {
        long j;
        oVar.mo14918M(-360303250);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-360303250, i, -1, "androidx.compose.material3.ButtonColors.contentColor (Button.kt:932)");
        }
        if (z) {
            j = this.f20224b;
        } else {
            j = this.f20226d;
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
        if (obj == null || !(obj instanceof C8226j)) {
            return false;
        }
        C8226j jVar = (C8226j) obj;
        if (C15240j2.m66082y(this.f20223a, jVar.f20223a) && C15240j2.m66082y(this.f20224b, jVar.f20224b) && C15240j2.m66082y(this.f20225c, jVar.f20225c) && C15240j2.m66082y(this.f20226d, jVar.f20226d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((C15240j2.m66056K(this.f20223a) * 31) + C15240j2.m66056K(this.f20224b)) * 31) + C15240j2.m66056K(this.f20225c)) * 31) + C15240j2.m66056K(this.f20226d);
    }

    public C8226j(long j, long j2, long j3, long j4) {
        this.f20223a = j;
        this.f20224b = j2;
        this.f20225c = j3;
        this.f20226d = j4;
    }
}
