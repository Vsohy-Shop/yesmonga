package kotlin.coroutines.intrinsics;

import kotlin.C11079d2;
import kotlin.C11665v0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.internal.C11110f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11370u0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,204:1\n165#1,4:205\n186#1:209\n165#1,4:210\n186#1:214\n*S KotlinDebug\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n91#1:205,4\n91#1:209\n126#1:210,4\n126#1:214\n*E\n"})
public class IntrinsicsKt__IntrinsicsJvmKt {
    @C11665v0(version = "1.3")
    /* renamed from: a */
    public static final <T> C11045c<C11079d2> m42605a(C11045c<? super T> cVar, C11300l<? super C11045c<? super T>, ? extends Object> lVar) {
        CoroutineContext context = cVar.getContext();
        if (context == EmptyCoroutineContext.f28243a) {
            return new C11060x96e8297a(cVar, lVar);
        }
        return new C11061x96e8297b(cVar, context, lVar);
    }

    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: b */
    public static final <T> C11045c<C11079d2> m42606b(@C12579k C11300l<? super C11045c<? super T>, ? extends Object> lVar, @C12579k C11045c<? super T> cVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(cVar, "completion");
        C11045c<? super T> a = C11069f.m42636a(cVar);
        if (lVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) lVar).create(a);
        }
        CoroutineContext context = a.getContext();
        if (context == EmptyCoroutineContext.f28243a) {
            return new C11056xa50de660(a, lVar);
        }
        return new C11057xa50de661(a, context, lVar);
    }

    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: c */
    public static final <R, T> C11045c<C11079d2> m42607c(@C12579k C11304p<? super R, ? super C11045c<? super T>, ? extends Object> pVar, R r, @C12579k C11045c<? super T> cVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(cVar, "completion");
        C11045c<? super T> a = C11069f.m42636a(cVar);
        if (pVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) pVar).create(r, a);
        }
        CoroutineContext context = a.getContext();
        if (context == EmptyCoroutineContext.f28243a) {
            return new C11058xa50de662(a, pVar, r);
        }
        return new C11059xa50de663(a, context, pVar, r);
    }

    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: d */
    public static final <T> C11045c<T> m42608d(@C12579k C11045c<? super T> cVar) {
        ContinuationImpl continuationImpl;
        C11045c<Object> intercepted;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (cVar instanceof ContinuationImpl) {
            continuationImpl = (ContinuationImpl) cVar;
        } else {
            continuationImpl = null;
        }
        if (continuationImpl == null || (intercepted = continuationImpl.intercepted()) == null) {
            return cVar;
        }
        return intercepted;
    }

    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: e */
    public static final <T> Object m42609e(C11300l<? super C11045c<? super T>, ? extends Object> lVar, C11045c<? super T> cVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(cVar, "completion");
        return ((C11300l) C11370u0.m43701q(lVar, 1)).invoke(cVar);
    }

    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: f */
    public static final <R, T> Object m42610f(C11304p<? super R, ? super C11045c<? super T>, ? extends Object> pVar, R r, C11045c<? super T> cVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(cVar, "completion");
        return ((C11304p) C11370u0.m43701q(pVar, 2)).invoke(r, cVar);
    }

    @C11110f
    /* renamed from: g */
    public static final <R, P, T> Object m42611g(C11305q<? super R, ? super P, ? super C11045c<? super T>, ? extends Object> qVar, R r, P p, C11045c<? super T> cVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Intrinsics.checkNotNullParameter(cVar, "completion");
        return ((C11305q) C11370u0.m43701q(qVar, 3)).invoke(r, p, cVar);
    }
}
