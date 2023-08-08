package androidx.compose.p004ui.text.platform.extensions;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.graphics.C15127c4;
import androidx.compose.p004ui.graphics.C15205e4;
import androidx.compose.p004ui.graphics.C15225h4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15258l2;
import androidx.compose.p004ui.graphics.C15421z1;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import androidx.compose.p004ui.text.AnnotatedStringKt;
import androidx.compose.p004ui.text.C16151c0;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.android.style.C16115a;
import androidx.compose.p004ui.text.android.style.C16116b;
import androidx.compose.p004ui.text.android.style.C16120e;
import androidx.compose.p004ui.text.android.style.C16121f;
import androidx.compose.p004ui.text.android.style.C16122g;
import androidx.compose.p004ui.text.android.style.C16123h;
import androidx.compose.p004ui.text.android.style.C16130l;
import androidx.compose.p004ui.text.android.style.C16131m;
import androidx.compose.p004ui.text.android.style.C16132n;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16194f0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.intl.C16342f;
import androidx.compose.p004ui.text.platform.style.C16391a;
import androidx.compose.p004ui.text.platform.style.C16392b;
import androidx.compose.p004ui.text.style.C16410a;
import androidx.compose.p004ui.text.style.C16426h;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16439m;
import androidx.compose.p004ui.text.style.C16442o;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16504t;
import androidx.compose.p004ui.unit.C16506u;
import androidx.compose.p004ui.unit.C16507v;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.C10956m;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSpannableExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/SpannableExtensions_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,552:1\n1#2:553\n35#3,3:554\n38#3,2:561\n40#3:564\n33#4,4:557\n38#4:563\n69#4,6:565\n33#4,6:571\n646#5:577\n646#5:578\n*S KotlinDebug\n*F\n+ 1 SpannableExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/SpannableExtensions_androidKt\n*L\n282#1:554,3\n282#1:561,2\n282#1:564\n282#1:557,4\n282#1:563\n350#1:565,6\n370#1:571,6\n434#1:577\n507#1:578\n*E\n"})
/* renamed from: androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt */
public final class SpannableExtensions_androidKt {
    /* renamed from: a */
    public static final MetricAffectingSpan m73883a(long j, C16479d dVar) {
        long m = C16504t.m74686m(j);
        C16507v.C16508a aVar = C16507v.f40911b;
        if (C16507v.m74732g(m, aVar.mo47909b())) {
            return new C16121f(dVar.mo7415C2(j));
        }
        if (C16507v.m74732g(m, aVar.mo47908a())) {
            return new C16120e(C16504t.m74687n(j));
        }
        return null;
    }

    /* renamed from: b */
    public static final void m73884b(@C12580l C16151c0 c0Var, @C12579k List<C16156d.C16159b<C16151c0>> list, @C12579k C11305q<? super C16151c0, ? super Integer, ? super Integer, C11079d2> qVar) {
        Intrinsics.checkNotNullParameter(list, "spanStyles");
        Intrinsics.checkNotNullParameter(qVar, C28534f.f69159i0);
        if (list.size() > 1) {
            int size = list.size();
            int i = size * 2;
            Integer[] numArr = new Integer[i];
            for (int i2 = 0; i2 < i; i2++) {
                numArr[i2] = 0;
            }
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                C16156d.C16159b bVar = list.get(i3);
                numArr[i3] = Integer.valueOf(bVar.mo46740i());
                numArr[i3 + size] = Integer.valueOf(bVar.mo46737g());
            }
            C10956m.m41309v4((Comparable[]) numArr);
            int intValue = ((Number) ArraysKt___ArraysKt.m40180sc(numArr)).intValue();
            for (int i4 = 0; i4 < i; i4++) {
                int intValue2 = numArr[i4].intValue();
                if (intValue2 != intValue) {
                    int size3 = list.size();
                    C16151c0 c0Var2 = c0Var;
                    for (int i5 = 0; i5 < size3; i5++) {
                        C16156d.C16159b bVar2 = list.get(i5);
                        if (bVar2.mo46740i() != bVar2.mo46737g() && AnnotatedStringKt.m72261t(intValue, intValue2, bVar2.mo46740i(), bVar2.mo46737g())) {
                            c0Var2 = m73887e(c0Var2, (C16151c0) bVar2.mo46738h());
                        }
                    }
                    if (c0Var2 != null) {
                        qVar.invoke(c0Var2, Integer.valueOf(intValue), Integer.valueOf(intValue2));
                    }
                    intValue = intValue2;
                }
            }
        } else if (!list.isEmpty()) {
            qVar.invoke(m73887e(c0Var, (C16151c0) list.get(0).mo46738h()), Integer.valueOf(list.get(0).mo46740i()), Integer.valueOf(list.get(0).mo46737g()));
        }
    }

    /* renamed from: c */
    public static final boolean m73885c(C16151c0 c0Var) {
        long m = C16504t.m74686m(c0Var.mo46620x());
        C16507v.C16508a aVar = C16507v.f40911b;
        return C16507v.m74732g(m, aVar.mo47909b()) || C16507v.m74732g(C16504t.m74686m(c0Var.mo46620x()), aVar.mo47908a());
    }

    /* renamed from: d */
    public static final boolean m73886d(C16361p0 p0Var) {
        return C16373d.m73921e(p0Var.mo47499b0()) || p0Var.mo47517y() != null;
    }

    /* renamed from: e */
    public static final C16151c0 m73887e(C16151c0 c0Var, C16151c0 c0Var2) {
        return c0Var == null ? c0Var2 : c0Var.mo46598H(c0Var2);
    }

    /* renamed from: f */
    public static final float m73888f(long j, float f, C16479d dVar) {
        long m = C16504t.m74686m(j);
        C16507v.C16508a aVar = C16507v.f40911b;
        if (C16507v.m74732g(m, aVar.mo47909b())) {
            return dVar.mo7415C2(j);
        }
        if (C16507v.m74732g(m, aVar.mo47908a())) {
            return C16504t.m74687n(j) * f;
        }
        return Float.NaN;
    }

    /* renamed from: g */
    public static final void m73889g(@C12579k Spannable spannable, long j, int i, int i2) {
        boolean z;
        Intrinsics.checkNotNullParameter(spannable, "$this$setBackground");
        if (j != C15240j2.f37547b.mo42851u()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m73902t(spannable, new BackgroundColorSpan(C15258l2.m66193r(j)), i, i2);
        }
    }

    /* renamed from: h */
    public static final void m73890h(Spannable spannable, C16410a aVar, int i, int i2) {
        if (aVar != null) {
            m73902t(spannable, new C16115a(aVar.mo47589k()), i, i2);
        }
    }

    /* renamed from: i */
    public static final void m73891i(Spannable spannable, C15421z1 z1Var, float f, int i, int i2) {
        if (z1Var == null) {
            return;
        }
        if (z1Var instanceof C15225h4) {
            m73892j(spannable, ((C15225h4) z1Var).mo42781c(), i, i2);
        } else if (z1Var instanceof C15127c4) {
            m73902t(spannable, new C16392b((C15127c4) z1Var, f), i, i2);
        }
    }

    /* renamed from: j */
    public static final void m73892j(@C12579k Spannable spannable, long j, int i, int i2) {
        boolean z;
        Intrinsics.checkNotNullParameter(spannable, "$this$setColor");
        if (j != C15240j2.f37547b.mo42851u()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m73902t(spannable, new ForegroundColorSpan(C15258l2.m66193r(j)), i, i2);
        }
    }

    /* renamed from: k */
    public static final void m73893k(Spannable spannable, C15192h hVar, int i, int i2) {
        if (hVar != null) {
            m73902t(spannable, new C16391a(hVar), i, i2);
        }
    }

    /* renamed from: l */
    public static final void m73894l(Spannable spannable, C16361p0 p0Var, List<C16156d.C16159b<C16151c0>> list, C11306r<? super C16242u, ? super C16209i0, ? super C16190e0, ? super C16194f0, ? extends Typeface> rVar) {
        C16151c0 c0Var;
        boolean z;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C16156d.C16159b<C16151c0> bVar = list.get(i);
            C16156d.C16159b bVar2 = bVar;
            if (C16373d.m73921e((C16151c0) bVar2.mo46738h()) || ((C16151c0) bVar2.mo46738h()).mo46618v() != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(bVar);
            }
        }
        if (m73886d(p0Var)) {
            c0Var = new C16151c0(0, 0, p0Var.mo47518z(), p0Var.mo47516x(), p0Var.mo47517y(), p0Var.mo47513u(), (String) null, 0, (C16410a) null, (C16439m) null, (C16342f) null, 0, (C16434j) null, (C15205e4) null, 16323, (DefaultConstructorMarker) null);
        } else {
            c0Var = null;
        }
        m73884b(c0Var, arrayList, new SpannableExtensions_androidKt$setFontAttributes$1(spannable, rVar));
    }

    /* renamed from: m */
    public static final void m73895m(Spannable spannable, String str, int i, int i2) {
        if (str != null) {
            m73902t(spannable, new C16116b(str), i, i2);
        }
    }

    /* renamed from: n */
    public static final void m73896n(@C12579k Spannable spannable, long j, @C12579k C16479d dVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(spannable, "$this$setFontSize");
        Intrinsics.checkNotNullParameter(dVar, "density");
        long m = C16504t.m74686m(j);
        C16507v.C16508a aVar = C16507v.f40911b;
        if (C16507v.m74732g(m, aVar.mo47909b())) {
            m73902t(spannable, new AbsoluteSizeSpan(C11409d.m43851L0(dVar.mo7415C2(j)), false), i, i2);
        } else if (C16507v.m74732g(m, aVar.mo47908a())) {
            m73902t(spannable, new RelativeSizeSpan(C16504t.m74687n(j)), i, i2);
        }
    }

    /* renamed from: o */
    public static final void m73897o(Spannable spannable, C16439m mVar, int i, int i2) {
        if (mVar != null) {
            m73902t(spannable, new ScaleXSpan(mVar.mo47694d()), i, i2);
            m73902t(spannable, new C16131m(mVar.mo47695e()), i, i2);
        }
    }

    /* renamed from: p */
    public static final void m73898p(@C12579k Spannable spannable, long j, float f, @C12579k C16479d dVar, @C12579k C16426h hVar) {
        boolean z;
        int i;
        Intrinsics.checkNotNullParameter(spannable, "$this$setLineHeight");
        Intrinsics.checkNotNullParameter(dVar, "density");
        Intrinsics.checkNotNullParameter(hVar, "lineHeightStyle");
        float f2 = m73888f(j, f, dVar);
        if (!Float.isNaN(f2)) {
            if (spannable.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || StringsKt___StringsKt.last(spannable) == 10) {
                i = spannable.length() + 1;
            } else {
                i = spannable.length();
            }
            m73902t(spannable, new C16123h(f2, 0, i, C16426h.C16430c.m74158j(hVar.mo47642c()), C16426h.C16430c.m74159k(hVar.mo47642c()), hVar.mo47641b()), 0, spannable.length());
        }
    }

    /* renamed from: q */
    public static final void m73899q(@C12579k Spannable spannable, long j, float f, @C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(spannable, "$this$setLineHeight");
        Intrinsics.checkNotNullParameter(dVar, "density");
        float f2 = m73888f(j, f, dVar);
        if (!Float.isNaN(f2)) {
            m73902t(spannable, new C16122g(f2), 0, spannable.length());
        }
    }

    /* renamed from: r */
    public static final void m73900r(@C12579k Spannable spannable, @C12580l C16342f fVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        if (fVar != null) {
            m73902t(spannable, C16371b.f40632a.mo47539a(fVar), i, i2);
        }
    }

    /* renamed from: s */
    public static final void m73901s(Spannable spannable, C15205e4 e4Var, int i, int i2) {
        if (e4Var != null) {
            m73902t(spannable, new C16130l(C15258l2.m66193r(e4Var.mo42742f()), C15094f.m64880p(e4Var.mo42743h()), C15094f.m64882r(e4Var.mo42743h()), C16373d.m73919c(e4Var.mo42740d())), i, i2);
        }
    }

    /* renamed from: t */
    public static final void m73902t(@C12579k Spannable spannable, @C12579k Object obj, int i, int i2) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(obj, "span");
        spannable.setSpan(obj, i, i2, 33);
    }

    /* renamed from: u */
    public static final void m73903u(Spannable spannable, C16156d.C16159b<C16151c0> bVar, C16479d dVar) {
        int i = bVar.mo46740i();
        int g = bVar.mo46737g();
        C16151c0 h = bVar.mo46738h();
        m73890h(spannable, h.mo46609l(), i, g);
        m73892j(spannable, h.mo46611o(), i, g);
        m73891i(spannable, h.mo46610m(), h.mo46607i(), i, g);
        m73905w(spannable, h.mo46592B(), i, g);
        m73896n(spannable, h.mo46615t(), dVar, i, g);
        m73895m(spannable, h.mo46614s(), i, g);
        m73897o(spannable, h.mo46594D(), i, g);
        m73900r(spannable, h.mo46621y(), i, g);
        m73889g(spannable, h.mo46608k(), i, g);
        m73901s(spannable, h.mo46591A(), i, g);
        m73893k(spannable, h.mo46612p(), i, g);
    }

    /* renamed from: v */
    public static final void m73904v(@C12579k Spannable spannable, @C12579k C16361p0 p0Var, @C12579k List<C16156d.C16159b<C16151c0>> list, @C12579k C16479d dVar, @C12579k C11306r<? super C16242u, ? super C16209i0, ? super C16190e0, ? super C16194f0, ? extends Typeface> rVar) {
        MetricAffectingSpan a;
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(p0Var, "contextTextStyle");
        Intrinsics.checkNotNullParameter(list, "spanStyles");
        Intrinsics.checkNotNullParameter(dVar, "density");
        Intrinsics.checkNotNullParameter(rVar, "resolveTypeface");
        m73894l(spannable, p0Var, list, rVar);
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C16156d.C16159b bVar = list.get(i);
            int i2 = bVar.mo46740i();
            int g = bVar.mo46737g();
            if (i2 >= 0 && i2 < spannable.length() && g > i2 && g <= spannable.length()) {
                m73903u(spannable, bVar, dVar);
                if (m73885c((C16151c0) bVar.mo46738h())) {
                    z = true;
                }
            }
        }
        if (z) {
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                C16156d.C16159b bVar2 = list.get(i3);
                int i4 = bVar2.mo46740i();
                int g2 = bVar2.mo46737g();
                C16151c0 c0Var = (C16151c0) bVar2.mo46738h();
                if (i4 >= 0 && i4 < spannable.length() && g2 > i4 && g2 <= spannable.length() && (a = m73883a(c0Var.mo46620x(), dVar)) != null) {
                    m73902t(spannable, a, i4, g2);
                }
            }
        }
    }

    /* renamed from: w */
    public static final void m73905w(@C12579k Spannable spannable, @C12580l C16434j jVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        if (jVar != null) {
            C16434j.C16435a aVar = C16434j.f40726b;
            m73902t(spannable, new C16132n(jVar.mo47674d(aVar.mo47683f()), jVar.mo47674d(aVar.mo47681b())), i, i2);
        }
    }

    /* renamed from: x */
    public static final void m73906x(@C12579k Spannable spannable, @C12580l C16442o oVar, float f, @C12579k C16479d dVar) {
        float f2;
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(dVar, "density");
        if (oVar == null) {
            return;
        }
        if ((!C16504t.m74683j(oVar.mo47701d(), C16506u.m74712m(0)) || !C16504t.m74683j(oVar.mo47702e(), C16506u.m74712m(0))) && !C16506u.m74718s(oVar.mo47701d()) && !C16506u.m74718s(oVar.mo47702e())) {
            long m = C16504t.m74686m(oVar.mo47701d());
            C16507v.C16508a aVar = C16507v.f40911b;
            float f3 = 0.0f;
            if (C16507v.m74732g(m, aVar.mo47909b())) {
                f2 = dVar.mo7415C2(oVar.mo47701d());
            } else if (C16507v.m74732g(m, aVar.mo47908a())) {
                f2 = C16504t.m74687n(oVar.mo47701d()) * f;
            } else {
                f2 = 0.0f;
            }
            long m2 = C16504t.m74686m(oVar.mo47702e());
            if (C16507v.m74732g(m2, aVar.mo47909b())) {
                f3 = dVar.mo7415C2(oVar.mo47702e());
            } else if (C16507v.m74732g(m2, aVar.mo47908a())) {
                f3 = C16504t.m74687n(oVar.mo47702e()) * f;
            }
            m73902t(spannable, new LeadingMarginSpan.Standard((int) ((float) Math.ceil((double) f2)), (int) ((float) Math.ceil((double) f3))), 0, spannable.length());
        }
    }
}
