package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.C0348i1;
import androidx.preference.C19965r;
import com.google.firebase.messaging.C33180f;
import com.google.firebase.messaging.FirebaseMessaging;

/* renamed from: com.google.android.gms.measurement.internal.ab */
public final class C30659ab {

    /* renamed from: a */
    public final C30731g5 f73231a;

    public C30659ab(C30731g5 g5Var) {
        this.f73231a = g5Var;
    }

    @C0348i1
    /* renamed from: a */
    public final void mo86882a(String str, Bundle bundle) {
        String str2;
        this.f73231a.mo86904f().mo86866h();
        if (!this.f73231a.mo87123o()) {
            if (bundle.isEmpty()) {
                str2 = null;
            } else {
                if (true == str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String next : bundle.keySet()) {
                    builder.appendQueryParameter(next, bundle.getString(next));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f73231a.mo87103F().f73666v.mo87180b(str2);
                this.f73231a.mo87103F().f73667w.mo87097b(this.f73231a.mo86900a().mo134768a());
            }
        }
    }

    @C0348i1
    /* renamed from: b */
    public final void mo86883b() {
        String str;
        this.f73231a.mo86904f().mo86866h();
        if (mo86885d()) {
            if (mo86886e()) {
                this.f73231a.mo87103F().f73666v.mo87180b((String) null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", C19965r.f51092g);
                bundle.putLong("_cc", 1);
                this.f73231a.mo87105I().mo87334u("auto", "_cmpx", bundle);
            } else {
                String a = this.f73231a.mo87103F().f73666v.mo87179a();
                if (TextUtils.isEmpty(a)) {
                    this.f73231a.mo86903d().mo87491t().mo87463a("Cache still valid but referrer not found");
                } else {
                    long a2 = this.f73231a.mo87103F().f73667w.mo87096a() / 3600000;
                    Uri parse = Uri.parse(a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String next : parse.getQueryParameterNames()) {
                        bundle2.putString(next, parse.getQueryParameter(next));
                    }
                    ((Bundle) pair.second).putLong("_cc", (a2 - 1) * 3600000);
                    Object obj = pair.first;
                    if (obj == null) {
                        str = FirebaseMessaging.f80405r;
                    } else {
                        str = (String) obj;
                    }
                    this.f73231a.mo87105I().mo87334u(str, C33180f.C33186f.f80639l, (Bundle) pair.second);
                }
                this.f73231a.mo87103F().f73666v.mo87180b((String) null);
            }
            this.f73231a.mo87103F().f73667w.mo87097b(0);
        }
    }

    /* renamed from: c */
    public final void mo86884c() {
        if (mo86885d() && mo86886e()) {
            this.f73231a.mo87103F().f73666v.mo87180b((String) null);
        }
    }

    /* renamed from: d */
    public final boolean mo86885d() {
        return this.f73231a.mo87103F().f73667w.mo87096a() > 0;
    }

    /* renamed from: e */
    public final boolean mo86886e() {
        if (mo86885d() && this.f73231a.mo86900a().mo134768a() - this.f73231a.mo87103F().f73667w.mo87096a() > this.f73231a.mo87130z().mo87085r((String) null, C30742h3.f73515U)) {
            return true;
        }
        return false;
    }
}
