package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.gifdecoder.C22068a;
import com.bumptech.glide.load.engine.bitmap_recycle.C22157b;
import com.bumptech.glide.load.engine.bitmap_recycle.C22162e;

/* renamed from: com.bumptech.glide.load.resource.gif.b */
public final class C22476b implements C22068a.C22069a {

    /* renamed from: a */
    public final C22162e f57616a;
    @C0363p0

    /* renamed from: b */
    public final C22157b f57617b;

    public C22476b(C22162e eVar) {
        this(eVar, (C22157b) null);
    }

    /* renamed from: a */
    public void mo65628a(@C0359n0 Bitmap bitmap) {
        this.f57616a.mo65956d(bitmap);
    }

    @C0359n0
    /* renamed from: b */
    public byte[] mo65629b(int i) {
        C22157b bVar = this.f57617b;
        if (bVar == null) {
            return new byte[i];
        }
        return (byte[]) bVar.mo65932c(i, byte[].class);
    }

    @C0359n0
    /* renamed from: c */
    public Bitmap mo65630c(int i, int i2, @C0359n0 Bitmap.Config config) {
        return this.f57616a.mo65959g(i, i2, config);
    }

    @C0359n0
    /* renamed from: d */
    public int[] mo65631d(int i) {
        C22157b bVar = this.f57617b;
        if (bVar == null) {
            return new int[i];
        }
        return (int[]) bVar.mo65932c(i, int[].class);
    }

    /* renamed from: e */
    public void mo65632e(@C0359n0 byte[] bArr) {
        C22157b bVar = this.f57617b;
        if (bVar != null) {
            bVar.mo65934e(bArr);
        }
    }

    /* renamed from: f */
    public void mo65633f(@C0359n0 int[] iArr) {
        C22157b bVar = this.f57617b;
        if (bVar != null) {
            bVar.mo65934e(iArr);
        }
    }

    public C22476b(C22162e eVar, @C0363p0 C22157b bVar) {
        this.f57616a = eVar;
        this.f57617b = bVar;
    }
}
