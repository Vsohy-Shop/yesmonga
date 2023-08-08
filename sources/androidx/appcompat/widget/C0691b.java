package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;

/* renamed from: androidx.appcompat.widget.b */
public class C0691b extends Drawable {

    /* renamed from: a */
    public final ActionBarContainer f2273a;

    @C0376v0(21)
    /* renamed from: androidx.appcompat.widget.b$a */
    public static class C0692a {
        /* renamed from: a */
        public static void m3356a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public C0691b(ActionBarContainer actionBarContainer) {
        this.f2273a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f2273a;
        if (actionBarContainer.f1748v) {
            Drawable drawable = actionBarContainer.f1747g;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1745e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f2273a;
        Drawable drawable3 = actionBarContainer2.f1746f;
        if (drawable3 != null && actionBarContainer2.f1749w) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    @C0376v0(21)
    public void getOutline(@C0359n0 Outline outline) {
        ActionBarContainer actionBarContainer = this.f2273a;
        if (!actionBarContainer.f1748v) {
            Drawable drawable = actionBarContainer.f1745e;
            if (drawable != null) {
                C0692a.m3356a(drawable, outline);
            }
        } else if (actionBarContainer.f1747g != null) {
            C0692a.m3356a(actionBarContainer.f1745e, outline);
        }
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
