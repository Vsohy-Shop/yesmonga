package androidx.compose.runtime;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 1)
/* renamed from: androidx.compose.runtime.j1 */
public final class C8572j1<T> {

    /* renamed from: d */
    public static final int f23006d = 0;
    @C12579k

    /* renamed from: a */
    public final C8682u<T> f23007a;

    /* renamed from: b */
    public final T f23008b;

    /* renamed from: c */
    public final boolean f23009c;

    public C8572j1(@C12579k C8682u<T> uVar, T t, boolean z) {
        Intrinsics.checkNotNullParameter(uVar, "compositionLocal");
        this.f23007a = uVar;
        this.f23008b = t;
        this.f23009c = z;
    }

    /* renamed from: a */
    public final boolean mo16231a() {
        return this.f23009c;
    }

    @C12579k
    /* renamed from: b */
    public final C8682u<T> mo16232b() {
        return this.f23007a;
    }

    /* renamed from: c */
    public final T mo16233c() {
        return this.f23008b;
    }
}
