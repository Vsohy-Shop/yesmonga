package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.C40743d;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.common.images.d */
public final class C40723d implements Runnable {

    /* renamed from: a */
    public final Uri f103729a;
    @C0363p0

    /* renamed from: b */
    public final Bitmap f103730b;

    /* renamed from: c */
    public final CountDownLatch f103731c;

    /* renamed from: d */
    public final /* synthetic */ ImageManager f103732d;

    public C40723d(ImageManager imageManager, @C0363p0 Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
        this.f103732d = imageManager;
        this.f103729a = uri;
        this.f103730b = bitmap;
        this.f103731c = countDownLatch;
    }

    public final void run() {
        C40743d.m165777a("OnBitmapLoadedRunnable must be executed in the main thread");
        Bitmap bitmap = this.f103730b;
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) this.f103732d.f103713f.remove(this.f103729a);
        if (imageReceiver != null) {
            ArrayList a = imageReceiver.f103716b;
            int size = a.size();
            for (int i = 0; i < size; i++) {
                C40727h hVar = (C40727h) a.get(i);
                Bitmap bitmap2 = this.f103730b;
                if (bitmap2 == null || bitmap == null) {
                    this.f103732d.f103714g.put(this.f103729a, Long.valueOf(SystemClock.elapsedRealtime()));
                    ImageManager imageManager = this.f103732d;
                    hVar.mo134262b(imageManager.f103708a, imageManager.f103711d, false);
                } else {
                    hVar.mo134263c(this.f103732d.f103708a, bitmap2, false);
                }
                if (!(hVar instanceof C40726g)) {
                    this.f103732d.f103712e.remove(hVar);
                }
            }
        }
        this.f103731c.countDown();
        synchronized (ImageManager.f103705h) {
            ImageManager.f103706i.remove(this.f103729a);
        }
    }
}
