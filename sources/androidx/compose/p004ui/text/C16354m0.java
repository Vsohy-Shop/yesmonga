package androidx.compose.p004ui.text;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.C15118b2;
import androidx.compose.p004ui.graphics.C15205e4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15325u1;
import androidx.compose.p004ui.graphics.C15421z1;
import androidx.compose.p004ui.graphics.drawscope.C15186d;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import androidx.compose.p004ui.graphics.drawscope.C15193i;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16438l;
import androidx.compose.p004ui.text.style.C16449r;
import androidx.compose.p004ui.unit.C16478c;
import androidx.compose.p004ui.unit.C16500q;
import com.carrefour.fid.android.shared.constant.C28539g;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nTextPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPainter.kt\nandroidx/compose/ui/text/TextPainterKt\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,405:1\n261#2,11:406\n261#2,11:417\n261#2,8:428\n269#2,3:439\n261#2,11:442\n652#3:436\n658#3:437\n646#3:438\n159#4:453\n159#4:454\n*S KotlinDebug\n*F\n+ 1 TextPainter.kt\nandroidx/compose/ui/text/TextPainterKt\n*L\n171#1:406,11\n237#1:417,11\n281#1:428,8\n281#1:439,3\n344#1:442,11\n288#1:436\n301#1:437\n301#1:438\n382#1:453\n394#1:454\n*E\n"})
/* renamed from: androidx.compose.ui.text.m0 */
public final class C16354m0 {

    /* renamed from: a */
    public static final int f40589a = C15325u1.f37708b.mo43015B();

    /* renamed from: a */
    public static final void m73685a(C15193i iVar, C16260h0 h0Var) {
        if (h0Var.mo47055i() && !C16449r.m74263g(h0Var.mo47058l().mo47034h(), C16449r.f40760b.mo47728e())) {
            C15193i.m65807h(iVar, 0.0f, 0.0f, (float) C16500q.m74662m(h0Var.mo47043B()), (float) C16500q.m74659j(h0Var.mo47043B()), 0, 16, (Object) null);
        }
    }

    @C16259h
    /* renamed from: b */
    public static final void m73686b(@C12579k C15187e eVar, @C12579k C16262i0 i0Var, @C12579k C16156d dVar, long j, @C12579k C16361p0 p0Var, int i, boolean z, int i2, @C12579k List<C16156d.C16159b<C16454v>> list, long j2, int i3) {
        C15187e eVar2 = eVar;
        Intrinsics.checkNotNullParameter(eVar2, "$this$drawText");
        Intrinsics.checkNotNullParameter(i0Var, "textMeasurer");
        Intrinsics.checkNotNullParameter(dVar, "text");
        Intrinsics.checkNotNullParameter(p0Var, "style");
        List<C16156d.C16159b<C16454v>> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "placeholders");
        C16262i0 i0Var2 = i0Var;
        C16156d dVar2 = dVar;
        C16361p0 p0Var2 = p0Var;
        int i4 = i;
        boolean z2 = z;
        int i5 = i2;
        C16260h0 d = C16262i0.m73263d(i0Var2, dVar2, p0Var2, i4, z2, i5, list2, m73695k(eVar2, j2, j), eVar.getLayoutDirection(), eVar, (C16242u.C16244b) null, false, C28539g.f69265w, (Object) null);
        C15186d q5 = eVar.mo42683q5();
        long b = q5.mo42704b();
        q5.mo42705c().mo42422E();
        C15193i a = q5.mo42703a();
        a.mo42712e(C15094f.m64880p(j), C15094f.m64882r(j));
        m73685a(a, d);
        C16349k.m73635I(d.mo47069w(), eVar.mo42683q5().mo42705c(), 0, (C15205e4) null, (C16434j) null, (C15192h) null, i3, 30, (Object) null);
        q5.mo42705c().mo42443q();
        q5.mo42706d(b);
    }

    /* renamed from: c */
    public static /* synthetic */ void m73687c(C15187e eVar, C16262i0 i0Var, C16156d dVar, long j, C16361p0 p0Var, int i, boolean z, int i2, List list, long j2, int i3, int i4, Object obj) {
        long j3;
        C16361p0 p0Var2;
        int i5;
        boolean z2;
        int i6;
        List list2;
        long j4;
        int i7;
        int i8 = i4;
        if ((i8 & 4) != 0) {
            j3 = C15094f.f37256b.mo42248e();
        } else {
            j3 = j;
        }
        if ((i8 & 8) != 0) {
            p0Var2 = C16361p0.f40603d.mo47519a();
        } else {
            p0Var2 = p0Var;
        }
        if ((i8 & 16) != 0) {
            i5 = C16449r.f40760b.mo47726a();
        } else {
            i5 = i;
        }
        if ((i8 & 32) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i8 & 64) != 0) {
            i6 = Integer.MAX_VALUE;
        } else {
            i6 = i2;
        }
        if ((i8 & 128) != 0) {
            list2 = CollectionsKt__CollectionsKt.m40441E();
        } else {
            list2 = list;
        }
        if ((i8 & 256) != 0) {
            j4 = C15104m.f37280b.mo42316a();
        } else {
            j4 = j2;
        }
        if ((i8 & 512) != 0) {
            i7 = C15187e.f37500l.mo42719a();
        } else {
            i7 = i3;
        }
        m73686b(eVar, i0Var, dVar, j3, p0Var2, i5, z2, i6, list2, j4, i7);
    }

    @C16259h
    /* renamed from: d */
    public static final void m73688d(@C12579k C15187e eVar, @C12579k C16260h0 h0Var, @C12579k C15421z1 z1Var, long j, float f, @C12580l C15205e4 e4Var, @C12580l C16434j jVar, @C12580l C15192h hVar, int i) {
        C15205e4 e4Var2;
        C16434j jVar2;
        C15192h hVar2;
        float f2;
        C16260h0 h0Var2 = h0Var;
        C15187e eVar2 = eVar;
        Intrinsics.checkNotNullParameter(eVar, "$this$drawText");
        Intrinsics.checkNotNullParameter(h0Var, "textLayoutResult");
        C15421z1 z1Var2 = z1Var;
        Intrinsics.checkNotNullParameter(z1Var, "brush");
        if (e4Var == null) {
            e4Var2 = h0Var.mo47058l().mo47039m().mo47481I();
        } else {
            e4Var2 = e4Var;
        }
        if (jVar == null) {
            jVar2 = h0Var.mo47058l().mo47039m().mo47484L();
        } else {
            jVar2 = jVar;
        }
        if (hVar == null) {
            hVar2 = h0Var.mo47058l().mo47039m().mo47511s();
        } else {
            hVar2 = hVar;
        }
        C15186d q5 = eVar.mo42683q5();
        long b = q5.mo42704b();
        q5.mo42705c().mo42422E();
        C15193i a = q5.mo42703a();
        a.mo42712e(C15094f.m64880p(j), C15094f.m64882r(j));
        m73685a(a, h0Var);
        C16349k w = h0Var.mo47069w();
        C15118b2 c = eVar.mo42683q5().mo42705c();
        if (!Float.isNaN(f)) {
            f2 = f;
        } else {
            f2 = h0Var.mo47058l().mo47039m().mo47506l();
        }
        w.mo47395L(c, z1Var, f2, e4Var2, jVar2, hVar2, i);
        q5.mo42705c().mo42443q();
        q5.mo42706d(b);
    }

    /* renamed from: e */
    public static /* synthetic */ void m73689e(C15187e eVar, C16260h0 h0Var, C15421z1 z1Var, long j, float f, C15205e4 e4Var, C16434j jVar, C15192h hVar, int i, int i2, Object obj) {
        long j2;
        float f2;
        C15205e4 e4Var2;
        C16434j jVar2;
        C15192h hVar2;
        int i3;
        int i4 = i2;
        if ((i4 & 4) != 0) {
            j2 = C15094f.f37256b.mo42248e();
        } else {
            j2 = j;
        }
        if ((i4 & 8) != 0) {
            f2 = Float.NaN;
        } else {
            f2 = f;
        }
        if ((i4 & 16) != 0) {
            e4Var2 = null;
        } else {
            e4Var2 = e4Var;
        }
        if ((i4 & 32) != 0) {
            jVar2 = null;
        } else {
            jVar2 = jVar;
        }
        if ((i4 & 64) != 0) {
            hVar2 = null;
        } else {
            hVar2 = hVar;
        }
        if ((i4 & 128) != 0) {
            i3 = C15187e.f37500l.mo42719a();
        } else {
            i3 = i;
        }
        m73688d(eVar, h0Var, z1Var, j2, f2, e4Var2, jVar2, hVar2, i3);
    }

    @C16259h
    /* renamed from: f */
    public static final void m73690f(@C12579k C15187e eVar, @C12579k C16262i0 i0Var, @C12579k String str, long j, @C12579k C16361p0 p0Var, int i, boolean z, int i2, long j2, int i3) {
        C15187e eVar2 = eVar;
        Intrinsics.checkNotNullParameter(eVar2, "$this$drawText");
        Intrinsics.checkNotNullParameter(i0Var, "textMeasurer");
        String str2 = str;
        Intrinsics.checkNotNullParameter(str2, "text");
        Intrinsics.checkNotNullParameter(p0Var, "style");
        C16260h0 d = C16262i0.m73263d(i0Var, new C16156d(str2, (List) null, (List) null, 6, (DefaultConstructorMarker) null), p0Var, i, z, i2, (List) null, m73695k(eVar2, j2, j), eVar.getLayoutDirection(), eVar, (C16242u.C16244b) null, false, 1568, (Object) null);
        C15186d q5 = eVar.mo42683q5();
        long b = q5.mo42704b();
        q5.mo42705c().mo42422E();
        C15193i a = q5.mo42703a();
        a.mo42712e(C15094f.m64880p(j), C15094f.m64882r(j));
        m73685a(a, d);
        C16349k.m73635I(d.mo47069w(), eVar.mo42683q5().mo42705c(), 0, (C15205e4) null, (C16434j) null, (C15192h) null, i3, 30, (Object) null);
        q5.mo42705c().mo42443q();
        q5.mo42706d(b);
    }

    /* renamed from: g */
    public static /* synthetic */ void m73691g(C15187e eVar, C16262i0 i0Var, String str, long j, C16361p0 p0Var, int i, boolean z, int i2, long j2, int i3, int i4, Object obj) {
        long j3;
        C16361p0 p0Var2;
        int i5;
        boolean z2;
        int i6;
        long j4;
        int i7;
        int i8 = i4;
        if ((i8 & 4) != 0) {
            j3 = C15094f.f37256b.mo42248e();
        } else {
            j3 = j;
        }
        if ((i8 & 8) != 0) {
            p0Var2 = C16361p0.f40603d.mo47519a();
        } else {
            p0Var2 = p0Var;
        }
        if ((i8 & 16) != 0) {
            i5 = C16449r.f40760b.mo47726a();
        } else {
            i5 = i;
        }
        if ((i8 & 32) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i8 & 64) != 0) {
            i6 = Integer.MAX_VALUE;
        } else {
            i6 = i2;
        }
        if ((i8 & 128) != 0) {
            j4 = C15104m.f37280b.mo42316a();
        } else {
            j4 = j2;
        }
        if ((i8 & 256) != 0) {
            i7 = C15187e.f37500l.mo42719a();
        } else {
            i7 = i3;
        }
        m73690f(eVar, i0Var, str, j3, p0Var2, i5, z2, i6, j4, i7);
    }

    @C16259h
    /* renamed from: h */
    public static final void m73692h(@C12579k C15187e eVar, @C12579k C16260h0 h0Var, long j, long j2, float f, @C12580l C15205e4 e4Var, @C12580l C16434j jVar, @C12580l C15192h hVar, int i) {
        C15205e4 e4Var2;
        C16434j jVar2;
        C15192h hVar2;
        long j3;
        boolean z;
        float f2;
        C16260h0 h0Var2 = h0Var;
        C15187e eVar2 = eVar;
        Intrinsics.checkNotNullParameter(eVar, "$this$drawText");
        Intrinsics.checkNotNullParameter(h0Var, "textLayoutResult");
        if (e4Var == null) {
            e4Var2 = h0Var.mo47058l().mo47039m().mo47481I();
        } else {
            e4Var2 = e4Var;
        }
        if (jVar == null) {
            jVar2 = h0Var.mo47058l().mo47039m().mo47484L();
        } else {
            jVar2 = jVar;
        }
        if (hVar == null) {
            hVar2 = h0Var.mo47058l().mo47039m().mo47511s();
        } else {
            hVar2 = hVar;
        }
        C15186d q5 = eVar.mo42683q5();
        long b = q5.mo42704b();
        q5.mo42705c().mo42422E();
        C15193i a = q5.mo42703a();
        a.mo42712e(C15094f.m64880p(j2), C15094f.m64882r(j2));
        m73685a(a, h0Var);
        C15421z1 p = h0Var.mo47058l().mo47039m().mo47509p();
        boolean z2 = true;
        if (p != null) {
            if (j == C15240j2.f37547b.mo42851u()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C16349k w = h0Var.mo47069w();
                C15118b2 c = eVar.mo42683q5().mo42705c();
                if (!Float.isNaN(f)) {
                    f2 = f;
                } else {
                    f2 = h0Var.mo47058l().mo47039m().mo47506l();
                }
                w.mo47395L(c, p, f2, e4Var2, jVar2, hVar2, i);
                q5.mo42705c().mo42443q();
                q5.mo42706d(b);
            }
        }
        C16349k w2 = h0Var.mo47069w();
        C15118b2 c2 = eVar.mo42683q5().mo42705c();
        if (j == C15240j2.f37547b.mo42851u()) {
            z2 = false;
        }
        if (z2) {
            j3 = j;
        } else {
            j3 = h0Var.mo47058l().mo47039m().mo47510r();
        }
        w2.mo47393H(c2, C16438l.m74218c(j3, f), e4Var2, jVar2, hVar2, i);
        q5.mo42705c().mo42443q();
        q5.mo42706d(b);
    }

    /* renamed from: i */
    public static /* synthetic */ void m73693i(C15187e eVar, C16260h0 h0Var, long j, long j2, float f, C15205e4 e4Var, C16434j jVar, C15192h hVar, int i, int i2, Object obj) {
        long j3;
        long j4;
        float f2;
        C15205e4 e4Var2;
        C16434j jVar2;
        int i3;
        int i4 = i2;
        if ((i4 & 2) != 0) {
            j3 = C15240j2.f37547b.mo42851u();
        } else {
            j3 = j;
        }
        if ((i4 & 4) != 0) {
            j4 = C15094f.f37256b.mo42248e();
        } else {
            j4 = j2;
        }
        if ((i4 & 8) != 0) {
            f2 = Float.NaN;
        } else {
            f2 = f;
        }
        C15192h hVar2 = null;
        if ((i4 & 16) != 0) {
            e4Var2 = null;
        } else {
            e4Var2 = e4Var;
        }
        if ((i4 & 32) != 0) {
            jVar2 = null;
        } else {
            jVar2 = jVar;
        }
        if ((i4 & 64) == 0) {
            hVar2 = hVar;
        }
        if ((i4 & 128) != 0) {
            i3 = C15187e.f37500l.mo42719a();
        } else {
            i3 = i;
        }
        m73692h(eVar, h0Var, j3, j4, f2, e4Var2, jVar2, hVar2, i3);
    }

    /* renamed from: j */
    public static final int m73694j() {
        return f40589a;
    }

    /* renamed from: k */
    public static final long m73695k(C15187e eVar, long j, long j2) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        boolean z3;
        int i3;
        C15104m.C15105a aVar = C15104m.f37280b;
        boolean z4 = true;
        int i4 = 0;
        if (j == aVar.mo42316a()) {
            z = true;
        } else {
            z = false;
        }
        if (z || Float.isNaN(C15104m.m65023t(j))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i = C11409d.m43851L0((float) Math.ceil((double) (C15104m.m65023t(eVar.mo42718b()) - C15094f.m64880p(j2))));
            i2 = 0;
        } else {
            i2 = C11409d.m43851L0((float) Math.ceil((double) C15104m.m65023t(j)));
            i = i2;
        }
        if (j == aVar.mo42316a()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && !Float.isNaN(C15104m.m65016m(j))) {
            z4 = false;
        }
        if (z4) {
            i3 = C11409d.m43851L0((float) Math.ceil((double) (C15104m.m65016m(eVar.mo42718b()) - C15094f.m64882r(j2))));
        } else {
            i4 = C11409d.m43851L0((float) Math.ceil((double) C15104m.m65016m(j)));
            i3 = i4;
        }
        return C16478c.m74376a(i2, i, i4, i3);
    }
}
