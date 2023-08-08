package androidx.compose.runtime;

import android.view.Choreographer;
import androidx.compose.runtime.C8686v0;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C11965h;
import kotlinx.coroutines.C12072o;
import kotlinx.coroutines.C12078p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nActualAndroid.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActualAndroid.android.kt\nandroidx/compose/runtime/DefaultChoreographerFrameClock\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,99:1\n314#2,11:100\n*S KotlinDebug\n*F\n+ 1 ActualAndroid.android.kt\nandroidx/compose/runtime/DefaultChoreographerFrameClock\n*L\n64#1:100,11\n*E\n"})
public final class DefaultChoreographerFrameClock implements C8686v0 {
    @C12579k

    /* renamed from: a */
    public static final DefaultChoreographerFrameClock f22659a = new DefaultChoreographerFrameClock();

    /* renamed from: b */
    public static final Choreographer f22660b = ((Choreographer) C11965h.m47671f(C11768d1.m46783e().mo23706a0(), new DefaultChoreographerFrameClock$choreographer$1((C11045c<? super DefaultChoreographerFrameClock$choreographer$1>) null)));

    @C11363r0({"SMAP\nActualAndroid.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActualAndroid.android.kt\nandroidx/compose/runtime/DefaultChoreographerFrameClock$withFrameNanos$2$callback$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"})
    /* renamed from: androidx.compose.runtime.DefaultChoreographerFrameClock$a */
    public static final class C8386a implements Choreographer.FrameCallback {

        /* renamed from: a */
        public final /* synthetic */ C12072o<R> f22661a;

        /* renamed from: b */
        public final /* synthetic */ C11300l<Long, R> f22662b;

        public C8386a(C12072o<? super R> oVar, C11300l<? super Long, ? extends R> lVar) {
            this.f22661a = oVar;
            this.f22662b = lVar;
        }

        public final void doFrame(long j) {
            Object obj;
            C12072o<R> oVar = this.f22661a;
            DefaultChoreographerFrameClock defaultChoreographerFrameClock = DefaultChoreographerFrameClock.f22659a;
            C11300l<Long, R> lVar = this.f22662b;
            try {
                Result.C10852a aVar = Result.f28060a;
                obj = Result.m38702b(lVar.invoke(Long.valueOf(j)));
            } catch (Throwable th) {
                Result.C10852a aVar2 = Result.f28060a;
                obj = Result.m38702b(C11661u0.m45734a(th));
            }
            oVar.resumeWith(obj);
        }
    }

    @C12580l
    /* renamed from: B */
    public <R> Object mo14872B(@C12579k C11300l<? super Long, ? extends R> lVar, @C12579k C11045c<? super R> cVar) {
        C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
        pVar.mo24537e0();
        C8386a aVar = new C8386a(pVar, lVar);
        f22660b.postFrameCallback(aVar);
        pVar.mo24529C(new DefaultChoreographerFrameClock$withFrameNanos$2$1(aVar));
        Object y = pVar.mo24572y();
        if (y == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        return y;
    }

    @C12579k
    /* renamed from: Q */
    public CoroutineContext mo7443Q(@C12579k CoroutineContext coroutineContext) {
        return C8686v0.C8687a.m31921e(this, coroutineContext);
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
}
