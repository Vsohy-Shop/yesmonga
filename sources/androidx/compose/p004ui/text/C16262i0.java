package androidx.compose.p004ui.text;

import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16449r;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16478c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16502r;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8585m0;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C16259h
@C8585m0
/* renamed from: androidx.compose.ui.text.i0 */
public final class C16262i0 {
    @C12579k

    /* renamed from: f */
    public static final C16263a f40381f = new C16263a((DefaultConstructorMarker) null);

    /* renamed from: g */
    public static final int f40382g = 0;
    @C12579k

    /* renamed from: a */
    public final C16242u.C16244b f40383a;
    @C12579k

    /* renamed from: b */
    public final C16479d f40384b;
    @C12579k

    /* renamed from: c */
    public final LayoutDirection f40385c;

    /* renamed from: d */
    public final int f40386d;
    @C12580l

    /* renamed from: e */
    public final C16166f0 f40387e;

    /* renamed from: androidx.compose.ui.text.i0$a */
    public static final class C16263a {
        public /* synthetic */ C16263a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final C16260h0 mo47075b(C16258g0 g0Var) {
            boolean z;
            int i;
            int i2;
            MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(g0Var.mo47040n(), C16402q0.m73989d(g0Var.mo47039m(), g0Var.mo47032f()), g0Var.mo47036i(), g0Var.mo47029d(), g0Var.mo47030e());
            int r = C16476b.m74364r(g0Var.mo47028c());
            boolean z2 = false;
            if (g0Var.mo47038l() || C16449r.m74263g(g0Var.mo47034h(), C16449r.f40760b.mo47727c())) {
                z = true;
            } else {
                z = false;
            }
            if (!z || !C16476b.m74356j(g0Var.mo47028c())) {
                i = Integer.MAX_VALUE;
            } else {
                i = C16476b.m74362p(g0Var.mo47028c());
            }
            if (!g0Var.mo47038l() && C16449r.m74263g(g0Var.mo47034h(), C16449r.f40760b.mo47727c())) {
                z2 = true;
            }
            if (z2) {
                i2 = 1;
            } else {
                i2 = g0Var.mo47033g();
            }
            if (r != i) {
                i = C11479u.m44334I(C16406s.m74005k(multiParagraphIntrinsics.mo46227a()), r, i);
            }
            C16349k kVar = new C16349k(multiParagraphIntrinsics, C16478c.m74377b(0, i, 0, C16476b.m74361o(g0Var.mo47028c()), 5, (Object) null), i2, C16449r.m74263g(g0Var.mo47034h(), C16449r.f40760b.mo47727c()), (DefaultConstructorMarker) null);
            return new C16260h0(g0Var, kVar, C16478c.m74379d(g0Var.mo47028c(), C16502r.m74668a((int) ((float) Math.ceil((double) kVar.mo47390E())), (int) ((float) Math.ceil((double) kVar.mo47405g())))), (DefaultConstructorMarker) null);
        }

        public C16263a() {
        }
    }

    public C16262i0(@C12579k C16242u.C16244b bVar, @C12579k C16479d dVar, @C12579k LayoutDirection layoutDirection, int i) {
        Intrinsics.checkNotNullParameter(bVar, "fallbackFontFamilyResolver");
        Intrinsics.checkNotNullParameter(dVar, "fallbackDensity");
        Intrinsics.checkNotNullParameter(layoutDirection, "fallbackLayoutDirection");
        this.f40383a = bVar;
        this.f40384b = dVar;
        this.f40385c = layoutDirection;
        this.f40386d = i;
        this.f40387e = i > 0 ? new C16166f0(i) : null;
    }

    /* renamed from: b */
    public static /* synthetic */ C16260h0 m73262b(C16262i0 i0Var, String str, C16361p0 p0Var, int i, boolean z, int i2, long j, LayoutDirection layoutDirection, C16479d dVar, C16242u.C16244b bVar, boolean z2, int i3, Object obj) {
        C16361p0 p0Var2;
        int i4;
        boolean z3;
        int i5;
        long j2;
        LayoutDirection layoutDirection2;
        C16479d dVar2;
        C16242u.C16244b bVar2;
        boolean z4;
        C16262i0 i0Var2 = i0Var;
        int i6 = i3;
        if ((i6 & 2) != 0) {
            p0Var2 = C16361p0.f40603d.mo47519a();
        } else {
            p0Var2 = p0Var;
        }
        if ((i6 & 4) != 0) {
            i4 = C16449r.f40760b.mo47726a();
        } else {
            i4 = i;
        }
        if ((i6 & 8) != 0) {
            z3 = true;
        } else {
            z3 = z;
        }
        if ((i6 & 16) != 0) {
            i5 = Integer.MAX_VALUE;
        } else {
            i5 = i2;
        }
        if ((i6 & 32) != 0) {
            j2 = C16478c.m74377b(0, 0, 0, 0, 15, (Object) null);
        } else {
            j2 = j;
        }
        if ((i6 & 64) != 0) {
            layoutDirection2 = i0Var2.f40385c;
        } else {
            layoutDirection2 = layoutDirection;
        }
        if ((i6 & 128) != 0) {
            dVar2 = i0Var2.f40384b;
        } else {
            dVar2 = dVar;
        }
        if ((i6 & 256) != 0) {
            bVar2 = i0Var2.f40383a;
        } else {
            bVar2 = bVar;
        }
        if ((i6 & 512) != 0) {
            z4 = false;
        } else {
            z4 = z2;
        }
        return i0Var.mo47073a(str, p0Var2, i4, z3, i5, j2, layoutDirection2, dVar2, bVar2, z4);
    }

    /* renamed from: d */
    public static /* synthetic */ C16260h0 m73263d(C16262i0 i0Var, C16156d dVar, C16361p0 p0Var, int i, boolean z, int i2, List list, long j, LayoutDirection layoutDirection, C16479d dVar2, C16242u.C16244b bVar, boolean z2, int i3, Object obj) {
        C16361p0 p0Var2;
        int i4;
        boolean z3;
        int i5;
        List list2;
        long j2;
        LayoutDirection layoutDirection2;
        C16479d dVar3;
        C16242u.C16244b bVar2;
        boolean z4;
        C16262i0 i0Var2 = i0Var;
        int i6 = i3;
        if ((i6 & 2) != 0) {
            p0Var2 = C16361p0.f40603d.mo47519a();
        } else {
            p0Var2 = p0Var;
        }
        if ((i6 & 4) != 0) {
            i4 = C16449r.f40760b.mo47726a();
        } else {
            i4 = i;
        }
        if ((i6 & 8) != 0) {
            z3 = true;
        } else {
            z3 = z;
        }
        if ((i6 & 16) != 0) {
            i5 = Integer.MAX_VALUE;
        } else {
            i5 = i2;
        }
        if ((i6 & 32) != 0) {
            list2 = CollectionsKt__CollectionsKt.m40441E();
        } else {
            list2 = list;
        }
        if ((i6 & 64) != 0) {
            j2 = C16478c.m74377b(0, 0, 0, 0, 15, (Object) null);
        } else {
            j2 = j;
        }
        if ((i6 & 128) != 0) {
            layoutDirection2 = i0Var2.f40385c;
        } else {
            layoutDirection2 = layoutDirection;
        }
        if ((i6 & 256) != 0) {
            dVar3 = i0Var2.f40384b;
        } else {
            dVar3 = dVar2;
        }
        if ((i6 & 512) != 0) {
            bVar2 = i0Var2.f40383a;
        } else {
            bVar2 = bVar;
        }
        if ((i6 & 1024) != 0) {
            z4 = false;
        } else {
            z4 = z2;
        }
        return i0Var.mo47074c(dVar, p0Var2, i4, z3, i5, list2, j2, layoutDirection2, dVar3, bVar2, z4);
    }

    @C8547h2
    @C12579k
    /* renamed from: a */
    public final C16260h0 mo47073a(@C12579k String str, @C12579k C16361p0 p0Var, int i, boolean z, int i2, long j, @C12579k LayoutDirection layoutDirection, @C12579k C16479d dVar, @C12579k C16242u.C16244b bVar, boolean z2) {
        String str2 = str;
        Intrinsics.checkNotNullParameter(str2, "text");
        Intrinsics.checkNotNullParameter(p0Var, "style");
        LayoutDirection layoutDirection2 = layoutDirection;
        Intrinsics.checkNotNullParameter(layoutDirection2, "layoutDirection");
        C16479d dVar2 = dVar;
        Intrinsics.checkNotNullParameter(dVar2, "density");
        C16242u.C16244b bVar2 = bVar;
        Intrinsics.checkNotNullParameter(bVar2, "fontFamilyResolver");
        return m73263d(this, new C16156d(str2, (List) null, (List) null, 6, (DefaultConstructorMarker) null), p0Var, i, z, i2, (List) null, j, layoutDirection2, dVar2, bVar2, z2, 32, (Object) null);
    }

    @C8547h2
    @C12579k
    /* renamed from: c */
    public final C16260h0 mo47074c(@C12579k C16156d dVar, @C12579k C16361p0 p0Var, int i, boolean z, int i2, @C12579k List<C16156d.C16159b<C16454v>> list, long j, @C12579k LayoutDirection layoutDirection, @C12579k C16479d dVar2, @C12579k C16242u.C16244b bVar, boolean z2) {
        C16260h0 h0Var;
        C16166f0 f0Var;
        C16156d dVar3 = dVar;
        Intrinsics.checkNotNullParameter(dVar3, "text");
        C16361p0 p0Var2 = p0Var;
        Intrinsics.checkNotNullParameter(p0Var2, "style");
        List<C16156d.C16159b<C16454v>> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "placeholders");
        LayoutDirection layoutDirection2 = layoutDirection;
        Intrinsics.checkNotNullParameter(layoutDirection2, "layoutDirection");
        C16479d dVar4 = dVar2;
        Intrinsics.checkNotNullParameter(dVar4, "density");
        C16242u.C16244b bVar2 = bVar;
        Intrinsics.checkNotNullParameter(bVar2, "fontFamilyResolver");
        C16258g0 g0Var = new C16258g0(dVar3, p0Var2, (List) list2, i2, z, i, dVar4, layoutDirection2, bVar2, j, (DefaultConstructorMarker) null);
        if (z2 || (f0Var = this.f40387e) == null) {
            h0Var = null;
        } else {
            h0Var = f0Var.mo46751a(g0Var);
        }
        if (h0Var != null) {
            return h0Var.mo47046a(g0Var, C16478c.m74379d(j, C16502r.m74668a(C16406s.m74005k(h0Var.mo47069w().mo47390E()), C16406s.m74005k(h0Var.mo47069w().mo47405g()))));
        }
        C16260h0 a = f40381f.mo47075b(g0Var);
        C16166f0 f0Var2 = this.f40387e;
        if (f0Var2 != null) {
            f0Var2.mo46752b(g0Var, a);
        }
        return a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16262i0(C16242u.C16244b bVar, C16479d dVar, LayoutDirection layoutDirection, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, dVar, layoutDirection, (i2 & 8) != 0 ? C16350k0.m73677a() : i);
    }
}
