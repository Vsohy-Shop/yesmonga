package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.material.circularreveal.C31220c;

public class CircularRevealRelativeLayout extends RelativeLayout implements C31220c {
    @C0359n0

    /* renamed from: a */
    public final C31217b f75112a;

    public CircularRevealRelativeLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public void mo89125a() {
        this.f75112a.mo89139a();
    }

    /* renamed from: b */
    public void mo89126b() {
        this.f75112a.mo89140b();
    }

    /* renamed from: c */
    public void mo89127c(Canvas canvas) {
        super.draw(canvas);
    }

    /* renamed from: d */
    public boolean mo89128d() {
        return super.isOpaque();
    }

    public void draw(@C0359n0 Canvas canvas) {
        C31217b bVar = this.f75112a;
        if (bVar != null) {
            bVar.mo89141c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @C0363p0
    public Drawable getCircularRevealOverlayDrawable() {
        return this.f75112a.mo89145g();
    }

    public int getCircularRevealScrimColor() {
        return this.f75112a.mo89146h();
    }

    @C0363p0
    public C31220c.C31225e getRevealInfo() {
        return this.f75112a.mo89148j();
    }

    public boolean isOpaque() {
        C31217b bVar = this.f75112a;
        if (bVar != null) {
            return bVar.mo89150l();
        }
        return super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(@C0363p0 Drawable drawable) {
        this.f75112a.mo89151m(drawable);
    }

    public void setCircularRevealScrimColor(@C0354l int i) {
        this.f75112a.mo89152n(i);
    }

    public void setRevealInfo(@C0363p0 C31220c.C31225e eVar) {
        this.f75112a.mo89153o(eVar);
    }

    public CircularRevealRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f75112a = new C31217b(this);
    }
}
