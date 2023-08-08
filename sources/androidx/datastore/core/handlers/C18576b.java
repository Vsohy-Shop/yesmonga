package androidx.datastore.core.handlers;

import androidx.datastore.core.C18567a;
import androidx.datastore.core.CorruptionException;
import java.io.IOException;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.datastore.core.handlers.b */
public final class C18576b<T> implements C18567a<T> {
    @C12579k

    /* renamed from: a */
    public final C11300l<CorruptionException, T> f47425a;

    public C18576b(@C12579k C11300l<? super CorruptionException, ? extends T> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "produceNewData");
        this.f47425a = lVar;
    }

    @C12580l
    /* renamed from: a */
    public Object mo53575a(@C12579k CorruptionException corruptionException, @C12579k C11045c<? super T> cVar) throws IOException {
        return this.f47425a.invoke(corruptionException);
    }
}
