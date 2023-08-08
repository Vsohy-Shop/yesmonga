package com.bumptech.glide.load.resource.transcode;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.engine.C22270s;
import com.bumptech.glide.load.engine.bitmap_recycle.C22162e;
import com.bumptech.glide.load.resource.bitmap.C22406e0;
import com.bumptech.glide.util.C22633m;

/* renamed from: com.bumptech.glide.load.resource.transcode.b */
public class C22496b implements C22499e<Bitmap, BitmapDrawable> {

    /* renamed from: a */
    public final Resources f57681a;

    public C22496b(@C0359n0 Context context) {
        this(context.getResources());
    }

    @C0363p0
    /* renamed from: a */
    public C22270s<BitmapDrawable> mo66566a(@C0359n0 C22270s<Bitmap> sVar, @C0359n0 C22277f fVar) {
        return C22406e0.m101741e(this.f57681a, sVar);
    }

    @Deprecated
    public C22496b(@C0359n0 Resources resources, C22162e eVar) {
        this(resources);
    }

    public C22496b(@C0359n0 Resources resources) {
        this.f57681a = (Resources) C22633m.m102624d(resources);
    }
}
