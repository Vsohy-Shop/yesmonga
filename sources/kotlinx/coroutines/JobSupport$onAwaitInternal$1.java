package kotlinx.coroutines;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.selects.C12131j;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public /* synthetic */ class JobSupport$onAwaitInternal$1 extends FunctionReferenceImpl implements C11305q<JobSupport, C12131j<?>, Object, C11079d2> {

    /* renamed from: a */
    public static final JobSupport$onAwaitInternal$1 f29032a = new JobSupport$onAwaitInternal$1();

    public JobSupport$onAwaitInternal$1() {
        super(3, JobSupport.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    /* renamed from: d */
    public final void mo23688d(@C12579k JobSupport jobSupport, @C12579k C12131j<?> jVar, @C12580l Object obj) {
        jobSupport.mo23655u1(jVar, obj);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo23688d((JobSupport) obj, (C12131j) obj2, obj3);
        return C11079d2.f28267a;
    }
}
