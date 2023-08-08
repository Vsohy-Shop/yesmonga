package org.joda.time.chrono;

import org.joda.time.DateTimeZone;
import org.joda.time.Instant;

/* renamed from: org.joda.time.chrono.h */
public class C12614h {

    /* renamed from: a */
    public final DateTimeZone f31072a;

    /* renamed from: b */
    public final Instant f31073b;

    /* renamed from: c */
    public final int f31074c;

    public C12614h(DateTimeZone dateTimeZone, Instant instant, int i) {
        this.f31072a = dateTimeZone;
        this.f31073b = instant;
        this.f31074c = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C12614h)) {
            return false;
        }
        C12614h hVar = (C12614h) obj;
        Instant instant = this.f31073b;
        if (instant == null) {
            if (hVar.f31073b != null) {
                return false;
            }
        } else if (!instant.equals(hVar.f31073b)) {
            return false;
        }
        if (this.f31074c != hVar.f31074c) {
            return false;
        }
        DateTimeZone dateTimeZone = this.f31072a;
        if (dateTimeZone == null) {
            if (hVar.f31072a != null) {
                return false;
            }
        } else if (!dateTimeZone.equals(hVar.f31072a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        Instant instant = this.f31073b;
        int i2 = 0;
        if (instant == null) {
            i = 0;
        } else {
            i = instant.hashCode();
        }
        int i3 = (((i + 31) * 31) + this.f31074c) * 31;
        DateTimeZone dateTimeZone = this.f31072a;
        if (dateTimeZone != null) {
            i2 = dateTimeZone.hashCode();
        }
        return i3 + i2;
    }
}
