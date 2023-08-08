package androidx.compose.runtime;

import androidx.compose.runtime.C8686v0;
import androidx.compose.runtime.internal.C8567o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.C12078p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,132:1\n70#2:133\n70#2:134\n70#2:144\n70#2:147\n314#3,9:135\n323#3,2:145\n33#4,6:148\n*S KotlinDebug\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock\n*L\n54#1:133\n62#1:134\n81#1:144\n112#1:147\n79#1:135,9\n79#1:145,2\n115#1:148,6\n*E\n"})
public final class BroadcastFrameClock implements C8686v0 {

    /* renamed from: f */
    public static final int f22552f = 8;
    @C12580l

    /* renamed from: a */
    public final C11289a<C11079d2> f22553a;
    @C12579k

    /* renamed from: b */
    public final Object f22554b;
    @C12580l

    /* renamed from: c */
    public Throwable f22555c;
    @C12579k

    /* renamed from: d */
    public List<C8380a<?>> f22556d;
    @C12579k

    /* renamed from: e */
    public List<C8380a<?>> f22557e;

    @C11363r0({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,132:1\n1#2:133\n*E\n"})
    /* renamed from: androidx.compose.runtime.BroadcastFrameClock$a */
    public static final class C8380a<R> {
        @C12579k

        /* renamed from: a */
        public final C11300l<Long, R> f22558a;
        @C12579k

        /* renamed from: b */
        public final C11045c<R> f22559b;

        public C8380a(@C12579k C11300l<? super Long, ? extends R> lVar, @C12579k C11045c<? super R> cVar) {
            Intrinsics.checkNotNullParameter(lVar, "onFrame");
            Intrinsics.checkNotNullParameter(cVar, "continuation");
            this.f22558a = lVar;
            this.f22559b = cVar;
        }

        @C12579k
        /* renamed from: a */
        public final C11045c<R> mo14877a() {
            return this.f22559b;
        }

        @C12579k
        /* renamed from: b */
        public final C11300l<Long, R> mo14878b() {
            return this.f22558a;
        }

        /* renamed from: c */
        public final void mo14879c(long j) {
            Object obj;
            C11045c<R> cVar = this.f22559b;
            try {
                Result.C10852a aVar = Result.f28060a;
                obj = Result.m38702b(this.f22558a.invoke(Long.valueOf(j)));
            } catch (Throwable th) {
                Result.C10852a aVar2 = Result.f28060a;
                obj = Result.m38702b(C11661u0.m45734a(th));
            }
            cVar.resumeWith(obj);
        }
    }

    public BroadcastFrameClock() {
        this((C11289a) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: C */
    public static /* synthetic */ void m29486C(BroadcastFrameClock broadcastFrameClock, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = new CancellationException("clock cancelled");
        }
        broadcastFrameClock.mo14876a(cancellationException);
    }

    @C12580l
    /* renamed from: B */
    public <R> Object mo14872B(@C12579k C11300l<? super Long, ? extends R> lVar, @C12579k C11045c<? super R> cVar) {
        boolean z;
        C8380a aVar;
        C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
        pVar.mo24537e0();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (this.f22554b) {
            Throwable h = this.f22555c;
            if (h != null) {
                Result.C10852a aVar2 = Result.f28060a;
                pVar.resumeWith(Result.m38702b(C11661u0.m45734a(h)));
            } else {
                objectRef.element = new C8380a(lVar, pVar);
                if (!this.f22556d.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                List g = this.f22556d;
                T t = objectRef.element;
                if (t == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("awaiter");
                    aVar = null;
                } else {
                    aVar = (C8380a) t;
                }
                g.add(aVar);
                boolean z2 = !z;
                pVar.mo24529C(new BroadcastFrameClock$withFrameNanos$2$1(this, objectRef));
                if (z2 && this.f22553a != null) {
                    try {
                        this.f22553a.invoke();
                    } catch (Throwable th) {
                        mo14873H(th);
                    }
                }
            }
        }
        Object y = pVar.mo24572y();
        if (y == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        return y;
    }

    /* renamed from: H */
    public final void mo14873H(Throwable th) {
        synchronized (this.f22554b) {
            if (this.f22555c == null) {
                this.f22555c = th;
                List<C8380a<?>> list = this.f22556d;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    C11045c a = list.get(i).mo14877a();
                    Result.C10852a aVar = Result.f28060a;
                    a.resumeWith(Result.m38702b(C11661u0.m45734a(th)));
                }
                this.f22556d.clear();
                C11079d2 d2Var = C11079d2.f28267a;
            }
        }
    }

    /* renamed from: I */
    public final boolean mo14874I() {
        boolean z;
        synchronized (this.f22554b) {
            z = !this.f22556d.isEmpty();
        }
        return z;
    }

    /* renamed from: K */
    public final void mo14875K(long j) {
        synchronized (this.f22554b) {
            List<C8380a<?>> list = this.f22556d;
            this.f22556d = this.f22557e;
            this.f22557e = list;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).mo14879c(j);
            }
            list.clear();
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    @C12579k
    /* renamed from: Q */
    public CoroutineContext mo7443Q(@C12579k CoroutineContext coroutineContext) {
        return C8686v0.C8687a.m31921e(this, coroutineContext);
    }

    /* renamed from: a */
    public final void mo14876a(@C12579k CancellationException cancellationException) {
        Intrinsics.checkNotNullParameter(cancellationException, "cancellationException");
        mo14873H(cancellationException);
    }

    @C12580l
    /* renamed from: b */
    public <E extends CoroutineContext.C11040a> E mo7444b(@C12579k CoroutineContext.C11042b<E> bVar) {
        return C8686v0.C8687a.m31918b(this, bVar);
    }

    @C12579k
    /* renamed from: f */
    public CoroutineContext mo7445f(@C12579k CoroutineContext.C11042b<?> bVar) {
        return C8686v0.C8687a.m31920d(this, bVar);
    }

    /* renamed from: l */
    public <R> R mo7446l(R r, @C12579k C11304p<? super R, ? super CoroutineContext.C11040a, ? extends R> pVar) {
        return C8686v0.C8687a.m31917a(this, r, pVar);
    }

    public BroadcastFrameClock(@C12580l C11289a<C11079d2> aVar) {
        this.f22553a = aVar;
        this.f22554b = new Object();
        this.f22556d = new ArrayList();
        this.f22557e = new ArrayList();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BroadcastFrameClock(C11289a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : aVar);
    }
}
