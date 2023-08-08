package kotlin.reflect;

import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.reflect.C11502j;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.reflect.k */
public interface C11504k<V> extends C11514o<V>, C11502j<V> {

    /* renamed from: kotlin.reflect.k$a */
    public interface C11505a<V> extends C11502j.C11503a<V>, C11300l<V, C11079d2> {
    }

    @C12579k
    C11505a<V> getSetter();

    void set(V v);
}
