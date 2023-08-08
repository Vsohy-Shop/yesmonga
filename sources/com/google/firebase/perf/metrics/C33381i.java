package com.google.firebase.perf.metrics;

import androidx.annotation.C0344h1;
import androidx.annotation.C0363p0;
import com.google.firebase.perf.application.C33279a;
import com.google.firebase.perf.application.C33282b;
import com.google.firebase.perf.logging.C33363a;
import com.google.firebase.perf.network.C33396h;
import com.google.firebase.perf.p049v1.NetworkRequestMetric;
import com.google.firebase.perf.session.C33398a;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.transport.C33424k;
import com.google.firebase.perf.util.C33443k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.firebase.perf.metrics.i */
public final class C33381i extends C33282b implements C33398a {

    /* renamed from: w */
    public static final C33363a f81114w = C33363a.m134449e();

    /* renamed from: x */
    public static final char f81115x = '\u001f';

    /* renamed from: y */
    public static final char f81116y = '';

    /* renamed from: a */
    public final List<PerfSession> f81117a;

    /* renamed from: b */
    public final GaugeManager f81118b;

    /* renamed from: c */
    public final C33424k f81119c;

    /* renamed from: d */
    public final NetworkRequestMetric.C33470b f81120d;

    /* renamed from: e */
    public final WeakReference<C33398a> f81121e;
    @C0363p0

    /* renamed from: f */
    public String f81122f;

    /* renamed from: g */
    public boolean f81123g;

    /* renamed from: v */
    public boolean f81124v;

    public C33381i(C33424k kVar) {
        this(kVar, C33279a.m134177c(), GaugeManager.getInstance());
    }

    /* renamed from: c */
    public static C33381i m134544c(C33424k kVar) {
        return new C33381i(kVar);
    }

    /* renamed from: l */
    public static boolean m134545l(String str) {
        if (str.length() > 128) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt > 127) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: A */
    public C33381i mo96533A(@C0363p0 String str) {
        this.f81122f = str;
        return this;
    }

    /* renamed from: a */
    public void mo96482a(PerfSession perfSession) {
        if (perfSession == null) {
            f81114w.mo96439l("Unable to add new SessionId to the Network Trace. Continuing without it.");
        } else if (mo96540i() && !mo96542k()) {
            this.f81117a.add(perfSession);
        }
    }

    /* renamed from: b */
    public NetworkRequestMetric mo96534b() {
        SessionManager.getInstance().unregisterForSessionUpdates(this.f81121e);
        unregisterForAppState();
        com.google.firebase.perf.p049v1.PerfSession[] b = PerfSession.m134676b(mo96536e());
        if (b != null) {
            this.f81120d.mo97109P(Arrays.asList(b));
        }
        NetworkRequestMetric networkRequestMetric = (NetworkRequestMetric) this.f81120d.mo100473g();
        if (!C33396h.m134674c(this.f81122f)) {
            f81114w.mo96429a("Dropping network request from a 'User-Agent' that is not allowed");
            return networkRequestMetric;
        } else if (!this.f81123g) {
            this.f81119c.mo96861G(networkRequestMetric, getAppState());
            this.f81123g = true;
            return networkRequestMetric;
        } else {
            if (this.f81124v) {
                f81114w.mo96429a("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
            }
            return networkRequestMetric;
        }
    }

    @C0344h1
    /* renamed from: d */
    public void mo96535d() {
        this.f81120d.clear();
    }

    @C0344h1
    /* renamed from: e */
    public List<PerfSession> mo96536e() {
        List<PerfSession> unmodifiableList;
        synchronized (this.f81117a) {
            ArrayList arrayList = new ArrayList();
            for (PerfSession next : this.f81117a) {
                if (next != null) {
                    arrayList.add(next);
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    /* renamed from: f */
    public long mo96537f() {
        return this.f81120d.getTimeToResponseInitiatedUs();
    }

    /* renamed from: g */
    public String mo96538g() {
        return this.f81120d.getUrl();
    }

    /* renamed from: h */
    public boolean mo96539h() {
        return this.f81120d.hasHttpResponseCode();
    }

    /* renamed from: i */
    public final boolean mo96540i() {
        return this.f81120d.hasClientStartTimeUs();
    }

    @C0344h1
    /* renamed from: j */
    public boolean mo96541j() {
        return this.f81123g;
    }

    /* renamed from: k */
    public final boolean mo96542k() {
        return this.f81120d.hasTimeToResponseCompletedUs();
    }

    /* renamed from: m */
    public C33381i mo96543m(Map<String, String> map) {
        this.f81120d.mo97115Y().mo97127m0(map);
        return this;
    }

    /* renamed from: n */
    public C33381i mo96544n(@C0363p0 String str) {
        if (str != null) {
            NetworkRequestMetric.HttpMethod httpMethod = NetworkRequestMetric.HttpMethod.HTTP_METHOD_UNKNOWN;
            String upperCase = str.toUpperCase();
            upperCase.hashCode();
            char c = 65535;
            switch (upperCase.hashCode()) {
                case -531492226:
                    if (upperCase.equals("OPTIONS")) {
                        c = 0;
                        break;
                    }
                    break;
                case 70454:
                    if (upperCase.equals("GET")) {
                        c = 1;
                        break;
                    }
                    break;
                case 79599:
                    if (upperCase.equals("PUT")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2213344:
                    if (upperCase.equals("HEAD")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2461856:
                    if (upperCase.equals("POST")) {
                        c = 4;
                        break;
                    }
                    break;
                case 75900968:
                    if (upperCase.equals("PATCH")) {
                        c = 5;
                        break;
                    }
                    break;
                case 80083237:
                    if (upperCase.equals("TRACE")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1669334218:
                    if (upperCase.equals("CONNECT")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2012838315:
                    if (upperCase.equals("DELETE")) {
                        c = 8;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    httpMethod = NetworkRequestMetric.HttpMethod.OPTIONS;
                    break;
                case 1:
                    httpMethod = NetworkRequestMetric.HttpMethod.GET;
                    break;
                case 2:
                    httpMethod = NetworkRequestMetric.HttpMethod.PUT;
                    break;
                case 3:
                    httpMethod = NetworkRequestMetric.HttpMethod.HEAD;
                    break;
                case 4:
                    httpMethod = NetworkRequestMetric.HttpMethod.POST;
                    break;
                case 5:
                    httpMethod = NetworkRequestMetric.HttpMethod.PATCH;
                    break;
                case 6:
                    httpMethod = NetworkRequestMetric.HttpMethod.TRACE;
                    break;
                case 7:
                    httpMethod = NetworkRequestMetric.HttpMethod.CONNECT;
                    break;
                case 8:
                    httpMethod = NetworkRequestMetric.HttpMethod.DELETE;
                    break;
            }
            this.f81120d.mo97132u0(httpMethod);
        }
        return this;
    }

    /* renamed from: o */
    public C33381i mo96545o(int i) {
        this.f81120d.mo97133v0(i);
        return this;
    }

    /* renamed from: p */
    public void mo96546p() {
        this.f81124v = true;
    }

    /* renamed from: q */
    public C33381i mo96547q() {
        this.f81120d.mo97134w0(NetworkRequestMetric.NetworkClientErrorReason.GENERIC_CLIENT_ERROR);
        return this;
    }

    @C0344h1
    /* renamed from: r */
    public void mo96548r() {
        this.f81123g = true;
    }

    /* renamed from: s */
    public C33381i mo96549s(long j) {
        this.f81120d.mo97137z0(j);
        return this;
    }

    /* renamed from: t */
    public C33381i mo96550t(long j) {
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f81121e);
        this.f81120d.mo97131s0(j);
        mo96482a(perfSession);
        if (perfSession.mo96780f()) {
            this.f81118b.collectGaugeMetricOnce(perfSession.mo96777d());
        }
        return this;
    }

    /* renamed from: u */
    public C33381i mo96551u(@C0363p0 String str) {
        if (str == null) {
            this.f81120d.mo97121g0();
            return this;
        }
        if (m134545l(str)) {
            this.f81120d.mo97101B0(str);
        } else {
            C33363a aVar = f81114w;
            aVar.mo96439l("The content type of the response is not a valid content-type:" + str);
        }
        return this;
    }

    /* renamed from: v */
    public C33381i mo96552v(long j) {
        this.f81120d.mo97103E0(j);
        return this;
    }

    /* renamed from: w */
    public C33381i mo96553w(long j) {
        this.f81120d.mo97104F0(j);
        return this;
    }

    /* renamed from: x */
    public C33381i mo96554x(long j) {
        this.f81120d.mo97105G0(j);
        if (SessionManager.getInstance().perfSession().mo96780f()) {
            this.f81118b.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().mo96777d());
        }
        return this;
    }

    /* renamed from: y */
    public C33381i mo96555y(long j) {
        this.f81120d.mo97106H0(j);
        return this;
    }

    /* renamed from: z */
    public C33381i mo96556z(@C0363p0 String str) {
        if (str != null) {
            this.f81120d.mo97107I0(C33443k.m134840f(C33443k.m134839e(str), 2000));
        }
        return this;
    }

    public C33381i(C33424k kVar, C33279a aVar, GaugeManager gaugeManager) {
        super(aVar);
        this.f81120d = NetworkRequestMetric.newBuilder();
        this.f81121e = new WeakReference<>(this);
        this.f81119c = kVar;
        this.f81118b = gaugeManager;
        this.f81117a = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }
}
