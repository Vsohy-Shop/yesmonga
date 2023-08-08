package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.C11079d2;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C11804f2;
import kotlinx.coroutines.C11962g1;
import kotlinx.coroutines.C12072o;
import kotlinx.coroutines.C12081p2;
import kotlinx.coroutines.C12164w0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nHandlerDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Runnable.kt\nkotlinx/coroutines/RunnableKt\n*L\n1#1,217:1\n1#2:218\n17#3:219\n*S KotlinDebug\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n*L\n147#1:219\n*E\n"})
public final class HandlerContext extends C11711d implements C12164w0 {
    @C12580l
    private volatile HandlerContext _immediate;
    @C12579k

    /* renamed from: c */
    public final Handler f29040c;
    @C12580l

    /* renamed from: d */
    public final String f29041d;

    /* renamed from: e */
    public final boolean f29042e;
    @C12579k

    /* renamed from: f */
    public final HandlerContext f29043f;

    @C11363r0({"SMAP\nRunnable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Runnable.kt\nkotlinx/coroutines/RunnableKt$Runnable$1\n+ 2 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,18:1\n148#2:19\n149#2:21\n1#3:20\n*E\n"})
    /* renamed from: kotlinx.coroutines.android.HandlerContext$a */
    public static final class C11707a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C12072o f29044a;

        /* renamed from: b */
        public final /* synthetic */ HandlerContext f29045b;

        public C11707a(C12072o oVar, HandlerContext handlerContext) {
            this.f29044a = oVar;
            this.f29045b = handlerContext;
        }

        public final void run() {
            this.f29044a.mo24534b0(this.f29045b, C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerContext(Handler handler, String str, boolean z) {
        super((DefaultConstructorMarker) null);
        HandlerContext handlerContext = null;
        this.f29040c = handler;
        this.f29041d = str;
        this.f29042e = z;
        this._immediate = z ? this : handlerContext;
        HandlerContext handlerContext2 = this._immediate;
        if (handlerContext2 == null) {
            handlerContext2 = new HandlerContext(handler, str, true);
            this._immediate = handlerContext2;
        }
        this.f29043f = handlerContext2;
    }

    /* renamed from: x0 */
    public static final void m46094x0(HandlerContext handlerContext, Runnable runnable) {
        handlerContext.f29040c.removeCallbacks(runnable);
    }

    @C12579k
    /* renamed from: C */
    public C11962g1 mo23705C(long j, @C12579k Runnable runnable, @C12579k CoroutineContext coroutineContext) {
        if (this.f29040c.postDelayed(runnable, C11479u.m44316C(j, 4611686018427387903L))) {
            return new C11710c(this, runnable);
        }
        mo23710n0(coroutineContext, runnable);
        return C12081p2.f29727a;
    }

    /* renamed from: O */
    public void mo23563O(@C12579k CoroutineContext coroutineContext, @C12579k Runnable runnable) {
        if (!this.f29040c.post(runnable)) {
            mo23710n0(coroutineContext, runnable);
        }
    }

    /* renamed from: U */
    public boolean mo23565U(@C12579k CoroutineContext coroutineContext) {
        return !this.f29042e || !Intrinsics.areEqual((Object) Looper.myLooper(), (Object) this.f29040c.getLooper());
    }

    public boolean equals(@C12580l Object obj) {
        return (obj instanceof HandlerContext) && ((HandlerContext) obj).f29040c == this.f29040c;
    }

    public int hashCode() {
        return System.identityHashCode(this.f29040c);
    }

    /* renamed from: n0 */
    public final void mo23710n0(CoroutineContext coroutineContext, Runnable runnable) {
        C11804f2.m46958f(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C11768d1.m46781c().mo23563O(coroutineContext, runnable);
    }

    /* renamed from: p */
    public void mo23711p(long j, @C12579k C12072o<? super C11079d2> oVar) {
        C11707a aVar = new C11707a(oVar, this);
        if (this.f29040c.postDelayed(aVar, C11479u.m44316C(j, 4611686018427387903L))) {
            oVar.mo24529C(new HandlerContext$scheduleResumeAfterDelay$1(this, aVar));
        } else {
            mo23710n0(oVar.getContext(), aVar);
        }
    }

    @C12579k
    /* renamed from: t0 */
    public HandlerContext mo23707c0() {
        return this.f29043f;
    }

    @C12579k
    public String toString() {
        String b0 = mo24519b0();
        if (b0 != null) {
            return b0;
        }
        String str = this.f29041d;
        if (str == null) {
            str = this.f29040c.toString();
        }
        if (!this.f29042e) {
            return str;
        }
        return str + ".immediate";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerContext(Handler handler, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public HandlerContext(@C12579k Handler handler, @C12580l String str) {
        this(handler, str, false);
    }
}
