package com.google.android.material.circularreveal.cardview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.circularreveal.C31217b;
import com.google.android.material.circularreveal.C31220c;

public class CircularRevealCardView extends MaterialCardView implements C31220c {
    @C0359n0

    /* renamed from: Q0 */
    public final C31217b f75137Q0;

    public CircularRevealCardView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public void mo89125a() {
        this.f75137Q0.mo89139a();
    }

    /* renamed from: b */
    public void mo89126b() {
        this.f75137Q0.mo89140b();
    }

    /* renamed from: c */
    public void mo89127c(Canvas canvas) {
        super.draw(canvas);
    }

    /* renamed from: d */
    public boolean mo89128d() {
        return super.isOpaque();
    }

    public void draw(Canvas canvas) {
        C31217b bVar = this.f75137Q0;
        if (bVar != null) {
            bVar.mo89141c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @C0363p0
    public Drawable getCircularRevealOverlayDrawable() {
        return this.f75137Q0.mo89145g();
    }

    public int getCircularRevealScrimColor() {
        return this.f75137Q0.mo89146h();
    }

    @C0363p0
    public C31220c.C31225e getRevealInfo() {
        return this.f75137Q0.mo89148j();
    }

    public boolean isOpaque() {
        C31217b bVar = this.f75137Q0;
        if (bVar != null) {
            return bVar.mo89150l();
        }
        return super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(@C0363p0 Drawable drawable) {
        this.f75137Q0.mo89151m(drawable);
    }

    public void setCircularRevealScrimColor(@C0354l int i) {
        this.f75137Q0.mo89152n(i);
    }

    public void setRevealInfo(@C0363p0 C31220c.C31225e eVar) {
        this.f75137Q0.mo89153o(eVar);
    }

    public CircularRevealCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f75137Q0 = new C31217b(this);
    }
}
