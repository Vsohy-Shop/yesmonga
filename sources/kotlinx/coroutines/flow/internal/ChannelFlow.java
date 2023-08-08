package kotlinx.coroutines.flow.internal;

import java.util.ArrayList;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.C11287e;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.C12090r0;
import kotlinx.coroutines.C12177y1;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C11760r;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C12177y1
@C11363r0({"SMAP\nChannelFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,245:1\n1#2:246\n*E\n"})
public abstract class ChannelFlow<T> implements C11932i<T> {
    @C12579k
    @C11287e

    /* renamed from: a */
    public final CoroutineContext f29470a;
    @C11287e

    /* renamed from: b */
    public final int f29471b;
    @C12579k
    @C11287e

    /* renamed from: c */
    public final BufferOverflow f29472c;

    public ChannelFlow(@C12579k CoroutineContext coroutineContext, int i, @C12579k BufferOverflow bufferOverflow) {
        this.f29470a = coroutineContext;
        this.f29471b = i;
        this.f29472c = bufferOverflow;
    }

    /* renamed from: h */
    public static /* synthetic */ <T> Object m47523h(ChannelFlow<T> channelFlow, C11908f<? super T> fVar, C11045c<? super C11079d2> cVar) {
        Object g = C12079p0.m48266g(new ChannelFlow$collect$2(fVar, channelFlow, (C11045c<? super ChannelFlow$collect$2>) null), cVar);
        return g == C11063b.m42612h() ? g : C11079d2.f28267a;
    }

    @C12579k
    /* renamed from: c */
    public C11907e<T> mo24201c(@C12579k CoroutineContext coroutineContext, int i, @C12579k BufferOverflow bufferOverflow) {
        CoroutineContext Q = coroutineContext.mo7443Q(this.f29470a);
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            int i2 = this.f29471b;
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2 && (i2 = i2 + i) < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
                i = i2;
            }
            bufferOverflow = this.f29472c;
        }
        if (Intrinsics.areEqual((Object) Q, (Object) this.f29470a) && i == this.f29471b && bufferOverflow == this.f29472c) {
            return this;
        }
        return mo24083j(Q, i, bufferOverflow);
    }

    @C12580l
    public Object collect(@C12579k C11908f<? super T> fVar, @C12579k C11045c<? super C11079d2> cVar) {
        return m47523h(this, fVar, cVar);
    }

    @C12580l
    /* renamed from: g */
    public String mo24223g() {
        return null;
    }

    @C12580l
    /* renamed from: i */
    public abstract Object mo24082i(@C12579k C11760r<? super T> rVar, @C12579k C11045c<? super C11079d2> cVar);

    @C12579k
    /* renamed from: j */
    public abstract ChannelFlow<T> mo24083j(@C12579k CoroutineContext coroutineContext, int i, @C12579k BufferOverflow bufferOverflow);

    @C12580l
    /* renamed from: k */
    public C11907e<T> mo24224k() {
        return null;
    }

    @C12579k
    /* renamed from: l */
    public final C11304p<C11760r<? super T>, C11045c<? super C11079d2>, Object> mo24230l() {
        return new ChannelFlow$collectToFun$1(this, (C11045c<? super ChannelFlow$collectToFun$1>) null);
    }

    /* renamed from: m */
    public final int mo24231m() {
        int i = this.f29471b;
        if (i == -3) {
            return -2;
        }
        return i;
    }

    @C12579k
    /* renamed from: n */
    public ReceiveChannel<T> mo24225n(@C12579k C12074o0 o0Var) {
        return ProduceKt.m46532h(o0Var, this.f29470a, mo24231m(), this.f29472c, CoroutineStart.ATOMIC, (C11300l) null, mo24230l(), 16, (Object) null);
    }

    @C12579k
    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String g = mo24223g();
        if (g != null) {
            arrayList.add(g);
        }
        if (this.f29470a != EmptyCoroutineContext.f28243a) {
            arrayList.add("context=" + this.f29470a);
        }
        if (this.f29471b != -3) {
            arrayList.add("capacity=" + this.f29471b);
        }
        if (this.f29472c != BufferOverflow.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f29472c);
        }
        return C12090r0.m48300a(this) + C12361b.f30260k + CollectionsKt___CollectionsKt.m40639h3(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 62, (Object) null) + C12361b.f30261l;
    }
}
