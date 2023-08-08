package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.C8646f;
import androidx.compose.runtime.snapshots.C8653h;
import com.urbanairship.iam.events.C9175a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11726c3;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8541g0
/* renamed from: androidx.compose.runtime.a2 */
public final class C8406a2 implements C8653h, C11726c3<C8646f> {
    @C12579k

    /* renamed from: a */
    public final C8646f f22762a;

    public C8406a2(@C12579k C8646f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "snapshot");
        this.f22762a = fVar;
    }

    @C12579k
    /* renamed from: Q */
    public CoroutineContext mo7443Q(@C12579k CoroutineContext coroutineContext) {
        return C8653h.C8654a.m31777d(this, coroutineContext);
    }

    @C12580l
    /* renamed from: b */
    public <E extends CoroutineContext.C11040a> E mo7444b(@C12579k CoroutineContext.C11042b<E> bVar) {
        return C8653h.C8654a.m31775b(this, bVar);
    }

    /* renamed from: e */
    public void mo15332F(@C12579k CoroutineContext coroutineContext, @C12580l C8646f fVar) {
        Intrinsics.checkNotNullParameter(coroutineContext, C9175a.f24932Y);
        this.f22762a.mo16611E(fVar);
    }

    @C12579k
    /* renamed from: f */
    public CoroutineContext mo7445f(@C12579k CoroutineContext.C11042b<?> bVar) {
        return C8653h.C8654a.m31776c(this, bVar);
    }

    @C12580l
    /* renamed from: g */
    public C8646f mo15336p0(@C12579k CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, C9175a.f24932Y);
        return this.f22762a.mo16610D();
    }

    @C12579k
    public CoroutineContext.C11042b<?> getKey() {
        return C8653h.f23209i;
    }

    /* renamed from: l */
    public <R> R mo7446l(R r, @C12579k C11304p<? super R, ? super CoroutineContext.C11040a, ? extends R> pVar) {
        return C8653h.C8654a.m31774a(this, r, pVar);
    }
}
