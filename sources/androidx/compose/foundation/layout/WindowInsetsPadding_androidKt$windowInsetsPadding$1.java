package androidx.compose.foundation.layout;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "a", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nWindowInsetsPadding.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,255:1\n36#2:256\n1057#3,6:257\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt$windowInsetsPadding$1\n*L\n251#1:256\n251#1:257,6\n*E\n"})
public final class WindowInsetsPadding_androidKt$windowInsetsPadding$1 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ C11300l<WindowInsetsHolder, C2354e1> $insetsCalculation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowInsetsPadding_androidKt$windowInsetsPadding$1(C11300l<? super WindowInsetsHolder, ? extends C2354e1> lVar) {
        super(3);
        this.$insetsCalculation = lVar;
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8767m mo7972a(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "$this$composed");
        oVar.mo14918M(359872873);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(359872873, i, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:248)");
        }
        WindowInsetsHolder c = WindowInsetsHolder.f6181x.mo7913c(oVar, 8);
        C11300l<WindowInsetsHolder, C2354e1> lVar = this.$insetsCalculation;
        oVar.mo14918M(1157296644);
        boolean n0 = oVar.mo15006n0(c);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new InsetsPaddingModifier(lVar.invoke(c), (C11300l) null, 2, (DefaultConstructorMarker) null);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) N;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return insetsPaddingModifier;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo7972a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
