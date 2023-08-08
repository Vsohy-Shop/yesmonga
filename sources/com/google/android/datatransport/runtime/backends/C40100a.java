package com.google.android.datatransport.runtime.backends;

import androidx.annotation.C0363p0;
import com.google.android.datatransport.runtime.C40190j;
import com.google.android.datatransport.runtime.backends.C40108g;
import java.util.Arrays;

/* renamed from: com.google.android.datatransport.runtime.backends.a */
public final class C40100a extends C40108g {

    /* renamed from: a */
    public final Iterable<C40190j> f102320a;

    /* renamed from: b */
    public final byte[] f102321b;

    /* renamed from: com.google.android.datatransport.runtime.backends.a$b */
    public static final class C40102b extends C40108g.C40109a {

        /* renamed from: a */
        public Iterable<C40190j> f102322a;

        /* renamed from: b */
        public byte[] f102323b;

        /* renamed from: a */
        public C40108g mo132702a() {
            String str = "";
            if (this.f102322a == null) {
                str = str + " events";
            }
            if (str.isEmpty()) {
                return new C40100a(this.f102322a, this.f102323b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C40108g.C40109a mo132703b(Iterable<C40190j> iterable) {
            if (iterable != null) {
                this.f102322a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        /* renamed from: c */
        public C40108g.C40109a mo132704c(@C0363p0 byte[] bArr) {
            this.f102323b = bArr;
            return this;
        }
    }

    /* renamed from: c */
    public Iterable<C40190j> mo132697c() {
        return this.f102320a;
    }

    @C0363p0
    /* renamed from: d */
    public byte[] mo132698d() {
        return this.f102321b;
    }

    public boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C40108g)) {
            return false;
        }
        C40108g gVar = (C40108g) obj;
        if (this.f102320a.equals(gVar.mo132697c())) {
            byte[] bArr2 = this.f102321b;
            if (gVar instanceof C40100a) {
                bArr = ((C40100a) gVar).f102321b;
            } else {
                bArr = gVar.mo132698d();
            }
            if (Arrays.equals(bArr2, bArr)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f102320a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f102321b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f102320a + ", extras=" + Arrays.toString(this.f102321b) + "}";
    }

    public C40100a(Iterable<C40190j> iterable, @C0363p0 byte[] bArr) {
        this.f102320a = iterable;
        this.f102321b = bArr;
    }
}
