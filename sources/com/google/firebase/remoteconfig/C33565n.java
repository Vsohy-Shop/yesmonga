package com.google.firebase.remoteconfig;

import androidx.annotation.C0359n0;
import com.google.firebase.remoteconfig.internal.C33533k;

/* renamed from: com.google.firebase.remoteconfig.n */
public class C33565n {

    /* renamed from: a */
    public final long f81704a;

    /* renamed from: b */
    public final long f81705b;

    /* renamed from: com.google.firebase.remoteconfig.n$b */
    public static class C33567b {

        /* renamed from: a */
        public long f81706a = 60;

        /* renamed from: b */
        public long f81707b = C33533k.f81593j;

        @C0359n0
        /* renamed from: c */
        public C33565n mo97409c() {
            return new C33565n(this);
        }

        /* renamed from: d */
        public long mo97410d() {
            return this.f81706a;
        }

        /* renamed from: e */
        public long mo97411e() {
            return this.f81707b;
        }

        @C0359n0
        /* renamed from: f */
        public C33567b mo97412f(long j) throws IllegalArgumentException {
            if (j >= 0) {
                this.f81706a = j;
                return this;
            }
            throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", new Object[]{Long.valueOf(j)}));
        }

        @C0359n0
        /* renamed from: g */
        public C33567b mo97413g(long j) {
            if (j >= 0) {
                this.f81707b = j;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j + " is an invalid argument");
        }
    }

    /* renamed from: a */
    public long mo97406a() {
        return this.f81704a;
    }

    /* renamed from: b */
    public long mo97407b() {
        return this.f81705b;
    }

    @C0359n0
    /* renamed from: c */
    public C33567b mo97408c() {
        C33567b bVar = new C33567b();
        bVar.mo97412f(mo97406a());
        bVar.mo97413g(mo97407b());
        return bVar;
    }

    public C33565n(C33567b bVar) {
        this.f81704a = bVar.f81706a;
        this.f81705b = bVar.f81707b;
    }
}
