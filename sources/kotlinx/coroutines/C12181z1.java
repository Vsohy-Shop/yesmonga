package kotlinx.coroutines;

import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.z1 */
public final class C12181z1 extends C12060m {
    @C12579k

    /* renamed from: a */
    public final C11300l<Throwable, C11079d2> f29948a;

    public C12181z1(@C12579k C11300l<? super Throwable, C11079d2> lVar) {
        this.f29948a = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo24071j((Throwable) obj);
        return C11079d2.f28267a;
    }

    /* renamed from: j */
    public void mo24071j(@C12580l Throwable th) {
        this.f29948a.invoke(th);
    }

    @C12579k
    public String toString() {
        return "InvokeOnCancel[" + C12090r0.m48300a(this.f29948a) + '@' + C12090r0.m48301b(this) + C12361b.f30261l;
    }
}
