package kotlin.jdk7;

import kotlin.C11414o;
import kotlin.C11532s0;
import kotlin.C11665v0;
import kotlin.jvm.C11314h;
import org.jetbrains.annotations.C12580l;

@C11314h(name = "AutoCloseableKt")
/* renamed from: kotlin.jdk7.a */
public final class C11281a {
    @C11665v0(version = "1.2")
    @C11532s0
    /* renamed from: a */
    public static final void m43403a(@C12580l AutoCloseable autoCloseable, @C12580l Throwable th) {
        if (autoCloseable == null) {
            return;
        }
        if (th == null) {
            autoCloseable.close();
            return;
        }
        try {
            autoCloseable.close();
        } catch (Throwable th2) {
            C11414o.m43942a(th, th2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        kotlin.jvm.internal.C11322b0.m43481d(1);
        m43403a(r2, r3);
        kotlin.jvm.internal.C11322b0.m43480c(1);
     */
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.2")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T extends java.lang.AutoCloseable, R> R m43404b(T r2, kotlin.jvm.functions.C11300l<? super T, ? extends R> r3) {
        /*
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 1
            java.lang.Object r3 = r3.invoke(r2)     // Catch:{ all -> 0x0015 }
            kotlin.jvm.internal.C11322b0.m43481d(r0)
            r1 = 0
            m43403a(r2, r1)
            kotlin.jvm.internal.C11322b0.m43480c(r0)
            return r3
        L_0x0015:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0017 }
        L_0x0017:
            r1 = move-exception
            kotlin.jvm.internal.C11322b0.m43481d(r0)
            m43403a(r2, r3)
            kotlin.jvm.internal.C11322b0.m43480c(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jdk7.C11281a.m43404b(java.lang.AutoCloseable, kotlin.jvm.functions.l):java.lang.Object");
    }
}
