package com.urbanairship.iam;

import androidx.annotation.C0346i;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;

/* renamed from: com.urbanairship.iam.e */
public abstract class C9173e {

    /* renamed from: a */
    public C9174a f24907a;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: com.urbanairship.iam.e$a */
    public interface C9174a {
        /* renamed from: a */
        void mo18403a();
    }

    @C0353k0
    /* renamed from: a */
    public abstract boolean mo18369a();

    @C0353k0
    @C0346i
    /* renamed from: b */
    public final void mo18401b() {
        C9174a aVar = this.f24907a;
        if (aVar != null) {
            aVar.mo18403a();
        }
    }

    @C0353k0
    /* renamed from: c */
    public abstract void mo18370c(@C0359n0 InAppMessage inAppMessage);

    @C0353k0
    /* renamed from: d */
    public abstract void mo18371d(@C0359n0 InAppMessage inAppMessage);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: e */
    public void mo18402e(@C0363p0 C9174a aVar) {
        this.f24907a = aVar;
    }
}
