package com.google.android.datatransport.cct.internal;

import androidx.annotation.C0359n0;
import com.google.firebase.encoders.annotations.C32995a;
import java.util.List;

/* renamed from: com.google.android.datatransport.cct.internal.d */
public final class C40063d extends C40077j {

    /* renamed from: a */
    public final List<C40080l> f102241a;

    public C40063d(List<C40080l> list) {
        if (list != null) {
            this.f102241a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    @C0359n0
    @C32995a.C32996a(name = "logRequest")
    /* renamed from: c */
    public List<C40080l> mo132614c() {
        return this.f102241a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C40077j) {
            return this.f102241a.equals(((C40077j) obj).mo132614c());
        }
        return false;
    }

    public int hashCode() {
        return this.f102241a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f102241a + "}";
    }
}
