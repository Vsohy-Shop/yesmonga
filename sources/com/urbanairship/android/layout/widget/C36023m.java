package com.urbanairship.android.layout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.android.layout.shape.C35870a;
import com.urbanairship.android.layout.widget.C36017i;

/* renamed from: com.urbanairship.android.layout.widget.m */
public class C36023m extends C36017i {

    /* renamed from: c */
    public final C36025b f89010c;

    /* renamed from: d */
    public final Rect f89011d;

    /* renamed from: com.urbanairship.android.layout.widget.m$b */
    public static final class C36025b extends C36017i.C36018a {

        /* renamed from: c */
        public int f89012c;

        /* renamed from: d */
        public Drawable.ConstantState f89013d;

        /* renamed from: e */
        public Drawable f89014e;

        /* renamed from: f */
        public float f89015f;

        /* renamed from: g */
        public float f89016g;

        public C36025b(@C0363p0 C36025b bVar) {
            super(bVar, (Resources) null);
            if (bVar != null) {
                this.f89012c = bVar.f89012c;
                this.f89013d = bVar.f89013d;
                this.f89014e = bVar.f89014e;
                this.f89015f = bVar.f89015f;
                this.f89016g = bVar.f89016g;
            }
        }

        @C0359n0
        public Drawable newDrawable(@C0363p0 Resources resources) {
            return new C36023m(this, resources);
        }
    }

    /* renamed from: c */
    public final void mo107756c() {
        Drawable drawable;
        C36025b bVar = this.f89010c;
        if (bVar != null && (drawable = bVar.f89014e) != null) {
            mo107712b(drawable);
        }
    }

    public final Drawable.ConstantState getConstantState() {
        this.f89010c.f89012c |= getChangingConfigurations();
        return this.f89010c;
    }

    public int getIntrinsicHeight() {
        return -1;
    }

    public int getIntrinsicWidth() {
        return -1;
    }

    public void onBoundsChange(@C0359n0 Rect rect) {
        int i;
        int i2;
        Rect rect2 = this.f89011d;
        rect2.set(rect);
        float f = this.f89010c.f89016g;
        if (f == 1.0f) {
            i2 = Math.min(rect.width(), rect.height());
            i = i2;
        } else if (f > 1.0f) {
            i2 = rect.width();
            i = (int) (((float) rect.height()) / this.f89010c.f89016g);
        } else {
            i2 = (int) (((float) rect.width()) * this.f89010c.f89016g);
            i = rect.height();
        }
        float f2 = this.f89010c.f89015f;
        int width = (rect.width() - ((int) (((float) i2) * f2))) / 2;
        int height = (rect.height() - ((int) (((float) i) * f2))) / 2;
        rect2.left += width;
        rect2.right -= width;
        rect2.top += height;
        rect2.bottom -= height;
        super.onBoundsChange(rect2);
    }

    public C36023m(@C0359n0 Context context, @C0359n0 C35870a aVar) {
        this(aVar.mo107480f(context), aVar.mo107477c(), aVar.mo107481g());
    }

    public C36023m(@C0359n0 Drawable drawable, float f, float f2) {
        this(new C36025b((C36025b) null), (Resources) null);
        C36025b bVar = this.f89010c;
        bVar.f89016g = f;
        bVar.f89015f = f2;
        mo107712b(drawable);
    }

    public C36023m(@C0363p0 C36025b bVar, @C0363p0 Resources resources) {
        super(bVar, resources);
        this.f89011d = new Rect();
        this.f89010c = bVar;
        mo107756c();
    }
}
