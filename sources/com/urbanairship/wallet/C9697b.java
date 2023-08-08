package com.urbanairship.wallet;

import android.os.Looper;
import com.urbanairship.C36051i;

/* renamed from: com.urbanairship.wallet.b */
public class C9697b extends C36051i {

    /* renamed from: v */
    public C9696a f26553v;

    /* renamed from: w */
    public int f26554w;

    /* renamed from: x */
    public Pass f26555x;

    public C9697b(C9696a aVar, Looper looper) {
        super(looper);
        this.f26553v = aVar;
    }

    /* renamed from: g */
    public void mo19674g() {
        this.f26553v = null;
        this.f26555x = null;
    }

    /* renamed from: h */
    public void mo17473h() {
        C9696a aVar = this.f26553v;
        if (aVar != null) {
            Pass pass = this.f26555x;
            if (pass != null) {
                aVar.mo19673b(pass);
            } else {
                aVar.mo19672a(this.f26554w);
            }
        }
    }

    /* renamed from: i */
    public void mo19675i(int i, Pass pass) {
        if (!isCancelled()) {
            this.f26554w = i;
            this.f26555x = pass;
        }
    }
}
