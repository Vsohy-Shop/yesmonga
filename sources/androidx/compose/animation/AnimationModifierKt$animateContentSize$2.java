package androidx.compose.animation;

import androidx.compose.animation.core.C1956d0;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8744d;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8690w;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "a", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nAnimationModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/AnimationModifierKt$animateContentSize$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,162:1\n473#2,4:163\n477#2,2:171\n481#2:177\n25#3:167\n36#3:178\n1057#4,3:168\n1060#4,3:174\n1057#4,6:179\n473#5:173\n*S KotlinDebug\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/AnimationModifierKt$animateContentSize$2\n*L\n79#1:163,4\n79#1:171,2\n79#1:177\n79#1:167\n80#1:178\n79#1:168,3\n79#1:174,3\n80#1:179,6\n79#1:173\n*E\n"})
public final class AnimationModifierKt$animateContentSize$2 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ C1956d0<C16500q> $animationSpec;
    final /* synthetic */ C11304p<C16500q, C16500q, C11079d2> $finishedListener;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimationModifierKt$animateContentSize$2(C11304p<? super C16500q, ? super C16500q, C11079d2> pVar, C1956d0<C16500q> d0Var) {
        super(3);
        this.$finishedListener = pVar;
        this.$animationSpec = d0Var;
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8767m mo6491a(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "$this$composed");
        oVar.mo14918M(-843180607);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-843180607, i, -1, "androidx.compose.animation.animateContentSize.<anonymous> (AnimationModifier.kt:76)");
        }
        oVar.mo14918M(773894976);
        oVar.mo14918M(-492369756);
        Object N = oVar.mo14921N();
        C8592o.C8593a aVar = C8592o.f23032a;
        if (N == aVar.mo16277a()) {
            C8690w wVar = new C8690w(EffectsKt.m29901m(EmptyCoroutineContext.f28243a, oVar));
            oVar.mo14893C(wVar);
            N = wVar;
        }
        oVar.mo15002m0();
        C12074o0 a = ((C8690w) N).mo16831a();
        oVar.mo15002m0();
        C1956d0<C16500q> d0Var = this.$animationSpec;
        oVar.mo14918M(1157296644);
        boolean n0 = oVar.mo15006n0(a);
        Object N2 = oVar.mo14921N();
        if (n0 || N2 == aVar.mo16277a()) {
            N2 = new SizeAnimationModifier(d0Var, a);
            oVar.mo14893C(N2);
        }
        oVar.mo15002m0();
        SizeAnimationModifier sizeAnimationModifier = (SizeAnimationModifier) N2;
        sizeAnimationModifier.mo6563n(this.$finishedListener);
        C8767m k3 = C8744d.m32515b(mVar).mo17224k3(sizeAnimationModifier);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return k3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo6491a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
