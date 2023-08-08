package com.carrefour.fid.android.account.domain.interactors.account;

import com.carrefour.fid.android.account.data.extension.C13195a;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.domain.interactors.account.C37516b;
import javax.inject.Inject;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.account.domain.interactors.account.c */
public final class C13248c implements C37516b {
    @C12579k

    /* renamed from: a */
    public final LoginRepository f32587a;

    @Inject
    public C13248c(@C12579k LoginRepository loginRepository) {
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        this.f32587a = loginRepository;
    }

    @C12580l
    /* renamed from: a */
    public Object mo31420a(@C12579k C11045c<? super Boolean> cVar) {
        return C11064a.m42615a(C13195a.m57177a(this.f32587a));
    }
}
