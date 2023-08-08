package androidx.compose.foundation.gestures;

import androidx.compose.p004ui.input.pointer.C15465c;
import androidx.compose.p004ui.input.pointer.PointerEventPass;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", mo22502f = "TapGestureDetector.kt", mo22503i = {0, 0, 0}, mo22504l = {279}, mo22505m = "awaitFirstDown", mo22506n = {"$this$awaitFirstDown", "pass", "requireUnconsumed"}, mo22507s = {"L$0", "L$1", "Z$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TapGestureDetectorKt$awaitFirstDown$2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    public TapGestureDetectorKt$awaitFirstDown$2(C11045c<? super TapGestureDetectorKt$awaitFirstDown$2> cVar) {
        super(cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.m9437d((C15465c) null, false, (PointerEventPass) null, this);
    }
}
