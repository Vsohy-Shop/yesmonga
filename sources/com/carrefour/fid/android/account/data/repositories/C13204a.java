package com.carrefour.fid.android.account.data.repositories;

import com.carrefour.fid.android.account.data.entities.AuthStateResponse;
import com.carrefour.fid.android.shared.data.headers.C28642c;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.account.data.repositories.a */
public final class C13204a implements C28642c {
    @C12579k

    /* renamed from: a */
    public final LoginRepository f32384a;

    @Inject
    public C13204a(@C12579k LoginRepository loginRepository) {
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        this.f32384a = loginRepository;
    }

    @C12579k
    /* renamed from: a */
    public String mo31358a() {
        return this.f32384a.mo31350b();
    }

    @C12579k
    /* renamed from: b */
    public String mo31359b() {
        return this.f32384a.mo31352d();
    }

    @C12579k
    /* renamed from: c */
    public String mo31360c() {
        AuthStateResponse f = this.f32384a.mo31354f();
        String idToken = f != null ? f.getIdToken() : null;
        return idToken == null ? "" : idToken;
    }
}
