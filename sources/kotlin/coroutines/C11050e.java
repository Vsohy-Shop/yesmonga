package kotlin.coroutines;

import com.urbanairship.iam.events.C9175a;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.C11665v0;
import kotlin.NotImplementedError;
import kotlin.Result;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.internal.C11110f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.coroutines.e */
public final class C11050e {

    @C11363r0({"SMAP\nContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Continuation.kt\nkotlin/coroutines/ContinuationKt$Continuation$1\n*L\n1#1,161:1\n*E\n"})
    /* renamed from: kotlin.coroutines.e$a */
    public static final class C11051a implements C11045c<T> {

        /* renamed from: a */
        public final /* synthetic */ CoroutineContext f28249a;

        /* renamed from: b */
        public final /* synthetic */ C11300l<Result<? extends T>, C11079d2> f28250b;

        public C11051a(CoroutineContext coroutineContext, C11300l<? super Result<? extends T>, C11079d2> lVar) {
            this.f28249a = coroutineContext;
            this.f28250b = lVar;
        }

        @C12579k
        public CoroutineContext getContext() {
            return this.f28249a;
        }

        public void resumeWith(@C12579k Object obj) {
            this.f28250b.invoke(Result.m38701a(obj));
        }
    }

    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: a */
    public static final <T> C11045c<T> m42590a(CoroutineContext coroutineContext, C11300l<? super Result<? extends T>, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(coroutineContext, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(lVar, "resumeWith");
        return new C11051a(coroutineContext, lVar);
    }

    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: b */
    public static final <T> C11045c<C11079d2> m42591b(@C12579k C11300l<? super C11045c<? super T>, ? extends Object> lVar, @C12579k C11045c<? super T> cVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(cVar, "completion");
        return new C11054h(IntrinsicsKt__IntrinsicsJvmKt.m42608d(IntrinsicsKt__IntrinsicsJvmKt.m42606b(lVar, cVar)), C11063b.m42612h());
    }

    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: c */
    public static final <R, T> C11045c<C11079d2> m42592c(@C12579k C11304p<? super R, ? super C11045c<? super T>, ? extends Object> pVar, R r, @C12579k C11045c<? super T> cVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(cVar, "completion");
        return new C11054h(IntrinsicsKt__IntrinsicsJvmKt.m42608d(IntrinsicsKt__IntrinsicsJvmKt.m42607c(pVar, r, cVar)), C11063b.m42612h());
    }

    /* renamed from: d */
    public static final CoroutineContext m42593d() {
        throw new NotImplementedError("Implemented as intrinsic");
    }

    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: e */
    public static /* synthetic */ void m42594e() {
    }

    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: f */
    public static final <T> void m42595f(C11045c<? super T> cVar, T t) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Result.C10852a aVar = Result.f28060a;
        cVar.resumeWith(Result.m38702b(t));
    }

    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: g */
    public static final <T> void m42596g(C11045c<? super T> cVar, Throwable th) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(th, "exception");
        Result.C10852a aVar = Result.f28060a;
        cVar.resumeWith(Result.m38702b(C11661u0.m45734a(th)));
    }

    @C11665v0(version = "1.3")
    /* renamed from: h */
    public static final <T> void m42597h(@C12579k C11300l<? super C11045c<? super T>, ? extends Object> lVar, @C12579k C11045c<? super T> cVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(cVar, "completion");
        C11045c<C11079d2> d = IntrinsicsKt__IntrinsicsJvmKt.m42608d(IntrinsicsKt__IntrinsicsJvmKt.m42606b(lVar, cVar));
        Result.C10852a aVar = Result.f28060a;
        d.resumeWith(Result.m38702b(C11079d2.f28267a));
    }

    @C11665v0(version = "1.3")
    /* renamed from: i */
    public static final <R, T> void m42598i(@C12579k C11304p<? super R, ? super C11045c<? super T>, ? extends Object> pVar, R r, @C12579k C11045c<? super T> cVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(cVar, "completion");
        C11045c<C11079d2> d = IntrinsicsKt__IntrinsicsJvmKt.m42608d(IntrinsicsKt__IntrinsicsJvmKt.m42607c(pVar, r, cVar));
        Result.C10852a aVar = Result.f28060a;
        d.resumeWith(Result.m38702b(C11079d2.f28267a));
    }

    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: j */
    public static final <T> Object m42599j(C11300l<? super C11045c<? super T>, C11079d2> lVar, C11045c<? super T> cVar) {
        C11322b0.m43482e(0);
        C11054h hVar = new C11054h(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar));
        lVar.invoke(hVar);
        Object a = hVar.mo22492a();
        if (a == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        C11322b0.m43482e(1);
        return a;
    }
}
