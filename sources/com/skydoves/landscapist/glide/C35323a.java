package com.skydoves.landscapist.glide;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.target.C22568e;
import com.bumptech.glide.request.transition.C22598f;
import com.skydoves.landscapist.C35334h;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.C11755m;
import kotlinx.coroutines.channels.C11760r;
import kotlinx.coroutines.channels.C11763t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.skydoves.landscapist.glide.a */
public final class C35323a extends C22568e<Drawable> {
    @C12579k

    /* renamed from: d */
    public final C11760r<C35334h> f86802d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35323a(@C12579k C11760r<? super C35334h> rVar) {
        super(Integer.MIN_VALUE, Integer.MIN_VALUE);
        Intrinsics.checkNotNullParameter(rVar, "producerScope");
        this.f86802d = rVar;
    }

    /* renamed from: e */
    public void mo65592l(@C12579k Drawable drawable, @C12580l C22598f<? super Drawable> fVar) {
        Intrinsics.checkNotNullParameter(drawable, "resource");
    }

    /* renamed from: g */
    public void mo65589g(@C12580l Drawable drawable) {
        super.mo65589g(drawable);
        C11755m.m46713m0(this.f86802d, new C35334h.C35336b(0.0f));
    }

    /* renamed from: k */
    public void mo65591k(@C12580l Drawable drawable) {
        C11755m.m46713m0(this.f86802d, C35334h.C35337c.f86820b);
        C11763t.C11764a.m46772a(this.f86802d.mo23914g(), (Throwable) null, 1, (Object) null);
    }

    /* renamed from: o */
    public void mo65594o(@C12580l Drawable drawable) {
        super.mo65594o(drawable);
        C11755m.m46713m0(this.f86802d, new C35334h.C35335a(drawable));
        C11763t.C11764a.m46772a(this.f86802d.mo23914g(), (Throwable) null, 1, (Object) null);
    }
}
