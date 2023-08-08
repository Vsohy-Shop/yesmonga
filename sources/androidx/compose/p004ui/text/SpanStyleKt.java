package androidx.compose.p004ui.text;

import androidx.compose.p004ui.graphics.C15205e4;
import androidx.compose.p004ui.graphics.C15212f4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15258l2;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import androidx.compose.p004ui.graphics.drawscope.C15197l;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16194f0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16213j0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.intl.C16342f;
import androidx.compose.p004ui.text.style.C16410a;
import androidx.compose.p004ui.text.style.C16412b;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16438l;
import androidx.compose.p004ui.text.style.C16439m;
import androidx.compose.p004ui.text.style.C16441n;
import androidx.compose.p004ui.text.style.TextForegroundStyle;
import androidx.compose.p004ui.unit.C16504t;
import androidx.compose.p004ui.unit.C16506u;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nSpanStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyleKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,856:1\n658#2:857\n646#2:858\n*S KotlinDebug\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyleKt\n*L\n851#1:857\n851#1:858\n*E\n"})
/* renamed from: androidx.compose.ui.text.SpanStyleKt */
public final class SpanStyleKt {

    /* renamed from: a */
    public static final long f39920a = C16506u.m74712m(14);

    /* renamed from: b */
    public static final long f39921b = C16506u.m74712m(0);

    /* renamed from: c */
    public static final long f39922c;

    /* renamed from: d */
    public static final long f39923d;

    static {
        C15240j2.C15241a aVar = C15240j2.f37547b;
        f39922c = aVar.mo42850s();
        f39923d = aVar.mo42841a();
    }

    @C12579k
    /* renamed from: b */
    public static final C16151c0 m72351b(@C12579k C16151c0 c0Var, @C12579k C16151c0 c0Var2, float f) {
        float f2;
        float f3;
        float f4 = f;
        Intrinsics.checkNotNullParameter(c0Var, "start");
        Intrinsics.checkNotNullParameter(c0Var2, "stop");
        TextForegroundStyle b = C16438l.m74217b(c0Var.mo46593C(), c0Var2.mo46593C(), f4);
        C16242u uVar = (C16242u) m72352c(c0Var.mo46613r(), c0Var2.mo46613r(), f4);
        long e = m72354e(c0Var.mo46615t(), c0Var2.mo46615t(), f4);
        C16209i0 w = c0Var.mo46619w();
        if (w == null) {
            w = C16209i0.f40292b.mo46952m();
        }
        C16209i0 w2 = c0Var2.mo46619w();
        if (w2 == null) {
            w2 = C16209i0.f40292b.mo46952m();
        }
        C16209i0 a = C16213j0.m73084a(w, w2, f4);
        C16190e0 e0Var = (C16190e0) m72352c(c0Var.mo46617u(), c0Var2.mo46617u(), f4);
        C16194f0 f0Var = (C16194f0) m72352c(c0Var.mo46618v(), c0Var2.mo46618v(), f4);
        String str = (String) m72352c(c0Var.mo46614s(), c0Var2.mo46614s(), f4);
        long e2 = m72354e(c0Var.mo46620x(), c0Var2.mo46620x(), f4);
        C16410a l = c0Var.mo46609l();
        if (l != null) {
            f2 = l.mo47589k();
        } else {
            f2 = C16410a.m74022e(0.0f);
        }
        C16410a l2 = c0Var2.mo46609l();
        if (l2 != null) {
            f3 = l2.mo47589k();
        } else {
            f3 = C16410a.m74022e(0.0f);
        }
        float a2 = C16412b.m74035a(f2, f3, f4);
        C16439m D = c0Var.mo46594D();
        if (D == null) {
            D = C16439m.f40739c.mo47699a();
        }
        C16439m D2 = c0Var2.mo46594D();
        if (D2 == null) {
            D2 = C16439m.f40739c.mo47699a();
        }
        C16439m a3 = C16441n.m74227a(D, D2, f4);
        C16342f fVar = (C16342f) m72352c(c0Var.mo46621y(), c0Var2.mo46621y(), f4);
        long n = C15258l2.m66189n(c0Var.mo46608k(), c0Var2.mo46608k(), f4);
        C16434j jVar = (C16434j) m72352c(c0Var.mo46592B(), c0Var2.mo46592B(), f4);
        C15205e4 A = c0Var.mo46591A();
        if (A == null) {
            A = new C15205e4(0, 0, 0.0f, 7, (DefaultConstructorMarker) null);
        }
        C15205e4 A2 = c0Var2.mo46591A();
        if (A2 == null) {
            A2 = new C15205e4(0, 0, 0.0f, 7, (DefaultConstructorMarker) null);
        }
        return new C16151c0(b, e, a, e0Var, f0Var, uVar, str, e2, C16410a.m74021d(a2), a3, fVar, n, jVar, C15212f4.m65958a(A, A2, f4), m72353d(c0Var.mo46622z(), c0Var2.mo46622z(), f4), (C15192h) m72352c(c0Var.mo46612p(), c0Var2.mo46612p(), f4), (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static final <T> T m72352c(T t, T t2, float f) {
        return ((double) f) < 0.5d ? t : t2;
    }

    /* renamed from: d */
    public static final C16459y m72353d(C16459y yVar, C16459y yVar2, float f) {
        if (yVar == null && yVar2 == null) {
            return null;
        }
        if (yVar == null) {
            yVar = C16459y.f40799a.mo47784a();
        }
        if (yVar2 == null) {
            yVar2 = C16459y.f40799a.mo47784a();
        }
        return C16150c.m72642c(yVar, yVar2, f);
    }

    /* renamed from: e */
    public static final long m72354e(long j, long j2, float f) {
        if (C16506u.m74718s(j) || C16506u.m74718s(j2)) {
            return ((C16504t) m72352c(C16504t.m74676c(j), C16504t.m74676c(j2), f)).mo47901w();
        }
        return C16506u.m74720u(j, j2, f);
    }

    @C12579k
    /* renamed from: f */
    public static final C16151c0 m72355f(@C12579k C16151c0 c0Var) {
        long j;
        int i;
        int i2;
        long j2;
        float f;
        boolean z;
        Intrinsics.checkNotNullParameter(c0Var, "style");
        TextForegroundStyle b = c0Var.mo46593C().mo47578b(SpanStyleKt$resolveSpanStyleDefaults$1.f39924f);
        if (C16506u.m74718s(c0Var.mo46615t())) {
            j = f39920a;
        } else {
            j = c0Var.mo46615t();
        }
        long j3 = j;
        C16209i0 w = c0Var.mo46619w();
        if (w == null) {
            w = C16209i0.f40292b.mo46952m();
        }
        C16209i0 i0Var = w;
        C16190e0 u = c0Var.mo46617u();
        if (u != null) {
            i = u.mo46880j();
        } else {
            i = C16190e0.f40252b.mo46883b();
        }
        C16190e0 c = C16190e0.m72948c(i);
        C16194f0 v = c0Var.mo46618v();
        if (v != null) {
            i2 = v.mo46893m();
        } else {
            i2 = C16194f0.f40257b.mo46895a();
        }
        C16194f0 e = C16194f0.m72968e(i2);
        C16242u r = c0Var.mo46613r();
        if (r == null) {
            r = C16242u.f40340b.mo47008b();
        }
        C16242u uVar = r;
        String s = c0Var.mo46614s();
        if (s == null) {
            s = "";
        }
        String str = s;
        if (C16506u.m74718s(c0Var.mo46620x())) {
            j2 = f39921b;
        } else {
            j2 = c0Var.mo46620x();
        }
        long j4 = j2;
        C16410a l = c0Var.mo46609l();
        if (l != null) {
            f = l.mo47589k();
        } else {
            f = C16410a.f40667b.mo47591a();
        }
        C16410a d = C16410a.m74021d(f);
        C16439m D = c0Var.mo46594D();
        if (D == null) {
            D = C16439m.f40739c.mo47699a();
        }
        C16439m mVar = D;
        C16342f y = c0Var.mo46621y();
        if (y == null) {
            y = C16342f.f40571c.mo47385a();
        }
        C16342f fVar = y;
        long k = c0Var.mo46608k();
        if (k != C15240j2.f37547b.mo42851u()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            k = f39922c;
        }
        long j5 = k;
        C16434j B = c0Var.mo46592B();
        if (B == null) {
            B = C16434j.f40726b.mo47682d();
        }
        C16434j jVar = B;
        C15205e4 A = c0Var.mo46591A();
        if (A == null) {
            A = C15205e4.f37522d.mo42746a();
        }
        C15205e4 e4Var = A;
        C16459y z2 = c0Var.mo46622z();
        C15192h p = c0Var.mo46612p();
        if (p == null) {
            p = C15197l.f37504a;
        }
        return new C16151c0(b, j3, i0Var, c, e, uVar, str, j4, d, mVar, fVar, j5, jVar, e4Var, z2, p, (DefaultConstructorMarker) null);
    }
}
