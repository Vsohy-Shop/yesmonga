package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.C22092j;
import com.bumptech.glide.request.C22557e;
import com.bumptech.glide.request.transition.C22598f;

/* renamed from: com.bumptech.glide.request.target.m */
public final class C22580m<Z> extends C22568e<Z> {

    /* renamed from: e */
    public static final int f57940e = 1;

    /* renamed from: f */
    public static final Handler f57941f = new Handler(Looper.getMainLooper(), new C22581a());

    /* renamed from: d */
    public final C22092j f57942d;

    /* renamed from: com.bumptech.glide.request.target.m$a */
    public class C22581a implements Handler.Callback {
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((C22580m) message.obj).mo66912e();
            return true;
        }
    }

    public C22580m(C22092j jVar, int i, int i2) {
        super(i, i2);
        this.f57942d = jVar;
    }

    /* renamed from: f */
    public static <Z> C22580m<Z> m102495f(C22092j jVar, int i, int i2) {
        return new C22580m<>(jVar, i, i2);
    }

    /* renamed from: e */
    public void mo66912e() {
        this.f57942d.mo65712B(this);
    }

    /* renamed from: k */
    public void mo65591k(@C0363p0 Drawable drawable) {
    }

    /* renamed from: l */
    public void mo65592l(@C0359n0 Z z, @C0363p0 C22598f<? super Z> fVar) {
        C22557e request = getRequest();
        if (request != null && request.mo66706b()) {
            f57941f.obtainMessage(1, this).sendToTarget();
        }
    }
}
