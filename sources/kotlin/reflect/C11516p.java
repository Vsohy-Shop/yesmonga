package kotlin.reflect;

import kotlin.C11665v0;
import kotlin.jvm.functions.C11300l;
import kotlin.reflect.C11510n;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.reflect.p */
public interface C11516p<T, V> extends C11510n<V>, C11300l<T, V> {

    /* renamed from: kotlin.reflect.p$a */
    public interface C11517a<T, V> extends C11510n.C11513c<V>, C11300l<T, V> {
    }

    V get(T t);

    @C12579k
    C11517a<T, V> getGetter();

    @C12580l
    @C11665v0(version = "1.1")
    /* renamed from: l0 */
    Object mo22734l0(T t);
}
