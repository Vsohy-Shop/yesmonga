package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C2237c;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.HoverableKt$hoverable$2", mo22502f = "Hoverable.kt", mo22503i = {0, 0}, mo22504l = {62}, mo22505m = "invoke$emitEnter", mo22506n = {"hoverInteraction$delegate", "interaction"}, mo22507s = {"L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class HoverableKt$hoverable$2$invoke$emitEnter$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public HoverableKt$hoverable$2$invoke$emitEnter$1(C11045c<? super HoverableKt$hoverable$2$invoke$emitEnter$1> cVar) {
        super(cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return HoverableKt$hoverable$2.m8956e((C2243g) null, (C8700z0<C2237c.C2238a>) null, this);
    }
}
