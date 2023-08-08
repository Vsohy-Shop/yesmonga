package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import java.lang.reflect.Method;

@C0376v0(21)
/* renamed from: androidx.core.graphics.drawable.u */
public class C17570u extends C17569t {

    /* renamed from: v */
    public static final String f45928v = "WrappedDrawableApi21";

    /* renamed from: w */
    public static Method f45929w;

    public C17570u(Drawable drawable) {
        super(drawable);
        mo52020g();
    }

    /* renamed from: c */
    public boolean mo51985c() {
        return false;
    }

    /* renamed from: g */
    public final void mo52020g() {
        if (f45929w == null) {
            try {
                f45929w = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }

    @C0359n0
    public Rect getDirtyBounds() {
        return this.f45927f.getDirtyBounds();
    }

    public void getOutline(@C0359n0 Outline outline) {
        this.f45927f.getOutline(outline);
    }

    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f45927f;
        if (!(drawable == null || (method = f45929w) == null)) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void setHotspot(float f, float f2) {
        this.f45927f.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f45927f.setHotspotBounds(i, i2, i3, i4);
    }

    public boolean setState(@C0359n0 int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i) {
        if (mo51985c()) {
            super.setTint(i);
        } else {
            this.f45927f.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (mo51985c()) {
            super.setTintList(colorStateList);
        } else {
            this.f45927f.setTintList(colorStateList);
        }
    }

    public void setTintMode(@C0359n0 PorterDuff.Mode mode) {
        if (mo51985c()) {
            super.setTintMode(mode);
        } else {
            this.f45927f.setTintMode(mode);
        }
    }

    public C17570u(C17571v vVar, Resources resources) {
        super(vVar, resources);
        mo52020g();
    }
}
