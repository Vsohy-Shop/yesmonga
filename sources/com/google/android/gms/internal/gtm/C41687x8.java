package com.google.android.gms.internal.gtm;

import com.carrefour.fid.android.shared.constant.C28534f;
import com.google.android.gms.common.internal.C40858y;
import com.urbanairship.json.matchers.C9337b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.gtm.x8 */
public final class C41687x8 {

    /* renamed from: a */
    public static final Map<String, C41663w8> f105238a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(zza.CONTAINS.toString(), new C41663w8("contains"));
        hashMap.put(zza.ENDS_WITH.toString(), new C41663w8("endsWith"));
        hashMap.put(zza.EQUALS.toString(), new C41663w8(C9337b.f25466b));
        hashMap.put(zza.GREATER_EQUALS.toString(), new C41663w8("greaterEquals"));
        hashMap.put(zza.GREATER_THAN.toString(), new C41663w8("greaterThan"));
        hashMap.put(zza.LESS_EQUALS.toString(), new C41663w8("lessEquals"));
        hashMap.put(zza.LESS_THAN.toString(), new C41663w8("lessThan"));
        hashMap.put(zza.REGEX.toString(), new C41663w8("regex", new String[]{zzb.ARG0.toString(), zzb.ARG1.toString(), zzb.IGNORE_CASE.toString()}));
        hashMap.put(zza.STARTS_WITH.toString(), new C41663w8("startsWith"));
        f105238a = hashMap;
    }

    @C40858y
    /* renamed from: a */
    public static C41551rg m168704a(String str, Map<String, C41310hg<?>> map, C41277g7 g7Var) {
        Map<String, C41663w8> map2 = f105238a;
        if (map2.containsKey(str)) {
            C41663w8 w8Var = map2.get(str);
            String[] b = w8Var.mo136023b();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < b.length; i++) {
                if (!map.containsKey(b[i])) {
                    arrayList.add(C41431mg.f104800h);
                } else {
                    arrayList.add(map.get(b[i]));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new C41599tg("gtmUtils"));
            C41551rg rgVar = new C41551rg("15", arrayList2);
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(rgVar);
            arrayList3.add(new C41599tg(C28534f.f69158i));
            C41551rg rgVar2 = new C41551rg("17", arrayList3);
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(rgVar2);
            arrayList4.add(new C41599tg(w8Var.mo136022a()));
            arrayList4.add(new C41503pg(arrayList));
            return new C41551rg("2", arrayList4);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47);
        sb.append("Fail to convert ");
        sb.append(str);
        sb.append(" to the internal representation");
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: b */
    public static String m168705b(zza zza) {
        return m168706c(zza.toString());
    }

    /* renamed from: c */
    public static String m168706c(String str) {
        Map<String, C41663w8> map = f105238a;
        if (map.containsKey(str)) {
            return map.get(str).mo136022a();
        }
        return null;
    }
}
