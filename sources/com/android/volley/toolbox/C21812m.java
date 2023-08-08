package com.android.volley.toolbox;

import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.android.volley.C21751e;
import com.android.volley.C21759i;
import com.android.volley.C21762l;
import com.android.volley.C21776s;
import com.carrefour.fid.android.shared.util.C28932h;
import com.google.firebase.installations.remote.C33122c;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import p073j$.util.DesugarTimeZone;

/* renamed from: com.android.volley.toolbox.m */
public class C21812m {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: a */
    public static final String f56428a = "Content-Type";

    /* renamed from: b */
    public static final String f56429b = "ISO-8859-1";

    /* renamed from: c */
    public static final String f56430c = "EEE, dd MMM yyyy HH:mm:ss zzz";

    /* renamed from: d */
    public static final String f56431d = "EEE, dd MMM yyyy HH:mm:ss 'GMT'";

    /* renamed from: a */
    public static List<C21759i> m100211a(List<C21759i> list, C21751e.C21752a aVar) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            for (C21759i a : list) {
                treeSet.add(a.mo64934a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<C21759i> list2 = aVar.f56267h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (C21759i next : aVar.f56267h) {
                    if (!treeSet.contains(next.mo64934a())) {
                        arrayList.add(next);
                    }
                }
            }
        } else if (!aVar.f56266g.isEmpty()) {
            for (Map.Entry next2 : aVar.f56266g.entrySet()) {
                if (!treeSet.contains(next2.getKey())) {
                    arrayList.add(new C21759i((String) next2.getKey(), (String) next2.getValue()));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static String m100212b(long j) {
        return m100214d(f56431d).format(new Date(j));
    }

    /* renamed from: c */
    public static Map<String, String> m100213c(C21751e.C21752a aVar) {
        if (aVar == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        String str = aVar.f56261b;
        if (str != null) {
            hashMap.put(ConfigFetchHttpClient.f81526j, str);
        }
        long j = aVar.f56263d;
        if (j > 0) {
            hashMap.put("If-Modified-Since", m100212b(j));
        }
        return hashMap;
    }

    /* renamed from: d */
    public static SimpleDateFormat m100214d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone(C28932h.f70913W));
        return simpleDateFormat;
    }

    @C0363p0
    /* renamed from: e */
    public static C21751e.C21752a m100215e(C21762l lVar) {
        long j;
        long j2;
        long j3;
        boolean z;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        C21762l lVar2 = lVar;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = lVar2.f56299c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        if (str != null) {
            j = m100218h(str);
        } else {
            j = 0;
        }
        String str2 = map.get(C33122c.f80338t);
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z = false;
            j3 = 0;
            j2 = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals(C33122c.f80339u) || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j3 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z = true;
                }
                i++;
            }
            i = 1;
        } else {
            z = false;
            j3 = 0;
            j2 = 0;
        }
        String str3 = map.get("Expires");
        if (str3 != null) {
            j4 = m100218h(str3);
        } else {
            j4 = 0;
        }
        String str4 = map.get("Last-Modified");
        if (str4 != null) {
            j5 = m100218h(str4);
        } else {
            j5 = 0;
        }
        String str5 = map.get(ConfigFetchHttpClient.f81525i);
        if (i != 0) {
            j7 = currentTimeMillis + (j3 * 1000);
            if (z) {
                j8 = j7;
            } else {
                j8 = (j2 * 1000) + j7;
            }
            j6 = j8;
        } else {
            j6 = 0;
            if (j <= 0 || j4 < j) {
                j7 = 0;
            } else {
                j7 = currentTimeMillis + (j4 - j);
                j6 = j7;
            }
        }
        C21751e.C21752a aVar = new C21751e.C21752a();
        aVar.f56260a = lVar2.f56298b;
        aVar.f56261b = str5;
        aVar.f56265f = j7;
        aVar.f56264e = j6;
        aVar.f56262c = j;
        aVar.f56263d = j5;
        aVar.f56266g = map;
        aVar.f56267h = lVar2.f56300d;
        return aVar;
    }

    /* renamed from: f */
    public static String m100216f(@C0363p0 Map<String, String> map) {
        return m100217g(map, "ISO-8859-1");
    }

    /* renamed from: g */
    public static String m100217g(@C0363p0 Map<String, String> map, String str) {
        String str2;
        if (!(map == null || (str2 = map.get("Content-Type")) == null)) {
            String[] split = str2.split(";", 0);
            for (int i = 1; i < split.length; i++) {
                String[] split2 = split[i].trim().split("=", 0);
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return str;
    }

    /* renamed from: h */
    public static long m100218h(String str) {
        try {
            return m100214d(f56430c).parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                C21776s.m100102f("Unable to parse dateStr: %s, falling back to 0", str);
                return 0;
            }
            C21776s.m100100d(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0;
        }
    }

    /* renamed from: i */
    public static List<C21759i> m100219i(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(new C21759i((String) next.getKey(), (String) next.getValue()));
        }
        return arrayList;
    }

    /* renamed from: j */
    public static Map<String, String> m100220j(List<C21759i> list) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (C21759i next : list) {
            treeMap.put(next.mo64934a(), next.mo64935b());
        }
        return treeMap;
    }
}
