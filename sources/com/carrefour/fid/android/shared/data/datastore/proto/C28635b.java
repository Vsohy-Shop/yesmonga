package com.carrefour.fid.android.shared.data.datastore.proto;

import androidx.datastore.core.C18570d;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.shared.data.datastore.proto.b */
public interface C28635b<T> {
    @C12579k
    /* renamed from: a */
    C18570d<T> mo31121a();

    @C12580l
    /* renamed from: b */
    Object mo31122b(@C12579k C11045c<? super C11907e<? extends T>> cVar);

    @C12580l
    /* renamed from: c */
    Object mo31123c(T t, @C12579k C11045c<? super C11079d2> cVar);

    @C12580l
    Object clear(@C12579k C11045c<? super C11079d2> cVar);
}
