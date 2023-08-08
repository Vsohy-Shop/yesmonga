package com.skydoves.landscapist.glide;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C17553e;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.C22560g;
import com.bumptech.glide.request.target.C22584p;
import com.skydoves.landscapist.C35334h;
import com.skydoves.landscapist.palette.BitmapPalette;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.C11755m;
import kotlinx.coroutines.channels.C11760r;
import kotlinx.coroutines.channels.C11763t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.skydoves.landscapist.glide.b */
public final class C35324b implements C22560g<Drawable> {
    @C12579k

    /* renamed from: a */
    public final C11760r<C35334h> f86803a;
    @C12580l

    /* renamed from: b */
    public final BitmapPalette f86804b;

    public C35324b(@C12579k C11760r<? super C35334h> rVar, @C12580l BitmapPalette bitmapPalette) {
        Intrinsics.checkNotNullParameter(rVar, "producerScope");
        this.f86803a = rVar;
        this.f86804b = bitmapPalette;
    }

    /* renamed from: a */
    public boolean mo66827f(@C12580l Drawable drawable, @C12580l Object obj, @C12580l C22584p<Drawable> pVar, @C12580l DataSource dataSource, boolean z) {
        C11755m.m46713m0(this.f86803a, new C35334h.C35338d(drawable));
        Bitmap bitmap = null;
        C11763t.C11764a.m46772a(this.f86803a.mo23914g(), (Throwable) null, 1, (Object) null);
        BitmapPalette bitmapPalette = this.f86804b;
        if (bitmapPalette != null) {
            if (drawable != null) {
                bitmap = C17553e.m80474b(drawable, 0, 0, (Bitmap.Config) null, 7, (Object) null);
            }
            bitmapPalette.mo105860d(bitmap);
        }
        return true;
    }

    /* renamed from: e */
    public boolean mo66826e(@C12580l GlideException glideException, @C12580l Object obj, @C12580l C22584p<Drawable> pVar, boolean z) {
        return false;
    }
}
