package kotlinx.coroutines.channels;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.selects.C12131j;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.jsoup.helper.C12741a;

@C11363r0({"SMAP\nBroadcastChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl\n+ 2 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,414:1\n15#2:415\n15#2:416\n15#2:420\n15#2:423\n15#2:429\n15#2:430\n15#2:436\n15#2:439\n15#2:440\n15#2:441\n766#3:417\n857#3,2:418\n1855#3,2:421\n1747#3,3:424\n1855#3,2:427\n1855#3,2:431\n766#3:433\n857#3,2:434\n1855#3,2:437\n*S KotlinDebug\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl\n*L\n166#1:415\n188#1:416\n213#1:420\n237#1:423\n279#1:429\n331#1:430\n343#1:436\n355#1:439\n382#1:440\n394#1:441\n189#1:417\n189#1:418,2\n226#1:421,2\n242#1:424,3\n251#1:427,2\n333#1:431,2\n338#1:433\n338#1:434,2\n346#1:437,2\n*E\n"})
public final class BroadcastChannelImpl<E> extends BufferedChannel<E> implements C11740d<E> {
    @C12580l

    /* renamed from: E0 */
    public Object f29069E0;
    @C12579k

    /* renamed from: F0 */
    public final HashMap<C12131j<?>, Object> f29070F0;

    /* renamed from: X */
    public final int f29071X;
    @C12579k

    /* renamed from: Y */
    public final ReentrantLock f29072Y;
    @C12579k

    /* renamed from: Z */
    public List<? extends BufferedChannel<E>> f29073Z;

    @C11363r0({"SMAP\nBroadcastChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberBuffered\n+ 2 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n*L\n1#1,414:1\n15#2:415\n*S KotlinDebug\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberBuffered\n*L\n362#1:415\n*E\n"})
    /* renamed from: kotlinx.coroutines.channels.BroadcastChannelImpl$a */
    public final class C11728a extends BufferedChannel<E> {
        public C11728a() {
            super(BroadcastChannelImpl.this.mo23752N1(), (C11300l) null, 2, (DefaultConstructorMarker) null);
        }

        /* renamed from: K1 */
        public boolean mo23750F(@C12580l Throwable th) {
            ReentrantLock K1 = BroadcastChannelImpl.this.f29072Y;
            BroadcastChannelImpl<E> broadcastChannelImpl = BroadcastChannelImpl.this;
            K1.lock();
            try {
                broadcastChannelImpl.mo23755S1(this);
                return super.mo23750F(th);
            } finally {
                K1.unlock();
            }
        }
    }

    /* renamed from: kotlinx.coroutines.channels.BroadcastChannelImpl$b */
    public final class C11729b extends C11757o<E> {
        public C11729b() {
            super(1, BufferOverflow.DROP_OLDEST, (C11300l) null, 4, (DefaultConstructorMarker) null);
        }

        /* renamed from: P1 */
        public boolean mo23750F(@C12580l Throwable th) {
            BroadcastChannelImpl.this.mo23755S1(this);
            return super.mo23750F(th);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BroadcastChannelImpl(int i) {
        super(0, (C11300l) null);
        boolean z = false;
        this.f29071X = i;
        if ((i >= 1 || i == -1) ? true : z) {
            this.f29072Y = new ReentrantLock();
            this.f29073Z = CollectionsKt__CollectionsKt.m40441E();
            this.f29069E0 = C11742e.f29152a;
            this.f29070F0 = new HashMap<>();
            return;
        }
        throw new IllegalArgumentException(("BroadcastChannel capacity must be positive or Channel.CONFLATED, but " + i + " was specified").toString());
    }

    /* renamed from: P1 */
    public static /* synthetic */ void m46202P1() {
    }

    /* renamed from: R1 */
    public static /* synthetic */ void m46203R1() {
    }

    @C12579k
    /* renamed from: A */
    public ReceiveChannel<E> mo23749A() {
        BufferedChannel bufferedChannel;
        ReentrantLock reentrantLock = this.f29072Y;
        reentrantLock.lock();
        try {
            if (this.f29071X == -1) {
                bufferedChannel = new C11729b();
            } else {
                bufferedChannel = new C11728a();
            }
            if (!mo23758i0() || this.f29069E0 != C11742e.f29152a) {
                if (this.f29069E0 != C11742e.f29152a) {
                    bufferedChannel.mo23751L(mo23753O1());
                }
                this.f29073Z = CollectionsKt___CollectionsKt.m40723z4(this.f29073Z, bufferedChannel);
                reentrantLock.unlock();
                return bufferedChannel;
            }
            bufferedChannel.mo23756d0(mo23831g0());
            return bufferedChannel;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: F */
    public boolean mo23750F(@C12580l Throwable th) {
        ReentrantLock reentrantLock = this.f29072Y;
        reentrantLock.lock();
        try {
            for (BufferedChannel F : this.f29073Z) {
                F.mo23750F(th);
            }
            this.f29069E0 = C11742e.f29152a;
            return super.mo23750F(th);
        } finally {
            reentrantLock.unlock();
        }
    }

    @C12579k
    /* renamed from: L */
    public Object mo23751L(E e) {
        ReentrantLock reentrantLock = this.f29072Y;
        reentrantLock.lock();
        try {
            if (mo23758i0()) {
                return super.mo23751L(e);
            }
            Iterable iterable = this.f29073Z;
            boolean z = false;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((BufferedChannel) it.next()).mo23855w1()) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z) {
                Object b = C11749j.f29170b.mo23926b();
                reentrantLock.unlock();
                return b;
            }
            if (this.f29071X == -1) {
                this.f29069E0 = e;
            }
            for (BufferedChannel L : this.f29073Z) {
                L.mo23751L(e);
            }
            Object c = C11749j.f29170b.mo23927c(C11079d2.f28267a);
            reentrantLock.unlock();
            return c;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: N1 */
    public final int mo23752N1() {
        return this.f29071X;
    }

    /* renamed from: O1 */
    public final E mo23753O1() {
        ReentrantLock reentrantLock = this.f29072Y;
        reentrantLock.lock();
        try {
            if (mo23758i0()) {
                Throwable g0 = mo23831g0();
                if (g0 == null) {
                    g0 = new IllegalStateException("This broadcast channel is closed");
                }
                throw g0;
            } else if (this.f29069E0 != C11742e.f29152a) {
                return this.f29069E0;
            } else {
                throw new IllegalStateException("No value".toString());
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @C12580l
    /* renamed from: Q1 */
    public final E mo23754Q1() {
        ReentrantLock reentrantLock = this.f29072Y;
        reentrantLock.lock();
        try {
            E e = null;
            if (!mo23827e()) {
                if (this.f29069E0 != C11742e.f29152a) {
                    e = this.f29069E0;
                }
            }
            return e;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: kotlinx.coroutines.channels.BufferedChannel} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: S1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23755S1(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r6) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r5.f29072Y
            r0.lock()
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> r1 = r5.f29073Z     // Catch:{ all -> 0x0032 }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x0032 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0032 }
            r2.<init>()     // Catch:{ all -> 0x0032 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0032 }
        L_0x0012:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0032 }
            if (r3 == 0) goto L_0x002a
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0032 }
            r4 = r3
            kotlinx.coroutines.channels.BufferedChannel r4 = (kotlinx.coroutines.channels.BufferedChannel) r4     // Catch:{ all -> 0x0032 }
            if (r4 == r6) goto L_0x0023
            r4 = 1
            goto L_0x0024
        L_0x0023:
            r4 = 0
        L_0x0024:
            if (r4 == 0) goto L_0x0012
            r2.add(r3)     // Catch:{ all -> 0x0032 }
            goto L_0x0012
        L_0x002a:
            r5.f29073Z = r2     // Catch:{ all -> 0x0032 }
            kotlin.d2 r6 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0032 }
            r0.unlock()
            return
        L_0x0032:
            r6 = move-exception
            r0.unlock()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BroadcastChannelImpl.mo23755S1(kotlinx.coroutines.channels.ReceiveChannel):void");
    }

    /* renamed from: d0 */
    public boolean mo23756d0(@C12580l Throwable th) {
        ReentrantLock reentrantLock = this.f29072Y;
        reentrantLock.lock();
        try {
            for (BufferedChannel d0 : this.f29073Z) {
                d0.mo23756d0(th);
            }
            ArrayList arrayList = new ArrayList();
            for (Object next : this.f29073Z) {
                if (((BufferedChannel) next).mo23848s0()) {
                    arrayList.add(next);
                }
            }
            this.f29073Z = arrayList;
            return super.mo23756d0(th);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo23757h0(E r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.BroadcastChannelImpl$send$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kotlinx.coroutines.channels.BroadcastChannelImpl$send$1 r0 = (kotlinx.coroutines.channels.BroadcastChannelImpl$send$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.BroadcastChannelImpl$send$1 r0 = new kotlinx.coroutines.channels.BroadcastChannelImpl$send$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r7 = r0.L$2
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r2 = r0.L$1
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.BroadcastChannelImpl r4 = (kotlinx.coroutines.channels.BroadcastChannelImpl) r4
            kotlin.C11661u0.m45747n(r8)
            goto L_0x007d
        L_0x0033:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003b:
            kotlin.C11661u0.m45747n(r8)
            java.util.concurrent.locks.ReentrantLock r8 = r6.f29072Y
            r8.lock()
            boolean r2 = r6.mo23758i0()     // Catch:{ all -> 0x009b }
            if (r2 != 0) goto L_0x0096
            int r2 = r6.f29071X     // Catch:{ all -> 0x009b }
            r4 = -1
            if (r2 != r4) goto L_0x0050
            r6.f29069E0 = r7     // Catch:{ all -> 0x009b }
        L_0x0050:
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> r2 = r6.f29073Z     // Catch:{ all -> 0x009b }
            r8.unlock()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r8 = r2.iterator()
            r4 = r6
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x005f:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0093
            java.lang.Object r2 = r7.next()
            kotlinx.coroutines.channels.BufferedChannel r2 = (kotlinx.coroutines.channels.BufferedChannel) r2
            r0.L$0 = r4
            r0.L$1 = r8
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r2 = r2.mo23844p1(r8, r0)
            if (r2 != r1) goto L_0x007a
            return r1
        L_0x007a:
            r5 = r2
            r2 = r8
            r8 = r5
        L_0x007d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x0091
            boolean r8 = r4.mo23758i0()
            if (r8 != 0) goto L_0x008c
            goto L_0x0091
        L_0x008c:
            java.lang.Throwable r7 = r4.mo23845q0()
            throw r7
        L_0x0091:
            r8 = r2
            goto L_0x005f
        L_0x0093:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        L_0x0096:
            java.lang.Throwable r7 = r6.mo23845q0()     // Catch:{ all -> 0x009b }
            throw r7     // Catch:{ all -> 0x009b }
        L_0x009b:
            r7 = move-exception
            r8.unlock()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BroadcastChannelImpl.mo23757h0(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: i0 */
    public boolean mo23758i0() {
        ReentrantLock reentrantLock = this.f29072Y;
        reentrantLock.lock();
        try {
            return super.mo23758i0();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: j1 */
    public void mo23759j1(@C12579k C12131j<?> jVar, @C12580l Object obj) {
        ReentrantLock reentrantLock = this.f29072Y;
        reentrantLock.lock();
        try {
            Object remove = this.f29070F0.remove(jVar);
            if (remove != null) {
                jVar.mo24707e(remove);
                return;
            }
            C11079d2 d2Var = C11079d2.f28267a;
            reentrantLock.unlock();
            C11723c2 unused = C12038j.m48061f(C12079p0.m48260a(jVar.getContext()), (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new BroadcastChannelImpl$registerSelectForSend$2(this, obj, jVar, (C11045c<? super BroadcastChannelImpl$registerSelectForSend$2>) null), 1, (Object) null);
        } finally {
            reentrantLock.unlock();
        }
    }

    @C12579k
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f29069E0 != C11742e.f29152a) {
            str = "CONFLATED_ELEMENT=" + this.f29069E0 + C12741a.f31457b;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("BROADCAST=<");
        sb.append(super.toString());
        sb.append(">; SUBSCRIBERS=");
        sb.append(CollectionsKt___CollectionsKt.m40639h3(this.f29073Z, ";", "<", ">", 0, (CharSequence) null, (C11300l) null, 56, (Object) null));
        return sb.toString();
    }
}
