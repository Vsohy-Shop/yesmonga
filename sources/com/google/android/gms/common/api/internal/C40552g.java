package com.google.android.gms.common.api.internal;

import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.internal.C40592n;
import com.google.android.gms.common.data.DataHolder;

@C40473a
/* renamed from: com.google.android.gms.common.api.internal.g */
public abstract class C40552g<L> implements C40592n.C40594b<L> {

    /* renamed from: a */
    public final DataHolder f103367a;

    @C40473a
    public C40552g(@C0359n0 DataHolder dataHolder) {
        this.f103367a = dataHolder;
    }

    @C40473a
    /* renamed from: a */
    public final void mo133900a(@C0359n0 L l) {
        mo133902c(l, this.f103367a);
    }

    @C40473a
    /* renamed from: b */
    public void mo133901b() {
        DataHolder dataHolder = this.f103367a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @C40473a
    /* renamed from: c */
    public abstract void mo133902c(@C0359n0 L l, @C0359n0 DataHolder dataHolder);
}
