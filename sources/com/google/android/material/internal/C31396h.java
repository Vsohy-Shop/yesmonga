package com.google.android.material.internal;

import android.widget.Checkable;
import androidx.annotation.C0329d0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.google.android.material.internal.C31396h;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.h */
public interface C31396h<T extends C31396h<T>> extends Checkable {

    /* renamed from: com.google.android.material.internal.h$a */
    public interface C31397a<C> {
        /* renamed from: a */
        void mo90006a(C c, boolean z);
    }

    @C0329d0
    int getId();

    void setInternalOnCheckedChangeListener(@C0363p0 C31397a<T> aVar);
}
