package com.google.android.gms.common.api.internal;

import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.C40666o;
import com.google.android.gms.common.api.C40669r;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

@C40473a
/* renamed from: com.google.android.gms.common.api.internal.h */
public abstract class C40558h implements C40669r, C40666o {
    @C40473a
    @C0359n0

    /* renamed from: a */
    public final Status f103378a;
    @C40473a
    @C0359n0

    /* renamed from: b */
    public final DataHolder f103379b;

    @C40473a
    public C40558h(@C0359n0 DataHolder dataHolder, @C0359n0 Status status) {
        this.f103378a = status;
        this.f103379b = dataHolder;
    }

    @C40473a
    @C0359n0
    public Status getStatus() {
        return this.f103378a;
    }

    @C40473a
    public void release() {
        DataHolder dataHolder = this.f103379b;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @C40473a
    public C40558h(@C0359n0 DataHolder dataHolder) {
        this(dataHolder, new Status(dataHolder.mo134142n0()));
    }
}
