package com.google.android.datatransport.runtime;

import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.C40203r;
import java.util.Arrays;

/* renamed from: com.google.android.datatransport.runtime.d */
public final class C40120d extends C40203r {

    /* renamed from: a */
    public final String f102356a;

    /* renamed from: b */
    public final byte[] f102357b;

    /* renamed from: c */
    public final Priority f102358c;

    /* renamed from: com.google.android.datatransport.runtime.d$b */
    public static final class C40122b extends C40203r.C40204a {

        /* renamed from: a */
        public String f102359a;

        /* renamed from: b */
        public byte[] f102360b;

        /* renamed from: c */
        public Priority f102361c;

        /* renamed from: a */
        public C40203r mo132742a() {
            String str = "";
            if (this.f102359a == null) {
                str = str + " backendName";
            }
            if (this.f102361c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C40120d(this.f102359a, this.f102360b, this.f102361c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C40203r.C40204a mo132743b(String str) {
            if (str != null) {
                this.f102359a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        /* renamed from: c */
        public C40203r.C40204a mo132744c(@C0363p0 byte[] bArr) {
            this.f102360b = bArr;
            return this;
        }

        /* renamed from: d */
        public C40203r.C40204a mo132745d(Priority priority) {
            if (priority != null) {
                this.f102361c = priority;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    /* renamed from: b */
    public String mo132737b() {
        return this.f102356a;
    }

    @C0363p0
    /* renamed from: c */
    public byte[] mo132738c() {
        return this.f102357b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d */
    public Priority mo132739d() {
        return this.f102358c;
    }

    public boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C40203r)) {
            return false;
        }
        C40203r rVar = (C40203r) obj;
        if (this.f102356a.equals(rVar.mo132737b())) {
            byte[] bArr2 = this.f102357b;
            if (rVar instanceof C40120d) {
                bArr = ((C40120d) rVar).f102357b;
            } else {
                bArr = rVar.mo132738c();
            }
            if (Arrays.equals(bArr2, bArr) && this.f102358c.equals(rVar.mo132739d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f102356a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f102357b)) * 1000003) ^ this.f102358c.hashCode();
    }

    public C40120d(String str, @C0363p0 byte[] bArr, Priority priority) {
        this.f102356a = str;
        this.f102357b = bArr;
        this.f102358c = priority;
    }
}
