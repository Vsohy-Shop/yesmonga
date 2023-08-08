package androidx.compose.foundation.gestures;

import androidx.compose.p004ui.input.pointer.C15465c;
import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.C11744g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.gestures.TransformableKt", mo22502f = "Transformable.kt", mo22503i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, mo22504l = {134, 136}, mo22505m = "detectZoom", mo22506n = {"$this$detectZoom", "panZoomLock", "channel", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$detectZoom", "panZoomLock", "channel", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom"}, mo22507s = {"L$0", "L$1", "L$2", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "L$1", "L$2", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TransformableKt$detectZoom$1 extends ContinuationImpl {
    float F$0;
    float F$1;
    float F$2;
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public TransformableKt$detectZoom$1(C11045c<? super TransformableKt$detectZoom$1> cVar) {
        super(cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TransformableKt.m9468b((C15465c) null, (C8578k2<Boolean>) null, (C11744g<C2205o>) null, this);
    }
}
