package androidx.compose.animation;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "a", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class AnimatedVisibilityScope$animateEnterExit$2 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ C2025e $enter;
    final /* synthetic */ C2028g $exit;
    final /* synthetic */ String $label;
    final /* synthetic */ AnimatedVisibilityScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityScope$animateEnterExit$2(AnimatedVisibilityScope animatedVisibilityScope, C2025e eVar, C2028g gVar, String str) {
        super(3);
        this.this$0 = animatedVisibilityScope;
        this.$enter = eVar;
        this.$exit = gVar;
        this.$label = str;
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8767m mo6489a(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "$this$composed");
        oVar.mo14918M(1840112047);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1840112047, i, -1, "androidx.compose.animation.AnimatedVisibilityScope.animateEnterExit.<anonymous> (AnimatedVisibility.kt:671)");
        }
        C8767m k3 = mVar.mo17224k3(EnterExitTransitionKt.m7827g(this.this$0.mo6487c(), this.$enter, this.$exit, this.$label, oVar, 0));
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return k3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo6489a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
