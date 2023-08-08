package kotlin.reflect;

import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.reflect.C11502j;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.reflect.l */
public interface C11506l<T, V> extends C11516p<T, V>, C11502j<V> {

    /* renamed from: kotlin.reflect.l$a */
    public interface C11507a<T, V> extends C11502j.C11503a<V>, C11304p<T, V, C11079d2> {
    }

    /* renamed from: K1 */
    void mo22735K1(T t, V v);

    @C12579k
    C11507a<T, V> getSetter();
}
