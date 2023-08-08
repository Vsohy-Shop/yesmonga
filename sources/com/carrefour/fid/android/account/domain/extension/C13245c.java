package com.carrefour.fid.android.account.domain.extension;

import com.carrefour.fid.android.account.data.entities.AuthStateResponse;
import com.carrefour.fid.android.account.domain.models.LoginDomain;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.account.domain.extension.c */
public final class C13245c {
    @C12579k
    /* renamed from: a */
    public static final LoginDomain m57383a(@C12579k AuthStateResponse authStateResponse) {
        Intrinsics.checkNotNullParameter(authStateResponse, "<this>");
        return new LoginDomain(authStateResponse.getAccessToken(), authStateResponse.getRefreshToken(), authStateResponse.getScope(), authStateResponse.getIdToken(), authStateResponse.getUidIam(), authStateResponse.getAccessTokenExpirationTime(), authStateResponse.getLastModification(), authStateResponse.getExpiresIn());
    }
}
