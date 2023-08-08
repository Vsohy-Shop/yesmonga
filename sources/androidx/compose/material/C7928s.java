package androidx.compose.material;

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
/* renamed from: androidx.compose.material.s */
public final class C7928s implements C3046h {

    /* renamed from: a */
    public final long f19057a;

    /* renamed from: b */
    public final long f19058b;

    /* renamed from: c */
    public final long f19059c;

    /* renamed from: d */
    public final long f19060d;

    public /* synthetic */ C7928s(long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4);
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public C8578k2<C15240j2> mo10768a(boolean z, @C12580l C8592o oVar, int i) {
        long j;
        oVar.mo14918M(-655254499);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-655254499, i, -1, "androidx.compose.material.DefaultButtonColors.backgroundColor (Button.kt:586)");
        }
        if (z) {
            j = this.f19057a;
        } else {
            j = this.f19059c;
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
    public C8578k2<C15240j2> mo10769b(boolean z, @C12580l C8592o oVar, int i) {
        long j;
        oVar.mo14918M(-2133647540);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-2133647540, i, -1, "androidx.compose.material.DefaultButtonColors.contentColor (Button.kt:591)");
        }
        if (z) {
            j = this.f19058b;
        } else {
            j = this.f19060d;
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
        if (obj == null || C7928s.class != obj.getClass()) {
            return false;
        }
        C7928s sVar = (C7928s) obj;
        if (C15240j2.m66082y(this.f19057a, sVar.f19057a) && C15240j2.m66082y(this.f19058b, sVar.f19058b) && C15240j2.m66082y(this.f19059c, sVar.f19059c) && C15240j2.m66082y(this.f19060d, sVar.f19060d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((C15240j2.m66056K(this.f19057a) * 31) + C15240j2.m66056K(this.f19058b)) * 31) + C15240j2.m66056K(this.f19059c)) * 31) + C15240j2.m66056K(this.f19060d);
    }

    public C7928s(long j, long j2, long j3, long j4) {
        this.f19057a = j;
        this.f19058b = j2;
        this.f19059c = j3;
        this.f19060d = j4;
    }
}
