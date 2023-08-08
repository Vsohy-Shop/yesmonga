package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.base.C41084u;

/* renamed from: com.google.android.gms.common.api.internal.m1 */
public final class C40589m1 extends C41084u {

    /* renamed from: a */
    public final /* synthetic */ C40596n1 f103483a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40589m1(C40596n1 n1Var, Looper looper) {
        super(looper);
        this.f103483a = n1Var;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((C40584l1) message.obj).mo133981b(this.f103483a);
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown message id: ");
            sb.append(i);
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
