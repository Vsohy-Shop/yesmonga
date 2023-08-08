package androidx.compose.p004ui.text;

import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nTextMeasurerHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextMeasurerHelper.kt\nandroidx/compose/ui/text/TextMeasurerHelperKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,52:1\n76#2:53\n76#2:54\n76#2:55\n83#3,3:56\n1114#4,6:59\n*S KotlinDebug\n*F\n+ 1 TextMeasurerHelper.kt\nandroidx/compose/ui/text/TextMeasurerHelperKt\n*L\n45#1:53\n46#1:54\n47#1:55\n49#1:56,3\n49#1:59,6\n*E\n"})
/* renamed from: androidx.compose.ui.text.j0 */
public final class C16348j0 {

    /* renamed from: a */
    public static final int f40576a = 8;

    @C8540g
    @C16259h
    @C12579k
    /* renamed from: a */
    public static final C16262i0 m73634a(int i, @C12580l C8592o oVar, int i2, int i3) {
        oVar.mo14918M(1538166871);
        if ((i3 & 1) != 0) {
            i = f40576a;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1538166871, i2, -1, "androidx.compose.ui.text.rememberTextMeasurer (TextMeasurerHelper.kt:41)");
        }
        C16242u.C16244b bVar = (C16242u.C16244b) oVar.mo15032w(CompositionLocalsKt.m71013k());
        C16479d dVar = (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection = (LayoutDirection) oVar.mo15032w(CompositionLocalsKt.m71018p());
        Object[] objArr = {bVar, dVar, layoutDirection, Integer.valueOf(i)};
        oVar.mo14918M(-568225417);
        boolean z = false;
        for (int i4 = 0; i4 < 4; i4++) {
            z |= oVar.mo15006n0(objArr[i4]);
        }
        Object N = oVar.mo14921N();
        if (z || N == C8592o.f23032a.mo16277a()) {
            N = new C16262i0(bVar, dVar, layoutDirection, i);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C16262i0 i0Var = (C16262i0) N;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return i0Var;
    }
}
