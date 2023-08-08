package com.google.firebase.abt;

import android.text.TextUtils;
import androidx.annotation.C0344h1;
import com.google.firebase.analytics.connector.C32537a;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.firebase.abt.a */
public class C32513a {
    @C0344h1

    /* renamed from: g */
    public static final String f78841g = "experimentId";
    @C0344h1

    /* renamed from: h */
    public static final String f78842h = "variantId";
    @C0344h1

    /* renamed from: i */
    public static final String f78843i = "triggerEvent";
    @C0344h1

    /* renamed from: j */
    public static final String f78844j = "experimentStartTime";
    @C0344h1

    /* renamed from: k */
    public static final String f78845k = "triggerTimeoutMillis";
    @C0344h1

    /* renamed from: l */
    public static final String f78846l = "timeToLiveMillis";

    /* renamed from: m */
    public static final String[] f78847m = {"experimentId", f78844j, f78846l, f78845k, "variantId"};
    @C0344h1

    /* renamed from: n */
    public static final DateFormat f78848n = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a */
    public final String f78849a;

    /* renamed from: b */
    public final String f78850b;

    /* renamed from: c */
    public final String f78851c;

    /* renamed from: d */
    public final Date f78852d;

    /* renamed from: e */
    public final long f78853e;

    /* renamed from: f */
    public final long f78854f;

    public C32513a(String str, String str2, String str3, Date date, long j, long j2) {
        this.f78849a = str;
        this.f78850b = str2;
        this.f78851c = str3;
        this.f78852d = date;
        this.f78853e = j;
        this.f78854f = j2;
    }

    /* renamed from: a */
    public static C32513a m131479a(C32537a.C32540c cVar) {
        String str = cVar.f78985d;
        if (str == null) {
            str = "";
        }
        return new C32513a(cVar.f78983b, String.valueOf(cVar.f78984c), str, new Date(cVar.f78994m), cVar.f78986e, cVar.f78991j);
    }

    /* renamed from: b */
    public static C32513a m131480b(Map<String, String> map) throws AbtException {
        String str;
        m131482l(map);
        try {
            Date parse = f78848n.parse(map.get(f78844j));
            long parseLong = Long.parseLong(map.get(f78845k));
            long parseLong2 = Long.parseLong(map.get(f78846l));
            String str2 = map.get("experimentId");
            String str3 = map.get("variantId");
            if (map.containsKey(f78843i)) {
                str = map.get(f78843i);
            } else {
                str = "";
            }
            return new C32513a(str2, str3, str, parse, parseLong, parseLong2);
        } catch (ParseException e) {
            throw new AbtException("Could not process experiment: parsing experiment start time failed.", e);
        } catch (NumberFormatException e2) {
            throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e2);
        }
    }

    /* renamed from: k */
    public static void m131481k(C32513a aVar) throws AbtException {
        m131482l(aVar.mo94611j());
    }

    /* renamed from: l */
    public static void m131482l(Map<String, String> map) throws AbtException {
        ArrayList arrayList = new ArrayList();
        for (String str : f78847m) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", new Object[]{arrayList}));
        }
    }

    /* renamed from: c */
    public String mo94604c() {
        return this.f78849a;
    }

    /* renamed from: d */
    public long mo94605d() {
        return this.f78852d.getTime();
    }

    /* renamed from: e */
    public long mo94606e() {
        return this.f78854f;
    }

    /* renamed from: f */
    public String mo94607f() {
        return this.f78851c;
    }

    /* renamed from: g */
    public long mo94608g() {
        return this.f78853e;
    }

    /* renamed from: h */
    public String mo94609h() {
        return this.f78850b;
    }

    /* renamed from: i */
    public C32537a.C32540c mo94610i(String str) {
        String str2;
        C32537a.C32540c cVar = new C32537a.C32540c();
        cVar.f78982a = str;
        cVar.f78994m = mo94605d();
        cVar.f78983b = this.f78849a;
        cVar.f78984c = this.f78850b;
        if (TextUtils.isEmpty(this.f78851c)) {
            str2 = null;
        } else {
            str2 = this.f78851c;
        }
        cVar.f78985d = str2;
        cVar.f78986e = this.f78853e;
        cVar.f78991j = this.f78854f;
        return cVar;
    }

    @C0344h1
    /* renamed from: j */
    public Map<String, String> mo94611j() {
        HashMap hashMap = new HashMap();
        hashMap.put("experimentId", this.f78849a);
        hashMap.put("variantId", this.f78850b);
        hashMap.put(f78843i, this.f78851c);
        hashMap.put(f78844j, f78848n.format(this.f78852d));
        hashMap.put(f78845k, Long.toString(this.f78853e));
        hashMap.put(f78846l, Long.toString(this.f78854f));
        return hashMap;
    }
}
