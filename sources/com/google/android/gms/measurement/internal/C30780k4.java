package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import androidx.annotation.C0348i1;
import com.google.android.gms.ads.identifier.C40365a;
import com.google.android.gms.common.internal.C40843u;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: com.google.android.gms.measurement.internal.k4 */
public final class C30780k4 extends C30654a6 {

    /* renamed from: y */
    public static final Pair f73646y = new Pair("", 0L);

    /* renamed from: c */
    public SharedPreferences f73647c;

    /* renamed from: d */
    public C30756i4 f73648d;

    /* renamed from: e */
    public final C30730g4 f73649e = new C30730g4(this, "first_open_time", 0);

    /* renamed from: f */
    public final C30730g4 f73650f = new C30730g4(this, "app_install_time", 0);

    /* renamed from: g */
    public final C30768j4 f73651g = new C30768j4(this, "app_instance_id", (String) null);

    /* renamed from: h */
    public String f73652h;

    /* renamed from: i */
    public boolean f73653i;

    /* renamed from: j */
    public long f73654j;

    /* renamed from: k */
    public final C30730g4 f73655k = new C30730g4(this, "session_timeout", 1800000);

    /* renamed from: l */
    public final C30704e4 f73656l = new C30704e4(this, "start_new_session", true);

    /* renamed from: m */
    public final C30768j4 f73657m = new C30768j4(this, "non_personalized_ads", (String) null);

    /* renamed from: n */
    public final C30704e4 f73658n = new C30704e4(this, "allow_remote_dynamite", false);

    /* renamed from: o */
    public final C30730g4 f73659o = new C30730g4(this, "last_pause_time", 0);

    /* renamed from: p */
    public final C30730g4 f73660p = new C30730g4(this, "session_id", 0);

    /* renamed from: q */
    public boolean f73661q;

    /* renamed from: r */
    public final C30704e4 f73662r = new C30704e4(this, "app_backgrounded", false);

    /* renamed from: s */
    public final C30704e4 f73663s = new C30704e4(this, "deep_link_retrieval_complete", false);

    /* renamed from: t */
    public final C30730g4 f73664t = new C30730g4(this, "deep_link_retrieval_attempts", 0);

    /* renamed from: u */
    public final C30768j4 f73665u = new C30768j4(this, "firebase_feature_rollouts", (String) null);

    /* renamed from: v */
    public final C30768j4 f73666v = new C30768j4(this, "deferred_attribution_cache", (String) null);

    /* renamed from: w */
    public final C30730g4 f73667w = new C30730g4(this, "deferred_attribution_cache_timestamp", 0);

    /* renamed from: x */
    public final C30717f4 f73668x = new C30717f4(this, "default_event_parameters", (Bundle) null);

    public C30780k4(C30731g5 g5Var) {
        super(g5Var);
    }

    @C0348i1
    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    /* renamed from: i */
    public final void mo86871i() {
        SharedPreferences sharedPreferences = this.f74136a.mo86902c().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f73647c = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.f73661q = z;
        if (!z) {
            SharedPreferences.Editor edit = this.f73647c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f74136a.mo87130z();
        this.f73648d = new C30756i4(this, "health_monitor", Math.max(0, ((Long) C30742h3.f73529e.mo87094a((Object) null)).longValue()), (C30743h4) null);
    }

    /* renamed from: j */
    public final boolean mo86872j() {
        return true;
    }

    @C0348i1
    /* renamed from: o */
    public final SharedPreferences mo87191o() {
        mo86866h();
        mo86873k();
        C40843u.m166202l(this.f73647c);
        return this.f73647c;
    }

    @C0348i1
    /* renamed from: p */
    public final Pair mo87192p(String str) {
        mo86866h();
        long c = this.f74136a.mo86900a().mo134770c();
        String str2 = this.f73652h;
        if (str2 != null && c < this.f73654j) {
            return new Pair(str2, Boolean.valueOf(this.f73653i));
        }
        this.f73654j = c + this.f74136a.mo87130z().mo87085r(str, C30742h3.f73525c);
        C40365a.m164198d(true);
        try {
            C40365a.C40366a a = C40365a.m164196a(this.f74136a.mo86902c());
            this.f73652h = "";
            String a2 = a.mo133250a();
            if (a2 != null) {
                this.f73652h = a2;
            }
            this.f73653i = a.mo133251b();
        } catch (Exception e) {
            this.f74136a.mo86903d().mo87488q().mo87464b("Unable to get advertising id", e);
            this.f73652h = "";
        }
        C40365a.m164198d(false);
        return new Pair(this.f73652h, Boolean.valueOf(this.f73653i));
    }

    @C0348i1
    /* renamed from: q */
    public final C30738h mo87193q() {
        mo86866h();
        return C30738h.m123795b(mo87191o().getString("consent_settings", "G1"));
    }

    @C0348i1
    /* renamed from: r */
    public final Boolean mo87194r() {
        mo86866h();
        if (mo87191o().contains("measurement_enabled")) {
            return Boolean.valueOf(mo87191o().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    @C0348i1
    /* renamed from: s */
    public final void mo87195s(Boolean bool) {
        mo86866h();
        SharedPreferences.Editor edit = mo87191o().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    @C0348i1
    /* renamed from: t */
    public final void mo87196t(boolean z) {
        mo86866h();
        this.f74136a.mo86903d().mo87493v().mo87464b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = mo87191o().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    @C0348i1
    /* renamed from: u */
    public final boolean mo87197u() {
        SharedPreferences sharedPreferences = this.f73647c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* renamed from: v */
    public final boolean mo87198v(long j) {
        if (j - this.f73655k.mo87096a() > this.f73659o.mo87096a()) {
            return true;
        }
        return false;
    }

    @C0348i1
    /* renamed from: w */
    public final boolean mo87199w(int i) {
        return C30738h.m123797j(i, mo87191o().getInt("consent_source", 100));
    }
}
