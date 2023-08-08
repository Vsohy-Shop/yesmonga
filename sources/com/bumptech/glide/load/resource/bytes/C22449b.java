package com.bumptech.glide.load.resource.bytes;

import androidx.annotation.C0359n0;
import com.bumptech.glide.load.engine.C22270s;
import com.bumptech.glide.util.C22633m;

/* renamed from: com.bumptech.glide.load.resource.bytes.b */
public class C22449b implements C22270s<byte[]> {

    /* renamed from: a */
    public final byte[] f57590a;

    public C22449b(byte[] bArr) {
        this.f57590a = (byte[]) C22633m.m102624d(bArr);
    }

    /* renamed from: a */
    public void mo66175a() {
    }

    @C0359n0
    /* renamed from: b */
    public byte[] get() {
        return this.f57590a;
    }

    @C0359n0
    /* renamed from: c */
    public Class<byte[]> mo66177c() {
        return byte[].class;
    }

    public int getSize() {
        return this.f57590a.length;
    }
}
