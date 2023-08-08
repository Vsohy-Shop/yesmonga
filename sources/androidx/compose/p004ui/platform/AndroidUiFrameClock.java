package androidx.compose.p004ui.platform;

import android.view.Choreographer;
import androidx.compose.runtime.C8686v0;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.C11047d;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12072o;
import kotlinx.coroutines.C12078p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nAndroidUiFrameClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiFrameClock.android.kt\nandroidx/compose/ui/platform/AndroidUiFrameClock\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,53:1\n314#2,11:54\n*S KotlinDebug\n*F\n+ 1 AndroidUiFrameClock.android.kt\nandroidx/compose/ui/platform/AndroidUiFrameClock\n*L\n31#1:54,11\n*E\n"})
/* renamed from: androidx.compose.ui.platform.AndroidUiFrameClock */
public final class AndroidUiFrameClock implements C8686v0 {

    /* renamed from: b */
    public static final int f39306b = 8;
    @C12579k

    /* renamed from: a */
    public final Choreographer f39307a;

    @C11363r0({"SMAP\nAndroidUiFrameClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiFrameClock.android.kt\nandroidx/compose/ui/platform/AndroidUiFrameClock$withFrameNanos$2$callback$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1#2:54\n*E\n"})
    /* renamed from: androidx.compose.ui.platform.AndroidUiFrameClock$a */
    public static final class C15796a implements Choreographer.FrameCallback {

        /* renamed from: a */
        public final /* synthetic */ C12072o<R> f39308a;

        /* renamed from: b */
        public final /* synthetic */ AndroidUiFrameClock f39309b;

        /* renamed from: c */
        public final /* synthetic */ C11300l<Long, R> f39310c;

        public C15796a(C12072o<? super R> oVar, AndroidUiFrameClock androidUiFrameClock, C11300l<? super Long, ? extends R> lVar) {
            this.f39308a = oVar;
            this.f39309b = androidUiFrameClock;
            this.f39310c = lVar;
        }

        public final void doFrame(long j) {
            Object obj;
            C12072o<R> oVar = this.f39308a;
            C11300l<Long, R> lVar = this.f39310c;
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

    public AndroidUiFrameClock(@C12579k Choreographer choreographer) {
        Intrinsics.checkNotNullParameter(choreographer, "choreographer");
        this.f39307a = choreographer;
    }

    @C12580l
    /* renamed from: B */
    public <R> Object mo14872B(@C12579k C11300l<? super Long, ? extends R> lVar, @C12579k C11045c<? super R> cVar) {
        AndroidUiDispatcher androidUiDispatcher;
        CoroutineContext.C11040a b = cVar.getContext().mo7444b(C11047d.f28247u0);
        if (b instanceof AndroidUiDispatcher) {
            androidUiDispatcher = (AndroidUiDispatcher) b;
        } else {
            androidUiDispatcher = null;
        }
        C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
        pVar.mo24537e0();
        C15796a aVar = new C15796a(pVar, this, lVar);
        if (androidUiDispatcher == null || !Intrinsics.areEqual((Object) androidUiDispatcher.mo45487A0(), (Object) mo45502e())) {
            mo45502e().postFrameCallback(aVar);
            pVar.mo24529C(new AndroidUiFrameClock$withFrameNanos$2$2(this, aVar));
        } else {
            androidUiDispatcher.mo45492H0(aVar);
            pVar.mo24529C(new AndroidUiFrameClock$withFrameNanos$2$1(androidUiDispatcher, aVar));
        }
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
    /* renamed from: e */
    public final Choreographer mo45502e() {
        return this.f39307a;
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
