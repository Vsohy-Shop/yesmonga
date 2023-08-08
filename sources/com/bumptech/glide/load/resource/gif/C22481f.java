package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.C0359n0;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.load.C22280i;
import com.bumptech.glide.load.engine.C22270s;
import com.bumptech.glide.load.resource.bitmap.C22411h;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.gif.f */
public class C22481f implements C22280i<C22477c> {

    /* renamed from: c */
    public final C22280i<Bitmap> f57634c;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, com.bumptech.glide.load.i<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C22481f(com.bumptech.glide.load.C22280i<android.graphics.Bitmap> r1) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.bumptech.glide.util.C22633m.m102624d(r1)
            com.bumptech.glide.load.i r1 = (com.bumptech.glide.load.C22280i) r1
            r0.f57634c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.gif.C22481f.<init>(com.bumptech.glide.load.i):void");
    }

    @C0359n0
    /* renamed from: a */
    public C22270s<C22477c> mo65776a(@C0359n0 Context context, @C0359n0 C22270s<C22477c> sVar, int i, int i2) {
        C22477c cVar = sVar.get();
        C22411h hVar = new C22411h(cVar.mo66508h(), C22038b.m100356e(context).mo65480h());
        C22270s<Bitmap> a = this.f57634c.mo65776a(context, hVar, i, i2);
        if (!hVar.equals(a)) {
            hVar.mo66175a();
        }
        cVar.mo66520r(this.f57634c, a.get());
        return sVar;
    }

    /* renamed from: b */
    public void mo65773b(@C0359n0 MessageDigest messageDigest) {
        this.f57634c.mo65773b(messageDigest);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C22481f) {
            return this.f57634c.equals(((C22481f) obj).f57634c);
        }
        return false;
    }

    public int hashCode() {
        return this.f57634c.hashCode();
    }
}
