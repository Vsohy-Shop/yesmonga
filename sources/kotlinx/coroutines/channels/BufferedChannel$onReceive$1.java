package kotlinx.coroutines.channels;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.selects.C12131j;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public /* synthetic */ class BufferedChannel$onReceive$1 extends FunctionReferenceImpl implements C11305q<BufferedChannel<?>, C12131j<?>, Object, C11079d2> {

    /* renamed from: a */
    public static final BufferedChannel$onReceive$1 f29097a = new BufferedChannel$onReceive$1();

    public BufferedChannel$onReceive$1() {
        super(3, BufferedChannel.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    /* renamed from: d */
    public final void mo23871d(@C12579k BufferedChannel<?> bufferedChannel, @C12579k C12131j<?> jVar, @C12580l Object obj) {
        bufferedChannel.mo23835i1(jVar, obj);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo23871d((BufferedChannel) obj, (C12131j) obj2, obj3);
        return C11079d2.f28267a;
    }
}
