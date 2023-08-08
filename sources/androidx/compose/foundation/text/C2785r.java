package androidx.compose.foundation.text;

import androidx.compose.p004ui.graphics.C15118b2;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16258g0;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16349k;
import androidx.compose.p004ui.text.C16352l0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.C16402q0;
import androidx.compose.p004ui.text.C16454v;
import androidx.compose.p004ui.text.MultiParagraphIntrinsics;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16449r;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16478c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16502r;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8547h2;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C2767e
@C8547h2
/* renamed from: androidx.compose.foundation.text.r */
public final class C2785r {
    @C12579k

    /* renamed from: l */
    public static final C2786a f7326l = new C2786a((DefaultConstructorMarker) null);

    /* renamed from: m */
    public static final int f7327m = 0;
    @C12579k

    /* renamed from: a */
    public final C16156d f7328a;
    @C12579k

    /* renamed from: b */
    public final C16361p0 f7329b;

    /* renamed from: c */
    public final int f7330c;

    /* renamed from: d */
    public final int f7331d;

    /* renamed from: e */
    public final boolean f7332e;

    /* renamed from: f */
    public final int f7333f;
    @C12579k

    /* renamed from: g */
    public final C16479d f7334g;
    @C12579k

    /* renamed from: h */
    public final C16242u.C16244b f7335h;
    @C12579k

    /* renamed from: i */
    public final List<C16156d.C16159b<C16454v>> f7336i;
    @C12580l

    /* renamed from: j */
    public MultiParagraphIntrinsics f7337j;
    @C12580l

    /* renamed from: k */
    public LayoutDirection f7338k;

    /* renamed from: androidx.compose.foundation.text.r$a */
    public static final class C2786a {
        public /* synthetic */ C2786a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo9585a(@C12579k C15118b2 b2Var, @C12579k C16260h0 h0Var) {
            Intrinsics.checkNotNullParameter(b2Var, "canvas");
            Intrinsics.checkNotNullParameter(h0Var, "textLayoutResult");
            C16352l0.f40587a.mo47424a(b2Var, h0Var);
        }

        public C2786a() {
        }
    }

    public /* synthetic */ C2785r(C16156d dVar, C16361p0 p0Var, int i, int i2, boolean z, int i3, C16479d dVar2, C16242u.C16244b bVar, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, p0Var, i, i2, z, i3, dVar2, bVar, list);
    }

    /* renamed from: p */
    public static /* synthetic */ C16260h0 m12642p(C2785r rVar, long j, LayoutDirection layoutDirection, C16260h0 h0Var, int i, Object obj) {
        if ((i & 4) != 0) {
            h0Var = null;
        }
        return rVar.mo9580o(j, layoutDirection, h0Var);
    }

    @C12579k
    /* renamed from: a */
    public final C16479d mo9566a() {
        return this.f7334g;
    }

    @C12579k
    /* renamed from: b */
    public final C16242u.C16244b mo9567b() {
        return this.f7335h;
    }

    @C12580l
    /* renamed from: c */
    public final LayoutDirection mo9568c() {
        return this.f7338k;
    }

    /* renamed from: d */
    public final int mo9569d() {
        return C2787s.m12663a(mo9573h().mo46227a());
    }

    /* renamed from: e */
    public final int mo9570e() {
        return this.f7330c;
    }

    /* renamed from: f */
    public final int mo9571f() {
        return C2787s.m12663a(mo9573h().mo46228b());
    }

    /* renamed from: g */
    public final int mo9572g() {
        return this.f7331d;
    }

    /* renamed from: h */
    public final MultiParagraphIntrinsics mo9573h() {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.f7337j;
        if (multiParagraphIntrinsics != null) {
            return multiParagraphIntrinsics;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    /* renamed from: i */
    public final int mo9574i() {
        return this.f7333f;
    }

    @C12580l
    /* renamed from: j */
    public final MultiParagraphIntrinsics mo9575j() {
        return this.f7337j;
    }

    @C12579k
    /* renamed from: k */
    public final List<C16156d.C16159b<C16454v>> mo9576k() {
        return this.f7336i;
    }

    /* renamed from: l */
    public final boolean mo9577l() {
        return this.f7332e;
    }

    @C12579k
    /* renamed from: m */
    public final C16361p0 mo9578m() {
        return this.f7329b;
    }

    @C12579k
    /* renamed from: n */
    public final C16156d mo9579n() {
        return this.f7328a;
    }

    @C12579k
    /* renamed from: o */
    public final C16260h0 mo9580o(long j, @C12579k LayoutDirection layoutDirection, @C12580l C16260h0 h0Var) {
        long j2 = j;
        C16260h0 h0Var2 = h0Var;
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (h0Var2 != null) {
            if (C2850x.m13146a(h0Var, this.f7328a, this.f7329b, this.f7336i, this.f7330c, this.f7332e, this.f7333f, this.f7334g, layoutDirection, this.f7335h, j)) {
                C16258g0 g0Var = r1;
                C16258g0 g0Var2 = new C16258g0(h0Var.mo47058l().mo47040n(), this.f7329b, (List) h0Var.mo47058l().mo47036i(), h0Var.mo47058l().mo47033g(), h0Var.mo47058l().mo47038l(), h0Var.mo47058l().mo47034h(), h0Var.mo47058l().mo47029d(), h0Var.mo47058l().mo47032f(), h0Var.mo47058l().mo47030e(), j, (DefaultConstructorMarker) null);
                return h0Var.mo47046a(g0Var, C16478c.m74379d(j2, C16502r.m74668a(C2787s.m12663a(h0Var.mo47069w().mo47390E()), C2787s.m12663a(h0Var.mo47069w().mo47405g()))));
            }
        }
        C16349k r = mo9582r(j, layoutDirection);
        return new C16260h0(new C16258g0(this.f7328a, this.f7329b, (List) this.f7336i, this.f7330c, this.f7332e, this.f7333f, this.f7334g, layoutDirection, this.f7335h, j, (DefaultConstructorMarker) null), r, C16478c.m74379d(j2, C16502r.m74668a(C2787s.m12663a(r.mo47390E()), C2787s.m12663a(r.mo47405g()))), (DefaultConstructorMarker) null);
    }

    /* renamed from: q */
    public final void mo9581q(@C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.f7337j;
        if (multiParagraphIntrinsics == null || layoutDirection != this.f7338k || multiParagraphIntrinsics.mo46229c()) {
            this.f7338k = layoutDirection;
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(this.f7328a, C16402q0.m73989d(this.f7329b, layoutDirection), this.f7336i, this.f7334g, this.f7335h);
        }
        this.f7337j = multiParagraphIntrinsics;
    }

    /* renamed from: r */
    public final C16349k mo9582r(long j, LayoutDirection layoutDirection) {
        boolean z;
        int i;
        mo9581q(layoutDirection);
        int r = C16476b.m74364r(j);
        boolean z2 = false;
        int i2 = 1;
        if (this.f7332e || C16449r.m74263g(this.f7333f, C16449r.f40760b.mo47727c())) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !C16476b.m74356j(j)) {
            i = Integer.MAX_VALUE;
        } else {
            i = C16476b.m74362p(j);
        }
        if (!this.f7332e && C16449r.m74263g(this.f7333f, C16449r.f40760b.mo47727c())) {
            z2 = true;
        }
        if (!z2) {
            i2 = this.f7330c;
        }
        int i3 = i2;
        if (r != i) {
            i = C11479u.m44334I(mo9569d(), r, i);
        }
        return new C16349k(mo9573h(), C16478c.m74377b(0, i, 0, C16476b.m74361o(j), 5, (Object) null), i3, C16449r.m74263g(this.f7333f, C16449r.f40760b.mo47727c()), (DefaultConstructorMarker) null);
    }

    /* renamed from: s */
    public final void mo9583s(@C12580l LayoutDirection layoutDirection) {
        this.f7338k = layoutDirection;
    }

    /* renamed from: t */
    public final void mo9584t(@C12580l MultiParagraphIntrinsics multiParagraphIntrinsics) {
        this.f7337j = multiParagraphIntrinsics;
    }

    public C2785r(C16156d dVar, C16361p0 p0Var, int i, int i2, boolean z, int i3, C16479d dVar2, C16242u.C16244b bVar, List<C16156d.C16159b<C16454v>> list) {
        this.f7328a = dVar;
        this.f7329b = p0Var;
        this.f7330c = i;
        this.f7331d = i2;
        this.f7332e = z;
        this.f7333f = i3;
        this.f7334g = dVar2;
        this.f7335h = bVar;
        this.f7336i = list;
        boolean z2 = true;
        if (i > 0) {
            if (i2 > 0) {
                if (!(i2 > i ? false : z2)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C2785r(androidx.compose.p004ui.text.C16156d r14, androidx.compose.p004ui.text.C16361p0 r15, int r16, int r17, boolean r18, int r19, androidx.compose.p004ui.unit.C16479d r20, androidx.compose.p004ui.text.font.C16242u.C16244b r21, java.util.List r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r13 = this;
            r0 = r23
            r1 = r0 & 4
            if (r1 == 0) goto L_0x000b
            r1 = 2147483647(0x7fffffff, float:NaN)
            r5 = r1
            goto L_0x000d
        L_0x000b:
            r5 = r16
        L_0x000d:
            r1 = r0 & 8
            r2 = 1
            if (r1 == 0) goto L_0x0014
            r6 = r2
            goto L_0x0016
        L_0x0014:
            r6 = r17
        L_0x0016:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x001c
            r7 = r2
            goto L_0x001e
        L_0x001c:
            r7 = r18
        L_0x001e:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x002a
            androidx.compose.ui.text.style.r$a r1 = androidx.compose.p004ui.text.style.C16449r.f40760b
            int r1 = r1.mo47726a()
            r8 = r1
            goto L_0x002c
        L_0x002a:
            r8 = r19
        L_0x002c:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0036
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r11 = r0
            goto L_0x0038
        L_0x0036:
            r11 = r22
        L_0x0038:
            r12 = 0
            r2 = r13
            r3 = r14
            r4 = r15
            r9 = r20
            r10 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.C2785r.<init>(androidx.compose.ui.text.d, androidx.compose.ui.text.p0, int, int, boolean, int, androidx.compose.ui.unit.d, androidx.compose.ui.text.font.u$b, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
