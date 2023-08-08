package kotlin.reflect;

import kotlin.C11665v0;
import kotlin.jvm.functions.C11289a;
import kotlin.reflect.C11510n;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.reflect.o */
public interface C11514o<V> extends C11510n<V>, C11289a<V> {

    /* renamed from: kotlin.reflect.o$a */
    public interface C11515a<V> extends C11510n.C11513c<V>, C11289a<V> {
    }

    V get();

    @C12580l
    @C11665v0(version = "1.1")
    Object getDelegate();

    @C12579k
    C11515a<V> getGetter();
}
