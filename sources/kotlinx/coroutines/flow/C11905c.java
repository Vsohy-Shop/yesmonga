package kotlinx.coroutines.flow;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C11760r;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.flow.c */
public class C11905c<T> extends ChannelFlow<T> {
    @C12579k

    /* renamed from: d */
    public final C11304p<C11760r<? super T>, C11045c<? super C11079d2>, Object> f29466d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11905c(C11304p pVar, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar, (i2 & 2) != 0 ? EmptyCoroutineContext.f28243a : coroutineContext, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    /* renamed from: o */
    public static /* synthetic */ <T> Object m47345o(C11905c<T> cVar, C11760r<? super T> rVar, C11045c<? super C11079d2> cVar2) {
        Object invoke = cVar.f29466d.invoke(rVar, cVar2);
        return invoke == C11063b.m42612h() ? invoke : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: i */
    public Object mo24082i(@C12579k C11760r<? super T> rVar, @C12579k C11045c<? super C11079d2> cVar) {
        return m47345o(this, rVar, cVar);
    }

    @C12579k
    /* renamed from: j */
    public ChannelFlow<T> mo24083j(@C12579k CoroutineContext coroutineContext, int i, @C12579k BufferOverflow bufferOverflow) {
        return new C11905c(this.f29466d, coroutineContext, i, bufferOverflow);
    }

    @C12579k
    public String toString() {
        return "block[" + this.f29466d + "] -> " + super.toString();
    }

    public C11905c(@C12579k C11304p<? super C11760r<? super T>, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12579k CoroutineContext coroutineContext, int i, @C12579k BufferOverflow bufferOverflow) {
        super(coroutineContext, i, bufferOverflow);
        this.f29466d = pVar;
    }
}
