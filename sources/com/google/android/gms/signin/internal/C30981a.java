package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.C40424b;
import com.google.android.gms.common.C40864j;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.common.internal.C40747e;
import com.google.android.gms.common.internal.C40756f;
import com.google.android.gms.common.internal.C40769i;
import com.google.android.gms.common.internal.C40785m;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.C30979f;

@C40473a
/* renamed from: com.google.android.gms.signin.internal.a */
public class C30981a extends C40769i<C30986f> implements C30979f {

    /* renamed from: U */
    public static final /* synthetic */ int f74225U = 0;

    /* renamed from: Q */
    public final boolean f74226Q = true;

    /* renamed from: R */
    public final C40756f f74227R;

    /* renamed from: S */
    public final Bundle f74228S;
    @C0363p0

    /* renamed from: T */
    public final Integer f74229T;

    public C30981a(@C0359n0 Context context, @C0359n0 Looper looper, boolean z, @C0359n0 C40756f fVar, @C0359n0 Bundle bundle, @C0359n0 C40507i.C40509b bVar, @C0359n0 C40507i.C40510c cVar) {
        super(context, looper, 44, fVar, bVar, cVar);
        this.f74227R = fVar;
        this.f74228S = bundle;
        this.f74229T = fVar.mo134391l();
    }

    @C40473a
    @C0359n0
    /* renamed from: u0 */
    public static Bundle m124389u0(@C0359n0 C40756f fVar) {
        fVar.mo134390k();
        Integer l = fVar.mo134391l();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", fVar.mo134381b());
        if (l != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", l.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @C0359n0
    /* renamed from: A */
    public final /* synthetic */ IInterface mo87436A(@C0359n0 IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof C30986f) {
            return (C30986f) queryLocalInterface;
        }
        return new C30986f(iBinder);
    }

    @C0359n0
    /* renamed from: I */
    public final Bundle mo87659I() {
        if (!mo134335G().getPackageName().equals(this.f74227R.mo134387h())) {
            this.f74228S.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f74227R.mo134387h());
        }
        return this.f74228S;
    }

    @C0359n0
    /* renamed from: N */
    public final String mo87437N() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @C0359n0
    /* renamed from: O */
    public final String mo87438O() {
        return "com.google.android.gms.signin.service.START";
    }

    /* renamed from: i */
    public final void mo87655i() {
        try {
            ((C30986f) mo134340M()).mo87665E8(((Integer) C40843u.m166202l(this.f74229T)).intValue());
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: k */
    public final void mo87656k() {
        mo134361h(new C40747e.C40751d());
    }

    /* renamed from: m */
    public final boolean mo87660m() {
        return this.f74226Q;
    }

    /* renamed from: s */
    public final void mo87657s(C30985e eVar) {
        GoogleSignInAccount googleSignInAccount;
        C40843u.m166203m(eVar, "Expecting a valid ISignInCallbacks");
        try {
            Account d = this.f74227R.mo134383d();
            if ("<<default account>>".equals(d.name)) {
                googleSignInAccount = C40424b.m164572b(mo134335G()).mo133511c();
            } else {
                googleSignInAccount = null;
            }
            ((C30986f) mo134340M()).mo87667G8(new zai(1, new zat(d, ((Integer) C40843u.m166202l(this.f74229T)).intValue(), googleSignInAccount)), eVar);
        } catch (RemoteException e) {
            try {
                eVar.mo87663O1(new zak(1, new ConnectionResult(8, (PendingIntent) null), (zav) null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    /* renamed from: t */
    public final int mo87439t() {
        return C40864j.f103985a;
    }

    /* renamed from: v */
    public final void mo87658v(@C0359n0 C40785m mVar, boolean z) {
        try {
            ((C30986f) mo134340M()).mo87666F8(mVar, ((Integer) C40843u.m166202l(this.f74229T)).intValue(), z);
        } catch (RemoteException unused) {
        }
    }
}
