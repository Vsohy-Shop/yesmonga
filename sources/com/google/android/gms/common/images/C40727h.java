package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40743d;
import com.google.android.gms.internal.base.C41075l;

/* renamed from: com.google.android.gms.common.images.h */
public abstract class C40727h {

    /* renamed from: a */
    public final C40724e f103736a;

    /* renamed from: b */
    public int f103737b = 0;

    public C40727h(Uri uri, int i) {
        this.f103736a = new C40724e(uri);
        this.f103737b = i;
    }

    /* renamed from: a */
    public abstract void mo134257a(@C0363p0 Drawable drawable, boolean z, boolean z2, boolean z3);

    /* renamed from: b */
    public final void mo134262b(Context context, C41075l lVar, boolean z) {
        Drawable drawable;
        int i = this.f103737b;
        if (i != 0) {
            drawable = context.getResources().getDrawable(i);
        } else {
            drawable = null;
        }
        mo134257a(drawable, z, false, false);
    }

    /* renamed from: c */
    public final void mo134263c(Context context, Bitmap bitmap, boolean z) {
        C40743d.m165779c(bitmap);
        mo134257a(new BitmapDrawable(context.getResources(), bitmap), false, false, true);
    }
}
