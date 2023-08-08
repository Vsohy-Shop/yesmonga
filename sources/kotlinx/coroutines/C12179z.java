package kotlinx.coroutines;

import kotlin.Result;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCompletableDeferred.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompletableDeferred.kt\nkotlinx/coroutines/CompletableDeferredKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
/* renamed from: kotlinx.coroutines.z */
public final class C12179z {
    @C12579k
    /* renamed from: a */
    public static final <T> C12169x<T> m48759a(T t) {
        C12175y yVar = new C12175y((C11723c2) null);
        yVar.mo24789G(t);
        return yVar;
    }

    @C12579k
    /* renamed from: b */
    public static final <T> C12169x<T> m48760b(@C12580l C11723c2 c2Var) {
        return new C12175y(c2Var);
    }

    /* renamed from: c */
    public static /* synthetic */ C12169x m48761c(C11723c2 c2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            c2Var = null;
        }
        return m48760b(c2Var);
    }

    /* renamed from: d */
    public static final <T> boolean m48762d(@C12579k C12169x<T> xVar, @C12579k Object obj) {
        Throwable e = Result.m38705e(obj);
        return e == null ? xVar.mo24789G(obj) : xVar.mo24790i(e);
    }
}
