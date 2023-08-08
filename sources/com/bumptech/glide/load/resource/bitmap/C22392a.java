package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.C0359n0;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.C22278g;
import com.bumptech.glide.load.engine.C22270s;
import com.bumptech.glide.load.engine.bitmap_recycle.C22162e;
import com.bumptech.glide.util.C22633m;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.resource.bitmap.a */
public class C22392a<DataType> implements C22278g<DataType, BitmapDrawable> {

    /* renamed from: a */
    public final C22278g<DataType, Bitmap> f57473a;

    /* renamed from: b */
    public final Resources f57474b;

    public C22392a(Context context, C22278g<DataType, Bitmap> gVar) {
        this(context.getResources(), gVar);
    }

    /* renamed from: a */
    public boolean mo66236a(@C0359n0 DataType datatype, @C0359n0 C22277f fVar) throws IOException {
        return this.f57473a.mo66236a(datatype, fVar);
    }

    /* renamed from: b */
    public C22270s<BitmapDrawable> mo66237b(@C0359n0 DataType datatype, int i, int i2, @C0359n0 C22277f fVar) throws IOException {
        return C22406e0.m101741e(this.f57474b, this.f57473a.mo66237b(datatype, i, i2, fVar));
    }

    @Deprecated
    public C22392a(Resources resources, C22162e eVar, C22278g<DataType, Bitmap> gVar) {
        this(resources, gVar);
    }

    public C22392a(@C0359n0 Resources resources, @C0359n0 C22278g<DataType, Bitmap> gVar) {
        this.f57474b = (Resources) C22633m.m102624d(resources);
        this.f57473a = (C22278g) C22633m.m102624d(gVar);
    }
}
