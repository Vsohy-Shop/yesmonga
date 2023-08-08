package kotlinx.coroutines.internal;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nExceptionsConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/WeakMapCtorCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n1#2:117\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.a1 */
public final class C11980a1 extends C11998j {
    @C12579k

    /* renamed from: a */
    public static final C11980a1 f29574a = new C11980a1();
    @C12579k

    /* renamed from: b */
    public static final ReentrantReadWriteLock f29575b = new ReentrantReadWriteLock();
    @C12579k

    /* renamed from: c */
    public static final WeakHashMap<Class<? extends Throwable>, C11300l<Throwable, Throwable>> f29576c = new WeakHashMap<>();

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    public kotlin.jvm.functions.C11300l<java.lang.Throwable, java.lang.Throwable> mo24333a(@org.jetbrains.annotations.C12579k java.lang.Class<? extends java.lang.Throwable> r7) {
        /*
            r6 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f29575b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            r1.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, kotlin.jvm.functions.l<java.lang.Throwable, java.lang.Throwable>> r2 = f29576c     // Catch:{ all -> 0x006e }
            java.lang.Object r2 = r2.get(r7)     // Catch:{ all -> 0x006e }
            kotlin.jvm.functions.l r2 = (kotlin.jvm.functions.C11300l) r2     // Catch:{ all -> 0x006e }
            r1.unlock()
            if (r2 == 0) goto L_0x0017
            return r2
        L_0x0017:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L_0x0027
            int r2 = r0.getReadHoldCount()
            goto L_0x0028
        L_0x0027:
            r2 = r3
        L_0x0028:
            r4 = r3
        L_0x0029:
            if (r4 >= r2) goto L_0x0031
            r1.unlock()
            int r4 = r4 + 1
            goto L_0x0029
        L_0x0031:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, kotlin.jvm.functions.l<java.lang.Throwable, java.lang.Throwable>> r4 = f29576c     // Catch:{ all -> 0x0061 }
            java.lang.Object r5 = r4.get(r7)     // Catch:{ all -> 0x0061 }
            kotlin.jvm.functions.l r5 = (kotlin.jvm.functions.C11300l) r5     // Catch:{ all -> 0x0061 }
            if (r5 == 0) goto L_0x004e
        L_0x0042:
            if (r3 >= r2) goto L_0x004a
            r1.lock()
            int r3 = r3 + 1
            goto L_0x0042
        L_0x004a:
            r0.unlock()
            return r5
        L_0x004e:
            kotlin.jvm.functions.l r5 = kotlinx.coroutines.internal.ExceptionsConstructorKt.m47725b(r7)     // Catch:{ all -> 0x0061 }
            r4.put(r7, r5)     // Catch:{ all -> 0x0061 }
        L_0x0055:
            if (r3 >= r2) goto L_0x005d
            r1.lock()
            int r3 = r3 + 1
            goto L_0x0055
        L_0x005d:
            r0.unlock()
            return r5
        L_0x0061:
            r7 = move-exception
        L_0x0062:
            if (r3 >= r2) goto L_0x006a
            r1.lock()
            int r3 = r3 + 1
            goto L_0x0062
        L_0x006a:
            r0.unlock()
            throw r7
        L_0x006e:
            r7 = move-exception
            r1.unlock()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C11980a1.mo24333a(java.lang.Class):kotlin.jvm.functions.l");
    }
}
