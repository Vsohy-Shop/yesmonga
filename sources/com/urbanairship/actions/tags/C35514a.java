package com.urbanairship.actions.tags;

import androidx.annotation.C0359n0;
import com.urbanairship.UAirship;
import com.urbanairship.actions.C35487a;
import com.urbanairship.actions.C35489b;
import com.urbanairship.actions.C35495f;
import com.urbanairship.channel.C9008d;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9669o0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.urbanairship.actions.tags.a */
public abstract class C35514a extends C35487a {

    /* renamed from: h */
    public static final String f87577h = "channel";

    /* renamed from: i */
    public static final String f87578i = "named_user";

    /* renamed from: j */
    public static final String f87579j = "device";

    /* renamed from: a */
    public boolean mo17301a(@C0359n0 C35489b bVar) {
        if (bVar.mo106349c().mo106311i()) {
            return false;
        }
        if (bVar.mo106349c().mo106308g() != null || bVar.mo106349c().mo106303d() != null) {
            return true;
        }
        if (bVar.mo106349c().mo106307f() != null) {
            return true;
        }
        return false;
    }

    @C0359n0
    /* renamed from: d */
    public C35495f mo17302d(@C0359n0 C35489b bVar) {
        if (bVar.mo106349c().mo106308g() != null) {
            HashSet hashSet = new HashSet();
            hashSet.add(String.valueOf(bVar.mo106349c().mo106308g()));
            mo106391h(hashSet);
        }
        if (bVar.mo106349c().mo106303d() != null) {
            HashSet hashSet2 = new HashSet();
            Iterator<JsonValue> it = bVar.mo106349c().mo106303d().iterator();
            while (it.hasNext()) {
                JsonValue next = it.next();
                if (next.mo18769l() != null) {
                    hashSet2.add(next.mo18769l());
                }
            }
            mo106391h(hashSet2);
        }
        if (bVar.mo106349c().mo106307f() != null) {
            HashMap hashMap = new HashMap();
            for (Map.Entry next2 : bVar.mo106349c().mo106307f().mo18801A("channel").mo18749A().mo18813r().entrySet()) {
                String str = (String) next2.getKey();
                HashSet hashSet3 = new HashSet();
                for (JsonValue l : ((JsonValue) next2.getValue()).mo18784z().mo18793i()) {
                    hashSet3.add(l.mo18769l());
                }
                if (!C9669o0.m36224e(str) && !hashSet3.isEmpty()) {
                    hashMap.put(str, hashSet3);
                }
            }
            if (!hashMap.isEmpty()) {
                mo106390g(hashMap);
            }
            HashMap hashMap2 = new HashMap();
            for (Map.Entry next3 : bVar.mo106349c().mo106307f().mo18801A("named_user").mo18749A().mo18813r().entrySet()) {
                String str2 = (String) next3.getKey();
                HashSet hashSet4 = new HashSet();
                for (JsonValue l2 : ((JsonValue) next3.getValue()).mo18784z().mo18793i()) {
                    hashSet4.add(l2.mo18769l());
                }
                if (!C9669o0.m36224e(str2) && !hashSet4.isEmpty()) {
                    hashMap2.put(str2, hashSet4);
                }
            }
            if (!hashMap2.isEmpty()) {
                mo106392i(hashMap2);
            }
            HashSet hashSet5 = new HashSet();
            Iterator<JsonValue> it2 = bVar.mo106349c().mo106307f().mo18801A("device").mo18784z().iterator();
            while (it2.hasNext()) {
                JsonValue next4 = it2.next();
                if (next4.mo18769l() != null) {
                    hashSet5.add(next4.mo18769l());
                }
            }
            if (!hashSet5.isEmpty()) {
                mo106391h(hashSet5);
            }
        }
        return C35495f.m146456d();
    }

    /* renamed from: g */
    public abstract void mo106390g(@C0359n0 Map<String, Set<String>> map);

    /* renamed from: h */
    public abstract void mo106391h(@C0359n0 Set<String> set);

    /* renamed from: i */
    public abstract void mo106392i(@C0359n0 Map<String, Set<String>> map);

    @C0359n0
    /* renamed from: j */
    public C9008d mo106393j() {
        return UAirship.m146188Y().mo106223n();
    }
}
