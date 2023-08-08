package androidx.compose.animation.core;

import androidx.compose.animation.core.C1997o;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.animation.core.b1 */
public final class C1949b1<T, V extends C1997o> implements C1945a1<T, V> {
    @C12579k

    /* renamed from: a */
    public final C11300l<T, V> f5466a;
    @C12579k

    /* renamed from: b */
    public final C11300l<V, T> f5467b;

    public C1949b1(@C12579k C11300l<? super T, ? extends V> lVar, @C12579k C11300l<? super V, ? extends T> lVar2) {
        Intrinsics.checkNotNullParameter(lVar, "convertToVector");
        Intrinsics.checkNotNullParameter(lVar2, "convertFromVector");
        this.f5466a = lVar;
        this.f5467b = lVar2;
    }

    @C12579k
    /* renamed from: a */
    public C11300l<T, V> mo6792a() {
        return this.f5466a;
    }

    @C12579k
    /* renamed from: b */
    public C11300l<V, T> mo6793b() {
        return this.f5467b;
    }
}
