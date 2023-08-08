package kotlinx.coroutines.flow;

import java.util.ArrayList;
import java.util.List;
import kotlin.C11079d2;
import kotlin.Result;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11962g1;
import kotlinx.coroutines.C12078p;
import kotlinx.coroutines.C12089r;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.C11924a;
import kotlinx.coroutines.flow.internal.C11925b;
import kotlinx.coroutines.flow.internal.C11926c;
import kotlinx.coroutines.flow.internal.C11932i;
import kotlinx.coroutines.internal.C12009o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,731:1\n28#2,4:732\n28#2,4:738\n28#2,4:760\n28#2,4:767\n28#2,4:779\n28#2,4:793\n28#2,4:807\n20#3:736\n20#3:742\n20#3:764\n20#3:771\n20#3:783\n20#3:797\n20#3:811\n329#4:737\n1#5:743\n94#6,2:744\n96#6,2:747\n98#6:750\n94#6,2:772\n96#6,2:775\n98#6:778\n94#6,2:800\n96#6,2:803\n98#6:806\n13579#7:746\n13580#7:749\n13579#7:774\n13580#7:777\n13579#7:802\n13580#7:805\n314#8,9:751\n323#8,2:765\n314#8,9:784\n323#8,2:798\n*S KotlinDebug\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n*L\n351#1:732,4\n391#1:738,4\n485#1:760,4\n506#1:767,4\n626#1:779,4\n661#1:793,4\n689#1:807,4\n351#1:736\n391#1:742\n485#1:764\n506#1:771\n626#1:783\n661#1:797\n689#1:811\n373#1:737\n453#1:744,2\n453#1:747,2\n453#1:750\n529#1:772,2\n529#1:775,2\n529#1:778\n676#1:800,2\n676#1:803,2\n676#1:806\n453#1:746\n453#1:749\n529#1:774\n529#1:777\n676#1:802\n676#1:805\n483#1:751,9\n483#1:765,2\n660#1:784,9\n660#1:798,2\n*E\n"})
public class SharedFlowImpl<T> extends C11924a<C11946p> implements C11911i<T>, C11903a<T>, C11932i<T> {

    /* renamed from: e */
    public final int f29437e;

    /* renamed from: f */
    public final int f29438f;
    @C12579k

    /* renamed from: g */
    public final BufferOverflow f29439g;
    @C12580l

    /* renamed from: v */
    public Object[] f29440v;

    /* renamed from: w */
    public long f29441w;

    /* renamed from: x */
    public long f29442x;

    /* renamed from: y */
    public int f29443y;

    /* renamed from: z */
    public int f29444z;

    /* renamed from: kotlinx.coroutines.flow.SharedFlowImpl$a */
    public static final class C11900a implements C11962g1 {
        @C12579k
        @C11287e

        /* renamed from: a */
        public final SharedFlowImpl<?> f29445a;
        @C11287e

        /* renamed from: b */
        public long f29446b;
        @C12580l
        @C11287e

        /* renamed from: c */
        public final Object f29447c;
        @C12579k
        @C11287e

        /* renamed from: d */
        public final C11045c<C11079d2> f29448d;

        public C11900a(@C12579k SharedFlowImpl<?> sharedFlowImpl, long j, @C12580l Object obj, @C12579k C11045c<? super C11079d2> cVar) {
            this.f29445a = sharedFlowImpl;
            this.f29446b = j;
            this.f29447c = obj;
            this.f29448d = cVar;
        }

        /* renamed from: g */
        public void mo23720g() {
            this.f29445a.mo24177C(this);
        }
    }

    /* renamed from: kotlinx.coroutines.flow.SharedFlowImpl$b */
    public /* synthetic */ class C11901b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                kotlinx.coroutines.channels.BufferOverflow[] r0 = kotlinx.coroutines.channels.BufferOverflow.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_LATEST     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SharedFlowImpl.C11901b.<clinit>():void");
        }
    }

    public SharedFlowImpl(int i, int i2, @C12579k BufferOverflow bufferOverflow) {
        this.f29437e = i;
        this.f29438f = i2;
        this.f29439g = bufferOverflow;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: kotlinx.coroutines.flow.p} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ab A[Catch:{ all -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bc A[Catch:{ all -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ <T> java.lang.Object m47271E(kotlinx.coroutines.flow.SharedFlowImpl<T> r8, kotlinx.coroutines.flow.C11908f<? super T> r9, kotlin.coroutines.C11045c<?> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.SharedFlowImpl$collect$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            kotlinx.coroutines.flow.SharedFlowImpl$collect$1 r0 = (kotlinx.coroutines.flow.SharedFlowImpl$collect$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.SharedFlowImpl$collect$1 r0 = new kotlinx.coroutines.flow.SharedFlowImpl$collect$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0075
            if (r2 == r5) goto L_0x005e
            if (r2 == r4) goto L_0x0044
            if (r2 != r3) goto L_0x003c
            java.lang.Object r8 = r0.L$3
            kotlinx.coroutines.c2 r8 = (kotlinx.coroutines.C11723c2) r8
            java.lang.Object r9 = r0.L$2
            kotlinx.coroutines.flow.p r9 = (kotlinx.coroutines.flow.C11946p) r9
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.flow.f r2 = (kotlinx.coroutines.flow.C11908f) r2
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.flow.SharedFlowImpl r5 = (kotlinx.coroutines.flow.SharedFlowImpl) r5
            goto L_0x0054
        L_0x003c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0044:
            java.lang.Object r8 = r0.L$3
            kotlinx.coroutines.c2 r8 = (kotlinx.coroutines.C11723c2) r8
            java.lang.Object r9 = r0.L$2
            kotlinx.coroutines.flow.p r9 = (kotlinx.coroutines.flow.C11946p) r9
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.flow.f r2 = (kotlinx.coroutines.flow.C11908f) r2
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.flow.SharedFlowImpl r5 = (kotlinx.coroutines.flow.SharedFlowImpl) r5
        L_0x0054:
            kotlin.C11661u0.m45747n(r10)     // Catch:{ all -> 0x005b }
            r10 = r2
            r2 = r8
            r8 = r5
            goto L_0x00a3
        L_0x005b:
            r8 = move-exception
            goto L_0x00da
        L_0x005e:
            java.lang.Object r8 = r0.L$2
            r9 = r8
            kotlinx.coroutines.flow.p r9 = (kotlinx.coroutines.flow.C11946p) r9
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.flow.f r8 = (kotlinx.coroutines.flow.C11908f) r8
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.SharedFlowImpl r2 = (kotlinx.coroutines.flow.SharedFlowImpl) r2
            kotlin.C11661u0.m45747n(r10)     // Catch:{ all -> 0x0071 }
            r10 = r8
            r8 = r2
            goto L_0x0097
        L_0x0071:
            r8 = move-exception
            r5 = r2
            goto L_0x00da
        L_0x0075:
            kotlin.C11661u0.m45747n(r10)
            kotlinx.coroutines.flow.internal.c r10 = r8.mo24260i()
            kotlinx.coroutines.flow.p r10 = (kotlinx.coroutines.flow.C11946p) r10
            boolean r2 = r9 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector     // Catch:{ all -> 0x00d6 }
            if (r2 == 0) goto L_0x0094
            r2 = r9
            kotlinx.coroutines.flow.SubscribedFlowCollector r2 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r2     // Catch:{ all -> 0x00d6 }
            r0.L$0 = r8     // Catch:{ all -> 0x00d6 }
            r0.L$1 = r9     // Catch:{ all -> 0x00d6 }
            r0.L$2 = r10     // Catch:{ all -> 0x00d6 }
            r0.label = r5     // Catch:{ all -> 0x00d6 }
            java.lang.Object r2 = r2.mo24222c(r0)     // Catch:{ all -> 0x00d6 }
            if (r2 != r1) goto L_0x0094
            return r1
        L_0x0094:
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x0097:
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()     // Catch:{ all -> 0x00d2 }
            kotlinx.coroutines.c2$b r5 = kotlinx.coroutines.C11723c2.f29067w0     // Catch:{ all -> 0x00d2 }
            kotlin.coroutines.CoroutineContext$a r2 = r2.mo7444b(r5)     // Catch:{ all -> 0x00d2 }
            kotlinx.coroutines.c2 r2 = (kotlinx.coroutines.C11723c2) r2     // Catch:{ all -> 0x00d2 }
        L_0x00a3:
            java.lang.Object r5 = r8.mo24197Z(r9)     // Catch:{ all -> 0x00d2 }
            kotlinx.coroutines.internal.o0 r6 = kotlinx.coroutines.flow.C11945o.f29527a     // Catch:{ all -> 0x00d2 }
            if (r5 != r6) goto L_0x00bc
            r0.L$0 = r8     // Catch:{ all -> 0x00d2 }
            r0.L$1 = r10     // Catch:{ all -> 0x00d2 }
            r0.L$2 = r9     // Catch:{ all -> 0x00d2 }
            r0.L$3 = r2     // Catch:{ all -> 0x00d2 }
            r0.label = r4     // Catch:{ all -> 0x00d2 }
            java.lang.Object r5 = r8.mo24176B(r9, r0)     // Catch:{ all -> 0x00d2 }
            if (r5 != r1) goto L_0x00a3
            return r1
        L_0x00bc:
            if (r2 == 0) goto L_0x00c1
            kotlinx.coroutines.C11804f2.m46950A(r2)     // Catch:{ all -> 0x00d2 }
        L_0x00c1:
            r0.L$0 = r8     // Catch:{ all -> 0x00d2 }
            r0.L$1 = r10     // Catch:{ all -> 0x00d2 }
            r0.L$2 = r9     // Catch:{ all -> 0x00d2 }
            r0.L$3 = r2     // Catch:{ all -> 0x00d2 }
            r0.label = r3     // Catch:{ all -> 0x00d2 }
            java.lang.Object r5 = r10.emit(r5, r0)     // Catch:{ all -> 0x00d2 }
            if (r5 != r1) goto L_0x00a3
            return r1
        L_0x00d2:
            r10 = move-exception
            r5 = r8
            r8 = r10
            goto L_0x00da
        L_0x00d6:
            r9 = move-exception
            r5 = r8
            r8 = r9
            r9 = r10
        L_0x00da:
            r5.mo24262m(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SharedFlowImpl.m47271E(kotlinx.coroutines.flow.SharedFlowImpl, kotlinx.coroutines.flow.f, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: J */
    public static /* synthetic */ <T> Object m47272J(SharedFlowImpl<T> sharedFlowImpl, T t, C11045c<? super C11079d2> cVar) {
        if (sharedFlowImpl.mo24198a(t)) {
            return C11079d2.f28267a;
        }
        Object K = sharedFlowImpl.mo24183K(t, cVar);
        if (K == C11063b.m42612h()) {
            return K;
        }
        return C11079d2.f28267a;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m47273Q() {
    }

    /* renamed from: B */
    public final Object mo24176B(C11946p pVar, C11045c<? super C11079d2> cVar) {
        C11079d2 d2Var;
        C12078p pVar2 = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
        pVar2.mo24537e0();
        synchronized (this) {
            if (mo24196Y(pVar) < 0) {
                pVar.f29529b = pVar2;
            } else {
                Result.C10852a aVar = Result.f28060a;
                pVar2.resumeWith(Result.m38702b(C11079d2.f28267a));
            }
            d2Var = C11079d2.f28267a;
        }
        Object y = pVar2.mo24572y();
        if (y == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        if (y == C11063b.m42612h()) {
            return y;
        }
        return d2Var;
    }

    /* renamed from: C */
    public final void mo24177C(C11900a aVar) {
        synchronized (this) {
            if (aVar.f29446b >= mo24187O()) {
                Object[] objArr = this.f29440v;
                Intrinsics.checkNotNull(objArr);
                if (C11945o.m47614f(objArr, aVar.f29446b) == aVar) {
                    C11945o.m47615g(objArr, aVar.f29446b, C11945o.f29527a);
                    mo24178D();
                    C11079d2 d2Var = C11079d2.f28267a;
                }
            }
        }
    }

    /* renamed from: D */
    public final void mo24178D() {
        if (this.f29438f != 0 || this.f29444z > 1) {
            Object[] objArr = this.f29440v;
            Intrinsics.checkNotNull(objArr);
            while (this.f29444z > 0 && C11945o.m47614f(objArr, (mo24187O() + ((long) mo24192U())) - 1) == C11945o.f29527a) {
                this.f29444z--;
                C11945o.m47615g(objArr, mo24187O() + ((long) mo24192U()), (Object) null);
            }
        }
    }

    /* renamed from: F */
    public final void mo24179F(long j) {
        C11926c[] h;
        if (!(this.f29507b == 0 || (h = this.f29506a) == null)) {
            for (C11926c cVar : h) {
                if (cVar != null) {
                    C11946p pVar = (C11946p) cVar;
                    long j2 = pVar.f29528a;
                    if (j2 >= 0 && j2 < j) {
                        pVar.f29528a = j;
                    }
                }
            }
        }
        this.f29442x = j;
    }

    @C12579k
    /* renamed from: G */
    public C11946p mo24205j() {
        return new C11946p();
    }

    @C12579k
    /* renamed from: H */
    public C11946p[] mo24206k(int i) {
        return new C11946p[i];
    }

    /* renamed from: I */
    public final void mo24182I() {
        Object[] objArr = this.f29440v;
        Intrinsics.checkNotNull(objArr);
        C11945o.m47615g(objArr, mo24187O(), (Object) null);
        this.f29443y--;
        long O = mo24187O() + 1;
        if (this.f29441w < O) {
            this.f29441w = O;
        }
        if (this.f29442x < O) {
            mo24179F(O);
        }
    }

    /* renamed from: K */
    public final Object mo24183K(T t, C11045c<? super C11079d2> cVar) {
        C11045c<C11079d2>[] cVarArr;
        C11900a aVar;
        C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
        pVar.mo24537e0();
        C11045c<C11079d2>[] cVarArr2 = C11925b.f29510a;
        synchronized (this) {
            if (mo24194W(t)) {
                Result.C10852a aVar2 = Result.f28060a;
                pVar.resumeWith(Result.m38702b(C11079d2.f28267a));
                cVarArr = mo24185M(cVarArr2);
                aVar = null;
            } else {
                C11900a aVar3 = new C11900a(this, ((long) mo24192U()) + mo24187O(), t, pVar);
                mo24184L(aVar3);
                this.f29444z = this.f29444z + 1;
                if (this.f29438f == 0) {
                    cVarArr2 = mo24185M(cVarArr2);
                }
                cVarArr = cVarArr2;
                aVar = aVar3;
            }
        }
        if (aVar != null) {
            C12089r.m48294a(pVar, aVar);
        }
        for (C11045c<C11079d2> cVar2 : cVarArr) {
            if (cVar2 != null) {
                Result.C10852a aVar4 = Result.f28060a;
                cVar2.resumeWith(Result.m38702b(C11079d2.f28267a));
            }
        }
        Object y = pVar.mo24572y();
        if (y == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        if (y == C11063b.m42612h()) {
            return y;
        }
        return C11079d2.f28267a;
    }

    /* renamed from: L */
    public final void mo24184L(Object obj) {
        int U = mo24192U();
        Object[] objArr = this.f29440v;
        if (objArr == null) {
            objArr = mo24193V((Object[]) null, 0, 2);
        } else if (U >= objArr.length) {
            objArr = mo24193V(objArr, U, objArr.length * 2);
        }
        C11945o.m47615g(objArr, mo24187O() + ((long) U), obj);
    }

    /* JADX WARNING: type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        r4 = (kotlinx.coroutines.flow.C11946p) r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.coroutines.C11045c<kotlin.C11079d2>[] mo24185M(kotlin.coroutines.C11045c<kotlin.C11079d2>[] r11) {
        /*
            r10 = this;
            int r0 = r11.length
            int r1 = r10.f29507b
            if (r1 == 0) goto L_0x0047
            kotlinx.coroutines.flow.internal.c[] r1 = r10.f29506a
            if (r1 == 0) goto L_0x0047
            int r2 = r1.length
            r3 = 0
        L_0x000f:
            if (r3 >= r2) goto L_0x0047
            r4 = r1[r3]
            if (r4 == 0) goto L_0x0044
            kotlinx.coroutines.flow.p r4 = (kotlinx.coroutines.flow.C11946p) r4
            kotlin.coroutines.c<? super kotlin.d2> r5 = r4.f29529b
            if (r5 != 0) goto L_0x001c
            goto L_0x0044
        L_0x001c:
            long r6 = r10.mo24196Y(r4)
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x0044
            int r6 = r11.length
            if (r0 < r6) goto L_0x0039
            int r6 = r11.length
            r7 = 2
            int r6 = r6 * r7
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r6)
            java.lang.String r6 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r6)
        L_0x0039:
            r6 = r11
            kotlin.coroutines.c[] r6 = (kotlin.coroutines.C11045c[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.f29529b = r0
            r0 = r7
        L_0x0044:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x0047:
            kotlin.coroutines.c[] r11 = (kotlin.coroutines.C11045c[]) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SharedFlowImpl.mo24185M(kotlin.coroutines.c[]):kotlin.coroutines.c[]");
    }

    /* renamed from: N */
    public final long mo24186N() {
        return mo24187O() + ((long) this.f29443y);
    }

    /* renamed from: O */
    public final long mo24187O() {
        return Math.min(this.f29442x, this.f29441w);
    }

    /* renamed from: P */
    public final T mo24188P() {
        Object[] objArr = this.f29440v;
        Intrinsics.checkNotNull(objArr);
        return C11945o.m47614f(objArr, (this.f29441w + ((long) mo24191T())) - 1);
    }

    /* renamed from: R */
    public final Object mo24189R(long j) {
        Object[] objArr = this.f29440v;
        Intrinsics.checkNotNull(objArr);
        Object c = C11945o.m47614f(objArr, j);
        if (c instanceof C11900a) {
            return ((C11900a) c).f29447c;
        }
        return c;
    }

    /* renamed from: S */
    public final long mo24190S() {
        return mo24187O() + ((long) this.f29443y) + ((long) this.f29444z);
    }

    /* renamed from: T */
    public final int mo24191T() {
        return (int) ((mo24187O() + ((long) this.f29443y)) - this.f29441w);
    }

    /* renamed from: U */
    public final int mo24192U() {
        return this.f29443y + this.f29444z;
    }

    /* renamed from: V */
    public final Object[] mo24193V(Object[] objArr, int i, int i2) {
        boolean z;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Object[] objArr2 = new Object[i2];
            this.f29440v = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long O = mo24187O();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + O;
                C11945o.m47615g(objArr2, j, C11945o.m47614f(objArr, j));
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    /* renamed from: W */
    public final boolean mo24194W(T t) {
        if (mo24263n() == 0) {
            return mo24195X(t);
        }
        if (this.f29443y >= this.f29438f && this.f29442x <= this.f29441w) {
            int i = C11901b.$EnumSwitchMapping$0[this.f29439g.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
        }
        mo24184L(t);
        int i2 = this.f29443y + 1;
        this.f29443y = i2;
        if (i2 > this.f29438f) {
            mo24182I();
        }
        if (mo24191T() > this.f29437e) {
            mo24199a0(this.f29441w + 1, this.f29442x, mo24186N(), mo24190S());
        }
        return true;
    }

    /* renamed from: X */
    public final boolean mo24195X(T t) {
        if (this.f29437e == 0) {
            return true;
        }
        mo24184L(t);
        int i = this.f29443y + 1;
        this.f29443y = i;
        if (i > this.f29437e) {
            mo24182I();
        }
        this.f29442x = mo24187O() + ((long) this.f29443y);
        return true;
    }

    /* renamed from: Y */
    public final long mo24196Y(C11946p pVar) {
        long j = pVar.f29528a;
        if (j < mo24186N()) {
            return j;
        }
        if (this.f29438f <= 0 && j <= mo24187O() && this.f29444z != 0) {
            return j;
        }
        return -1;
    }

    /* renamed from: Z */
    public final Object mo24197Z(C11946p pVar) {
        Object obj;
        C11045c<C11079d2>[] cVarArr = C11925b.f29510a;
        synchronized (this) {
            long Y = mo24196Y(pVar);
            if (Y < 0) {
                obj = C11945o.f29527a;
            } else {
                long j = pVar.f29528a;
                Object R = mo24189R(Y);
                pVar.f29528a = Y + 1;
                Object obj2 = R;
                cVarArr = mo24200b0(j);
                obj = obj2;
            }
        }
        for (C11045c<C11079d2> cVar : cVarArr) {
            if (cVar != null) {
                Result.C10852a aVar = Result.f28060a;
                cVar.resumeWith(Result.m38702b(C11079d2.f28267a));
            }
        }
        return obj;
    }

    /* renamed from: a */
    public boolean mo24198a(T t) {
        int i;
        boolean z;
        C11045c<C11079d2>[] cVarArr = C11925b.f29510a;
        synchronized (this) {
            if (mo24194W(t)) {
                cVarArr = mo24185M(cVarArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (C11045c<C11079d2> cVar : cVarArr) {
            if (cVar != null) {
                Result.C10852a aVar = Result.f28060a;
                cVar.resumeWith(Result.m38702b(C11079d2.f28267a));
            }
        }
        return z;
    }

    /* renamed from: a0 */
    public final void mo24199a0(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long O = mo24187O(); O < min; O++) {
            Object[] objArr = this.f29440v;
            Intrinsics.checkNotNull(objArr);
            C11945o.m47615g(objArr, O, (Object) null);
        }
        this.f29441w = j;
        this.f29442x = j2;
        this.f29443y = (int) (j3 - min);
        this.f29444z = (int) (j4 - j3);
    }

    @C12579k
    /* renamed from: b0 */
    public final C11045c<C11079d2>[] mo24200b0(long j) {
        int i;
        long j2;
        long j3;
        long j4;
        boolean z;
        long j5;
        C11926c[] h;
        if (j > this.f29442x) {
            return C11925b.f29510a;
        }
        long O = mo24187O();
        long j6 = ((long) this.f29443y) + O;
        if (this.f29438f == 0 && this.f29444z > 0) {
            j6++;
        }
        if (!(this.f29507b == 0 || (h = this.f29506a) == null)) {
            for (C11926c cVar : h) {
                if (cVar != null) {
                    long j7 = ((C11946p) cVar).f29528a;
                    if (j7 >= 0 && j7 < j6) {
                        j6 = j7;
                    }
                }
            }
        }
        if (j6 <= this.f29442x) {
            return C11925b.f29510a;
        }
        long N = mo24186N();
        if (mo24263n() > 0) {
            i = Math.min(this.f29444z, this.f29438f - ((int) (N - j6)));
        } else {
            i = this.f29444z;
        }
        C11045c<C11079d2>[] cVarArr = C11925b.f29510a;
        long j8 = ((long) this.f29444z) + N;
        if (i > 0) {
            cVarArr = new C11045c[i];
            Object[] objArr = this.f29440v;
            Intrinsics.checkNotNull(objArr);
            long j9 = N;
            int i2 = 0;
            while (true) {
                if (N >= j8) {
                    j3 = j6;
                    j2 = j8;
                    break;
                }
                Object c = C11945o.m47614f(objArr, N);
                j3 = j6;
                C12009o0 o0Var = C11945o.f29527a;
                if (c != o0Var) {
                    Intrinsics.checkNotNull(c, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    C11900a aVar = (C11900a) c;
                    int i3 = i2 + 1;
                    j2 = j8;
                    cVarArr[i2] = aVar.f29448d;
                    C11945o.m47615g(objArr, N, o0Var);
                    C11945o.m47615g(objArr, j9, aVar.f29447c);
                    j5 = 1;
                    j9++;
                    if (i3 >= i) {
                        break;
                    }
                    i2 = i3;
                } else {
                    j2 = j8;
                    j5 = 1;
                }
                N += j5;
                j6 = j3;
                j8 = j2;
            }
            N = j9;
        } else {
            j3 = j6;
            j2 = j8;
        }
        int i4 = (int) (N - O);
        if (mo24263n() == 0) {
            j4 = N;
        } else {
            j4 = j3;
        }
        long max = Math.max(this.f29441w, N - ((long) Math.min(this.f29437e, i4)));
        if (this.f29438f == 0 && max < j2) {
            Object[] objArr2 = this.f29440v;
            Intrinsics.checkNotNull(objArr2);
            if (Intrinsics.areEqual(C11945o.m47614f(objArr2, max), (Object) C11945o.f29527a)) {
                N++;
                max++;
            }
        }
        mo24199a0(max, j4, N, j2);
        mo24178D();
        if (cVarArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return mo24185M(cVarArr);
        }
        return cVarArr;
    }

    @C12579k
    /* renamed from: c */
    public C11907e<T> mo24201c(@C12579k CoroutineContext coroutineContext, int i, @C12579k BufferOverflow bufferOverflow) {
        return C11945o.m47613e(this, coroutineContext, i, bufferOverflow);
    }

    /* renamed from: c0 */
    public final long mo24202c0() {
        long j = this.f29441w;
        if (j < this.f29442x) {
            this.f29442x = j;
        }
        return j;
    }

    @C12580l
    public Object collect(@C12579k C11908f<? super T> fVar, @C12579k C11045c<?> cVar) {
        return m47271E(this, fVar, cVar);
    }

    @C12579k
    /* renamed from: d */
    public List<T> mo24203d() {
        synchronized (this) {
            int T = mo24191T();
            if (T == 0) {
                List<T> E = CollectionsKt__CollectionsKt.m40441E();
                return E;
            }
            ArrayList arrayList = new ArrayList(T);
            Object[] objArr = this.f29440v;
            Intrinsics.checkNotNull(objArr);
            for (int i = 0; i < T; i++) {
                arrayList.add(C11945o.m47614f(objArr, this.f29441w + ((long) i)));
            }
            return arrayList;
        }
    }

    @C12580l
    public Object emit(T t, @C12579k C11045c<? super C11079d2> cVar) {
        return m47272J(this, t, cVar);
    }

    /* renamed from: f */
    public void mo24204f() {
        synchronized (this) {
            mo24199a0(mo24186N(), this.f29442x, mo24186N(), mo24190S());
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }
}
