package com.google.android.gms.internal.gtm;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.google.android.gms.internal.gtm.m7 */
public final class C41422m7 implements Handler.Callback {

    /* renamed from: c */
    public final /* synthetic */ C41470o7 f104792c;

    public C41422m7(C41470o7 o7Var) {
        this.f104792c = o7Var;
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1 && C41494p7.f104859l.equals(message.obj)) {
            this.f104792c.f104832b.mo135711i();
            if (!this.f104792c.f104832b.mo135714n()) {
                this.f104792c.mo135617a(1800000);
            }
        }
        return true;
    }
}
