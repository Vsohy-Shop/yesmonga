package com.google.firebase.perf.metrics.validator;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.perf.logging.C33363a;
import com.google.firebase.perf.p049v1.NetworkRequestMetric;
import com.google.firebase.perf.util.C33441i;
import java.net.URI;

/* renamed from: com.google.firebase.perf.metrics.validator.c */
public final class C33386c extends C33388e {

    /* renamed from: c */
    public static final C33363a f81131c = C33363a.m134449e();

    /* renamed from: d */
    public static final String f81132d = "http";

    /* renamed from: e */
    public static final String f81133e = "https";

    /* renamed from: f */
    public static final int f81134f = -1;

    /* renamed from: a */
    public final NetworkRequestMetric f81135a;

    /* renamed from: b */
    public final Context f81136b;

    public C33386c(NetworkRequestMetric networkRequestMetric, Context context) {
        this.f81136b = context;
        this.f81135a = networkRequestMetric;
    }

    /* renamed from: c */
    public boolean mo96558c() {
        NetworkRequestMetric.HttpMethod httpMethod;
        if (mo96563j(this.f81135a.getUrl())) {
            C33363a aVar = f81131c;
            aVar.mo96439l("URL is missing:" + this.f81135a.getUrl());
            return false;
        }
        URI g = mo96560g(this.f81135a.getUrl());
        if (g == null) {
            f81131c.mo96439l("URL cannot be parsed");
            return false;
        } else if (!mo96561h(g, this.f81136b)) {
            C33363a aVar2 = f81131c;
            aVar2.mo96439l("URL fails allowlist rule: " + g);
            return false;
        } else if (!mo96564k(g.getHost())) {
            f81131c.mo96439l("URL host is null or invalid");
            return false;
        } else if (!mo96569p(g.getScheme())) {
            f81131c.mo96439l("URL scheme is null or invalid");
            return false;
        } else if (!mo96571r(g.getUserInfo())) {
            f81131c.mo96439l("URL user info is null");
            return false;
        } else if (!mo96568o(g.getPort())) {
            f81131c.mo96439l("URL port is less than or equal to 0");
            return false;
        } else {
            if (this.f81135a.hasHttpMethod()) {
                httpMethod = this.f81135a.getHttpMethod();
            } else {
                httpMethod = null;
            }
            if (!mo96565l(httpMethod)) {
                C33363a aVar3 = f81131c;
                aVar3.mo96439l("HTTP Method is null or invalid: " + this.f81135a.getHttpMethod());
                return false;
            } else if (this.f81135a.hasHttpResponseCode() && !mo96566m(this.f81135a.getHttpResponseCode())) {
                C33363a aVar4 = f81131c;
                aVar4.mo96439l("HTTP ResponseCode is a negative value:" + this.f81135a.getHttpResponseCode());
                return false;
            } else if (this.f81135a.hasRequestPayloadBytes() && !mo96567n(this.f81135a.getRequestPayloadBytes())) {
                C33363a aVar5 = f81131c;
                aVar5.mo96439l("Request Payload is a negative value:" + this.f81135a.getRequestPayloadBytes());
                return false;
            } else if (this.f81135a.hasResponsePayloadBytes() && !mo96567n(this.f81135a.getResponsePayloadBytes())) {
                C33363a aVar6 = f81131c;
                aVar6.mo96439l("Response Payload is a negative value:" + this.f81135a.getResponsePayloadBytes());
                return false;
            } else if (!this.f81135a.hasClientStartTimeUs() || this.f81135a.getClientStartTimeUs() <= 0) {
                C33363a aVar7 = f81131c;
                aVar7.mo96439l("Start time of the request is null, or zero, or a negative value:" + this.f81135a.getClientStartTimeUs());
                return false;
            } else if (this.f81135a.hasTimeToRequestCompletedUs() && !mo96570q(this.f81135a.getTimeToRequestCompletedUs())) {
                C33363a aVar8 = f81131c;
                aVar8.mo96439l("Time to complete the request is a negative value:" + this.f81135a.getTimeToRequestCompletedUs());
                return false;
            } else if (this.f81135a.hasTimeToResponseInitiatedUs() && !mo96570q(this.f81135a.getTimeToResponseInitiatedUs())) {
                C33363a aVar9 = f81131c;
                aVar9.mo96439l("Time from the start of the request to the start of the response is null or a negative value:" + this.f81135a.getTimeToResponseInitiatedUs());
                return false;
            } else if (!this.f81135a.hasTimeToResponseCompletedUs() || this.f81135a.getTimeToResponseCompletedUs() <= 0) {
                C33363a aVar10 = f81131c;
                aVar10.mo96439l("Time from the start of the request to the end of the response is null, negative or zero:" + this.f81135a.getTimeToResponseCompletedUs());
                return false;
            } else if (this.f81135a.hasHttpResponseCode()) {
                return true;
            } else {
                f81131c.mo96439l("Did not receive a HTTP Response Code");
                return false;
            }
        }
    }

    @C0363p0
    /* renamed from: g */
    public final URI mo96560g(@C0363p0 String str) {
        if (str == null) {
            return null;
        }
        try {
            return URI.create(str);
        } catch (IllegalArgumentException | IllegalStateException e) {
            f81131c.mo96440m("getResultUrl throws exception %s", e.getMessage());
            return null;
        }
    }

    /* renamed from: h */
    public final boolean mo96561h(@C0363p0 URI uri, @C0359n0 Context context) {
        if (uri == null) {
            return false;
        }
        return C33441i.m134833a(uri, context);
    }

    /* renamed from: i */
    public final boolean mo96562i(@C0363p0 String str) {
        if (str == null) {
            return true;
        }
        return str.trim().isEmpty();
    }

    /* renamed from: j */
    public final boolean mo96563j(@C0363p0 String str) {
        return mo96562i(str);
    }

    /* renamed from: k */
    public final boolean mo96564k(@C0363p0 String str) {
        return str != null && !mo96562i(str) && str.length() <= 255;
    }

    /* renamed from: l */
    public boolean mo96565l(@C0363p0 NetworkRequestMetric.HttpMethod httpMethod) {
        return (httpMethod == null || httpMethod == NetworkRequestMetric.HttpMethod.HTTP_METHOD_UNKNOWN) ? false : true;
    }

    /* renamed from: m */
    public final boolean mo96566m(int i) {
        return i > 0;
    }

    /* renamed from: n */
    public final boolean mo96567n(long j) {
        return j >= 0;
    }

    /* renamed from: o */
    public final boolean mo96568o(int i) {
        return i == -1 || i > 0;
    }

    /* renamed from: p */
    public final boolean mo96569p(@C0363p0 String str) {
        if (str == null) {
            return false;
        }
        if ("http".equalsIgnoreCase(str) || "https".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final boolean mo96570q(long j) {
        return j >= 0;
    }

    /* renamed from: r */
    public final boolean mo96571r(@C0363p0 String str) {
        return str == null;
    }
}
