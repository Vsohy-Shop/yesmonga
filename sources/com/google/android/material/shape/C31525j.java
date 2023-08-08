package com.google.android.material.shape;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import androidx.annotation.C0327c1;
import androidx.annotation.C0336f;
import androidx.annotation.C0337f0;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.C17567r;
import androidx.core.util.C17992m;
import com.google.android.material.C31076a;
import com.google.android.material.color.C31266s;
import com.google.android.material.elevation.C31333a;
import com.google.android.material.shadow.C31513b;
import com.google.android.material.shape.C31534o;
import com.google.android.material.shape.C31538p;
import com.google.android.material.shape.C31542q;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.BitSet;

/* renamed from: com.google.android.material.shape.j */
public class C31525j extends Drawable implements C17567r, C31553s {

    /* renamed from: M0 */
    public static final String f76359M0 = "j";

    /* renamed from: N0 */
    public static final float f76360N0 = 0.75f;

    /* renamed from: O0 */
    public static final float f76361O0 = 0.25f;

    /* renamed from: P0 */
    public static final int f76362P0 = 0;

    /* renamed from: Q0 */
    public static final int f76363Q0 = 1;

    /* renamed from: R0 */
    public static final int f76364R0 = 2;

    /* renamed from: S0 */
    public static final Paint f76365S0;

    /* renamed from: E0 */
    public final C31513b f76366E0;
    @C0359n0

    /* renamed from: F0 */
    public final C31538p.C31540b f76367F0;

    /* renamed from: G0 */
    public final C31538p f76368G0;
    @C0363p0

    /* renamed from: H0 */
    public PorterDuffColorFilter f76369H0;
    @C0363p0

    /* renamed from: I0 */
    public PorterDuffColorFilter f76370I0;

    /* renamed from: J0 */
    public int f76371J0;
    @C0359n0

    /* renamed from: K0 */
    public final RectF f76372K0;

    /* renamed from: L0 */
    public boolean f76373L0;

    /* renamed from: X */
    public C31534o f76374X;

    /* renamed from: Y */
    public final Paint f76375Y;

    /* renamed from: Z */
    public final Paint f76376Z;

    /* renamed from: a */
    public C31529d f76377a;

    /* renamed from: b */
    public final C31542q.C31551i[] f76378b;

    /* renamed from: c */
    public final C31542q.C31551i[] f76379c;

    /* renamed from: d */
    public final BitSet f76380d;

    /* renamed from: e */
    public boolean f76381e;

    /* renamed from: f */
    public final Matrix f76382f;

    /* renamed from: g */
    public final Path f76383g;

    /* renamed from: v */
    public final Path f76384v;

    /* renamed from: w */
    public final RectF f76385w;

    /* renamed from: x */
    public final RectF f76386x;

    /* renamed from: y */
    public final Region f76387y;

    /* renamed from: z */
    public final Region f76388z;

    /* renamed from: com.google.android.material.shape.j$a */
    public class C31526a implements C31538p.C31540b {
        public C31526a() {
        }

        /* renamed from: a */
        public void mo90801a(@C0359n0 C31542q qVar, Matrix matrix, int i) {
            C31525j.this.f76380d.set(i, qVar.mo90874e());
            C31525j.this.f76378b[i] = qVar.mo90875f(matrix);
        }

        /* renamed from: b */
        public void mo90802b(@C0359n0 C31542q qVar, Matrix matrix, int i) {
            C31525j.this.f76380d.set(i + 4, qVar.mo90874e());
            C31525j.this.f76379c[i] = qVar.mo90875f(matrix);
        }
    }

    /* renamed from: com.google.android.material.shape.j$b */
    public class C31527b implements C31534o.C31537c {

        /* renamed from: a */
        public final /* synthetic */ float f76390a;

        public C31527b(float f) {
            this.f76390a = f;
        }

        @C0359n0
        /* renamed from: a */
        public C31518d mo90803a(@C0359n0 C31518d dVar) {
            if (dVar instanceof C31532m) {
                return dVar;
            }
            return new C31516b(this.f76390a, dVar);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.shape.j$c */
    public @interface C31528c {
    }

    static {
        Paint paint = new Paint(1);
        f76365S0 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public /* synthetic */ C31525j(C31529d dVar, C31526a aVar) {
        this(dVar);
    }

    /* renamed from: h0 */
    public static int m127459h0(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    @C0359n0
    /* renamed from: m */
    public static C31525j m127460m(Context context) {
        return m127461n(context, 0.0f);
    }

    @C0359n0
    /* renamed from: n */
    public static C31525j m127461n(Context context, float f) {
        int c = C31266s.m125952c(context, C31076a.C31079c.colorSurface, C31525j.class.getSimpleName());
        C31525j jVar = new C31525j();
        jVar.mo90750Z(context);
        jVar.mo90777o0(ColorStateList.valueOf(c));
        jVar.mo90775n0(f);
        return jVar;
    }

    /* renamed from: A */
    public Paint.Style mo90710A() {
        return this.f76377a.f76413v;
    }

    @Deprecated
    /* renamed from: A0 */
    public void mo90711A0(int i) {
        this.f76377a.f76409r = i;
    }

    /* renamed from: B */
    public float mo90712B() {
        return this.f76377a.f76405n;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: B0 */
    public void mo90713B0(int i) {
        C31529d dVar = this.f76377a;
        if (dVar.f76410s != i) {
            dVar.f76410s = i;
            mo90751a0();
        }
    }

    @Deprecated
    /* renamed from: C */
    public void mo90714C(int i, int i2, @C0359n0 Path path) {
        mo90763h(new RectF(0.0f, 0.0f, (float) i, (float) i2), path);
    }

    @Deprecated
    /* renamed from: C0 */
    public void mo90715C0(@C0359n0 C31552r rVar) {
        setShapeAppearanceModel(rVar);
    }

    @C0354l
    /* renamed from: D */
    public int mo90716D() {
        return this.f76371J0;
    }

    /* renamed from: D0 */
    public void mo90717D0(float f, @C0354l int i) {
        mo90727I0(f);
        mo90721F0(ColorStateList.valueOf(i));
    }

    /* renamed from: E */
    public float mo90718E() {
        return this.f76377a.f76401j;
    }

    /* renamed from: E0 */
    public void mo90719E0(float f, @C0363p0 ColorStateList colorStateList) {
        mo90727I0(f);
        mo90721F0(colorStateList);
    }

    /* renamed from: F */
    public int mo90720F() {
        return this.f76377a.f76411t;
    }

    /* renamed from: F0 */
    public void mo90721F0(@C0363p0 ColorStateList colorStateList) {
        C31529d dVar = this.f76377a;
        if (dVar.f76396e != colorStateList) {
            dVar.f76396e = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: G */
    public int mo90722G() {
        return this.f76377a.f76408q;
    }

    /* renamed from: G0 */
    public void mo90723G0(@C0354l int i) {
        mo90725H0(ColorStateList.valueOf(i));
    }

    @Deprecated
    /* renamed from: H */
    public int mo90724H() {
        return (int) mo90795x();
    }

    /* renamed from: H0 */
    public void mo90725H0(ColorStateList colorStateList) {
        this.f76377a.f76397f = colorStateList;
        mo90737N0();
        mo90751a0();
    }

    /* renamed from: I */
    public int mo90726I() {
        C31529d dVar = this.f76377a;
        return (int) (((double) dVar.f76410s) * Math.sin(Math.toRadians((double) dVar.f76411t)));
    }

    /* renamed from: I0 */
    public void mo90727I0(float f) {
        this.f76377a.f76403l = f;
        invalidateSelf();
    }

    /* renamed from: J */
    public int mo90728J() {
        C31529d dVar = this.f76377a;
        return (int) (((double) dVar.f76410s) * Math.cos(Math.toRadians((double) dVar.f76411t)));
    }

    /* renamed from: J0 */
    public void mo90729J0(float f) {
        C31529d dVar = this.f76377a;
        if (dVar.f76407p != f) {
            dVar.f76407p = f;
            mo90739O0();
        }
    }

    /* renamed from: K */
    public int mo90730K() {
        return this.f76377a.f76409r;
    }

    /* renamed from: K0 */
    public void mo90731K0(boolean z) {
        C31529d dVar = this.f76377a;
        if (dVar.f76412u != z) {
            dVar.f76412u = z;
            invalidateSelf();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: L */
    public int mo90732L() {
        return this.f76377a.f76410s;
    }

    /* renamed from: L0 */
    public void mo90733L0(float f) {
        mo90729J0(f - mo90795x());
    }

    @C0363p0
    @Deprecated
    /* renamed from: M */
    public C31552r mo90734M() {
        C31534o shapeAppearanceModel = getShapeAppearanceModel();
        if (shapeAppearanceModel instanceof C31552r) {
            return (C31552r) shapeAppearanceModel;
        }
        return null;
    }

    /* renamed from: M0 */
    public final boolean mo90735M0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f76377a.f76395d == null || (color2 = this.f76375Y.getColor()) == (colorForState2 = this.f76377a.f76395d.getColorForState(iArr, color2))) {
            z = false;
        } else {
            this.f76375Y.setColor(colorForState2);
            z = true;
        }
        if (this.f76377a.f76396e == null || (color = this.f76376Z.getColor()) == (colorForState = this.f76377a.f76396e.getColorForState(iArr, color))) {
            return z;
        }
        this.f76376Z.setColor(colorForState);
        return true;
    }

    @C0363p0
    /* renamed from: N */
    public ColorStateList mo90736N() {
        return this.f76377a.f76396e;
    }

    /* renamed from: N0 */
    public final boolean mo90737N0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f76369H0;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f76370I0;
        C31529d dVar = this.f76377a;
        this.f76369H0 = mo90769k(dVar.f76398g, dVar.f76399h, this.f76375Y, true);
        C31529d dVar2 = this.f76377a;
        this.f76370I0 = mo90769k(dVar2.f76397f, dVar2.f76399h, this.f76376Z, false);
        C31529d dVar3 = this.f76377a;
        if (dVar3.f76412u) {
            this.f76366E0.mo90692d(dVar3.f76398g.getColorForState(getState(), 0));
        }
        if (!C17992m.m81740a(porterDuffColorFilter, this.f76369H0) || !C17992m.m81740a(porterDuffColorFilter2, this.f76370I0)) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public final float mo90738O() {
        if (mo90749Y()) {
            return this.f76376Z.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: O0 */
    public final void mo90739O0() {
        float V = mo90746V();
        this.f76377a.f76409r = (int) Math.ceil((double) (0.75f * V));
        this.f76377a.f76410s = (int) Math.ceil((double) (V * 0.25f));
        mo90737N0();
        mo90751a0();
    }

    @C0363p0
    /* renamed from: P */
    public ColorStateList mo90740P() {
        return this.f76377a.f76397f;
    }

    /* renamed from: Q */
    public float mo90741Q() {
        return this.f76377a.f76403l;
    }

    @C0363p0
    /* renamed from: R */
    public ColorStateList mo90742R() {
        return this.f76377a.f76398g;
    }

    /* renamed from: S */
    public float mo90743S() {
        return this.f76377a.f76392a.mo90818r().mo90693a(mo90791v());
    }

    /* renamed from: T */
    public float mo90744T() {
        return this.f76377a.f76392a.mo90820t().mo90693a(mo90791v());
    }

    /* renamed from: U */
    public float mo90745U() {
        return this.f76377a.f76407p;
    }

    /* renamed from: V */
    public float mo90746V() {
        return mo90795x() + mo90745U();
    }

    /* renamed from: W */
    public final boolean mo90747W() {
        C31529d dVar = this.f76377a;
        int i = dVar.f76408q;
        if (i == 1 || dVar.f76409r <= 0 || (i != 2 && !mo90768j0())) {
            return false;
        }
        return true;
    }

    /* renamed from: X */
    public final boolean mo90748X() {
        Paint.Style style = this.f76377a.f76413v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    /* renamed from: Y */
    public final boolean mo90749Y() {
        Paint.Style style = this.f76377a.f76413v;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f76376Z.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    public void mo90750Z(Context context) {
        this.f76377a.f76393b = new C31333a(context);
        mo90739O0();
    }

    /* renamed from: a0 */
    public final void mo90751a0() {
        super.invalidateSelf();
    }

    /* renamed from: b0 */
    public boolean mo90752b0() {
        C31333a aVar = this.f76377a.f76393b;
        if (aVar == null || !aVar.mo89556l()) {
            return false;
        }
        return true;
    }

    /* renamed from: c0 */
    public boolean mo90753c0() {
        return this.f76377a.f76393b != null;
    }

    /* renamed from: d0 */
    public boolean mo90754d0(int i, int i2) {
        return getTransparentRegion().contains(i, i2);
    }

    public void draw(@C0359n0 Canvas canvas) {
        this.f76375Y.setColorFilter(this.f76369H0);
        int alpha = this.f76375Y.getAlpha();
        this.f76375Y.setAlpha(m127459h0(alpha, this.f76377a.f76404m));
        this.f76376Z.setColorFilter(this.f76370I0);
        this.f76376Z.setStrokeWidth(this.f76377a.f76403l);
        int alpha2 = this.f76376Z.getAlpha();
        this.f76376Z.setAlpha(m127459h0(alpha2, this.f76377a.f76404m));
        if (this.f76381e) {
            mo90764i();
            mo90758g(mo90791v(), this.f76383g);
            this.f76381e = false;
        }
        mo90759g0(canvas);
        if (mo90748X()) {
            mo90779p(canvas);
        }
        if (mo90749Y()) {
            mo90785s(canvas);
        }
        this.f76375Y.setAlpha(alpha);
        this.f76376Z.setAlpha(alpha2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: e0 */
    public boolean mo90755e0() {
        return this.f76377a.f76392a.mo90821u(mo90791v());
    }

    @C0363p0
    /* renamed from: f */
    public final PorterDuffColorFilter mo90756f(@C0359n0 Paint paint, boolean z) {
        if (!z) {
            return null;
        }
        int color = paint.getColor();
        int l = mo90771l(color);
        this.f76371J0 = l;
        if (l != color) {
            return new PorterDuffColorFilter(l, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    @Deprecated
    /* renamed from: f0 */
    public boolean mo90757f0() {
        int i = this.f76377a.f76408q;
        return i == 0 || i == 2;
    }

    /* renamed from: g */
    public final void mo90758g(@C0359n0 RectF rectF, @C0359n0 Path path) {
        mo90763h(rectF, path);
        if (this.f76377a.f76401j != 1.0f) {
            this.f76382f.reset();
            Matrix matrix = this.f76382f;
            float f = this.f76377a.f76401j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f76382f);
        }
        path.computeBounds(this.f76372K0, true);
    }

    /* renamed from: g0 */
    public final void mo90759g0(@C0359n0 Canvas canvas) {
        if (mo90747W()) {
            canvas.save();
            mo90765i0(canvas);
            if (!this.f76373L0) {
                mo90776o(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.f76372K0.width() - ((float) getBounds().width()));
            int height = (int) (this.f76372K0.height() - ((float) getBounds().height()));
            if (width < 0 || height < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.f76372K0.width()) + (this.f76377a.f76409r * 2) + width, ((int) this.f76372K0.height()) + (this.f76377a.f76409r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f = (float) ((getBounds().left - this.f76377a.f76409r) - width);
            float f2 = (float) ((getBounds().top - this.f76377a.f76409r) - height);
            canvas2.translate(-f, -f2);
            mo90776o(canvas2);
            canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
    }

    public int getAlpha() {
        return this.f76377a.f76404m;
    }

    @C0363p0
    public Drawable.ConstantState getConstantState() {
        return this.f76377a;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(@C0359n0 Outline outline) {
        if (this.f76377a.f76408q != 2) {
            if (mo90755e0()) {
                outline.setRoundRect(getBounds(), mo90743S() * this.f76377a.f76402k);
                return;
            }
            mo90758g(mo90791v(), this.f76383g);
            if (this.f76383g.isConvex() || Build.VERSION.SDK_INT >= 29) {
                try {
                    outline.setConvexPath(this.f76383g);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public boolean getPadding(@C0359n0 Rect rect) {
        Rect rect2 = this.f76377a.f76400i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @C0359n0
    public C31534o getShapeAppearanceModel() {
        return this.f76377a.f76392a;
    }

    public Region getTransparentRegion() {
        this.f76387y.set(getBounds());
        mo90758g(mo90791v(), this.f76383g);
        this.f76388z.setPath(this.f76383g, this.f76387y);
        this.f76387y.op(this.f76388z, Region.Op.DIFFERENCE);
        return this.f76387y;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: h */
    public final void mo90763h(@C0359n0 RectF rectF, @C0359n0 Path path) {
        C31538p pVar = this.f76368G0;
        C31529d dVar = this.f76377a;
        C31534o oVar = dVar.f76392a;
        float f = dVar.f76402k;
        pVar.mo90860e(oVar, f, rectF, this.f76367F0, path);
    }

    /* renamed from: i */
    public final void mo90764i() {
        C31534o y = getShapeAppearanceModel().mo90825y(new C31527b(-mo90738O()));
        this.f76374X = y;
        this.f76368G0.mo90859d(y, this.f76377a.f76402k, mo90793w(), this.f76384v);
    }

    /* renamed from: i0 */
    public final void mo90765i0(@C0359n0 Canvas canvas) {
        canvas.translate((float) mo90726I(), (float) mo90728J());
    }

    public void invalidateSelf() {
        this.f76381e = true;
        super.invalidateSelf();
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        if (super.isStateful() || (((colorStateList = this.f76377a.f76398g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f76377a.f76397f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f76377a.f76396e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f76377a.f76395d) != null && colorStateList4.isStateful()))))) {
            return true;
        }
        return false;
    }

    @C0359n0
    /* renamed from: j */
    public final PorterDuffColorFilter mo90767j(@C0359n0 ColorStateList colorStateList, @C0359n0 PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = mo90771l(colorForState);
        }
        this.f76371J0 = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* renamed from: j0 */
    public boolean mo90768j0() {
        int i = Build.VERSION.SDK_INT;
        if (mo90755e0() || this.f76383g.isConvex() || i >= 29) {
            return false;
        }
        return true;
    }

    @C0359n0
    /* renamed from: k */
    public final PorterDuffColorFilter mo90769k(@C0363p0 ColorStateList colorStateList, @C0363p0 PorterDuff.Mode mode, @C0359n0 Paint paint, boolean z) {
        if (colorStateList == null || mode == null) {
            return mo90756f(paint, z);
        }
        return mo90767j(colorStateList, mode, z);
    }

    /* renamed from: k0 */
    public void mo90770k0(float f) {
        setShapeAppearanceModel(this.f76377a.f76392a.mo90823w(f));
    }

    @C0354l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: l */
    public int mo90771l(@C0354l int i) {
        float V = mo90746V() + mo90712B();
        C31333a aVar = this.f76377a.f76393b;
        if (aVar != null) {
            return aVar.mo89549e(i, V);
        }
        return i;
    }

    /* renamed from: l0 */
    public void mo90772l0(@C0359n0 C31518d dVar) {
        setShapeAppearanceModel(this.f76377a.f76392a.mo90824x(dVar));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: m0 */
    public void mo90773m0(boolean z) {
        this.f76368G0.mo90868n(z);
    }

    @C0359n0
    public Drawable mutate() {
        this.f76377a = new C31529d(this.f76377a);
        return this;
    }

    /* renamed from: n0 */
    public void mo90775n0(float f) {
        C31529d dVar = this.f76377a;
        if (dVar.f76406o != f) {
            dVar.f76406o = f;
            mo90739O0();
        }
    }

    /* renamed from: o */
    public final void mo90776o(@C0359n0 Canvas canvas) {
        this.f76380d.cardinality();
        if (this.f76377a.f76410s != 0) {
            canvas.drawPath(this.f76383g, this.f76366E0.mo90691c());
        }
        for (int i = 0; i < 4; i++) {
            this.f76378b[i].mo90928b(this.f76366E0, this.f76377a.f76409r, canvas);
            this.f76379c[i].mo90928b(this.f76366E0, this.f76377a.f76409r, canvas);
        }
        if (this.f76373L0) {
            int I = mo90726I();
            int J = mo90728J();
            canvas.translate((float) (-I), (float) (-J));
            canvas.drawPath(this.f76383g, f76365S0);
            canvas.translate((float) I, (float) J);
        }
    }

    /* renamed from: o0 */
    public void mo90777o0(@C0363p0 ColorStateList colorStateList) {
        C31529d dVar = this.f76377a;
        if (dVar.f76395d != colorStateList) {
            dVar.f76395d = colorStateList;
            onStateChange(getState());
        }
    }

    public void onBoundsChange(Rect rect) {
        this.f76381e = true;
        super.onBoundsChange(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean z;
        boolean M0 = mo90735M0(iArr);
        boolean N0 = mo90737N0();
        if (M0 || N0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* renamed from: p */
    public final void mo90779p(@C0359n0 Canvas canvas) {
        mo90783r(canvas, this.f76375Y, this.f76383g, this.f76377a.f76392a, mo90791v());
    }

    /* renamed from: p0 */
    public void mo90780p0(float f) {
        C31529d dVar = this.f76377a;
        if (dVar.f76402k != f) {
            dVar.f76402k = f;
            this.f76381e = true;
            invalidateSelf();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: q */
    public void mo90781q(@C0359n0 Canvas canvas, @C0359n0 Paint paint, @C0359n0 Path path, @C0359n0 RectF rectF) {
        mo90783r(canvas, paint, path, this.f76377a.f76392a, rectF);
    }

    /* renamed from: q0 */
    public void mo90782q0(int i, int i2, int i3, int i4) {
        C31529d dVar = this.f76377a;
        if (dVar.f76400i == null) {
            dVar.f76400i = new Rect();
        }
        this.f76377a.f76400i.set(i, i2, i3, i4);
        invalidateSelf();
    }

    /* renamed from: r */
    public final void mo90783r(@C0359n0 Canvas canvas, @C0359n0 Paint paint, @C0359n0 Path path, @C0359n0 C31534o oVar, @C0359n0 RectF rectF) {
        if (oVar.mo90821u(rectF)) {
            float a = oVar.mo90820t().mo90693a(rectF) * this.f76377a.f76402k;
            canvas.drawRoundRect(rectF, a, a, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: r0 */
    public void mo90784r0(Paint.Style style) {
        this.f76377a.f76413v = style;
        mo90751a0();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: s */
    public void mo90785s(@C0359n0 Canvas canvas) {
        mo90783r(canvas, this.f76376Z, this.f76384v, this.f76374X, mo90793w());
    }

    /* renamed from: s0 */
    public void mo90786s0(float f) {
        C31529d dVar = this.f76377a;
        if (dVar.f76405n != f) {
            dVar.f76405n = f;
            mo90739O0();
        }
    }

    public void setAlpha(@C0337f0(from = 0, mo995to = 255) int i) {
        C31529d dVar = this.f76377a;
        if (dVar.f76404m != i) {
            dVar.f76404m = i;
            mo90751a0();
        }
    }

    public void setColorFilter(@C0363p0 ColorFilter colorFilter) {
        this.f76377a.f76394c = colorFilter;
        mo90751a0();
    }

    public void setShapeAppearanceModel(@C0359n0 C31534o oVar) {
        this.f76377a.f76392a = oVar;
        invalidateSelf();
    }

    public void setTint(@C0354l int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(@C0363p0 ColorStateList colorStateList) {
        this.f76377a.f76398g = colorStateList;
        mo90737N0();
        mo90751a0();
    }

    public void setTintMode(@C0363p0 PorterDuff.Mode mode) {
        C31529d dVar = this.f76377a;
        if (dVar.f76399h != mode) {
            dVar.f76399h = mode;
            mo90737N0();
            mo90751a0();
        }
    }

    /* renamed from: t */
    public float mo90787t() {
        return this.f76377a.f76392a.mo90811j().mo90693a(mo90791v());
    }

    /* renamed from: t0 */
    public void mo90788t0(float f) {
        C31529d dVar = this.f76377a;
        if (dVar.f76401j != f) {
            dVar.f76401j = f;
            invalidateSelf();
        }
    }

    /* renamed from: u */
    public float mo90789u() {
        return this.f76377a.f76392a.mo90813l().mo90693a(mo90791v());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: u0 */
    public void mo90790u0(boolean z) {
        this.f76373L0 = z;
    }

    @C0359n0
    /* renamed from: v */
    public RectF mo90791v() {
        this.f76385w.set(getBounds());
        return this.f76385w;
    }

    /* renamed from: v0 */
    public void mo90792v0(int i) {
        this.f76366E0.mo90692d(i);
        this.f76377a.f76412u = false;
        mo90751a0();
    }

    @C0359n0
    /* renamed from: w */
    public final RectF mo90793w() {
        this.f76386x.set(mo90791v());
        float O = mo90738O();
        this.f76386x.inset(O, O);
        return this.f76386x;
    }

    /* renamed from: w0 */
    public void mo90794w0(int i) {
        C31529d dVar = this.f76377a;
        if (dVar.f76411t != i) {
            dVar.f76411t = i;
            mo90751a0();
        }
    }

    /* renamed from: x */
    public float mo90795x() {
        return this.f76377a.f76406o;
    }

    /* renamed from: x0 */
    public void mo90796x0(int i) {
        C31529d dVar = this.f76377a;
        if (dVar.f76408q != i) {
            dVar.f76408q = i;
            mo90751a0();
        }
    }

    @C0363p0
    /* renamed from: y */
    public ColorStateList mo90797y() {
        return this.f76377a.f76395d;
    }

    @Deprecated
    /* renamed from: y0 */
    public void mo90798y0(int i) {
        mo90775n0((float) i);
    }

    /* renamed from: z */
    public float mo90799z() {
        return this.f76377a.f76402k;
    }

    @Deprecated
    /* renamed from: z0 */
    public void mo90800z0(boolean z) {
        mo90796x0(z ^ true ? 1 : 0);
    }

    public C31525j() {
        this(new C31534o());
    }

    public C31525j(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, @C0336f int i, @C0327c1 int i2) {
        this(C31534o.m127565e(context, attributeSet, i, i2).mo90843m());
    }

    @Deprecated
    public C31525j(@C0359n0 C31552r rVar) {
        this((C31534o) rVar);
    }

    public C31525j(@C0359n0 C31534o oVar) {
        this(new C31529d(oVar, (C31333a) null));
    }

    public C31525j(@C0359n0 C31529d dVar) {
        C31538p pVar;
        this.f76378b = new C31542q.C31551i[4];
        this.f76379c = new C31542q.C31551i[4];
        this.f76380d = new BitSet(8);
        this.f76382f = new Matrix();
        this.f76383g = new Path();
        this.f76384v = new Path();
        this.f76385w = new RectF();
        this.f76386x = new RectF();
        this.f76387y = new Region();
        this.f76388z = new Region();
        Paint paint = new Paint(1);
        this.f76375Y = paint;
        Paint paint2 = new Paint(1);
        this.f76376Z = paint2;
        this.f76366E0 = new C31513b();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            pVar = C31538p.m127630k();
        } else {
            pVar = new C31538p();
        }
        this.f76368G0 = pVar;
        this.f76372K0 = new RectF();
        this.f76373L0 = true;
        this.f76377a = dVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        mo90737N0();
        mo90735M0(getState());
        this.f76367F0 = new C31526a();
    }

    /* renamed from: com.google.android.material.shape.j$d */
    public static final class C31529d extends Drawable.ConstantState {
        @C0359n0

        /* renamed from: a */
        public C31534o f76392a;
        @C0363p0

        /* renamed from: b */
        public C31333a f76393b;
        @C0363p0

        /* renamed from: c */
        public ColorFilter f76394c;
        @C0363p0

        /* renamed from: d */
        public ColorStateList f76395d = null;
        @C0363p0

        /* renamed from: e */
        public ColorStateList f76396e = null;
        @C0363p0

        /* renamed from: f */
        public ColorStateList f76397f = null;
        @C0363p0

        /* renamed from: g */
        public ColorStateList f76398g = null;
        @C0363p0

        /* renamed from: h */
        public PorterDuff.Mode f76399h = PorterDuff.Mode.SRC_IN;
        @C0363p0

        /* renamed from: i */
        public Rect f76400i = null;

        /* renamed from: j */
        public float f76401j = 1.0f;

        /* renamed from: k */
        public float f76402k = 1.0f;

        /* renamed from: l */
        public float f76403l;

        /* renamed from: m */
        public int f76404m = 255;

        /* renamed from: n */
        public float f76405n = 0.0f;

        /* renamed from: o */
        public float f76406o = 0.0f;

        /* renamed from: p */
        public float f76407p = 0.0f;

        /* renamed from: q */
        public int f76408q = 0;

        /* renamed from: r */
        public int f76409r = 0;

        /* renamed from: s */
        public int f76410s = 0;

        /* renamed from: t */
        public int f76411t = 0;

        /* renamed from: u */
        public boolean f76412u = false;

        /* renamed from: v */
        public Paint.Style f76413v = Paint.Style.FILL_AND_STROKE;

        public C31529d(C31534o oVar, C31333a aVar) {
            this.f76392a = oVar;
            this.f76393b = aVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        @C0359n0
        public Drawable newDrawable() {
            C31525j jVar = new C31525j(this, (C31526a) null);
            boolean unused = jVar.f76381e = true;
            return jVar;
        }

        public C31529d(@C0359n0 C31529d dVar) {
            this.f76392a = dVar.f76392a;
            this.f76393b = dVar.f76393b;
            this.f76403l = dVar.f76403l;
            this.f76394c = dVar.f76394c;
            this.f76395d = dVar.f76395d;
            this.f76396e = dVar.f76396e;
            this.f76399h = dVar.f76399h;
            this.f76398g = dVar.f76398g;
            this.f76404m = dVar.f76404m;
            this.f76401j = dVar.f76401j;
            this.f76410s = dVar.f76410s;
            this.f76408q = dVar.f76408q;
            this.f76412u = dVar.f76412u;
            this.f76402k = dVar.f76402k;
            this.f76405n = dVar.f76405n;
            this.f76406o = dVar.f76406o;
            this.f76407p = dVar.f76407p;
            this.f76409r = dVar.f76409r;
            this.f76411t = dVar.f76411t;
            this.f76397f = dVar.f76397f;
            this.f76413v = dVar.f76413v;
            if (dVar.f76400i != null) {
                this.f76400i = new Rect(dVar.f76400i);
            }
        }
    }
}
