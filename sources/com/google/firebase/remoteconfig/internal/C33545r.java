package com.google.firebase.remoteconfig.internal;

import androidx.constraintlayout.core.motion.utils.C16717v;
import com.google.firebase.remoteconfig.C33563l;
import com.google.firebase.remoteconfig.C33568o;
import com.urbanairship.analytics.location.C35560b;
import com.urbanairship.contacts.ContactApiClient;

/* renamed from: com.google.firebase.remoteconfig.internal.r */
public class C33545r implements C33568o {

    /* renamed from: c */
    public static final String f81653c = "[Value: %s] cannot be converted to a %s.";

    /* renamed from: a */
    public final String f81654a;

    /* renamed from: b */
    public final int f81655b;

    public C33545r(String str, int i) {
        this.f81654a = str;
        this.f81655b = i;
    }

    /* renamed from: a */
    public byte[] mo97376a() {
        if (this.f81655b == 0) {
            return C33563l.f81684p;
        }
        return this.f81654a.getBytes(C33537m.f81616e);
    }

    /* renamed from: b */
    public String mo97377b() {
        if (this.f81655b == 0) {
            return "";
        }
        mo97382g();
        return this.f81654a;
    }

    /* renamed from: c */
    public long mo97378c() {
        if (this.f81655b == 0) {
            return 0;
        }
        String f = mo97381f();
        try {
            return Long.valueOf(f).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format(f81653c, new Object[]{f, C35560b.f87804W0}), e);
        }
    }

    /* renamed from: d */
    public double mo97379d() {
        if (this.f81655b == 0) {
            return 0.0d;
        }
        String f = mo97381f();
        try {
            return Double.valueOf(f).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format(f81653c, new Object[]{f, ContactApiClient.f24442G}), e);
        }
    }

    /* renamed from: e */
    public boolean mo97380e() throws IllegalArgumentException {
        if (this.f81655b == 0) {
            return false;
        }
        String f = mo97381f();
        if (C33537m.f81617f.matcher(f).matches()) {
            return true;
        }
        if (C33537m.f81618g.matcher(f).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format(f81653c, new Object[]{f, C16717v.C16719b.f42183f}));
    }

    /* renamed from: f */
    public final String mo97381f() {
        return mo97377b().trim();
    }

    /* renamed from: g */
    public final void mo97382g() {
        if (this.f81654a == null) {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }

    public int getSource() {
        return this.f81655b;
    }
}
