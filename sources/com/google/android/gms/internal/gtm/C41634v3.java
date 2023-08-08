package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.common.util.C40974d0;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.util.RetryingExecutor;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@C40858y
@C40974d0
/* renamed from: com.google.android.gms.internal.gtm.v3 */
public final class C41634v3 {

    /* renamed from: A */
    public static final C41610u3<Integer> f105096A = C41610u3.m168463a(8192, 8192, C41344j2.f104699a);

    /* renamed from: B */
    public static final C41610u3<Integer> f105097B = C41610u3.m168463a(8192, 8192, C41369k2.f104739a);

    /* renamed from: C */
    public static final C41610u3<String> f105098C = C41610u3.m168463a("404,502", "404,502", C41417m2.f104786a);

    /* renamed from: D */
    public static final C41610u3<Integer> f105099D = C41610u3.m168463a(3600, 3600, C41441n2.f104810a);

    /* renamed from: E */
    public static final C41610u3<Long> f105100E = C41610u3.m168463a(86400000L, 86400000L, C41465o2.f104826a);

    /* renamed from: F */
    public static final C41610u3<Integer> f105101F = C41610u3.m168463a(60000, 60000, C41513q2.f104892a);

    /* renamed from: G */
    public static final C41610u3<Integer> f105102G = C41610u3.m168463a(61000, 61000, C41537r2.f104918a);

    /* renamed from: H */
    public static final C41610u3<Long> f105103H = C41610u3.m168463a(86400000L, 86400000L, C41561s2.f104939a);

    /* renamed from: I */
    public static final C41610u3<String> f105104I = C41610u3.m168463a("", "", C41585t2.f104971a);

    /* renamed from: J */
    public static final C41610u3<Integer> f105105J = C41610u3.m168463a(0, 0, C41609u2.f105045a);

    /* renamed from: K */
    public static final C41610u3<Boolean> f105106K;

    /* renamed from: L */
    public static final C41610u3<Long> f105107L = C41610u3.m168463a(10000L, 10000L, C41681x2.f105228a);

    /* renamed from: M */
    public static final C41610u3<Long> f105108M = C41610u3.m168463a(5000L, 5000L, C41705y2.f105284a);

    /* renamed from: N */
    public static final C41610u3<Long> f105109N = C41610u3.m168463a(5000L, 5000L, C41729z2.f105319a);

    /* renamed from: O */
    public static final C41610u3<Long> f105110O;

    /* renamed from: P */
    public static final C41610u3<Long> f105111P = C41610u3.m168463a(1800000L, 1800000L, C41201d3.f104514a);

    /* renamed from: Q */
    public static final C41610u3<Long> f105112Q = C41610u3.m168463a(86400000L, 86400000L, C41225e3.f104559a);

    /* renamed from: R */
    public static final C41610u3<Long> f105113R = C41610u3.m168463a(5000L, 5000L, C41249f3.f104577a);

    /* renamed from: S */
    public static final C41610u3<Boolean> f105114S;

    /* renamed from: a */
    public static final Set<C41610u3<?>> f105115a = Collections.synchronizedSet(new HashSet());

    /* renamed from: b */
    public static final C41610u3<Boolean> f105116b;

    /* renamed from: c */
    public static final C41610u3<Boolean> f105117c;

    /* renamed from: d */
    public static final C41610u3<String> f105118d = C41610u3.m168463a("GAv4", "GAv4-SVC", C41200d2.f104513a);

    /* renamed from: e */
    public static final C41610u3<Long> f105119e = C41610u3.m168463a(60L, 60L, C41489p2.f104851a);

    /* renamed from: f */
    public static final C41610u3<Double> f105120f;

    /* renamed from: g */
    public static final C41610u3<Integer> f105121g = C41610u3.m168463a(2000, 20000, C41297h3.f104637a);

    /* renamed from: h */
    public static final C41610u3<Integer> f105122h = C41610u3.m168463a(2000, 2000, C41345j3.f104700a);

    /* renamed from: i */
    public static final C41610u3<Integer> f105123i = C41610u3.m168463a(100, 100, C41370k3.f104740a);

    /* renamed from: j */
    public static final C41610u3<Long> f105124j;

    /* renamed from: k */
    public static final C41610u3<Long> f105125k = C41610u3.m168463a(5000L, 5000L, C41418m3.f104787a);

    /* renamed from: l */
    public static final C41610u3<Long> f105126l;

    /* renamed from: m */
    public static final C41610u3<Long> f105127m = C41610u3.m168463a(7200000L, 7200000L, C41321i3.f104669a);

    /* renamed from: n */
    public static final C41610u3<Long> f105128n = C41610u3.m168463a(7200000L, 7200000L, C41442n3.f104811a);

    /* renamed from: o */
    public static final C41610u3<Long> f105129o = C41610u3.m168463a(32400000L, 32400000L, C41466o3.f104827a);

    /* renamed from: p */
    public static final C41610u3<Integer> f105130p = C41610u3.m168463a(20, 20, C41490p3.f104852a);

    /* renamed from: q */
    public static final C41610u3<Integer> f105131q = C41610u3.m168463a(20, 20, C41514q3.f104893a);

    /* renamed from: r */
    public static final C41610u3<String> f105132r = C41610u3.m168463a("http://www.google-analytics.com", "http://www.google-analytics.com", C41538r3.f104919a);

    /* renamed from: s */
    public static final C41610u3<String> f105133s = C41610u3.m168463a("https://ssl.google-analytics.com", "https://ssl.google-analytics.com", C41562s3.f104940a);

    /* renamed from: t */
    public static final C41610u3<String> f105134t = C41610u3.m168463a("/collect", "/collect", C41152b2.f104451a);

    /* renamed from: u */
    public static final C41610u3<String> f105135u = C41610u3.m168463a("/batch", "/batch", C41176c2.f104485a);

    /* renamed from: v */
    public static final C41610u3<Integer> f105136v = C41610u3.m168463a(2036, 2036, C41224e2.f104558a);

    /* renamed from: w */
    public static final C41610u3<String> f105137w = C41610u3.m168463a("BATCH_BY_COUNT", "BATCH_BY_COUNT", C41248f2.f104576a);

    /* renamed from: x */
    public static final C41610u3<String> f105138x = C41610u3.m168463a("GZIP", "GZIP", C41272g2.f104607a);

    /* renamed from: y */
    public static final C41610u3<Integer> f105139y = C41610u3.m168463a(20, 20, C41296h2.f104636a);

    /* renamed from: z */
    public static final C41610u3<Integer> f105140z = C41610u3.m168463a(8192, 8192, C41320i2.f104668a);

    static {
        Boolean bool = Boolean.FALSE;
        f105116b = C41610u3.m168463a(bool, bool, C41128a2.f104421a);
        Boolean bool2 = Boolean.TRUE;
        f105117c = C41610u3.m168463a(bool2, bool2, C41393l2.f104772a);
        Double valueOf = Double.valueOf(0.5d);
        f105120f = C41610u3.m168463a(valueOf, valueOf, C41177c3.f104486a);
        Long valueOf2 = Long.valueOf(RetryingExecutor.f26394v);
        f105124j = C41610u3.m168463a(1800000L, valueOf2, C41394l3.f104773a);
        f105126l = C41610u3.m168463a(valueOf2, valueOf2, C41657w2.f105186a);
        f105106K = C41610u3.m168463a(bool, bool, C41633v2.f105095a);
        Long valueOf3 = Long.valueOf(AirshipConfigOptions.f87111Y);
        f105110O = C41610u3.m168463a(valueOf3, valueOf3, C41153b3.f104452a);
        f105114S = C41610u3.m168463a(bool, bool, C41273g3.f104608a);
    }
}
