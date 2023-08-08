package androidx.compose.p004ui.platform;

import androidx.compose.runtime.saveable.C8624c;
import java.util.List;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.platform.q0 */
public final class C15951q0 implements C8624c {
    @C12579k

    /* renamed from: a */
    public final C11289a<C11079d2> f39656a;

    /* renamed from: b */
    public final /* synthetic */ C8624c f39657b;

    public C15951q0(@C12579k C8624c cVar, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(cVar, "saveableStateRegistry");
        Intrinsics.checkNotNullParameter(aVar, "onDispose");
        this.f39656a = aVar;
        this.f39657b = cVar;
    }

    /* renamed from: a */
    public boolean mo8708a(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "value");
        return this.f39657b.mo8708a(obj);
    }

    @C12579k
    /* renamed from: b */
    public C8624c.C8625a mo8709b(@C12579k String str, @C12579k C11289a<? extends Object> aVar) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(aVar, "valueProvider");
        return this.f39657b.mo8709b(str, aVar);
    }

    /* renamed from: c */
    public final void mo45929c() {
        this.f39656a.invoke();
    }

    @C12579k
    /* renamed from: e */
    public Map<String, List<Object>> mo8712e() {
        return this.f39657b.mo8712e();
    }

    @C12580l
    /* renamed from: f */
    public Object mo8713f(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        return this.f39657b.mo8713f(str);
    }
}
