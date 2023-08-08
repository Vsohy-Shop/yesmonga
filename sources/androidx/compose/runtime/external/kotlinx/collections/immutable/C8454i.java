package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.C8448f;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.markers.C11353h;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.i */
public interface C8454i<E> extends C8447e<E>, C8448f<E> {

    /* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.i$a */
    public interface C8455a<E> extends Set<E>, C8448f.C8449a<E>, C11353h {
        @C12579k
        /* renamed from: g */
        C8454i<E> mo15660g();
    }

    @C12579k
    /* renamed from: D */
    C8454i<E> mo15652D(@C12579k C11300l<? super E, Boolean> lVar);

    @C12579k
    C8454i<E> add(E e);

    @C12579k
    C8454i<E> addAll(@C12579k Collection<? extends E> collection);

    @C12579k
    C8455a<E> builder();

    @C12579k
    C8454i<E> clear();

    @C12579k
    C8454i<E> remove(E e);

    @C12579k
    C8454i<E> removeAll(@C12579k Collection<? extends E> collection);

    @C12579k
    C8454i<E> retainAll(@C12579k Collection<? extends E> collection);
}
