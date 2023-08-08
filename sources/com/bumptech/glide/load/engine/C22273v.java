package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.bumptech.glide.load.engine.v */
public class C22273v {

    /* renamed from: a */
    public boolean f57266a;

    /* renamed from: b */
    public final Handler f57267b = new Handler(Looper.getMainLooper(), new C22274a());

    /* renamed from: com.bumptech.glide.load.engine.v$a */
    public static final class C22274a implements Handler.Callback {

        /* renamed from: c */
        public static final int f57268c = 1;

        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((C22270s) message.obj).mo66175a();
            return true;
        }
    }

    /* renamed from: a */
    public synchronized void mo66224a(C22270s<?> sVar, boolean z) {
        if (!this.f57266a) {
            if (!z) {
                this.f57266a = true;
                sVar.mo66175a();
                this.f57266a = false;
            }
        }
        this.f57267b.obtainMessage(1, sVar).sendToTarget();
    }
}
