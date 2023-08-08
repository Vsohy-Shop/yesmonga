package androidx.compose.foundation.gestures;

import androidx.compose.p004ui.input.pointer.C15465c;
import androidx.compose.p004ui.input.pointer.C15507w;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", mo22502f = "DragGestureDetector.kt", mo22503i = {0, 0, 0, 0, 0, 0}, mo22504l = {876}, mo22505m = "drag-VnAYq1g", mo22506n = {"$this$drag_u2dVnAYq1g", "onDrag", "motionFromChange", "motionConsumed", "$this$awaitDragOrUp_u2djO51t88$iv", "pointer$iv"}, mo22507s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 176)
@C11363r0({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2\n*L\n1#1,873:1\n*E\n"})
public final class DragGestureDetectorKt$drag$2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;

    public DragGestureDetectorKt$drag$2(C11045c<? super DragGestureDetectorKt$drag$2> cVar) {
        super(cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m9265w((C15465c) null, 0, (C11300l<? super C15507w, C11079d2>) null, (C11300l<? super C15507w, Float>) null, (C11300l<? super C15507w, Boolean>) null, this);
    }
}
