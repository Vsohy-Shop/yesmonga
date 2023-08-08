package com.carrefour.fid.android.account.data.datasource;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.entities.AuthStateResponse;
import com.carrefour.fid.android.account.data.entities.LoginResponse;
import com.carrefour.fid.android.account.data.entities.extentions.C13185h;
import com.carrefour.fid.android.shared.p046io.OneAppApiException;
import com.carrefour.fid.android.shared.util.C28951s;
import com.google.gson.C33614e;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C10864b0;
import kotlin.C11677z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Singleton
@C8567o(parameters = 0)
public final class LocalLoginDataSource {
    @C12579k

    /* renamed from: d */
    public static final C13172a f32334d = new C13172a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f32335e = 8;
    @C12579k

    /* renamed from: f */
    public static final String f32336f = "AccountDao";
    @C12579k

    /* renamed from: a */
    public Context f32337a;
    @C12579k

    /* renamed from: b */
    public final C33614e f32338b;
    @C12579k

    /* renamed from: c */
    public final C11677z f32339c = C10864b0.m38748c(new LocalLoginDataSource$mAccountPreferences$2(this));

    /* renamed from: com.carrefour.fid.android.account.data.datasource.LocalLoginDataSource$a */
    public static final class C13172a {
        public /* synthetic */ C13172a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C13172a() {
        }
    }

    @Inject
    public LocalLoginDataSource(@C10255b @C12579k Context context, @C12579k C33614e eVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(eVar, "gson");
        this.f32337a = context;
        this.f32338b = eVar;
    }

    /* renamed from: g */
    public static /* synthetic */ AuthStateResponse m57098g(LocalLoginDataSource localLoginDataSource, LoginResponse loginResponse, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return localLoginDataSource.mo31137f(loginResponse, z);
    }

    /* renamed from: b */
    public final void mo31133b() {
        SharedPreferences.Editor clear;
        SharedPreferences.Editor edit = mo31134c().edit();
        if (edit == null || (clear = edit.clear()) == null) {
            throw new OneAppApiException(OneAppApiException.OneAppApiExceptionCode.ServiceInitError);
        }
        clear.commit();
    }

    /* renamed from: c */
    public final SharedPreferences mo31134c() {
        Object value = this.f32339c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-mAccountPreferences>(...)");
        return (SharedPreferences) value;
    }

    @C12579k
    /* renamed from: d */
    public final String mo31135d() {
        C28951s sVar = C28951s.f70964a;
        String string = mo31134c().getString("refresh_token", new String());
        if (string == null) {
            string = "";
        }
        String b = sVar.mo84276b(string);
        return b == null ? "" : b;
    }

    @C12580l
    /* renamed from: e */
    public final AuthStateResponse mo31136e() {
        if (!mo31134c().contains(f32336f)) {
            return null;
        }
        try {
            C33614e eVar = this.f32338b;
            String string = mo31134c().getString(f32336f, new String());
            if (string == null) {
                string = "";
            }
            return (AuthStateResponse) eVar.mo97479n(string, AuthStateResponse.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @C12579k
    /* renamed from: f */
    public final AuthStateResponse mo31137f(@C12579k LoginResponse loginResponse, boolean z) {
        Intrinsics.checkNotNullParameter(loginResponse, "loginResponse");
        SharedPreferences.Editor edit = mo31134c().edit();
        AuthStateResponse a = C13185h.m57153a(loginResponse, this.f32337a, z);
        edit.putString(f32336f, this.f32338b.mo97491z(a));
        if (z) {
            edit.putString("refresh_token", C28951s.f70964a.mo84278d(this.f32337a, loginResponse.getRefreshToken()));
        }
        edit.apply();
        return a;
    }
}
