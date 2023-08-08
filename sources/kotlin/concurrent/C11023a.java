package kotlin.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.internal.C11110f;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;

@C11314h(name = "LocksKt")
@C11363r0({"SMAP\nLocks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Locks.kt\nkotlin/concurrent/LocksKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
/* renamed from: kotlin.concurrent.a */
public final class C11023a {
    @C11110f
    /* renamed from: a */
    public static final <T> T m42514a(ReentrantReadWriteLock reentrantReadWriteLock, C11289a<? extends T> aVar) {
        Intrinsics.checkNotNullParameter(reentrantReadWriteLock, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "action");
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            return aVar.invoke();
        } finally {
            C11322b0.m43481d(1);
            readLock.unlock();
            C11322b0.m43480c(1);
        }
    }

    @C11110f
    /* renamed from: b */
    public static final <T> T m42515b(Lock lock, C11289a<? extends T> aVar) {
        Intrinsics.checkNotNullParameter(lock, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "action");
        lock.lock();
        try {
            return aVar.invoke();
        } finally {
            C11322b0.m43481d(1);
            lock.unlock();
            C11322b0.m43480c(1);
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    @kotlin.internal.C11110f
    /* renamed from: c */
    public static final <T> T m42516c(java.util.concurrent.locks.ReentrantReadWriteLock r4, kotlin.jvm.functions.C11289a<? extends T> r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r4.readLock()
            int r1 = r4.getWriteHoldCount()
            r2 = 0
            if (r1 != 0) goto L_0x001a
            int r1 = r4.getReadHoldCount()
            goto L_0x001b
        L_0x001a:
            r1 = r2
        L_0x001b:
            r3 = r2
        L_0x001c:
            if (r3 >= r1) goto L_0x0024
            r0.unlock()
            int r3 = r3 + 1
            goto L_0x001c
        L_0x0024:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = r4.writeLock()
            r4.lock()
            r3 = 1
            java.lang.Object r5 = r5.invoke()     // Catch:{ all -> 0x0042 }
            kotlin.jvm.internal.C11322b0.m43481d(r3)
        L_0x0033:
            if (r2 >= r1) goto L_0x003b
            r0.lock()
            int r2 = r2 + 1
            goto L_0x0033
        L_0x003b:
            r4.unlock()
            kotlin.jvm.internal.C11322b0.m43480c(r3)
            return r5
        L_0x0042:
            r5 = move-exception
            kotlin.jvm.internal.C11322b0.m43481d(r3)
        L_0x0046:
            if (r2 >= r1) goto L_0x004e
            r0.lock()
            int r2 = r2 + 1
            goto L_0x0046
        L_0x004e:
            r4.unlock()
            kotlin.jvm.internal.C11322b0.m43480c(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.concurrent.C11023a.m42516c(java.util.concurrent.locks.ReentrantReadWriteLock, kotlin.jvm.functions.a):java.lang.Object");
    }
}
