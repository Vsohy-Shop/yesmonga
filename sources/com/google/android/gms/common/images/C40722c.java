package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.C40743d;

/* renamed from: com.google.android.gms.common.images.c */
public final class C40722c implements Runnable {

    /* renamed from: a */
    public final C40727h f103727a;

    /* renamed from: b */
    public final /* synthetic */ ImageManager f103728b;

    public C40722c(ImageManager imageManager, C40727h hVar) {
        this.f103728b = imageManager;
        this.f103727a = hVar;
    }

    public final void run() {
        C40743d.m165777a("LoadImageRunnable must be executed on the main thread");
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) this.f103728b.f103712e.get(this.f103727a);
        if (imageReceiver != null) {
            this.f103728b.f103712e.remove(this.f103727a);
            imageReceiver.mo134235c(this.f103727a);
        }
        C40727h hVar = this.f103727a;
        C40724e eVar = hVar.f103736a;
        Uri uri = eVar.f103733a;
        if (uri != null) {
            Long l = (Long) this.f103728b.f103714g.get(uri);
            if (l != null) {
                if (SystemClock.elapsedRealtime() - l.longValue() < 3600000) {
                    C40727h hVar2 = this.f103727a;
                    ImageManager imageManager = this.f103728b;
                    hVar2.mo134262b(imageManager.f103708a, imageManager.f103711d, true);
                    return;
                }
                this.f103728b.f103714g.remove(eVar.f103733a);
            }
            this.f103727a.mo134257a((Drawable) null, false, true, false);
            ImageManager.ImageReceiver imageReceiver2 = (ImageManager.ImageReceiver) this.f103728b.f103713f.get(eVar.f103733a);
            if (imageReceiver2 == null) {
                imageReceiver2 = new ImageManager.ImageReceiver(eVar.f103733a);
                this.f103728b.f103713f.put(eVar.f103733a, imageReceiver2);
            }
            imageReceiver2.mo134234b(this.f103727a);
            C40727h hVar3 = this.f103727a;
            if (!(hVar3 instanceof C40726g)) {
                this.f103728b.f103712e.put(hVar3, imageReceiver2);
            }
            synchronized (ImageManager.f103705h) {
                if (!ImageManager.f103706i.contains(eVar.f103733a)) {
                    ImageManager.f103706i.add(eVar.f103733a);
                    imageReceiver2.mo134236d();
                }
            }
            return;
        }
        ImageManager imageManager2 = this.f103728b;
        hVar.mo134262b(imageManager2.f103708a, imageManager2.f103711d, true);
    }
}
