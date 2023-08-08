package p073j$.time.zone;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TimeZone;

/* renamed from: j$.time.zone.f */
final class C42686f extends C42687g {

    /* renamed from: c */
    private final Set f107999c;

    C42686f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String add : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(add);
        }
        this.f107999c = Collections.unmodifiableSet(linkedHashSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C42683c mo138259c(String str) {
        if (this.f107999c.contains(str)) {
            return new C42683c(TimeZone.getTimeZone(str));
        }
        throw new C42684d("Not a built-in time zone: " + str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Set mo138260d() {
        return this.f107999c;
    }
}
