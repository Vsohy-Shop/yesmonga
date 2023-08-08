package androidx.compose.material3;

import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.C2250j;
import androidx.compose.material3.tokens.C8322m;
import androidx.compose.material3.tokens.C8323m0;
import androidx.compose.material3.tokens.C8343v;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15258l2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardDefaults\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,772:1\n36#2:773\n1114#3,6:774\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardDefaults\n*L\n546#1:773\n546#1:774,6\n*E\n"})
/* renamed from: androidx.compose.material3.s */
public final class C8276s {
    @C12579k

    /* renamed from: a */
    public static final C8276s f20444a = new C8276s();

    /* renamed from: b */
    public static final int f20445b = 0;

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8271r mo12959a(long j, long j2, long j3, long j4, @C12580l C8592o oVar, int i, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        C8592o oVar2 = oVar;
        int i3 = i;
        oVar2.mo14918M(-1589582123);
        if ((i2 & 1) != 0) {
            j5 = ColorSchemeKt.m25524k(C8343v.f22173a.mo14501a(), oVar2, 6);
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = ColorSchemeKt.m25516c(j5, oVar2, i3 & 14);
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            C8343v vVar = C8343v.f22173a;
            j7 = C15258l2.m66183h(C15240j2.m66080w(ColorSchemeKt.m25524k(vVar.mo14504d(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), ColorSchemeKt.m25523j(C8215i1.f20180a.mo12652a(oVar2, 6), vVar.mo14505e()));
        } else {
            j7 = j3;
        }
        if ((i2 & 8) != 0) {
            j8 = C15240j2.m66080w(ColorSchemeKt.m25516c(j5, oVar2, i3 & 14), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j8 = j4;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1589582123, i3, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:455)");
        }
        C8271r rVar = new C8271r(j5, j6, j7, j8, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return rVar;
    }

    @C8540g
    @C12579k
    /* renamed from: b */
    public final CardElevation mo12960b(float f, float f2, float f3, float f4, float f5, float f6, @C12580l C8592o oVar, int i, int i2) {
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        oVar.mo14918M(-574898487);
        if ((i2 & 1) != 0) {
            f7 = C8343v.f22173a.mo14502b();
        } else {
            f7 = f;
        }
        if ((i2 & 2) != 0) {
            f8 = C8343v.f22173a.mo14511k();
        } else {
            f8 = f2;
        }
        if ((i2 & 4) != 0) {
            f9 = C8343v.f22173a.mo14507g();
        } else {
            f9 = f3;
        }
        if ((i2 & 8) != 0) {
            f10 = C8343v.f22173a.mo14508h();
        } else {
            f10 = f4;
        }
        if ((i2 & 16) != 0) {
            f11 = C8343v.f22173a.mo14506f();
        } else {
            f11 = f5;
        }
        if ((i2 & 32) != 0) {
            f12 = C8343v.f22173a.mo14505e();
        } else {
            f12 = f6;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-574898487, i, -1, "androidx.compose.material3.CardDefaults.cardElevation (Card.kt:373)");
        }
        CardElevation cardElevation = new CardElevation(f7, f8, f9, f10, f11, f12, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return cardElevation;
    }

    @C8540g
    @C12579k
    /* renamed from: c */
    public final C8271r mo12961c(long j, long j2, long j3, long j4, @C12580l C8592o oVar, int i, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        C8592o oVar2 = oVar;
        int i3 = i;
        oVar2.mo14918M(139558303);
        if ((i2 & 1) != 0) {
            j5 = ColorSchemeKt.m25524k(C8322m.f21682a.mo14055a(), oVar2, 6);
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = ColorSchemeKt.m25516c(j5, oVar2, i3 & 14);
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            C8322m mVar = C8322m.f21682a;
            j7 = C15258l2.m66183h(C15240j2.m66080w(ColorSchemeKt.m25524k(mVar.mo14059e(), oVar2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), ColorSchemeKt.m25523j(C8215i1.f20180a.mo12652a(oVar2, 6), mVar.mo14060f()));
        } else {
            j7 = j3;
        }
        if ((i2 & 8) != 0) {
            j8 = C15240j2.m66080w(j6, 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j8 = j4;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(139558303, i3, -1, "androidx.compose.material3.CardDefaults.elevatedCardColors (Card.kt:484)");
        }
        C8271r rVar = new C8271r(j5, j6, j7, j8, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return rVar;
    }

    @C8540g
    @C12579k
    /* renamed from: d */
    public final CardElevation mo12962d(float f, float f2, float f3, float f4, float f5, float f6, @C12580l C8592o oVar, int i, int i2) {
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        oVar.mo14918M(1154241939);
        if ((i2 & 1) != 0) {
            f7 = C8322m.f21682a.mo14056b();
        } else {
            f7 = f;
        }
        if ((i2 & 2) != 0) {
            f8 = C8322m.f21682a.mo14066l();
        } else {
            f8 = f2;
        }
        if ((i2 & 4) != 0) {
            f9 = C8322m.f21682a.mo14062h();
        } else {
            f9 = f3;
        }
        if ((i2 & 8) != 0) {
            f10 = C8322m.f21682a.mo14063i();
        } else {
            f10 = f4;
        }
        if ((i2 & 16) != 0) {
            f11 = C8322m.f21682a.mo14061g();
        } else {
            f11 = f5;
        }
        if ((i2 & 32) != 0) {
            f12 = C8322m.f21682a.mo14060f();
        } else {
            f12 = f6;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1154241939, i, -1, "androidx.compose.material3.CardDefaults.elevatedCardElevation (Card.kt:401)");
        }
        CardElevation cardElevation = new CardElevation(f7, f8, f9, f10, f11, f12, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return cardElevation;
    }

    @C8540g
    @C11314h(name = "getElevatedShape")
    @C12579k
    /* renamed from: e */
    public final C15218g4 mo12963e(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-133496185);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-133496185, i, -1, "androidx.compose.material3.CardDefaults.<get-elevatedShape> (Card.kt:357)");
        }
        C15218g4 f = ShapesKt.m26127f(C8322m.f21682a.mo14057c(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return f;
    }

    @C8540g
    @C11314h(name = "getOutlinedShape")
    @C12579k
    /* renamed from: f */
    public final C15218g4 mo12964f(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(1095404023);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1095404023, i, -1, "androidx.compose.material3.CardDefaults.<get-outlinedShape> (Card.kt:360)");
        }
        C15218g4 f = ShapesKt.m26127f(C8323m0.f21696a.mo14069c(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return f;
    }

    @C8540g
    @C11314h(name = "getShape")
    @C12579k
    /* renamed from: g */
    public final C15218g4 mo12965g(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(1266660211);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1266660211, i, -1, "androidx.compose.material3.CardDefaults.<get-shape> (Card.kt:354)");
        }
        C15218g4 f = ShapesKt.m26127f(C8343v.f22173a.mo14503c(), oVar, 6);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return f;
    }

    @C8540g
    @C12579k
    /* renamed from: h */
    public final C2223i mo12966h(boolean z, @C12580l C8592o oVar, int i, int i2) {
        long j;
        oVar.mo14918M(-392936593);
        if ((i2 & 1) != 0) {
            z = true;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-392936593, i, -1, "androidx.compose.material3.CardDefaults.outlinedCardBorder (Card.kt:533)");
        }
        if (z) {
            oVar.mo14918M(-31428837);
            j = ColorSchemeKt.m25524k(C8323m0.f21696a.mo14081o(), oVar, 6);
            oVar.mo15002m0();
        } else {
            oVar.mo14918M(-31428766);
            C8323m0 m0Var = C8323m0.f21696a;
            j = C15258l2.m66183h(C15240j2.m66080w(ColorSchemeKt.m25524k(m0Var.mo14072f(), oVar, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null), ColorSchemeKt.m25523j(C8215i1.f20180a.mo12652a(oVar, 6), m0Var.mo14071e()));
            oVar.mo15002m0();
        }
        C15240j2 n = C15240j2.m66071n(j);
        oVar.mo14918M(1157296644);
        boolean n0 = oVar.mo15006n0(n);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = C2250j.m9695a(C8323m0.f21696a.mo14082p(), j);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C2223i iVar = (C2223i) N;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return iVar;
    }

    @C8540g
    @C12579k
    /* renamed from: i */
    public final C8271r mo12967i(long j, long j2, long j3, long j4, @C12580l C8592o oVar, int i, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        C8592o oVar2 = oVar;
        int i3 = i;
        oVar2.mo14918M(-1112362409);
        if ((i2 & 1) != 0) {
            j5 = ColorSchemeKt.m25524k(C8323m0.f21696a.mo14067a(), oVar2, 6);
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = ColorSchemeKt.m25516c(j5, oVar2, i3 & 14);
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            j7 = j5;
        } else {
            j7 = j3;
        }
        if ((i2 & 8) != 0) {
            j8 = C15240j2.m66080w(j6, 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j8 = j4;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1112362409, i3, -1, "androidx.compose.material3.CardDefaults.outlinedCardColors (Card.kt:514)");
        }
        C8271r rVar = new C8271r(j5, j6, j7, j8, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return rVar;
    }

    @C8540g
    @C12579k
    /* renamed from: j */
    public final CardElevation mo12968j(float f, float f2, float f3, float f4, float f5, float f6, @C12580l C8592o oVar, int i, int i2) {
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        oVar.mo14918M(-97678773);
        if ((i2 & 1) != 0) {
            f7 = C8323m0.f21696a.mo14068b();
        } else {
            f7 = f;
        }
        if ((i2 & 2) != 0) {
            f8 = f7;
        } else {
            f8 = f2;
        }
        if ((i2 & 4) != 0) {
            f9 = f7;
        } else {
            f9 = f3;
        }
        if ((i2 & 8) != 0) {
            f10 = f7;
        } else {
            f10 = f4;
        }
        if ((i2 & 16) != 0) {
            f11 = C8323m0.f21696a.mo14073g();
        } else {
            f11 = f5;
        }
        if ((i2 & 32) != 0) {
            f12 = C8323m0.f21696a.mo14071e();
        } else {
            f12 = f6;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-97678773, i, -1, "androidx.compose.material3.CardDefaults.outlinedCardElevation (Card.kt:429)");
        }
        CardElevation cardElevation = new CardElevation(f7, f8, f9, f10, f11, f12, (DefaultConstructorMarker) null);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return cardElevation;
    }
}
