package com.carrefour.fid.android.account.data.entities.extentions;

import android.content.Context;
import androidx.core.app.C17239t;
import com.carrefour.fid.android.account.data.entities.AuthStateResponse;
import com.carrefour.fid.android.account.data.entities.LoginResponse;
import com.carrefour.fid.android.shared.util.C28951s;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.account.data.entities.extentions.h */
public final class C13185h {
    @C12579k
    /* renamed from: a */
    public static final AuthStateResponse m57153a(@C12579k LoginResponse loginResponse, @C12579k Context context, boolean z) {
        boolean z2;
        String str;
        Intrinsics.checkNotNullParameter(loginResponse, "<this>");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        AuthStateResponse authStateResponse = new AuthStateResponse((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (Long) null, (String) null, C17239t.f45525u, (DefaultConstructorMarker) null);
        C28951s sVar = C28951s.f70964a;
        authStateResponse.setAccessToken(sVar.mo84278d(context, loginResponse.getAccessToken()));
        if (z) {
            authStateResponse.setRefreshToken(sVar.mo84278d(context, loginResponse.getRefreshToken()));
        }
        authStateResponse.setScope(loginResponse.getScope());
        authStateResponse.setUidIam(sVar.mo84278d(context, C13190l.m57170b(loginResponse.getIdToken()).getUidIam()));
        String uidLocal = C13190l.m57170b(loginResponse.getIdToken()).getUidLocal();
        if (uidLocal.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            str = sVar.mo84278d(context, uidLocal);
        } else {
            str = new String();
        }
        authStateResponse.setUidLocal(str);
        authStateResponse.setIdToken(loginResponse.getIdToken());
        authStateResponse.setLastModification(Long.valueOf(Long.parseLong(C13190l.m57169a(loginResponse.getIdToken()))));
        authStateResponse.setExpiresIn(String.valueOf(loginResponse.getExpiresIn()));
        authStateResponse.setAccessTokenExpirationTime(Long.valueOf(System.currentTimeMillis() + (loginResponse.getExpiresIn() * ((long) 1000))));
        return authStateResponse;
    }
}
