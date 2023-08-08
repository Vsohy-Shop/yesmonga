package androidx.compose.p004ui.text;

import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.font.C16226o;
import androidx.compose.p004ui.text.font.C16238t;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16449r;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.C8567o;
import java.util.List;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.g0 */
public final class C16258g0 {

    /* renamed from: l */
    public static final int f40362l = 8;
    @C12579k

    /* renamed from: a */
    public final C16156d f40363a;
    @C12579k

    /* renamed from: b */
    public final C16361p0 f40364b;
    @C12579k

    /* renamed from: c */
    public final List<C16156d.C16159b<C16454v>> f40365c;

    /* renamed from: d */
    public final int f40366d;

    /* renamed from: e */
    public final boolean f40367e;

    /* renamed from: f */
    public final int f40368f;
    @C12579k

    /* renamed from: g */
    public final C16479d f40369g;
    @C12579k

    /* renamed from: h */
    public final LayoutDirection f40370h;
    @C12579k

    /* renamed from: i */
    public final C16242u.C16244b f40371i;

    /* renamed from: j */
    public final long f40372j;
    @C12580l

    /* renamed from: k */
    public C16238t.C16240b f40373k;

    @C11395k(message = "Font.ResourceLoader is replaced with FontFamily.Resolver", replaceWith = @C11587t0(expression = "TextLayoutInput(text, style, placeholders, maxLines, softWrap, overflow, density, layoutDirection, fontFamilyResolver, constraints", imports = {}))
    public /* synthetic */ C16258g0(C16156d dVar, C16361p0 p0Var, List list, int i, boolean z, int i2, C16479d dVar2, LayoutDirection layoutDirection, C16238t.C16240b bVar, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, p0Var, (List<C16156d.C16159b<C16454v>>) list, i, z, i2, dVar2, layoutDirection, bVar, j);
    }

    /* renamed from: b */
    public static /* synthetic */ C16258g0 m73218b(C16258g0 g0Var, C16156d dVar, C16361p0 p0Var, List list, int i, boolean z, int i2, C16479d dVar2, LayoutDirection layoutDirection, C16238t.C16240b bVar, long j, int i3, Object obj) {
        C16156d dVar3;
        C16361p0 p0Var2;
        List list2;
        int i4;
        boolean z2;
        int i5;
        C16479d dVar4;
        LayoutDirection layoutDirection2;
        C16238t.C16240b bVar2;
        long j2;
        C16258g0 g0Var2 = g0Var;
        int i6 = i3;
        if ((i6 & 1) != 0) {
            dVar3 = g0Var2.f40363a;
        } else {
            dVar3 = dVar;
        }
        if ((i6 & 2) != 0) {
            p0Var2 = g0Var2.f40364b;
        } else {
            p0Var2 = p0Var;
        }
        if ((i6 & 4) != 0) {
            list2 = g0Var2.f40365c;
        } else {
            list2 = list;
        }
        if ((i6 & 8) != 0) {
            i4 = g0Var2.f40366d;
        } else {
            i4 = i;
        }
        if ((i6 & 16) != 0) {
            z2 = g0Var2.f40367e;
        } else {
            z2 = z;
        }
        if ((i6 & 32) != 0) {
            i5 = g0Var2.f40368f;
        } else {
            i5 = i2;
        }
        if ((i6 & 64) != 0) {
            dVar4 = g0Var2.f40369g;
        } else {
            dVar4 = dVar2;
        }
        if ((i6 & 128) != 0) {
            layoutDirection2 = g0Var2.f40370h;
        } else {
            layoutDirection2 = layoutDirection;
        }
        if ((i6 & 256) != 0) {
            bVar2 = g0Var.mo47037j();
        } else {
            bVar2 = bVar;
        }
        if ((i6 & 512) != 0) {
            j2 = g0Var2.f40372j;
        } else {
            j2 = j;
        }
        return g0Var.mo47027a(dVar3, p0Var2, list2, i4, z2, i5, dVar4, layoutDirection2, bVar2, j2);
    }

    @C11395k(message = "Replaced with FontFamily.Resolver", replaceWith = @C11587t0(expression = "fontFamilyResolver", imports = {}))
    /* renamed from: k */
    public static /* synthetic */ void m73219k() {
    }

    @C11395k(message = "Font.ResourceLoader is deprecated", replaceWith = @C11587t0(expression = "TextLayoutInput(text, style, placeholders, maxLines, softWrap, overFlow, density, layoutDirection, fontFamilyResolver, constraints)", imports = {}))
    @C12579k
    /* renamed from: a */
    public final C16258g0 mo47027a(@C12579k C16156d dVar, @C12579k C16361p0 p0Var, @C12579k List<C16156d.C16159b<C16454v>> list, int i, boolean z, int i2, @C12579k C16479d dVar2, @C12579k LayoutDirection layoutDirection, @C12579k C16238t.C16240b bVar, long j) {
        C16156d dVar3 = dVar;
        Intrinsics.checkNotNullParameter(dVar3, "text");
        C16361p0 p0Var2 = p0Var;
        Intrinsics.checkNotNullParameter(p0Var2, "style");
        List<C16156d.C16159b<C16454v>> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "placeholders");
        C16479d dVar4 = dVar2;
        Intrinsics.checkNotNullParameter(dVar4, "density");
        LayoutDirection layoutDirection2 = layoutDirection;
        Intrinsics.checkNotNullParameter(layoutDirection2, "layoutDirection");
        C16238t.C16240b bVar2 = bVar;
        Intrinsics.checkNotNullParameter(bVar2, "resourceLoader");
        return new C16258g0(dVar3, p0Var2, list2, i, z, i2, dVar4, layoutDirection2, bVar2, this.f40371i, j);
    }

    /* renamed from: c */
    public final long mo47028c() {
        return this.f40372j;
    }

    @C12579k
    /* renamed from: d */
    public final C16479d mo47029d() {
        return this.f40369g;
    }

    @C12579k
    /* renamed from: e */
    public final C16242u.C16244b mo47030e() {
        return this.f40371i;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16258g0)) {
            return false;
        }
        C16258g0 g0Var = (C16258g0) obj;
        if (Intrinsics.areEqual((Object) this.f40363a, (Object) g0Var.f40363a) && Intrinsics.areEqual((Object) this.f40364b, (Object) g0Var.f40364b) && Intrinsics.areEqual((Object) this.f40365c, (Object) g0Var.f40365c) && this.f40366d == g0Var.f40366d && this.f40367e == g0Var.f40367e && C16449r.m74263g(this.f40368f, g0Var.f40368f) && Intrinsics.areEqual((Object) this.f40369g, (Object) g0Var.f40369g) && this.f40370h == g0Var.f40370h && Intrinsics.areEqual((Object) this.f40371i, (Object) g0Var.f40371i) && C16476b.m74353g(this.f40372j, g0Var.f40372j)) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: f */
    public final LayoutDirection mo47032f() {
        return this.f40370h;
    }

    /* renamed from: g */
    public final int mo47033g() {
        return this.f40366d;
    }

    /* renamed from: h */
    public final int mo47034h() {
        return this.f40368f;
    }

    public int hashCode() {
        return (((((((((((((((((this.f40363a.hashCode() * 31) + this.f40364b.hashCode()) * 31) + this.f40365c.hashCode()) * 31) + this.f40366d) * 31) + Boolean.hashCode(this.f40367e)) * 31) + C16449r.m74264h(this.f40368f)) * 31) + this.f40369g.hashCode()) * 31) + this.f40370h.hashCode()) * 31) + this.f40371i.hashCode()) * 31) + C16476b.m74366t(this.f40372j);
    }

    @C12579k
    /* renamed from: i */
    public final List<C16156d.C16159b<C16454v>> mo47036i() {
        return this.f40365c;
    }

    @C12579k
    /* renamed from: j */
    public final C16238t.C16240b mo47037j() {
        C16238t.C16240b bVar = this.f40373k;
        if (bVar == null) {
            return C16164f.f40194b.mo46747a(this.f40371i);
        }
        return bVar;
    }

    /* renamed from: l */
    public final boolean mo47038l() {
        return this.f40367e;
    }

    @C12579k
    /* renamed from: m */
    public final C16361p0 mo47039m() {
        return this.f40364b;
    }

    @C12579k
    /* renamed from: n */
    public final C16156d mo47040n() {
        return this.f40363a;
    }

    @C12579k
    public String toString() {
        return "TextLayoutInput(text=" + this.f40363a + ", style=" + this.f40364b + ", placeholders=" + this.f40365c + ", maxLines=" + this.f40366d + ", softWrap=" + this.f40367e + ", overflow=" + C16449r.m74265i(this.f40368f) + ", density=" + this.f40369g + ", layoutDirection=" + this.f40370h + ", fontFamilyResolver=" + this.f40371i + ", constraints=" + C16476b.m74369w(this.f40372j) + ')';
    }

    public /* synthetic */ C16258g0(C16156d dVar, C16361p0 p0Var, List list, int i, boolean z, int i2, C16479d dVar2, LayoutDirection layoutDirection, C16242u.C16244b bVar, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, p0Var, (List<C16156d.C16159b<C16454v>>) list, i, z, i2, dVar2, layoutDirection, bVar, j);
    }

    public C16258g0(C16156d dVar, C16361p0 p0Var, List<C16156d.C16159b<C16454v>> list, int i, boolean z, int i2, C16479d dVar2, LayoutDirection layoutDirection, C16238t.C16240b bVar, C16242u.C16244b bVar2, long j) {
        this.f40363a = dVar;
        this.f40364b = p0Var;
        this.f40365c = list;
        this.f40366d = i;
        this.f40367e = z;
        this.f40368f = i2;
        this.f40369g = dVar2;
        this.f40370h = layoutDirection;
        this.f40371i = bVar2;
        this.f40372j = j;
        this.f40373k = bVar;
    }

    public C16258g0(C16156d dVar, C16361p0 p0Var, List<C16156d.C16159b<C16454v>> list, int i, boolean z, int i2, C16479d dVar2, LayoutDirection layoutDirection, C16238t.C16240b bVar, long j) {
        this(dVar, p0Var, list, i, z, i2, dVar2, layoutDirection, bVar, C16226o.m73118a(bVar), j);
    }

    public C16258g0(C16156d dVar, C16361p0 p0Var, List<C16156d.C16159b<C16454v>> list, int i, boolean z, int i2, C16479d dVar2, LayoutDirection layoutDirection, C16242u.C16244b bVar, long j) {
        this(dVar, p0Var, list, i, z, i2, dVar2, layoutDirection, (C16238t.C16240b) null, bVar, j);
    }
}
