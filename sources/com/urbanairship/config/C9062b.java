package com.urbanairship.config;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.util.C17992m;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.config.b */
public class C9062b {

    /* renamed from: a */
    public final String f24412a;

    /* renamed from: b */
    public final String f24413b;

    /* renamed from: c */
    public final String f24414c;

    /* renamed from: d */
    public final String f24415d;

    /* renamed from: e */
    public final String f24416e;

    /* renamed from: f */
    public final String f24417f;

    /* renamed from: com.urbanairship.config.b$b */
    public static class C9064b {

        /* renamed from: a */
        public String f24418a;

        /* renamed from: b */
        public String f24419b;

        /* renamed from: c */
        public String f24420c;

        /* renamed from: d */
        public String f24421d;

        /* renamed from: e */
        public String f24422e;

        /* renamed from: f */
        public String f24423f;

        @C0359n0
        /* renamed from: g */
        public C9062b mo17972g() {
            return new C9062b(this);
        }

        @C0359n0
        /* renamed from: h */
        public C9064b mo17973h(@C0363p0 String str) {
            this.f24419b = str;
            return this;
        }

        @C0359n0
        /* renamed from: i */
        public C9064b mo17974i(@C0363p0 String str) {
            this.f24423f = str;
            return this;
        }

        @C0359n0
        /* renamed from: j */
        public C9064b mo17975j(@C0363p0 String str) {
            this.f24422e = str;
            return this;
        }

        @C0359n0
        /* renamed from: k */
        public C9064b mo17976k(@C0363p0 String str) {
            this.f24418a = str;
            return this;
        }

        @C0359n0
        /* renamed from: l */
        public C9064b mo17977l(@C0363p0 String str) {
            this.f24421d = str;
            return this;
        }

        @C0359n0
        /* renamed from: m */
        public C9064b mo17978m(@C0363p0 String str) {
            this.f24420c = str;
            return this;
        }
    }

    /* renamed from: com.urbanairship.config.b$c */
    public interface C9065c {
        /* renamed from: a */
        void mo17979a();
    }

    @C0359n0
    /* renamed from: h */
    public static C9064b m33756h() {
        return new C9064b();
    }

    @C0359n0
    /* renamed from: a */
    public C9069f mo17961a() {
        return new C9069f(this.f24413b);
    }

    @C0359n0
    /* renamed from: b */
    public C9069f mo17962b() {
        return new C9069f(this.f24417f);
    }

    @C0359n0
    /* renamed from: c */
    public C9069f mo17963c() {
        return new C9069f(this.f24416e);
    }

    @C0359n0
    /* renamed from: d */
    public C9069f mo17964d() {
        return new C9069f(this.f24412a);
    }

    /* renamed from: e */
    public boolean mo17965e() {
        return this.f24417f != null;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9062b bVar = (C9062b) obj;
        if (!C17992m.m81740a(this.f24413b, bVar.f24413b) || !C17992m.m81740a(this.f24412a, bVar.f24412a) || !C17992m.m81740a(this.f24415d, bVar.f24415d) || !C17992m.m81740a(this.f24414c, bVar.f24414c) || !C17992m.m81740a(this.f24416e, bVar.f24416e) || !C17992m.m81740a(this.f24417f, bVar.f24417f)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo17967f() {
        return this.f24416e != null;
    }

    /* renamed from: g */
    public boolean mo17968g() {
        return this.f24412a != null;
    }

    public int hashCode() {
        return C17992m.m81741b(this.f24413b, this.f24412a, this.f24415d, this.f24414c, this.f24416e, this.f24417f);
    }

    @C0359n0
    /* renamed from: i */
    public C9069f mo17970i() {
        return new C9069f(this.f24415d);
    }

    @C0359n0
    /* renamed from: j */
    public C9069f mo17971j() {
        return new C9069f(this.f24414c);
    }

    public C9062b(C9064b bVar) {
        this.f24412a = bVar.f24418a;
        this.f24413b = bVar.f24419b;
        this.f24414c = bVar.f24420c;
        this.f24415d = bVar.f24421d;
        this.f24416e = bVar.f24422e;
        this.f24417f = bVar.f24423f;
    }
}
