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

@C3044g0
@C8585m0
/* renamed from: androidx.compose.material.u */
public final class C7936u implements C7886o {

    /* renamed from: a */
    public final long f19077a;

    /* renamed from: b */
    public final long f19078b;

    /* renamed from: c */
    public final long f19079c;

    /* renamed from: d */
    public final long f19080d;

    /* renamed from: e */
    public final long f19081e;

    /* renamed from: f */
    public final long f19082f;

    public /* synthetic */ C7936u(long j, long j2, long j3, long j4, long j5, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6);
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public C8578k2<C15240j2> mo10892a(boolean z, @C12580l C8592o oVar, int i) {
        long j;
        oVar.mo14918M(-1593588247);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1593588247, i, -1, "androidx.compose.material.DefaultChipColors.backgroundColor (Chip.kt:592)");
        }
        if (z) {
            j = this.f19077a;
        } else {
            j = this.f19080d;
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
    public C8578k2<C15240j2> mo10893b(boolean z, @C12580l C8592o oVar, int i) {
        long j;
        oVar.mo14918M(483145880);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(483145880, i, -1, "androidx.compose.material.DefaultChipColors.contentColor (Chip.kt:597)");
        }
        if (z) {
            j = this.f19078b;
        } else {
            j = this.f19081e;
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
    public C8578k2<C15240j2> mo10894c(boolean z, @C12580l C8592o oVar, int i) {
        long j;
        oVar.mo14918M(1955749013);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1955749013, i, -1, "androidx.compose.material.DefaultChipColors.leadingIconContentColor (Chip.kt:602)");
        }
        if (z) {
            j = this.f19079c;
        } else {
            j = this.f19082f;
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
        if (obj == null || C7936u.class != obj.getClass()) {
            return false;
        }
        C7936u uVar = (C7936u) obj;
        if (C15240j2.m66082y(this.f19077a, uVar.f19077a) && C15240j2.m66082y(this.f19078b, uVar.f19078b) && C15240j2.m66082y(this.f19079c, uVar.f19079c) && C15240j2.m66082y(this.f19080d, uVar.f19080d) && C15240j2.m66082y(this.f19081e, uVar.f19081e) && C15240j2.m66082y(this.f19082f, uVar.f19082f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((C15240j2.m66056K(this.f19077a) * 31) + C15240j2.m66056K(this.f19078b)) * 31) + C15240j2.m66056K(this.f19079c)) * 31) + C15240j2.m66056K(this.f19080d)) * 31) + C15240j2.m66056K(this.f19081e)) * 31) + C15240j2.m66056K(this.f19082f);
    }

    public C7936u(long j, long j2, long j3, long j4, long j5, long j6) {
        this.f19077a = j;
        this.f19078b = j2;
        this.f19079c = j3;
        this.f19080d = j4;
        this.f19081e = j5;
        this.f19082f = j6;
    }
}
