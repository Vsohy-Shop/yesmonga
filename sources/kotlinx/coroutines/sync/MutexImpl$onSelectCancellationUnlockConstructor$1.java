package kotlinx.coroutines.sync;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.selects.C12131j;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, mo22516d2 = {"Lkotlinx/coroutines/selects/j;", "<anonymous parameter 0>", "", "owner", "<anonymous parameter 2>", "Lkotlin/Function1;", "", "Lkotlin/d2;", "a", "(Lkotlinx/coroutines/selects/j;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/jvm/functions/l;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class MutexImpl$onSelectCancellationUnlockConstructor$1 extends Lambda implements C11305q<C12131j<?>, Object, Object, C11300l<? super Throwable, ? extends C11079d2>> {
    final /* synthetic */ MutexImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MutexImpl$onSelectCancellationUnlockConstructor$1(MutexImpl mutexImpl) {
        super(3);
        this.this$0 = mutexImpl;
    }

    @C12579k
    /* renamed from: a */
    public final C11300l<Throwable, C11079d2> invoke(@C12579k C12131j<?> jVar, @C12580l final Object obj, @C12580l Object obj2) {
        final MutexImpl mutexImpl = this.this$0;
        return new C11300l<Throwable, C11079d2>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C11079d2.f28267a;
            }

            public final void invoke(@C12579k Throwable th) {
                mutexImpl.mo24740g(obj);
            }
        };
    }
}
