package kotlinx.coroutines;

import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCompletionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompletionState.kt\nkotlinx/coroutines/CompletionStateKt\n+ 2 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,67:1\n61#2,2:68\n61#2,2:70\n*S KotlinDebug\n*F\n+ 1 CompletionState.kt\nkotlinx/coroutines/CompletionStateKt\n*L\n21#1:68,2\n27#1:70,2\n*E\n"})
/* renamed from: kotlinx.coroutines.h0 */
public final class C11966h0 {
    @C12579k
    /* renamed from: a */
    public static final <T> Object m47674a(@C12580l Object obj, @C12579k C11045c<? super T> cVar) {
        if (obj instanceof C11721c0) {
            Result.C10852a aVar = Result.f28060a;
            return Result.m38702b(C11661u0.m45734a(((C11721c0) obj).f29065a));
        }
        Result.C10852a aVar2 = Result.f28060a;
        return Result.m38702b(obj);
    }

    @C12580l
    /* renamed from: b */
    public static final <T> Object m47675b(@C12579k Object obj, @C12580l C11300l<? super Throwable, C11079d2> lVar) {
        Throwable e = Result.m38705e(obj);
        if (e != null) {
            return new C11721c0(e, false, 2, (DefaultConstructorMarker) null);
        }
        if (lVar != null) {
            return new C11767d0(obj, lVar);
        }
        return obj;
    }

    @C12580l
    /* renamed from: c */
    public static final <T> Object m47676c(@C12579k Object obj, @C12579k C12072o<?> oVar) {
        Throwable e = Result.m38705e(obj);
        if (e == null) {
            return obj;
        }
        return new C11721c0(e, false, 2, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ Object m47677d(Object obj, C11300l lVar, int i, Object obj2) {
        if ((i & 1) != 0) {
            lVar = null;
        }
        return m47675b(obj, lVar);
    }
}
