package kotlinx.coroutines.selects;

import kotlin.C11079d2;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11370u0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nOnTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnTimeout.kt\nkotlinx/coroutines/selects/OnTimeout\n+ 2 Runnable.kt\nkotlinx/coroutines/RunnableKt\n*L\n1#1,66:1\n17#2:67\n*S KotlinDebug\n*F\n+ 1 OnTimeout.kt\nkotlinx/coroutines/selects/OnTimeout\n*L\n56#1:67\n*E\n"})
public final class OnTimeout {

    /* renamed from: a */
    public final long f29845a;

    @C11363r0({"SMAP\nRunnable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Runnable.kt\nkotlinx/coroutines/RunnableKt$Runnable$1\n+ 2 OnTimeout.kt\nkotlinx/coroutines/selects/OnTimeout\n*L\n1#1,18:1\n57#2,2:19\n*E\n"})
    /* renamed from: kotlinx.coroutines.selects.OnTimeout$a */
    public static final class C12118a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C12131j f29846a;

        /* renamed from: b */
        public final /* synthetic */ OnTimeout f29847b;

        public C12118a(C12131j jVar, OnTimeout onTimeout) {
            this.f29846a = jVar;
            this.f29847b = onTimeout;
        }

        public final void run() {
            this.f29846a.mo24711h(this.f29847b, C11079d2.f28267a);
        }
    }

    public OnTimeout(long j) {
        this.f29845a = j;
    }

    /* renamed from: c */
    public static /* synthetic */ void m48449c() {
    }

    @C12579k
    /* renamed from: b */
    public final C12124c mo24686b() {
        OnTimeout$selectClause$1 onTimeout$selectClause$1 = OnTimeout$selectClause$1.f29848a;
        Intrinsics.checkNotNull(onTimeout$selectClause$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        return new C12125d(this, (C11305q) C11370u0.m43701q(onTimeout$selectClause$1, 3), (C11305q) null, 4, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public final void mo24687d(C12131j<?> jVar, Object obj) {
        if (this.f29845a <= 0) {
            jVar.mo24707e(C11079d2.f28267a);
            return;
        }
        C12118a aVar = new C12118a(jVar, this);
        Intrinsics.checkNotNull(jVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        SelectImplementation selectImplementation = (SelectImplementation) jVar;
        CoroutineContext context = jVar.getContext();
        jVar.mo24708f(DelayKt.m45927d(context).mo23705C(this.f29845a, aVar, context));
    }
}
