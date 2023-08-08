package com.bumptech.glide.request.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.request.transition.C22598f;

/* renamed from: com.bumptech.glide.request.target.j */
public abstract class C22577j<Z> extends C22586r<ImageView, Z> implements C22598f.C22599a {
    @C0363p0

    /* renamed from: x */
    public Animatable f57933x;

    public C22577j(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: a */
    public void mo65585a() {
        Animatable animatable = this.f57933x;
        if (animatable != null) {
            animatable.stop();
        }
    }

    /* renamed from: b */
    public void mo65586b() {
        Animatable animatable = this.f57933x;
        if (animatable != null) {
            animatable.start();
        }
    }

    /* renamed from: e */
    public void mo66904e(Drawable drawable) {
        ((ImageView) this.f57949b).setImageDrawable(drawable);
    }

    @C0363p0
    /* renamed from: f */
    public Drawable mo66905f() {
        return ((ImageView) this.f57949b).getDrawable();
    }

    /* renamed from: g */
    public void mo65589g(@C0363p0 Drawable drawable) {
        super.mo65589g(drawable);
        mo66907x((Object) null);
        mo66904e(drawable);
    }

    /* renamed from: k */
    public void mo65591k(@C0363p0 Drawable drawable) {
        super.mo65591k(drawable);
        Animatable animatable = this.f57933x;
        if (animatable != null) {
            animatable.stop();
        }
        mo66907x((Object) null);
        mo66904e(drawable);
    }

    /* renamed from: l */
    public void mo65592l(@C0359n0 Z z, @C0363p0 C22598f<? super Z> fVar) {
        if (fVar == null || !fVar.mo66939a(z, this)) {
            mo66907x(z);
        } else {
            mo66906v(z);
        }
    }

    /* renamed from: o */
    public void mo65594o(@C0363p0 Drawable drawable) {
        super.mo65594o(drawable);
        mo66907x((Object) null);
        mo66904e(drawable);
    }

    /* renamed from: v */
    public final void mo66906v(@C0363p0 Z z) {
        if (z instanceof Animatable) {
            Animatable animatable = (Animatable) z;
            this.f57933x = animatable;
            animatable.start();
            return;
        }
        this.f57933x = null;
    }

    /* renamed from: w */
    public abstract void mo66843w(@C0363p0 Z z);

    /* renamed from: x */
    public final void mo66907x(@C0363p0 Z z) {
        mo66843w(z);
        mo66906v(z);
    }

    @Deprecated
    public C22577j(ImageView imageView, boolean z) {
        super(imageView, z);
    }
}
