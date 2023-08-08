package com.android.volley;

import androidx.annotation.C0363p0;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.android.volley.e */
public interface C21751e {

    /* renamed from: com.android.volley.e$a */
    public static class C21752a {

        /* renamed from: a */
        public byte[] f56260a;

        /* renamed from: b */
        public String f56261b;

        /* renamed from: c */
        public long f56262c;

        /* renamed from: d */
        public long f56263d;

        /* renamed from: e */
        public long f56264e;

        /* renamed from: f */
        public long f56265f;

        /* renamed from: g */
        public Map<String, String> f56266g = Collections.emptyMap();

        /* renamed from: h */
        public List<C21759i> f56267h;

        /* renamed from: a */
        public boolean mo64916a() {
            return mo64917b(System.currentTimeMillis());
        }

        /* renamed from: b */
        public boolean mo64917b(long j) {
            return this.f56264e < j;
        }

        /* renamed from: c */
        public boolean mo64918c() {
            return mo64919d(System.currentTimeMillis());
        }

        /* renamed from: d */
        public boolean mo64919d(long j) {
            return this.f56265f < j;
        }
    }

    /* renamed from: b */
    void mo64875b();

    /* renamed from: c */
    void mo64876c(String str, boolean z);

    void clear();

    /* renamed from: d */
    void mo64878d(String str, C21752a aVar);

    /* renamed from: e */
    void mo64879e(String str);

    @C0363p0
    C21752a get(String str);
}
