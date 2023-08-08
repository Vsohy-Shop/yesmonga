package androidx.compose.foundation.gestures;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.pointer.C15465c;
import androidx.compose.p004ui.input.pointer.C15507w;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", mo22502f = "DragGestureDetector.kt", mo22503i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, mo22504l = {674, 708}, mo22505m = "awaitPointerSlopOrCancellation-wtdNQyU", mo22506n = {"$this$awaitPointerSlopOrCancellation_u2dwtdNQyU", "pointerDirectionConfig", "onPointerSlopReached", "pointer", "triggerOnMainAxisSlop", "touchSlop", "totalMainPositionChange", "totalCrossPositionChange", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU", "pointerDirectionConfig", "onPointerSlopReached", "pointer", "dragEvent", "triggerOnMainAxisSlop", "touchSlop", "totalMainPositionChange", "totalCrossPositionChange"}, mo22507s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "F$0", "F$1", "F$2", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "F$0", "F$1", "F$2"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 176)
@C11363r0({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1\n*L\n1#1,873:1\n*E\n"})
public final class DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 extends ContinuationImpl {
    float F$0;
    float F$1;
    float F$2;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    public DragGestureDetectorKt$awaitPointerSlopOrCancellation$1(C11045c<? super DragGestureDetectorKt$awaitPointerSlopOrCancellation$1> cVar) {
        super(cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m9250h((C15465c) null, 0, 0, (C2197i) null, false, (C11304p<? super C15507w, ? super C15094f, C11079d2>) null, this);
    }
}
