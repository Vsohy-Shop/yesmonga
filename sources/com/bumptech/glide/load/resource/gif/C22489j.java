package com.bumptech.glide.load.resource.gif;

import androidx.annotation.C0359n0;
import com.bumptech.glide.load.C22099b;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.C22278g;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.C22270s;
import com.bumptech.glide.load.engine.bitmap_recycle.C22157b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.bumptech.glide.load.resource.gif.j */
public class C22489j implements C22278g<InputStream, C22477c> {

    /* renamed from: d */
    public static final String f57664d = "StreamGifDecoder";

    /* renamed from: a */
    public final List<ImageHeaderParser> f57665a;

    /* renamed from: b */
    public final C22278g<ByteBuffer, C22477c> f57666b;

    /* renamed from: c */
    public final C22157b f57667c;

    public C22489j(List<ImageHeaderParser> list, C22278g<ByteBuffer, C22477c> gVar, C22157b bVar) {
        this.f57665a = list;
        this.f57666b = gVar;
        this.f57667c = bVar;
    }

    /* renamed from: e */
    public static byte[] m102039e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public C22270s<C22477c> mo66237b(@C0359n0 InputStream inputStream, int i, int i2, @C0359n0 C22277f fVar) throws IOException {
        byte[] e = m102039e(inputStream);
        if (e == null) {
            return null;
        }
        return this.f57666b.mo66237b(ByteBuffer.wrap(e), i, i2, fVar);
    }

    /* renamed from: d */
    public boolean mo66236a(@C0359n0 InputStream inputStream, @C0359n0 C22277f fVar) throws IOException {
        if (((Boolean) fVar.mo66232c(C22488i.f57663b)).booleanValue() || C22099b.m100714f(this.f57665a, inputStream, this.f57667c) != ImageHeaderParser.ImageType.GIF) {
            return false;
        }
        return true;
    }
}
