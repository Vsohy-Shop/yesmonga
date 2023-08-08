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
/* renamed from: androidx.compose.material3.w0 */
public final class C8363w0 {

    /* renamed from: e */
    public static final int f22448e = 0;

    /* renamed from: a */
    public final long f22449a;

    /* renamed from: b */
    public final long f22450b;

    /* renamed from: c */
    public final long f22451c;

    /* renamed from: d */
    public final long f22452d;

    public /* synthetic */ C8363w0(long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4);
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8578k2<C15240j2> mo14752a(boolean z, @C12580l C8592o oVar, int i) {
        long j;
        oVar.mo14918M(1876083926);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1876083926, i, -1, "androidx.compose.material3.IconButtonColors.containerColor (IconButton.kt:822)");
        }
        if (z) {
            j = this.f22449a;
        } else {
            j = this.f22451c;
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
    public final C8578k2<C15240j2> mo14753b(boolean z, @C12580l C8592o oVar, int i) {
        long j;
        oVar.mo14918M(613133646);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(613133646, i, -1, "androidx.compose.material3.IconButtonColors.contentColor (IconButton.kt:832)");
        }
        if (z) {
            j = this.f22450b;
        } else {
            j = this.f22452d;
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
        if (obj == null || !(obj instanceof C8363w0)) {
            return false;
        }
        C8363w0 w0Var = (C8363w0) obj;
        if (C15240j2.m66082y(this.f22449a, w0Var.f22449a) && C15240j2.m66082y(this.f22450b, w0Var.f22450b) && C15240j2.m66082y(this.f22451c, w0Var.f22451c) && C15240j2.m66082y(this.f22452d, w0Var.f22452d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((C15240j2.m66056K(this.f22449a) * 31) + C15240j2.m66056K(this.f22450b)) * 31) + C15240j2.m66056K(this.f22451c)) * 31) + C15240j2.m66056K(this.f22452d);
    }

    public C8363w0(long j, long j2, long j3, long j4) {
        this.f22449a = j;
        this.f22450b = j2;
        this.f22451c = j3;
        this.f22452d = j4;
    }
}
