package p073j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: j$.time.format.z */
final class C42652z {

    /* renamed from: a */
    private final Map f107921a;

    /* renamed from: b */
    private final Map f107922b;

    C42652z(Map map) {
        this.f107921a = map;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                int i = C42622A.f107812c;
                hashMap2.put((String) entry2.getValue(), new AbstractMap.SimpleImmutableEntry((String) entry2.getValue(), (Long) entry2.getKey()));
            }
            ArrayList arrayList2 = new ArrayList(hashMap2.values());
            Collections.sort(arrayList2, C42622A.f107811b);
            hashMap.put((TextStyle) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            hashMap.put((Object) null, arrayList);
        }
        Collections.sort(arrayList, C42622A.f107811b);
        this.f107922b = hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo138189a(long j, TextStyle textStyle) {
        Map map = (Map) this.f107921a.get(textStyle);
        if (map != null) {
            return (String) map.get(Long.valueOf(j));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Iterator mo138190b(TextStyle textStyle) {
        List list = (List) ((HashMap) this.f107922b).get(textStyle);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
