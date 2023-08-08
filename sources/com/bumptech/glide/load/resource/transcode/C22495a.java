package com.bumptech.glide.load.resource.transcode;

import android.graphics.Bitmap;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.engine.C22270s;
import com.bumptech.glide.load.resource.bytes.C22449b;
import java.io.ByteArrayOutputStream;

/* renamed from: com.bumptech.glide.load.resource.transcode.a */
public class C22495a implements C22499e<Bitmap, byte[]> {

    /* renamed from: a */
    public final Bitmap.CompressFormat f57679a;

    /* renamed from: b */
    public final int f57680b;

    public C22495a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @C0363p0
    /* renamed from: a */
    public C22270s<byte[]> mo66566a(@C0359n0 C22270s<Bitmap> sVar, @C0359n0 C22277f fVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        sVar.get().compress(this.f57679a, this.f57680b, byteArrayOutputStream);
        sVar.mo66175a();
        return new C22449b(byteArrayOutputStream.toByteArray());
    }

    public C22495a(@C0359n0 Bitmap.CompressFormat compressFormat, int i) {
        this.f57679a = compressFormat;
        this.f57680b = i;
    }
}
