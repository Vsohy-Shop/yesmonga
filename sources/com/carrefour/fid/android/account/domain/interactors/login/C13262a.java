package com.carrefour.fid.android.account.domain.interactors.login;

import android.util.Base64;
import com.carrefour.fid.android.account.data.entities.AuthStateResponse;
import com.carrefour.fid.android.account.data.entities.UserInfoDecoded;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.domain.interactors.C37678e;
import com.carrefour.fid.android.domain.interactors.login.C37693a;
import com.google.gson.C33614e;
import javax.inject.Inject;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11602d;
import kotlin.text.C11622t;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.account.domain.interactors.login.a */
public final class C13262a implements C37678e<String>, C37693a {
    @C12579k

    /* renamed from: a */
    public final LoginRepository f32621a;

    @Inject
    public C13262a(@C12579k LoginRepository loginRepository) {
        Intrinsics.checkNotNullParameter(loginRepository, "repository");
        this.f32621a = loginRepository;
    }

    /* renamed from: a */
    public final String mo31475a(String str) {
        byte[] decode = Base64.decode(StringsKt__StringsKt.padEnd(str, ((str.length() + 3) / 4) * 4, '='), 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(padded, Base64.DEFAULT)");
        return new String(decode, C11602d.f28868b);
    }

    @C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    public Object m172735invokeIoAF18A(@C12579k C11045c<? super Result<String>> cVar) {
        String str;
        boolean z;
        AuthStateResponse f = this.f32621a.mo31354f();
        UserInfoDecoded userInfoDecoded = null;
        if (f != null) {
            str = f.getIdToken();
        } else {
            str = null;
        }
        boolean z2 = false;
        if (str == null || C11622t.isBlank(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Result.C10852a aVar = Result.f28060a;
            return Result.m38702b(C11661u0.m45734a(new Throwable("Error getting User ID from cache!")));
        }
        String str2 = (String) CollectionsKt___CollectionsKt.m40559R2(StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"."}, false, 0, 6, (Object) null), 1);
        if (str2 == null) {
            Result.C10852a aVar2 = Result.f28060a;
            return Result.m38702b(C11661u0.m45734a(new Throwable("Error parsing idToken")));
        }
        try {
            userInfoDecoded = (UserInfoDecoded) new C33614e().mo97479n(mo31475a(str2), UserInfoDecoded.class);
        } catch (Exception unused) {
        }
        if (userInfoDecoded != null) {
            String sub = userInfoDecoded.getSub();
            if (sub == null || C11622t.isBlank(sub)) {
                z2 = true;
            }
            if (!z2) {
                Result.C10852a aVar3 = Result.f28060a;
                return Result.m38702b(userInfoDecoded.getSub());
            }
        }
        Result.C10852a aVar4 = Result.f28060a;
        return Result.m38702b(C11661u0.m45734a(new Throwable("Error parsing decoded User info")));
    }
}
