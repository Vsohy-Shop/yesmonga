package com.google.android.gms.internal.gtm;

import com.carrefour.fid.android.shared.constant.C28534f;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.firebase.crashlytics.C32648f;
import com.urbanairship.iam.C9166d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.gtm.re */
public final class C41549re {
    /* renamed from: a */
    public static C41711y8 m168297a(Object obj) throws JSONException {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        String str;
        boolean z;
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            str = jSONObject.getString("name");
            jSONArray2 = jSONObject.getJSONArray(C32648f.f79206e);
            jSONArray = jSONObject.getJSONArray("instructions");
        } else if (obj instanceof JSONArray) {
            JSONArray jSONArray3 = (JSONArray) obj;
            if (jSONArray3.length() >= 3) {
                z = true;
            } else {
                z = false;
            }
            C40843u.m166191a(z);
            str = jSONArray3.getString(1);
            JSONArray jSONArray4 = jSONArray3.getJSONArray(2);
            JSONArray jSONArray5 = new JSONArray();
            for (int i = 1; i < jSONArray4.length(); i++) {
                C40843u.m166191a(jSONArray4.get(i) instanceof String);
                jSONArray5.put(jSONArray4.get(i));
            }
            JSONArray jSONArray6 = new JSONArray();
            for (int i2 = 3; i2 < jSONArray3.length(); i2++) {
                jSONArray6.put(jSONArray3.get(i2));
            }
            jSONArray = jSONArray6;
            jSONArray2 = jSONArray5;
        } else {
            throw new IllegalArgumentException("invalid JSON in runtime section");
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
            arrayList.add(jSONArray2.getString(i3));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            JSONArray jSONArray7 = jSONArray.getJSONArray(i4);
            if (jSONArray7.length() != 0) {
                arrayList2.add(m168301e(jSONArray7));
            }
        }
        return new C41711y8((C41277g7) null, str, arrayList, arrayList2);
    }

    @C40974d0
    /* renamed from: b */
    public static C41694xf m168298b(JSONArray jSONArray, List<C41622uf> list, List<C41622uf> list2) throws zzpf, JSONException {
        String str;
        C41646vf vfVar = new C41646vf();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
            int i2 = 1;
            if (jSONArray2.getString(0).equals("if")) {
                while (i2 < jSONArray2.length()) {
                    vfVar.mo135982c(list2.get(jSONArray2.getInt(i2)));
                    i2++;
                }
            } else if (jSONArray2.getString(0).equals("unless")) {
                while (i2 < jSONArray2.length()) {
                    vfVar.mo135981b(list2.get(jSONArray2.getInt(i2)));
                    i2++;
                }
            } else if (jSONArray2.getString(0).equals("add")) {
                while (i2 < jSONArray2.length()) {
                    vfVar.mo135980a(list.get(jSONArray2.getInt(i2)));
                    i2++;
                }
            } else if (jSONArray2.getString(0).equals(C28534f.f69159i0)) {
                while (i2 < jSONArray2.length()) {
                    vfVar.mo135983d(list.get(jSONArray2.getInt(i2)));
                    i2++;
                }
            } else {
                String valueOf = String.valueOf(jSONArray2.getString(0));
                if (valueOf.length() != 0) {
                    str = "Unknown Rule property: ".concat(valueOf);
                } else {
                    str = new String("Unknown Rule property: ");
                }
                m168302f(str);
            }
        }
        return vfVar.mo135984e();
    }

    @C40974d0
    /* renamed from: c */
    public static C41166bg m168299c(Object obj, List<String> list) throws zzpf, JSONException {
        C41166bg bgVar;
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            String string = jSONArray.getString(0);
            if (string.equals("escape")) {
                C41166bg c = m168299c(jSONArray.get(1), list);
                for (int i = 2; i < jSONArray.length(); i++) {
                    c.mo135067a(jSONArray.getInt(i));
                }
                return c;
            } else if (string.equals("list")) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 1; i2 < jSONArray.length(); i2++) {
                    arrayList.add(m168299c(jSONArray.get(i2), list).mo135069c());
                }
                bgVar = new C41166bg(2, arrayList);
                bgVar.mo135068b(true);
            } else if (string.equals("map")) {
                HashMap hashMap = new HashMap();
                for (int i3 = 1; i3 < jSONArray.length(); i3 += 2) {
                    hashMap.put(m168299c(jSONArray.get(i3), list).mo135069c(), m168299c(jSONArray.get(i3 + 1), list).mo135069c());
                }
                bgVar = new C41166bg(3, hashMap);
                bgVar.mo135068b(true);
            } else if (string.equals("macro")) {
                C41166bg bgVar2 = new C41166bg(4, list.get(jSONArray.getInt(1)));
                bgVar2.mo135068b(true);
                return bgVar2;
            } else if (string.equals(C9166d.f24876q0)) {
                ArrayList arrayList2 = new ArrayList();
                for (int i4 = 1; i4 < jSONArray.length(); i4++) {
                    arrayList2.add(m168299c(jSONArray.get(i4), list).mo135069c());
                }
                bgVar = new C41166bg(7, arrayList2);
                bgVar.mo135068b(true);
            } else {
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(valueOf.length() + 20);
                sb.append("Invalid value type: ");
                sb.append(valueOf);
                m168302f(sb.toString());
                return null;
            }
        } else if (obj instanceof Boolean) {
            bgVar = new C41166bg(8, obj);
        } else if (obj instanceof Integer) {
            bgVar = new C41166bg(6, obj);
        } else if (obj instanceof String) {
            bgVar = new C41166bg(1, obj);
        } else {
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 20);
            sb2.append("Invalid value type: ");
            sb2.append(valueOf2);
            m168302f(sb2.toString());
            return null;
        }
        return bgVar;
    }

    @C40974d0
    /* renamed from: d */
    public static List<C41622uf> m168300d(JSONArray jSONArray, List<String> list) throws JSONException, zzpf {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            C41574sf sfVar = new C41574sf();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                C41214dg c = m168299c(jSONObject.get(next), list).mo135069c();
                if ("push_after_evaluate".equals(next)) {
                    sfVar.mo135829b(c);
                } else {
                    sfVar.mo135828a(next, c);
                }
            }
            arrayList.add(sfVar.mo135830c());
        }
        return arrayList;
    }

    /* renamed from: e */
    public static C41551rg m168301e(JSONArray jSONArray) throws JSONException {
        boolean z;
        if (jSONArray.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166191a(z);
        String string = jSONArray.getString(0);
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                JSONArray jSONArray2 = (JSONArray) obj;
                if (jSONArray2.length() != 0) {
                    arrayList.add(m168301e(jSONArray2));
                }
            } else if (obj == JSONObject.NULL) {
                arrayList.add(C41431mg.f104799g);
            } else {
                arrayList.add(C41623ug.m168490b(obj));
            }
        }
        return new C41551rg(string, arrayList);
    }

    /* renamed from: f */
    public static void m168302f(String str) throws zzpf {
        C41493p6.m168149a(str);
        throw new zzpf(str);
    }
}
