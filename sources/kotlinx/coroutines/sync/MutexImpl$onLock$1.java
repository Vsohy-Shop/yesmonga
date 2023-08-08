package kotlinx.coroutines.sync;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.selects.C12131j;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public /* synthetic */ class MutexImpl$onLock$1 extends FunctionReferenceImpl implements C11305q<MutexImpl, C12131j<?>, Object, C11079d2> {

    /* renamed from: a */
    public static final MutexImpl$onLock$1 f29905a = new MutexImpl$onLock$1();

    public MutexImpl$onLock$1() {
        super(3, MutexImpl.class, "onLockRegFunction", "onLockRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    /* renamed from: d */
    public final void mo24751d(@C12579k MutexImpl mutexImpl, @C12579k C12131j<?> jVar, @C12580l Object obj) {
        mutexImpl.mo24735C(jVar, obj);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo24751d((MutexImpl) obj, (C12131j) obj2, obj3);
        return C11079d2.f28267a;
    }
}
