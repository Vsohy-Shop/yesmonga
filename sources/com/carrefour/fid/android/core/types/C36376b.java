package com.carrefour.fid.android.core.types;

import com.carrefour.fid.android.core.types.C36371a;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11314h(name = "ResultLKt")
@C11363r0({"SMAP\nResultL.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResultL.kt\ncom/carrefour/fid/android/core/types/ResultLKt\n+ 2 ResultL.kt\ncom/carrefour/fid/android/core/types/ResultL$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,295:1\n112#1,2:299\n114#1,2:302\n112#1,2:306\n114#1,2:309\n85#2:296\n90#2:297\n85#2:298\n85#2:301\n90#2:304\n85#2:305\n85#2:308\n90#2:311\n85#2:313\n90#2:314\n1#3:312\n*S KotlinDebug\n*F\n+ 1 ResultL.kt\ncom/carrefour/fid/android/core/types/ResultLKt\n*L\n214#1:299,2\n214#1:302,2\n245#1:306,2\n245#1:309,2\n113#1:296\n115#1:297\n197#1:298\n214#1:301\n214#1:304\n230#1:305\n245#1:308\n245#1:311\n282#1:313\n280#1:314\n*E\n"})
/* renamed from: com.carrefour.fid.android.core.types.b */
public final class C36376b {
    @C12579k

    /* renamed from: a */
    public static final Throwable f89977a = new Throwable("No value available: Loading");

    /* renamed from: a */
    public static final <R, T> R m149205a(@C12579k C36371a<? extends T> aVar, @C12579k C11300l<? super T, ? extends R> lVar, @C12579k C11300l<? super Throwable, ? extends R> lVar2, @C12579k C11289a<? extends R> aVar2) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "onSuccess");
        Intrinsics.checkNotNullParameter(lVar2, "onFailure");
        Intrinsics.checkNotNullParameter(aVar2, "onLoading");
        if (aVar instanceof C36371a.C36373b) {
            return lVar2.invoke(((C36371a.C36373b) aVar).mo108626i());
        }
        if (aVar instanceof C36371a.C36374c) {
            return aVar2.invoke();
        }
        if (aVar instanceof C36371a.C36375d) {
            return lVar.invoke(((C36371a.C36375d) aVar).mo108633i());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public static final <R, T extends R> R m149206b(@C12579k C36371a<? extends T> aVar, R r) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if ((aVar instanceof C36371a.C36373b) || (aVar instanceof C36371a.C36374c)) {
            return r;
        }
        if (aVar instanceof C36371a.C36375d) {
            return ((C36371a.C36375d) aVar).mo108633i();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: c */
    public static final <R, T extends R> R m149207c(@C12579k C36371a<? extends T> aVar, @C12579k C11300l<? super Throwable, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "onFailure");
        if (aVar instanceof C36371a.C36373b) {
            return lVar.invoke(((C36371a.C36373b) aVar).mo108626i());
        }
        if (aVar instanceof C36371a.C36374c) {
            return lVar.invoke(f89977a);
        }
        if (aVar instanceof C36371a.C36375d) {
            return ((C36371a.C36375d) aVar).mo108633i();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: d */
    public static final <T> T m149208d(@C12579k C36371a<? extends T> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar instanceof C36371a.C36373b) {
            throw ((C36371a.C36373b) aVar).mo108626i();
        } else if (aVar instanceof C36371a.C36374c) {
            throw f89977a;
        } else if (aVar instanceof C36371a.C36375d) {
            return ((C36371a.C36375d) aVar).mo108633i();
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @C12579k
    /* renamed from: e */
    public static final <R, T> C36371a<R> m149209e(@C12579k C36371a<? extends T> aVar, @C12579k C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        if (aVar instanceof C36371a.C36373b) {
            return aVar;
        }
        if (aVar instanceof C36371a.C36375d) {
            C36371a.C36372a aVar2 = C36371a.f89974a;
            return new C36371a.C36375d(lVar.invoke(((C36371a.C36375d) aVar).mo108633i()));
        } else if (aVar instanceof C36371a.C36374c) {
            return aVar;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @C12579k
    /* renamed from: f */
    public static final <R, T> C36371a<R> m149210f(@C12579k C36371a<? extends T> aVar, @C12579k C11300l<? super T, ? extends R> lVar) {
        C36371a<R> bVar;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        if (aVar instanceof C36371a.C36373b) {
            bVar = new C36371a.C36373b(((C36371a.C36373b) aVar).mo108626i());
        } else if (aVar instanceof C36371a.C36375d) {
            try {
                C36371a.C36372a aVar2 = C36371a.f89974a;
                bVar = new C36371a.C36375d<>(lVar.invoke(((C36371a.C36375d) aVar).mo108633i()));
            } catch (Throwable th) {
                C36371a.C36372a aVar3 = C36371a.f89974a;
                bVar = new C36371a.C36373b(th);
            }
        } else if (aVar instanceof C36371a.C36374c) {
            return aVar;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return bVar;
    }

    @C12579k
    /* renamed from: g */
    public static final <T> C36371a<T> m149211g(@C12579k C36371a<? extends T> aVar, @C12579k C11300l<? super Throwable, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        Throwable a = aVar.mo108614a();
        if (a != null) {
            lVar.invoke(a);
        }
        return aVar;
    }

    @C12579k
    /* renamed from: h */
    public static final <T> C36371a<T> m149212h(@C12579k C36371a<? extends T> aVar, @C12579k C11289a<C11079d2> aVar2) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(aVar2, "action");
        if (aVar instanceof C36371a.C36374c) {
            aVar2.invoke();
        }
        return aVar;
    }

    @C12579k
    /* renamed from: i */
    public static final <T> C36371a<T> m149213i(@C12579k C36371a<? extends T> aVar, @C12579k C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        if (aVar instanceof C36371a.C36375d) {
            lVar.invoke(((C36371a.C36375d) aVar).mo108633i());
        }
        return aVar;
    }

    @C12579k
    /* renamed from: j */
    public static final <R, T extends R> C36371a<R> m149214j(@C12579k C36371a<? extends T> aVar, @C12579k C11300l<? super Throwable, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        Throwable a = aVar.mo108614a();
        if (a == null) {
            return aVar;
        }
        C36371a.C36372a aVar2 = C36371a.f89974a;
        return new C36371a.C36375d(lVar.invoke(a));
    }

    @C12579k
    /* renamed from: k */
    public static final <R, T extends R> C36371a<R> m149215k(@C12579k C36371a<? extends T> aVar, @C12579k C11300l<? super Throwable, ? extends R> lVar) {
        C36371a<R> aVar2;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        Throwable a = aVar.mo108614a();
        if (a == null) {
            return aVar;
        }
        try {
            C36371a.C36372a aVar3 = C36371a.f89974a;
            aVar2 = new C36371a.C36375d<>(lVar.invoke(a));
        } catch (Throwable th) {
            C36371a.C36372a aVar4 = C36371a.f89974a;
            aVar2 = new C36371a.C36373b(th);
        }
        return aVar2;
    }

    @C12579k
    /* renamed from: l */
    public static final <T, R> C36371a<R> m149216l(T t, @C12579k C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        try {
            C36371a.C36372a aVar = C36371a.f89974a;
            return new C36371a.C36375d(lVar.invoke(t));
        } catch (Throwable th) {
            C36371a.C36372a aVar2 = C36371a.f89974a;
            return new C36371a.C36373b(th);
        }
    }

    /* renamed from: m */
    public static final void m149217m(@C12579k C36371a<?> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar instanceof C36371a.C36373b) {
            throw ((C36371a.C36373b) aVar).mo108626i();
        } else if (aVar instanceof C36371a.C36374c) {
            throw f89977a;
        }
    }

    @C12580l
    /* renamed from: n */
    public static final <T> Result<T> m149218n(@C12579k C36371a<? extends T> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar instanceof C36371a.C36374c) {
            return null;
        }
        if (aVar instanceof C36371a.C36375d) {
            Result.C10852a aVar2 = Result.f28060a;
            return Result.m38701a(Result.m38702b(((C36371a.C36375d) aVar).mo108633i()));
        } else if (aVar instanceof C36371a.C36373b) {
            Result.C10852a aVar3 = Result.f28060a;
            return Result.m38701a(Result.m38702b(C11661u0.m45734a(((C36371a.C36373b) aVar).mo108626i())));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @C12579k
    /* renamed from: o */
    public static final <T> C36371a<T> m149219o(@C12579k Object obj) {
        Throwable e = Result.m38705e(obj);
        if (e == null) {
            C36371a.C36372a aVar = C36371a.f89974a;
            return new C36371a.C36375d(obj);
        }
        C36371a.C36372a aVar2 = C36371a.f89974a;
        return new C36371a.C36373b(e);
    }
}
