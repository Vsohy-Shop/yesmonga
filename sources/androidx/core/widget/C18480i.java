package androidx.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.compose.foundation.C2112d;
import androidx.compose.foundation.C2115e;

/* renamed from: androidx.core.widget.i */
public final class C18480i {

    /* renamed from: a */
    public final EdgeEffect f47261a;

    @C0376v0(21)
    /* renamed from: androidx.core.widget.i$a */
    public static class C18481a {
        private C18481a() {
        }

        @C0373u
        /* renamed from: a */
        public static void m83667a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    @C0376v0(31)
    /* renamed from: androidx.core.widget.i$b */
    public static class C18482b {
        private C18482b() {
        }

        @C0373u
        /* renamed from: a */
        public static EdgeEffect m83668a(Context context, AttributeSet attributeSet) {
            try {
                C2115e.m9124a();
                return C2112d.m9122a(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        @C0373u
        /* renamed from: b */
        public static float m83669b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        @C0373u
        /* renamed from: c */
        public static float m83670c(EdgeEffect edgeEffect, float f, float f2) {
            try {
                return edgeEffect.onPullDistance(f, f2);
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return 0.0f;
            }
        }
    }

    @Deprecated
    public C18480i(Context context) {
        this.f47261a = new EdgeEffect(context);
    }

    @C0359n0
    /* renamed from: a */
    public static EdgeEffect m83655a(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C18482b.m83668a(context, attributeSet);
        }
        return new EdgeEffect(context);
    }

    /* renamed from: d */
    public static float m83656d(@C0359n0 EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C18482b.m83669b(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: g */
    public static void m83657g(@C0359n0 EdgeEffect edgeEffect, float f, float f2) {
        C18481a.m83667a(edgeEffect, f, f2);
    }

    /* renamed from: j */
    public static float m83658j(@C0359n0 EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C18482b.m83670c(edgeEffect, f, f2);
        }
        m83657g(edgeEffect, f, f2);
        return f;
    }

    @Deprecated
    /* renamed from: b */
    public boolean mo53348b(Canvas canvas) {
        return this.f47261a.draw(canvas);
    }

    @Deprecated
    /* renamed from: c */
    public void mo53349c() {
        this.f47261a.finish();
    }

    @Deprecated
    /* renamed from: e */
    public boolean mo53350e() {
        return this.f47261a.isFinished();
    }

    @Deprecated
    /* renamed from: f */
    public boolean mo53351f(int i) {
        this.f47261a.onAbsorb(i);
        return true;
    }

    @Deprecated
    /* renamed from: h */
    public boolean mo53352h(float f) {
        this.f47261a.onPull(f);
        return true;
    }

    @Deprecated
    /* renamed from: i */
    public boolean mo53353i(float f, float f2) {
        m83657g(this.f47261a, f, f2);
        return true;
    }

    @Deprecated
    /* renamed from: k */
    public boolean mo53354k() {
        this.f47261a.onRelease();
        return this.f47261a.isFinished();
    }

    @Deprecated
    /* renamed from: l */
    public void mo53355l(int i, int i2) {
        this.f47261a.setSize(i, i2);
    }
}
