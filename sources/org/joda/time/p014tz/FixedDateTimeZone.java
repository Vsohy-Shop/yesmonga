package org.joda.time.p014tz;

import com.carrefour.fid.android.shared.util.C28932h;
import com.google.android.material.badge.C31132a;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.joda.time.DateTimeZone;
import p073j$.util.DesugarTimeZone;

/* renamed from: org.joda.time.tz.FixedDateTimeZone */
public final class FixedDateTimeZone extends DateTimeZone {
    private static final long serialVersionUID = -3513011772763289092L;
    private final String iNameKey;
    private final int iStandardOffset;
    private final int iWallOffset;

    public FixedDateTimeZone(String str, String str2, int i, int i2) {
        super(str);
        this.iNameKey = str2;
        this.iWallOffset = i;
        this.iStandardOffset = i2;
    }

    /* renamed from: C */
    public int mo27811C(long j) {
        return this.iStandardOffset;
    }

    /* renamed from: D */
    public boolean mo27812D() {
        return true;
    }

    /* renamed from: G */
    public long mo27815G(long j) {
        return j;
    }

    /* renamed from: I */
    public long mo27816I(long j) {
        return j;
    }

    /* renamed from: N */
    public TimeZone mo27817N() {
        String q = mo27824q();
        if (q.length() != 6 || (!q.startsWith(C31132a.f74628J0) && !q.startsWith("-"))) {
            return new SimpleTimeZone(this.iWallOffset, mo27824q());
        }
        return DesugarTimeZone.getTimeZone(C28932h.f70913W + mo27824q());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FixedDateTimeZone)) {
            return false;
        }
        FixedDateTimeZone fixedDateTimeZone = (FixedDateTimeZone) obj;
        if (mo27824q().equals(fixedDateTimeZone.mo27824q()) && this.iStandardOffset == fixedDateTimeZone.iStandardOffset && this.iWallOffset == fixedDateTimeZone.iWallOffset) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return mo27824q().hashCode() + (this.iStandardOffset * 37) + (this.iWallOffset * 31);
    }

    /* renamed from: u */
    public String mo27829u(long j) {
        return this.iNameKey;
    }

    /* renamed from: w */
    public int mo27830w(long j) {
        return this.iWallOffset;
    }

    /* renamed from: y */
    public int mo27833y(long j) {
        return this.iWallOffset;
    }
}
