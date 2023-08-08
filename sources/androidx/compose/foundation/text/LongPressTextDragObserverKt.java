package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.p004ui.input.pointer.C15472e0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlinx.coroutines.C12079p0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class LongPressTextDragObserverKt {
    @C12580l
    /* renamed from: c */
    public static final Object m12319c(@C12579k C15472e0 e0Var, @C12579k C2846t tVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object g = C12079p0.m48266g(new C2719x3c48fd5d(e0Var, tVar, (C11045c<? super C2719x3c48fd5d>) null), cVar);
        return g == C11063b.m42612h() ? g : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: d */
    public static final Object m12320d(@C12579k C15472e0 e0Var, @C12579k C2846t tVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object q = DragGestureDetectorKt.m9259q(e0Var, new C2722x131dfa73(tVar), new C2723x131dfa74(tVar), new C2724x131dfa75(tVar), new C2725x131dfa76(tVar), cVar);
        return q == C11063b.m42612h() ? q : C11079d2.f28267a;
    }

    /* renamed from: e */
    public static final Object m12321e(C15472e0 e0Var, C2846t tVar, C11045c<? super C11079d2> cVar) {
        Object o = DragGestureDetectorKt.m9257o(e0Var, new LongPressTextDragObserverKt$detectDragGesturesWithObserver$2(tVar), new LongPressTextDragObserverKt$detectDragGesturesWithObserver$3(tVar), new LongPressTextDragObserverKt$detectDragGesturesWithObserver$4(tVar), new LongPressTextDragObserverKt$detectDragGesturesWithObserver$5(tVar), cVar);
        return o == C11063b.m42612h() ? o : C11079d2.f28267a;
    }

    /* renamed from: f */
    public static final Object m12322f(C15472e0 e0Var, C2846t tVar, C11045c<? super C11079d2> cVar) {
        Object d = ForEachGestureKt.m9336d(e0Var, new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(tVar, (C11045c<? super LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2>) null), cVar);
        return d == C11063b.m42612h() ? d : C11079d2.f28267a;
    }
}
