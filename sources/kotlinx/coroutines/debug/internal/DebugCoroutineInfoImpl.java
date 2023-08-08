package kotlinx.coroutines.debug.internal;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11532s0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.C11066c;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C11563q;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nDebugCoroutineInfoImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugCoroutineInfoImpl.kt\nkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,180:1\n1#2:181\n*E\n"})
@C11532s0
public final class DebugCoroutineInfoImpl {
    @C12580l
    @C11287e
    public volatile WeakReference<C11066c> _lastObservedFrame;
    @C12579k
    @C11287e
    public volatile String _state = C11788d.f29251a;
    @C12580l

    /* renamed from: a */
    public final C11793i f29214a;
    @C11287e

    /* renamed from: b */
    public final long f29215b;
    @C12579k

    /* renamed from: c */
    public final WeakReference<CoroutineContext> f29216c;

    /* renamed from: d */
    public int f29217d;
    @C12580l
    @C11287e
    public volatile Thread lastObservedThread;

    public DebugCoroutineInfoImpl(@C12580l CoroutineContext coroutineContext, @C12580l C11793i iVar, long j) {
        this.f29214a = iVar;
        this.f29215b = j;
        this.f29216c = new WeakReference<>(coroutineContext);
    }

    /* renamed from: b */
    public final List<StackTraceElement> mo23984b() {
        C11793i iVar = this.f29214a;
        if (iVar == null) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        return SequencesKt___SequencesKt.m44731c3(C11563q.m44902b(new DebugCoroutineInfoImpl$creationStackTrace$1(this, iVar, (C11045c<? super DebugCoroutineInfoImpl$creationStackTrace$1>) null)));
    }

    @C12580l
    /* renamed from: c */
    public final CoroutineContext mo23985c() {
        return this.f29216c.get();
    }

    @C12580l
    /* renamed from: d */
    public final C11793i mo23986d() {
        return this.f29214a;
    }

    @C12579k
    /* renamed from: e */
    public final List<StackTraceElement> mo23987e() {
        return mo23984b();
    }

    @C12580l
    /* renamed from: f */
    public final C11066c mo23988f() {
        WeakReference<C11066c> weakReference = this._lastObservedFrame;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @C12579k
    /* renamed from: g */
    public final String mo23989g() {
        return this._state;
    }

    @C12579k
    /* renamed from: h */
    public final List<StackTraceElement> mo23990h() {
        C11066c f = mo23988f();
        if (f == null) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        ArrayList arrayList = new ArrayList();
        while (f != null) {
            StackTraceElement stackTraceElement = f.getStackTraceElement();
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
            f = f.getCallerFrame();
        }
        return arrayList;
    }

    /* renamed from: i */
    public final void mo23991i(@C12580l C11066c cVar) {
        this._lastObservedFrame = cVar != null ? new WeakReference<>(cVar) : null;
    }

    /* renamed from: j */
    public final synchronized void mo23992j(@C12579k String str, @C12579k C11045c<?> cVar, boolean z) {
        C11066c cVar2;
        if (Intrinsics.areEqual((Object) this._state, (Object) C11788d.f29252b) && Intrinsics.areEqual((Object) str, (Object) C11788d.f29252b) && z) {
            this.f29217d++;
        } else if (this.f29217d > 0 && Intrinsics.areEqual((Object) str, (Object) C11788d.f29253c)) {
            this.f29217d--;
            return;
        }
        if (!Intrinsics.areEqual((Object) this._state, (Object) str) || !Intrinsics.areEqual((Object) str, (Object) C11788d.f29253c) || mo23988f() == null) {
            this._state = str;
            Thread thread = null;
            if (cVar instanceof C11066c) {
                cVar2 = (C11066c) cVar;
            } else {
                cVar2 = null;
            }
            mo23991i(cVar2);
            if (Intrinsics.areEqual((Object) str, (Object) C11788d.f29252b)) {
                thread = Thread.currentThread();
            }
            this.lastObservedThread = thread;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo23993k(kotlin.sequences.C11561o<? super java.lang.StackTraceElement> r6, kotlin.coroutines.jvm.internal.C11066c r7, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1 r0 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1 r0 = new kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            java.lang.Object r6 = r0.L$2
            kotlin.coroutines.jvm.internal.c r6 = (kotlin.coroutines.jvm.internal.C11066c) r6
            java.lang.Object r7 = r0.L$1
            kotlin.sequences.o r7 = (kotlin.sequences.C11561o) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r2 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl) r2
            kotlin.C11661u0.m45747n(r8)
            goto L_0x005e
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            kotlin.C11661u0.m45747n(r8)
            r2 = r5
        L_0x0041:
            if (r7 != 0) goto L_0x0046
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        L_0x0046:
            java.lang.StackTraceElement r8 = r7.getStackTraceElement()
            if (r8 == 0) goto L_0x0061
            r0.L$0 = r2
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r8 = r6.mo23250b(r8, r0)
            if (r8 != r1) goto L_0x005b
            return r1
        L_0x005b:
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x005e:
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x0061:
            kotlin.coroutines.jvm.internal.c r7 = r7.getCallerFrame()
            if (r7 == 0) goto L_0x0068
            goto L_0x0041
        L_0x0068:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.mo23993k(kotlin.sequences.o, kotlin.coroutines.jvm.internal.c, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    public String toString() {
        return "DebugCoroutineInfo(state=" + mo23989g() + ",context=" + mo23985c() + ')';
    }
}
