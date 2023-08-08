package androidx.compose.p004ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.platform.InspectableValueKt;
import androidx.compose.p004ui.viewinterop.AndroidViewHolder;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPointerInteropFilter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,350:1\n135#2:351\n*S KotlinDebug\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter_androidKt\n*L\n73#1:351\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt */
public final class PointerInteropFilter_androidKt {
    @C8761g
    @C12579k
    /* renamed from: a */
    public static final C8767m m68372a(@C12579k C8767m mVar, @C12579k C11300l<? super MotionEvent, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "watcher");
        return SuspendingPointerInputFilterKt.m68437c(mVar, lVar, new PointerInteropFilter_androidKt$motionEventSpy$1(lVar, (C11045c<? super PointerInteropFilter_androidKt$motionEventSpy$1>) null));
    }

    @C8761g
    @C12579k
    /* renamed from: b */
    public static final C8767m m68373b(@C12579k C8767m mVar, @C12580l C15488l0 l0Var, @C12579k C11300l<? super MotionEvent, Boolean> lVar) {
        C11300l lVar2;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "onTouchEvent");
        if (InspectableValueKt.m71063e()) {
            lVar2 = new C15452xeacf5c03(l0Var, lVar);
        } else {
            lVar2 = InspectableValueKt.m71060b();
        }
        return ComposedModifierKt.m32282e(mVar, lVar2, new PointerInteropFilter_androidKt$pointerInteropFilter$2(lVar, l0Var));
    }

    @C8761g
    @C12579k
    /* renamed from: c */
    public static final C8767m m68374c(@C12579k C8767m mVar, @C12579k AndroidViewHolder androidViewHolder) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(androidViewHolder, C40383c.f102945c);
        PointerInteropFilter pointerInteropFilter = new PointerInteropFilter();
        pointerInteropFilter.mo43976l(new PointerInteropFilter_androidKt$pointerInteropFilter$3(androidViewHolder));
        C15488l0 l0Var = new C15488l0();
        pointerInteropFilter.mo43977m(l0Var);
        androidViewHolder.setOnRequestDisallowInterceptTouchEvent$ui_release(l0Var);
        return mVar.mo17224k3(pointerInteropFilter);
    }

    /* renamed from: d */
    public static /* synthetic */ C8767m m68375d(C8767m mVar, C15488l0 l0Var, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            l0Var = null;
        }
        return m68373b(mVar, l0Var, lVar);
    }
}
