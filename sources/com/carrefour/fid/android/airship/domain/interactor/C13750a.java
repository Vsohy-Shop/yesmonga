package com.carrefour.fid.android.airship.domain.interactor;

import com.carrefour.fid.android.domain.interactors.airship.C37544a;
import com.carrefour.fid.android.shared.p046io.PrivacyThrowable;
import com.urbanairship.UAirship;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11064a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.airship.domain.interactor.a */
public final class C13750a implements C37544a {
    @C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    public Object m172748invokeIoAF18A(@C12579k C11045c<? super Result<Boolean>> cVar) {
        if (UAirship.m146188Y().mo106203E().mo19423h0()) {
            Result.C10852a aVar = Result.f28060a;
            return Result.m38702b(C11064a.m42615a(true));
        }
        Result.C10852a aVar2 = Result.f28060a;
        return Result.m38702b(C11661u0.m45734a(new PrivacyThrowable()));
    }
}
