package com.carrefour.fid.android.account.domain.interactors.user;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.domain.interactors.account.C37518d;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.account.domain.interactors.user.f */
public final class C13277f implements C37518d {

    /* renamed from: b */
    public static final int f32658b = 8;
    @C12579k

    /* renamed from: a */
    public final LoginRepository f32659a;

    @Inject
    public C13277f(@C12579k LoginRepository loginRepository) {
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        this.f32659a = loginRepository;
    }

    @C12579k
    public String invoke() {
        return this.f32659a.mo31352d();
    }
}
