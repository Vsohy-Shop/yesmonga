package kotlin;

import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.Result;
import kotlin.internal.C11110f;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Result.kt\nkotlin/ResultKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,340:1\n1#2:341\n*E\n"})
/* renamed from: kotlin.u0 */
public final class C11661u0 {
    @C11665v0(version = "1.3")
    @C12579k
    @C11532s0
    /* renamed from: a */
    public static final Object m45734a(@C12579k Throwable th) {
        Intrinsics.checkNotNullParameter(th, "exception");
        return new Result.Failure(th);
    }

    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: b */
    public static final <R, T> R m45735b(Object obj, C11300l<? super T, ? extends R> lVar, C11300l<? super Throwable, ? extends R> lVar2) {
        Intrinsics.checkNotNullParameter(lVar, "onSuccess");
        Intrinsics.checkNotNullParameter(lVar2, "onFailure");
        Throwable e = Result.m38705e(obj);
        if (e == null) {
            return lVar.invoke(obj);
        }
        return lVar2.invoke(e);
    }

    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: c */
    public static final <R, T extends R> R m45736c(Object obj, R r) {
        return Result.m38709i(obj) ? r : obj;
    }

    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: d */
    public static final <R, T extends R> R m45737d(Object obj, C11300l<? super Throwable, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "onFailure");
        Throwable e = Result.m38705e(obj);
        if (e == null) {
            return obj;
        }
        return lVar.invoke(e);
    }

    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: e */
    public static final <T> T m45738e(Object obj) {
        m45747n(obj);
        return obj;
    }

    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: f */
    public static final <R, T> Object m45739f(Object obj, C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "transform");
        if (!Result.m38710j(obj)) {
            return Result.m38702b(obj);
        }
        Result.C10852a aVar = Result.f28060a;
        return Result.m38702b(lVar.invoke(obj));
    }

    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: g */
    public static final <R, T> Object m45740g(Object obj, C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "transform");
        if (!Result.m38710j(obj)) {
            return Result.m38702b(obj);
        }
        try {
            Result.C10852a aVar = Result.f28060a;
            return Result.m38702b(lVar.invoke(obj));
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            return Result.m38702b(m45734a(th));
        }
    }

    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: h */
    public static final <T> Object m45741h(Object obj, C11300l<? super Throwable, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "action");
        Throwable e = Result.m38705e(obj);
        if (e != null) {
            lVar.invoke(e);
        }
        return obj;
    }

    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: i */
    public static final <T> Object m45742i(Object obj, C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "action");
        if (Result.m38710j(obj)) {
            lVar.invoke(obj);
        }
        return obj;
    }

    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: j */
    public static final <R, T extends R> Object m45743j(Object obj, C11300l<? super Throwable, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "transform");
        Throwable e = Result.m38705e(obj);
        if (e == null) {
            return obj;
        }
        Result.C10852a aVar = Result.f28060a;
        return Result.m38702b(lVar.invoke(e));
    }

    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: k */
    public static final <R, T extends R> Object m45744k(Object obj, C11300l<? super Throwable, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "transform");
        Throwable e = Result.m38705e(obj);
        if (e == null) {
            return obj;
        }
        try {
            Result.C10852a aVar = Result.f28060a;
            return Result.m38702b(lVar.invoke(e));
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            return Result.m38702b(m45734a(th));
        }
    }

    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: l */
    public static final <T, R> Object m45745l(T t, C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        try {
            Result.C10852a aVar = Result.f28060a;
            return Result.m38702b(lVar.invoke(t));
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            return Result.m38702b(m45734a(th));
        }
    }

    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: m */
    public static final <R> Object m45746m(C11289a<? extends R> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        try {
            Result.C10852a aVar2 = Result.f28060a;
            return Result.m38702b(aVar.invoke());
        } catch (Throwable th) {
            Result.C10852a aVar3 = Result.f28060a;
            return Result.m38702b(m45734a(th));
        }
    }

    @C11665v0(version = "1.3")
    @C11532s0
    /* renamed from: n */
    public static final void m45747n(@C12579k Object obj) {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
    }
}
