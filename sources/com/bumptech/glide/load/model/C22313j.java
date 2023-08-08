package com.bumptech.glide.load.model;

import android.text.TextUtils;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.bumptech.glide.load.model.j */
public final class C22313j implements C22310h {

    /* renamed from: c */
    public final Map<String, List<C22312i>> f57319c;

    /* renamed from: d */
    public volatile Map<String, String> f57320d;

    /* renamed from: com.bumptech.glide.load.model.j$a */
    public static final class C22314a {

        /* renamed from: d */
        public static final String f57321d = "User-Agent";

        /* renamed from: e */
        public static final String f57322e;

        /* renamed from: f */
        public static final Map<String, List<C22312i>> f57323f;

        /* renamed from: a */
        public boolean f57324a = true;

        /* renamed from: b */
        public Map<String, List<C22312i>> f57325b = f57323f;

        /* renamed from: c */
        public boolean f57326c = true;

        static {
            String g = m101442g();
            f57322e = g;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(g)) {
                hashMap.put("User-Agent", Collections.singletonList(new C22315b(g)));
            }
            f57323f = Collections.unmodifiableMap(hashMap);
        }

        @C0344h1
        /* renamed from: g */
        public static String m101442g() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        /* renamed from: a */
        public C22314a mo66284a(@C0359n0 String str, @C0359n0 C22312i iVar) {
            if (this.f57326c && "User-Agent".equalsIgnoreCase(str)) {
                return mo66290h(str, iVar);
            }
            mo66288e();
            mo66289f(str).add(iVar);
            return this;
        }

        /* renamed from: b */
        public C22314a mo66285b(@C0359n0 String str, @C0359n0 String str2) {
            return mo66284a(str, new C22315b(str2));
        }

        /* renamed from: c */
        public C22313j mo66286c() {
            this.f57324a = true;
            return new C22313j(this.f57325b);
        }

        /* renamed from: d */
        public final Map<String, List<C22312i>> mo66287d() {
            HashMap hashMap = new HashMap(this.f57325b.size());
            for (Map.Entry next : this.f57325b.entrySet()) {
                hashMap.put(next.getKey(), new ArrayList((Collection) next.getValue()));
            }
            return hashMap;
        }

        /* renamed from: e */
        public final void mo66288e() {
            if (this.f57324a) {
                this.f57324a = false;
                this.f57325b = mo66287d();
            }
        }

        /* renamed from: f */
        public final List<C22312i> mo66289f(String str) {
            List<C22312i> list = this.f57325b.get(str);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            this.f57325b.put(str, arrayList);
            return arrayList;
        }

        /* renamed from: h */
        public C22314a mo66290h(@C0359n0 String str, @C0363p0 C22312i iVar) {
            mo66288e();
            if (iVar == null) {
                this.f57325b.remove(str);
            } else {
                List<C22312i> f = mo66289f(str);
                f.clear();
                f.add(iVar);
            }
            if (this.f57326c && "User-Agent".equalsIgnoreCase(str)) {
                this.f57326c = false;
            }
            return this;
        }

        /* renamed from: i */
        public C22314a mo66291i(@C0359n0 String str, @C0363p0 String str2) {
            return mo66290h(str, str2 == null ? null : new C22315b(str2));
        }
    }

    /* renamed from: com.bumptech.glide.load.model.j$b */
    public static final class C22315b implements C22312i {
        @C0359n0

        /* renamed from: a */
        public final String f57327a;

        public C22315b(@C0359n0 String str) {
            this.f57327a = str;
        }

        /* renamed from: a */
        public String mo66278a() {
            return this.f57327a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C22315b) {
                return this.f57327a.equals(((C22315b) obj).f57327a);
            }
            return false;
        }

        public int hashCode() {
            return this.f57327a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f57327a + '\'' + C12361b.f30259j;
        }
    }

    public C22313j(Map<String, List<C22312i>> map) {
        this.f57319c = Collections.unmodifiableMap(map);
    }

    @C0359n0
    /* renamed from: a */
    public final String mo66279a(@C0359n0 List<C22312i> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String a = list.get(i).mo66278a();
            if (!TextUtils.isEmpty(a)) {
                sb.append(a);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public final Map<String, String> mo66280b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f57319c.entrySet()) {
            String a = mo66279a((List) next.getValue());
            if (!TextUtils.isEmpty(a)) {
                hashMap.put(next.getKey(), a);
            }
        }
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C22313j) {
            return this.f57319c.equals(((C22313j) obj).f57319c);
        }
        return false;
    }

    public Map<String, String> getHeaders() {
        if (this.f57320d == null) {
            synchronized (this) {
                if (this.f57320d == null) {
                    this.f57320d = Collections.unmodifiableMap(mo66280b());
                }
            }
        }
        return this.f57320d;
    }

    public int hashCode() {
        return this.f57319c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f57319c + C12361b.f30259j;
    }
}
