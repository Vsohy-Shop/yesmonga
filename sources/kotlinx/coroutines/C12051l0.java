package kotlinx.coroutines;

import kotlin.C11079d2;
import kotlin.C11414o;
import kotlin.coroutines.C11043a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12044k0;
import kotlinx.coroutines.internal.C11996i;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 2 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n*L\n1#1,110:1\n75#2:111\n*S KotlinDebug\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n38#1:111\n*E\n"})
/* renamed from: kotlinx.coroutines.l0 */
public final class C12051l0 {

    @C11363r0({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n*L\n1#1,110:1\n*E\n"})
    /* renamed from: kotlinx.coroutines.l0$a */
    public static final class C12052a extends C11043a implements C12044k0 {

        /* renamed from: b */
        public final /* synthetic */ C11304p<CoroutineContext, Throwable, C11079d2> f29694b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12052a(C11304p<? super CoroutineContext, ? super Throwable, C11079d2> pVar, C12044k0.C12046b bVar) {
            super(bVar);
            this.f29694b = pVar;
        }

        /* renamed from: P */
        public void mo23719P(@C12579k CoroutineContext coroutineContext, @C12579k Throwable th) {
            this.f29694b.invoke(coroutineContext, th);
        }
    }

    @C12579k
    /* renamed from: a */
    public static final C12044k0 m48103a(@C12579k C11304p<? super CoroutineContext, ? super Throwable, C11079d2> pVar) {
        return new C12052a(pVar, C12044k0.f29686v0);
    }

    @C12177y1
    /* renamed from: b */
    public static final void m48104b(@C12579k CoroutineContext coroutineContext, @C12579k Throwable th) {
        try {
            C12044k0 k0Var = (C12044k0) coroutineContext.mo7444b(C12044k0.f29686v0);
            if (k0Var != null) {
                k0Var.mo23719P(coroutineContext, th);
            } else {
                C11996i.m47843a(coroutineContext, th);
            }
        } catch (Throwable th2) {
            C11996i.m47843a(coroutineContext, m48105c(th, th2));
        }
    }

    @C12579k
    /* renamed from: c */
    public static final Throwable m48105c(@C12579k Throwable th, @C12579k Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C11414o.m43942a(runtimeException, th);
        return runtimeException;
    }
}
