package androidx.datastore.core;

import androidx.core.app.C17075f2;
import androidx.datastore.core.SingleProcessDataStore;
import java.util.concurrent.CancellationException;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C12169x;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n"}, mo22516d2 = {"T", "Landroidx/datastore/core/SingleProcessDataStore$b;", "msg", "", "ex", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class SingleProcessDataStore$actor$2 extends Lambda implements C11304p<SingleProcessDataStore.C18560b<T>, Throwable, C11079d2> {

    /* renamed from: f */
    public static final SingleProcessDataStore$actor$2 f47415f = new SingleProcessDataStore$actor$2();

    public SingleProcessDataStore$actor$2() {
        super(2);
    }

    /* renamed from: a */
    public final void mo53568a(@C12579k SingleProcessDataStore.C18560b<T> bVar, @C12580l Throwable th) {
        Intrinsics.checkNotNullParameter(bVar, C17075f2.f45108s0);
        if (bVar instanceof SingleProcessDataStore.C18560b.C18562b) {
            C12169x b = ((SingleProcessDataStore.C18560b.C18562b) bVar).mo53558b();
            if (th == null) {
                th = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            b.mo24790i(th);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo53568a((SingleProcessDataStore.C18560b) obj, (Throwable) obj2);
        return C11079d2.f28267a;
    }
}
