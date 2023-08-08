package androidx.compose.runtime;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/ProduceFrameSignal\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1408:1\n70#2:1409\n70#2:1419\n314#3,9:1410\n323#3,2:1420\n1#4:1422\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/ProduceFrameSignal\n*L\n1355#1:1409\n1362#1:1419\n1361#1:1410,9\n1361#1:1420,2\n*E\n"})
/* renamed from: androidx.compose.runtime.g1 */
public final class C8542g1 {
    @C12580l

    /* renamed from: a */
    public Object f22976a;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r1 = new kotlinx.coroutines.C12078p(kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m42608d(r6), 1);
        r1.mo24537e0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (m30986a(r4) != androidx.compose.runtime.RecomposerKt.m30142b()) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        m30987b(r4, androidx.compose.runtime.RecomposerKt.m30141a());
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        m30987b(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if (r2 == null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        r5 = kotlin.Result.f28060a;
        r2.resumeWith(kotlin.Result.m38702b(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        r5 = r1.mo24572y();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004f, code lost:
        if (r5 != kotlin.coroutines.intrinsics.C11063b.m42612h()) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        kotlin.coroutines.jvm.internal.C11069f.m42638c(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        if (r5 != kotlin.coroutines.intrinsics.C11063b.m42612h()) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        return r0;
     */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo16128c(@org.jetbrains.annotations.C12579k java.lang.Object r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r4 = this;
            monitor-enter(r5)
            java.lang.Object r0 = r4.f22976a     // Catch:{ all -> 0x005f }
            java.lang.Object r1 = androidx.compose.runtime.RecomposerKt.f22747b     // Catch:{ all -> 0x005f }
            if (r0 != r1) goto L_0x0013
            java.lang.Object r6 = androidx.compose.runtime.RecomposerKt.f22748c     // Catch:{ all -> 0x005f }
            r4.f22976a = r6     // Catch:{ all -> 0x005f }
            kotlin.d2 r6 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x005f }
            monitor-exit(r5)
            return r6
        L_0x0013:
            kotlin.d2 r0 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x005f }
            monitor-exit(r5)
            kotlinx.coroutines.p r1 = new kotlinx.coroutines.p
            kotlin.coroutines.c r2 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m42608d(r6)
            r3 = 1
            r1.<init>(r2, r3)
            r1.mo24537e0()
            monitor-enter(r5)
            java.lang.Object r2 = r4.f22976a     // Catch:{ all -> 0x005c }
            java.lang.Object r3 = androidx.compose.runtime.RecomposerKt.f22747b     // Catch:{ all -> 0x005c }
            if (r2 != r3) goto L_0x0037
            java.lang.Object r2 = androidx.compose.runtime.RecomposerKt.f22748c     // Catch:{ all -> 0x005c }
            r4.f22976a = r2     // Catch:{ all -> 0x005c }
            r2 = r1
            goto L_0x003b
        L_0x0037:
            r4.f22976a = r1     // Catch:{ all -> 0x005c }
            r2 = 0
        L_0x003b:
            monitor-exit(r5)
            if (r2 == 0) goto L_0x0047
            kotlin.Result$a r5 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.Result.m38702b(r0)
            r2.resumeWith(r5)
        L_0x0047:
            java.lang.Object r5 = r1.mo24572y()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            if (r5 != r1) goto L_0x0054
            kotlin.coroutines.jvm.internal.C11069f.m42638c(r6)
        L_0x0054:
            java.lang.Object r6 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            if (r5 != r6) goto L_0x005b
            return r5
        L_0x005b:
            return r0
        L_0x005c:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L_0x005f:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C8542g1.mo16128c(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: d */
    public final C11045c<C11079d2> mo16129d() {
        boolean z;
        Object obj = this.f22976a;
        if (obj instanceof C11045c) {
            this.f22976a = RecomposerKt.f22748c;
            return (C11045c) obj;
        }
        if (Intrinsics.areEqual(obj, RecomposerKt.f22747b)) {
            z = true;
        } else {
            z = Intrinsics.areEqual(obj, RecomposerKt.f22748c);
        }
        if (!z) {
            if (obj == null) {
                this.f22976a = RecomposerKt.f22747b;
            } else {
                throw new IllegalStateException(("invalid pendingFrameContinuation " + obj).toString());
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void mo16130e() {
        boolean z;
        if (this.f22976a == RecomposerKt.f22748c) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f22976a = null;
            return;
        }
        throw new IllegalStateException("frame not pending".toString());
    }
}
