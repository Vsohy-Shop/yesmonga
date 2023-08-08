package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.C0324b1;
import androidx.annotation.C0327c1;
import androidx.annotation.C0336f;
import androidx.annotation.C0351j1;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0370s0;
import androidx.annotation.C0372t0;
import androidx.annotation.RestrictTo;
import androidx.core.view.C18196h2;
import com.google.android.material.C31076a;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.C31416m;
import com.google.android.material.internal.C31422p;
import com.google.android.material.resources.C31501d;
import com.google.android.material.shape.C31525j;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: com.google.android.material.badge.a */
public class C31132a extends Drawable implements C31416m.C31418b {

    /* renamed from: E0 */
    public static final int f74623E0 = 8388693;

    /* renamed from: F0 */
    public static final int f74624F0 = 8388691;

    /* renamed from: G0 */
    public static final int f74625G0 = 9;
    @C0327c1

    /* renamed from: H0 */
    public static final int f74626H0 = C31076a.C31090n.Widget_MaterialComponents_Badge;
    @C0336f

    /* renamed from: I0 */
    public static final int f74627I0 = C31076a.C31079c.badgeStyle;

    /* renamed from: J0 */
    public static final String f74628J0 = "+";

    /* renamed from: Y */
    public static final int f74629Y = 8388661;

    /* renamed from: Z */
    public static final int f74630Z = 8388659;
    @C0363p0

    /* renamed from: X */
    public WeakReference<FrameLayout> f74631X;
    @C0359n0

    /* renamed from: a */
    public final WeakReference<Context> f74632a;
    @C0359n0

    /* renamed from: b */
    public final C31525j f74633b = new C31525j();
    @C0359n0

    /* renamed from: c */
    public final C31416m f74634c;
    @C0359n0

    /* renamed from: d */
    public final Rect f74635d = new Rect();
    @C0359n0

    /* renamed from: e */
    public final BadgeState f74636e;

    /* renamed from: f */
    public float f74637f;

    /* renamed from: g */
    public float f74638g;

    /* renamed from: v */
    public int f74639v;

    /* renamed from: w */
    public float f74640w;

    /* renamed from: x */
    public float f74641x;

    /* renamed from: y */
    public float f74642y;
    @C0363p0

    /* renamed from: z */
    public WeakReference<View> f74643z;

    /* renamed from: com.google.android.material.badge.a$a */
    public class C31133a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f74644a;

        /* renamed from: b */
        public final /* synthetic */ FrameLayout f74645b;

        public C31133a(View view, FrameLayout frameLayout) {
            this.f74644a = view;
            this.f74645b = frameLayout;
        }

        public void run() {
            C31132a.this.mo88243i0(this.f74644a, this.f74645b);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.badge.a$b */
    public @interface C31134b {
    }

    public C31132a(@C0359n0 Context context, @C0351j1 int i, @C0336f int i2, @C0327c1 int i3, @C0363p0 BadgeState.State state) {
        this.f74632a = new WeakReference<>(context);
        C31422p.m126963c(context);
        C31416m mVar = new C31416m(this);
        this.f74634c = mVar;
        mVar.mo90164e().setTextAlign(Paint.Align.CENTER);
        mo88224Z(C31076a.C31090n.TextAppearance_MaterialComponents_Badge);
        this.f74636e = new BadgeState(context, i, i2, i3, state);
        mo88208J();
    }

    @C0359n0
    /* renamed from: d */
    public static C31132a m124995d(@C0359n0 Context context) {
        return new C31132a(context, 0, f74627I0, f74626H0, (BadgeState.State) null);
    }

    @C0359n0
    /* renamed from: e */
    public static C31132a m124996e(@C0359n0 Context context, @C0351j1 int i) {
        return new C31132a(context, i, f74627I0, f74626H0, (BadgeState.State) null);
    }

    @C0359n0
    /* renamed from: f */
    public static C31132a m124997f(@C0359n0 Context context, @C0359n0 BadgeState.State state) {
        return new C31132a(context, 0, f74627I0, f74626H0, state);
    }

    /* renamed from: f0 */
    public static void m124998f0(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    @C0372t0
    /* renamed from: A */
    public int mo88199A() {
        return this.f74636e.mo88186s();
    }

    /* renamed from: B */
    public boolean mo88200B() {
        return this.f74636e.mo88187t();
    }

    /* renamed from: C */
    public final void mo88201C() {
        this.f74634c.mo90164e().setAlpha(getAlpha());
        invalidateSelf();
    }

    /* renamed from: D */
    public final void mo88202D() {
        ColorStateList valueOf = ColorStateList.valueOf(this.f74636e.mo88173f());
        if (this.f74633b.mo90797y() != valueOf) {
            this.f74633b.mo90777o0(valueOf);
            invalidateSelf();
        }
    }

    /* renamed from: E */
    public final void mo88203E() {
        FrameLayout frameLayout;
        WeakReference<View> weakReference = this.f74643z;
        if (weakReference != null && weakReference.get() != null) {
            View view = this.f74643z.get();
            WeakReference<FrameLayout> weakReference2 = this.f74631X;
            if (weakReference2 != null) {
                frameLayout = weakReference2.get();
            } else {
                frameLayout = null;
            }
            mo88243i0(view, frameLayout);
        }
    }

    /* renamed from: F */
    public final void mo88204F() {
        this.f74634c.mo90164e().setColor(this.f74636e.mo88175h());
        invalidateSelf();
    }

    /* renamed from: G */
    public final void mo88205G() {
        mo88248k0();
        this.f74634c.mo90169j(true);
        mo88246j0();
        invalidateSelf();
    }

    /* renamed from: H */
    public final void mo88206H() {
        this.f74634c.mo90169j(true);
        mo88246j0();
        invalidateSelf();
    }

    /* renamed from: I */
    public final void mo88207I() {
        boolean u = this.f74636e.mo88188u();
        setVisible(u, false);
        if (C31135b.f74647a && mo88254p() != null && !u) {
            ((ViewGroup) mo88254p().getParent()).invalidate();
        }
    }

    /* renamed from: J */
    public final void mo88208J() {
        mo88205G();
        mo88206H();
        mo88201C();
        mo88202D();
        mo88204F();
        mo88203E();
        mo88246j0();
        mo88207I();
    }

    /* renamed from: K */
    public void mo88209K(int i) {
        this.f74636e.mo88189w(i);
        mo88246j0();
    }

    /* renamed from: L */
    public void mo88210L(@C0372t0 int i) {
        this.f74636e.mo88190x(i);
        mo88246j0();
    }

    /* renamed from: M */
    public void mo88211M(@C0354l int i) {
        this.f74636e.mo88192z(i);
        mo88202D();
    }

    /* renamed from: N */
    public void mo88212N(int i) {
        if (this.f74636e.mo88174g() != i) {
            this.f74636e.mo88155A(i);
            mo88203E();
        }
    }

    /* renamed from: O */
    public void mo88213O(@C0359n0 Locale locale) {
        if (!locale.equals(this.f74636e.mo88183p())) {
            this.f74636e.mo88164J(locale);
            invalidateSelf();
        }
    }

    /* renamed from: P */
    public void mo88214P(@C0354l int i) {
        if (this.f74634c.mo90164e().getColor() != i) {
            this.f74636e.mo88156B(i);
            mo88204F();
        }
    }

    /* renamed from: Q */
    public void mo88215Q(@C0324b1 int i) {
        this.f74636e.mo88157C(i);
    }

    /* renamed from: R */
    public void mo88216R(CharSequence charSequence) {
        this.f74636e.mo88158D(charSequence);
    }

    /* renamed from: S */
    public void mo88217S(@C0370s0 int i) {
        this.f74636e.mo88159E(i);
    }

    /* renamed from: T */
    public void mo88218T(int i) {
        mo88220V(i);
        mo88219U(i);
    }

    /* renamed from: U */
    public void mo88219U(@C0372t0 int i) {
        this.f74636e.mo88160F(i);
        mo88246j0();
    }

    /* renamed from: V */
    public void mo88220V(@C0372t0 int i) {
        this.f74636e.mo88161G(i);
        mo88246j0();
    }

    /* renamed from: W */
    public void mo88221W(int i) {
        if (this.f74636e.mo88181n() != i) {
            this.f74636e.mo88162H(i);
            mo88205G();
        }
    }

    /* renamed from: X */
    public void mo88222X(int i) {
        int max = Math.max(0, i);
        if (this.f74636e.mo88182o() != max) {
            this.f74636e.mo88163I(max);
            mo88206H();
        }
    }

    /* renamed from: Y */
    public final void mo88223Y(@C0363p0 C31501d dVar) {
        Context context;
        if (this.f74634c.mo90163d() != dVar && (context = this.f74632a.get()) != null) {
            this.f74634c.mo90168i(dVar, context);
            mo88246j0();
        }
    }

    /* renamed from: Z */
    public final void mo88224Z(@C0327c1 int i) {
        Context context = this.f74632a.get();
        if (context != null) {
            mo88223Y(new C31501d(context, i));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public void mo88225a() {
        invalidateSelf();
    }

    /* renamed from: a0 */
    public void mo88226a0(int i) {
        mo88230c0(i);
        mo88228b0(i);
    }

    /* renamed from: b */
    public final void mo88227b(@C0359n0 Context context, @C0359n0 Rect rect, @C0359n0 View view) {
        int i;
        float f;
        float f2;
        float f3;
        int x = mo88264x();
        int g = this.f74636e.mo88174g();
        if (g == 8388691 || g == 8388693) {
            this.f74638g = (float) (rect.bottom - x);
        } else {
            this.f74638g = (float) (rect.top + x);
        }
        if (mo88261u() <= 9) {
            if (!mo88200B()) {
                f3 = this.f74636e.f74600c;
            } else {
                f3 = this.f74636e.f74601d;
            }
            this.f74640w = f3;
            this.f74642y = f3;
            this.f74641x = f3;
        } else {
            float f4 = this.f74636e.f74601d;
            this.f74640w = f4;
            this.f74642y = f4;
            this.f74641x = (this.f74634c.mo90165f(mo88250m()) / 2.0f) + this.f74636e.f74602e;
        }
        Resources resources = context.getResources();
        if (mo88200B()) {
            i = C31076a.C31082f.mtrl_badge_text_horizontal_edge_offset;
        } else {
            i = C31076a.C31082f.mtrl_badge_horizontal_edge_offset;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        int w = mo88263w();
        int g2 = this.f74636e.mo88174g();
        if (g2 == 8388659 || g2 == 8388691) {
            if (C18196h2.m82553Z(view) == 0) {
                f = (((float) rect.left) - this.f74641x) + ((float) dimensionPixelSize) + ((float) w);
            } else {
                f = ((((float) rect.right) + this.f74641x) - ((float) dimensionPixelSize)) - ((float) w);
            }
            this.f74637f = f;
            return;
        }
        if (C18196h2.m82553Z(view) == 0) {
            f2 = ((((float) rect.right) + this.f74641x) - ((float) dimensionPixelSize)) - ((float) w);
        } else {
            f2 = (((float) rect.left) - this.f74641x) + ((float) dimensionPixelSize) + ((float) w);
        }
        this.f74637f = f2;
    }

    /* renamed from: b0 */
    public void mo88228b0(@C0372t0 int i) {
        this.f74636e.mo88165K(i);
        mo88246j0();
    }

    /* renamed from: c */
    public void mo88229c() {
        if (mo88200B()) {
            this.f74636e.mo88168a();
            mo88206H();
        }
    }

    /* renamed from: c0 */
    public void mo88230c0(@C0372t0 int i) {
        this.f74636e.mo88166L(i);
        mo88246j0();
    }

    /* renamed from: d0 */
    public void mo88231d0(boolean z) {
        this.f74636e.mo88167M(z);
        mo88207I();
    }

    public void draw(@C0359n0 Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f74633b.draw(canvas);
            if (mo88200B()) {
                mo88234g(canvas);
            }
        }
    }

    /* renamed from: e0 */
    public final void mo88233e0(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != C31076a.C31084h.mtrl_anchor_parent) {
            WeakReference<FrameLayout> weakReference = this.f74631X;
            if (weakReference == null || weakReference.get() != viewGroup) {
                m124998f0(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(C31076a.C31084h.mtrl_anchor_parent);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int indexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(indexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, indexOfChild);
                this.f74631X = new WeakReference<>(frameLayout);
                frameLayout.post(new C31133a(view, frameLayout));
            }
        }
    }

    /* renamed from: g */
    public final void mo88234g(Canvas canvas) {
        Rect rect = new Rect();
        String m = mo88250m();
        this.f74634c.mo90164e().getTextBounds(m, 0, m.length(), rect);
        canvas.drawText(m, this.f74637f, this.f74638g + ((float) (rect.height() / 2)), this.f74634c.mo90164e());
    }

    /* renamed from: g0 */
    public void mo88235g0(@C0359n0 View view) {
        mo88243i0(view, (FrameLayout) null);
    }

    public int getAlpha() {
        return this.f74636e.mo88172e();
    }

    public int getIntrinsicHeight() {
        return this.f74635d.height();
    }

    public int getIntrinsicWidth() {
        return this.f74635d.width();
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public int mo88240h() {
        return this.f74636e.mo88170c();
    }

    @Deprecated
    /* renamed from: h0 */
    public void mo88241h0(@C0359n0 View view, @C0363p0 ViewGroup viewGroup) {
        if (viewGroup instanceof FrameLayout) {
            mo88243i0(view, (FrameLayout) viewGroup);
            return;
        }
        throw new IllegalArgumentException("customBadgeParent must be a FrameLayout");
    }

    @C0372t0
    /* renamed from: i */
    public int mo88242i() {
        return this.f74636e.mo88171d();
    }

    /* renamed from: i0 */
    public void mo88243i0(@C0359n0 View view, @C0363p0 FrameLayout frameLayout) {
        this.f74643z = new WeakReference<>(view);
        boolean z = C31135b.f74647a;
        if (!z || frameLayout != null) {
            this.f74631X = new WeakReference<>(frameLayout);
        } else {
            mo88233e0(view);
        }
        if (!z) {
            m124998f0(view);
        }
        mo88246j0();
        invalidateSelf();
    }

    public boolean isStateful() {
        return false;
    }

    @C0354l
    /* renamed from: j */
    public int mo88245j() {
        return this.f74633b.mo90797y().getDefaultColor();
    }

    /* renamed from: j0 */
    public final void mo88246j0() {
        View view;
        Context context = this.f74632a.get();
        WeakReference<View> weakReference = this.f74643z;
        ViewGroup viewGroup = null;
        if (weakReference != null) {
            view = weakReference.get();
        } else {
            view = null;
        }
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.f74635d);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<FrameLayout> weakReference2 = this.f74631X;
            if (weakReference2 != null) {
                viewGroup = weakReference2.get();
            }
            if (viewGroup != null || C31135b.f74647a) {
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) view.getParent();
                }
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
            }
            mo88227b(context, rect2, view);
            C31135b.m125072o(this.f74635d, this.f74637f, this.f74638g, this.f74641x, this.f74642y);
            this.f74633b.mo90770k0(this.f74640w);
            if (!rect.equals(this.f74635d)) {
                this.f74633b.setBounds(this.f74635d);
            }
        }
    }

    /* renamed from: k */
    public int mo88247k() {
        return this.f74636e.mo88174g();
    }

    /* renamed from: k0 */
    public final void mo88248k0() {
        this.f74639v = ((int) Math.pow(10.0d, ((double) mo88260t()) - 1.0d)) - 1;
    }

    @C0359n0
    /* renamed from: l */
    public Locale mo88249l() {
        return this.f74636e.mo88183p();
    }

    @C0359n0
    /* renamed from: m */
    public final String mo88250m() {
        if (mo88261u() <= this.f74639v) {
            return NumberFormat.getInstance(this.f74636e.mo88183p()).format((long) mo88261u());
        }
        Context context = this.f74632a.get();
        if (context == null) {
            return "";
        }
        return String.format(this.f74636e.mo88183p(), context.getString(C31076a.C31089m.mtrl_exceed_max_badge_number_suffix), new Object[]{Integer.valueOf(this.f74639v), f74628J0});
    }

    @C0354l
    /* renamed from: n */
    public int mo88251n() {
        return this.f74634c.mo90164e().getColor();
    }

    @C0363p0
    /* renamed from: o */
    public CharSequence mo88252o() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!mo88200B()) {
            return this.f74636e.mo88177j();
        }
        if (this.f74636e.mo88178k() == 0 || (context = this.f74632a.get()) == null) {
            return null;
        }
        if (mo88261u() <= this.f74639v) {
            return context.getResources().getQuantityString(this.f74636e.mo88178k(), mo88261u(), new Object[]{Integer.valueOf(mo88261u())});
        }
        return context.getString(this.f74636e.mo88176i(), new Object[]{Integer.valueOf(this.f74639v)});
    }

    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @C0363p0
    /* renamed from: p */
    public FrameLayout mo88254p() {
        WeakReference<FrameLayout> weakReference = this.f74631X;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: q */
    public int mo88255q() {
        return this.f74636e.mo88180m();
    }

    @C0372t0
    /* renamed from: r */
    public int mo88256r() {
        return this.f74636e.mo88179l();
    }

    @C0372t0
    /* renamed from: s */
    public int mo88257s() {
        return this.f74636e.mo88180m();
    }

    public void setAlpha(int i) {
        this.f74636e.mo88191y(i);
        mo88201C();
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: t */
    public int mo88260t() {
        return this.f74636e.mo88181n();
    }

    /* renamed from: u */
    public int mo88261u() {
        if (mo88200B()) {
            return this.f74636e.mo88182o();
        }
        return 0;
    }

    @C0359n0
    /* renamed from: v */
    public BadgeState.State mo88262v() {
        return this.f74636e.mo88184q();
    }

    /* renamed from: w */
    public final int mo88263w() {
        int i;
        if (mo88200B()) {
            i = this.f74636e.mo88179l();
        } else {
            i = this.f74636e.mo88180m();
        }
        return i + this.f74636e.mo88170c();
    }

    /* renamed from: x */
    public final int mo88264x() {
        int i;
        if (mo88200B()) {
            i = this.f74636e.mo88185r();
        } else {
            i = this.f74636e.mo88186s();
        }
        return i + this.f74636e.mo88171d();
    }

    /* renamed from: y */
    public int mo88265y() {
        return this.f74636e.mo88186s();
    }

    @C0372t0
    /* renamed from: z */
    public int mo88266z() {
        return this.f74636e.mo88185r();
    }
}
