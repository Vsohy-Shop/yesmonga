package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.installations.local.C33094c;
import com.google.firebase.installations.time.C33125a;
import com.google.firebase.installations.time.C33126b;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: com.google.firebase.installations.s */
public final class C33124s {

    /* renamed from: b */
    public static final long f80354b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c */
    public static final String f80355c = ":";

    /* renamed from: d */
    public static final Pattern f80356d = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: e */
    public static C33124s f80357e;

    /* renamed from: a */
    public final C33125a f80358a;

    public C33124s(C33125a aVar) {
        this.f80358a = aVar;
    }

    /* renamed from: c */
    public static C33124s m133617c() {
        return m133618d(C33126b.m133626b());
    }

    /* renamed from: d */
    public static C33124s m133618d(C33125a aVar) {
        if (f80357e == null) {
            f80357e = new C33124s(aVar);
        }
        return f80357e;
    }

    /* renamed from: g */
    public static boolean m133619g(@C0363p0 String str) {
        return f80356d.matcher(str).matches();
    }

    /* renamed from: h */
    public static boolean m133620h(@C0363p0 String str) {
        return str.contains(f80355c);
    }

    /* renamed from: a */
    public long mo95908a() {
        return this.f80358a.mo95912a();
    }

    /* renamed from: b */
    public long mo95909b() {
        return TimeUnit.MILLISECONDS.toSeconds(mo95908a());
    }

    /* renamed from: e */
    public long mo95910e() {
        return (long) (Math.random() * 1000.0d);
    }

    /* renamed from: f */
    public boolean mo95911f(@C0359n0 C33094c cVar) {
        if (!TextUtils.isEmpty(cVar.mo95828b()) && cVar.mo95835h() + cVar.mo95829c() >= mo95909b() + f80354b) {
            return false;
        }
        return true;
    }
}
