package com.android.volley.toolbox;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.C0344h1;
import androidx.preference.C19965r;
import com.android.volley.AuthFailureError;

@SuppressLint({"MissingPermission"})
/* renamed from: com.android.volley.toolbox.b */
public class C21784b implements C21791d {

    /* renamed from: a */
    public final AccountManager f56359a;

    /* renamed from: b */
    public final Account f56360b;

    /* renamed from: c */
    public final String f56361c;

    /* renamed from: d */
    public final boolean f56362d;

    public C21784b(Context context, Account account, String str) {
        this(context, account, str, false);
    }

    /* renamed from: a */
    public void mo64982a(String str) {
        this.f56359a.invalidateAuthToken(this.f56360b.type, str);
    }

    /* renamed from: b */
    public String mo64983b() throws AuthFailureError {
        String str;
        AccountManagerFuture<Bundle> authToken = this.f56359a.getAuthToken(this.f56360b, this.f56361c, this.f56362d, (AccountManagerCallback) null, (Handler) null);
        try {
            Bundle result = authToken.getResult();
            if (!authToken.isDone() || authToken.isCancelled()) {
                str = null;
            } else if (!result.containsKey(C19965r.f51092g)) {
                str = result.getString("authtoken");
            } else {
                throw new AuthFailureError((Intent) result.getParcelable(C19965r.f51092g));
            }
            if (str != null) {
                return str;
            }
            throw new AuthFailureError("Got null auth token for type: " + this.f56361c);
        } catch (Exception e) {
            throw new AuthFailureError("Error while retrieving auth token", e);
        }
    }

    /* renamed from: c */
    public Account mo64984c() {
        return this.f56360b;
    }

    /* renamed from: d */
    public String mo64985d() {
        return this.f56361c;
    }

    public C21784b(Context context, Account account, String str, boolean z) {
        this(AccountManager.get(context), account, str, z);
    }

    @C0344h1
    public C21784b(AccountManager accountManager, Account account, String str, boolean z) {
        this.f56359a = accountManager;
        this.f56360b = account;
        this.f56361c = str;
        this.f56362d = z;
    }
}
