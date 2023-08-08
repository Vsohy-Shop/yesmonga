package com.carrefour.fid.android.utils;

import kotlin.C11661u0;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import retrofit2.C13091w;

/* renamed from: com.carrefour.fid.android.utils.m */
public final class C22718m {
    @C12579k
    /* renamed from: a */
    public static final <T> Object m102884a(@C12579k C13091w<T> wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        T a = wVar.mo30572a();
        if (!wVar.mo30576g() || a == null) {
            Result.C10852a aVar = Result.f28060a;
            return Result.m38702b(C11661u0.m45734a(new RetrofitException(wVar.mo30573b(), wVar.mo30574e())));
        }
        Result.C10852a aVar2 = Result.f28060a;
        return Result.m38702b(a);
    }
}
