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
/* renamed from: androidx.compose.material.z */
public final class C7949z implements C7892p1 {

    /* renamed from: a */
    public final long f19137a;

    /* renamed from: b */
    public final long f19138b;

    /* renamed from: c */
    public final long f19139c;

    /* renamed from: d */
    public final long f19140d;

    /* renamed from: e */
    public final long f19141e;

    /* renamed from: f */
    public final long f19142f;

    /* renamed from: g */
    public final long f19143g;

    /* renamed from: h */
    public final long f19144h;

    public /* synthetic */ C7949z(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8);
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public C8578k2<C15240j2> mo10913a(boolean z, boolean z2, @C12580l C8592o oVar, int i) {
        long j;
        oVar.mo14918M(-1176343362);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1176343362, i, -1, "androidx.compose.material.DefaultSwitchColors.trackColor (Switch.kt:339)");
        }
        if (z) {
            if (z2) {
                j = this.f19138b;
            } else {
                j = this.f19140d;
            }
        } else if (z2) {
            j = this.f19142f;
        } else {
            j = this.f19144h;
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
    public C8578k2<C15240j2> mo10914b(boolean z, boolean z2, @C12580l C8592o oVar, int i) {
        long j;
        oVar.mo14918M(-66424183);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-66424183, i, -1, "androidx.compose.material.DefaultSwitchColors.thumbColor (Switch.kt:328)");
        }
        if (z) {
            if (z2) {
                j = this.f19137a;
            } else {
                j = this.f19139c;
            }
        } else if (z2) {
            j = this.f19141e;
        } else {
            j = this.f19143g;
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
        if (obj == null || C7949z.class != obj.getClass()) {
            return false;
        }
        C7949z zVar = (C7949z) obj;
        if (C15240j2.m66082y(this.f19137a, zVar.f19137a) && C15240j2.m66082y(this.f19138b, zVar.f19138b) && C15240j2.m66082y(this.f19139c, zVar.f19139c) && C15240j2.m66082y(this.f19140d, zVar.f19140d) && C15240j2.m66082y(this.f19141e, zVar.f19141e) && C15240j2.m66082y(this.f19142f, zVar.f19142f) && C15240j2.m66082y(this.f19143g, zVar.f19143g) && C15240j2.m66082y(this.f19144h, zVar.f19144h)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((C15240j2.m66056K(this.f19137a) * 31) + C15240j2.m66056K(this.f19138b)) * 31) + C15240j2.m66056K(this.f19139c)) * 31) + C15240j2.m66056K(this.f19140d)) * 31) + C15240j2.m66056K(this.f19141e)) * 31) + C15240j2.m66056K(this.f19142f)) * 31) + C15240j2.m66056K(this.f19143g)) * 31) + C15240j2.m66056K(this.f19144h);
    }

    public C7949z(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.f19137a = j;
        this.f19138b = j2;
        this.f19139c = j3;
        this.f19140d = j4;
        this.f19141e = j5;
        this.f19142f = j6;
        this.f19143g = j7;
        this.f19144h = j8;
    }
}
