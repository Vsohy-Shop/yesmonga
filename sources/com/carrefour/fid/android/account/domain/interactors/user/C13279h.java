package com.carrefour.fid.android.account.domain.interactors.user;

import com.carrefour.fid.android.account.data.entities.AuthStateResponse;
import com.carrefour.fid.android.account.data.entities.extentions.C13181d;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.domain.interactors.user.C37886i;
import com.carrefour.fid.android.shared.p046io.RequireSignInThrowable;
import javax.inject.Inject;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.account.domain.interactors.user.h */
public final class C13279h implements C37886i {
    @C12579k

    /* renamed from: a */
    public final LoginRepository f32661a;

    @Inject
    public C13279h(@C12579k LoginRepository loginRepository) {
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        this.f32661a = loginRepository;
    }

    @C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    public Object m172745invokeIoAF18A(@C12579k C11045c<? super Result<C11079d2>> cVar) {
        AuthStateResponse f = this.f32661a.mo31354f();
        boolean z = false;
        if (f != null && C13181d.m57146e(f)) {
            z = true;
        }
        if (z) {
            Result.C10852a aVar = Result.f28060a;
            return Result.m38702b(C11079d2.f28267a);
        }
        Result.C10852a aVar2 = Result.f28060a;
        return Result.m38702b(C11661u0.m45734a(new RequireSignInThrowable()));
    }
}
