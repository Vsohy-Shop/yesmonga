package androidx.compose.runtime;

import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.o2 */
public class C8597o2<T> extends ThreadLocal<T> {
    @C12579k

    /* renamed from: a */
    public final C11289a<T> f23035a;

    public C8597o2(@C12579k C11289a<? extends T> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "initialValue");
        this.f23035a = aVar;
    }

    public T get() {
        return super.get();
    }

    @C12580l
    public T initialValue() {
        return this.f23035a.invoke();
    }

    public void remove() {
        super.remove();
    }

    public void set(T t) {
        super.set(t);
    }
}
