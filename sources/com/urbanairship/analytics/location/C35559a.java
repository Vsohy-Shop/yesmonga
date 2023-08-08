package com.urbanairship.analytics.location;

import androidx.annotation.C0379x;
import com.urbanairship.C36059m;

/* renamed from: com.urbanairship.analytics.location.a */
public class C35559a {

    /* renamed from: d */
    public static final int f87796d = 100000;

    /* renamed from: a */
    public final double f87797a;

    /* renamed from: b */
    public final double f87798b;

    /* renamed from: c */
    public final double f87799c;

    public C35559a(@C0379x(from = 0.0d, mo1016to = 100000.0d) double d, @C0379x(from = -90.0d, mo1016to = 90.0d) double d2, @C0379x(from = -180.0d, mo1016to = 180.0d) double d3) {
        this.f87797a = d;
        this.f87798b = d2;
        this.f87799c = d3;
    }

    /* renamed from: a */
    public double mo106525a() {
        return this.f87798b;
    }

    /* renamed from: b */
    public double mo106526b() {
        return this.f87799c;
    }

    /* renamed from: c */
    public double mo106527c() {
        return this.f87797a;
    }

    /* renamed from: d */
    public boolean mo106528d() {
        double d = this.f87797a;
        if (d > 100000.0d || d <= 0.0d) {
            C36059m.m148409e("The radius must be greater than %s and less than or equal to %s meters.", 0, 100000);
            return false;
        } else if (!C35563d.m146757r(Double.valueOf(this.f87798b))) {
            C36059m.m148409e("The latitude must be greater than or equal to %s and less than or equal to %s degrees.", Double.valueOf(-90.0d), Double.valueOf(90.0d));
            return false;
        } else if (C35563d.m146758s(Double.valueOf(this.f87799c))) {
            return true;
        } else {
            C36059m.m148409e("The longitude must be greater than or equal to %s and less than or equal to %s degrees.", Double.valueOf(-180.0d), Double.valueOf(180.0d));
            return false;
        }
    }
}
