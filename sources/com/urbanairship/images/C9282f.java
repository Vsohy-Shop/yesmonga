package com.urbanairship.images;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0372t0;
import androidx.annotation.C0375v;
import com.urbanairship.images.C9275c;

/* renamed from: com.urbanairship.images.f */
public final class C9282f {

    /* renamed from: a */
    public final int f25315a;

    /* renamed from: b */
    public final String f25316b;
    @C0363p0

    /* renamed from: c */
    public final C9275c.C9276a f25317c;

    /* renamed from: d */
    public final int f25318d;

    /* renamed from: e */
    public final int f25319e;

    /* renamed from: com.urbanairship.images.f$b */
    public static final class C9284b {

        /* renamed from: a */
        public int f25320a;

        /* renamed from: b */
        public final String f25321b;

        /* renamed from: c */
        public C9275c.C9276a f25322c;
        @C0372t0

        /* renamed from: d */
        public int f25323d;
        @C0372t0

        /* renamed from: e */
        public int f25324e;

        @C0359n0
        /* renamed from: f */
        public C9282f mo18673f() {
            return new C9282f(this);
        }

        @C0359n0
        /* renamed from: g */
        public C9284b mo18674g(@C0372t0 int i, @C0372t0 int i2) {
            this.f25323d = i;
            this.f25324e = i2;
            return this;
        }

        @C0359n0
        /* renamed from: h */
        public C9284b mo18675h(C9275c.C9276a aVar) {
            this.f25322c = aVar;
            return this;
        }

        @C0359n0
        /* renamed from: i */
        public C9284b mo18676i(@C0375v int i) {
            this.f25320a = i;
            return this;
        }

        public C9284b(@C0363p0 String str) {
            this.f25323d = -1;
            this.f25324e = -1;
            this.f25321b = str;
        }
    }

    @C0359n0
    /* renamed from: f */
    public static C9284b m34839f(@C0363p0 String str) {
        return new C9284b(str);
    }

    @C0363p0
    /* renamed from: a */
    public C9275c.C9276a mo18668a() {
        return this.f25317c;
    }

    @C0375v
    /* renamed from: b */
    public int mo18669b() {
        return this.f25315a;
    }

    @C0363p0
    /* renamed from: c */
    public String mo18670c() {
        return this.f25316b;
    }

    /* renamed from: d */
    public int mo18671d() {
        return this.f25319e;
    }

    /* renamed from: e */
    public int mo18672e() {
        return this.f25318d;
    }

    public C9282f(@C0359n0 C9284b bVar) {
        this.f25316b = bVar.f25321b;
        this.f25315a = bVar.f25320a;
        this.f25317c = bVar.f25322c;
        this.f25318d = bVar.f25323d;
        this.f25319e = bVar.f25324e;
    }
}
