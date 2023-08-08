package org.joda.time.p014tz;

import java.util.Collections;
import java.util.Set;
import org.joda.time.DateTimeZone;

/* renamed from: org.joda.time.tz.d */
public final class C12725d implements C12724c {

    /* renamed from: a */
    public static final Set<String> f31411a = Collections.singleton("UTC");

    /* renamed from: a */
    public DateTimeZone mo29465a(String str) {
        if ("UTC".equalsIgnoreCase(str)) {
            return DateTimeZone.f30651a;
        }
        return null;
    }

    /* renamed from: b */
    public Set<String> mo29466b() {
        return f31411a;
    }
}
