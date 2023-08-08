package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8754l;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.C15320t2;
import androidx.compose.p004ui.graphics.C15403w2;
import androidx.compose.p004ui.graphics.painter.C15292a;
import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.p004ui.graphics.vector.C15340c;
import androidx.compose.p004ui.graphics.vector.VectorPainter;
import androidx.compose.p004ui.graphics.vector.VectorPainterKt;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Icon.kt\nandroidx/compose/material/IconKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,170:1\n76#2:171\n76#2:172\n76#2:180\n36#3:173\n36#3:181\n1114#4,6:174\n1114#4,6:182\n154#5:188\n*S KotlinDebug\n*F\n+ 1 Icon.kt\nandroidx/compose/material/IconKt\n*L\n66#1:171\n100#1:172\n134#1:180\n102#1:173\n139#1:181\n102#1:174,6\n139#1:182,6\n169#1:188\n*E\n"})
public final class IconKt {
    @C12579k

    /* renamed from: a */
    public static final C8767m f7680a = SizeKt.m10087C(C8767m.f23478j, C16483g.m74435M((float) 24));

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m13538a(@C12579k C15403w2 w2Var, @C12580l String str, @C12580l C8767m mVar, long j, @C12580l C8592o oVar, int i, int i2) {
        C8767m.C8768a aVar;
        long j2;
        C15403w2 w2Var2 = w2Var;
        C8592o oVar2 = oVar;
        int i3 = i;
        Intrinsics.checkNotNullParameter(w2Var2, "bitmap");
        oVar2.mo14918M(-554892675);
        if ((i2 & 4) != 0) {
            aVar = C8767m.f23478j;
        } else {
            aVar = mVar;
        }
        if ((i2 & 8) != 0) {
            j2 = C15240j2.m66080w(((C15240j2) oVar2.mo15032w(ContentColorKt.m13406a())).mo42833M(), ((Number) oVar2.mo15032w(ContentAlphaKt.m13404a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j2 = j;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-554892675, i3, -1, "androidx.compose.material.Icon (Icon.kt:95)");
        }
        oVar2.mo14918M(1157296644);
        boolean n0 = oVar2.mo15006n0(w2Var2);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            C15292a aVar2 = new C15292a(w2Var, 0, 0, 6, (DefaultConstructorMarker) null);
            oVar2.mo14893C(aVar2);
            N = aVar2;
        }
        oVar.mo15002m0();
        m13539b((C15292a) N, str, aVar, j2, oVar, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168), 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m13539b(@C12579k Painter painter, @C12580l String str, @C12580l C8767m mVar, long j, @C12580l C8592o oVar, int i, int i2) {
        C8767m.C8768a aVar;
        long j2;
        int i3;
        C15249k2 k2Var;
        C8767m mVar2;
        Painter painter2 = painter;
        String str2 = str;
        Intrinsics.checkNotNullParameter(painter2, "painter");
        C8592o o = oVar.mo15009o(-1142959010);
        if ((i2 & 4) != 0) {
            aVar = C8767m.f23478j;
        } else {
            aVar = mVar;
        }
        if ((i2 & 8) != 0) {
            i3 = i & -7169;
            j2 = C15240j2.m66080w(((C15240j2) o.mo15032w(ContentColorKt.m13406a())).mo42833M(), ((Number) o.mo15032w(ContentAlphaKt.m13404a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j2 = j;
            i3 = i;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1142959010, i3, -1, "androidx.compose.material.Icon (Icon.kt:129)");
        }
        if (C15240j2.m66082y(j2, C15240j2.f37547b.mo42851u())) {
            k2Var = null;
        } else {
            k2Var = C15249k2.C15250a.m66144d(C15249k2.f37569b, j2, 0, 2, (Object) null);
        }
        o.mo14918M(1547387026);
        if (str2 != null) {
            C8767m.C8768a aVar2 = C8767m.f23478j;
            o.mo14918M(1157296644);
            boolean n0 = o.mo15006n0(str2);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new IconKt$Icon$semantics$1$1(str2);
                o.mo14893C(N);
            }
            o.mo15002m0();
            mVar2 = SemanticsModifierKt.m71868c(aVar2, false, (C11300l) N, 1, (Object) null);
        } else {
            mVar2 = C8767m.f23478j;
        }
        o.mo15002m0();
        long j3 = j2;
        BoxKt.m9839a(C8754l.m32556b(m13541d(C15320t2.m66566j(aVar), painter2), painter, false, (C8734c) null, C15541c.f38696a.mo44373i(), 0.0f, k2Var, 22, (Object) null).mo17224k3(mVar2), o, 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new IconKt$Icon$1(painter, str, aVar, j3, i, i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m13540c(@C12579k C15340c cVar, @C12580l String str, @C12580l C8767m mVar, long j, @C12580l C8592o oVar, int i, int i2) {
        C8767m mVar2;
        long j2;
        C15340c cVar2 = cVar;
        C8592o oVar2 = oVar;
        int i3 = i;
        Intrinsics.checkNotNullParameter(cVar2, "imageVector");
        oVar2.mo14918M(-800853103);
        if ((i2 & 4) != 0) {
            mVar2 = C8767m.f23478j;
        } else {
            mVar2 = mVar;
        }
        if ((i2 & 8) != 0) {
            j2 = C15240j2.m66080w(((C15240j2) oVar2.mo15032w(ContentColorKt.m13406a())).mo42833M(), ((Number) oVar2.mo15032w(ContentAlphaKt.m13404a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j2 = j;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-800853103, i3, -1, "androidx.compose.material.Icon (Icon.kt:61)");
        }
        m13539b(VectorPainterKt.m66824c(cVar2, oVar2, i3 & 14), str, mVar2, j2, oVar, VectorPainter.f37795Y | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
    }

    /* renamed from: d */
    public static final C8767m m13541d(C8767m mVar, Painter painter) {
        C8767m mVar2;
        if (C15104m.m65014k(painter.mo42949l(), C15104m.f37280b.mo42316a()) || m13542e(painter.mo42949l())) {
            mVar2 = f7680a;
        } else {
            mVar2 = C8767m.f23478j;
        }
        return mVar.mo17224k3(mVar2);
    }

    /* renamed from: e */
    public static final boolean m13542e(long j) {
        return Float.isInfinite(C15104m.m65023t(j)) && Float.isInfinite(C15104m.m65016m(j));
    }
}
