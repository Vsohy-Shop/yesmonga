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
/* renamed from: androidx.compose.material3.r */
public final class C8271r {

    /* renamed from: e */
    public static final int f20432e = 0;

    /* renamed from: a */
    public final long f20433a;

    /* renamed from: b */
    public final long f20434b;

    /* renamed from: c */
    public final long f20435c;

    /* renamed from: d */
    public final long f20436d;

    public /* synthetic */ C8271r(long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4);
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8578k2<C15240j2> mo12941a(boolean z, @C12580l C8592o oVar, int i) {
        long j;
        oVar.mo14918M(-2116091914);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-2116091914, i, -1, "androidx.compose.material3.CardColors.containerColor (Card.kt:737)");
        }
        if (z) {
            j = this.f20433a;
        } else {
            j = this.f20435c;
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
    public final C8578k2<C15240j2> mo12942b(boolean z, @C12580l C8592o oVar, int i) {
        long j;
        oVar.mo14918M(1779883118);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1779883118, i, -1, "androidx.compose.material3.CardColors.contentColor (Card.kt:747)");
        }
        if (z) {
            j = this.f20434b;
        } else {
            j = this.f20436d;
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
        if (obj == null || !(obj instanceof C8271r)) {
            return false;
        }
        C8271r rVar = (C8271r) obj;
        if (C15240j2.m66082y(this.f20433a, rVar.f20433a) && C15240j2.m66082y(this.f20434b, rVar.f20434b) && C15240j2.m66082y(this.f20435c, rVar.f20435c) && C15240j2.m66082y(this.f20436d, rVar.f20436d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((C15240j2.m66056K(this.f20433a) * 31) + C15240j2.m66056K(this.f20434b)) * 31) + C15240j2.m66056K(this.f20435c)) * 31) + C15240j2.m66056K(this.f20436d);
    }

    public C8271r(long j, long j2, long j3, long j4) {
        this.f20433a = j;
        this.f20434b = j2;
        this.f20435c = j3;
        this.f20436d = j4;
    }
}
