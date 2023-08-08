package kotlinx.coroutines.channels;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.selects.C12131j;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public /* synthetic */ class LazyActorCoroutine$onSend$1 extends FunctionReferenceImpl implements C11305q<LazyActorCoroutine<?>, C12131j<?>, Object, C11079d2> {

    /* renamed from: a */
    public static final LazyActorCoroutine$onSend$1 f29147a = new LazyActorCoroutine$onSend$1();

    public LazyActorCoroutine$onSend$1() {
        super(3, LazyActorCoroutine.class, "onSendRegFunction", "onSendRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    /* renamed from: d */
    public final void mo23906d(@C12579k LazyActorCoroutine<?> lazyActorCoroutine, @C12579k C12131j<?> jVar, @C12580l Object obj) {
        lazyActorCoroutine.mo23905V1(jVar, obj);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo23906d((LazyActorCoroutine) obj, (C12131j) obj2, obj3);
        return C11079d2.f28267a;
    }
}
