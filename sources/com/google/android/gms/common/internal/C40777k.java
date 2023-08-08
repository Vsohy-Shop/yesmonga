package com.google.android.gms.common.internal;

import android.util.Log;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.errorprone.annotations.C32499h;
import com.google.errorprone.annotations.C32500i;

@C40473a
/* renamed from: com.google.android.gms.common.internal.k */
public final class C40777k {

    /* renamed from: a */
    public final String f103893a;
    @C0363p0

    /* renamed from: b */
    public final String f103894b;

    @C40473a
    public C40777k(@C0359n0 String str) {
        this(str, (String) null);
    }

    @C40473a
    /* renamed from: a */
    public boolean mo134428a(int i) {
        return Log.isLoggable(this.f103893a, i);
    }

    @C40473a
    /* renamed from: b */
    public boolean mo134429b() {
        return false;
    }

    @C40473a
    /* renamed from: c */
    public void mo134430c(@C0359n0 String str, @C0359n0 String str2) {
        if (mo134428a(3)) {
            mo134445r(str2);
        }
    }

    @C40473a
    /* renamed from: d */
    public void mo134431d(@C0359n0 String str, @C0359n0 String str2, @C0359n0 Throwable th) {
        if (mo134428a(3)) {
            mo134445r(str2);
        }
    }

    @C40473a
    /* renamed from: e */
    public void mo134432e(@C0359n0 String str, @C0359n0 String str2) {
        if (mo134428a(6)) {
            mo134445r(str2);
        }
    }

    @C40473a
    /* renamed from: f */
    public void mo134433f(@C0359n0 String str, @C0359n0 String str2, @C0359n0 Throwable th) {
        if (mo134428a(6)) {
            mo134445r(str2);
        }
    }

    @C40473a
    @C32499h
    /* renamed from: g */
    public void mo134434g(@C0359n0 String str, @C0359n0 @C32500i String str2, @C0359n0 Object... objArr) {
        if (mo134428a(6)) {
            mo134446s(str2, objArr);
        }
    }

    @C40473a
    /* renamed from: h */
    public void mo134435h(@C0359n0 String str, @C0359n0 String str2) {
        if (mo134428a(4)) {
            mo134445r(str2);
        }
    }

    @C40473a
    /* renamed from: i */
    public void mo134436i(@C0359n0 String str, @C0359n0 String str2, @C0359n0 Throwable th) {
        if (mo134428a(4)) {
            mo134445r(str2);
        }
    }

    @C40473a
    /* renamed from: j */
    public void mo134437j(@C0359n0 String str, @C0359n0 String str2) {
    }

    @C40473a
    /* renamed from: k */
    public void mo134438k(@C0359n0 String str, @C0359n0 String str2, @C0359n0 Throwable th) {
    }

    @C40473a
    /* renamed from: l */
    public void mo134439l(@C0359n0 String str, @C0359n0 String str2) {
        if (mo134428a(2)) {
            mo134445r(str2);
        }
    }

    @C40473a
    /* renamed from: m */
    public void mo134440m(@C0359n0 String str, @C0359n0 String str2, @C0359n0 Throwable th) {
        if (mo134428a(2)) {
            mo134445r(str2);
        }
    }

    @C40473a
    /* renamed from: n */
    public void mo134441n(@C0359n0 String str, @C0359n0 String str2) {
        if (mo134428a(5)) {
            mo134445r(str2);
        }
    }

    @C40473a
    /* renamed from: o */
    public void mo134442o(@C0359n0 String str, @C0359n0 String str2, @C0359n0 Throwable th) {
        if (mo134428a(5)) {
            mo134445r(str2);
        }
    }

    @C40473a
    @C32499h
    /* renamed from: p */
    public void mo134443p(@C0359n0 String str, @C0359n0 @C32500i String str2, @C0359n0 Object... objArr) {
        if (mo134428a(5)) {
            mo134446s(str2, objArr);
        }
    }

    @C40473a
    /* renamed from: q */
    public void mo134444q(@C0359n0 String str, @C0359n0 String str2, @C0359n0 Throwable th) {
        if (mo134428a(7)) {
            mo134445r(str2);
            Log.wtf(str, mo134445r(str2), th);
        }
    }

    /* renamed from: r */
    public final String mo134445r(String str) {
        String str2 = this.f103894b;
        return str2 == null ? str : str2.concat(str);
    }

    @C32499h
    /* renamed from: s */
    public final String mo134446s(String str, Object... objArr) {
        String format = String.format(str, objArr);
        String str2 = this.f103894b;
        if (str2 == null) {
            return format;
        }
        return str2.concat(format);
    }

    @C40473a
    public C40777k(@C0359n0 String str, @C0363p0 String str2) {
        C40843u.m166203m(str, "log tag cannot be null");
        C40843u.m166193c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f103893a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f103894b = null;
        } else {
            this.f103894b = str2;
        }
    }
}
