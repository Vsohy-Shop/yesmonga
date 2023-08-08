package kotlinx.coroutines.channels;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public /* synthetic */ class BufferedChannelKt$createSegmentFunction$1 extends FunctionReferenceImpl implements C11304p<Long, C11754l<E>, C11754l<E>> {

    /* renamed from: a */
    public static final BufferedChannelKt$createSegmentFunction$1 f29142a = new BufferedChannelKt$createSegmentFunction$1();

    public BufferedChannelKt$createSegmentFunction$1() {
        super(2, BufferedChannelKt.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }

    @C12579k
    /* renamed from: d */
    public final C11754l<E> mo23883d(long j, @C12579k C11754l<E> lVar) {
        return BufferedChannelKt.m46419x(j, lVar);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo23883d(((Number) obj).longValue(), (C11754l) obj2);
    }
}
