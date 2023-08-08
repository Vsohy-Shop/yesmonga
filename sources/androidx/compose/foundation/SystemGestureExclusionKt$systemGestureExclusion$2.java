package androidx.compose.foundation;

import android.view.View;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "a", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nSystemGestureExclusion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemGestureExclusion.kt\nandroidx/compose/foundation/SystemGestureExclusionKt$systemGestureExclusion$2\n+ 2 SystemGestureExclusion.kt\nandroidx/compose/foundation/SystemGestureExclusionKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,162:1\n80#2:163\n81#2:165\n82#2:174\n76#3:164\n50#4:166\n49#4:167\n1114#5,6:168\n*S KotlinDebug\n*F\n+ 1 SystemGestureExclusion.kt\nandroidx/compose/foundation/SystemGestureExclusionKt$systemGestureExclusion$2\n*L\n48#1:163\n48#1:165\n48#1:174\n48#1:164\n48#1:166\n48#1:167\n48#1:168,6\n*E\n"})
public final class SystemGestureExclusionKt$systemGestureExclusion$2 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {

    /* renamed from: f */
    public static final SystemGestureExclusionKt$systemGestureExclusion$2 f5796f = new SystemGestureExclusionKt$systemGestureExclusion$2();

    public SystemGestureExclusionKt$systemGestureExclusion$2() {
        super(3);
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8767m mo7282a(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "$this$composed");
        oVar.mo14918M(1120057036);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1120057036, i, -1, "androidx.compose.foundation.systemGestureExclusion.<anonymous> (SystemGestureExclusion.kt:46)");
        }
        oVar.mo14918M(1687674107);
        View view = (View) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70956k());
        oVar.mo14918M(511388516);
        boolean n0 = oVar.mo15006n0(view) | oVar.mo15006n0((Object) null);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new C2695t(view, (C11300l<? super C15588o, C15098i>) null);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C2695t tVar = (C2695t) N;
        EffectsKt.m29891c(tVar, new SystemGestureExclusionKt$excludeFromSystemGestureQ$1(tVar), oVar, 0);
        oVar.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return tVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo7282a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
