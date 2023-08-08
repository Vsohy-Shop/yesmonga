package com.google.android.gms.measurement.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0380x0;
import androidx.annotation.C0386z0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.internal.measurement.C41979h3;
import com.google.android.gms.measurement.internal.C30745h6;
import com.google.android.gms.measurement.internal.C30758i6;
import java.util.List;
import java.util.Map;

@C40473a
@C40858y
/* renamed from: com.google.android.gms.measurement.api.a */
public class C30638a {

    /* renamed from: a */
    public final C41979h3 f73191a;

    @C40473a
    /* renamed from: com.google.android.gms.measurement.api.a$a */
    public static final class C30639a {
        @C40473a
        @C0359n0

        /* renamed from: a */
        public static final String f73192a = "origin";
        @C40473a
        @C0359n0

        /* renamed from: b */
        public static final String f73193b = "name";
        @C40473a
        @C0359n0

        /* renamed from: c */
        public static final String f73194c = "value";
        @C40473a
        @C0359n0

        /* renamed from: d */
        public static final String f73195d = "trigger_event_name";
        @C40473a
        @C0359n0

        /* renamed from: e */
        public static final String f73196e = "trigger_timeout";
        @C40473a
        @C0359n0

        /* renamed from: f */
        public static final String f73197f = "timed_out_event_name";
        @C40473a
        @C0359n0

        /* renamed from: g */
        public static final String f73198g = "timed_out_event_params";
        @C40473a
        @C0359n0

        /* renamed from: h */
        public static final String f73199h = "triggered_event_name";
        @C40473a
        @C0359n0

        /* renamed from: i */
        public static final String f73200i = "triggered_event_params";
        @C40473a
        @C0359n0

        /* renamed from: j */
        public static final String f73201j = "time_to_live";
        @C40473a
        @C0359n0

        /* renamed from: k */
        public static final String f73202k = "expired_event_name";
        @C40473a
        @C0359n0

        /* renamed from: l */
        public static final String f73203l = "expired_event_params";
        @C40473a
        @C0359n0

        /* renamed from: m */
        public static final String f73204m = "creation_timestamp";
        @C40473a
        @C0359n0

        /* renamed from: n */
        public static final String f73205n = "active";
        @C40473a
        @C0359n0

        /* renamed from: o */
        public static final String f73206o = "triggered_timestamp";
    }

    @C40858y
    @C40473a
    /* renamed from: com.google.android.gms.measurement.api.a$b */
    public interface C30640b extends C30745h6 {
        @C0348i1
        @C40473a
        @C40858y
        /* renamed from: a */
        void mo86738a(@C0359n0 String str, @C0359n0 String str2, @C0359n0 Bundle bundle, long j);
    }

    @C40858y
    @C40473a
    /* renamed from: com.google.android.gms.measurement.api.a$c */
    public interface C30641c extends C30758i6 {
        @C0348i1
        @C40473a
        @C40858y
        /* renamed from: a */
        void mo86739a(@C0359n0 String str, @C0359n0 String str2, @C0359n0 Bundle bundle, long j);
    }

    public C30638a(C41979h3 h3Var) {
        this.f73191a = h3Var;
    }

    @C0380x0(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @C40858y
    @C40473a
    @C0359n0
    /* renamed from: k */
    public static C30638a m123411k(@C0359n0 Context context) {
        return C41979h3.m170032D(context, (String) null, (String) null, (String) null, (Bundle) null).mo136893A();
    }

    @C0380x0(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @C40473a
    @C0359n0
    /* renamed from: l */
    public static C30638a m123412l(@C0359n0 Context context, @C0359n0 String str, @C0359n0 String str2, @C0363p0 String str3, @C0359n0 Bundle bundle) {
        return C41979h3.m170032D(context, str, str2, str3, bundle).mo136893A();
    }

    @C40473a
    @C40858y
    /* renamed from: A */
    public void mo86767A(@C0359n0 C30641c cVar) {
        this.f73191a.mo136925p(cVar);
    }

    /* renamed from: B */
    public final void mo86768B(boolean z) {
        this.f73191a.mo136918i(z);
    }

    @C40473a
    /* renamed from: a */
    public void mo86769a(@C0359n0 @C0386z0(min = 1) String str) {
        this.f73191a.mo136905S(str);
    }

    @C40473a
    /* renamed from: b */
    public void mo86770b(@C0359n0 @C0386z0(max = 24, min = 1) String str, @C0363p0 String str2, @C0363p0 Bundle bundle) {
        this.f73191a.mo136906T(str, str2, bundle);
    }

    @C40473a
    /* renamed from: c */
    public void mo86771c(@C0359n0 @C0386z0(min = 1) String str) {
        this.f73191a.mo136907U(str);
    }

    @C40473a
    /* renamed from: d */
    public long mo86772d() {
        return this.f73191a.mo136932y();
    }

    @C0363p0
    @C40473a
    /* renamed from: e */
    public String mo86773e() {
        return this.f73191a.mo136897H();
    }

    @C0363p0
    @C40473a
    /* renamed from: f */
    public String mo86774f() {
        return this.f73191a.mo136899J();
    }

    @C0348i1
    @C40473a
    @C0359n0
    /* renamed from: g */
    public List<Bundle> mo86775g(@C0363p0 String str, @C0363p0 @C0386z0(max = 23, min = 1) String str2) {
        return this.f73191a.mo136903N(str, str2);
    }

    @C0363p0
    @C40473a
    /* renamed from: h */
    public String mo86776h() {
        return this.f73191a.mo136900K();
    }

    @C0363p0
    @C40473a
    /* renamed from: i */
    public String mo86777i() {
        return this.f73191a.mo136901L();
    }

    @C0363p0
    @C40473a
    /* renamed from: j */
    public String mo86778j() {
        return this.f73191a.mo136902M();
    }

    @C0348i1
    @C40473a
    /* renamed from: m */
    public int mo86779m(@C0359n0 @C0386z0(min = 1) String str) {
        return this.f73191a.mo136931x(str);
    }

    @C0348i1
    @C40473a
    @C0359n0
    /* renamed from: n */
    public Map<String, Object> mo86780n(@C0363p0 String str, @C0363p0 @C0386z0(max = 24, min = 1) String str2, boolean z) {
        return this.f73191a.mo136904O(str, str2, z);
    }

    @C40473a
    /* renamed from: o */
    public void mo86781o(@C0359n0 String str, @C0359n0 String str2, @C0359n0 Bundle bundle) {
        this.f73191a.mo136909W(str, str2, bundle);
    }

    @C40473a
    /* renamed from: p */
    public void mo86782p(@C0359n0 String str, @C0359n0 String str2, @C0359n0 Bundle bundle, long j) {
        this.f73191a.mo136910a(str, str2, bundle, j);
    }

    @C0363p0
    @C40473a
    /* renamed from: q */
    public void mo86783q(@C0359n0 Bundle bundle) {
        this.f73191a.mo136933z(bundle, false);
    }

    @C0363p0
    @C40473a
    /* renamed from: r */
    public Bundle mo86784r(@C0359n0 Bundle bundle) {
        return this.f73191a.mo136933z(bundle, true);
    }

    @C40473a
    @C40858y
    /* renamed from: s */
    public void mo86785s(@C0359n0 C30641c cVar) {
        this.f73191a.mo136912c(cVar);
    }

    @C40473a
    /* renamed from: t */
    public void mo86786t(@C0359n0 Bundle bundle) {
        this.f73191a.mo136914e(bundle);
    }

    @C40473a
    /* renamed from: u */
    public void mo86787u(@C0359n0 Bundle bundle) {
        this.f73191a.mo136915f(bundle);
    }

    @C40473a
    /* renamed from: v */
    public void mo86788v(@C0359n0 Activity activity, @C0363p0 @C0386z0(max = 36, min = 1) String str, @C0363p0 @C0386z0(max = 36, min = 1) String str2) {
        this.f73191a.mo136917h(activity, str, str2);
    }

    @C0348i1
    @C40473a
    @C40858y
    /* renamed from: w */
    public void mo86789w(@C0359n0 C30640b bVar) {
        this.f73191a.mo136920k(bVar);
    }

    @C40473a
    /* renamed from: x */
    public void mo86790x(@C0363p0 Boolean bool) {
        this.f73191a.mo136921l(bool);
    }

    @C40473a
    /* renamed from: y */
    public void mo86791y(boolean z) {
        this.f73191a.mo136921l(Boolean.valueOf(z));
    }

    @C40473a
    /* renamed from: z */
    public void mo86792z(@C0359n0 String str, @C0359n0 String str2, @C0359n0 Object obj) {
        this.f73191a.mo136924o(str, str2, obj, true);
    }
}
