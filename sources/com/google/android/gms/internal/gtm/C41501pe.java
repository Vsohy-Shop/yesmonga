package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.carrefour.fid.android.airship.util.C13758b;
import com.google.android.gms.analytics.ecommerce.C40381a;
import com.google.android.gms.analytics.ecommerce.C40382b;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.common.util.C40981h;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.urbanairship.iam.C9259x;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@C40974d0
/* renamed from: com.google.android.gms.internal.gtm.pe */
public final class C41501pe extends C41159b9 {

    /* renamed from: d */
    public static final String f104873d = zza.UNIVERSAL_ANALYTICS.toString();

    /* renamed from: e */
    public static final List<String> f104874e = Arrays.asList(new String[]{C40382b.f102934b, "checkout", C40382b.f102939g, "click", "add", "remove", "purchase", "refund"});

    /* renamed from: f */
    public static final Pattern f104875f = Pattern.compile("dimension(\\d+)");

    /* renamed from: g */
    public static final Pattern f104876g = Pattern.compile("metric(\\d+)");

    /* renamed from: h */
    public static final Set<String> f104877h = C40981h.m166628i("", "0", C13758b.f33438c);

    /* renamed from: i */
    public static final Map<String, String> f104878i = C40981h.m166625f("transactionId", "&ti", "transactionAffiliation", "&ta", "transactionTax", "&tt", "transactionShipping", "&ts", "transactionTotal", "&tr", "transactionCurrency", "&cu");

    /* renamed from: j */
    public static final Map<String, String> f104879j = C40981h.m166625f("name", "&in", "sku", "&ic", "category", "&iv", "price", "&ip", "quantity", "&iq", FirebaseAnalytics.C32532b.f78955i, "&cu");

    /* renamed from: a */
    public final C41639v8 f104880a;

    /* renamed from: b */
    public final C41181c7 f104881b;

    /* renamed from: c */
    public Map<String, Object> f104882c;

    public C41501pe(Context context, C41181c7 c7Var) {
        C41639v8 v8Var = new C41639v8(context);
        this.f104881b = c7Var;
        this.f104880a = v8Var;
    }

    /* renamed from: c */
    public static final Map<String, String> m168176c(C41310hg<?> hgVar) {
        C40843u.m166202l(hgVar);
        C40843u.m166191a(hgVar instanceof C41527qg);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C41623ug.m168493e(hgVar);
        Object g = C41623ug.m168495g(hgVar);
        C40843u.m166208r(g instanceof Map);
        for (Map.Entry entry : ((Map) g).entrySet()) {
            linkedHashMap.put(entry.getKey().toString(), entry.getValue().toString());
        }
        return linkedHashMap;
    }

    /* renamed from: d */
    public static final Double m168177d(Object obj) {
        String str;
        String str2;
        if (obj instanceof String) {
            try {
                return Double.valueOf((String) obj);
            } catch (NumberFormatException e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    str2 = "Cannot convert the object to Double: ".concat(valueOf);
                } else {
                    str2 = new String("Cannot convert the object to Double: ");
                }
                throw new RuntimeException(str2);
            }
        } else if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        } else {
            if (obj instanceof Double) {
                return (Double) obj;
            }
            String valueOf2 = String.valueOf(obj.toString());
            if (valueOf2.length() != 0) {
                str = "Cannot convert the object to Double: ".concat(valueOf2);
            } else {
                str = new String("Cannot convert the object to Double: ");
            }
            throw new RuntimeException(str);
        }
    }

    /* renamed from: e */
    public static final Integer m168178e(Object obj) {
        String str;
        String str2;
        if (obj instanceof String) {
            try {
                return Integer.valueOf((String) obj);
            } catch (NumberFormatException e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    str2 = "Cannot convert the object to Integer: ".concat(valueOf);
                } else {
                    str2 = new String("Cannot convert the object to Integer: ");
                }
                throw new RuntimeException(str2);
            }
        } else if (obj instanceof Double) {
            return Integer.valueOf(((Double) obj).intValue());
        } else {
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            String valueOf2 = String.valueOf(obj.toString());
            if (valueOf2.length() != 0) {
                str = "Cannot convert the object to Integer: ".concat(valueOf2);
            } else {
                str = new String("Cannot convert the object to Integer: ");
            }
            throw new RuntimeException(str);
        }
    }

    /* renamed from: f */
    public static final Map<String, String> m168179f(C41310hg<?> hgVar) {
        Map<String, String> c = m168176c(hgVar);
        String str = c.get("&aip");
        if (str != null && f104877h.contains(str.toLowerCase())) {
            c.remove("&aip");
        }
        return c;
    }

    /* renamed from: g */
    public static final C40381a m168180g(Map<String, Object> map) {
        String str;
        String str2;
        C40381a aVar = new C40381a();
        Object obj = map.get("id");
        if (obj != null) {
            aVar.mo133306f(String.valueOf(obj));
        }
        Object obj2 = map.get("name");
        if (obj2 != null) {
            aVar.mo133307g(String.valueOf(obj2));
        }
        Object obj3 = map.get("brand");
        if (obj3 != null) {
            aVar.mo133301a(String.valueOf(obj3));
        }
        Object obj4 = map.get("category");
        if (obj4 != null) {
            aVar.mo133302b(String.valueOf(obj4));
        }
        Object obj5 = map.get("variant");
        if (obj5 != null) {
            aVar.mo133311k(String.valueOf(obj5));
        }
        Object obj6 = map.get(FirebaseAnalytics.C32532b.f78957j);
        if (obj6 != null) {
            aVar.mo133303c(String.valueOf(obj6));
        }
        Object obj7 = map.get(C9259x.f25239v);
        if (obj7 != null) {
            aVar.mo133308h(m168178e(obj7).intValue());
        }
        Object obj8 = map.get("price");
        if (obj8 != null) {
            aVar.mo133309i(m168177d(obj8).doubleValue());
        }
        Object obj9 = map.get("quantity");
        if (obj9 != null) {
            aVar.mo133310j(m168178e(obj9).intValue());
        }
        for (String next : map.keySet()) {
            Matcher matcher = f104875f.matcher(next);
            if (matcher.matches()) {
                try {
                    aVar.mo133304d(Integer.parseInt(matcher.group(1)), String.valueOf(map.get(next)));
                } catch (NumberFormatException unused) {
                    String valueOf = String.valueOf(next);
                    if (valueOf.length() != 0) {
                        str2 = "illegal number in custom dimension value: ".concat(valueOf);
                    } else {
                        str2 = new String("illegal number in custom dimension value: ");
                    }
                    C41493p6.m168153e(str2);
                }
            } else {
                Matcher matcher2 = f104876g.matcher(next);
                if (matcher2.matches()) {
                    try {
                        aVar.mo133305e(Integer.parseInt(matcher2.group(1)), m168178e(map.get(next)).intValue());
                    } catch (NumberFormatException unused2) {
                        String valueOf2 = String.valueOf(next);
                        if (valueOf2.length() != 0) {
                            str = "illegal number in custom metric value: ".concat(valueOf2);
                        } else {
                            str = new String("illegal number in custom metric value: ");
                        }
                        C41493p6.m168153e(str);
                    }
                }
            }
        }
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:141:0x021b, code lost:
        r6 = (java.util.Map) r9.get(r4);
        r0 = (java.util.List) r6.get("products");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x022a, code lost:
        if (r0 == null) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x022c, code lost:
        r7 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0234, code lost:
        if (r7.hasNext() == false) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:?, code lost:
        r5.mo133336b(m168180g((java.util.Map) r7.next()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0244, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:?, code lost:
        r0 = java.lang.String.valueOf(r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0251, code lost:
        if (r0.length() != 0) goto L_0x0253;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0253, code lost:
        r0 = "Failed to extract a product from event data. ".concat(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0258, code lost:
        r0 = new java.lang.String("Failed to extract a product from event data. ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x025d, code lost:
        com.google.android.gms.internal.gtm.C41493p6.m168149a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0265, code lost:
        if (r6.containsKey("actionField") == false) goto L_0x0306;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0267, code lost:
        r0 = (java.util.Map) r6.get("actionField");
        r2 = new com.google.android.gms.analytics.ecommerce.C40382b(r4);
        r3 = r0.get("id");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0276, code lost:
        if (r3 == null) goto L_0x027f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0278, code lost:
        r2.mo133321g(java.lang.String.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x027f, code lost:
        r3 = r0.get(com.google.firebase.analytics.FirebaseAnalytics.C32532b.f78935W);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0285, code lost:
        if (r3 == null) goto L_0x028e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0287, code lost:
        r2.mo133319e(java.lang.String.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x028e, code lost:
        r3 = r0.get(com.google.firebase.analytics.FirebaseAnalytics.C32532b.f78957j);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0294, code lost:
        if (r3 == null) goto L_0x029d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0296, code lost:
        r2.mo133320f(java.lang.String.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x029d, code lost:
        r3 = r0.get("list");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02a1, code lost:
        if (r3 == null) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02a3, code lost:
        r2.mo133317c(java.lang.String.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02aa, code lost:
        r3 = r0.get("option");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02b0, code lost:
        if (r3 == null) goto L_0x02b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x02b2, code lost:
        r2.mo133315a(java.lang.String.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02b9, code lost:
        r3 = r0.get("revenue");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x02bf, code lost:
        if (r3 == null) goto L_0x02cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x02c1, code lost:
        r2.mo133322h(m168177d(r3).doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x02cc, code lost:
        r3 = r0.get(com.google.firebase.analytics.FirebaseAnalytics.C32532b.f78921I);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x02d2, code lost:
        if (r3 == null) goto L_0x02df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x02d4, code lost:
        r2.mo133324j(m168177d(r3).doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x02df, code lost:
        r3 = r0.get(com.google.firebase.analytics.FirebaseAnalytics.C32532b.f78917E);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x02e5, code lost:
        if (r3 == null) goto L_0x02f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x02e7, code lost:
        r2.mo133323i(m168177d(r3).doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x02f2, code lost:
        r0 = r0.get("step");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x02f8, code lost:
        if (r0 == null) goto L_0x030b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x02fa, code lost:
        r2.mo133316b(m168178e(r0).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0306, code lost:
        r2 = new com.google.android.gms.analytics.ecommerce.C40382b(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x030b, code lost:
        r5.mo133343n(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x030f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:?, code lost:
        r0 = java.lang.String.valueOf(r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x031e, code lost:
        if (r0.length() != 0) goto L_0x0320;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0320, code lost:
        r0 = "Failed to extract a product action from event data. ".concat(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0325, code lost:
        r0 = new java.lang.String("Failed to extract a product action from event data. ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x032a, code lost:
        com.google.android.gms.internal.gtm.C41493p6.m168149a(r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0335 A[Catch:{ RuntimeException -> 0x013d, all -> 0x046e }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009f A[Catch:{ RuntimeException -> 0x013d, all -> 0x046e }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ac A[Catch:{ RuntimeException -> 0x013d, all -> 0x046e }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d2 A[SYNTHETIC, Splitter:B:62:0x00d2] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.gtm.C41310hg<?> mo135004b(com.google.android.gms.internal.gtm.C41277g7 r19, com.google.android.gms.internal.gtm.C41310hg<?>... r20) {
        /*
            r18 = this;
            r1 = r18
            r0 = r20
            java.lang.String r2 = "actionField"
            java.lang.String r3 = "promoView"
            java.lang.String r4 = "&cu"
            java.lang.String r5 = "&t"
            java.lang.String r6 = "promoClick"
            r7 = 1
            com.google.android.gms.common.internal.C40843u.m166191a(r7)
            int r8 = r0.length
            r9 = 0
            if (r8 <= 0) goto L_0x0018
            r10 = r7
            goto L_0x0019
        L_0x0018:
            r10 = r9
        L_0x0019:
            com.google.android.gms.common.internal.C40843u.m166191a(r10)
            com.google.android.gms.internal.gtm.c7 r11 = r1.f104881b     // Catch:{ all -> 0x046e }
            com.google.android.gms.internal.gtm.a6 r11 = r11.zza()     // Catch:{ all -> 0x046e }
            android.os.Bundle r11 = r11.mo134997d()     // Catch:{ all -> 0x046e }
            java.util.Map r11 = com.google.android.gms.internal.gtm.C41623ug.m168496h(r11)     // Catch:{ all -> 0x046e }
            r1.f104882c = r11     // Catch:{ all -> 0x046e }
            r11 = r0[r9]     // Catch:{ all -> 0x046e }
            if (r8 <= r7) goto L_0x0033
            r12 = r0[r7]     // Catch:{ all -> 0x046e }
            goto L_0x003a
        L_0x0033:
            com.google.android.gms.internal.gtm.ig r12 = new com.google.android.gms.internal.gtm.ig     // Catch:{ all -> 0x046e }
            java.lang.Boolean r13 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x046e }
            r12.<init>(r13)     // Catch:{ all -> 0x046e }
        L_0x003a:
            r13 = 2
            if (r8 <= r13) goto L_0x0040
            r13 = r0[r13]     // Catch:{ all -> 0x046e }
            goto L_0x0047
        L_0x0040:
            com.google.android.gms.internal.gtm.ig r13 = new com.google.android.gms.internal.gtm.ig     // Catch:{ all -> 0x046e }
            java.lang.Boolean r14 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x046e }
            r13.<init>(r14)     // Catch:{ all -> 0x046e }
        L_0x0047:
            r14 = 3
            if (r8 <= r14) goto L_0x004d
            r14 = r0[r14]     // Catch:{ all -> 0x046e }
            goto L_0x004f
        L_0x004d:
            com.google.android.gms.internal.gtm.mg r14 = com.google.android.gms.internal.gtm.C41431mg.f104800h     // Catch:{ all -> 0x046e }
        L_0x004f:
            r15 = 4
            if (r8 <= r15) goto L_0x0055
            r15 = r0[r15]     // Catch:{ all -> 0x046e }
            goto L_0x0057
        L_0x0055:
            com.google.android.gms.internal.gtm.mg r15 = com.google.android.gms.internal.gtm.C41431mg.f104800h     // Catch:{ all -> 0x046e }
        L_0x0057:
            r7 = 5
            if (r8 <= r7) goto L_0x005d
            r7 = r0[r7]     // Catch:{ all -> 0x046e }
            goto L_0x0064
        L_0x005d:
            com.google.android.gms.internal.gtm.ig r7 = new com.google.android.gms.internal.gtm.ig     // Catch:{ all -> 0x046e }
            java.lang.Boolean r9 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x046e }
            r7.<init>(r9)     // Catch:{ all -> 0x046e }
        L_0x0064:
            r9 = 6
            if (r8 <= r9) goto L_0x006a
            r9 = r0[r9]     // Catch:{ all -> 0x046e }
            goto L_0x0071
        L_0x006a:
            com.google.android.gms.internal.gtm.ig r9 = new com.google.android.gms.internal.gtm.ig     // Catch:{ all -> 0x046e }
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x046e }
            r9.<init>(r10)     // Catch:{ all -> 0x046e }
        L_0x0071:
            r10 = 7
            if (r8 <= r10) goto L_0x0077
            r10 = r0[r10]     // Catch:{ all -> 0x046e }
            goto L_0x0079
        L_0x0077:
            com.google.android.gms.internal.gtm.mg r10 = com.google.android.gms.internal.gtm.C41431mg.f104800h     // Catch:{ all -> 0x046e }
        L_0x0079:
            r17 = r5
            r5 = 8
            if (r8 <= r5) goto L_0x0082
            r0 = r0[r5]     // Catch:{ all -> 0x046e }
            goto L_0x0089
        L_0x0082:
            com.google.android.gms.internal.gtm.ig r0 = new com.google.android.gms.internal.gtm.ig     // Catch:{ all -> 0x046e }
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x046e }
            r0.<init>(r5)     // Catch:{ all -> 0x046e }
        L_0x0089:
            boolean r5 = r11 instanceof com.google.android.gms.internal.gtm.C41527qg     // Catch:{ all -> 0x046e }
            com.google.android.gms.common.internal.C40843u.m166191a(r5)     // Catch:{ all -> 0x046e }
            com.google.android.gms.internal.gtm.mg r5 = com.google.android.gms.internal.gtm.C41431mg.f104800h     // Catch:{ all -> 0x046e }
            if (r14 == r5) goto L_0x0099
            boolean r8 = r14 instanceof com.google.android.gms.internal.gtm.C41527qg     // Catch:{ all -> 0x046e }
            if (r8 == 0) goto L_0x0097
            goto L_0x0099
        L_0x0097:
            r8 = 0
            goto L_0x009a
        L_0x0099:
            r8 = 1
        L_0x009a:
            com.google.android.gms.common.internal.C40843u.m166191a(r8)     // Catch:{ all -> 0x046e }
            if (r15 == r5) goto L_0x00a6
            boolean r8 = r15 instanceof com.google.android.gms.internal.gtm.C41527qg     // Catch:{ all -> 0x046e }
            if (r8 == 0) goto L_0x00a4
            goto L_0x00a6
        L_0x00a4:
            r8 = 0
            goto L_0x00a7
        L_0x00a6:
            r8 = 1
        L_0x00a7:
            com.google.android.gms.common.internal.C40843u.m166191a(r8)     // Catch:{ all -> 0x046e }
            if (r10 == r5) goto L_0x00b4
            boolean r8 = r10 instanceof com.google.android.gms.internal.gtm.C41527qg     // Catch:{ all -> 0x046e }
            if (r8 == 0) goto L_0x00b1
            goto L_0x00b4
        L_0x00b1:
            r16 = 0
            goto L_0x00b6
        L_0x00b4:
            r16 = 1
        L_0x00b6:
            com.google.android.gms.common.internal.C40843u.m166191a(r16)     // Catch:{ all -> 0x046e }
            com.google.android.gms.internal.gtm.v8 r8 = r1.f104880a     // Catch:{ all -> 0x046e }
            r16 = r15
            java.lang.String r15 = "_GTM_DEFAULT_TRACKER_"
            com.google.android.gms.analytics.i r8 = r8.mo135974a(r15)     // Catch:{ all -> 0x046e }
            boolean r0 = com.google.android.gms.internal.gtm.C41135a9.m167073g(r0)     // Catch:{ all -> 0x046e }
            r8.mo133401X(r0)     // Catch:{ all -> 0x046e }
            boolean r0 = com.google.android.gms.internal.gtm.C41135a9.m167073g(r7)     // Catch:{ all -> 0x046e }
            java.lang.String r7 = "name"
            if (r0 == 0) goto L_0x0335
            com.google.android.gms.analytics.f$f r5 = new com.google.android.gms.analytics.f$f     // Catch:{ all -> 0x046e }
            r5.<init>()     // Catch:{ all -> 0x046e }
            java.util.Map r0 = m168179f(r11)     // Catch:{ all -> 0x046e }
            r5.mo133354g(r0)     // Catch:{ all -> 0x046e }
            boolean r9 = com.google.android.gms.internal.gtm.C41135a9.m167073g(r9)     // Catch:{ all -> 0x046e }
            if (r9 == 0) goto L_0x00ed
            java.util.Map<java.lang.String, java.lang.Object> r9 = r1.f104882c     // Catch:{ all -> 0x046e }
            java.lang.String r10 = "ecommerce"
            java.lang.Object r9 = r9.get(r10)     // Catch:{ all -> 0x046e }
            goto L_0x00f4
        L_0x00ed:
            com.google.android.gms.internal.gtm.C41623ug.m168493e(r10)     // Catch:{ all -> 0x046e }
            java.lang.Object r9 = com.google.android.gms.internal.gtm.C41623ug.m168495g(r10)     // Catch:{ all -> 0x046e }
        L_0x00f4:
            boolean r10 = r9 instanceof java.util.Map     // Catch:{ all -> 0x046e }
            if (r10 == 0) goto L_0x032d
            java.util.Map r9 = (java.util.Map) r9     // Catch:{ all -> 0x046e }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x046e }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x046e }
            if (r0 != 0) goto L_0x010a
            java.lang.String r0 = "currencyCode"
            java.lang.Object r0 = r9.get(r0)     // Catch:{ all -> 0x046e }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x046e }
        L_0x010a:
            if (r0 == 0) goto L_0x010f
            r5.mo133353f(r4, r0)     // Catch:{ all -> 0x046e }
        L_0x010f:
            java.lang.String r0 = "impressions"
            java.lang.Object r0 = r9.get(r0)     // Catch:{ all -> 0x046e }
            boolean r4 = r0 instanceof java.util.List     // Catch:{ all -> 0x046e }
            java.lang.String r10 = "Failed to extract a product from event data. "
            java.lang.String r11 = "list"
            if (r4 == 0) goto L_0x015a
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x046e }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x046e }
        L_0x0123:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x046e }
            if (r0 == 0) goto L_0x015a
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x046e }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x046e }
            com.google.android.gms.analytics.ecommerce.a r12 = m168180g(r0)     // Catch:{ RuntimeException -> 0x013d }
            java.lang.Object r0 = r0.get(r11)     // Catch:{ RuntimeException -> 0x013d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ RuntimeException -> 0x013d }
            r5.mo133335a(r12, r0)     // Catch:{ RuntimeException -> 0x013d }
            goto L_0x0123
        L_0x013d:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x046e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x046e }
            int r12 = r0.length()     // Catch:{ all -> 0x046e }
            if (r12 == 0) goto L_0x0151
            java.lang.String r0 = r10.concat(r0)     // Catch:{ all -> 0x046e }
            goto L_0x0156
        L_0x0151:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x046e }
            r0.<init>(r10)     // Catch:{ all -> 0x046e }
        L_0x0156:
            com.google.android.gms.internal.gtm.C41493p6.m168149a(r0)     // Catch:{ all -> 0x046e }
            goto L_0x0123
        L_0x015a:
            boolean r0 = r9.containsKey(r6)     // Catch:{ all -> 0x046e }
            java.lang.String r4 = "promotions"
            if (r0 == 0) goto L_0x016f
            java.lang.Object r0 = r9.get(r6)     // Catch:{ all -> 0x046e }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x046e }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x046e }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x046e }
            goto L_0x0183
        L_0x016f:
            boolean r0 = r9.containsKey(r3)     // Catch:{ all -> 0x046e }
            if (r0 == 0) goto L_0x0182
            java.lang.Object r0 = r9.get(r3)     // Catch:{ all -> 0x046e }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x046e }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x046e }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x046e }
            goto L_0x0183
        L_0x0182:
            r0 = 0
        L_0x0183:
            java.lang.String r3 = "id"
            if (r0 == 0) goto L_0x0203
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x046e }
        L_0x018b:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x046e }
            if (r0 == 0) goto L_0x01ef
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x046e }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x046e }
            com.google.android.gms.analytics.ecommerce.c r12 = new com.google.android.gms.analytics.ecommerce.c     // Catch:{ RuntimeException -> 0x01d0 }
            r12.<init>()     // Catch:{ RuntimeException -> 0x01d0 }
            java.lang.Object r13 = r0.get(r3)     // Catch:{ RuntimeException -> 0x01d0 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ RuntimeException -> 0x01d0 }
            if (r13 == 0) goto L_0x01a7
            r12.mo133329b(r13)     // Catch:{ RuntimeException -> 0x01d0 }
        L_0x01a7:
            java.lang.Object r13 = r0.get(r7)     // Catch:{ RuntimeException -> 0x01d0 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ RuntimeException -> 0x01d0 }
            if (r13 == 0) goto L_0x01b2
            r12.mo133330c(r13)     // Catch:{ RuntimeException -> 0x01d0 }
        L_0x01b2:
            java.lang.String r13 = "creative"
            java.lang.Object r13 = r0.get(r13)     // Catch:{ RuntimeException -> 0x01d0 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ RuntimeException -> 0x01d0 }
            if (r13 == 0) goto L_0x01bf
            r12.mo133328a(r13)     // Catch:{ RuntimeException -> 0x01d0 }
        L_0x01bf:
            java.lang.String r13 = "position"
            java.lang.Object r0 = r0.get(r13)     // Catch:{ RuntimeException -> 0x01d0 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ RuntimeException -> 0x01d0 }
            if (r0 == 0) goto L_0x01cc
            r12.mo133331d(r0)     // Catch:{ RuntimeException -> 0x01d0 }
        L_0x01cc:
            r5.mo133337c(r12)     // Catch:{ RuntimeException -> 0x01d0 }
            goto L_0x018b
        L_0x01d0:
            r0 = move-exception
            java.lang.String r12 = "Failed to extract a promotion from event data. "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x046e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x046e }
            int r13 = r0.length()     // Catch:{ all -> 0x046e }
            if (r13 == 0) goto L_0x01e6
            java.lang.String r0 = r12.concat(r0)     // Catch:{ all -> 0x046e }
            goto L_0x01eb
        L_0x01e6:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x046e }
            r0.<init>(r12)     // Catch:{ all -> 0x046e }
        L_0x01eb:
            com.google.android.gms.internal.gtm.C41493p6.m168149a(r0)     // Catch:{ all -> 0x046e }
            goto L_0x018b
        L_0x01ef:
            boolean r0 = r9.containsKey(r6)     // Catch:{ all -> 0x046e }
            java.lang.String r4 = "&promoa"
            if (r0 == 0) goto L_0x01fe
            java.lang.String r0 = "click"
            r5.mo133353f(r4, r0)     // Catch:{ all -> 0x046e }
            goto L_0x032d
        L_0x01fe:
            java.lang.String r0 = "view"
            r5.mo133353f(r4, r0)     // Catch:{ all -> 0x046e }
        L_0x0203:
            java.util.List<java.lang.String> r0 = f104874e     // Catch:{ all -> 0x046e }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x046e }
        L_0x0209:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x046e }
            if (r4 == 0) goto L_0x032d
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x046e }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x046e }
            boolean r6 = r9.containsKey(r4)     // Catch:{ all -> 0x046e }
            if (r6 == 0) goto L_0x0209
            java.lang.Object r0 = r9.get(r4)     // Catch:{ all -> 0x046e }
            r6 = r0
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ all -> 0x046e }
            java.lang.String r0 = "products"
            java.lang.Object r0 = r6.get(r0)     // Catch:{ all -> 0x046e }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x046e }
            if (r0 == 0) goto L_0x0261
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x046e }
        L_0x0230:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x046e }
            if (r0 == 0) goto L_0x0261
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x046e }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x046e }
            com.google.android.gms.analytics.ecommerce.a r0 = m168180g(r0)     // Catch:{ RuntimeException -> 0x0244 }
            r5.mo133336b(r0)     // Catch:{ RuntimeException -> 0x0244 }
            goto L_0x0230
        L_0x0244:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x046e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x046e }
            int r9 = r0.length()     // Catch:{ all -> 0x046e }
            if (r9 == 0) goto L_0x0258
            java.lang.String r0 = r10.concat(r0)     // Catch:{ all -> 0x046e }
            goto L_0x025d
        L_0x0258:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x046e }
            r0.<init>(r10)     // Catch:{ all -> 0x046e }
        L_0x025d:
            com.google.android.gms.internal.gtm.C41493p6.m168149a(r0)     // Catch:{ all -> 0x046e }
            goto L_0x0230
        L_0x0261:
            boolean r0 = r6.containsKey(r2)     // Catch:{ RuntimeException -> 0x030f }
            if (r0 == 0) goto L_0x0306
            java.lang.Object r0 = r6.get(r2)     // Catch:{ RuntimeException -> 0x030f }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ RuntimeException -> 0x030f }
            com.google.android.gms.analytics.ecommerce.b r2 = new com.google.android.gms.analytics.ecommerce.b     // Catch:{ RuntimeException -> 0x030f }
            r2.<init>(r4)     // Catch:{ RuntimeException -> 0x030f }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ RuntimeException -> 0x030f }
            if (r3 == 0) goto L_0x027f
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ RuntimeException -> 0x030f }
            r2.mo133321g(r3)     // Catch:{ RuntimeException -> 0x030f }
        L_0x027f:
            java.lang.String r3 = "affiliation"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ RuntimeException -> 0x030f }
            if (r3 == 0) goto L_0x028e
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ RuntimeException -> 0x030f }
            r2.mo133319e(r3)     // Catch:{ RuntimeException -> 0x030f }
        L_0x028e:
            java.lang.String r3 = "coupon"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ RuntimeException -> 0x030f }
            if (r3 == 0) goto L_0x029d
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ RuntimeException -> 0x030f }
            r2.mo133320f(r3)     // Catch:{ RuntimeException -> 0x030f }
        L_0x029d:
            java.lang.Object r3 = r0.get(r11)     // Catch:{ RuntimeException -> 0x030f }
            if (r3 == 0) goto L_0x02aa
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ RuntimeException -> 0x030f }
            r2.mo133317c(r3)     // Catch:{ RuntimeException -> 0x030f }
        L_0x02aa:
            java.lang.String r3 = "option"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ RuntimeException -> 0x030f }
            if (r3 == 0) goto L_0x02b9
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ RuntimeException -> 0x030f }
            r2.mo133315a(r3)     // Catch:{ RuntimeException -> 0x030f }
        L_0x02b9:
            java.lang.String r3 = "revenue"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ RuntimeException -> 0x030f }
            if (r3 == 0) goto L_0x02cc
            java.lang.Double r3 = m168177d(r3)     // Catch:{ RuntimeException -> 0x030f }
            double r3 = r3.doubleValue()     // Catch:{ RuntimeException -> 0x030f }
            r2.mo133322h(r3)     // Catch:{ RuntimeException -> 0x030f }
        L_0x02cc:
            java.lang.String r3 = "tax"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ RuntimeException -> 0x030f }
            if (r3 == 0) goto L_0x02df
            java.lang.Double r3 = m168177d(r3)     // Catch:{ RuntimeException -> 0x030f }
            double r3 = r3.doubleValue()     // Catch:{ RuntimeException -> 0x030f }
            r2.mo133324j(r3)     // Catch:{ RuntimeException -> 0x030f }
        L_0x02df:
            java.lang.String r3 = "shipping"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ RuntimeException -> 0x030f }
            if (r3 == 0) goto L_0x02f2
            java.lang.Double r3 = m168177d(r3)     // Catch:{ RuntimeException -> 0x030f }
            double r3 = r3.doubleValue()     // Catch:{ RuntimeException -> 0x030f }
            r2.mo133323i(r3)     // Catch:{ RuntimeException -> 0x030f }
        L_0x02f2:
            java.lang.String r3 = "step"
            java.lang.Object r0 = r0.get(r3)     // Catch:{ RuntimeException -> 0x030f }
            if (r0 == 0) goto L_0x030b
            java.lang.Integer r0 = m168178e(r0)     // Catch:{ RuntimeException -> 0x030f }
            int r0 = r0.intValue()     // Catch:{ RuntimeException -> 0x030f }
            r2.mo133316b(r0)     // Catch:{ RuntimeException -> 0x030f }
            goto L_0x030b
        L_0x0306:
            com.google.android.gms.analytics.ecommerce.b r2 = new com.google.android.gms.analytics.ecommerce.b     // Catch:{ RuntimeException -> 0x030f }
            r2.<init>(r4)     // Catch:{ RuntimeException -> 0x030f }
        L_0x030b:
            r5.mo133343n(r2)     // Catch:{ RuntimeException -> 0x030f }
            goto L_0x032d
        L_0x030f:
            r0 = move-exception
            java.lang.String r2 = "Failed to extract a product action from event data. "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x046e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x046e }
            int r3 = r0.length()     // Catch:{ all -> 0x046e }
            if (r3 == 0) goto L_0x0325
            java.lang.String r0 = r2.concat(r0)     // Catch:{ all -> 0x046e }
            goto L_0x032a
        L_0x0325:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x046e }
            r0.<init>(r2)     // Catch:{ all -> 0x046e }
        L_0x032a:
            com.google.android.gms.internal.gtm.C41493p6.m168149a(r0)     // Catch:{ all -> 0x046e }
        L_0x032d:
            java.util.Map r0 = r5.mo133351d()     // Catch:{ all -> 0x046e }
            r8.mo133406c0(r0)     // Catch:{ all -> 0x046e }
            goto L_0x0342
        L_0x0335:
            boolean r0 = com.google.android.gms.internal.gtm.C41135a9.m167073g(r12)     // Catch:{ all -> 0x046e }
            if (r0 == 0) goto L_0x0345
            java.util.Map r0 = m168179f(r11)     // Catch:{ all -> 0x046e }
            r8.mo133406c0(r0)     // Catch:{ all -> 0x046e }
        L_0x0342:
            r2 = 0
            goto L_0x0469
        L_0x0345:
            boolean r0 = com.google.android.gms.internal.gtm.C41135a9.m167073g(r13)     // Catch:{ all -> 0x046e }
            if (r0 == 0) goto L_0x0462
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.f104882c     // Catch:{ all -> 0x046e }
            java.lang.String r2 = "transactionId"
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x046e }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x046e }
            if (r0 != 0) goto L_0x035d
            java.lang.String r0 = "Cannot find transactionId in data layer."
            com.google.android.gms.internal.gtm.C41493p6.m168149a(r0)     // Catch:{ all -> 0x046e }
            goto L_0x0342
        L_0x035d:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x046e }
            r2.<init>()     // Catch:{ all -> 0x046e }
            java.util.Map r3 = m168179f(r11)     // Catch:{ IllegalArgumentException -> 0x045a }
            java.lang.String r4 = "transaction"
            r6 = r17
            r3.put(r6, r4)     // Catch:{ IllegalArgumentException -> 0x045a }
            if (r14 != r5) goto L_0x0372
            java.util.Map<java.lang.String, java.lang.String> r4 = f104878i     // Catch:{ IllegalArgumentException -> 0x045a }
            goto L_0x0376
        L_0x0372:
            java.util.Map r4 = m168176c(r14)     // Catch:{ IllegalArgumentException -> 0x045a }
        L_0x0376:
            java.util.Set r4 = r4.entrySet()     // Catch:{ IllegalArgumentException -> 0x045a }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IllegalArgumentException -> 0x045a }
        L_0x037e:
            boolean r5 = r4.hasNext()     // Catch:{ IllegalArgumentException -> 0x045a }
            if (r5 == 0) goto L_0x03a2
            java.lang.Object r5 = r4.next()     // Catch:{ IllegalArgumentException -> 0x045a }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ IllegalArgumentException -> 0x045a }
            java.util.Map<java.lang.String, java.lang.Object> r9 = r1.f104882c     // Catch:{ IllegalArgumentException -> 0x045a }
            java.lang.Object r10 = r5.getKey()     // Catch:{ IllegalArgumentException -> 0x045a }
            java.lang.Object r9 = r9.get(r10)     // Catch:{ IllegalArgumentException -> 0x045a }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ IllegalArgumentException -> 0x045a }
            if (r9 == 0) goto L_0x037e
            java.lang.Object r5 = r5.getValue()     // Catch:{ IllegalArgumentException -> 0x045a }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IllegalArgumentException -> 0x045a }
            r3.put(r5, r9)     // Catch:{ IllegalArgumentException -> 0x045a }
            goto L_0x037e
        L_0x03a2:
            r2.add(r3)     // Catch:{ IllegalArgumentException -> 0x045a }
            java.util.Map<java.lang.String, java.lang.Object> r3 = r1.f104882c     // Catch:{ IllegalArgumentException -> 0x045a }
            java.lang.String r4 = "transactionProducts"
            java.lang.Object r3 = r3.get(r4)     // Catch:{ IllegalArgumentException -> 0x045a }
            if (r3 != 0) goto L_0x03b1
            r3 = 0
            goto L_0x03d2
        L_0x03b1:
            boolean r4 = r3 instanceof java.util.List     // Catch:{ IllegalArgumentException -> 0x045a }
            if (r4 == 0) goto L_0x0452
            java.util.List r3 = (java.util.List) r3     // Catch:{ IllegalArgumentException -> 0x045a }
            java.util.Iterator r4 = r3.iterator()     // Catch:{ IllegalArgumentException -> 0x045a }
        L_0x03bb:
            boolean r5 = r4.hasNext()     // Catch:{ IllegalArgumentException -> 0x045a }
            if (r5 == 0) goto L_0x03d2
            java.lang.Object r5 = r4.next()     // Catch:{ IllegalArgumentException -> 0x045a }
            boolean r5 = r5 instanceof java.util.Map     // Catch:{ IllegalArgumentException -> 0x045a }
            if (r5 == 0) goto L_0x03ca
            goto L_0x03bb
        L_0x03ca:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x045a }
            java.lang.String r2 = "Each element of transactionProducts should be of type Map."
            r0.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x045a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x045a }
        L_0x03d2:
            if (r3 == 0) goto L_0x043e
            java.util.Iterator r3 = r3.iterator()     // Catch:{ IllegalArgumentException -> 0x045a }
        L_0x03d8:
            boolean r4 = r3.hasNext()     // Catch:{ IllegalArgumentException -> 0x045a }
            if (r4 == 0) goto L_0x043e
            java.lang.Object r4 = r3.next()     // Catch:{ IllegalArgumentException -> 0x045a }
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ IllegalArgumentException -> 0x045a }
            java.lang.Object r5 = r4.get(r7)     // Catch:{ IllegalArgumentException -> 0x045a }
            if (r5 != 0) goto L_0x03f1
            java.lang.String r0 = "Unable to send transaction item hit due to missing 'name' field."
            com.google.android.gms.internal.gtm.C41493p6.m168149a(r0)     // Catch:{ IllegalArgumentException -> 0x045a }
            goto L_0x0342
        L_0x03f1:
            java.util.Map r5 = m168179f(r11)     // Catch:{ IllegalArgumentException -> 0x045a }
            java.lang.String r9 = "item"
            r5.put(r6, r9)     // Catch:{ IllegalArgumentException -> 0x045a }
            java.lang.String r9 = "&ti"
            r5.put(r9, r0)     // Catch:{ IllegalArgumentException -> 0x045a }
            com.google.android.gms.internal.gtm.mg r9 = com.google.android.gms.internal.gtm.C41431mg.f104800h     // Catch:{ IllegalArgumentException -> 0x045a }
            r15 = r16
            if (r15 != r9) goto L_0x0408
            java.util.Map<java.lang.String, java.lang.String> r9 = f104879j     // Catch:{ IllegalArgumentException -> 0x045a }
            goto L_0x040c
        L_0x0408:
            java.util.Map r9 = m168176c(r15)     // Catch:{ IllegalArgumentException -> 0x045a }
        L_0x040c:
            java.util.Set r9 = r9.entrySet()     // Catch:{ IllegalArgumentException -> 0x045a }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ IllegalArgumentException -> 0x045a }
        L_0x0414:
            boolean r10 = r9.hasNext()     // Catch:{ IllegalArgumentException -> 0x045a }
            if (r10 == 0) goto L_0x0438
            java.lang.Object r10 = r9.next()     // Catch:{ IllegalArgumentException -> 0x045a }
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10     // Catch:{ IllegalArgumentException -> 0x045a }
            java.lang.Object r12 = r10.getKey()     // Catch:{ IllegalArgumentException -> 0x045a }
            java.lang.Object r12 = r4.get(r12)     // Catch:{ IllegalArgumentException -> 0x045a }
            if (r12 == 0) goto L_0x0414
            java.lang.Object r10 = r10.getValue()     // Catch:{ IllegalArgumentException -> 0x045a }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ IllegalArgumentException -> 0x045a }
            java.lang.String r12 = r12.toString()     // Catch:{ IllegalArgumentException -> 0x045a }
            r5.put(r10, r12)     // Catch:{ IllegalArgumentException -> 0x045a }
            goto L_0x0414
        L_0x0438:
            r2.add(r5)     // Catch:{ IllegalArgumentException -> 0x045a }
            r16 = r15
            goto L_0x03d8
        L_0x043e:
            java.util.Iterator r0 = r2.iterator()     // Catch:{ IllegalArgumentException -> 0x045a }
        L_0x0442:
            boolean r2 = r0.hasNext()     // Catch:{ IllegalArgumentException -> 0x045a }
            if (r2 == 0) goto L_0x0342
            java.lang.Object r2 = r0.next()     // Catch:{ IllegalArgumentException -> 0x045a }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ IllegalArgumentException -> 0x045a }
            r8.mo133406c0(r2)     // Catch:{ IllegalArgumentException -> 0x045a }
            goto L_0x0442
        L_0x0452:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x045a }
            java.lang.String r2 = "transactionProducts should be of type List."
            r0.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x045a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x045a }
        L_0x045a:
            r0 = move-exception
            java.lang.String r2 = "Unable to send transaction"
            com.google.android.gms.internal.gtm.C41493p6.m168150b(r2, r0)     // Catch:{ all -> 0x046e }
            goto L_0x0342
        L_0x0462:
            java.lang.String r0 = "Ignoring unknown tag."
            com.google.android.gms.internal.gtm.C41493p6.m168153e(r0)     // Catch:{ all -> 0x046e }
            goto L_0x0342
        L_0x0469:
            r1.f104882c = r2
            com.google.android.gms.internal.gtm.mg r0 = com.google.android.gms.internal.gtm.C41431mg.f104800h
            return r0
        L_0x046e:
            r0 = move-exception
            r2 = 0
            r1.f104882c = r2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C41501pe.mo135004b(com.google.android.gms.internal.gtm.g7, com.google.android.gms.internal.gtm.hg[]):com.google.android.gms.internal.gtm.hg");
    }
}
