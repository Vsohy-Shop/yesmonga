package kotlinx.coroutines.channels;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Result;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C12072o;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "it", "Lkotlin/d2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ProduceKt$awaitClose$4$1 extends Lambda implements C11300l<Throwable, C11079d2> {
    final /* synthetic */ C12072o<C11079d2> $cont;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProduceKt$awaitClose$4$1(C12072o<? super C11079d2> oVar) {
        super(1);
        this.$cont = oVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l Throwable th) {
        C12072o<C11079d2> oVar = this.$cont;
        Result.C10852a aVar = Result.f28060a;
        oVar.resumeWith(Result.m38702b(C11079d2.f28267a));
    }
}
