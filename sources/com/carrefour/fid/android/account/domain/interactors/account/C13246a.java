package com.carrefour.fid.android.account.domain.interactors.account;

import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.domain.interactors.account.C37517c;
import com.carrefour.fid.android.domain.models.account.AccountInfo;
import javax.inject.Inject;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.account.domain.interactors.account.a */
public final class C13246a implements C37517c {
    @C12579k

    /* renamed from: a */
    public final AccountRepository f32585a;

    @Inject
    public C13246a(@C12579k AccountRepository accountRepository) {
        Intrinsics.checkNotNullParameter(accountRepository, "accountRepository");
        this.f32585a = accountRepository;
    }

    @C12580l
    /* renamed from: a */
    public Object mo31418a(@C12579k C11045c<? super AccountInfo> cVar) {
        return this.f32585a.mo31329n(cVar);
    }
}
