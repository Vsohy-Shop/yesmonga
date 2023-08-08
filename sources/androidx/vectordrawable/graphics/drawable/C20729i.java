package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0375v;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.collection.C1866a;
import androidx.constraintlayout.motion.widget.C16881f;
import androidx.core.content.res.C17453d;
import androidx.core.content.res.C17465i;
import androidx.core.content.res.C17483q;
import androidx.core.graphics.C17634r0;
import androidx.core.graphics.drawable.C17549d;
import com.google.firebase.installations.C33124s;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import kotlinx.serialization.json.C12412q;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.vectordrawable.graphics.drawable.i */
public class C20729i extends C20728h {

    /* renamed from: E0 */
    public static final String f53485E0 = "vector";

    /* renamed from: F0 */
    public static final int f53486F0 = 0;

    /* renamed from: G0 */
    public static final int f53487G0 = 1;

    /* renamed from: H0 */
    public static final int f53488H0 = 2;

    /* renamed from: I0 */
    public static final int f53489I0 = 0;

    /* renamed from: J0 */
    public static final int f53490J0 = 1;

    /* renamed from: K0 */
    public static final int f53491K0 = 2;

    /* renamed from: L0 */
    public static final int f53492L0 = 2048;

    /* renamed from: M0 */
    public static final boolean f53493M0 = false;

    /* renamed from: X */
    public static final String f53494X = "clip-path";

    /* renamed from: Y */
    public static final String f53495Y = "group";

    /* renamed from: Z */
    public static final String f53496Z = "path";

    /* renamed from: y */
    public static final String f53497y = "VectorDrawableCompat";

    /* renamed from: z */
    public static final PorterDuff.Mode f53498z = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public C20737h f53499b;

    /* renamed from: c */
    public PorterDuffColorFilter f53500c;

    /* renamed from: d */
    public ColorFilter f53501d;

    /* renamed from: e */
    public boolean f53502e;

    /* renamed from: f */
    public boolean f53503f;

    /* renamed from: g */
    public Drawable.ConstantState f53504g;

    /* renamed from: v */
    public final float[] f53505v;

    /* renamed from: w */
    public final Matrix f53506w;

    /* renamed from: x */
    public final Rect f53507x;

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$b */
    public static class C20731b extends C20735f {
        public C20731b() {
        }

        /* renamed from: e */
        public boolean mo62051e() {
            return true;
        }

        /* renamed from: i */
        public void mo62052i(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C17483q.m80242r(xmlPullParser, "pathData")) {
                TypedArray s = C17483q.m80243s(resources, theme, attributeSet, C20714a.f53377I);
                mo62053j(s, xmlPullParser);
                s.recycle();
            }
        }

        /* renamed from: j */
        public final void mo62053j(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f53535b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f53534a = C17634r0.m80738d(string2);
            }
            this.f53536c = C17483q.m80235k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        public C20731b(C20731b bVar) {
            super(bVar);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$e */
    public static abstract class C20734e {
        public C20734e() {
        }

        /* renamed from: a */
        public boolean mo62054a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo62055b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$h */
    public static class C20737h extends Drawable.ConstantState {

        /* renamed from: a */
        public int f53555a;

        /* renamed from: b */
        public C20736g f53556b;

        /* renamed from: c */
        public ColorStateList f53557c;

        /* renamed from: d */
        public PorterDuff.Mode f53558d;

        /* renamed from: e */
        public boolean f53559e;

        /* renamed from: f */
        public Bitmap f53560f;

        /* renamed from: g */
        public int[] f53561g;

        /* renamed from: h */
        public ColorStateList f53562h;

        /* renamed from: i */
        public PorterDuff.Mode f53563i;

        /* renamed from: j */
        public int f53564j;

        /* renamed from: k */
        public boolean f53565k;

        /* renamed from: l */
        public boolean f53566l;

        /* renamed from: m */
        public Paint f53567m;

        public C20737h(C20737h hVar) {
            this.f53557c = null;
            this.f53558d = C20729i.f53498z;
            if (hVar != null) {
                this.f53555a = hVar.f53555a;
                C20736g gVar = new C20736g(hVar.f53556b);
                this.f53556b = gVar;
                if (hVar.f53556b.f53543e != null) {
                    gVar.f53543e = new Paint(hVar.f53556b.f53543e);
                }
                if (hVar.f53556b.f53542d != null) {
                    this.f53556b.f53542d = new Paint(hVar.f53556b.f53542d);
                }
                this.f53557c = hVar.f53557c;
                this.f53558d = hVar.f53558d;
                this.f53559e = hVar.f53559e;
            }
        }

        /* renamed from: a */
        public boolean mo62113a(int i, int i2) {
            if (i == this.f53560f.getWidth() && i2 == this.f53560f.getHeight()) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo62114b() {
            if (!this.f53566l && this.f53562h == this.f53557c && this.f53563i == this.f53558d && this.f53565k == this.f53559e && this.f53564j == this.f53556b.getRootAlpha()) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public void mo62115c(int i, int i2) {
            if (this.f53560f == null || !mo62113a(i, i2)) {
                this.f53560f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f53566l = true;
            }
        }

        /* renamed from: d */
        public void mo62116d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f53560f, (Rect) null, rect, mo62117e(colorFilter));
        }

        /* renamed from: e */
        public Paint mo62117e(ColorFilter colorFilter) {
            if (!mo62118f() && colorFilter == null) {
                return null;
            }
            if (this.f53567m == null) {
                Paint paint = new Paint();
                this.f53567m = paint;
                paint.setFilterBitmap(true);
            }
            this.f53567m.setAlpha(this.f53556b.getRootAlpha());
            this.f53567m.setColorFilter(colorFilter);
            return this.f53567m;
        }

        /* renamed from: f */
        public boolean mo62118f() {
            return this.f53556b.getRootAlpha() < 255;
        }

        /* renamed from: g */
        public boolean mo62119g() {
            return this.f53556b.mo62107f();
        }

        public int getChangingConfigurations() {
            return this.f53555a;
        }

        /* renamed from: h */
        public boolean mo62121h(int[] iArr) {
            boolean g = this.f53556b.mo62108g(iArr);
            this.f53566l |= g;
            return g;
        }

        /* renamed from: i */
        public void mo62122i() {
            this.f53562h = this.f53557c;
            this.f53563i = this.f53558d;
            this.f53564j = this.f53556b.getRootAlpha();
            this.f53565k = this.f53559e;
            this.f53566l = false;
        }

        /* renamed from: j */
        public void mo62123j(int i, int i2) {
            this.f53560f.eraseColor(0);
            this.f53556b.mo62103b(new Canvas(this.f53560f), i, i2, (ColorFilter) null);
        }

        @C0359n0
        public Drawable newDrawable() {
            return new C20729i(this);
        }

        @C0359n0
        public Drawable newDrawable(Resources resources) {
            return new C20729i(this);
        }

        public C20737h() {
            this.f53557c = null;
            this.f53558d = C20729i.f53498z;
            this.f53556b = new C20736g();
        }
    }

    public C20729i() {
        this.f53503f = true;
        this.f53505v = new float[9];
        this.f53506w = new Matrix();
        this.f53507x = new Rect();
        this.f53499b = new C20737h();
    }

    /* renamed from: a */
    public static int m96218a(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    @C0363p0
    /* renamed from: e */
    public static C20729i m96219e(@C0359n0 Resources resources, @C0375v int i, @C0363p0 Resources.Theme theme) {
        C20729i iVar = new C20729i();
        iVar.f53484a = C17465i.m80175g(resources, i, theme);
        iVar.f53504g = new C20738i(iVar.f53484a.getConstantState());
        return iVar;
    }

    /* renamed from: f */
    public static C20729i m96220f(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C20729i iVar = new C20729i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    /* renamed from: k */
    public static PorterDuff.Mode m96221k(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f53484a;
        if (drawable == null) {
            return false;
        }
        C17549d.m80440b(drawable);
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f53507x);
        if (this.f53507x.width() > 0 && this.f53507x.height() > 0) {
            ColorFilter colorFilter = this.f53501d;
            if (colorFilter == null) {
                colorFilter = this.f53500c;
            }
            canvas.getMatrix(this.f53506w);
            this.f53506w.getValues(this.f53505v);
            float abs = Math.abs(this.f53505v[0]);
            float abs2 = Math.abs(this.f53505v[4]);
            float abs3 = Math.abs(this.f53505v[1]);
            float abs4 = Math.abs(this.f53505v[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.f53507x.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.f53507x.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f53507x;
                canvas.translate((float) rect.left, (float) rect.top);
                if (mo62038j()) {
                    canvas.translate((float) this.f53507x.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f53507x.offsetTo(0, 0);
                this.f53499b.mo62115c(min, min2);
                if (!this.f53503f) {
                    this.f53499b.mo62123j(min, min2);
                } else if (!this.f53499b.mo62114b()) {
                    this.f53499b.mo62123j(min, min2);
                    this.f53499b.mo62122i();
                }
                this.f53499b.mo62116d(canvas, colorFilter, this.f53507x);
                canvas.restoreToCount(save);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: g */
    public float mo62023g() {
        C20736g gVar;
        C20737h hVar = this.f53499b;
        if (hVar == null || (gVar = hVar.f53556b) == null) {
            return 1.0f;
        }
        float f = gVar.f53547i;
        if (f == 0.0f) {
            return 1.0f;
        }
        float f2 = gVar.f53548j;
        if (f2 == 0.0f) {
            return 1.0f;
        }
        float f3 = gVar.f53550l;
        if (f3 == 0.0f) {
            return 1.0f;
        }
        float f4 = gVar.f53549k;
        if (f4 == 0.0f) {
            return 1.0f;
        }
        return Math.min(f4 / f, f3 / f2);
    }

    public int getAlpha() {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            return C17549d.m80442d(drawable);
        }
        return this.f53499b.f53556b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f53499b.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            return C17549d.m80443e(drawable);
        }
        return this.f53501d;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f53484a != null) {
            return new C20738i(this.f53484a.getConstantState());
        }
        this.f53499b.f53555a = getChangingConfigurations();
        return this.f53499b;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f53499b.f53556b.f53548j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f53499b.f53556b.f53547i;
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* renamed from: h */
    public Object mo62031h(String str) {
        return this.f53499b.f53556b.f53554p.get(str);
    }

    /* renamed from: i */
    public final void mo62032i(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C20737h hVar = this.f53499b;
        C20736g gVar = hVar.f53556b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f53546h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C20733d dVar = (C20733d) arrayDeque.peek();
                if ("path".equals(name)) {
                    C20732c cVar = new C20732c();
                    cVar.mo62068k(resources, attributeSet, theme, xmlPullParser);
                    dVar.f53521b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f53554p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f53555a = cVar.f53537d | hVar.f53555a;
                    z = false;
                } else if ("clip-path".equals(name)) {
                    C20731b bVar = new C20731b();
                    bVar.mo62052i(resources, attributeSet, theme, xmlPullParser);
                    dVar.f53521b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f53554p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f53555a = bVar.f53537d | hVar.f53555a;
                } else if ("group".equals(name)) {
                    C20733d dVar2 = new C20733d();
                    dVar2.mo62078c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f53521b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f53554p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f53555a = dVar2.f53530k | hVar.f53555a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void invalidateSelf() {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            return C17549d.m80446h(drawable);
        }
        return this.f53499b.f53559e;
    }

    public boolean isStateful() {
        C20737h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful() || ((hVar = this.f53499b) != null && (hVar.mo62119g() || ((colorStateList = this.f53499b.f53557c) != null && colorStateList.isStateful())))) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean mo62038j() {
        if (!isAutoMirrored() || C17549d.m80444f(this) != 1) {
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    /* renamed from: l */
    public final void mo62039l(C20733d dVar, int i) {
        String str = "";
        for (int i2 = 0; i2 < i; i2++) {
            str = str + C12412q.f30348a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("current group is :");
        sb.append(dVar.getGroupName());
        sb.append(" rotation is ");
        sb.append(dVar.f53522c);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("matrix is :");
        sb2.append(dVar.getLocalMatrix().toString());
        for (int i3 = 0; i3 < dVar.f53521b.size(); i3++) {
            C20734e eVar = dVar.f53521b.get(i3);
            if (eVar instanceof C20733d) {
                mo62039l((C20733d) eVar, i + 1);
            } else {
                ((C20735f) eVar).mo62098g(i + 1);
            }
        }
    }

    /* renamed from: m */
    public void mo62040m(boolean z) {
        this.f53503f = z;
    }

    public Drawable mutate() {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f53502e && super.mutate() == this) {
            this.f53499b = new C20737h(this.f53499b);
            this.f53502e = true;
        }
        return this;
    }

    /* renamed from: n */
    public final void mo62042n(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        C20737h hVar = this.f53499b;
        C20736g gVar = hVar.f53556b;
        hVar.f53558d = m96221k(C17483q.m80235k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList g = C17483q.m80231g(typedArray, xmlPullParser, theme, "tint", 1);
        if (g != null) {
            hVar.f53557c = g;
        }
        hVar.f53559e = C17483q.m80229e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f53559e);
        gVar.f53549k = C17483q.m80234j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f53549k);
        float j = C17483q.m80234j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f53550l);
        gVar.f53550l = j;
        if (gVar.f53549k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (j > 0.0f) {
            gVar.f53547i = typedArray.getDimension(3, gVar.f53547i);
            float dimension = typedArray.getDimension(2, gVar.f53548j);
            gVar.f53548j = dimension;
            if (gVar.f53547i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                gVar.setAlpha(C17483q.m80234j(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f53552n = string;
                    gVar.f53554p.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    /* renamed from: o */
    public PorterDuffColorFilter mo62043o(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C20737h hVar = this.f53499b;
        ColorStateList colorStateList = hVar.f53557c;
        if (colorStateList == null || (mode = hVar.f53558d) == null) {
            z = false;
        } else {
            this.f53500c = mo62043o(this.f53500c, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!hVar.mo62119g() || !hVar.mo62121h(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f53499b.f53556b.getRootAlpha() != i) {
            this.f53499b.f53556b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            C17549d.m80448j(drawable, z);
        } else {
            this.f53499b.f53559e = z;
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i) {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            C17549d.m80452n(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            C17549d.m80453o(drawable, colorStateList);
            return;
        }
        C20737h hVar = this.f53499b;
        if (hVar.f53557c != colorStateList) {
            hVar.f53557c = colorStateList;
            this.f53500c = mo62043o(this.f53500c, colorStateList, hVar.f53558d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            C17549d.m80454p(drawable, mode);
            return;
        }
        C20737h hVar = this.f53499b;
        if (hVar.f53558d != mode) {
            hVar.f53558d = mode;
            this.f53500c = mo62043o(this.f53500c, hVar.f53557c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @C0376v0(24)
    /* renamed from: androidx.vectordrawable.graphics.drawable.i$i */
    public static class C20738i extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f53568a;

        public C20738i(Drawable.ConstantState constantState) {
            this.f53568a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f53568a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f53568a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C20729i iVar = new C20729i();
            iVar.f53484a = (VectorDrawable) this.f53568a.newDrawable();
            return iVar;
        }

        public Drawable newDrawable(Resources resources) {
            C20729i iVar = new C20729i();
            iVar.f53484a = (VectorDrawable) this.f53568a.newDrawable(resources);
            return iVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C20729i iVar = new C20729i();
            iVar.f53484a = (VectorDrawable) this.f53568a.newDrawable(resources, theme);
            return iVar;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f53501d = colorFilter;
        invalidateSelf();
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$f */
    public static abstract class C20735f extends C20734e {

        /* renamed from: e */
        public static final int f53533e = 0;

        /* renamed from: a */
        public C17634r0.C17636b[] f53534a = null;

        /* renamed from: b */
        public String f53535b;

        /* renamed from: c */
        public int f53536c = 0;

        /* renamed from: d */
        public int f53537d;

        public C20735f() {
            super();
        }

        /* renamed from: c */
        public void mo62056c(Resources.Theme theme) {
        }

        /* renamed from: d */
        public boolean mo62057d() {
            return false;
        }

        /* renamed from: e */
        public boolean mo62051e() {
            return false;
        }

        /* renamed from: f */
        public String mo62097f(C17634r0.C17636b[] bVarArr) {
            String str = " ";
            for (int i = 0; i < bVarArr.length; i++) {
                str = str + bVarArr[i].f46005a + C33124s.f80355c;
                float[] fArr = bVarArr[i].f46006b;
                for (int i2 = 0; i2 < fArr.length; i2++) {
                    str = str + fArr[i2] + ",";
                }
            }
            return str;
        }

        /* renamed from: g */
        public void mo62098g(int i) {
            String str = "";
            for (int i2 = 0; i2 < i; i2++) {
                str = str + C12412q.f30348a;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("current path is :");
            sb.append(this.f53535b);
            sb.append(" pathData is ");
            sb.append(mo62097f(this.f53534a));
        }

        public C17634r0.C17636b[] getPathData() {
            return this.f53534a;
        }

        public String getPathName() {
            return this.f53535b;
        }

        /* renamed from: h */
        public void mo62101h(Path path) {
            path.reset();
            C17634r0.C17636b[] bVarArr = this.f53534a;
            if (bVarArr != null) {
                C17634r0.C17636b.m80749e(bVarArr, path);
            }
        }

        public void setPathData(C17634r0.C17636b[] bVarArr) {
            if (!C17634r0.m80736b(this.f53534a, bVarArr)) {
                this.f53534a = C17634r0.m80740f(bVarArr);
            } else {
                C17634r0.m80745k(this.f53534a, bVarArr);
            }
        }

        public C20735f(C20735f fVar) {
            super();
            this.f53535b = fVar.f53535b;
            this.f53537d = fVar.f53537d;
            this.f53534a = C17634r0.m80740f(fVar.f53534a);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            C17549d.m80445g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C20737h hVar = this.f53499b;
        hVar.f53556b = new C20736g();
        TypedArray s = C17483q.m80243s(resources, theme, attributeSet, C20714a.f53395a);
        mo62042n(s, xmlPullParser, theme);
        s.recycle();
        hVar.f53555a = getChangingConfigurations();
        hVar.f53566l = true;
        mo62032i(resources, xmlPullParser, attributeSet, theme);
        this.f53500c = mo62043o(this.f53500c, hVar.f53557c, hVar.f53558d);
    }

    public C20729i(@C0359n0 C20737h hVar) {
        this.f53503f = true;
        this.f53505v = new float[9];
        this.f53506w = new Matrix();
        this.f53507x = new Rect();
        this.f53499b = hVar;
        this.f53500c = mo62043o(this.f53500c, hVar.f53557c, hVar.f53558d);
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$c */
    public static class C20732c extends C20735f {

        /* renamed from: f */
        public int[] f53508f;

        /* renamed from: g */
        public C17453d f53509g;

        /* renamed from: h */
        public float f53510h = 0.0f;

        /* renamed from: i */
        public C17453d f53511i;

        /* renamed from: j */
        public float f53512j = 1.0f;

        /* renamed from: k */
        public float f53513k = 1.0f;

        /* renamed from: l */
        public float f53514l = 0.0f;

        /* renamed from: m */
        public float f53515m = 1.0f;

        /* renamed from: n */
        public float f53516n = 0.0f;

        /* renamed from: o */
        public Paint.Cap f53517o = Paint.Cap.BUTT;

        /* renamed from: p */
        public Paint.Join f53518p = Paint.Join.MITER;

        /* renamed from: q */
        public float f53519q = 4.0f;

        public C20732c() {
        }

        /* renamed from: a */
        public boolean mo62054a() {
            return this.f53511i.mo51883i() || this.f53509g.mo51883i();
        }

        /* renamed from: b */
        public boolean mo62055b(int[] iArr) {
            return this.f53509g.mo51884j(iArr) | this.f53511i.mo51884j(iArr);
        }

        /* renamed from: c */
        public void mo62056c(Resources.Theme theme) {
        }

        /* renamed from: d */
        public boolean mo62057d() {
            return this.f53508f != null;
        }

        public float getFillAlpha() {
            return this.f53513k;
        }

        @C0354l
        public int getFillColor() {
            return this.f53511i.mo51880e();
        }

        public float getStrokeAlpha() {
            return this.f53512j;
        }

        @C0354l
        public int getStrokeColor() {
            return this.f53509g.mo51880e();
        }

        public float getStrokeWidth() {
            return this.f53510h;
        }

        public float getTrimPathEnd() {
            return this.f53515m;
        }

        public float getTrimPathOffset() {
            return this.f53516n;
        }

        public float getTrimPathStart() {
            return this.f53514l;
        }

        /* renamed from: i */
        public final Paint.Cap mo62066i(int i, Paint.Cap cap) {
            if (i == 0) {
                return Paint.Cap.BUTT;
            }
            if (i == 1) {
                return Paint.Cap.ROUND;
            }
            if (i != 2) {
                return cap;
            }
            return Paint.Cap.SQUARE;
        }

        /* renamed from: j */
        public final Paint.Join mo62067j(int i, Paint.Join join) {
            if (i == 0) {
                return Paint.Join.MITER;
            }
            if (i == 1) {
                return Paint.Join.ROUND;
            }
            if (i != 2) {
                return join;
            }
            return Paint.Join.BEVEL;
        }

        /* renamed from: k */
        public void mo62068k(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s = C17483q.m80243s(resources, theme, attributeSet, C20714a.f53433t);
            mo62069l(s, xmlPullParser, theme);
            s.recycle();
        }

        /* renamed from: l */
        public final void mo62069l(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f53508f = null;
            if (C17483q.m80242r(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f53535b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f53534a = C17634r0.m80738d(string2);
                }
                Resources.Theme theme2 = theme;
                this.f53511i = C17483q.m80233i(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.f53513k = C17483q.m80234j(typedArray, xmlPullParser, "fillAlpha", 12, this.f53513k);
                this.f53517o = mo62066i(C17483q.m80235k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f53517o);
                this.f53518p = mo62067j(C17483q.m80235k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f53518p);
                this.f53519q = C17483q.m80234j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f53519q);
                this.f53509g = C17483q.m80233i(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.f53512j = C17483q.m80234j(typedArray, xmlPullParser, "strokeAlpha", 11, this.f53512j);
                this.f53510h = C17483q.m80234j(typedArray, xmlPullParser, "strokeWidth", 4, this.f53510h);
                this.f53515m = C17483q.m80234j(typedArray, xmlPullParser, "trimPathEnd", 6, this.f53515m);
                this.f53516n = C17483q.m80234j(typedArray, xmlPullParser, "trimPathOffset", 7, this.f53516n);
                this.f53514l = C17483q.m80234j(typedArray, xmlPullParser, "trimPathStart", 5, this.f53514l);
                this.f53536c = C17483q.m80235k(typedArray, xmlPullParser, "fillType", 13, this.f53536c);
            }
        }

        public void setFillAlpha(float f) {
            this.f53513k = f;
        }

        public void setFillColor(int i) {
            this.f53511i.mo51885k(i);
        }

        public void setStrokeAlpha(float f) {
            this.f53512j = f;
        }

        public void setStrokeColor(int i) {
            this.f53509g.mo51885k(i);
        }

        public void setStrokeWidth(float f) {
            this.f53510h = f;
        }

        public void setTrimPathEnd(float f) {
            this.f53515m = f;
        }

        public void setTrimPathOffset(float f) {
            this.f53516n = f;
        }

        public void setTrimPathStart(float f) {
            this.f53514l = f;
        }

        public C20732c(C20732c cVar) {
            super(cVar);
            this.f53508f = cVar.f53508f;
            this.f53509g = cVar.f53509g;
            this.f53510h = cVar.f53510h;
            this.f53512j = cVar.f53512j;
            this.f53511i = cVar.f53511i;
            this.f53536c = cVar.f53536c;
            this.f53513k = cVar.f53513k;
            this.f53514l = cVar.f53514l;
            this.f53515m = cVar.f53515m;
            this.f53516n = cVar.f53516n;
            this.f53517o = cVar.f53517o;
            this.f53518p = cVar.f53518p;
            this.f53519q = cVar.f53519q;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$g */
    public static class C20736g {

        /* renamed from: q */
        public static final Matrix f53538q = new Matrix();

        /* renamed from: a */
        public final Path f53539a;

        /* renamed from: b */
        public final Path f53540b;

        /* renamed from: c */
        public final Matrix f53541c;

        /* renamed from: d */
        public Paint f53542d;

        /* renamed from: e */
        public Paint f53543e;

        /* renamed from: f */
        public PathMeasure f53544f;

        /* renamed from: g */
        public int f53545g;

        /* renamed from: h */
        public final C20733d f53546h;

        /* renamed from: i */
        public float f53547i;

        /* renamed from: j */
        public float f53548j;

        /* renamed from: k */
        public float f53549k;

        /* renamed from: l */
        public float f53550l;

        /* renamed from: m */
        public int f53551m;

        /* renamed from: n */
        public String f53552n;

        /* renamed from: o */
        public Boolean f53553o;

        /* renamed from: p */
        public final C1866a<String, Object> f53554p;

        public C20736g() {
            this.f53541c = new Matrix();
            this.f53547i = 0.0f;
            this.f53548j = 0.0f;
            this.f53549k = 0.0f;
            this.f53550l = 0.0f;
            this.f53551m = 255;
            this.f53552n = null;
            this.f53553o = null;
            this.f53554p = new C1866a<>();
            this.f53546h = new C20733d();
            this.f53539a = new Path();
            this.f53540b = new Path();
        }

        /* renamed from: a */
        public static float m96254a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: b */
        public void mo62103b(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            mo62104c(this.f53546h, f53538q, canvas, i, i2, colorFilter);
        }

        /* renamed from: c */
        public final void mo62104c(C20733d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            dVar.f53520a.set(matrix);
            dVar.f53520a.preConcat(dVar.f53529j);
            canvas.save();
            for (int i3 = 0; i3 < dVar.f53521b.size(); i3++) {
                C20734e eVar = dVar.f53521b.get(i3);
                if (eVar instanceof C20733d) {
                    mo62104c((C20733d) eVar, dVar.f53520a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof C20735f) {
                    mo62105d(dVar, (C20735f) eVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: d */
        public final void mo62105d(C20733d dVar, C20735f fVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            Path.FillType fillType;
            Path.FillType fillType2;
            float f = ((float) i) / this.f53549k;
            float f2 = ((float) i2) / this.f53550l;
            float min = Math.min(f, f2);
            Matrix matrix = dVar.f53520a;
            this.f53541c.set(matrix);
            this.f53541c.postScale(f, f2);
            float e = mo62106e(matrix);
            if (e != 0.0f) {
                fVar.mo62101h(this.f53539a);
                Path path = this.f53539a;
                this.f53540b.reset();
                if (fVar.mo62051e()) {
                    Path path2 = this.f53540b;
                    if (fVar.f53536c == 0) {
                        fillType2 = Path.FillType.WINDING;
                    } else {
                        fillType2 = Path.FillType.EVEN_ODD;
                    }
                    path2.setFillType(fillType2);
                    this.f53540b.addPath(path, this.f53541c);
                    canvas.clipPath(this.f53540b);
                    return;
                }
                C20732c cVar = (C20732c) fVar;
                float f3 = cVar.f53514l;
                if (!(f3 == 0.0f && cVar.f53515m == 1.0f)) {
                    float f4 = cVar.f53516n;
                    float f5 = (f3 + f4) % 1.0f;
                    float f6 = (cVar.f53515m + f4) % 1.0f;
                    if (this.f53544f == null) {
                        this.f53544f = new PathMeasure();
                    }
                    this.f53544f.setPath(this.f53539a, false);
                    float length = this.f53544f.getLength();
                    float f7 = f5 * length;
                    float f8 = f6 * length;
                    path.reset();
                    if (f7 > f8) {
                        this.f53544f.getSegment(f7, length, path, true);
                        this.f53544f.getSegment(0.0f, f8, path, true);
                    } else {
                        this.f53544f.getSegment(f7, f8, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f53540b.addPath(path, this.f53541c);
                if (cVar.f53511i.mo51886l()) {
                    C17453d dVar2 = cVar.f53511i;
                    if (this.f53543e == null) {
                        Paint paint = new Paint(1);
                        this.f53543e = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.f53543e;
                    if (dVar2.mo51882h()) {
                        Shader f9 = dVar2.mo51881f();
                        f9.setLocalMatrix(this.f53541c);
                        paint2.setShader(f9);
                        paint2.setAlpha(Math.round(cVar.f53513k * 255.0f));
                    } else {
                        paint2.setShader((Shader) null);
                        paint2.setAlpha(255);
                        paint2.setColor(C20729i.m96218a(dVar2.mo51880e(), cVar.f53513k));
                    }
                    paint2.setColorFilter(colorFilter);
                    Path path3 = this.f53540b;
                    if (cVar.f53536c == 0) {
                        fillType = Path.FillType.WINDING;
                    } else {
                        fillType = Path.FillType.EVEN_ODD;
                    }
                    path3.setFillType(fillType);
                    canvas.drawPath(this.f53540b, paint2);
                }
                if (cVar.f53509g.mo51886l()) {
                    C17453d dVar3 = cVar.f53509g;
                    if (this.f53542d == null) {
                        Paint paint3 = new Paint(1);
                        this.f53542d = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.f53542d;
                    Paint.Join join = cVar.f53518p;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.f53517o;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(cVar.f53519q);
                    if (dVar3.mo51882h()) {
                        Shader f10 = dVar3.mo51881f();
                        f10.setLocalMatrix(this.f53541c);
                        paint4.setShader(f10);
                        paint4.setAlpha(Math.round(cVar.f53512j * 255.0f));
                    } else {
                        paint4.setShader((Shader) null);
                        paint4.setAlpha(255);
                        paint4.setColor(C20729i.m96218a(dVar3.mo51880e(), cVar.f53512j));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(cVar.f53510h * min * e);
                    canvas.drawPath(this.f53540b, paint4);
                }
            }
        }

        /* renamed from: e */
        public final float mo62106e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a = m96254a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a) / max;
            }
            return 0.0f;
        }

        /* renamed from: f */
        public boolean mo62107f() {
            if (this.f53553o == null) {
                this.f53553o = Boolean.valueOf(this.f53546h.mo62054a());
            }
            return this.f53553o.booleanValue();
        }

        /* renamed from: g */
        public boolean mo62108g(int[] iArr) {
            return this.f53546h.mo62055b(iArr);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f53551m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f53551m = i;
        }

        public C20736g(C20736g gVar) {
            this.f53541c = new Matrix();
            this.f53547i = 0.0f;
            this.f53548j = 0.0f;
            this.f53549k = 0.0f;
            this.f53550l = 0.0f;
            this.f53551m = 255;
            this.f53552n = null;
            this.f53553o = null;
            C1866a<String, Object> aVar = new C1866a<>();
            this.f53554p = aVar;
            this.f53546h = new C20733d(gVar.f53546h, aVar);
            this.f53539a = new Path(gVar.f53539a);
            this.f53540b = new Path(gVar.f53540b);
            this.f53547i = gVar.f53547i;
            this.f53548j = gVar.f53548j;
            this.f53549k = gVar.f53549k;
            this.f53550l = gVar.f53550l;
            this.f53545g = gVar.f53545g;
            this.f53551m = gVar.f53551m;
            this.f53552n = gVar.f53552n;
            String str = gVar.f53552n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f53553o = gVar.f53553o;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$d */
    public static class C20733d extends C20734e {

        /* renamed from: a */
        public final Matrix f53520a;

        /* renamed from: b */
        public final ArrayList<C20734e> f53521b;

        /* renamed from: c */
        public float f53522c;

        /* renamed from: d */
        public float f53523d;

        /* renamed from: e */
        public float f53524e;

        /* renamed from: f */
        public float f53525f;

        /* renamed from: g */
        public float f53526g;

        /* renamed from: h */
        public float f53527h;

        /* renamed from: i */
        public float f53528i;

        /* renamed from: j */
        public final Matrix f53529j;

        /* renamed from: k */
        public int f53530k;

        /* renamed from: l */
        public int[] f53531l;

        /* renamed from: m */
        public String f53532m;

        public C20733d(C20733d dVar, C1866a<String, Object> aVar) {
            super();
            C20735f fVar;
            this.f53520a = new Matrix();
            this.f53521b = new ArrayList<>();
            this.f53522c = 0.0f;
            this.f53523d = 0.0f;
            this.f53524e = 0.0f;
            this.f53525f = 1.0f;
            this.f53526g = 1.0f;
            this.f53527h = 0.0f;
            this.f53528i = 0.0f;
            Matrix matrix = new Matrix();
            this.f53529j = matrix;
            this.f53532m = null;
            this.f53522c = dVar.f53522c;
            this.f53523d = dVar.f53523d;
            this.f53524e = dVar.f53524e;
            this.f53525f = dVar.f53525f;
            this.f53526g = dVar.f53526g;
            this.f53527h = dVar.f53527h;
            this.f53528i = dVar.f53528i;
            this.f53531l = dVar.f53531l;
            String str = dVar.f53532m;
            this.f53532m = str;
            this.f53530k = dVar.f53530k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f53529j);
            ArrayList<C20734e> arrayList = dVar.f53521b;
            for (int i = 0; i < arrayList.size(); i++) {
                C20734e eVar = arrayList.get(i);
                if (eVar instanceof C20733d) {
                    this.f53521b.add(new C20733d((C20733d) eVar, aVar));
                } else {
                    if (eVar instanceof C20732c) {
                        fVar = new C20732c((C20732c) eVar);
                    } else if (eVar instanceof C20731b) {
                        fVar = new C20731b((C20731b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f53521b.add(fVar);
                    String str2 = fVar.f53535b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        /* renamed from: a */
        public boolean mo62054a() {
            for (int i = 0; i < this.f53521b.size(); i++) {
                if (this.f53521b.get(i).mo62054a()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo62055b(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f53521b.size(); i++) {
                z |= this.f53521b.get(i).mo62055b(iArr);
            }
            return z;
        }

        /* renamed from: c */
        public void mo62078c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s = C17483q.m80243s(resources, theme, attributeSet, C20714a.f53415k);
            mo62080e(s, xmlPullParser);
            s.recycle();
        }

        /* renamed from: d */
        public final void mo62079d() {
            this.f53529j.reset();
            this.f53529j.postTranslate(-this.f53523d, -this.f53524e);
            this.f53529j.postScale(this.f53525f, this.f53526g);
            this.f53529j.postRotate(this.f53522c, 0.0f, 0.0f);
            this.f53529j.postTranslate(this.f53527h + this.f53523d, this.f53528i + this.f53524e);
        }

        /* renamed from: e */
        public final void mo62080e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f53531l = null;
            this.f53522c = C17483q.m80234j(typedArray, xmlPullParser, C16881f.f43375i, 5, this.f53522c);
            this.f53523d = typedArray.getFloat(1, this.f53523d);
            this.f53524e = typedArray.getFloat(2, this.f53524e);
            this.f53525f = C17483q.m80234j(typedArray, xmlPullParser, "scaleX", 3, this.f53525f);
            this.f53526g = C17483q.m80234j(typedArray, xmlPullParser, "scaleY", 4, this.f53526g);
            this.f53527h = C17483q.m80234j(typedArray, xmlPullParser, "translateX", 6, this.f53527h);
            this.f53528i = C17483q.m80234j(typedArray, xmlPullParser, "translateY", 7, this.f53528i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f53532m = string;
            }
            mo62079d();
        }

        public String getGroupName() {
            return this.f53532m;
        }

        public Matrix getLocalMatrix() {
            return this.f53529j;
        }

        public float getPivotX() {
            return this.f53523d;
        }

        public float getPivotY() {
            return this.f53524e;
        }

        public float getRotation() {
            return this.f53522c;
        }

        public float getScaleX() {
            return this.f53525f;
        }

        public float getScaleY() {
            return this.f53526g;
        }

        public float getTranslateX() {
            return this.f53527h;
        }

        public float getTranslateY() {
            return this.f53528i;
        }

        public void setPivotX(float f) {
            if (f != this.f53523d) {
                this.f53523d = f;
                mo62079d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f53524e) {
                this.f53524e = f;
                mo62079d();
            }
        }

        public void setRotation(float f) {
            if (f != this.f53522c) {
                this.f53522c = f;
                mo62079d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f53525f) {
                this.f53525f = f;
                mo62079d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f53526g) {
                this.f53526g = f;
                mo62079d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f53527h) {
                this.f53527h = f;
                mo62079d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f53528i) {
                this.f53528i = f;
                mo62079d();
            }
        }

        public C20733d() {
            super();
            this.f53520a = new Matrix();
            this.f53521b = new ArrayList<>();
            this.f53522c = 0.0f;
            this.f53523d = 0.0f;
            this.f53524e = 0.0f;
            this.f53525f = 1.0f;
            this.f53526g = 1.0f;
            this.f53527h = 0.0f;
            this.f53528i = 0.0f;
            this.f53529j = new Matrix();
            this.f53532m = null;
        }
    }
}
