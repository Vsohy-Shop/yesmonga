package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.base.C41084u;

/* renamed from: com.google.android.gms.common.api.internal.h1 */
public final class C40560h1 extends C41084u {

    /* renamed from: a */
    public final /* synthetic */ C40572j1 f103382a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40560h1(C40572j1 j1Var, Looper looper) {
        super(looper);
        this.f103382a = j1Var;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C40572j1.m165152Q(this.f103382a);
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown message id: ");
            sb.append(i);
        } else {
            C40572j1.m165151P(this.f103382a);
        }
    }
}
