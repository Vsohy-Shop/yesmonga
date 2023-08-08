package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0375v;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.core.view.C18164e2;
import androidx.core.widget.C18475d0;

public class AppCompatImageButton extends ImageButton implements C18164e2, C18475d0 {

    /* renamed from: a */
    public final C0706d f1913a;

    /* renamed from: b */
    public final C0732k f1914b;

    /* renamed from: c */
    public boolean f1915c;

    public AppCompatImageButton(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0706d dVar = this.f1913a;
        if (dVar != null) {
            dVar.mo3335b();
        }
        C0732k kVar = this.f1914b;
        if (kVar != null) {
            kVar.mo3495c();
        }
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C0706d dVar = this.f1913a;
        if (dVar != null) {
            return dVar.mo3336c();
        }
        return null;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0706d dVar = this.f1913a;
        if (dVar != null) {
            return dVar.mo3337d();
        }
        return null;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportImageTintList() {
        C0732k kVar = this.f1914b;
        if (kVar != null) {
            return kVar.mo3496d();
        }
        return null;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportImageTintMode() {
        C0732k kVar = this.f1914b;
        if (kVar != null) {
            return kVar.mo3497e();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f1914b.mo3498f() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(@C0363p0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0706d dVar = this.f1913a;
        if (dVar != null) {
            dVar.mo3339f(drawable);
        }
    }

    public void setBackgroundResource(@C0375v int i) {
        super.setBackgroundResource(i);
        C0706d dVar = this.f1913a;
        if (dVar != null) {
            dVar.mo3340g(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0732k kVar = this.f1914b;
        if (kVar != null) {
            kVar.mo3495c();
        }
    }

    public void setImageDrawable(@C0363p0 Drawable drawable) {
        C0732k kVar = this.f1914b;
        if (!(kVar == null || drawable == null || this.f1915c)) {
            kVar.mo3500h(drawable);
        }
        super.setImageDrawable(drawable);
        C0732k kVar2 = this.f1914b;
        if (kVar2 != null) {
            kVar2.mo3495c();
            if (!this.f1915c) {
                this.f1914b.mo3494b();
            }
        }
    }

    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f1915c = true;
    }

    public void setImageResource(@C0375v int i) {
        this.f1914b.mo3501i(i);
    }

    public void setImageURI(@C0363p0 Uri uri) {
        super.setImageURI(uri);
        C0732k kVar = this.f1914b;
        if (kVar != null) {
            kVar.mo3495c();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@C0363p0 ColorStateList colorStateList) {
        C0706d dVar = this.f1913a;
        if (dVar != null) {
            dVar.mo3342i(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@C0363p0 PorterDuff.Mode mode) {
        C0706d dVar = this.f1913a;
        if (dVar != null) {
            dVar.mo3343j(mode);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintList(@C0363p0 ColorStateList colorStateList) {
        C0732k kVar = this.f1914b;
        if (kVar != null) {
            kVar.mo3503k(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintMode(@C0363p0 PorterDuff.Mode mode) {
        C0732k kVar = this.f1914b;
        if (kVar != null) {
            kVar.mo3504l(mode);
        }
    }

    public AppCompatImageButton(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C0387a.C0389b.imageButtonStyle);
    }

    public AppCompatImageButton(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(C0712e1.m3494b(context), attributeSet, i);
        this.f1915c = false;
        C0705c1.m3421a(this, getContext());
        C0706d dVar = new C0706d(this);
        this.f1913a = dVar;
        dVar.mo3338e(attributeSet, i);
        C0732k kVar = new C0732k(this);
        this.f1914b = kVar;
        kVar.mo3499g(attributeSet, i);
    }
}
