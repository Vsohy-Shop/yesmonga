package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15610w;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAndroidOverscroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidOverscrollKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,589:1\n76#2:590\n76#2:591\n50#3:592\n49#3:593\n1114#4,6:594\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidOverscrollKt\n*L\n64#1:590\n65#1:591\n67#1:592\n67#1:593\n67#1:594,6\n*E\n"})
public final class AndroidOverscrollKt {
    @C12579k

    /* renamed from: a */
    public static final C8767m f5720a;

    static {
        C8767m mVar;
        if (Build.VERSION.SDK_INT >= 31) {
            mVar = C15610w.m69384a(C15610w.m69384a(C8767m.f23478j, AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1.f5721f), AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2.f5722f);
        } else {
            mVar = C8767m.f23478j;
        }
        f5720a = mVar;
    }

    @C8540g
    @C12579k
    /* renamed from: b */
    public static final C2253k0 m8817b(@C12580l C8592o oVar, int i) {
        C2253k0 k0Var;
        oVar.mo14918M(-81138291);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-81138291, i, -1, "androidx.compose.foundation.rememberOverscrollEffect (AndroidOverscroll.kt:62)");
        }
        Context context = (Context) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70952g());
        C2251j0 j0Var = (C2251j0) oVar.mo15032w(OverscrollConfigurationKt.m9048a());
        if (j0Var != null) {
            oVar.mo14918M(511388516);
            boolean n0 = oVar.mo15006n0(context) | oVar.mo15006n0(j0Var);
            Object N = oVar.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new AndroidEdgeEffectOverscrollEffect(context, j0Var);
                oVar.mo14893C(N);
            }
            oVar.mo15002m0();
            k0Var = (C2253k0) N;
        } else {
            k0Var = C2224i0.f5977a;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return k0Var;
    }
}
