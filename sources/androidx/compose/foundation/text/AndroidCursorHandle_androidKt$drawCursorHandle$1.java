package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.C2844t;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.DrawModifierKt;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "a", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nAndroidCursorHandle.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt$drawCursorHandle$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,82:1\n76#2:83\n36#3:84\n1114#4,6:85\n*S KotlinDebug\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt$drawCursorHandle$1\n*L\n64#1:83\n66#1:84\n66#1:85,6\n*E\n"})
public final class AndroidCursorHandle_androidKt$drawCursorHandle$1 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {

    /* renamed from: f */
    public static final AndroidCursorHandle_androidKt$drawCursorHandle$1 f7064f = new AndroidCursorHandle_androidKt$drawCursorHandle$1();

    public AndroidCursorHandle_androidKt$drawCursorHandle$1() {
        super(3);
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8767m mo9216a(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "$this$composed");
        oVar.mo14918M(-2126899193);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-2126899193, i, -1, "androidx.compose.foundation.text.drawCursorHandle.<anonymous> (AndroidCursorHandle.android.kt:62)");
        }
        long b = ((C2844t) oVar.mo15032w(TextSelectionColorsKt.m12954c())).mo9907b();
        C8767m.C8768a aVar = C8767m.f23478j;
        C15240j2 n = C15240j2.m66071n(b);
        oVar.mo14918M(1157296644);
        boolean n0 = oVar.mo15006n0(n);
        Object N = oVar.mo14921N();
        if (n0 || N == C8592o.f23032a.mo16277a()) {
            N = new AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1(b);
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        C8767m k3 = mVar.mo17224k3(DrawModifierKt.m32437b(aVar, (C11300l) N));
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return k3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo9216a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
