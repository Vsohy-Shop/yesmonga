package androidx.compose.foundation;

import android.os.Build;
import android.view.View;
import androidx.annotation.C0376v0;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.EffectsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nSystemGestureExclusion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemGestureExclusion.kt\nandroidx/compose/foundation/SystemGestureExclusionKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,162:1\n135#2:163\n135#2:164\n76#3:165\n50#4:166\n49#4:167\n1114#5,6:168\n*S KotlinDebug\n*F\n+ 1 SystemGestureExclusion.kt\nandroidx/compose/foundation/SystemGestureExclusionKt\n*L\n45#1:163\n66#1:164\n80#1:165\n81#1:166\n81#1:167\n81#1:168,6\n*E\n"})
public final class SystemGestureExclusionKt {
    @C8540g
    @C0376v0(29)
    /* renamed from: a */
    public static final C8767m m9104a(C11300l<? super C15588o, C15098i> lVar, C8592o oVar, int i) {
        oVar.mo14918M(1687674107);
        View view = (View) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70956k());
        oVar.mo14918M(511388516);
        boolean n0 = oVar.mo15006n0(view) | oVar.mo15006n0(lVar);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new C2695t(view, lVar);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C2695t tVar = (C2695t) N;
        EffectsKt.m29891c(tVar, new SystemGestureExclusionKt$excludeFromSystemGestureQ$1(tVar), oVar, 0);
        oVar.mo15002m0();
        return tVar;
    }

    @C12579k
    /* renamed from: b */
    public static final C8767m m9105b(@C12579k C8767m mVar) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (Build.VERSION.SDK_INT < 29) {
            return mVar;
        }
        if (InspectableValueKt.m71063e()) {
            lVar = new C2100x96d1b9f3();
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return ComposedModifierKt.m32282e(mVar, lVar, SystemGestureExclusionKt$systemGestureExclusion$2.f5796f);
    }

    @C12579k
    /* renamed from: c */
    public static final C8767m m9106c(@C12579k C8767m mVar, @C12579k C11300l<? super C15588o, C15098i> lVar) {
        C11300l lVar2;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "exclusion");
        if (Build.VERSION.SDK_INT < 29) {
            return mVar;
        }
        if (InspectableValueKt.m71063e()) {
            lVar2 = new C2101x96d1b9f4(lVar);
        } else {
            lVar2 = InspectableValueKt.m71060b();
        }
        return ComposedModifierKt.m32282e(mVar, lVar2, new SystemGestureExclusionKt$systemGestureExclusion$4(lVar));
    }
}
