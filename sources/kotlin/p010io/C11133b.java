package kotlin.p010io;

import java.io.Closeable;
import kotlin.C11414o;
import kotlin.C11532s0;
import kotlin.C11665v0;
import kotlin.jvm.C11314h;
import org.jetbrains.annotations.C12580l;

@C11314h(name = "CloseableKt")
/* renamed from: kotlin.io.b */
public final class C11133b {
    @C11665v0(version = "1.1")
    @C11532s0
    /* renamed from: a */
    public static final void m42950a(@C12580l Closeable closeable, @C12580l Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            C11414o.m43942a(th, th2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        kotlin.jvm.internal.C11322b0.m43481d(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (kotlin.internal.C11125m.m42830a(1, 1, 0) == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        if (r3 != null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        m42950a(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        kotlin.jvm.internal.C11322b0.m43480c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        throw r2;
     */
    @kotlin.internal.C11110f
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T extends java.io.Closeable, R> R m42951b(T r3, kotlin.jvm.functions.C11300l<? super T, ? extends R> r4) {
        /*
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            r1 = 1
            java.lang.Object r4 = r4.invoke(r3)     // Catch:{ all -> 0x0022 }
            kotlin.jvm.internal.C11322b0.m43481d(r1)
            boolean r0 = kotlin.internal.C11125m.m42830a(r1, r1, r0)
            if (r0 == 0) goto L_0x0019
            r0 = 0
            m42950a(r3, r0)
            goto L_0x001e
        L_0x0019:
            if (r3 == 0) goto L_0x001e
            r3.close()
        L_0x001e:
            kotlin.jvm.internal.C11322b0.m43480c(r1)
            return r4
        L_0x0022:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r2 = move-exception
            kotlin.jvm.internal.C11322b0.m43481d(r1)
            boolean r0 = kotlin.internal.C11125m.m42830a(r1, r1, r0)
            if (r0 != 0) goto L_0x0034
            if (r3 == 0) goto L_0x0037
            r3.close()     // Catch:{ all -> 0x0037 }
            goto L_0x0037
        L_0x0034:
            m42950a(r3, r4)
        L_0x0037:
            kotlin.jvm.internal.C11322b0.m43480c(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p010io.C11133b.m42951b(java.io.Closeable, kotlin.jvm.functions.l):java.lang.Object");
    }
}
