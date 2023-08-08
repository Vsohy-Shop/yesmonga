package com.appsflyer.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.appsflyer.internal.bq */
public class C21932bq<Body> {
    @NonNull
    public final C21924bi AFInAppEventParameterName;
    public final int AFInAppEventType;
    @NonNull
    final Map<String, List<String>> AFKeystoreWrapper;
    final boolean valueOf;
    @NonNull
    public final Body values;

    public C21932bq(@NonNull Body body, int i, boolean z, Map<String, List<String>> map, @NonNull C21924bi biVar) {
        this.values = body;
        this.AFInAppEventType = i;
        this.valueOf = z;
        this.AFKeystoreWrapper = new HashMap(map);
        this.AFInAppEventParameterName = biVar;
    }

    public final boolean AFInAppEventType() {
        return this.valueOf;
    }

    @Nullable
    public final String AFKeystoreWrapper(@NonNull String str) {
        List list;
        Iterator<String> it = this.AFKeystoreWrapper.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                list = null;
                break;
            }
            String next = it.next();
            if (next != null && next.equalsIgnoreCase(str)) {
                list = this.AFKeystoreWrapper.get(next);
                break;
            }
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        Iterator it2 = list.iterator();
        StringBuilder sb = new StringBuilder((String) it2.next());
        while (it2.hasNext()) {
            sb.append(", ");
            sb.append((String) it2.next());
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C21932bq bqVar = (C21932bq) obj;
        if (this.AFInAppEventType == bqVar.AFInAppEventType && this.valueOf == bqVar.valueOf && this.values.equals(bqVar.values) && this.AFKeystoreWrapper.equals(bqVar.AFKeystoreWrapper)) {
            return this.AFInAppEventParameterName.equals(bqVar.AFInAppEventParameterName);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.values.hashCode() * 31) + this.AFInAppEventType) * 31) + (this.valueOf ? 1 : 0)) * 31) + this.AFKeystoreWrapper.hashCode()) * 31) + this.AFInAppEventParameterName.hashCode();
    }
}
