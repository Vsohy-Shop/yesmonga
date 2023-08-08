package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Message;
import com.google.android.gms.internal.base.C41084u;

@SuppressLint({"HandlerLeak"})
/* renamed from: com.google.android.gms.common.v */
public final class C41001v extends C41084u {

    /* renamed from: a */
    public final Context f104261a;

    /* renamed from: b */
    public final /* synthetic */ C40713g f104262b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C41001v(com.google.android.gms.common.C40713g r1, android.content.Context r2) {
        /*
            r0 = this;
            r0.f104262b = r1
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto L_0x000d
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            goto L_0x0011
        L_0x000d:
            android.os.Looper r1 = android.os.Looper.myLooper()
        L_0x0011:
            r0.<init>(r1)
            android.content.Context r1 = r2.getApplicationContext()
            r0.f104261a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.C41001v.<init>(com.google.android.gms.common.g, android.content.Context):void");
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            return;
        }
        int j = this.f104262b.mo134208j(this.f104261a);
        if (this.f104262b.mo134210o(j)) {
            this.f104262b.mo134194C(this.f104261a, j);
        }
    }
}
