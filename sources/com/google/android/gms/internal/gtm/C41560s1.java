package com.google.android.gms.internal.gtm;

import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.common.util.C40998x;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.gtm.s1 */
public final class C41560s1 {

    /* renamed from: a */
    public final C41607u0 f104935a;

    /* renamed from: b */
    public volatile Boolean f104936b;

    /* renamed from: c */
    public String f104937c;

    /* renamed from: d */
    public Set<Integer> f104938d;

    public C41560s1(C41607u0 u0Var) {
        C40843u.m166202l(u0Var);
        this.f104935a = u0Var;
    }

    /* renamed from: c */
    public static final long m168316c() {
        return C41634v3.f105103H.mo135909b().longValue();
    }

    /* renamed from: d */
    public static final long m168317d() {
        return C41634v3.f105128n.mo135909b().longValue();
    }

    /* renamed from: e */
    public static final long m168318e() {
        return C41634v3.f105125k.mo135909b().longValue();
    }

    /* renamed from: f */
    public static final int m168319f() {
        return C41634v3.f105140z.mo135909b().intValue();
    }

    /* renamed from: g */
    public static final int m168320g() {
        return C41634v3.f105131q.mo135909b().intValue();
    }

    /* renamed from: h */
    public static final int m168321h() {
        return C41634v3.f105130p.mo135909b().intValue();
    }

    @C40974d0
    /* renamed from: i */
    public static final String m168322i() {
        return C41634v3.f105133s.mo135909b();
    }

    /* renamed from: j */
    public static final String m168323j() {
        return C41634v3.f105134t.mo135909b();
    }

    @C40974d0
    /* renamed from: k */
    public static final String m168324k() {
        return C41634v3.f105132r.mo135909b();
    }

    /* renamed from: l */
    public static final boolean m168325l() {
        return C41634v3.f105117c.mo135909b().booleanValue();
    }

    /* renamed from: a */
    public final Set<Integer> mo135815a() {
        String str;
        String b = C41634v3.f105098C.mo135909b();
        if (this.f104938d == null || (str = this.f104937c) == null || !str.equals(b)) {
            String[] split = TextUtils.split(b, ",");
            HashSet hashSet = new HashSet();
            for (String parseInt : split) {
                try {
                    hashSet.add(Integer.valueOf(Integer.parseInt(parseInt)));
                } catch (NumberFormatException unused) {
                }
            }
            this.f104937c = b;
            this.f104938d = hashSet;
        }
        return this.f104938d;
    }

    /* renamed from: b */
    public final boolean mo135816b() {
        if (this.f104936b == null) {
            synchronized (this) {
                if (this.f104936b == null) {
                    ApplicationInfo applicationInfo = this.f104935a.mo135891a().getApplicationInfo();
                    String a = C40998x.m166697a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = false;
                        if (str != null && str.equals(a)) {
                            z = true;
                        }
                        this.f104936b = Boolean.valueOf(z);
                    }
                    if ((this.f104936b == null || !this.f104936b.booleanValue()) && "com.google.android.gms.analytics".equals(a)) {
                        this.f104936b = Boolean.TRUE;
                    }
                    if (this.f104936b == null) {
                        this.f104936b = Boolean.TRUE;
                        this.f104935a.mo135902m().mo135754q("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f104936b.booleanValue();
    }
}
