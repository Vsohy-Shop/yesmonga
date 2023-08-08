package com.google.android.odml.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.annotation.C0359n0;
import java.io.IOException;

/* renamed from: com.google.android.odml.image.b */
public class C31844b {

    /* renamed from: a */
    public final Bitmap f77669a;

    /* renamed from: b */
    public int f77670b;

    /* renamed from: c */
    public Rect f77671c;

    public C31844b(@C0359n0 Context context, @C0359n0 Uri uri) throws IOException {
        this(MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri));
    }

    @C0359n0
    /* renamed from: a */
    public C31850h mo92352a() {
        return new C31850h(new C31859n(this.f77669a), this.f77670b, this.f77671c, 0, this.f77669a.getWidth(), this.f77669a.getHeight());
    }

    @C0359n0
    /* renamed from: b */
    public C31844b mo92353b(int i) {
        C31850h.m129227g(i);
        this.f77670b = i;
        return this;
    }

    public C31844b(@C0359n0 Bitmap bitmap) {
        this.f77669a = bitmap;
        this.f77670b = 0;
        this.f77671c = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
    }
}
