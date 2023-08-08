package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C11079d2;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.C11394v;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,127:1\n314#2,9:128\n323#2,2:141\n13#3:137\n19#3:140\n13579#4,2:138\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll\n*L\n71#1:128,9\n71#1:141,2\n78#1:137\n90#1:140\n83#1:138,2\n*E\n"})
/* renamed from: kotlinx.coroutines.e */
public final class C11794e<T> {
    @C12579k

    /* renamed from: b */
    public static final AtomicIntegerFieldUpdater f29258b = AtomicIntegerFieldUpdater.newUpdater(C11794e.class, "notCompletedCount");
    @C12579k

    /* renamed from: a */
    public final C12154u0<T>[] f29259a;
    @C11394v
    private volatile int notCompletedCount;

    @C11363r0({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$AwaitAllNode\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,127:1\n11335#2:128\n11670#2,3:129\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$AwaitAllNode\n*L\n121#1:128\n121#1:129,3\n*E\n"})
    /* renamed from: kotlinx.coroutines.e$a */
    public final class C11795a extends C11974i2 {
        @C12579k

        /* renamed from: v */
        public static final AtomicReferenceFieldUpdater f29260v = AtomicReferenceFieldUpdater.newUpdater(C11795a.class, Object.class, "_disposer");
        @C11394v
        @C12580l
        private volatile Object _disposer;
        @C12579k

        /* renamed from: e */
        public final C12072o<List<? extends T>> f29261e;

        /* renamed from: f */
        public C11962g1 f29262f;

        public C11795a(@C12579k C12072o<? super List<? extends T>> oVar) {
            this.f29261e = oVar;
        }

        @C12580l
        /* renamed from: C */
        public final C11794e<T>.b mo24067C() {
            return (C11796b) f29260v.get(this);
        }

        @C12579k
        /* renamed from: D */
        public final C11962g1 mo24068D() {
            C11962g1 g1Var = this.f29262f;
            if (g1Var != null) {
                return g1Var;
            }
            Intrinsics.throwUninitializedPropertyAccessException("handle");
            return null;
        }

        /* renamed from: E */
        public final void mo24069E(@C12580l C11794e<T>.b bVar) {
            f29260v.set(this, bVar);
        }

        /* renamed from: F */
        public final void mo24070F(@C12579k C11962g1 g1Var) {
            this.f29262f = g1Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo23670z((Throwable) obj);
            return C11079d2.f28267a;
        }

        /* renamed from: z */
        public void mo23670z(@C12580l Throwable th) {
            if (th != null) {
                Object K = this.f29261e.mo24530K(th);
                if (K != null) {
                    this.f29261e.mo24540o0(K);
                    C11794e<T>.b C = mo24067C();
                    if (C != null) {
                        C.mo24072k();
                    }
                }
            } else if (C11794e.f29258b.decrementAndGet(C11794e.this) == 0) {
                C12072o<List<? extends T>> oVar = this.f29261e;
                C12154u0[] a = C11794e.this.f29259a;
                ArrayList arrayList = new ArrayList(a.length);
                for (C12154u0 n : a) {
                    arrayList.add(n.mo24778n());
                }
                Result.C10852a aVar = Result.f28060a;
                oVar.resumeWith(Result.m38702b(arrayList));
            }
        }
    }

    @C11363r0({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,127:1\n13579#2,2:128\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel\n*L\n96#1:128,2\n*E\n"})
    /* renamed from: kotlinx.coroutines.e$b */
    public final class C11796b extends C12060m {
        @C12579k

        /* renamed from: a */
        public final C11794e<T>.a[] f29264a;

        public C11796b(@C12579k C11794e<T>.a[] aVarArr) {
            this.f29264a = aVarArr;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo24071j((Throwable) obj);
            return C11079d2.f28267a;
        }

        /* renamed from: j */
        public void mo24071j(@C12580l Throwable th) {
            mo24072k();
        }

        /* renamed from: k */
        public final void mo24072k() {
            for (C11794e<T>.a D : this.f29264a) {
                D.mo24068D().mo23720g();
            }
        }

        @C12579k
        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f29264a + C12361b.f30261l;
        }
    }

    public C11794e(@C12579k C12154u0<? extends T>[] u0VarArr) {
        this.f29259a = u0VarArr;
        this.notCompletedCount = u0VarArr.length;
    }

    @C12580l
    /* renamed from: c */
    public final Object mo24066c(@C12579k C11045c<? super List<? extends T>> cVar) {
        C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
        pVar.mo24537e0();
        int length = this.f29259a.length;
        C11795a[] aVarArr = new C11795a[length];
        for (int i = 0; i < length; i++) {
            C12154u0 u0Var = this.f29259a[i];
            u0Var.start();
            C11795a aVar = new C11795a(pVar);
            aVar.mo24070F(u0Var.mo23589D(aVar));
            C11079d2 d2Var = C11079d2.f28267a;
            aVarArr[i] = aVar;
        }
        C11796b bVar = new C11796b(aVarArr);
        for (int i2 = 0; i2 < length; i2++) {
            aVarArr[i2].mo24069E(bVar);
        }
        if (pVar.mo24539j()) {
            bVar.mo24072k();
        } else {
            pVar.mo24529C(bVar);
        }
        Object y = pVar.mo24572y();
        if (y == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        return y;
    }
}
