package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Handler;
import androidx.annotation.C0348i1;
import androidx.core.content.C17318d;
import com.google.android.gms.common.internal.C40733b;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.measurement.internal.p */
public final class C30835p extends C30654a6 {

    /* renamed from: c */
    public long f73837c;

    /* renamed from: d */
    public String f73838d;

    /* renamed from: e */
    public AccountManager f73839e;

    /* renamed from: f */
    public Boolean f73840f;

    /* renamed from: g */
    public long f73841g;

    public C30835p(C30731g5 g5Var) {
        super(g5Var);
    }

    /* renamed from: j */
    public final boolean mo86872j() {
        Calendar instance = Calendar.getInstance();
        this.f73837c = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f73838d = lowerCase + "-" + lowerCase2;
        return false;
    }

    @C0348i1
    /* renamed from: o */
    public final long mo87402o() {
        mo86866h();
        return this.f73841g;
    }

    /* renamed from: p */
    public final long mo87403p() {
        mo86873k();
        return this.f73837c;
    }

    /* renamed from: q */
    public final String mo87404q() {
        mo86873k();
        return this.f73838d;
    }

    @C0348i1
    /* renamed from: r */
    public final void mo87405r() {
        mo86866h();
        this.f73840f = null;
        this.f73841g = 0;
    }

    @C0348i1
    /* renamed from: s */
    public final boolean mo87406s() {
        mo86866h();
        long a = this.f74136a.mo86900a().mo134768a();
        if (a - this.f73841g > 86400000) {
            this.f73840f = null;
        }
        Boolean bool = this.f73840f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (C17318d.m79718a(this.f74136a.mo86902c(), "android.permission.GET_ACCOUNTS") != 0) {
            this.f74136a.mo86903d().mo87496y().mo87463a("Permission error checking for dasher/unicorn accounts");
            this.f73841g = a;
            this.f73840f = Boolean.FALSE;
            return false;
        }
        if (this.f73839e == null) {
            this.f73839e = AccountManager.get(this.f74136a.mo86902c());
        }
        try {
            Account[] result = this.f73839e.getAccountsByTypeAndFeatures(C40733b.f103787a, new String[]{"service_HOSTED"}, (AccountManagerCallback) null, (Handler) null).getResult();
            if (result == null || result.length <= 0) {
                Account[] result2 = this.f73839e.getAccountsByTypeAndFeatures(C40733b.f103787a, new String[]{"service_uca"}, (AccountManagerCallback) null, (Handler) null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.f73840f = Boolean.TRUE;
                    this.f73841g = a;
                    return true;
                }
                this.f73841g = a;
                this.f73840f = Boolean.FALSE;
                return false;
            }
            this.f73840f = Boolean.TRUE;
            this.f73841g = a;
            return true;
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            this.f74136a.mo86903d().mo87491t().mo87464b("Exception checking account types", e);
        }
    }
}
