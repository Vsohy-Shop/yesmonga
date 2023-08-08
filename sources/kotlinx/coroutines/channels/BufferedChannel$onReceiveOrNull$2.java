package kotlinx.coroutines.channels;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public /* synthetic */ class BufferedChannel$onReceiveOrNull$2 extends FunctionReferenceImpl implements C11305q<BufferedChannel<?>, Object, Object, Object> {

    /* renamed from: a */
    public static final BufferedChannel$onReceiveOrNull$2 f29102a = new BufferedChannel$onReceiveOrNull$2();

    public BufferedChannel$onReceiveOrNull$2() {
        super(3, BufferedChannel.class, "processResultSelectReceiveOrNull", "processResultSelectReceiveOrNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @C12580l
    /* renamed from: d */
    public final Object invoke(@C12579k BufferedChannel<?> bufferedChannel, @C12580l Object obj, @C12580l Object obj2) {
        return bufferedChannel.mo23818Z0(obj, obj2);
    }
}
