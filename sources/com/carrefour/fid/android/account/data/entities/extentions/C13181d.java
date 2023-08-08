package com.carrefour.fid.android.account.data.entities.extentions;

import com.carrefour.fid.android.account.data.entities.AuthStateResponse;
import java.util.Calendar;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAuthStateResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthStateResponse.kt\ncom/carrefour/fid/android/account/data/entities/extentions/AuthStateResponseKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n1#2:30\n*E\n"})
/* renamed from: com.carrefour.fid.android.account.data.entities.extentions.d */
public final class C13181d {
    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r0.getExpiresIn();
     */
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m57142a(@org.jetbrains.annotations.C12580l com.carrefour.fid.android.account.data.entities.AuthStateResponse r0) {
        /*
            if (r0 == 0) goto L_0x0008
            java.lang.String r0 = r0.getExpiresIn()
            if (r0 != 0) goto L_0x000a
        L_0x0008:
            java.lang.String r0 = "1399"
        L_0x000a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.data.entities.extentions.C13181d.m57142a(com.carrefour.fid.android.account.data.entities.AuthStateResponse):java.lang.String");
    }

    @C12579k
    /* renamed from: b */
    public static final String m57143b(@C12580l AuthStateResponse authStateResponse) {
        String idToken = authStateResponse != null ? authStateResponse.getIdToken() : null;
        return idToken == null ? "" : idToken;
    }

    /* renamed from: c */
    public static final long m57144c(@C12580l AuthStateResponse authStateResponse) {
        Long lastModification;
        if (authStateResponse == null || (lastModification = authStateResponse.getLastModification()) == null) {
            return 0;
        }
        return lastModification.longValue();
    }

    /* renamed from: d */
    public static final long m57145d(@C12580l AuthStateResponse authStateResponse) {
        Long accessTokenExpirationTime;
        if (authStateResponse == null || (accessTokenExpirationTime = authStateResponse.getAccessTokenExpirationTime()) == null) {
            return 0;
        }
        return accessTokenExpirationTime.longValue();
    }

    /* renamed from: e */
    public static final boolean m57146e(@C12580l AuthStateResponse authStateResponse) {
        boolean z;
        boolean z2;
        boolean z3;
        if (authStateResponse == null) {
            return false;
        }
        if (authStateResponse.getAccessToken().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (authStateResponse.getUidIam().length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (authStateResponse.getIdToken().length() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static final boolean m57147f(@C12580l AuthStateResponse authStateResponse) {
        if (!m57146e(authStateResponse) || m57145d(authStateResponse) - Calendar.getInstance().getTimeInMillis() >= 35000) {
            return false;
        }
        return true;
    }
}
