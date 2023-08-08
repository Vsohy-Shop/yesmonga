package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0359n0;
import com.bumptech.glide.C22096k;
import com.bumptech.glide.request.transition.C22592b;
import com.bumptech.glide.request.transition.C22593c;
import com.bumptech.glide.request.transition.C22600g;

/* renamed from: com.bumptech.glide.load.resource.bitmap.j */
public final class C22415j extends C22096k<C22415j, Bitmap> {
    @C0359n0
    /* renamed from: A */
    public static C22415j m101773A(@C0359n0 C22600g<Drawable> gVar) {
        return new C22415j().mo66432o(gVar);
    }

    @C0359n0
    /* renamed from: s */
    public static C22415j m101774s(@C0359n0 C22600g<Bitmap> gVar) {
        return (C22415j) new C22415j().mo65761i(gVar);
    }

    @C0359n0
    /* renamed from: t */
    public static C22415j m101775t() {
        return new C22415j().mo66428k();
    }

    @C0359n0
    /* renamed from: u */
    public static C22415j m101776u(int i) {
        return new C22415j().mo66429l(i);
    }

    @C0359n0
    /* renamed from: v */
    public static C22415j m101777v(@C0359n0 C22593c.C22594a aVar) {
        return new C22415j().mo66430m(aVar);
    }

    @C0359n0
    /* renamed from: x */
    public static C22415j m101778x(@C0359n0 C22593c cVar) {
        return new C22415j().mo66431n(cVar);
    }

    @C0359n0
    /* renamed from: k */
    public C22415j mo66428k() {
        return mo66430m(new C22593c.C22594a());
    }

    @C0359n0
    /* renamed from: l */
    public C22415j mo66429l(int i) {
        return mo66430m(new C22593c.C22594a(i));
    }

    @C0359n0
    /* renamed from: m */
    public C22415j mo66430m(@C0359n0 C22593c.C22594a aVar) {
        return mo66432o(aVar.mo66942a());
    }

    @C0359n0
    /* renamed from: n */
    public C22415j mo66431n(@C0359n0 C22593c cVar) {
        return mo66432o(cVar);
    }

    @C0359n0
    /* renamed from: o */
    public C22415j mo66432o(@C0359n0 C22600g<Drawable> gVar) {
        return (C22415j) mo65761i(new C22592b(gVar));
    }
}
