package kotlinx.coroutines.sync;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public /* synthetic */ class MutexImpl$onLock$2 extends FunctionReferenceImpl implements C11305q<MutexImpl, Object, Object, Object> {

    /* renamed from: a */
    public static final MutexImpl$onLock$2 f29906a = new MutexImpl$onLock$2();

    public MutexImpl$onLock$2() {
        super(3, MutexImpl.class, "onLockProcessResult", "onLockProcessResult(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @C12580l
    /* renamed from: d */
    public final Object invoke(@C12579k MutexImpl mutexImpl, @C12580l Object obj, @C12580l Object obj2) {
        return mutexImpl.mo24734B(obj, obj2);
    }
}
