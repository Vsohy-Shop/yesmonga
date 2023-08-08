package com.google.mlkit.common.model;

import androidx.annotation.C0363p0;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.internal.mlkit_common.C42511s9;
import com.google.android.gms.internal.mlkit_common.C42522t9;

/* renamed from: com.google.mlkit.common.model.f */
public abstract class C33923f {
    @C0363p0

    /* renamed from: a */
    public final String f82325a;

    @C40473a
    public C33923f(@C0363p0 String str) {
        this.f82325a = str;
    }

    @RecentlyNullable
    /* renamed from: a */
    public final String mo98695a() {
        return this.f82325a;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        return C40808s.m166010b(this.f82325a, ((C33923f) obj).f82325a);
    }

    public int hashCode() {
        return C40808s.m166011c(this.f82325a);
    }

    @RecentlyNonNull
    public String toString() {
        C42511s9 b = C42522t9.m171675b("RemoteModelSource");
        b.mo137795a("firebaseModelName", this.f82325a);
        return b.toString();
    }
}
