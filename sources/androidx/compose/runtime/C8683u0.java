package androidx.compose.runtime;

import kotlin.C10864b0;
import kotlin.C11677z;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.u0 */
public final class C8683u0<T> implements C8578k2<T> {
    @C12579k

    /* renamed from: a */
    public final C11677z f23247a;

    public C8683u0(@C12579k C11289a<? extends T> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "valueProducer");
        this.f23247a = C10864b0.m38748c(aVar);
    }

    /* renamed from: e */
    public final T mo16770e() {
        return this.f23247a.getValue();
    }

    public T getValue() {
        return mo16770e();
    }
}
