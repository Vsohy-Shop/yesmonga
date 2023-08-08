package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.manager.C22516m;
import com.bumptech.glide.request.C22557e;
import com.bumptech.glide.request.transition.C22598f;

/* renamed from: com.bumptech.glide.request.target.p */
public interface C22584p<R> extends C22516m {

    /* renamed from: t */
    public static final int f57945t = Integer.MIN_VALUE;

    /* renamed from: d */
    void mo65588d(@C0359n0 C22583o oVar);

    /* renamed from: g */
    void mo65589g(@C0363p0 Drawable drawable);

    @C0363p0
    C22557e getRequest();

    /* renamed from: k */
    void mo65591k(@C0363p0 Drawable drawable);

    /* renamed from: l */
    void mo65592l(@C0359n0 R r, @C0363p0 C22598f<? super R> fVar);

    /* renamed from: n */
    void mo65593n(@C0363p0 C22557e eVar);

    /* renamed from: o */
    void mo65594o(@C0363p0 Drawable drawable);

    /* renamed from: p */
    void mo65595p(@C0359n0 C22583o oVar);
}
