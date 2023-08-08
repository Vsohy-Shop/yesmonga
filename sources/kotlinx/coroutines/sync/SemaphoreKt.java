package kotlinx.coroutines.sync;

import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11322b0;
import kotlinx.coroutines.internal.C12009o0;
import kotlinx.coroutines.internal.C12020t0;
import org.jetbrains.annotations.C12579k;

public final class SemaphoreKt {

    /* renamed from: a */
    public static final int f29924a = C12020t0.m47961e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, (Object) null);
    @C12579k

    /* renamed from: b */
    public static final C12009o0 f29925b = new C12009o0("PERMIT");
    @C12579k

    /* renamed from: c */
    public static final C12009o0 f29926c = new C12009o0("TAKEN");
    @C12579k

    /* renamed from: d */
    public static final C12009o0 f29927d = new C12009o0("BROKEN");
    @C12579k

    /* renamed from: e */
    public static final C12009o0 f29928e = new C12009o0("CANCELLED");

    /* renamed from: f */
    public static final int f29929f = C12020t0.m47961e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, (Object) null);

    @C12579k
    /* renamed from: a */
    public static final C12141b m48629a(int i, int i2) {
        return new SemaphoreImpl(i, i2);
    }

    /* renamed from: b */
    public static /* synthetic */ C12141b m48630b(int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m48629a(i, i2);
    }

    /* renamed from: j */
    public static final C12142c m48638j(long j, C12142c cVar) {
        return new C12142c(j, cVar, 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: kotlin.jvm.functions.a<? extends T>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m48639k(@org.jetbrains.annotations.C12579k kotlinx.coroutines.sync.C12141b r4, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<? extends T> r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super T> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.sync.SemaphoreKt$withPermit$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.sync.SemaphoreKt$withPermit$1 r0 = (kotlinx.coroutines.sync.SemaphoreKt$withPermit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.sync.SemaphoreKt$withPermit$1 r0 = new kotlinx.coroutines.sync.SemaphoreKt$withPermit$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r4 = r0.L$1
            r5 = r4
            kotlin.jvm.functions.a r5 = (kotlin.jvm.functions.C11289a) r5
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.sync.b r4 = (kotlinx.coroutines.sync.C12141b) r4
            kotlin.C11661u0.m45747n(r6)
            goto L_0x004a
        L_0x0032:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003a:
            kotlin.C11661u0.m45747n(r6)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r4.mo24757e(r0)
            if (r6 != r1) goto L_0x004a
            return r1
        L_0x004a:
            java.lang.Object r5 = r5.invoke()     // Catch:{ all -> 0x0058 }
            kotlin.jvm.internal.C11322b0.m43481d(r3)
            r4.release()
            kotlin.jvm.internal.C11322b0.m43480c(r3)
            return r5
        L_0x0058:
            r5 = move-exception
            kotlin.jvm.internal.C11322b0.m43481d(r3)
            r4.release()
            kotlin.jvm.internal.C11322b0.m43480c(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.SemaphoreKt.m48639k(kotlinx.coroutines.sync.b, kotlin.jvm.functions.a, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: l */
    public static final <T> Object m48640l(C12141b bVar, C11289a<? extends T> aVar, C11045c<? super T> cVar) {
        C11322b0.m43482e(0);
        bVar.mo24757e(cVar);
        C11322b0.m43482e(1);
        try {
            return aVar.invoke();
        } finally {
            C11322b0.m43481d(1);
            bVar.release();
            C11322b0.m43480c(1);
        }
    }
}
