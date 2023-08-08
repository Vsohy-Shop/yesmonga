package com.android.volley.toolbox;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.C0353k0;
import androidx.annotation.C0363p0;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.C21818q;

public class NetworkImageView extends ImageView {

    /* renamed from: a */
    public String f56343a;

    /* renamed from: b */
    public int f56344b;
    @C0363p0

    /* renamed from: c */
    public Drawable f56345c;
    @C0363p0

    /* renamed from: d */
    public Bitmap f56346d;

    /* renamed from: e */
    public int f56347e;
    @C0363p0

    /* renamed from: f */
    public Drawable f56348f;
    @C0363p0

    /* renamed from: g */
    public Bitmap f56349g;

    /* renamed from: v */
    public C21818q f56350v;

    /* renamed from: w */
    public C21818q.C21825g f56351w;

    /* renamed from: com.android.volley.toolbox.NetworkImageView$a */
    public class C21780a implements C21818q.C21826h {

        /* renamed from: a */
        public final /* synthetic */ boolean f56352a;

        /* renamed from: com.android.volley.toolbox.NetworkImageView$a$a */
        public class C21781a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C21818q.C21825g f56354a;

            public C21781a(C21818q.C21825g gVar) {
                this.f56354a = gVar;
            }

            public void run() {
                C21780a.this.mo64978a(this.f56354a, false);
            }
        }

        public C21780a(boolean z) {
            this.f56352a = z;
        }

        /* renamed from: a */
        public void mo64978a(C21818q.C21825g gVar, boolean z) {
            if (z && this.f56352a) {
                NetworkImageView.this.post(new C21781a(gVar));
            } else if (gVar.mo65056d() != null) {
                NetworkImageView.this.setImageBitmap(gVar.mo65056d());
            } else if (NetworkImageView.this.f56344b != 0) {
                NetworkImageView networkImageView = NetworkImageView.this;
                networkImageView.setImageResource(networkImageView.f56344b);
            } else if (NetworkImageView.this.f56345c != null) {
                NetworkImageView networkImageView2 = NetworkImageView.this;
                networkImageView2.setImageDrawable(networkImageView2.f56345c);
            } else if (NetworkImageView.this.f56346d != null) {
                NetworkImageView networkImageView3 = NetworkImageView.this;
                networkImageView3.setImageBitmap(networkImageView3.f56346d);
            }
        }

        /* renamed from: c */
        public void mo20312c(VolleyError volleyError) {
            if (NetworkImageView.this.f56347e != 0) {
                NetworkImageView networkImageView = NetworkImageView.this;
                networkImageView.setImageResource(networkImageView.f56347e);
            } else if (NetworkImageView.this.f56348f != null) {
                NetworkImageView networkImageView2 = NetworkImageView.this;
                networkImageView2.setImageDrawable(networkImageView2.f56348f);
            } else if (NetworkImageView.this.f56349g != null) {
                NetworkImageView networkImageView3 = NetworkImageView.this;
                networkImageView3.setImageBitmap(networkImageView3.f56349g);
            }
        }
    }

    public NetworkImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    /* renamed from: g */
    public void mo64967g(boolean z) {
        boolean z2;
        boolean z3;
        int i;
        int width = getWidth();
        int height = getHeight();
        ImageView.ScaleType scaleType = getScaleType();
        boolean z4 = true;
        if (getLayoutParams() != null) {
            if (getLayoutParams().width == -2) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (getLayoutParams().height == -2) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z3 = false;
            z2 = false;
        }
        if (!z3 || !z2) {
            z4 = false;
        }
        if (width != 0 || height != 0 || z4) {
            if (TextUtils.isEmpty(this.f56343a)) {
                C21818q.C21825g gVar = this.f56351w;
                if (gVar != null) {
                    gVar.mo65055c();
                    this.f56351w = null;
                }
                mo64968h();
                return;
            }
            C21818q.C21825g gVar2 = this.f56351w;
            if (!(gVar2 == null || gVar2.mo65057e() == null)) {
                if (!this.f56351w.mo65057e().equals(this.f56343a)) {
                    this.f56351w.mo65055c();
                    mo64968h();
                } else {
                    return;
                }
            }
            if (z3) {
                width = 0;
            }
            if (z2) {
                i = 0;
            } else {
                i = height;
            }
            this.f56351w = this.f56350v.mo65040g(this.f56343a, new C21780a(z), width, i, scaleType);
        }
    }

    /* renamed from: h */
    public final void mo64968h() {
        int i = this.f56344b;
        if (i != 0) {
            setImageResource(i);
            return;
        }
        Drawable drawable = this.f56345c;
        if (drawable != null) {
            setImageDrawable(drawable);
            return;
        }
        Bitmap bitmap = this.f56346d;
        if (bitmap != null) {
            setImageBitmap(bitmap);
        } else {
            setImageBitmap((Bitmap) null);
        }
    }

    public void onDetachedFromWindow() {
        C21818q.C21825g gVar = this.f56351w;
        if (gVar != null) {
            gVar.mo65055c();
            setImageBitmap((Bitmap) null);
            this.f56351w = null;
        }
        super.onDetachedFromWindow();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo64967g(true);
    }

    public void setDefaultImageBitmap(Bitmap bitmap) {
        this.f56344b = 0;
        this.f56345c = null;
        this.f56346d = bitmap;
    }

    public void setDefaultImageDrawable(@C0363p0 Drawable drawable) {
        this.f56344b = 0;
        this.f56346d = null;
        this.f56345c = drawable;
    }

    public void setDefaultImageResId(int i) {
        this.f56346d = null;
        this.f56345c = null;
        this.f56344b = i;
    }

    public void setErrorImageBitmap(Bitmap bitmap) {
        this.f56347e = 0;
        this.f56348f = null;
        this.f56349g = bitmap;
    }

    public void setErrorImageDrawable(@C0363p0 Drawable drawable) {
        this.f56347e = 0;
        this.f56349g = null;
        this.f56348f = drawable;
    }

    public void setErrorImageResId(int i) {
        this.f56349g = null;
        this.f56348f = null;
        this.f56347e = i;
    }

    @C0353k0
    public void setImageUrl(String str, C21818q qVar) {
        C21785b0.m100130a();
        this.f56343a = str;
        this.f56350v = qVar;
        mo64967g(false);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
