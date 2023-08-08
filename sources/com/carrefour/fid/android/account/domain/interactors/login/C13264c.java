package com.carrefour.fid.android.account.domain.interactors.login;

import com.carrefour.fid.android.account.data.entities.extentions.C13181d;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.domain.interactors.account.C37519e;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAccountIsUserLoggedInUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountIsUserLoggedInUseCase.kt\ncom/carrefour/fid/android/account/domain/interactors/login/AccountIsUserLoggedInUseCase\n+ 2 Result.kt\ncom/carrefour/fid/android/shared/extension/ResultKt\n*L\n1#1,14:1\n3#2:15\n*S KotlinDebug\n*F\n+ 1 AccountIsUserLoggedInUseCase.kt\ncom/carrefour/fid/android/account/domain/interactors/login/AccountIsUserLoggedInUseCase\n*L\n12#1:15\n*E\n"})
/* renamed from: com.carrefour.fid.android.account.domain.interactors.login.c */
public final class C13264c implements C37519e {
    @C12579k

    /* renamed from: a */
    public final LoginRepository f32623a;

    @Inject
    public C13264c(@C12579k LoginRepository loginRepository) {
        Intrinsics.checkNotNullParameter(loginRepository, "repository");
        this.f32623a = loginRepository;
    }

    @C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    public Object m172736invokeIoAF18A(@C12579k C11045c<? super Result<Boolean>> cVar) {
        Boolean a = C11064a.m42615a(C13181d.m57146e(this.f32623a.mo31354f()));
        Result.C10852a aVar = Result.f28060a;
        return Result.m38702b(a);
    }
}
