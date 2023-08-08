package androidx.compose.runtime;

import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8547h2
/* renamed from: androidx.compose.runtime.i1 */
public abstract class C8550i1<T> extends C8682u<T> {

    /* renamed from: c */
    public static final int f22982c = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8550i1(@C12579k C11289a<? extends T> aVar) {
        super(aVar, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(aVar, "defaultFactory");
    }

    @C12579k
    /* renamed from: f */
    public final C8572j1<T> mo16141f(T t) {
        return new C8572j1<>(this, t, true);
    }

    @C12579k
    /* renamed from: g */
    public final C8572j1<T> mo16142g(T t) {
        return new C8572j1<>(this, t, false);
    }
}
