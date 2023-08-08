package kotlinx.coroutines.sync;

import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11322b0;
import kotlinx.coroutines.internal.C12009o0;
import org.jetbrains.annotations.C12579k;

public final class MutexKt {
    @C12579k

    /* renamed from: a */
    public static final C12009o0 f29907a = new C12009o0("NO_OWNER");
    @C12579k

    /* renamed from: b */
    public static final C12009o0 f29908b = new C12009o0("ALREADY_LOCKED_BY_OWNER");

    /* renamed from: c */
    public static final int f29909c = 0;

    /* renamed from: d */
    public static final int f29910d = 1;

    /* renamed from: e */
    public static final int f29911e = 2;

    /* renamed from: f */
    public static final int f29912f = 0;

    /* renamed from: g */
    public static final int f29913g = 1;

    /* renamed from: h */
    public static final int f29914h = 2;

    @C12579k
    /* renamed from: a */
    public static final C12139a m48605a(boolean z) {
        return new MutexImpl(z);
    }

    /* renamed from: b */
    public static /* synthetic */ C12139a m48606b(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m48605a(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: kotlin.jvm.functions.a<? extends T>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m48609e(@org.jetbrains.annotations.C12579k kotlinx.coroutines.sync.C12139a r4, @org.jetbrains.annotations.C12580l java.lang.Object r5, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<? extends T> r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super T> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.sync.MutexKt$withLock$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.sync.MutexKt$withLock$1 r0 = (kotlinx.coroutines.sync.MutexKt$withLock$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.sync.MutexKt$withLock$1 r0 = new kotlinx.coroutines.sync.MutexKt$withLock$1
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r4 = r0.L$2
            r6 = r4
            kotlin.jvm.functions.a r6 = (kotlin.jvm.functions.C11289a) r6
            java.lang.Object r5 = r0.L$1
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.sync.a r4 = (kotlinx.coroutines.sync.C12139a) r4
            kotlin.C11661u0.m45747n(r7)
            goto L_0x004e
        L_0x0034:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003c:
            kotlin.C11661u0.m45747n(r7)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.L$2 = r6
            r0.label = r3
            java.lang.Object r7 = r4.mo24739f(r5, r0)
            if (r7 != r1) goto L_0x004e
            return r1
        L_0x004e:
            java.lang.Object r6 = r6.invoke()     // Catch:{ all -> 0x005c }
            kotlin.jvm.internal.C11322b0.m43481d(r3)
            r4.mo24740g(r5)
            kotlin.jvm.internal.C11322b0.m43480c(r3)
            return r6
        L_0x005c:
            r6 = move-exception
            kotlin.jvm.internal.C11322b0.m43481d(r3)
            r4.mo24740g(r5)
            kotlin.jvm.internal.C11322b0.m43480c(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.MutexKt.m48609e(kotlinx.coroutines.sync.a, java.lang.Object, kotlin.jvm.functions.a, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: f */
    public static final <T> Object m48610f(C12139a aVar, Object obj, C11289a<? extends T> aVar2, C11045c<? super T> cVar) {
        C11322b0.m43482e(0);
        aVar.mo24739f(obj, cVar);
        C11322b0.m43482e(1);
        try {
            return aVar2.invoke();
        } finally {
            C11322b0.m43481d(1);
            aVar.mo24740g(obj);
            C11322b0.m43480c(1);
        }
    }

    /* renamed from: g */
    public static /* synthetic */ Object m48611g(C12139a aVar, Object obj, C11289a aVar2, C11045c cVar, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        C11322b0.m43482e(0);
        aVar.mo24739f(obj, cVar);
        C11322b0.m43482e(1);
        try {
            return aVar2.invoke();
        } finally {
            C11322b0.m43481d(1);
            aVar.mo24740g(obj);
            C11322b0.m43480c(1);
        }
    }
}
