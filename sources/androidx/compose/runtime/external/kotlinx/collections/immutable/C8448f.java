package androidx.compose.runtime.external.kotlinx.collections.immutable;

import java.util.Collection;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.markers.C11346b;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.f */
public interface C8448f<E> extends C8443b<E> {

    /* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.f$a */
    public interface C8449a<E> extends Collection<E>, C11346b {
        @C12579k
        /* renamed from: g */
        C8448f<E> mo15660g();
    }

    @C12579k
    /* renamed from: D */
    C8448f<E> mo15652D(@C12579k C11300l<? super E, Boolean> lVar);

    @C12579k
    C8448f<E> add(E e);

    @C12579k
    C8448f<E> addAll(@C12579k Collection<? extends E> collection);

    @C12579k
    C8449a<E> builder();

    @C12579k
    C8448f<E> clear();

    @C12579k
    C8448f<E> remove(E e);

    @C12579k
    C8448f<E> removeAll(@C12579k Collection<? extends E> collection);

    @C12579k
    C8448f<E> retainAll(@C12579k Collection<? extends E> collection);
}
