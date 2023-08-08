package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.vectordrawable.graphics.drawable.C20715b;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.gifdecoder.C22068a;
import com.bumptech.glide.load.C22280i;
import com.bumptech.glide.load.engine.bitmap_recycle.C22162e;
import com.bumptech.glide.load.resource.gif.C22482g;
import com.bumptech.glide.util.C22633m;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.resource.gif.c */
public class C22477c extends Drawable implements C22482g.C22484b, Animatable, C20715b {

    /* renamed from: X */
    public static final int f57618X = 0;

    /* renamed from: Y */
    public static final int f57619Y = 119;

    /* renamed from: z */
    public static final int f57620z = -1;

    /* renamed from: a */
    public final C22478a f57621a;

    /* renamed from: b */
    public boolean f57622b;

    /* renamed from: c */
    public boolean f57623c;

    /* renamed from: d */
    public boolean f57624d;

    /* renamed from: e */
    public boolean f57625e;

    /* renamed from: f */
    public int f57626f;

    /* renamed from: g */
    public int f57627g;

    /* renamed from: v */
    public boolean f57628v;

    /* renamed from: w */
    public Paint f57629w;

    /* renamed from: x */
    public Rect f57630x;

    /* renamed from: y */
    public List<C20715b.C20716a> f57631y;

    /* renamed from: com.bumptech.glide.load.resource.gif.c$a */
    public static final class C22478a extends Drawable.ConstantState {
        @C0344h1

        /* renamed from: a */
        public final C22482g f57632a;

        public C22478a(C22482g gVar) {
            this.f57632a = gVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        @C0359n0
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @C0359n0
        public Drawable newDrawable() {
            return new C22477c(this);
        }
    }

    @Deprecated
    public C22477c(Context context, C22068a aVar, C22162e eVar, C22280i<Bitmap> iVar, int i, int i2, Bitmap bitmap) {
        this(context, aVar, iVar, i, i2, bitmap);
    }

    /* renamed from: a */
    public void mo66499a() {
        if (mo66501e() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (mo66511j() == mo66509i() - 1) {
            this.f57626f++;
        }
        int i = this.f57627g;
        if (i != -1 && this.f57626f >= i) {
            mo66516o();
            stop();
        }
    }

    /* renamed from: b */
    public void mo61949b(@C0359n0 C20715b.C20716a aVar) {
        if (aVar != null) {
            if (this.f57631y == null) {
                this.f57631y = new ArrayList();
            }
            this.f57631y.add(aVar);
        }
    }

    /* renamed from: c */
    public void mo61950c() {
        List<C20715b.C20716a> list = this.f57631y;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: d */
    public boolean mo61951d(@C0359n0 C20715b.C20716a aVar) {
        List<C20715b.C20716a> list = this.f57631y;
        if (list == null || aVar == null) {
            return false;
        }
        return list.remove(aVar);
    }

    public void draw(@C0359n0 Canvas canvas) {
        if (!this.f57624d) {
            if (this.f57628v) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), mo66503g());
                this.f57628v = false;
            }
            canvas.drawBitmap(this.f57621a.f57632a.mo66537c(), (Rect) null, mo66503g(), mo66513l());
        }
    }

    /* renamed from: e */
    public final Drawable.Callback mo66501e() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: f */
    public ByteBuffer mo66502f() {
        return this.f57621a.f57632a.mo66536b();
    }

    /* renamed from: g */
    public final Rect mo66503g() {
        if (this.f57630x == null) {
            this.f57630x = new Rect();
        }
        return this.f57630x;
    }

    public Drawable.ConstantState getConstantState() {
        return this.f57621a;
    }

    public int getIntrinsicHeight() {
        return this.f57621a.f57632a.mo66542i();
    }

    public int getIntrinsicWidth() {
        return this.f57621a.f57632a.mo66545m();
    }

    public int getOpacity() {
        return -2;
    }

    /* renamed from: h */
    public Bitmap mo66508h() {
        return this.f57621a.f57632a.mo66539e();
    }

    /* renamed from: i */
    public int mo66509i() {
        return this.f57621a.f57632a.mo66540f();
    }

    public boolean isRunning() {
        return this.f57622b;
    }

    /* renamed from: j */
    public int mo66511j() {
        return this.f57621a.f57632a.mo66538d();
    }

    /* renamed from: k */
    public C22280i<Bitmap> mo66512k() {
        return this.f57621a.f57632a.mo66541h();
    }

    /* renamed from: l */
    public final Paint mo66513l() {
        if (this.f57629w == null) {
            this.f57629w = new Paint(2);
        }
        return this.f57629w;
    }

    /* renamed from: m */
    public int mo66514m() {
        return this.f57621a.f57632a.mo66544l();
    }

    /* renamed from: n */
    public boolean mo66515n() {
        return this.f57624d;
    }

    /* renamed from: o */
    public final void mo66516o() {
        List<C20715b.C20716a> list = this.f57631y;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.f57631y.get(i).mo61953b(this);
            }
        }
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f57628v = true;
    }

    /* renamed from: p */
    public void mo66518p() {
        this.f57624d = true;
        this.f57621a.f57632a.mo66535a();
    }

    /* renamed from: q */
    public final void mo66519q() {
        this.f57626f = 0;
    }

    /* renamed from: r */
    public void mo66520r(C22280i<Bitmap> iVar, Bitmap bitmap) {
        this.f57621a.f57632a.mo66549q(iVar, bitmap);
    }

    /* renamed from: s */
    public void mo66521s(boolean z) {
        this.f57622b = z;
    }

    public void setAlpha(int i) {
        mo66513l().setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        mo66513l().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z, boolean z2) {
        C22633m.m102621a(!this.f57624d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f57625e = z;
        if (!z) {
            mo66530w();
        } else if (this.f57623c) {
            mo66529v();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.f57623c = true;
        mo66519q();
        if (this.f57625e) {
            mo66529v();
        }
    }

    public void stop() {
        this.f57623c = false;
        mo66530w();
    }

    /* renamed from: t */
    public void mo66527t(int i) {
        int i2 = -1;
        if (i <= 0 && i != -1 && i != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        } else if (i == 0) {
            int j = this.f57621a.f57632a.mo66543j();
            if (j != 0) {
                i2 = j;
            }
            this.f57627g = i2;
        } else {
            this.f57627g = i;
        }
    }

    /* renamed from: u */
    public void mo66528u() {
        C22633m.m102621a(!this.f57622b, "You cannot restart a currently running animation.");
        this.f57621a.f57632a.mo66550r();
        start();
    }

    /* renamed from: v */
    public final void mo66529v() {
        C22633m.m102621a(!this.f57624d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f57621a.f57632a.mo66540f() == 1) {
            invalidateSelf();
        } else if (!this.f57622b) {
            this.f57622b = true;
            this.f57621a.f57632a.mo66554v(this);
            invalidateSelf();
        }
    }

    /* renamed from: w */
    public final void mo66530w() {
        this.f57622b = false;
        this.f57621a.f57632a.mo66555w(this);
    }

    public C22477c(Context context, C22068a aVar, C22280i<Bitmap> iVar, int i, int i2, Bitmap bitmap) {
        this(new C22478a(new C22482g(C22038b.m100356e(context), aVar, i, i2, iVar, bitmap)));
    }

    public C22477c(C22478a aVar) {
        this.f57625e = true;
        this.f57627g = -1;
        this.f57621a = (C22478a) C22633m.m102624d(aVar);
    }

    @C0344h1
    public C22477c(C22482g gVar, Paint paint) {
        this(new C22478a(gVar));
        this.f57629w = paint;
    }
}
