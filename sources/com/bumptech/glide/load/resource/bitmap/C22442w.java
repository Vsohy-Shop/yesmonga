package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.C0363p0;
import com.bumptech.glide.load.engine.C22270s;
import com.bumptech.glide.load.engine.bitmap_recycle.C22162e;
import com.bumptech.glide.load.engine.bitmap_recycle.C22163f;
import java.util.concurrent.locks.Lock;

/* renamed from: com.bumptech.glide.load.resource.bitmap.w */
public final class C22442w {

    /* renamed from: a */
    public static final String f57583a = "DrawableToBitmap";

    /* renamed from: b */
    public static final C22162e f57584b = new C22443a();

    /* renamed from: com.bumptech.glide.load.resource.bitmap.w$a */
    public class C22443a extends C22163f {
        /* renamed from: d */
        public void mo65956d(Bitmap bitmap) {
        }
    }

    @C0363p0
    /* renamed from: a */
    public static C22270s<Bitmap> m101875a(C22162e eVar, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            bitmap = m101876b(eVar, current, i, i2);
            z = true;
        } else {
            bitmap = null;
        }
        if (!z) {
            eVar = f57584b;
        }
        return C22411h.m101762e(bitmap, eVar);
    }

    @C0363p0
    /* renamed from: b */
    public static Bitmap m101876b(C22162e eVar, Drawable drawable, int i, int i2) {
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable(f57583a, 5)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to draw ");
                sb.append(drawable);
                sb.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        } else if (i2 != Integer.MIN_VALUE || drawable.getIntrinsicHeight() > 0) {
            if (drawable.getIntrinsicWidth() > 0) {
                i = drawable.getIntrinsicWidth();
            }
            if (drawable.getIntrinsicHeight() > 0) {
                i2 = drawable.getIntrinsicHeight();
            }
            Lock i3 = C22419k0.m101802i();
            i3.lock();
            Bitmap f = eVar.mo65958f(i, i2, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(f);
                drawable.setBounds(0, 0, i, i2);
                drawable.draw(canvas);
                canvas.setBitmap((Bitmap) null);
                return f;
            } finally {
                i3.unlock();
            }
        } else {
            if (Log.isLoggable(f57583a, 5)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to draw ");
                sb2.append(drawable);
                sb2.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
    }
}
