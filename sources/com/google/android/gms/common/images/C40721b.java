package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40743d;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.common.images.b */
public final class C40721b implements Runnable {

    /* renamed from: a */
    public final Uri f103724a;
    @C0363p0

    /* renamed from: b */
    public final ParcelFileDescriptor f103725b;

    /* renamed from: c */
    public final /* synthetic */ ImageManager f103726c;

    public C40721b(ImageManager imageManager, @C0363p0 Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
        this.f103726c = imageManager;
        this.f103724a = uri;
        this.f103725b = parcelFileDescriptor;
    }

    public final void run() {
        C40743d.m165778b("LoadBitmapFromDiskRunnable can't be executed in the main thread");
        ParcelFileDescriptor parcelFileDescriptor = this.f103725b;
        Bitmap bitmap = null;
        boolean z = false;
        if (parcelFileDescriptor != null) {
            try {
                bitmap = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
            } catch (OutOfMemoryError unused) {
                "OOM while loading bitmap for uri: ".concat(String.valueOf(this.f103724a));
                z = true;
            }
            try {
                this.f103725b.close();
            } catch (IOException unused2) {
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ImageManager imageManager = this.f103726c;
        imageManager.f103709b.post(new C40723d(imageManager, this.f103724a, bitmap, z, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused3) {
            "Latch interrupted while posting ".concat(String.valueOf(this.f103724a));
        }
    }
}
