package retrofit2;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo22516d2 = {"", "T", "", "it", "Lkotlin/d2;", "invoke", "(Ljava/lang/Throwable;)V", "retrofit2/KotlinExtensions$await$4$1", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 4, 0})
/* renamed from: retrofit2.KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$2 */
public final class C12973x19835f11 extends Lambda implements C11300l<Throwable, C11079d2> {
    final /* synthetic */ C12983b $this_await$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12973x19835f11(C12983b bVar) {
        super(1);
        this.$this_await$inlined = bVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l Throwable th) {
        this.$this_await$inlined.cancel();
    }
}
