package kotlinx.coroutines.channels;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.C11763t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", mo22502f = "Deprecated.kt", mo22503i = {0, 0, 1, 1}, mo22504l = {487, 242}, mo22505m = "filterNotNullTo", mo22506n = {"destination", "$this$consume$iv$iv", "destination", "$this$consume$iv$iv"}, mo22507s = {"L$0", "L$1", "L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ChannelsKt__DeprecatedKt$filterNotNullTo$3<E, C extends C11763t<? super E>> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public ChannelsKt__DeprecatedKt$filterNotNullTo$3(C11045c<? super ChannelsKt__DeprecatedKt$filterNotNullTo$3> cVar) {
        super(cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ChannelsKt__DeprecatedKt.m46493v((ReceiveChannel) null, (C11763t) null, this);
    }
}
