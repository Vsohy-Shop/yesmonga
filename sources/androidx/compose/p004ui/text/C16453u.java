package androidx.compose.p004ui.text;

import androidx.compose.p004ui.text.style.C16415e;
import androidx.compose.p004ui.text.style.C16417f;
import androidx.compose.p004ui.text.style.C16426h;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16436k;
import androidx.compose.p004ui.text.style.C16442o;
import androidx.compose.p004ui.text.style.C16444p;
import androidx.compose.p004ui.text.style.C16445q;
import androidx.compose.p004ui.unit.C16504t;
import androidx.compose.p004ui.unit.C16506u;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8547h2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.text.u */
public final class C16453u {

    /* renamed from: a */
    public static final long f40780a = C16504t.f40903b.mo47903b();

    @C8547h2
    @C12579k
    /* renamed from: a */
    public static final C16451t m74299a(@C12579k C16451t tVar, @C12579k C16451t tVar2, float f) {
        Intrinsics.checkNotNullParameter(tVar, "start");
        Intrinsics.checkNotNullParameter(tVar2, "stop");
        C16432i iVar = (C16432i) SpanStyleKt.m72352c(tVar.mo47742p(), tVar2.mo47742p(), f);
        C16436k kVar = (C16436k) SpanStyleKt.m72352c(tVar.mo47744r(), tVar2.mo47744r(), f);
        long e = SpanStyleKt.m72354e(tVar.mo47739m(), tVar2.mo47739m(), f);
        C16442o s = tVar.mo47745s();
        if (s == null) {
            s = C16442o.f40744c.mo47706a();
        }
        C16442o s2 = tVar2.mo47745s();
        if (s2 == null) {
            s2 = C16442o.f40744c.mo47706a();
        }
        return new C16451t(iVar, kVar, e, C16444p.m74235a(s, s2, f), m74300b(tVar.mo47741o(), tVar2.mo47741o(), f), (C16426h) SpanStyleKt.m72352c(tVar.mo47740n(), tVar2.mo47740n(), f), (C16417f) SpanStyleKt.m72352c(tVar.mo47737k(), tVar2.mo47737k(), f), (C16415e) SpanStyleKt.m72352c(tVar.mo47735i(), tVar2.mo47735i(), f), (C16445q) SpanStyleKt.m72352c(tVar.mo47746t(), tVar2.mo47746t(), f), (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public static final C16457x m74300b(C16457x xVar, C16457x xVar2, float f) {
        if (xVar == null && xVar2 == null) {
            return null;
        }
        if (xVar == null) {
            xVar = C16457x.f40794c.mo47779a();
        }
        if (xVar2 == null) {
            xVar2 = C16457x.f40794c.mo47779a();
        }
        return C16150c.m72641b(xVar, xVar2, f);
    }

    @C12579k
    /* renamed from: c */
    public static final C16451t m74301c(@C12579k C16451t tVar, @C12579k LayoutDirection layoutDirection) {
        long j;
        Intrinsics.checkNotNullParameter(tVar, "style");
        Intrinsics.checkNotNullParameter(layoutDirection, "direction");
        C16432i g = C16432i.m74172g(tVar.mo47743q());
        C16436k f = C16436k.m74204f(C16402q0.m73990e(layoutDirection, tVar.mo47744r()));
        if (C16506u.m74718s(tVar.mo47739m())) {
            j = f40780a;
        } else {
            j = tVar.mo47739m();
        }
        C16442o s = tVar.mo47745s();
        if (s == null) {
            s = C16442o.f40744c.mo47706a();
        }
        C16442o oVar = s;
        C16457x o = tVar.mo47741o();
        C16426h n = tVar.mo47740n();
        C16417f d = C16417f.m74063d(tVar.mo47738l());
        C16415e c = C16415e.m74051c(tVar.mo47736j());
        C16445q t = tVar.mo47746t();
        if (t == null) {
            t = C16445q.f40749c.mo47714b();
        }
        return new C16451t(g, f, j, oVar, o, n, d, c, t, (DefaultConstructorMarker) null);
    }
}
