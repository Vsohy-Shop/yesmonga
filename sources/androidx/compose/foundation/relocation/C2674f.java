package androidx.compose.foundation.relocation;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBringIntoViewResponder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewResponder.android.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponder_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,48:1\n76#2:49\n36#3:50\n1114#4,6:51\n*S KotlinDebug\n*F\n+ 1 BringIntoViewResponder.android.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponder_androidKt\n*L\n30#1:49\n31#1:50\n31#1:51,6\n*E\n"})
/* renamed from: androidx.compose.foundation.relocation.f */
public final class C2674f {
    @C8540g
    @C12579k
    /* renamed from: b */
    public static final C2671c m12053b(@C12580l C8592o oVar, int i) {
        oVar.mo14918M(-1031410916);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1031410916, i, -1, "androidx.compose.foundation.relocation.rememberDefaultBringIntoViewParent (BringIntoViewResponder.android.kt:28)");
        }
        View view = (View) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70956k());
        oVar.mo14918M(1157296644);
        boolean n0 = oVar.mo15006n0(view);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new C2669a(view);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C2669a aVar = (C2669a) N;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return aVar;
    }

    /* renamed from: c */
    public static final Rect m12054c(C15098i iVar) {
        return new Rect((int) iVar.mo42279t(), (int) iVar.mo42249B(), (int) iVar.mo42283x(), (int) iVar.mo42271j());
    }
}
