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
/* renamed from: androidx.compose.material3.y0 */
public final class C8371y0 {

    /* renamed from: g */
    public static final int f22482g = 0;

    /* renamed from: a */
    public final long f22483a;

    /* renamed from: b */
    public final long f22484b;

    /* renamed from: c */
    public final long f22485c;

    /* renamed from: d */
    public final long f22486d;

    /* renamed from: e */
    public final long f22487e;

    /* renamed from: f */
    public final long f22488f;

    public /* synthetic */ C8371y0(long j, long j2, long j3, long j4, long j5, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6);
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8578k2<C15240j2> mo14794a(boolean z, boolean z2, @C12580l C8592o oVar, int i) {
        long j;
        oVar.mo14918M(1175394478);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1175394478, i, -1, "androidx.compose.material3.IconToggleButtonColors.containerColor (IconButton.kt:884)");
        }
        if (!z) {
            j = this.f22485c;
        } else if (!z2) {
            j = this.f22483a;
        } else {
            j = this.f22487e;
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
    public final C8578k2<C15240j2> mo14795b(boolean z, boolean z2, @C12580l C8592o oVar, int i) {
        long j;
        oVar.mo14918M(1340854054);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1340854054, i, -1, "androidx.compose.material3.IconToggleButtonColors.contentColor (IconButton.kt:900)");
        }
        if (!z) {
            j = this.f22486d;
        } else if (!z2) {
            j = this.f22484b;
        } else {
            j = this.f22488f;
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
        if (obj == null || !(obj instanceof C8371y0)) {
            return false;
        }
        C8371y0 y0Var = (C8371y0) obj;
        if (C15240j2.m66082y(this.f22483a, y0Var.f22483a) && C15240j2.m66082y(this.f22484b, y0Var.f22484b) && C15240j2.m66082y(this.f22485c, y0Var.f22485c) && C15240j2.m66082y(this.f22486d, y0Var.f22486d) && C15240j2.m66082y(this.f22487e, y0Var.f22487e) && C15240j2.m66082y(this.f22488f, y0Var.f22488f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((C15240j2.m66056K(this.f22483a) * 31) + C15240j2.m66056K(this.f22484b)) * 31) + C15240j2.m66056K(this.f22485c)) * 31) + C15240j2.m66056K(this.f22486d)) * 31) + C15240j2.m66056K(this.f22487e)) * 31) + C15240j2.m66056K(this.f22488f);
    }

    public C8371y0(long j, long j2, long j3, long j4, long j5, long j6) {
        this.f22483a = j;
        this.f22484b = j2;
        this.f22485c = j3;
        this.f22486d = j4;
        this.f22487e = j5;
        this.f22488f = j6;
    }
}
