package androidx.compose.runtime;

import androidx.compose.runtime.C8686v0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C11965h;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class SdkStubsFallbackFrameClock implements C8686v0 {
    @C12579k

    /* renamed from: a */
    public static final SdkStubsFallbackFrameClock f22749a = new SdkStubsFallbackFrameClock();

    /* renamed from: b */
    public static final long f22750b = 16;

    @C12580l
    /* renamed from: B */
    public <R> Object mo14872B(@C12579k C11300l<? super Long, ? extends R> lVar, @C12579k C11045c<? super R> cVar) {
        return C11965h.m47673h(C11768d1.m46783e(), new SdkStubsFallbackFrameClock$withFrameNanos$2(lVar, (C11045c<? super SdkStubsFallbackFrameClock$withFrameNanos$2>) null), cVar);
    }

    @C12579k
    /* renamed from: Q */
    public CoroutineContext mo7443Q(@C12579k CoroutineContext coroutineContext) {
        return C8686v0.C8687a.m31921e(this, coroutineContext);
    }

    @C12580l
    /* renamed from: b */
    public <E extends CoroutineContext.C11040a> E mo7444b(@C12579k CoroutineContext.C11042b<E> bVar) {
        return C8686v0.C8687a.m31918b(this, bVar);
    }

    @C12579k
    /* renamed from: f */
    public CoroutineContext mo7445f(@C12579k CoroutineContext.C11042b<?> bVar) {
        return C8686v0.C8687a.m31920d(this, bVar);
    }

    /* renamed from: l */
    public <R> R mo7446l(R r, @C12579k C11304p<? super R, ? super CoroutineContext.C11040a, ? extends R> pVar) {
        return C8686v0.C8687a.m31917a(this, r, pVar);
    }
}
