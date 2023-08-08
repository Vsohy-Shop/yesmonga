package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.C0344h1;
import kotlin.C11395k;
import kotlin.C11661u0;
import kotlin.DeprecationLevel;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11314h;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C12072o;
import kotlinx.coroutines.C12078p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nHandlerDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 Runnable.kt\nkotlinx/coroutines/RunnableKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,217:1\n314#2,11:218\n314#2,9:229\n323#2,2:239\n17#3:238\n1#4:241\n*S KotlinDebug\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n*L\n189#1:218,11\n197#1:229,9\n197#1:239,2\n201#1:238\n*E\n"})
/* renamed from: kotlinx.coroutines.android.f */
public final class C11713f {

    /* renamed from: a */
    public static final long f29049a = 4611686018427387903L;
    @C12580l
    @C11287e

    /* renamed from: b */
    public static final C11711d f29050b;
    @C12580l
    private static volatile Choreographer choreographer;

    @C11363r0({"SMAP\nRunnable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Runnable.kt\nkotlinx/coroutines/RunnableKt$Runnable$1\n+ 2 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n*L\n1#1,18:1\n202#2,2:19\n*E\n"})
    /* renamed from: kotlinx.coroutines.android.f$a */
    public static final class C11714a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C12072o f29051a;

        public C11714a(C12072o oVar) {
            this.f29051a = oVar;
        }

        public final void run() {
            C11713f.m46125n(this.f29051a);
        }
    }

    static {
        Object obj;
        C11711d dVar = null;
        try {
            Result.C10852a aVar = Result.f28060a;
            obj = Result.m38702b(new HandlerContext(m46116e(Looper.getMainLooper(), true), (String) null, 2, (DefaultConstructorMarker) null));
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            obj = Result.m38702b(C11661u0.m45734a(th));
        }
        if (!Result.m38709i(obj)) {
            dVar = obj;
        }
        f29050b = dVar;
    }

    @C0344h1
    @C12579k
    /* renamed from: e */
    public static final Handler m46116e(@C12579k Looper looper, boolean z) {
        if (!z) {
            return new Handler(looper);
        }
        Class<Looper> cls = Looper.class;
        Class<Handler> cls2 = Handler.class;
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = cls2.getDeclaredMethod("createAsync", new Class[]{cls}).invoke((Object) null, new Object[]{looper});
            Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return cls2.getDeclaredConstructor(new Class[]{cls, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    @C12580l
    /* renamed from: f */
    public static final Object m46117f(@C12579k C11045c<? super Long> cVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            return m46118g(cVar);
        }
        C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
        pVar.mo24537e0();
        m46123l(choreographer2, pVar);
        Object y = pVar.mo24572y();
        if (y == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        return y;
    }

    /* renamed from: g */
    public static final Object m46118g(C11045c<? super Long> cVar) {
        C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
        pVar.mo24537e0();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m46125n(pVar);
        } else {
            C11768d1.m46783e().mo23563O(pVar.getContext(), new C11714a(pVar));
        }
        Object y = pVar.mo24572y();
        if (y == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        return y;
    }

    @C11314h(name = "from")
    @C12579k
    @C11315i
    /* renamed from: h */
    public static final C11711d m46119h(@C12579k Handler handler) {
        return m46121j(handler, (String) null, 1, (Object) null);
    }

    @C11314h(name = "from")
    @C12579k
    @C11315i
    /* renamed from: i */
    public static final C11711d m46120i(@C12579k Handler handler, @C12580l String str) {
        return new HandlerContext(handler, str);
    }

    /* renamed from: j */
    public static /* synthetic */ C11711d m46121j(Handler handler, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return m46120i(handler, str);
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "Use Dispatchers.Main instead")
    /* renamed from: k */
    public static /* synthetic */ void m46122k() {
    }

    /* renamed from: l */
    public static final void m46123l(Choreographer choreographer2, C12072o<? super Long> oVar) {
        choreographer2.postFrameCallback(new C11712e(oVar));
    }

    /* renamed from: m */
    public static final void m46124m(C12072o oVar, long j) {
        oVar.mo24534b0(C11768d1.m46783e(), Long.valueOf(j));
    }

    /* renamed from: n */
    public static final void m46125n(C12072o<? super Long> oVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            Intrinsics.checkNotNull(choreographer2);
            choreographer = choreographer2;
        }
        m46123l(choreographer2, oVar);
    }
}
