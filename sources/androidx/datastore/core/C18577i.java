package androidx.datastore.core;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.datastore.core.i */
public interface C18577i<T> {
    @C12580l
    /* renamed from: a */
    Object mo31156a(T t, @C12579k OutputStream outputStream, @C12579k C11045c<? super C11079d2> cVar);

    @C12580l
    /* renamed from: b */
    Object mo31157b(@C12579k InputStream inputStream, @C12579k C11045c<? super T> cVar);

    T getDefaultValue();
}
