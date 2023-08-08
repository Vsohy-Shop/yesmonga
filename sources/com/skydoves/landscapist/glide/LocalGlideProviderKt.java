package com.skydoves.landscapist.glide;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.C8550i1;
import androidx.compose.runtime.CompositionLocalKt;
import com.bumptech.glide.C22090i;
import com.bumptech.glide.C22092j;
import com.bumptech.glide.request.C22561h;
import org.jetbrains.annotations.C12579k;

public final class LocalGlideProviderKt {
    @C12579k

    /* renamed from: a */
    public static final C8550i1<C22561h> f86796a = CompositionLocalKt.m29859e(LocalGlideProviderKt$LocalGlideRequestOptions$1.f86801f);
    @C12579k

    /* renamed from: b */
    public static final C8550i1<C22090i<Drawable>> f86797b = CompositionLocalKt.m29859e(LocalGlideProviderKt$LocalGlideRequestBuilder$1.f86799f);
    @C12579k

    /* renamed from: c */
    public static final C8550i1<C22092j> f86798c = CompositionLocalKt.m29859e(LocalGlideProviderKt$LocalGlideRequestManager$1.f86800f);

    @C12579k
    /* renamed from: a */
    public static final C8550i1<C22090i<Drawable>> m145630a() {
        return f86797b;
    }

    @C12579k
    /* renamed from: b */
    public static final C8550i1<C22092j> m145631b() {
        return f86798c;
    }

    @C12579k
    /* renamed from: c */
    public static final C8550i1<C22561h> m145632c() {
        return f86796a;
    }
}
