package com.urbanairship.reactive;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.reactive.h */
public class C9592h extends C9596k {

    /* renamed from: c */
    public C9596k f26240c;

    /* renamed from: a */
    public synchronized void mo19457a() {
        C9596k kVar = this.f26240c;
        if (!mo19508d()) {
            super.mo19457a();
            this.f26240c = null;
        }
        if (kVar != null) {
            kVar.mo19457a();
        }
    }

    /* renamed from: e */
    public synchronized void mo19503e(@C0359n0 C9596k kVar) {
        if (!mo19508d()) {
            this.f26240c = kVar;
        } else {
            kVar.mo19457a();
        }
    }
}
