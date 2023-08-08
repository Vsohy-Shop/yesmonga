package com.google.android.datatransport.runtime;

import androidx.annotation.C0359n0;
import com.google.android.datatransport.C40041c;
import java.util.Arrays;

/* renamed from: com.google.android.datatransport.runtime.i */
public final class C40189i {

    /* renamed from: a */
    public final C40041c f102448a;

    /* renamed from: b */
    public final byte[] f102449b;

    public C40189i(@C0359n0 C40041c cVar, @C0359n0 byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.f102448a = cVar;
            this.f102449b = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    /* renamed from: a */
    public byte[] mo132829a() {
        return this.f102449b;
    }

    /* renamed from: b */
    public C40041c mo132830b() {
        return this.f102448a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40189i)) {
            return false;
        }
        C40189i iVar = (C40189i) obj;
        if (!this.f102448a.equals(iVar.f102448a)) {
            return false;
        }
        return Arrays.equals(this.f102449b, iVar.f102449b);
    }

    public int hashCode() {
        return ((this.f102448a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f102449b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f102448a + ", bytes=[...]}";
    }
}
