package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40743d;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.internal.base.C41074k;
import com.google.android.gms.internal.base.zal;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.images.f */
public final class C40725f extends C40727h {

    /* renamed from: c */
    public final WeakReference f103734c;

    public C40725f(ImageView imageView, int i) {
        super(Uri.EMPTY, i);
        C40743d.m165779c(imageView);
        this.f103734c = new WeakReference(imageView);
    }

    /* renamed from: a */
    public final void mo134257a(@C0363p0 Drawable drawable, boolean z, boolean z2, boolean z3) {
        ImageView imageView = (ImageView) this.f103734c.get();
        if (imageView == null) {
            return;
        }
        if (z2 || z3 || !(imageView instanceof zal)) {
            boolean z4 = false;
            if (!z2 && !z) {
                z4 = true;
            }
            if (z4) {
                Drawable drawable2 = imageView.getDrawable();
                if (drawable2 == null) {
                    drawable2 = null;
                } else if (drawable2 instanceof C41074k) {
                    drawable2 = ((C41074k) drawable2).mo134882a();
                }
                drawable = new C41074k(drawable2, drawable);
            }
            imageView.setImageDrawable(drawable);
            if (imageView instanceof zal) {
                zal zal = (zal) imageView;
                throw null;
            } else if (drawable != null && z4) {
                ((C41074k) drawable).mo134883b(250);
            }
        } else {
            zal zal2 = (zal) imageView;
            throw null;
        }
    }

    public final boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40725f)) {
            return false;
        }
        ImageView imageView = (ImageView) this.f103734c.get();
        ImageView imageView2 = (ImageView) ((C40725f) obj).f103734c.get();
        if (imageView2 == null || imageView == null || !C40808s.m166010b(imageView2, imageView)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public C40725f(ImageView imageView, Uri uri) {
        super(uri, 0);
        C40743d.m165779c(imageView);
        this.f103734c = new WeakReference(imageView);
    }
}
