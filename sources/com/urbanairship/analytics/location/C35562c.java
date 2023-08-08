package com.urbanairship.analytics.location;

import androidx.annotation.C0337f0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0379x;
import com.urbanairship.C36059m;

/* renamed from: com.urbanairship.analytics.location.c */
public class C35562c {

    /* renamed from: g */
    public static final int f87820g = 65535;

    /* renamed from: h */
    public static final int f87821h = 100;

    /* renamed from: i */
    public static final int f87822i = -100;

    /* renamed from: a */
    public final String f87823a;

    /* renamed from: b */
    public final int f87824b;

    /* renamed from: c */
    public final int f87825c;

    /* renamed from: d */
    public Double f87826d;

    /* renamed from: e */
    public Double f87827e;

    /* renamed from: f */
    public Integer f87828f;

    public C35562c(@C0359n0 String str, @C0337f0(from = 0, mo995to = 65535) int i, @C0337f0(from = 0, mo995to = 65535) int i2) {
        this.f87823a = str;
        this.f87824b = i;
        this.f87825c = i2;
    }

    @C0363p0
    /* renamed from: a */
    public Double mo106529a() {
        return this.f87826d;
    }

    @C0363p0
    /* renamed from: b */
    public Double mo106530b() {
        return this.f87827e;
    }

    /* renamed from: c */
    public int mo106531c() {
        return this.f87824b;
    }

    /* renamed from: d */
    public int mo106532d() {
        return this.f87825c;
    }

    @C0359n0
    /* renamed from: e */
    public String mo106533e() {
        return this.f87823a;
    }

    @C0363p0
    /* renamed from: f */
    public Integer mo106534f() {
        return this.f87828f;
    }

    /* renamed from: g */
    public boolean mo106535g() {
        String str = this.f87823a;
        if (str == null) {
            C36059m.m148409e("The proximity ID must not be null.", new Object[0]);
            return false;
        } else if (!C35563d.m146756p(str)) {
            C36059m.m148409e("The proximity ID must not be greater than %s or less than %s characters in length.", 255, 1);
            return false;
        } else {
            int i = this.f87824b;
            if (i > 65535 || i < 0) {
                C36059m.m148409e("The major must not be greater than 65535 or less than 0.", new Object[0]);
                return false;
            }
            int i2 = this.f87825c;
            if (i2 <= 65535 && i2 >= 0) {
                return true;
            }
            C36059m.m148409e("The minor must not be greater than %s or less than %s.", 65535, 0);
            return false;
        }
    }

    /* renamed from: h */
    public void mo106536h(@C0363p0 @C0379x(from = -90.0d, mo1016to = 90.0d) Double d, @C0363p0 @C0379x(from = -180.0d, mo1016to = 180.0d) Double d2) {
        if (d == null || d2 == null) {
            this.f87826d = null;
            this.f87827e = null;
        } else if (!C35563d.m146757r(d)) {
            C36059m.m148409e("The latitude must be greater than or equal to %s and less than or equal to %s degrees.", Double.valueOf(-90.0d), Double.valueOf(90.0d));
            this.f87826d = null;
        } else if (!C35563d.m146758s(d2)) {
            C36059m.m148409e("The longitude must be greater than or equal to %s and less than or equal to %s degrees.", Double.valueOf(-180.0d), Double.valueOf(180.0d));
            this.f87827e = null;
        } else {
            this.f87826d = d;
            this.f87827e = d2;
        }
    }

    /* renamed from: i */
    public void mo106537i(@C0363p0 @C0337f0(from = -100, mo995to = 100) Integer num) {
        if (num == null) {
            this.f87828f = null;
        } else if (num.intValue() > 100 || num.intValue() < -100) {
            C36059m.m148409e("The rssi must be greater than or equal to %s and less than or equal to %s dBm.", -100, 100);
            this.f87828f = null;
        } else {
            this.f87828f = num;
        }
    }
}
