package kotlinx.coroutines.channels;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.selects.C12131j;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\"\u0004\b\u0000\u0010\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, mo22516d2 = {"E", "Lkotlinx/coroutines/selects/j;", "select", "", "<anonymous parameter 1>", "element", "Lkotlin/Function1;", "", "Lkotlin/d2;", "a", "(Lkotlinx/coroutines/selects/j;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/jvm/functions/l;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: kotlinx.coroutines.channels.BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1 */
public final class C11733xffb418de extends Lambda implements C11305q<C12131j<?>, Object, Object, C11300l<? super Throwable, ? extends C11079d2>> {
    final /* synthetic */ BufferedChannel<E> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11733xffb418de(BufferedChannel<E> bufferedChannel) {
        super(3);
        this.this$0 = bufferedChannel;
    }

    @C12579k
    /* renamed from: a */
    public final C11300l<Throwable, C11079d2> invoke(@C12579k final C12131j<?> jVar, @C12580l Object obj, @C12580l final Object obj2) {
        final BufferedChannel<E> bufferedChannel = this.this$0;
        return new C11300l<Throwable, C11079d2>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C11079d2.f28267a;
            }

            public final void invoke(@C12579k Throwable th) {
                if (obj2 != BufferedChannelKt.m46421z()) {
                    OnUndeliveredElementKt.m47763b(bufferedChannel.f29090b, obj2, jVar.getContext());
                }
            }
        };
    }
}
