package androidx.compose.p004ui.text;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.graphics.C15231i3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.o */
public final class C16358o {
    @C12579k

    /* renamed from: a */
    public final C16355n f40593a;

    /* renamed from: b */
    public final int f40594b;

    /* renamed from: c */
    public final int f40595c;

    /* renamed from: d */
    public int f40596d;

    /* renamed from: e */
    public int f40597e;

    /* renamed from: f */
    public float f40598f;

    /* renamed from: g */
    public float f40599g;

    public C16358o(@C12579k C16355n nVar, int i, int i2, int i3, int i4, float f, float f2) {
        Intrinsics.checkNotNullParameter(nVar, "paragraph");
        this.f40593a = nVar;
        this.f40594b = i;
        this.f40595c = i2;
        this.f40596d = i3;
        this.f40597e = i4;
        this.f40598f = f;
        this.f40599g = f2;
    }

    /* renamed from: i */
    public static /* synthetic */ C16358o m73748i(C16358o oVar, C16355n nVar, int i, int i2, int i3, int i4, float f, float f2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            nVar = oVar.f40593a;
        }
        if ((i5 & 2) != 0) {
            i = oVar.f40594b;
        }
        int i6 = i;
        if ((i5 & 4) != 0) {
            i2 = oVar.f40595c;
        }
        int i7 = i2;
        if ((i5 & 8) != 0) {
            i3 = oVar.f40596d;
        }
        int i8 = i3;
        if ((i5 & 16) != 0) {
            i4 = oVar.f40597e;
        }
        int i9 = i4;
        if ((i5 & 32) != 0) {
            f = oVar.f40598f;
        }
        float f3 = f;
        if ((i5 & 64) != 0) {
            f2 = oVar.f40599g;
        }
        return oVar.mo47443h(nVar, i6, i7, i8, i9, f3, f2);
    }

    /* renamed from: A */
    public final float mo47430A(float f) {
        return f + this.f40598f;
    }

    /* renamed from: B */
    public final long mo47431B(long j) {
        return C15096g.m64898a(C15094f.m64880p(j), C15094f.m64882r(j) - this.f40598f);
    }

    /* renamed from: C */
    public final int mo47432C(int i) {
        return C11479u.m44334I(i, this.f40594b, this.f40595c) - this.f40594b;
    }

    /* renamed from: D */
    public final int mo47433D(int i) {
        return i - this.f40596d;
    }

    /* renamed from: E */
    public final float mo47434E(float f) {
        return f - this.f40598f;
    }

    @C12579k
    /* renamed from: a */
    public final C16355n mo47435a() {
        return this.f40593a;
    }

    /* renamed from: b */
    public final int mo47436b() {
        return this.f40594b;
    }

    /* renamed from: c */
    public final int mo47437c() {
        return this.f40595c;
    }

    /* renamed from: d */
    public final int mo47438d() {
        return this.f40596d;
    }

    /* renamed from: e */
    public final int mo47439e() {
        return this.f40597e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16358o)) {
            return false;
        }
        C16358o oVar = (C16358o) obj;
        return Intrinsics.areEqual((Object) this.f40593a, (Object) oVar.f40593a) && this.f40594b == oVar.f40594b && this.f40595c == oVar.f40595c && this.f40596d == oVar.f40596d && this.f40597e == oVar.f40597e && Float.compare(this.f40598f, oVar.f40598f) == 0 && Float.compare(this.f40599g, oVar.f40599g) == 0;
    }

    /* renamed from: f */
    public final float mo47441f() {
        return this.f40598f;
    }

    /* renamed from: g */
    public final float mo47442g() {
        return this.f40599g;
    }

    @C12579k
    /* renamed from: h */
    public final C16358o mo47443h(@C12579k C16355n nVar, int i, int i2, int i3, int i4, float f, float f2) {
        Intrinsics.checkNotNullParameter(nVar, "paragraph");
        return new C16358o(nVar, i, i2, i3, i4, f, f2);
    }

    public int hashCode() {
        return (((((((((((this.f40593a.hashCode() * 31) + Integer.hashCode(this.f40594b)) * 31) + Integer.hashCode(this.f40595c)) * 31) + Integer.hashCode(this.f40596d)) * 31) + Integer.hashCode(this.f40597e)) * 31) + Float.hashCode(this.f40598f)) * 31) + Float.hashCode(this.f40599g);
    }

    /* renamed from: j */
    public final float mo47445j() {
        return this.f40599g;
    }

    /* renamed from: k */
    public final int mo47446k() {
        return this.f40595c;
    }

    /* renamed from: l */
    public final int mo47447l() {
        return this.f40597e;
    }

    /* renamed from: m */
    public final int mo47448m() {
        return this.f40595c - this.f40594b;
    }

    @C12579k
    /* renamed from: n */
    public final C16355n mo47449n() {
        return this.f40593a;
    }

    /* renamed from: o */
    public final int mo47450o() {
        return this.f40594b;
    }

    /* renamed from: p */
    public final int mo47451p() {
        return this.f40596d;
    }

    /* renamed from: q */
    public final float mo47452q() {
        return this.f40598f;
    }

    /* renamed from: r */
    public final void mo47453r(float f) {
        this.f40599g = f;
    }

    /* renamed from: s */
    public final void mo47454s(int i) {
        this.f40597e = i;
    }

    /* renamed from: t */
    public final void mo47455t(int i) {
        this.f40596d = i;
    }

    @C12579k
    public String toString() {
        return "ParagraphInfo(paragraph=" + this.f40593a + ", startIndex=" + this.f40594b + ", endIndex=" + this.f40595c + ", startLineIndex=" + this.f40596d + ", endLineIndex=" + this.f40597e + ", top=" + this.f40598f + ", bottom=" + this.f40599g + ')';
    }

    /* renamed from: u */
    public final void mo47457u(float f) {
        this.f40598f = f;
    }

    @C12579k
    /* renamed from: v */
    public final C15098i mo47458v(@C12579k C15098i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return iVar.mo42261S(C15096g.m64898a(0.0f, this.f40598f));
    }

    @C12579k
    /* renamed from: w */
    public final C15231i3 mo47459w(@C12579k C15231i3 i3Var) {
        Intrinsics.checkNotNullParameter(i3Var, "<this>");
        i3Var.mo42810j(C15096g.m64898a(0.0f, this.f40598f));
        return i3Var;
    }

    /* renamed from: x */
    public final long mo47460x(long j) {
        return C16359o0.m73780b(mo47461y(C16356n0.m73742n(j)), mo47461y(C16356n0.m73737i(j)));
    }

    /* renamed from: y */
    public final int mo47461y(int i) {
        return i + this.f40594b;
    }

    /* renamed from: z */
    public final int mo47462z(int i) {
        return i + this.f40596d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16358o(C16355n nVar, int i, int i2, int i3, int i4, float f, float f2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, i, i2, (i5 & 8) != 0 ? -1 : i3, (i5 & 16) != 0 ? -1 : i4, (i5 & 32) != 0 ? -1.0f : f, (i5 & 64) != 0 ? -1.0f : f2);
    }
}
