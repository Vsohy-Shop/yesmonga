package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.gtm.C41535r0;
import com.google.android.gms.internal.gtm.C41587t4;
import com.google.android.gms.internal.gtm.C41607u0;
import java.util.HashMap;

/* renamed from: com.google.android.gms.analytics.e0 */
public final class C40380e0 extends C41535r0 {

    /* renamed from: c */
    public boolean f102927c;

    /* renamed from: d */
    public int f102928d;

    /* renamed from: e */
    public long f102929e = -1;

    /* renamed from: f */
    public boolean f102930f;

    /* renamed from: g */
    public long f102931g;

    /* renamed from: v */
    public final /* synthetic */ C40397i f102932v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40380e0(C40397i iVar, C41607u0 u0Var) {
        super(u0Var);
        this.f102932v = iVar;
    }

    /* renamed from: W */
    public final void mo133294W() {
    }

    /* renamed from: X */
    public final void mo133295X(Activity activity) {
        String str;
        if (this.f102928d == 0 && mo135748j().mo134770c() >= this.f102931g + Math.max(1000, this.f102929e)) {
            this.f102930f = true;
        }
        this.f102928d++;
        if (this.f102927c) {
            Intent intent = activity.getIntent();
            if (intent != null) {
                this.f102932v.mo133413q0(intent.getData());
            }
            HashMap hashMap = new HashMap();
            hashMap.put("&t", C28526d.f68840N0);
            C40397i iVar = this.f102932v;
            if (iVar.f102963w != null) {
                C41587t4 D1 = this.f102932v.f102963w;
                str = activity.getClass().getCanonicalName();
                String str2 = D1.f104978g.get(str);
                if (str2 != null) {
                    str = str2;
                }
            } else {
                str = activity.getClass().getCanonicalName();
            }
            iVar.mo133407d0("&cd", str);
            if (TextUtils.isEmpty((CharSequence) hashMap.get("&dr"))) {
                C40843u.m166202l(activity);
                Intent intent2 = activity.getIntent();
                String str3 = null;
                if (intent2 != null) {
                    String stringExtra = intent2.getStringExtra("android.intent.extra.REFERRER_NAME");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        str3 = stringExtra;
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    hashMap.put("&dr", str3);
                }
            }
            this.f102932v.mo133406c0(hashMap);
        }
    }

    /* renamed from: Z */
    public final void mo133296Z(Activity activity) {
        int i = this.f102928d - 1;
        this.f102928d = i;
        int max = Math.max(0, i);
        this.f102928d = max;
        if (max == 0) {
            this.f102931g = mo135748j().mo134770c();
        }
    }

    /* renamed from: a0 */
    public final void mo133297a0(boolean z) {
        this.f102927c = z;
        mo133300d0();
    }

    /* renamed from: b0 */
    public final void mo133298b0(long j) {
        this.f102929e = j;
        mo133300d0();
    }

    /* renamed from: c0 */
    public final synchronized boolean mo133299c0() {
        boolean z;
        z = this.f102930f;
        this.f102930f = false;
        return z;
    }

    /* renamed from: d0 */
    public final void mo133300d0() {
        if (this.f102929e >= 0 || this.f102927c) {
            mo135735I().mo133275A(this.f102932v.f102961g);
        } else {
            mo135735I().mo133276B(this.f102932v.f102961g);
        }
    }
}
