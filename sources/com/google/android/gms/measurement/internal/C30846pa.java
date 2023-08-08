package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.C0348i1;
import com.bumptech.glide.load.engine.GlideException;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.measurement.C41854a4;
import com.google.android.gms.internal.measurement.C41855a5;
import com.google.android.gms.internal.measurement.C41867b;
import com.google.android.gms.internal.measurement.C41931e9;
import com.google.android.gms.internal.measurement.C41945f5;
import com.google.android.gms.internal.measurement.C41955ff;
import com.google.android.gms.internal.measurement.C41963g5;
import com.google.android.gms.internal.measurement.C41981h5;
import com.google.android.gms.internal.measurement.C42026je;
import com.google.android.gms.internal.measurement.C42069m3;
import com.google.android.gms.internal.measurement.C42071m5;
import com.google.android.gms.internal.measurement.C42103o3;
import com.google.android.gms.internal.measurement.C42105o5;
import com.google.android.gms.internal.measurement.C42122p5;
import com.google.android.gms.internal.measurement.C42139q5;
import com.google.android.gms.internal.measurement.C42172s4;
import com.google.android.gms.internal.measurement.C42188t3;
import com.google.android.gms.internal.measurement.C42206u4;
import com.google.android.gms.internal.measurement.C42222v3;
import com.google.android.gms.internal.measurement.C42223v4;
import com.google.android.gms.internal.measurement.C42229va;
import com.google.android.gms.internal.measurement.C42240w4;
import com.google.android.gms.internal.measurement.C42291z4;
import com.google.android.gms.internal.measurement.zzll;
import com.google.firebase.crashlytics.C32648f;
import com.google.firebase.installations.C33124s;
import com.google.firebase.messaging.C33188f0;
import com.google.firebase.messaging.FirebaseMessaging;
import com.urbanairship.UAirship;
import com.urbanairship.analytics.C35551h;
import com.urbanairship.analytics.C35554i;
import com.urbanairship.channel.C9029l;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.google.android.gms.measurement.internal.pa */
public final class C30846pa extends C30965z9 {
    public C30846pa(C30822na naVar) {
        super(naVar);
    }

    /* renamed from: C */
    public static C42229va m124112C(C42229va vaVar, byte[] bArr) throws zzll {
        C41931e9 a = C41931e9.m169822a();
        if (a != null) {
            return vaVar.mo136719t3(bArr, a);
        }
        return vaVar.mo136714L1(bArr);
    }

    /* renamed from: H */
    public static List m124113H(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* renamed from: L */
    public static boolean m124114L(List list, int i) {
        if (i >= list.size() * 64) {
            return false;
        }
        if (((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public static boolean m124115N(String str) {
        if (str == null || !str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") || str.length() > 310) {
            return false;
        }
        return true;
    }

    /* renamed from: P */
    public static final void m124116P(C42223v4 v4Var, String str, Object obj) {
        List P = v4Var.mo137368P();
        int i = 0;
        while (true) {
            if (i >= P.size()) {
                i = -1;
                break;
            } else if (str.equals(((C41855a5) P.get(i)).mo136514H())) {
                break;
            } else {
                i++;
            }
        }
        C42291z4 F = C41855a5.m169601F();
        F.mo137491I(str);
        if (obj instanceof Long) {
            F.mo137490H(((Long) obj).longValue());
        }
        if (i >= 0) {
            v4Var.mo137362I(i, F);
        } else {
            v4Var.mo137357D(F);
        }
    }

    @C0348i1
    /* renamed from: m */
    public static final boolean m124117m(zzaw zzaw, zzq zzq) {
        C40843u.m166202l(zzaw);
        C40843u.m166202l(zzq);
        if (!TextUtils.isEmpty(zzq.f74189b) || !TextUtils.isEmpty(zzq.f74175F0)) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static final C41855a5 m124118n(C42240w4 w4Var, String str) {
        for (C41855a5 a5Var : w4Var.mo137401J()) {
            if (a5Var.mo136514H().equals(str)) {
                return a5Var;
            }
        }
        return null;
    }

    /* renamed from: o */
    public static final Object m124119o(C42240w4 w4Var, String str) {
        C41855a5 n = m124118n(w4Var, str);
        if (n == null) {
            return null;
        }
        if (n.mo136521Y()) {
            return n.mo136515I();
        }
        if (n.mo136519W()) {
            return Long.valueOf(n.mo136513E());
        }
        if (n.mo136517U()) {
            return Double.valueOf(n.mo136510B());
        }
        if (n.mo136512D() <= 0) {
            return null;
        }
        List<C41855a5> J = n.mo136516J();
        ArrayList arrayList = new ArrayList();
        for (C41855a5 a5Var : J) {
            if (a5Var != null) {
                Bundle bundle = new Bundle();
                for (C41855a5 a5Var2 : a5Var.mo136516J()) {
                    if (a5Var2.mo136521Y()) {
                        bundle.putString(a5Var2.mo136514H(), a5Var2.mo136515I());
                    } else if (a5Var2.mo136519W()) {
                        bundle.putLong(a5Var2.mo136514H(), a5Var2.mo136513E());
                    } else if (a5Var2.mo136517U()) {
                        bundle.putDouble(a5Var2.mo136514H(), a5Var2.mo136510B());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* renamed from: r */
    public static final void m124120r(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(GlideException.C22148a.f56917d);
        }
    }

    /* renamed from: s */
    public static final String m124121s(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* renamed from: t */
    public static final void m124122t(StringBuilder sb, int i, String str, C42071m5 m5Var) {
        Integer num;
        Integer num2;
        Long l;
        if (m5Var != null) {
            m124120r(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (m5Var.mo137144C() != 0) {
                m124120r(sb, 4);
                sb.append("results: ");
                int i2 = 0;
                for (Long l2 : m5Var.mo137148J()) {
                    int i3 = i2 + 1;
                    if (i2 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l2);
                    i2 = i3;
                }
                sb.append(10);
            }
            if (m5Var.mo137146E() != 0) {
                m124120r(sb, 4);
                sb.append("status: ");
                int i4 = 0;
                for (Long l3 : m5Var.mo137150L()) {
                    int i5 = i4 + 1;
                    if (i4 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l3);
                    i4 = i5;
                }
                sb.append(10);
            }
            if (m5Var.mo137143B() != 0) {
                m124120r(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i6 = 0;
                for (C42206u4 u4Var : m5Var.mo137147I()) {
                    int i7 = i6 + 1;
                    if (i6 != 0) {
                        sb.append(", ");
                    }
                    if (u4Var.mo137340I()) {
                        num2 = Integer.valueOf(u4Var.mo137337B());
                    } else {
                        num2 = null;
                    }
                    sb.append(num2);
                    sb.append(C33124s.f80355c);
                    if (u4Var.mo137339H()) {
                        l = Long.valueOf(u4Var.mo137338C());
                    } else {
                        l = null;
                    }
                    sb.append(l);
                    i6 = i7;
                }
                sb.append("}\n");
            }
            if (m5Var.mo137145D() != 0) {
                m124120r(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i8 = 0;
                for (C42105o5 o5Var : m5Var.mo137149K()) {
                    int i9 = i8 + 1;
                    if (i8 != 0) {
                        sb.append(", ");
                    }
                    if (o5Var.mo137200J()) {
                        num = Integer.valueOf(o5Var.mo137197C());
                    } else {
                        num = null;
                    }
                    sb.append(num);
                    sb.append(": [");
                    int i10 = 0;
                    for (Long longValue : o5Var.mo137199G()) {
                        long longValue2 = longValue.longValue();
                        int i11 = i10 + 1;
                        if (i10 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue2);
                        i10 = i11;
                    }
                    sb.append("]");
                    i8 = i9;
                }
                sb.append("}\n");
            }
            m124120r(sb, 3);
            sb.append("}\n");
        }
    }

    /* renamed from: u */
    public static final void m124123u(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            m124120r(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    /* renamed from: v */
    public static final void m124124v(StringBuilder sb, int i, String str, C42188t3 t3Var) {
        String str2;
        if (t3Var != null) {
            m124120r(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (t3Var.mo137296H()) {
                int M = t3Var.mo137301M();
                if (M == 1) {
                    str2 = "UNKNOWN_COMPARISON_TYPE";
                } else if (M == 2) {
                    str2 = "LESS_THAN";
                } else if (M == 3) {
                    str2 = "GREATER_THAN";
                } else if (M != 4) {
                    str2 = "BETWEEN";
                } else {
                    str2 = "EQUAL";
                }
                m124123u(sb, i, "comparison_type", str2);
            }
            if (t3Var.mo137298J()) {
                m124123u(sb, i, "match_as_float", Boolean.valueOf(t3Var.mo137295G()));
            }
            if (t3Var.mo137297I()) {
                m124123u(sb, i, "comparison_value", t3Var.mo137292D());
            }
            if (t3Var.mo137300L()) {
                m124123u(sb, i, "min_comparison_value", t3Var.mo137294F());
            }
            if (t3Var.mo137299K()) {
                m124123u(sb, i, "max_comparison_value", t3Var.mo137293E());
            }
            m124120r(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: w */
    public static int m124125w(C41963g5 g5Var, String str) {
        for (int i = 0; i < g5Var.mo136809G0(); i++) {
            if (str.equals(g5Var.mo136869y0(i).mo137233G())) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: A */
    public final zzaw mo87418A(C41867b bVar) {
        String str;
        Object obj;
        Bundle y = mo87432y(bVar.mo136591e(), true);
        if (!y.containsKey(C32648f.f79204c) || (obj = y.get(C32648f.f79204c)) == null) {
            str = FirebaseMessaging.f80405r;
        } else {
            str = obj.toString();
        }
        String str2 = str;
        String b = C30706e6.m123695b(bVar.mo136590d());
        if (b == null) {
            b = bVar.mo136590d();
        }
        return new zzaw(b, new zzau(y), str2, bVar.mo136586a());
    }

    /* renamed from: B */
    public final C42240w4 mo87419B(C30847q qVar) {
        C42223v4 F = C42240w4.m171015F();
        F.mo137364K(qVar.f73866e);
        C30871s sVar = new C30871s(qVar.f73867f);
        while (sVar.hasNext()) {
            String b = sVar.next();
            C42291z4 F2 = C41855a5.m169601F();
            F2.mo137491I(b);
            Object f0 = qVar.f73867f.mo87637f0(b);
            C40843u.m166202l(f0);
            mo87425J(F2, f0);
            F.mo137357D(F2);
        }
        return (C42240w4) F.mo137180s();
    }

    /* renamed from: D */
    public final String mo87420D(C41945f5 f5Var) {
        Long l;
        Long l2;
        Double d;
        if (f5Var == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (C41981h5 h5Var : f5Var.mo136760E()) {
            if (h5Var != null) {
                m124120r(sb, 1);
                sb.append("bundle {\n");
                if (h5Var.mo136995r1()) {
                    m124123u(sb, 1, "protocol_version", Integer.valueOf(h5Var.mo136945B1()));
                }
                C41955ff.m169896b();
                if (this.f74136a.mo87130z().mo87070B(h5Var.mo136978W1(), C30742h3.f73554q0) && h5Var.mo136998u1()) {
                    m124123u(sb, 1, "session_stitching_token", h5Var.mo136965M());
                }
                m124123u(sb, 1, "platform", h5Var.mo136962K());
                if (h5Var.mo136991n1()) {
                    m124123u(sb, 1, "gmp_version", Long.valueOf(h5Var.mo136961J1()));
                }
                if (h5Var.mo137003z1()) {
                    m124123u(sb, 1, "uploading_gmp_version", Long.valueOf(h5Var.mo136974Q1()));
                }
                if (h5Var.mo136989l1()) {
                    m124123u(sb, 1, "dynamite_version", Long.valueOf(h5Var.mo136957H1()));
                }
                if (h5Var.mo136986i1()) {
                    m124123u(sb, 1, "config_version", Long.valueOf(h5Var.mo136953F1()));
                }
                m124123u(sb, 1, C33188f0.f80648A, h5Var.mo136956H());
                m124123u(sb, 1, "admob_app_id", h5Var.mo136977V1());
                m124123u(sb, 1, "app_id", h5Var.mo136978W1());
                m124123u(sb, 1, "app_version", h5Var.mo136946C());
                if (h5Var.mo136984g1()) {
                    m124123u(sb, 1, "app_version_major", Integer.valueOf(h5Var.mo136980b0()));
                }
                m124123u(sb, 1, "firebase_instance_id", h5Var.mo136954G());
                if (h5Var.mo136988k1()) {
                    m124123u(sb, 1, "dev_cert_hash", Long.valueOf(h5Var.mo136955G1()));
                }
                m124123u(sb, 1, UAirship.f87259D, h5Var.mo136943B());
                if (h5Var.mo137002y1()) {
                    m124123u(sb, 1, "upload_timestamp_millis", Long.valueOf(h5Var.mo136972P1()));
                }
                if (h5Var.mo136999v1()) {
                    m124123u(sb, 1, "start_timestamp_millis", Long.valueOf(h5Var.mo136968N1()));
                }
                if (h5Var.mo136990m1()) {
                    m124123u(sb, 1, "end_timestamp_millis", Long.valueOf(h5Var.mo136959I1()));
                }
                if (h5Var.mo136994q1()) {
                    m124123u(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(h5Var.mo136966M1()));
                }
                if (h5Var.mo136993p1()) {
                    m124123u(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(h5Var.mo136963K1()));
                }
                m124123u(sb, 1, "app_instance_id", h5Var.mo136979X1());
                m124123u(sb, 1, "resettable_device_id", h5Var.mo136964L());
                m124123u(sb, 1, "ds_id", h5Var.mo136952F());
                if (h5Var.mo136992o1()) {
                    m124123u(sb, 1, "limited_ad_tracking", Boolean.valueOf(h5Var.mo136941A0()));
                }
                m124123u(sb, 1, C35554i.f87765Z, h5Var.mo136960J());
                m124123u(sb, 1, C9029l.f24302e1, h5Var.mo136950E());
                m124123u(sb, 1, "user_default_language", h5Var.mo136967N());
                if (h5Var.mo137001x1()) {
                    m124123u(sb, 1, "time_zone_offset_minutes", Integer.valueOf(h5Var.mo136949D1()));
                }
                if (h5Var.mo136985h1()) {
                    m124123u(sb, 1, "bundle_sequential_index", Integer.valueOf(h5Var.mo136981d1()));
                }
                if (h5Var.mo136997t1()) {
                    m124123u(sb, 1, "service_upload", Boolean.valueOf(h5Var.mo136944B0()));
                }
                m124123u(sb, 1, "health_monitor", h5Var.mo136958I());
                if (h5Var.mo136996s1()) {
                    m124123u(sb, 1, "retry_counter", Integer.valueOf(h5Var.mo136947C1()));
                }
                if (h5Var.mo136987j1()) {
                    m124123u(sb, 1, "consent_signals", h5Var.mo136948D());
                }
                C42026je.m170421b();
                if (this.f74136a.mo87130z().mo87070B((String) null, C30742h3.f73499G0) && h5Var.mo137000w1()) {
                    m124123u(sb, 1, "target_os_version", Long.valueOf(h5Var.mo136970O1()));
                }
                List<C42139q5> Q = h5Var.mo136973Q();
                if (Q != null) {
                    for (C42139q5 q5Var : Q) {
                        if (q5Var != null) {
                            m124120r(sb, 2);
                            sb.append("user_property {\n");
                            if (q5Var.mo137237S()) {
                                l = Long.valueOf(q5Var.mo137232D());
                            } else {
                                l = null;
                            }
                            m124123u(sb, 2, "set_timestamp_millis", l);
                            m124123u(sb, 2, "name", this.f74136a.mo87101D().mo87412f(q5Var.mo137233G()));
                            m124123u(sb, 2, "string_value", q5Var.mo137234H());
                            if (q5Var.mo137236R()) {
                                l2 = Long.valueOf(q5Var.mo137231C());
                            } else {
                                l2 = null;
                            }
                            m124123u(sb, 2, "int_value", l2);
                            if (q5Var.mo137235Q()) {
                                d = Double.valueOf(q5Var.mo137230B());
                            } else {
                                d = null;
                            }
                            m124123u(sb, 2, "double_value", d);
                            m124120r(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C42172s4> O = h5Var.mo136969O();
                if (O != null) {
                    for (C42172s4 s4Var : O) {
                        if (s4Var != null) {
                            m124120r(sb, 2);
                            sb.append("audience_membership {\n");
                            if (s4Var.mo137266L()) {
                                m124123u(sb, 2, "audience_id", Integer.valueOf(s4Var.mo137262B()));
                            }
                            if (s4Var.mo137267M()) {
                                m124123u(sb, 2, "new_audience", Boolean.valueOf(s4Var.mo137265K()));
                            }
                            m124122t(sb, 2, "current_data", s4Var.mo137263E());
                            if (s4Var.mo137268N()) {
                                m124122t(sb, 2, "previous_data", s4Var.mo137264F());
                            }
                            m124120r(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C42240w4> P = h5Var.mo136971P();
                if (P != null) {
                    for (C42240w4 w4Var : P) {
                        if (w4Var != null) {
                            m124120r(sb, 2);
                            sb.append("event {\n");
                            m124123u(sb, 2, "name", this.f74136a.mo87101D().mo87410d(w4Var.mo137400I()));
                            if (w4Var.mo137404U()) {
                                m124123u(sb, 2, "timestamp_millis", Long.valueOf(w4Var.mo137398E()));
                            }
                            if (w4Var.mo137403T()) {
                                m124123u(sb, 2, "previous_timestamp_millis", Long.valueOf(w4Var.mo137397D()));
                            }
                            if (w4Var.mo137402S()) {
                                m124123u(sb, 2, "count", Integer.valueOf(w4Var.mo137395B()));
                            }
                            if (w4Var.mo137396C() != 0) {
                                mo87429p(sb, 2, w4Var.mo137401J());
                            }
                            m124120r(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                m124120r(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: E */
    public final String mo87421E(C42069m3 m3Var) {
        if (m3Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (m3Var.mo137139P()) {
            m124123u(sb, 0, "filter_id", Integer.valueOf(m3Var.mo137130C()));
        }
        m124123u(sb, 0, C35551h.f87728V0, this.f74136a.mo87101D().mo87410d(m3Var.mo137133H()));
        String s = m124121s(m3Var.mo137135L(), m3Var.mo137136M(), m3Var.mo137137N());
        if (!s.isEmpty()) {
            m124123u(sb, 0, "filter_type", s);
        }
        if (m3Var.mo137138O()) {
            m124124v(sb, 1, "event_count_filter", m3Var.mo137132G());
        }
        if (m3Var.mo137129B() > 0) {
            sb.append("  filters {\n");
            for (C42103o3 q : m3Var.mo137134I()) {
                mo87430q(sb, 2, q);
            }
        }
        m124120r(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* renamed from: F */
    public final String mo87422F(C42222v3 v3Var) {
        if (v3Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (v3Var.mo137352K()) {
            m124123u(sb, 0, "filter_id", Integer.valueOf(v3Var.mo137346B()));
        }
        m124123u(sb, 0, "property_name", this.f74136a.mo87101D().mo87412f(v3Var.mo137348F()));
        String s = m124121s(v3Var.mo137349H(), v3Var.mo137350I(), v3Var.mo137351J());
        if (!s.isEmpty()) {
            m124123u(sb, 0, "filter_type", s);
        }
        mo87430q(sb, 1, v3Var.mo137347C());
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: G */
    public final List mo87423G(List list, List list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f74136a.mo86903d().mo87494w().mo87464b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.f74136a.mo86903d().mo87494w().mo87465c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i);
    }

    /* renamed from: I */
    public final Map mo87424I(Bundle bundle, boolean z) {
        HashMap hashMap = new HashMap();
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(mo87424I((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(mo87424I((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(mo87424I((Bundle) obj, false));
                    }
                    hashMap.put(next, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: J */
    public final void mo87425J(C42291z4 z4Var, Object obj) {
        C40843u.m166202l(obj);
        z4Var.mo137488F();
        z4Var.mo137486D();
        z4Var.mo137485C();
        z4Var.mo137487E();
        if (obj instanceof String) {
            z4Var.mo137492J((String) obj);
        } else if (obj instanceof Long) {
            z4Var.mo137490H(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            z4Var.mo137489G(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    C42291z4 F = C41855a5.m169601F();
                    for (String next : bundle.keySet()) {
                        C42291z4 F2 = C41855a5.m169601F();
                        F2.mo137491I(next);
                        Object obj2 = bundle.get(next);
                        if (obj2 instanceof Long) {
                            F2.mo137490H(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            F2.mo137492J((String) obj2);
                        } else if (obj2 instanceof Double) {
                            F2.mo137489G(((Double) obj2).doubleValue());
                        }
                        F.mo137484B(F2);
                    }
                    if (F.mo137493x() > 0) {
                        arrayList.add((C41855a5) F.mo137180s());
                    }
                }
            }
            z4Var.mo137483A(arrayList);
        } else {
            this.f74136a.mo86903d().mo87489r().mo87464b("Ignoring invalid (type) event param value", obj);
        }
    }

    /* renamed from: K */
    public final void mo87426K(C42122p5 p5Var, Object obj) {
        C40843u.m166202l(obj);
        p5Var.mo137210B();
        p5Var.mo137209A();
        p5Var.mo137216x();
        if (obj instanceof String) {
            p5Var.mo137215G((String) obj);
        } else if (obj instanceof Long) {
            p5Var.mo137212D(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            p5Var.mo137211C(((Double) obj).doubleValue());
        } else {
            this.f74136a.mo86903d().mo87489r().mo87464b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* renamed from: M */
    public final boolean mo87427M(long j, long j2) {
        if (j == 0 || j2 <= 0 || Math.abs(this.f74136a.mo86900a().mo134768a() - j) > j2) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public final byte[] mo87428O(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.f74136a.mo86903d().mo87489r().mo87464b("Failed to gzip content", e);
            throw e;
        }
    }

    /* renamed from: l */
    public final boolean mo86867l() {
        return false;
    }

    /* renamed from: p */
    public final void mo87429p(StringBuilder sb, int i, List list) {
        String str;
        String str2;
        Long l;
        if (list != null) {
            int i2 = i + 1;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C41855a5 a5Var = (C41855a5) it.next();
                if (a5Var != null) {
                    m124120r(sb, i2);
                    sb.append("param {\n");
                    Double d = null;
                    if (a5Var.mo136520X()) {
                        str = this.f74136a.mo87101D().mo87411e(a5Var.mo136514H());
                    } else {
                        str = null;
                    }
                    m124123u(sb, i2, "name", str);
                    if (a5Var.mo136521Y()) {
                        str2 = a5Var.mo136515I();
                    } else {
                        str2 = null;
                    }
                    m124123u(sb, i2, "string_value", str2);
                    if (a5Var.mo136519W()) {
                        l = Long.valueOf(a5Var.mo136513E());
                    } else {
                        l = null;
                    }
                    m124123u(sb, i2, "int_value", l);
                    if (a5Var.mo136517U()) {
                        d = Double.valueOf(a5Var.mo136510B());
                    }
                    m124123u(sb, i2, "double_value", d);
                    if (a5Var.mo136512D() > 0) {
                        mo87429p(sb, i2, a5Var.mo136516J());
                    }
                    m124120r(sb, i2);
                    sb.append("}\n");
                }
            }
        }
    }

    /* renamed from: q */
    public final void mo87430q(StringBuilder sb, int i, C42103o3 o3Var) {
        String str;
        if (o3Var != null) {
            m124120r(sb, i);
            sb.append("filter {\n");
            if (o3Var.mo137192I()) {
                m124123u(sb, i, "complement", Boolean.valueOf(o3Var.mo137191H()));
            }
            if (o3Var.mo137194K()) {
                m124123u(sb, i, "param_name", this.f74136a.mo87101D().mo87411e(o3Var.mo137190F()));
            }
            if (o3Var.mo137195L()) {
                int i2 = i + 1;
                C41854a4 E = o3Var.mo137189E();
                if (E != null) {
                    m124120r(sb, i2);
                    sb.append("string_filter {\n");
                    if (E.mo136508J()) {
                        switch (E.mo136509K()) {
                            case 1:
                                str = "UNKNOWN_MATCH_TYPE";
                                break;
                            case 2:
                                str = "REGEXP";
                                break;
                            case 3:
                                str = "BEGINS_WITH";
                                break;
                            case 4:
                                str = "ENDS_WITH";
                                break;
                            case 5:
                                str = "PARTIAL";
                                break;
                            case 6:
                                str = "EXACT";
                                break;
                            default:
                                str = "IN_LIST";
                                break;
                        }
                        m124123u(sb, i2, "match_type", str);
                    }
                    if (E.mo136507I()) {
                        m124123u(sb, i2, "expression", E.mo136503E());
                    }
                    if (E.mo136506H()) {
                        m124123u(sb, i2, "case_sensitive", Boolean.valueOf(E.mo136505G()));
                    }
                    if (E.mo136502B() > 0) {
                        m124120r(sb, i2 + 1);
                        sb.append("expression_list {\n");
                        for (String append : E.mo136504F()) {
                            m124120r(sb, i2 + 2);
                            sb.append(append);
                            sb.append("\n");
                        }
                        sb.append("}\n");
                    }
                    m124120r(sb, i2);
                    sb.append("}\n");
                }
            }
            if (o3Var.mo137193J()) {
                m124124v(sb, i + 1, "number_filter", o3Var.mo137188D());
            }
            m124120r(sb, i);
            sb.append("}\n");
        }
    }

    @C0348i1
    /* renamed from: x */
    public final long mo87431x(byte[] bArr) {
        C40843u.m166202l(bArr);
        this.f74136a.mo87110N().mo86866h();
        MessageDigest t = C30906ua.m124216t();
        if (t != null) {
            return C30906ua.m124215s0(t.digest(bArr));
        }
        this.f74136a.mo86903d().mo87489r().mo87463a("Failed to get MD5");
        return 0;
    }

    /* renamed from: y */
    public final Bundle mo87432y(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, (String) null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(mo87432y((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.f74136a.mo86903d().mo87489r().mo87463a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable mo87433z(byte[] r5, android.os.Parcelable.Creator r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ ParseException -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ ParseException -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ ParseException -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ ParseException -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ ParseException -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002f
        L_0x001c:
            com.google.android.gms.measurement.internal.g5 r5 = r4.f74136a     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.u3 r5 = r5.mo86903d()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.s3 r5 = r5.mo87489r()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.mo87463a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002f:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C30846pa.mo87433z(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }
}
