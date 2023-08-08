package kotlinx.coroutines.flow;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C11079d2;
import kotlin.collections.C10976s;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.C11394v;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.C11924a;
import kotlinx.coroutines.flow.internal.C11932i;
import kotlinx.coroutines.flow.internal.C11936l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowImpl\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,428:1\n18#2:429\n18#2:443\n28#3,4:430\n28#3,4:437\n20#4:434\n20#4:441\n13579#5,2:435\n329#6:442\n*S KotlinDebug\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowImpl\n*L\n315#1:429\n396#1:443\n324#1:430,4\n352#1:437,4\n324#1:434\n352#1:441\n348#1:435,2\n385#1:442\n*E\n"})
public final class StateFlowImpl<T> extends C11924a<C11954w> implements C11940j<T>, C11903a<T>, C11932i<T> {
    @C12579k

    /* renamed from: f */
    public static final AtomicReferenceFieldUpdater f29457f = AtomicReferenceFieldUpdater.newUpdater(StateFlowImpl.class, Object.class, "_state");
    @C11394v
    @C12580l
    private volatile Object _state;

    /* renamed from: e */
    public int f29458e;

    public StateFlowImpl(@C12579k Object obj) {
        this._state = obj;
    }

    /* renamed from: r */
    public static /* synthetic */ void m47326r() {
    }

    /* renamed from: a */
    public boolean mo24198a(T t) {
        setValue(t);
        return true;
    }

    @C12579k
    /* renamed from: c */
    public C11907e<T> mo24201c(@C12579k CoroutineContext coroutineContext, int i, @C12579k BufferOverflow bufferOverflow) {
        return C11953v.m47631d(this, coroutineContext, i, bufferOverflow);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: kotlinx.coroutines.flow.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: kotlinx.coroutines.flow.StateFlowImpl} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ae A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bd A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bf A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d2 A[Catch:{ all -> 0x0073 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d3 A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00da A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object collect(@org.jetbrains.annotations.C12579k kotlinx.coroutines.flow.C11908f<? super T> r11, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<?> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof kotlinx.coroutines.flow.StateFlowImpl$collect$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            kotlinx.coroutines.flow.StateFlowImpl$collect$1 r0 = (kotlinx.coroutines.flow.StateFlowImpl$collect$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.StateFlowImpl$collect$1 r0 = new kotlinx.coroutines.flow.StateFlowImpl$collect$1
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0076
            if (r2 == r6) goto L_0x0061
            if (r2 == r5) goto L_0x004a
            if (r2 != r4) goto L_0x0042
            java.lang.Object r11 = r0.L$4
            java.lang.Object r2 = r0.L$3
            kotlinx.coroutines.c2 r2 = (kotlinx.coroutines.C11723c2) r2
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.flow.w r6 = (kotlinx.coroutines.flow.C11954w) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.flow.f r7 = (kotlinx.coroutines.flow.C11908f) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.flow.StateFlowImpl r8 = (kotlinx.coroutines.flow.StateFlowImpl) r8
            kotlin.C11661u0.m45747n(r12)     // Catch:{ all -> 0x0073 }
            goto L_0x00a6
        L_0x0042:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x004a:
            java.lang.Object r11 = r0.L$4
            java.lang.Object r2 = r0.L$3
            kotlinx.coroutines.c2 r2 = (kotlinx.coroutines.C11723c2) r2
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.flow.w r6 = (kotlinx.coroutines.flow.C11954w) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.flow.f r7 = (kotlinx.coroutines.flow.C11908f) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.flow.StateFlowImpl r8 = (kotlinx.coroutines.flow.StateFlowImpl) r8
            kotlin.C11661u0.m45747n(r12)     // Catch:{ all -> 0x0073 }
            goto L_0x00d4
        L_0x0061:
            java.lang.Object r11 = r0.L$2
            r6 = r11
            kotlinx.coroutines.flow.w r6 = (kotlinx.coroutines.flow.C11954w) r6
            java.lang.Object r11 = r0.L$1
            kotlinx.coroutines.flow.f r11 = (kotlinx.coroutines.flow.C11908f) r11
            java.lang.Object r2 = r0.L$0
            r8 = r2
            kotlinx.coroutines.flow.StateFlowImpl r8 = (kotlinx.coroutines.flow.StateFlowImpl) r8
            kotlin.C11661u0.m45747n(r12)     // Catch:{ all -> 0x0073 }
            goto L_0x0097
        L_0x0073:
            r11 = move-exception
            goto L_0x00f0
        L_0x0076:
            kotlin.C11661u0.m45747n(r12)
            kotlinx.coroutines.flow.internal.c r12 = r10.mo24260i()
            kotlinx.coroutines.flow.w r12 = (kotlinx.coroutines.flow.C11954w) r12
            boolean r2 = r11 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector     // Catch:{ all -> 0x00ed }
            if (r2 == 0) goto L_0x0095
            r2 = r11
            kotlinx.coroutines.flow.SubscribedFlowCollector r2 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r2     // Catch:{ all -> 0x00ed }
            r0.L$0 = r10     // Catch:{ all -> 0x00ed }
            r0.L$1 = r11     // Catch:{ all -> 0x00ed }
            r0.L$2 = r12     // Catch:{ all -> 0x00ed }
            r0.label = r6     // Catch:{ all -> 0x00ed }
            java.lang.Object r2 = r2.mo24222c(r0)     // Catch:{ all -> 0x00ed }
            if (r2 != r1) goto L_0x0095
            return r1
        L_0x0095:
            r8 = r10
            r6 = r12
        L_0x0097:
            kotlin.coroutines.CoroutineContext r12 = r0.getContext()     // Catch:{ all -> 0x0073 }
            kotlinx.coroutines.c2$b r2 = kotlinx.coroutines.C11723c2.f29067w0     // Catch:{ all -> 0x0073 }
            kotlin.coroutines.CoroutineContext$a r12 = r12.mo7444b(r2)     // Catch:{ all -> 0x0073 }
            kotlinx.coroutines.c2 r12 = (kotlinx.coroutines.C11723c2) r12     // Catch:{ all -> 0x0073 }
            r7 = r11
            r2 = r12
            r11 = r3
        L_0x00a6:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = f29457f     // Catch:{ all -> 0x0073 }
            java.lang.Object r12 = r12.get(r8)     // Catch:{ all -> 0x0073 }
            if (r2 == 0) goto L_0x00b1
            kotlinx.coroutines.C11804f2.m46950A(r2)     // Catch:{ all -> 0x0073 }
        L_0x00b1:
            if (r11 == 0) goto L_0x00b9
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r12)     // Catch:{ all -> 0x0073 }
            if (r9 != 0) goto L_0x00d4
        L_0x00b9:
            kotlinx.coroutines.internal.o0 r11 = kotlinx.coroutines.flow.internal.C11936l.f29516a     // Catch:{ all -> 0x0073 }
            if (r12 != r11) goto L_0x00bf
            r11 = r3
            goto L_0x00c0
        L_0x00bf:
            r11 = r12
        L_0x00c0:
            r0.L$0 = r8     // Catch:{ all -> 0x0073 }
            r0.L$1 = r7     // Catch:{ all -> 0x0073 }
            r0.L$2 = r6     // Catch:{ all -> 0x0073 }
            r0.L$3 = r2     // Catch:{ all -> 0x0073 }
            r0.L$4 = r12     // Catch:{ all -> 0x0073 }
            r0.label = r5     // Catch:{ all -> 0x0073 }
            java.lang.Object r11 = r7.emit(r11, r0)     // Catch:{ all -> 0x0073 }
            if (r11 != r1) goto L_0x00d3
            return r1
        L_0x00d3:
            r11 = r12
        L_0x00d4:
            boolean r12 = r6.mo24280i()     // Catch:{ all -> 0x0073 }
            if (r12 != 0) goto L_0x00a6
            r0.L$0 = r8     // Catch:{ all -> 0x0073 }
            r0.L$1 = r7     // Catch:{ all -> 0x0073 }
            r0.L$2 = r6     // Catch:{ all -> 0x0073 }
            r0.L$3 = r2     // Catch:{ all -> 0x0073 }
            r0.L$4 = r11     // Catch:{ all -> 0x0073 }
            r0.label = r4     // Catch:{ all -> 0x0073 }
            java.lang.Object r12 = r6.mo24276e(r0)     // Catch:{ all -> 0x0073 }
            if (r12 != r1) goto L_0x00a6
            return r1
        L_0x00ed:
            r11 = move-exception
            r8 = r10
            r6 = r12
        L_0x00f0:
            r8.mo24262m(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.collect(kotlinx.coroutines.flow.f, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: d */
    public List<T> mo24203d() {
        return C10976s.m41419k(getValue());
    }

    /* renamed from: e */
    public boolean mo24216e(T t, T t2) {
        if (t == null) {
            t = C11936l.f29516a;
        }
        if (t2 == null) {
            t2 = C11936l.f29516a;
        }
        return mo24220s(t, t2);
    }

    @C12580l
    public Object emit(T t, @C12579k C11045c<? super C11079d2> cVar) {
        setValue(t);
        return C11079d2.f28267a;
    }

    /* renamed from: f */
    public void mo24204f() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    public T getValue() {
        T t = C11936l.f29516a;
        T t2 = f29457f.get(this);
        if (t2 == t) {
            return null;
        }
        return t2;
    }

    @C12579k
    /* renamed from: p */
    public C11954w mo24205j() {
        return new C11954w();
    }

    @C12579k
    /* renamed from: q */
    public C11954w[] mo24206k(int i) {
        return new C11954w[i];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        r8 = (kotlinx.coroutines.flow.C11954w[]) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        if (r8 == null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0032, code lost:
        r0 = r8.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0034, code lost:
        if (r3 >= r0) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0036, code lost:
        r4 = r8[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
        if (r4 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003a, code lost:
        r4.mo24279h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003d, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0040, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r8 = r6.f29458e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0043, code lost:
        if (r8 != r7) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0045, code lost:
        r6.f29458e = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0048, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0049, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r7 = mo24264o();
        r0 = kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0050, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0051, code lost:
        r5 = r8;
        r8 = r7;
        r7 = r5;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo24220s(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f29457f     // Catch:{ all -> 0x005e }
            java.lang.Object r1 = r0.get(r6)     // Catch:{ all -> 0x005e }
            r2 = 0
            if (r7 == 0) goto L_0x0012
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r7)     // Catch:{ all -> 0x005e }
            if (r7 != 0) goto L_0x0012
            monitor-exit(r6)
            return r2
        L_0x0012:
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r8)     // Catch:{ all -> 0x005e }
            r1 = 1
            if (r7 == 0) goto L_0x001b
            monitor-exit(r6)
            return r1
        L_0x001b:
            r0.set(r6, r8)     // Catch:{ all -> 0x005e }
            int r7 = r6.f29458e     // Catch:{ all -> 0x005e }
            r8 = r7 & 1
            if (r8 != 0) goto L_0x0058
            int r7 = r7 + r1
            r6.f29458e = r7     // Catch:{ all -> 0x005e }
            kotlinx.coroutines.flow.internal.c[] r8 = r6.mo24264o()     // Catch:{ all -> 0x005e }
            kotlin.d2 r0 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x005e }
            monitor-exit(r6)
        L_0x002e:
            kotlinx.coroutines.flow.w[] r8 = (kotlinx.coroutines.flow.C11954w[]) r8
            if (r8 == 0) goto L_0x0040
            int r0 = r8.length
            r3 = r2
        L_0x0034:
            if (r3 >= r0) goto L_0x0040
            r4 = r8[r3]
            if (r4 == 0) goto L_0x003d
            r4.mo24279h()
        L_0x003d:
            int r3 = r3 + 1
            goto L_0x0034
        L_0x0040:
            monitor-enter(r6)
            int r8 = r6.f29458e     // Catch:{ all -> 0x0055 }
            if (r8 != r7) goto L_0x004a
            int r7 = r7 + r1
            r6.f29458e = r7     // Catch:{ all -> 0x0055 }
            monitor-exit(r6)
            return r1
        L_0x004a:
            kotlinx.coroutines.flow.internal.c[] r7 = r6.mo24264o()     // Catch:{ all -> 0x0055 }
            kotlin.d2 r0 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0055 }
            monitor-exit(r6)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x002e
        L_0x0055:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x0058:
            int r7 = r7 + 2
            r6.f29458e = r7     // Catch:{ all -> 0x005e }
            monitor-exit(r6)
            return r1
        L_0x005e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.mo24220s(java.lang.Object, java.lang.Object):boolean");
    }

    public void setValue(T t) {
        if (t == null) {
            t = C11936l.f29516a;
        }
        mo24220s((Object) null, t);
    }
}
