package kotlinx.coroutines.selects;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public /* synthetic */ class OnTimeout$selectClause$1 extends FunctionReferenceImpl implements C11305q<OnTimeout, C12131j<?>, Object, C11079d2> {

    /* renamed from: a */
    public static final OnTimeout$selectClause$1 f29848a = new OnTimeout$selectClause$1();

    public OnTimeout$selectClause$1() {
        super(3, OnTimeout.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    /* renamed from: d */
    public final void mo24689d(@C12579k OnTimeout onTimeout, @C12579k C12131j<?> jVar, @C12580l Object obj) {
        onTimeout.mo24687d(jVar, obj);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo24689d((OnTimeout) obj, (C12131j) obj2, obj3);
        return C11079d2.f28267a;
    }
}
