package com.google.android.play.core.splitinstall;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.play.core.splitinstall.l0 */
public final class C32180l0 {

    /* renamed from: a */
    public final Map<String, Map<String, String>> f78436a = new HashMap();

    /* renamed from: a */
    public final C32182m0 mo92979a() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f78436a.entrySet()) {
            hashMap.put((String) next.getKey(), Collections.unmodifiableMap(new HashMap((Map) next.getValue())));
        }
        return new C32182m0(Collections.unmodifiableMap(hashMap));
    }

    /* renamed from: b */
    public final void mo92980b(String str, String str2, String str3) {
        if (!this.f78436a.containsKey(str2)) {
            this.f78436a.put(str2, new HashMap());
        }
        this.f78436a.get(str2).put(str, str3);
    }
}
