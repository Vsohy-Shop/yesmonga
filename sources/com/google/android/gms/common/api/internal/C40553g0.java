package com.google.android.gms.common.api.internal;

import androidx.annotation.C0359n0;
import com.google.android.gms.tasks.C31035e;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31049l;

/* renamed from: com.google.android.gms.common.api.internal.g0 */
public final class C40553g0 implements C31035e {

    /* renamed from: a */
    public final /* synthetic */ C31049l f103368a;

    /* renamed from: b */
    public final /* synthetic */ C40559h0 f103369b;

    public C40553g0(C40559h0 h0Var, C31049l lVar) {
        this.f103369b = h0Var;
        this.f103368a = lVar;
    }

    public final void onComplete(@C0359n0 C31047k kVar) {
        this.f103369b.f103381b.remove(this.f103368a);
    }
}
