package androidx.compose.p004ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.p004ui.C8767m;
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
@C11363r0({"SMAP\nPointerInteropFilter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt$pointerInteropFilter$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,350:1\n25#2:351\n1114#3,6:352\n*S KotlinDebug\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt$pointerInteropFilter$2\n*L\n79#1:351\n79#1:352,6\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$pointerInteropFilter$2 */
public final class PointerInteropFilter_androidKt$pointerInteropFilter$2 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ C11300l<MotionEvent, Boolean> $onTouchEvent;
    final /* synthetic */ C15488l0 $requestDisallowInterceptTouchEvent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter_androidKt$pointerInteropFilter$2(C11300l<? super MotionEvent, Boolean> lVar, C15488l0 l0Var) {
        super(3);
        this.$onTouchEvent = lVar;
        this.$requestDisallowInterceptTouchEvent = l0Var;
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8767m mo43989a(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "$this$composed");
        oVar.mo14918M(374375707);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(374375707, i, -1, "androidx.compose.ui.input.pointer.pointerInteropFilter.<anonymous> (PointerInteropFilter.android.kt:77)");
        }
        oVar.mo14918M(-492369756);
        Object N = oVar.mo14921N();
        if (N == C8592o.f23032a.mo16277a()) {
            N = new PointerInteropFilter();
            oVar.mo14893C(N);
        }
        oVar.mo15002m0();
        PointerInteropFilter pointerInteropFilter = (PointerInteropFilter) N;
        pointerInteropFilter.mo43976l(this.$onTouchEvent);
        pointerInteropFilter.mo43977m(this.$requestDisallowInterceptTouchEvent);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return pointerInteropFilter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo43989a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
