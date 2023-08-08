package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import androidx.exifinterface.media.C19135a;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.C22157b;
import com.bumptech.glide.util.C22614a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

@C0376v0(27)
/* renamed from: com.bumptech.glide.load.resource.bitmap.y */
public final class C22445y implements ImageHeaderParser {
    @C0359n0
    /* renamed from: a */
    public ImageHeaderParser.ImageType mo65764a(@C0359n0 ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* renamed from: b */
    public int mo65765b(@C0359n0 ByteBuffer byteBuffer, @C0359n0 C22157b bVar) throws IOException {
        return mo65767d(C22614a.m102580g(byteBuffer), bVar);
    }

    @C0359n0
    /* renamed from: c */
    public ImageHeaderParser.ImageType mo65766c(@C0359n0 InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* renamed from: d */
    public int mo65767d(@C0359n0 InputStream inputStream, @C0359n0 C22157b bVar) throws IOException {
        int r = new C19135a(inputStream).mo56507r(C19135a.f48683C, 1);
        if (r == 0) {
            return -1;
        }
        return r;
    }
}
