package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.util.C40979g;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31053n;
import com.google.firebase.analytics.connector.C32537a;
import com.google.firebase.inject.C33058b;
import com.google.firebase.installations.C33088k;
import com.google.firebase.installations.C33098o;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.C33538n;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.remoteconfig.internal.k */
public class C33533k {

    /* renamed from: j */
    public static final long f81593j = TimeUnit.HOURS.toSeconds(12);
    @C0344h1

    /* renamed from: k */
    public static final int[] f81594k = {2, 4, 8, 16, 32, 64, 128, 256};
    @C0344h1

    /* renamed from: l */
    public static final int f81595l = 429;
    @C0344h1

    /* renamed from: m */
    public static final String f81596m = "_fot";

    /* renamed from: a */
    public final C33088k f81597a;

    /* renamed from: b */
    public final C33058b<C32537a> f81598b;

    /* renamed from: c */
    public final Executor f81599c;

    /* renamed from: d */
    public final C40979g f81600d;

    /* renamed from: e */
    public final Random f81601e;

    /* renamed from: f */
    public final C33523e f81602f;

    /* renamed from: g */
    public final ConfigFetchHttpClient f81603g;

    /* renamed from: h */
    public final C33538n f81604h;

    /* renamed from: i */
    public final Map<String, String> f81605i;

    /* renamed from: com.google.firebase.remoteconfig.internal.k$a */
    public static class C33534a {

        /* renamed from: a */
        public final Date f81606a;

        /* renamed from: b */
        public final int f81607b;

        /* renamed from: c */
        public final C33526f f81608c;
        @C0363p0

        /* renamed from: d */
        public final String f81609d;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.google.firebase.remoteconfig.internal.k$a$a */
        public @interface C33535a {

            /* renamed from: U3 */
            public static final int f81610U3 = 0;

            /* renamed from: V3 */
            public static final int f81611V3 = 1;

            /* renamed from: W3 */
            public static final int f81612W3 = 2;
        }

        public C33534a(Date date, int i, C33526f fVar, @C0363p0 String str) {
            this.f81606a = date;
            this.f81607b = i;
            this.f81608c = fVar;
            this.f81609d = str;
        }

        /* renamed from: a */
        public static C33534a m135179a(Date date) {
            return new C33534a(date, 1, (C33526f) null, (String) null);
        }

        /* renamed from: b */
        public static C33534a m135180b(C33526f fVar, String str) {
            return new C33534a(fVar.mo97303e(), 0, fVar, str);
        }

        /* renamed from: c */
        public static C33534a m135181c(Date date) {
            return new C33534a(date, 2, (C33526f) null, (String) null);
        }

        /* renamed from: d */
        public Date mo97332d() {
            return this.f81606a;
        }

        /* renamed from: e */
        public C33526f mo97333e() {
            return this.f81608c;
        }

        @C0363p0
        /* renamed from: f */
        public String mo97334f() {
            return this.f81609d;
        }

        /* renamed from: g */
        public int mo97335g() {
            return this.f81607b;
        }
    }

    public C33533k(C33088k kVar, C33058b<C32537a> bVar, Executor executor, C40979g gVar, Random random, C33523e eVar, ConfigFetchHttpClient configFetchHttpClient, C33538n nVar, Map<String, String> map) {
        this.f81597a = kVar;
        this.f81598b = bVar;
        this.f81599c = executor;
        this.f81600d = gVar;
        this.f81601e = random;
        this.f81602f = eVar;
        this.f81603g = configFetchHttpClient;
        this.f81604h = nVar;
        this.f81605i = map;
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ C31047k m135159u(C31047k kVar, C31047k kVar2, Date date, C31047k kVar3) throws Exception {
        if (!kVar.mo87738v()) {
            return C31053n.m124524f(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", kVar.mo87733q()));
        }
        if (!kVar2.mo87738v()) {
            return C31053n.m124524f(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", kVar2.mo87733q()));
        }
        return mo97320k((String) kVar.mo87734r(), ((C33098o) kVar2.mo87734r()).mo95775b(), date);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ C31047k m135160v(Date date, C31047k kVar) throws Exception {
        mo97331z(kVar, date);
        return kVar;
    }

    /* renamed from: e */
    public final boolean mo97314e(long j, Date date) {
        Date g = this.f81604h.mo97353g();
        if (g.equals(C33538n.f81624e)) {
            return false;
        }
        return date.before(new Date(g.getTime() + TimeUnit.SECONDS.toMillis(j)));
    }

    /* renamed from: f */
    public final FirebaseRemoteConfigServerException mo97315f(FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) throws FirebaseRemoteConfigClientException {
        String str;
        int a = firebaseRemoteConfigServerException.mo97271a();
        if (a == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (a == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else if (a == 429) {
            throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
        } else if (a != 500) {
            switch (a) {
                case 502:
                case 503:
                case 504:
                    str = "The server is unavailable. Please try again later.";
                    break;
                default:
                    str = "The server returned an unexpected error.";
                    break;
            }
        } else {
            str = "There was an internal server error.";
        }
        int a2 = firebaseRemoteConfigServerException.mo97271a();
        return new FirebaseRemoteConfigServerException(a2, "Fetch failed: " + str, firebaseRemoteConfigServerException);
    }

    /* renamed from: g */
    public final String mo97316g(long j) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", new Object[]{DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j))});
    }

    /* renamed from: h */
    public C31047k<C33534a> mo97317h() {
        return mo97318i(this.f81604h.mo97354h());
    }

    /* renamed from: i */
    public C31047k<C33534a> mo97318i(long j) {
        return this.f81602f.mo97292f().mo87732p(this.f81599c, new C33529g(this, j));
    }

    @C0348i1
    /* renamed from: j */
    public final C33534a mo97319j(String str, String str2, Date date) throws FirebaseRemoteConfigException {
        try {
            C33534a fetch = this.f81603g.fetch(this.f81603g.mo97278d(), str, str2, mo97326q(), this.f81604h.mo97351e(), this.f81605i, mo97324o(), date);
            if (fetch.mo97334f() != null) {
                this.f81604h.mo97359m(fetch.mo97334f());
            }
            this.f81604h.mo97355i();
            return fetch;
        } catch (FirebaseRemoteConfigServerException e) {
            C33538n.C33539a x = mo97329x(e.mo97271a(), date);
            if (mo97328w(x, e.mo97271a())) {
                throw new FirebaseRemoteConfigFetchThrottledException(x.mo97363a().getTime());
            }
            throw mo97315f(e);
        }
    }

    /* renamed from: k */
    public final C31047k<C33534a> mo97320k(String str, String str2, Date date) {
        try {
            C33534a j = mo97319j(str, str2, date);
            if (j.mo97335g() != 0) {
                return C31053n.m124525g(j);
            }
            return this.f81602f.mo97296m(j.mo97333e()).mo87740x(this.f81599c, new C33532j(j));
        } catch (FirebaseRemoteConfigException e) {
            return C31053n.m124524f(e);
        }
    }

    /* renamed from: l */
    public final C31047k<C33534a> m135157s(C31047k<C33526f> kVar, long j) {
        C31047k<TContinuationResult> kVar2;
        Date date = new Date(this.f81600d.mo134768a());
        if (kVar.mo87738v() && mo97314e(j, date)) {
            return C31053n.m124525g(C33534a.m135181c(date));
        }
        Date n = mo97323n(date);
        if (n != null) {
            kVar2 = C31053n.m124524f(new FirebaseRemoteConfigFetchThrottledException(mo97316g(n.getTime() - date.getTime()), n.getTime()));
        } else {
            C31047k<String> id = this.f81597a.getId();
            C31047k<C33098o> b = this.f81597a.mo95804b(false);
            kVar2 = C31053n.m124529k(id, b).mo87732p(this.f81599c, new C33530h(this, id, b, date));
        }
        return kVar2.mo87732p(this.f81599c, new C33531i(this, date));
    }

    @C0344h1
    /* renamed from: m */
    public C33058b<C32537a> mo97322m() {
        return this.f81598b;
    }

    @C0363p0
    /* renamed from: n */
    public final Date mo97323n(Date date) {
        Date a = this.f81604h.mo97348b().mo97363a();
        if (date.before(a)) {
            return a;
        }
        return null;
    }

    @C0348i1
    /* renamed from: o */
    public final Long mo97324o() {
        C32537a aVar = this.f81598b.get();
        if (aVar == null) {
            return null;
        }
        return (Long) aVar.mo94649d(true).get(f81596m);
    }

    /* renamed from: p */
    public final long mo97325p(int i) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f81594k;
        long millis = timeUnit.toMillis((long) iArr[Math.min(i, iArr.length) - 1]);
        return (millis / 2) + ((long) this.f81601e.nextInt((int) millis));
    }

    @C0348i1
    /* renamed from: q */
    public final Map<String, String> mo97326q() {
        HashMap hashMap = new HashMap();
        C32537a aVar = this.f81598b.get();
        if (aVar == null) {
            return hashMap;
        }
        for (Map.Entry next : aVar.mo94649d(false).entrySet()) {
            hashMap.put((String) next.getKey(), next.getValue().toString());
        }
        return hashMap;
    }

    /* renamed from: r */
    public final boolean mo97327r(int i) {
        return i == 429 || i == 502 || i == 503 || i == 504;
    }

    /* renamed from: w */
    public final boolean mo97328w(C33538n.C33539a aVar, int i) {
        return aVar.mo97364b() > 1 || i == 429;
    }

    /* renamed from: x */
    public final C33538n.C33539a mo97329x(int i, Date date) {
        if (mo97327r(i)) {
            mo97330y(date);
        }
        return this.f81604h.mo97348b();
    }

    /* renamed from: y */
    public final void mo97330y(Date date) {
        int b = this.f81604h.mo97348b().mo97364b() + 1;
        this.f81604h.mo97356j(b, new Date(date.getTime() + mo97325p(b)));
    }

    /* renamed from: z */
    public final void mo97331z(C31047k<C33534a> kVar, Date date) {
        if (kVar.mo87738v()) {
            this.f81604h.mo97361o(date);
            return;
        }
        Exception q = kVar.mo87733q();
        if (q != null) {
            if (q instanceof FirebaseRemoteConfigFetchThrottledException) {
                this.f81604h.mo97362p();
            } else {
                this.f81604h.mo97360n();
            }
        }
    }
}
