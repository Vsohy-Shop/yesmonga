package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.C0341g1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: g */
    public static final int f47148g = 500;

    /* renamed from: v */
    public static final int f47149v = 500;

    /* renamed from: a */
    public long f47150a;

    /* renamed from: b */
    public boolean f47151b;

    /* renamed from: c */
    public boolean f47152c;

    /* renamed from: d */
    public boolean f47153d;

    /* renamed from: e */
    public final Runnable f47154e;

    /* renamed from: f */
    public final Runnable f47155f;

    public ContentLoadingProgressBar(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m83519g() {
        this.f47151b = false;
        this.f47150a = -1;
        setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m83520h() {
        this.f47152c = false;
        if (!this.f47153d) {
            this.f47150a = System.currentTimeMillis();
            setVisibility(0);
        }
    }

    /* renamed from: e */
    public void mo53203e() {
        post(new C18477f(this));
    }

    @C0341g1
    /* renamed from: f */
    public final void mo53204f() {
        this.f47153d = true;
        removeCallbacks(this.f47155f);
        this.f47152c = false;
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.f47150a;
        long j2 = currentTimeMillis - j;
        if (j2 >= 500 || j == -1) {
            setVisibility(8);
        } else if (!this.f47151b) {
            postDelayed(this.f47154e, 500 - j2);
            this.f47151b = true;
        }
    }

    /* renamed from: i */
    public final void mo53205i() {
        removeCallbacks(this.f47154e);
        removeCallbacks(this.f47155f);
    }

    /* renamed from: j */
    public void mo53206j() {
        post(new C18476e(this));
    }

    @C0341g1
    /* renamed from: k */
    public final void mo53207k() {
        this.f47150a = -1;
        this.f47153d = false;
        removeCallbacks(this.f47154e);
        this.f47151b = false;
        if (!this.f47152c) {
            postDelayed(this.f47155f, 500);
            this.f47152c = true;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo53205i();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo53205i();
    }

    public ContentLoadingProgressBar(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f47150a = -1;
        this.f47151b = false;
        this.f47152c = false;
        this.f47153d = false;
        this.f47154e = new C18478g(this);
        this.f47155f = new C18479h(this);
    }
}
