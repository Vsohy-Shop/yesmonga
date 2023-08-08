package com.google.zxing.client.result;

import androidx.core.net.C17767c;
import com.google.zxing.C34761k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.zxing.client.result.u */
public final class C34703u extends C34702t {
    /* renamed from: q */
    public static void m141546q(Collection<String> collection, Collection<String> collection2, String str) {
        int indexOf = str.indexOf(59);
        String str2 = null;
        if (indexOf < 0) {
            collection.add(str);
            collection2.add((Object) null);
            return;
        }
        collection.add(str.substring(0, indexOf));
        String substring = str.substring(indexOf + 1);
        if (substring.startsWith("via=")) {
            str2 = substring.substring(4);
        }
        collection2.add(str2);
    }

    /* renamed from: r */
    public C34704v mo102518k(C34761k kVar) {
        String str;
        boolean z;
        String str2;
        String c = C34702t.m141532c(kVar);
        String str3 = null;
        if (!c.startsWith("sms:") && !c.startsWith("SMS:") && !c.startsWith("mms:") && !c.startsWith("MMS:")) {
            return null;
        }
        Map<String, String> m = C34702t.m141541m(c);
        if (m == null || m.isEmpty()) {
            z = false;
            str = null;
        } else {
            str3 = m.get(C17767c.f46173h);
            str = m.get("body");
            z = true;
        }
        int indexOf = c.indexOf(63, 4);
        if (indexOf < 0 || !z) {
            str2 = c.substring(4);
        } else {
            str2 = c.substring(4, indexOf);
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        int i = -1;
        while (true) {
            int i2 = i + 1;
            int indexOf2 = str2.indexOf(44, i2);
            if (indexOf2 > i) {
                m141546q(arrayList, arrayList2, str2.substring(i2, indexOf2));
                i = indexOf2;
            } else {
                m141546q(arrayList, arrayList2, str2.substring(i2));
                String[] strArr = C34702t.f84014f;
                return new C34704v((String[]) arrayList.toArray(strArr), (String[]) arrayList2.toArray(strArr), str3, str);
            }
        }
    }
}
