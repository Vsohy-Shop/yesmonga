package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.C8448f;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.markers.C11349e;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.g */
public interface C8450g<E> extends C8444c<E>, C8448f<E> {

    /* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.g$a */
    public interface C8451a<E> extends List<E>, C8448f.C8449a<E>, C11349e {
        @C12579k
        /* renamed from: g */
        C8450g<E> mo15660g();
    }

    @C12579k
    /* renamed from: D */
    C8450g<E> mo15652D(@C12579k C11300l<? super E, Boolean> lVar);

    @C12579k
    /* renamed from: Z0 */
    C8450g<E> mo15661Z0(int i);

    @C12579k
    C8450g<E> add(int i, E e);

    @C12579k
    C8450g<E> add(E e);

    @C12579k
    C8450g<E> addAll(int i, @C12579k Collection<? extends E> collection);

    @C12579k
    C8450g<E> addAll(@C12579k Collection<? extends E> collection);

    @C12579k
    C8451a<E> builder();

    @C12579k
    C8450g<E> clear();

    @C12579k
    C8450g<E> remove(E e);

    @C12579k
    C8450g<E> removeAll(@C12579k Collection<? extends E> collection);

    @C12579k
    C8450g<E> retainAll(@C12579k Collection<? extends E> collection);

    @C12579k
    C8450g<E> set(int i, E e);
}
