package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n"}, mo22516d2 = {"T", "", "it", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class SingleProcessDataStore$actor$1 extends Lambda implements C11300l<Throwable, C11079d2> {
    final /* synthetic */ SingleProcessDataStore<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$actor$1(SingleProcessDataStore<T> singleProcessDataStore) {
        super(1);
        this.this$0 = singleProcessDataStore;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l Throwable th) {
        if (th != null) {
            this.this$0.f47404h.setValue(new C18572f(th));
        }
        SingleProcessDataStore.C18559a aVar = SingleProcessDataStore.f47394k;
        Object b = aVar.mo53556b();
        SingleProcessDataStore<T> singleProcessDataStore = this.this$0;
        synchronized (b) {
            aVar.mo53555a().remove(singleProcessDataStore.mo53546r().getAbsolutePath());
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }
}
