package androidx.compose.p004ui.text.font;

import androidx.compose.p004ui.text.C16259h;
import androidx.compose.p004ui.text.font.C16201h0;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.font.u0 */
public final class C16245u0 implements C16238t {

    /* renamed from: h */
    public static final int f40348h = 0;

    /* renamed from: c */
    public final int f40349c;
    @C12579k

    /* renamed from: d */
    public final C16209i0 f40350d;

    /* renamed from: e */
    public final int f40351e;
    @C12579k

    /* renamed from: f */
    public final C16201h0.C16206e f40352f;

    /* renamed from: g */
    public final int f40353g;

    public /* synthetic */ C16245u0(int i, C16209i0 i0Var, int i2, @C16259h C16201h0.C16206e eVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i0Var, i2, eVar, i3);
    }

    /* renamed from: d */
    public static /* synthetic */ C16245u0 m73176d(C16245u0 u0Var, int i, C16209i0 i0Var, int i2, int i3, C16201h0.C16206e eVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = u0Var.f40349c;
        }
        if ((i4 & 2) != 0) {
            i0Var = u0Var.getWeight();
        }
        C16209i0 i0Var2 = i0Var;
        if ((i4 & 4) != 0) {
            i2 = u0Var.mo46930b();
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            i3 = u0Var.mo46868a();
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            eVar = u0Var.f40352f;
        }
        return u0Var.mo47012c(i, i0Var2, i5, i6, eVar);
    }

    /* renamed from: f */
    public static /* synthetic */ C16245u0 m73177f(C16245u0 u0Var, int i, C16209i0 i0Var, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = u0Var.f40349c;
        }
        if ((i3 & 2) != 0) {
            i0Var = u0Var.getWeight();
        }
        if ((i3 & 4) != 0) {
            i2 = u0Var.mo46930b();
        }
        return u0Var.mo47013e(i, i0Var, i2);
    }

    @C16259h
    /* renamed from: g */
    public static /* synthetic */ void m73178g() {
    }

    @C16259h
    /* renamed from: a */
    public int mo46868a() {
        return this.f40353g;
    }

    /* renamed from: b */
    public int mo46930b() {
        return this.f40351e;
    }

    @C16259h
    @C12579k
    /* renamed from: c */
    public final C16245u0 mo47012c(int i, @C12579k C16209i0 i0Var, int i2, int i3, @C12579k C16201h0.C16206e eVar) {
        Intrinsics.checkNotNullParameter(i0Var, "weight");
        Intrinsics.checkNotNullParameter(eVar, "variationSettings");
        return new C16245u0(i, i0Var, i2, eVar, i3, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: e */
    public final C16245u0 mo47013e(int i, @C12579k C16209i0 i0Var, int i2) {
        Intrinsics.checkNotNullParameter(i0Var, "weight");
        return m73176d(this, i, i0Var, i2, mo46868a(), (C16201h0.C16206e) null, 16, (Object) null);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16245u0)) {
            return false;
        }
        C16245u0 u0Var = (C16245u0) obj;
        if (this.f40349c == u0Var.f40349c && Intrinsics.areEqual((Object) getWeight(), (Object) u0Var.getWeight()) && C16190e0.m72951f(mo46930b(), u0Var.mo46930b()) && Intrinsics.areEqual((Object) this.f40352f, (Object) u0Var.f40352f) && C16182c0.m72919g(mo46868a(), u0Var.mo46868a())) {
            return true;
        }
        return false;
    }

    @C12579k
    public C16209i0 getWeight() {
        return this.f40350d;
    }

    /* renamed from: h */
    public final int mo47015h() {
        return this.f40349c;
    }

    public int hashCode() {
        return (((((((this.f40349c * 31) + getWeight().hashCode()) * 31) + C16190e0.m72952h(mo46930b())) * 31) + C16182c0.m72920i(mo46868a())) * 31) + this.f40352f.hashCode();
    }

    @C16259h
    @C12579k
    /* renamed from: i */
    public final C16201h0.C16206e mo47017i() {
        return this.f40352f;
    }

    @C12579k
    public String toString() {
        return "ResourceFont(resId=" + this.f40349c + ", weight=" + getWeight() + ", style=" + C16190e0.m72953i(mo46930b()) + ", loadingStrategy=" + C16182c0.m72921j(mo46868a()) + ')';
    }

    public C16245u0(int i, C16209i0 i0Var, int i2, C16201h0.C16206e eVar, int i3) {
        this.f40349c = i;
        this.f40350d = i0Var;
        this.f40351e = i2;
        this.f40352f = eVar;
        this.f40353g = i3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C16245u0(int r8, androidx.compose.p004ui.text.font.C16209i0 r9, int r10, androidx.compose.p004ui.text.font.C16201h0.C16206e r11, int r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r7 = this;
            r14 = r13 & 2
            if (r14 == 0) goto L_0x000a
            androidx.compose.ui.text.font.i0$a r9 = androidx.compose.p004ui.text.font.C16209i0.f40292b
            androidx.compose.ui.text.font.i0 r9 = r9.mo46952m()
        L_0x000a:
            r2 = r9
            r9 = r13 & 4
            if (r9 == 0) goto L_0x0015
            androidx.compose.ui.text.font.e0$a r9 = androidx.compose.p004ui.text.font.C16190e0.f40252b
            int r10 = r9.mo46883b()
        L_0x0015:
            r3 = r10
            r9 = r13 & 8
            if (r9 == 0) goto L_0x0023
            androidx.compose.ui.text.font.h0 r9 = androidx.compose.p004ui.text.font.C16201h0.f40264a
            r10 = 0
            androidx.compose.ui.text.font.h0$a[] r10 = new androidx.compose.p004ui.text.font.C16201h0.C16202a[r10]
            androidx.compose.ui.text.font.h0$e r11 = r9.mo46904b(r2, r3, r10)
        L_0x0023:
            r4 = r11
            r9 = r13 & 16
            if (r9 == 0) goto L_0x002e
            androidx.compose.ui.text.font.c0$a r9 = androidx.compose.p004ui.text.font.C16182c0.f40243b
            int r12 = r9.mo46865a()
        L_0x002e:
            r5 = r12
            r6 = 0
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.font.C16245u0.<init>(int, androidx.compose.ui.text.font.i0, int, androidx.compose.ui.text.font.h0$e, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
