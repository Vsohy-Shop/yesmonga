package com.urbanairship.http;

import android.net.Uri;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36059m;
import com.urbanairship.util.C9656j;
import com.urbanairship.util.C9664m0;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.C12361b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.http.c */
public class C9116c<T> {

    /* renamed from: f */
    public static final int f24645f = 429;

    /* renamed from: a */
    public final String f24646a;

    /* renamed from: b */
    public final Map<String, List<String>> f24647b;

    /* renamed from: c */
    public final int f24648c;

    /* renamed from: d */
    public final long f24649d;

    /* renamed from: e */
    public final T f24650e;

    /* renamed from: com.urbanairship.http.c$b */
    public static class C9118b<T> {

        /* renamed from: a */
        public String f24651a;

        /* renamed from: b */
        public Map<String, List<String>> f24652b;

        /* renamed from: c */
        public final int f24653c;

        /* renamed from: d */
        public long f24654d = 0;

        /* renamed from: e */
        public T f24655e;

        public C9118b(int i) {
            this.f24653c = i;
        }

        @C0359n0
        /* renamed from: f */
        public C9116c<T> mo18153f() {
            return new C9116c<>(this);
        }

        @C0359n0
        /* renamed from: g */
        public C9118b<T> mo18154g(long j) {
            this.f24654d = j;
            return this;
        }

        @C0359n0
        /* renamed from: h */
        public C9118b<T> mo18155h(@C0363p0 String str) {
            this.f24651a = str;
            return this;
        }

        @C0359n0
        /* renamed from: i */
        public C9118b<T> mo18156i(@C0363p0 Map<String, List<String>> map) {
            this.f24652b = map;
            return this;
        }

        @C0359n0
        /* renamed from: j */
        public C9118b<T> mo18157j(T t) {
            this.f24655e = t;
            return this;
        }
    }

    /* renamed from: a */
    public long mo18139a() {
        return this.f24649d;
    }

    @C0363p0
    /* renamed from: b */
    public Uri mo18140b() {
        String d = mo18142d("Location");
        if (d == null) {
            return null;
        }
        try {
            return Uri.parse(d);
        } catch (Exception unused) {
            C36059m.m148409e("Failed to parse location header.", new Object[0]);
            return null;
        }
    }

    @C0363p0
    /* renamed from: c */
    public String mo18141c() {
        return this.f24646a;
    }

    @C0363p0
    /* renamed from: d */
    public String mo18142d(@C0359n0 String str) {
        List list;
        Map<String, List<String>> map = this.f24647b;
        if (map == null || (list = map.get(str)) == null || list.size() <= 0) {
            return null;
        }
        return (String) list.get(0);
    }

    @C0363p0
    /* renamed from: e */
    public Map<String, List<String>> mo18143e() {
        return this.f24647b;
    }

    /* renamed from: f */
    public T mo18144f() {
        return this.f24650e;
    }

    /* renamed from: g */
    public long mo18145g(@C0359n0 TimeUnit timeUnit, long j) {
        return mo18146h(timeUnit, j, C9656j.f26468a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        return r6.convert(java.lang.Long.parseLong(r0), java.util.concurrent.TimeUnit.SECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        com.urbanairship.C36059m.m148409e("Invalid RetryAfter header %s", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0019 */
    @androidx.annotation.C0344h1
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo18146h(@androidx.annotation.C0359n0 java.util.concurrent.TimeUnit r6, long r7, @androidx.annotation.C0359n0 com.urbanairship.util.C9656j r9) {
        /*
            r5 = this;
            java.lang.String r0 = "Retry-After"
            java.lang.String r0 = r5.mo18142d(r0)
            if (r0 != 0) goto L_0x0009
            return r7
        L_0x0009:
            long r1 = com.urbanairship.util.C9668o.m36218b(r0)     // Catch:{ ParseException -> 0x0019 }
            long r3 = r9.mo19623a()     // Catch:{ ParseException -> 0x0019 }
            long r1 = r1 - r3
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ParseException -> 0x0019 }
            long r6 = r6.convert(r1, r9)     // Catch:{ ParseException -> 0x0019 }
            return r6
        L_0x0019:
            long r1 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x0024 }
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x0024 }
            long r6 = r6.convert(r1, r9)     // Catch:{ Exception -> 0x0024 }
            return r6
        L_0x0024:
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r9 = 0
            r6[r9] = r0
            java.lang.String r9 = "Invalid RetryAfter header %s"
            com.urbanairship.C36059m.m148409e(r9, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.http.C9116c.mo18146h(java.util.concurrent.TimeUnit, long, com.urbanairship.util.j):long");
    }

    /* renamed from: i */
    public int mo18147i() {
        return this.f24648c;
    }

    /* renamed from: j */
    public boolean mo18148j() {
        return C9664m0.m36194a(this.f24648c);
    }

    /* renamed from: k */
    public boolean mo18149k() {
        return C9664m0.m36196c(this.f24648c);
    }

    /* renamed from: l */
    public boolean mo18150l() {
        return C9664m0.m36197d(this.f24648c);
    }

    /* renamed from: m */
    public boolean mo18151m() {
        return this.f24648c == 429;
    }

    @C0359n0
    public String toString() {
        return "Response{responseBody='" + this.f24646a + '\'' + ", responseHeaders=" + this.f24647b + ", status=" + this.f24648c + ", lastModified=" + this.f24649d + C12361b.f30259j;
    }

    public C9116c(C9118b<T> bVar) {
        this.f24648c = bVar.f24653c;
        this.f24646a = bVar.f24651a;
        this.f24647b = bVar.f24652b;
        this.f24649d = bVar.f24654d;
        this.f24650e = bVar.f24655e;
    }

    public C9116c(@C0359n0 C9116c<T> cVar) {
        this.f24648c = cVar.f24648c;
        this.f24646a = cVar.f24646a;
        this.f24647b = cVar.f24647b;
        this.f24649d = cVar.f24649d;
        this.f24650e = cVar.f24650e;
    }
}
