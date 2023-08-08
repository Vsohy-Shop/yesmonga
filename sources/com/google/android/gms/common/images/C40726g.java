package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.C40743d;
import com.google.android.gms.common.internal.C40808s;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.images.g */
public final class C40726g extends C40727h {

    /* renamed from: c */
    public final WeakReference f103735c;

    public C40726g(ImageManager.C40719a aVar, Uri uri) {
        super(uri, 0);
        C40743d.m165779c(aVar);
        this.f103735c = new WeakReference(aVar);
    }

    /* renamed from: a */
    public final void mo134257a(@C0363p0 Drawable drawable, boolean z, boolean z2, boolean z3) {
        ImageManager.C40719a aVar;
        if (!z2 && (aVar = (ImageManager.C40719a) this.f103735c.get()) != null) {
            aVar.mo134238a(this.f103736a.f103733a, drawable, z3);
        }
    }

    public final boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40726g)) {
            return false;
        }
        C40726g gVar = (C40726g) obj;
        ImageManager.C40719a aVar = (ImageManager.C40719a) this.f103735c.get();
        ImageManager.C40719a aVar2 = (ImageManager.C40719a) gVar.f103735c.get();
        if (aVar2 == null || aVar == null || !C40808s.m166010b(aVar2, aVar) || !C40808s.m166010b(gVar.f103736a, this.f103736a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C40808s.m166011c(this.f103736a);
    }
}
