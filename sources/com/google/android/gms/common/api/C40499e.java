package com.google.android.gms.common.api;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.C40858y;

/* renamed from: com.google.android.gms.common.api.e */
public class C40499e implements C40669r {

    /* renamed from: a */
    public final Status f103214a;

    /* renamed from: b */
    public final boolean f103215b;

    @C40473a
    @C40858y
    public C40499e(@C0359n0 Status status, boolean z) {
        this.f103214a = (Status) C40843u.m166203m(status, "Status must not be null");
        this.f103215b = z;
    }

    /* renamed from: a */
    public boolean mo133693a() {
        return this.f103215b;
    }

    public final boolean equals(@C0363p0 Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C40499e)) {
            return false;
        }
        C40499e eVar = (C40499e) obj;
        if (!this.f103214a.equals(eVar.f103214a) || this.f103215b != eVar.f103215b) {
            return false;
        }
        return true;
    }

    @C0359n0
    public Status getStatus() {
        return this.f103214a;
    }

    public final int hashCode() {
        return ((this.f103214a.hashCode() + 527) * 31) + (this.f103215b ? 1 : 0);
    }
}
