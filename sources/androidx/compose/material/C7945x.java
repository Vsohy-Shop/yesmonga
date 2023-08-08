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
/* renamed from: androidx.compose.material.x */
public final class C7945x implements C3039e1 {

    /* renamed from: a */
    public final long f19110a;

    /* renamed from: b */
    public final long f19111b;

    /* renamed from: c */
    public final long f19112c;

    /* renamed from: d */
    public final long f19113d;

    /* renamed from: e */
    public final long f19114e;

    /* renamed from: f */
    public final long f19115f;

    /* renamed from: g */
    public final long f19116g;

    /* renamed from: h */
    public final long f19117h;

    /* renamed from: i */
    public final long f19118i;

    public /* synthetic */ C7945x(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9);
    }

    @C8540g
    @C12579k
    /* renamed from: b */
    public C8578k2<C15240j2> mo10749b(boolean z, boolean z2, @C12580l C8592o oVar, int i) {
        long j;
        oVar.mo14918M(189838188);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(189838188, i, -1, "androidx.compose.material.DefaultSelectableChipColors.leadingIconColor (Chip.kt:674)");
        }
        if (!z) {
            j = this.f19115f;
        } else if (!z2) {
            j = this.f19112c;
        } else {
            j = this.f19118i;
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
    public C8578k2<C15240j2> mo10750c(boolean z, boolean z2, @C12580l C8592o oVar, int i) {
        long j;
        oVar.mo14918M(-403836585);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-403836585, i, -1, "androidx.compose.material.DefaultSelectableChipColors.backgroundColor (Chip.kt:654)");
        }
        if (!z) {
            j = this.f19113d;
        } else if (!z2) {
            j = this.f19110a;
        } else {
            j = this.f19116g;
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
    public C8578k2<C15240j2> mo10751d(boolean z, boolean z2, @C12580l C8592o oVar, int i) {
        long j;
        oVar.mo14918M(2025240134);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(2025240134, i, -1, "androidx.compose.material.DefaultSelectableChipColors.contentColor (Chip.kt:664)");
        }
        if (!z) {
            j = this.f19114e;
        } else if (!z2) {
            j = this.f19111b;
        } else {
            j = this.f19117h;
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
        if (obj == null || C7945x.class != obj.getClass()) {
            return false;
        }
        C7945x xVar = (C7945x) obj;
        if (C15240j2.m66082y(this.f19110a, xVar.f19110a) && C15240j2.m66082y(this.f19111b, xVar.f19111b) && C15240j2.m66082y(this.f19112c, xVar.f19112c) && C15240j2.m66082y(this.f19113d, xVar.f19113d) && C15240j2.m66082y(this.f19114e, xVar.f19114e) && C15240j2.m66082y(this.f19115f, xVar.f19115f) && C15240j2.m66082y(this.f19116g, xVar.f19116g) && C15240j2.m66082y(this.f19117h, xVar.f19117h) && C15240j2.m66082y(this.f19118i, xVar.f19118i)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((C15240j2.m66056K(this.f19110a) * 31) + C15240j2.m66056K(this.f19111b)) * 31) + C15240j2.m66056K(this.f19112c)) * 31) + C15240j2.m66056K(this.f19113d)) * 31) + C15240j2.m66056K(this.f19114e)) * 31) + C15240j2.m66056K(this.f19115f)) * 31) + C15240j2.m66056K(this.f19116g)) * 31) + C15240j2.m66056K(this.f19117h)) * 31) + C15240j2.m66056K(this.f19118i);
    }

    public C7945x(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        this.f19110a = j;
        this.f19111b = j2;
        this.f19112c = j3;
        this.f19113d = j4;
        this.f19114e = j5;
        this.f19115f = j6;
        this.f19116g = j7;
        this.f19117h = j8;
        this.f19118i = j9;
    }
}
