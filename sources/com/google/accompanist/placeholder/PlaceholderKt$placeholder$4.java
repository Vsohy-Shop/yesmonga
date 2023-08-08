package com.google.accompanist.placeholder;

import androidx.compose.animation.core.C1945a1;
import androidx.compose.animation.core.C1956d0;
import androidx.compose.animation.core.C1983k;
import androidx.compose.animation.core.C1984k0;
import androidx.compose.animation.core.C1998o0;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.DrawModifierKt;
import androidx.compose.p004ui.graphics.C15211f3;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15271n0;
import androidx.compose.p004ui.node.C15695i1;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.profileinstaller.C20022q;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11377x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "d", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nPlaceholder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeholder.kt\ncom/google/accompanist/placeholder/PlaceholderKt$placeholder$4\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,263:1\n25#2:264\n25#2:271\n25#2:278\n25#2:285\n25#2:292\n25#2:311\n67#2,3:318\n66#2:321\n1114#3,6:265\n1114#3,6:272\n1114#3,6:279\n1114#3,6:286\n1114#3,6:293\n1114#3,6:312\n1114#3,6:322\n934#4:299\n852#4,5:300\n934#4:305\n852#4,5:306\n76#5:328\n102#5,2:329\n76#5:331\n76#5:332\n*S KotlinDebug\n*F\n+ 1 Placeholder.kt\ncom/google/accompanist/placeholder/PlaceholderKt$placeholder$4\n*L\n123#1:264\n124#1:271\n125#1:278\n128#1:285\n131#1:292\n158#1:311\n159#1:318,3\n159#1:321\n123#1:265,6\n124#1:272,6\n125#1:279,6\n128#1:286,6\n131#1:293,6\n158#1:312,6\n159#1:322,6\n136#1:299\n136#1:300,5\n141#1:305\n141#1:306,5\n128#1:328\n128#1:329,2\n136#1:331\n141#1:332\n*E\n"})
public final class PlaceholderKt$placeholder$4 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ long $color;
    final /* synthetic */ C11305q<Transition.C1927b<Boolean>, C8592o, Integer, C1956d0<Float>> $contentFadeTransitionSpec;
    final /* synthetic */ C15037b $highlight;
    final /* synthetic */ C11305q<Transition.C1927b<Boolean>, C8592o, Integer, C1956d0<Float>> $placeholderFadeTransitionSpec;
    final /* synthetic */ C15218g4 $shape;
    final /* synthetic */ boolean $visible;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlaceholderKt$placeholder$4(C11305q<? super Transition.C1927b<Boolean>, ? super C8592o, ? super Integer, ? extends C1956d0<Float>> qVar, C11305q<? super Transition.C1927b<Boolean>, ? super C8592o, ? super Integer, ? extends C1956d0<Float>> qVar2, C15037b bVar, boolean z, long j, C15218g4 g4Var) {
        super(3);
        this.$placeholderFadeTransitionSpec = qVar;
        this.$contentFadeTransitionSpec = qVar2;
        this.$highlight = bVar;
        this.$visible = z;
        this.$color = j;
        this.$shape = g4Var;
    }

    /* renamed from: e */
    public static final float m64437e(C8578k2<Float> k2Var) {
        return k2Var.getValue().floatValue();
    }

    /* renamed from: f */
    public static final float m64438f(C8700z0<Float> z0Var) {
        return z0Var.getValue().floatValue();
    }

    /* renamed from: g */
    public static final void m64439g(C8700z0<Float> z0Var, float f) {
        z0Var.setValue(Float.valueOf(f));
    }

    /* renamed from: h */
    public static final float m64440h(C8578k2<Float> k2Var) {
        return k2Var.getValue().floatValue();
    }

    @C8540g
    @C12579k
    /* renamed from: d */
    public final C8767m mo42037d(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
        float f;
        float f2;
        float f3;
        float f4;
        C1984k0<Float> k0Var;
        C8700z0 z0Var;
        C8767m mVar2 = mVar;
        C8592o oVar2 = oVar;
        Intrinsics.checkNotNullParameter(mVar2, "$this$composed");
        oVar2.mo14918M(-1214629560);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1214629560, i, -1, "com.google.accompanist.placeholder.placeholder.<anonymous> (Placeholder.kt:120)");
        }
        oVar2.mo14918M(-492369756);
        Object N = oVar.mo14921N();
        C8592o.C8593a aVar = C8592o.f23032a;
        if (N == aVar.mo16277a()) {
            N = new C15695i1();
            oVar2.mo14893C(N);
        }
        oVar.mo15002m0();
        C15695i1 i1Var = (C15695i1) N;
        oVar2.mo14918M(-492369756);
        Object N2 = oVar.mo14921N();
        if (N2 == aVar.mo16277a()) {
            N2 = new C15695i1();
            oVar2.mo14893C(N2);
        }
        oVar.mo15002m0();
        C15695i1 i1Var2 = (C15695i1) N2;
        oVar2.mo14918M(-492369756);
        Object N3 = oVar.mo14921N();
        if (N3 == aVar.mo16277a()) {
            N3 = new C15695i1();
            oVar2.mo14893C(N3);
        }
        oVar.mo15002m0();
        C15695i1 i1Var3 = (C15695i1) N3;
        oVar2.mo14918M(-492369756);
        Object N4 = oVar.mo14921N();
        if (N4 == aVar.mo16277a()) {
            N4 = C8539f2.m30981g(Float.valueOf(0.0f), (C8410b2) null, 2, (Object) null);
            oVar2.mo14893C(N4);
        }
        oVar.mo15002m0();
        C8700z0 z0Var2 = (C8700z0) N4;
        boolean z = this.$visible;
        oVar2.mo14918M(-492369756);
        Object N5 = oVar.mo14921N();
        if (N5 == aVar.mo16277a()) {
            N5 = new C1998o0(Boolean.valueOf(z));
            oVar2.mo14893C(N5);
        }
        oVar.mo15002m0();
        C1998o0 o0Var = (C1998o0) N5;
        o0Var.mo6949g(Boolean.valueOf(this.$visible));
        Transition n = TransitionKt.m8195n(o0Var, "placeholder_crossfade", oVar2, C1998o0.f5575d | 48, 0);
        C11305q<Transition.C1927b<Boolean>, C8592o, Integer, C1956d0<Float>> qVar = this.$placeholderFadeTransitionSpec;
        oVar2.mo14918M(-1338768149);
        C11377x xVar = C11377x.f28521a;
        C1945a1<Float, C1983k> i2 = VectorConvertersKt.m8224i(xVar);
        oVar2.mo14918M(-142660079);
        boolean booleanValue = ((Boolean) n.mo6700h()).booleanValue();
        oVar2.mo14918M(-2085173843);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-2085173843, 0, -1, "com.google.accompanist.placeholder.placeholder.<anonymous>.<anonymous> (Placeholder.kt:138)");
        }
        if (booleanValue) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        Float valueOf = Float.valueOf(f);
        boolean booleanValue2 = ((Boolean) n.mo6706o()).booleanValue();
        oVar2.mo14918M(-2085173843);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-2085173843, 0, -1, "com.google.accompanist.placeholder.placeholder.<anonymous>.<anonymous> (Placeholder.kt:138)");
        }
        if (booleanValue2) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        C8700z0 z0Var3 = z0Var2;
        C8578k2<Float> m = TransitionKt.m8194m(n, valueOf, Float.valueOf(f2), qVar.invoke(n.mo6704m(), oVar2, 0), i2, "placeholder_fade", oVar, C20022q.C20025c.f51280k);
        oVar.mo15002m0();
        oVar.mo15002m0();
        C11305q<Transition.C1927b<Boolean>, C8592o, Integer, C1956d0<Float>> qVar2 = this.$contentFadeTransitionSpec;
        oVar2.mo14918M(-1338768149);
        C1945a1<Float, C1983k> i3 = VectorConvertersKt.m8224i(xVar);
        oVar2.mo14918M(-142660079);
        boolean booleanValue3 = ((Boolean) n.mo6700h()).booleanValue();
        oVar2.mo14918M(992792551);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(992792551, 0, -1, "com.google.accompanist.placeholder.placeholder.<anonymous>.<anonymous> (Placeholder.kt:143)");
        }
        if (booleanValue3) {
            f3 = 0.0f;
        } else {
            f3 = 1.0f;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        Float valueOf2 = Float.valueOf(f3);
        boolean booleanValue4 = ((Boolean) n.mo6706o()).booleanValue();
        oVar2.mo14918M(992792551);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(992792551, 0, -1, "com.google.accompanist.placeholder.placeholder.<anonymous>.<anonymous> (Placeholder.kt:143)");
        }
        if (booleanValue4) {
            f4 = 0.0f;
        } else {
            f4 = 1.0f;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        C8578k2<Float> m2 = TransitionKt.m8194m(n, valueOf2, Float.valueOf(f4), qVar2.invoke(n.mo6704m(), oVar2, 0), i3, "content_fade", oVar, C20022q.C20025c.f51280k);
        oVar.mo15002m0();
        oVar.mo15002m0();
        C15037b bVar = this.$highlight;
        if (bVar != null) {
            k0Var = bVar.mo42040b();
        } else {
            k0Var = null;
        }
        oVar2.mo14918M(804161798);
        if (k0Var == null || (!this.$visible && m64440h(m) < 0.01f)) {
            z0Var = z0Var3;
        } else {
            z0Var = z0Var3;
            m64439g(z0Var, ((Number) InfiniteTransitionKt.m8036a(InfiniteTransitionKt.m8040e(oVar2, 0), 0.0f, 1.0f, k0Var, oVar, (C1984k0.f5527d << 9) | InfiniteTransition.f5305f | 432).getValue()).floatValue());
        }
        oVar.mo15002m0();
        oVar2.mo14918M(-492369756);
        Object N6 = oVar.mo14921N();
        if (N6 == aVar.mo16277a()) {
            N6 = C15271n0.m66286a();
            oVar2.mo14893C(N6);
        }
        oVar.mo15002m0();
        C15211f3 f3Var = (C15211f3) N6;
        C15240j2 n2 = C15240j2.m66071n(this.$color);
        C15218g4 g4Var = this.$shape;
        C15037b bVar2 = this.$highlight;
        long j = this.$color;
        oVar2.mo14918M(1618982084);
        boolean n0 = oVar2.mo15006n0(n2) | oVar2.mo15006n0(g4Var) | oVar2.mo15006n0(bVar2);
        Object N7 = oVar.mo14921N();
        if (n0 || N7 == aVar.mo16277a()) {
            N7 = DrawModifierKt.m32438c(mVar2, new PlaceholderKt$placeholder$4$1$1(f3Var, i1Var3, g4Var, j, bVar2, i1Var2, i1Var, m2, m, z0Var));
            oVar2.mo14893C(N7);
        }
        oVar.mo15002m0();
        C8767m mVar3 = (C8767m) N7;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return mVar3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo42037d((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
