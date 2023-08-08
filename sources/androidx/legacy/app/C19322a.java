package androidx.legacy.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.C0324b1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0375v;
import androidx.core.content.C17318d;
import androidx.core.view.C18196h2;
import androidx.core.view.C18306m0;
import androidx.drawerlayout.widget.DrawerLayout;
import java.lang.reflect.Method;

@Deprecated
/* renamed from: androidx.legacy.app.a */
public class C19322a implements DrawerLayout.C18951e {

    /* renamed from: m */
    public static final String f49635m = "ActionBarDrawerToggle";

    /* renamed from: n */
    public static final int[] f49636n = {16843531};

    /* renamed from: o */
    public static final float f49637o = 0.33333334f;

    /* renamed from: p */
    public static final int f49638p = 16908332;

    /* renamed from: a */
    public final Activity f49639a;

    /* renamed from: b */
    public final C19323a f49640b;

    /* renamed from: c */
    public final DrawerLayout f49641c;

    /* renamed from: d */
    public boolean f49642d;

    /* renamed from: e */
    public boolean f49643e;

    /* renamed from: f */
    public Drawable f49644f;

    /* renamed from: g */
    public Drawable f49645g;

    /* renamed from: h */
    public C19326d f49646h;

    /* renamed from: i */
    public final int f49647i;

    /* renamed from: j */
    public final int f49648j;

    /* renamed from: k */
    public final int f49649k;

    /* renamed from: l */
    public C19325c f49650l;

    @Deprecated
    /* renamed from: androidx.legacy.app.a$a */
    public interface C19323a {
        /* renamed from: a */
        void mo57430a(Drawable drawable, @C0324b1 int i);

        @C0363p0
        /* renamed from: b */
        Drawable mo57431b();

        /* renamed from: c */
        void mo57432c(@C0324b1 int i);
    }

    @Deprecated
    /* renamed from: androidx.legacy.app.a$b */
    public interface C19324b {
        @C0363p0
        /* renamed from: b */
        C19323a mo57433b();
    }

    /* renamed from: androidx.legacy.app.a$c */
    public static class C19325c {

        /* renamed from: a */
        public Method f49651a;

        /* renamed from: b */
        public Method f49652b;

        /* renamed from: c */
        public ImageView f49653c;

        public C19325c(Activity activity) {
            Class<ActionBar> cls = ActionBar.class;
            try {
                this.f49651a = cls.getDeclaredMethod("setHomeAsUpIndicator", new Class[]{Drawable.class});
                this.f49652b = cls.getDeclaredMethod("setHomeActionContentDescription", new Class[]{Integer.TYPE});
            } catch (NoSuchMethodException unused) {
                View findViewById = activity.findViewById(C19322a.f49638p);
                if (findViewById != null) {
                    ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                    if (viewGroup.getChildCount() == 2) {
                        View childAt = viewGroup.getChildAt(0);
                        childAt = childAt.getId() == 16908332 ? viewGroup.getChildAt(1) : childAt;
                        if (childAt instanceof ImageView) {
                            this.f49653c = (ImageView) childAt;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: androidx.legacy.app.a$d */
    public class C19326d extends InsetDrawable implements Drawable.Callback {

        /* renamed from: a */
        public final boolean f49654a = true;

        /* renamed from: b */
        public final Rect f49655b = new Rect();

        /* renamed from: c */
        public float f49656c;

        /* renamed from: d */
        public float f49657d;

        public C19326d(Drawable drawable) {
            super(drawable, 0);
        }

        /* renamed from: a */
        public float mo57434a() {
            return this.f49656c;
        }

        /* renamed from: b */
        public void mo57435b(float f) {
            this.f49657d = f;
            invalidateSelf();
        }

        /* renamed from: c */
        public void mo57436c(float f) {
            this.f49656c = f;
            invalidateSelf();
        }

        public void draw(@C0359n0 Canvas canvas) {
            boolean z;
            copyBounds(this.f49655b);
            canvas.save();
            int i = 1;
            if (C18196h2.m82553Z(C19322a.this.f49639a.getWindow().getDecorView()) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = -1;
            }
            float width = (float) this.f49655b.width();
            canvas.translate((-this.f49657d) * width * this.f49656c * ((float) i), 0.0f);
            if (z && !this.f49654a) {
                canvas.translate(width, 0.0f);
                canvas.scale(-1.0f, 1.0f);
            }
            super.draw(canvas);
            canvas.restore();
        }
    }

    public C19322a(Activity activity, DrawerLayout drawerLayout, @C0375v int i, @C0324b1 int i2, @C0324b1 int i3) {
        this(activity, drawerLayout, !m90447e(activity), i, i2, i3);
    }

    /* renamed from: e */
    public static boolean m90447e(Context context) {
        return context.getApplicationInfo().targetSdkVersion >= 21;
    }

    /* renamed from: a */
    public void mo1342a(View view) {
        this.f49646h.mo57436c(1.0f);
        if (this.f49642d) {
            mo57424j(this.f49649k);
        }
    }

    /* renamed from: b */
    public void mo1343b(View view) {
        this.f49646h.mo57436c(0.0f);
        if (this.f49642d) {
            mo57424j(this.f49648j);
        }
    }

    /* renamed from: c */
    public void mo1344c(int i) {
    }

    /* renamed from: d */
    public void mo1345d(View view, float f) {
        float f2;
        float a = this.f49646h.mo57434a();
        if (f > 0.5f) {
            f2 = Math.max(a, Math.max(0.0f, f - 0.5f) * 2.0f);
        } else {
            f2 = Math.min(a, f * 2.0f);
        }
        this.f49646h.mo57436c(f2);
    }

    /* renamed from: f */
    public final Drawable mo57420f() {
        Context context;
        C19323a aVar = this.f49640b;
        if (aVar != null) {
            return aVar.mo57431b();
        }
        ActionBar actionBar = this.f49639a.getActionBar();
        if (actionBar != null) {
            context = actionBar.getThemedContext();
        } else {
            context = this.f49639a;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f49636n, 16843470, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    /* renamed from: g */
    public boolean mo57421g() {
        return this.f49642d;
    }

    /* renamed from: h */
    public void mo57422h(Configuration configuration) {
        if (!this.f49643e) {
            this.f49644f = mo57420f();
        }
        this.f49645g = C17318d.m79726i(this.f49639a, this.f49647i);
        mo57429o();
    }

    /* renamed from: i */
    public boolean mo57423i(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.f49642d) {
            return false;
        }
        if (this.f49641c.mo55746F(C18306m0.f46960b)) {
            this.f49641c.mo55770d(C18306m0.f46960b);
            return true;
        }
        this.f49641c.mo55751K(C18306m0.f46960b);
        return true;
    }

    /* renamed from: j */
    public final void mo57424j(int i) {
        C19323a aVar = this.f49640b;
        if (aVar != null) {
            aVar.mo57432c(i);
            return;
        }
        ActionBar actionBar = this.f49639a.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeActionContentDescription(i);
        }
    }

    /* renamed from: k */
    public final void mo57425k(Drawable drawable, int i) {
        C19323a aVar = this.f49640b;
        if (aVar != null) {
            aVar.mo57430a(drawable, i);
            return;
        }
        ActionBar actionBar = this.f49639a.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(drawable);
            actionBar.setHomeActionContentDescription(i);
        }
    }

    /* renamed from: l */
    public void mo57426l(boolean z) {
        int i;
        if (z != this.f49642d) {
            if (z) {
                C19326d dVar = this.f49646h;
                if (this.f49641c.mo55743C(C18306m0.f46960b)) {
                    i = this.f49649k;
                } else {
                    i = this.f49648j;
                }
                mo57425k(dVar, i);
            } else {
                mo57425k(this.f49644f, 0);
            }
            this.f49642d = z;
        }
    }

    /* renamed from: m */
    public void mo57427m(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C17318d.m79726i(this.f49639a, i);
        } else {
            drawable = null;
        }
        mo57428n(drawable);
    }

    /* renamed from: n */
    public void mo57428n(Drawable drawable) {
        if (drawable == null) {
            this.f49644f = mo57420f();
            this.f49643e = false;
        } else {
            this.f49644f = drawable;
            this.f49643e = true;
        }
        if (!this.f49642d) {
            mo57425k(this.f49644f, 0);
        }
    }

    /* renamed from: o */
    public void mo57429o() {
        int i;
        if (this.f49641c.mo55743C(C18306m0.f46960b)) {
            this.f49646h.mo57436c(1.0f);
        } else {
            this.f49646h.mo57436c(0.0f);
        }
        if (this.f49642d) {
            C19326d dVar = this.f49646h;
            if (this.f49641c.mo55743C(C18306m0.f46960b)) {
                i = this.f49649k;
            } else {
                i = this.f49648j;
            }
            mo57425k(dVar, i);
        }
    }

    public C19322a(Activity activity, DrawerLayout drawerLayout, boolean z, @C0375v int i, @C0324b1 int i2, @C0324b1 int i3) {
        this.f49642d = true;
        this.f49639a = activity;
        if (activity instanceof C19324b) {
            this.f49640b = ((C19324b) activity).mo57433b();
        } else {
            this.f49640b = null;
        }
        this.f49641c = drawerLayout;
        this.f49647i = i;
        this.f49648j = i2;
        this.f49649k = i3;
        this.f49644f = mo57420f();
        this.f49645g = C17318d.m79726i(activity, i);
        C19326d dVar = new C19326d(this.f49645g);
        this.f49646h = dVar;
        dVar.mo57435b(z ? 0.33333334f : 0.0f);
    }
}
