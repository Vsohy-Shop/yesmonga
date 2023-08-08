package androidx.compose.foundation.gestures;

import androidx.compose.p004ui.input.pointer.C15472e0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.gestures.ForEachGestureKt", mo22502f = "ForEachGesture.kt", mo22503i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, mo22504l = {48, 51, 56}, mo22505m = "forEachGesture", mo22506n = {"$this$forEachGesture", "block", "currentContext", "$this$forEachGesture", "block", "currentContext", "$this$forEachGesture", "block", "currentContext"}, mo22507s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ForEachGestureKt$forEachGesture$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public ForEachGestureKt$forEachGesture$1(C11045c<? super ForEachGestureKt$forEachGesture$1> cVar) {
        super(cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ForEachGestureKt.m9337e((C15472e0) null, (C11304p<? super C15472e0, ? super C11045c<? super C11079d2>, ? extends Object>) null, this);
    }
}
