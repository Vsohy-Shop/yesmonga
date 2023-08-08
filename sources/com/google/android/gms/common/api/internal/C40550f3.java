package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.C40663m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.base.C41084u;

/* renamed from: com.google.android.gms.common.api.internal.f3 */
public final class C40550f3 extends C41084u {

    /* renamed from: a */
    public final /* synthetic */ C40562h3 f103365a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40550f3(C40562h3 h3Var, Looper looper) {
        super(looper);
        this.f103365a = h3Var;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            C40663m mVar = (C40663m) message.obj;
            synchronized (this.f103365a.f103389e) {
                C40562h3 h3Var = (C40562h3) C40843u.m166202l(this.f103365a.f103386b);
                if (mVar == null) {
                    h3Var.mo133922m(new Status(13, "Transform returned null"));
                } else if (mVar instanceof C40638v2) {
                    h3Var.mo133922m(((C40638v2) mVar).mo134074k());
                } else {
                    h3Var.mo133921l(mVar);
                }
            }
        } else if (i != 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("TransformationResultHandler received unknown message type: ");
            sb.append(i);
        } else {
            RuntimeException runtimeException = (RuntimeException) message.obj;
            "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage()));
            throw runtimeException;
        }
    }
}
