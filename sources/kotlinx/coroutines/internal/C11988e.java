package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n1#1,269:1\n46#1,8:284\n107#2,7:270\n107#2,7:277\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n74#1:284,8\n27#1:270,7\n85#1:277,7\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.e */
public final class C11988e {

    /* renamed from: a */
    public static final int f29586a = 16;
    @C12579k

    /* renamed from: b */
    public static final C12009o0 f29587b = new C12009o0("CLOSED");

    /* renamed from: b */
    public static final boolean m47806b(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, int i, C11300l<? super Integer, Boolean> lVar) {
        int i2;
        do {
            i2 = atomicIntegerFieldUpdater.get(obj);
            if (!lVar.invoke(Integer.valueOf(i2)).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i2, i2 + i));
        return true;
    }

    /* renamed from: c */
    public static final boolean m47807c(Object obj, AtomicIntegerArray atomicIntegerArray, int i, int i2, C11300l<? super Integer, Boolean> lVar) {
        int i3;
        do {
            i3 = atomicIntegerArray.get(i);
            if (!lVar.invoke(Integer.valueOf(i3)).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerArray.compareAndSet(i, i3, i3 + i2));
        return true;
    }

    @C12579k
    /* renamed from: d */
    public static final <N extends C11990f<N>> N m47808d(@C12579k N n) {
        while (true) {
            N a = n.mo24353f();
            if (a == f29587b) {
                return n;
            }
            N n2 = (C11990f) a;
            if (n2 != null) {
                n = n2;
            } else if (n.mo24357j()) {
                return n;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [kotlinx.coroutines.internal.l0, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @org.jetbrains.annotations.C12579k
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m47809e(@org.jetbrains.annotations.C12580l java.lang.Object r7, @org.jetbrains.annotations.C12579k java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8, long r9, @org.jetbrains.annotations.C12579k java.lang.Object r11, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super java.lang.Long, java.lang.Object, java.lang.Object> r12) {
        /*
        L_0x0000:
            java.lang.Object r0 = m47811g(r11, r9, r12)
            boolean r1 = kotlinx.coroutines.internal.C12005m0.m47894h(r0)
            if (r1 != 0) goto L_0x0042
            kotlinx.coroutines.internal.l0 r1 = kotlinx.coroutines.internal.C12005m0.m47892f(r0)
        L_0x000e:
            java.lang.Object r2 = r8.get(r7)
            kotlinx.coroutines.internal.l0 r2 = (kotlinx.coroutines.internal.C12003l0) r2
            long r3 = r2.f29607c
            long r5 = r1.f29607c
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r4 = 1
            if (r3 < 0) goto L_0x001e
            goto L_0x0035
        L_0x001e:
            boolean r3 = r1.mo24382s()
            if (r3 != 0) goto L_0x0026
            r4 = 0
            goto L_0x0035
        L_0x0026:
            boolean r3 = androidx.concurrent.futures.C16563a.m75000a(r8, r7, r2, r1)
            if (r3 == 0) goto L_0x0038
            boolean r1 = r2.mo24380o()
            if (r1 == 0) goto L_0x0035
            r2.mo24359l()
        L_0x0035:
            if (r4 == 0) goto L_0x0000
            goto L_0x0042
        L_0x0038:
            boolean r2 = r1.mo24380o()
            if (r2 == 0) goto L_0x000e
            r1.mo24359l()
            goto L_0x000e
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C11988e.m47809e(java.lang.Object, java.util.concurrent.atomic.AtomicReferenceFieldUpdater, long, kotlinx.coroutines.internal.l0, kotlin.jvm.functions.p):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [kotlinx.coroutines.internal.l0, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @org.jetbrains.annotations.C12579k
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m47810f(@org.jetbrains.annotations.C12580l java.lang.Object r6, @org.jetbrains.annotations.C12579k java.util.concurrent.atomic.AtomicReferenceArray r7, int r8, long r9, @org.jetbrains.annotations.C12579k java.lang.Object r11, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super java.lang.Long, java.lang.Object, java.lang.Object> r12) {
        /*
        L_0x0000:
            java.lang.Object r6 = m47811g(r11, r9, r12)
            boolean r0 = kotlinx.coroutines.internal.C12005m0.m47894h(r6)
            if (r0 != 0) goto L_0x0042
            kotlinx.coroutines.internal.l0 r0 = kotlinx.coroutines.internal.C12005m0.m47892f(r6)
        L_0x000e:
            java.lang.Object r1 = r7.get(r8)
            kotlinx.coroutines.internal.l0 r1 = (kotlinx.coroutines.internal.C12003l0) r1
            long r2 = r1.f29607c
            long r4 = r0.f29607c
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 1
            if (r2 < 0) goto L_0x001e
            goto L_0x0035
        L_0x001e:
            boolean r2 = r0.mo24382s()
            if (r2 != 0) goto L_0x0026
            r3 = 0
            goto L_0x0035
        L_0x0026:
            boolean r2 = kotlinx.coroutines.channels.C11753k.m46648a(r7, r8, r1, r0)
            if (r2 == 0) goto L_0x0038
            boolean r0 = r1.mo24380o()
            if (r0 == 0) goto L_0x0035
            r1.mo24359l()
        L_0x0035:
            if (r3 == 0) goto L_0x0000
            goto L_0x0042
        L_0x0038:
            boolean r1 = r0.mo24380o()
            if (r1 == 0) goto L_0x000e
            r0.mo24359l()
            goto L_0x000e
        L_0x0042:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C11988e.m47810f(java.lang.Object, java.util.concurrent.atomic.AtomicReferenceArray, int, long, kotlinx.coroutines.internal.l0, kotlin.jvm.functions.p):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [kotlin.jvm.functions.p<? super java.lang.Long, ? super S, ? extends S>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @org.jetbrains.annotations.C12579k
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S extends kotlinx.coroutines.internal.C12003l0<S>> java.lang.Object m47811g(@org.jetbrains.annotations.C12579k S r4, long r5, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super java.lang.Long, ? super S, ? extends S> r7) {
        /*
        L_0x0000:
            long r0 = r4.f29607c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0012
            boolean r0 = r4.mo24355h()
            if (r0 == 0) goto L_0x000d
            goto L_0x0012
        L_0x000d:
            java.lang.Object r4 = kotlinx.coroutines.internal.C12005m0.m47888b(r4)
            return r4
        L_0x0012:
            java.lang.Object r0 = r4.mo24353f()
            kotlinx.coroutines.internal.o0 r1 = f29587b
            if (r0 != r1) goto L_0x0023
            kotlinx.coroutines.internal.o0 r4 = f29587b
            java.lang.Object r4 = kotlinx.coroutines.internal.C12005m0.m47888b(r4)
            return r4
        L_0x0023:
            kotlinx.coroutines.internal.f r0 = (kotlinx.coroutines.internal.C11990f) r0
            kotlinx.coroutines.internal.l0 r0 = (kotlinx.coroutines.internal.C12003l0) r0
            if (r0 == 0) goto L_0x002b
        L_0x0029:
            r4 = r0
            goto L_0x0000
        L_0x002b:
            long r0 = r4.f29607c
            r2 = 1
            long r0 = r0 + r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r7.invoke(r0, r4)
            kotlinx.coroutines.internal.l0 r0 = (kotlinx.coroutines.internal.C12003l0) r0
            boolean r1 = r4.mo24360m(r0)
            if (r1 == 0) goto L_0x0000
            boolean r1 = r4.mo24355h()
            if (r1 == 0) goto L_0x0029
            r4.mo24359l()
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C11988e.m47811g(kotlinx.coroutines.internal.l0, long, kotlin.jvm.functions.p):java.lang.Object");
    }

    /* renamed from: h */
    public static final void m47812h(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, C11300l<Object, C11079d2> lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    /* renamed from: i */
    public static final void m47813i(AtomicReferenceArray atomicReferenceArray, int i, C11300l<Object, C11079d2> lVar) {
        while (true) {
            lVar.invoke(atomicReferenceArray.get(i));
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [kotlinx.coroutines.internal.l0, java.lang.Object, kotlinx.coroutines.internal.f] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m47814j(@org.jetbrains.annotations.C12580l java.lang.Object r5, @org.jetbrains.annotations.C12579k java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6, @org.jetbrains.annotations.C12579k java.lang.Object r7) {
        /*
        L_0x0000:
            java.lang.Object r0 = r6.get(r5)
            kotlinx.coroutines.internal.l0 r0 = (kotlinx.coroutines.internal.C12003l0) r0
            long r1 = r0.f29607c
            long r3 = r7.f29607c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 1
            if (r1 < 0) goto L_0x0010
            return r2
        L_0x0010:
            boolean r1 = r7.mo24382s()
            if (r1 != 0) goto L_0x0018
            r5 = 0
            return r5
        L_0x0018:
            boolean r1 = androidx.concurrent.futures.C16563a.m75000a(r6, r5, r0, r7)
            if (r1 == 0) goto L_0x0028
            boolean r5 = r0.mo24380o()
            if (r5 == 0) goto L_0x0027
            r0.mo24359l()
        L_0x0027:
            return r2
        L_0x0028:
            boolean r0 = r7.mo24380o()
            if (r0 == 0) goto L_0x0000
            r7.mo24359l()
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C11988e.m47814j(java.lang.Object, java.util.concurrent.atomic.AtomicReferenceFieldUpdater, kotlinx.coroutines.internal.l0):boolean");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [kotlinx.coroutines.internal.l0, java.lang.Object, kotlinx.coroutines.internal.f] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m47815k(@org.jetbrains.annotations.C12580l java.lang.Object r4, @org.jetbrains.annotations.C12579k java.util.concurrent.atomic.AtomicReferenceArray r5, int r6, @org.jetbrains.annotations.C12579k java.lang.Object r7) {
        /*
        L_0x0000:
            java.lang.Object r4 = r5.get(r6)
            kotlinx.coroutines.internal.l0 r4 = (kotlinx.coroutines.internal.C12003l0) r4
            long r0 = r4.f29607c
            long r2 = r7.f29607c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 < 0) goto L_0x0010
            return r1
        L_0x0010:
            boolean r0 = r7.mo24382s()
            if (r0 != 0) goto L_0x0018
            r4 = 0
            return r4
        L_0x0018:
            boolean r0 = kotlinx.coroutines.channels.C11753k.m46648a(r5, r6, r4, r7)
            if (r0 == 0) goto L_0x0028
            boolean r5 = r4.mo24380o()
            if (r5 == 0) goto L_0x0027
            r4.mo24359l()
        L_0x0027:
            return r1
        L_0x0028:
            boolean r4 = r7.mo24380o()
            if (r4 == 0) goto L_0x0000
            r7.mo24359l()
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C11988e.m47815k(java.lang.Object, java.util.concurrent.atomic.AtomicReferenceArray, int, kotlinx.coroutines.internal.l0):boolean");
    }
}
