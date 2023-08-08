package kotlinx.coroutines.flow.internal;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11074j;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public /* synthetic */ class SafeCollectorKt$emitFun$1 extends FunctionReferenceImpl implements C11305q<C11908f<? super Object>, Object, C11045c<? super C11079d2>, Object>, C11074j {

    /* renamed from: a */
    public static final SafeCollectorKt$emitFun$1 f29501a = new SafeCollectorKt$emitFun$1();

    public SafeCollectorKt$emitFun$1() {
        super(3, C11908f.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @C12580l
    /* renamed from: d */
    public final Object invoke(@C12579k C11908f<Object> fVar, @C12580l Object obj, @C12579k C11045c<? super C11079d2> cVar) {
        return fVar.emit(obj, cVar);
    }
}
