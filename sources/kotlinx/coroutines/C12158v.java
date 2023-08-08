package kotlinx.coroutines;

import kotlin.C11079d2;
import kotlin.jvm.C11287e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.v */
public final class C12158v extends C11769d2 implements C12152u {
    @C12579k
    @C11287e

    /* renamed from: e */
    public final C12162w f29941e;

    public C12158v(@C12579k C12162w wVar) {
        this.f29941e = wVar;
    }

    @C12579k
    public C11723c2 getParent() {
        return mo24296A();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo23670z((Throwable) obj);
        return C11079d2.f28267a;
    }

    /* renamed from: q */
    public boolean mo24575q(@C12579k Throwable th) {
        return mo24296A().mo23594F0(th);
    }

    /* renamed from: z */
    public void mo23670z(@C12580l Throwable th) {
        this.f29941e.mo23660x(mo24296A());
    }
}
