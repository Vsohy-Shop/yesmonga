package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0375v;
import androidx.annotation.C0376v0;
import androidx.collection.C1866a;
import androidx.core.content.res.C17465i;
import androidx.core.content.res.C17483q;
import androidx.core.graphics.drawable.C17549d;
import androidx.vectordrawable.graphics.drawable.C20715b;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.vectordrawable.graphics.drawable.c */
public class C20718c extends C20728h implements C20715b {

    /* renamed from: w */
    public static final String f53449w = "AnimatedVDCompat";

    /* renamed from: x */
    public static final String f53450x = "animated-vector";

    /* renamed from: y */
    public static final String f53451y = "target";

    /* renamed from: z */
    public static final boolean f53452z = false;

    /* renamed from: b */
    public C20721c f53453b;

    /* renamed from: c */
    public Context f53454c;

    /* renamed from: d */
    public ArgbEvaluator f53455d;

    /* renamed from: e */
    public C20722d f53456e;

    /* renamed from: f */
    public Animator.AnimatorListener f53457f;

    /* renamed from: g */
    public ArrayList<C20715b.C20716a> f53458g;

    /* renamed from: v */
    public final Drawable.Callback f53459v;

    /* renamed from: androidx.vectordrawable.graphics.drawable.c$a */
    public class C20719a implements Drawable.Callback {
        public C20719a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            C20718c.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C20718c.this.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C20718c.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.c$b */
    public class C20720b extends AnimatorListenerAdapter {
        public C20720b() {
        }

        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(C20718c.this.f53458g);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C20715b.C20716a) arrayList.get(i)).mo61953b(C20718c.this);
            }
        }

        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(C20718c.this.f53458g);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C20715b.C20716a) arrayList.get(i)).mo61954c(C20718c.this);
            }
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.c$c */
    public static class C20721c extends Drawable.ConstantState {

        /* renamed from: a */
        public int f53462a;

        /* renamed from: b */
        public C20729i f53463b;

        /* renamed from: c */
        public AnimatorSet f53464c;

        /* renamed from: d */
        public ArrayList<Animator> f53465d;

        /* renamed from: e */
        public C1866a<Animator, String> f53466e;

        public C20721c(Context context, C20721c cVar, Drawable.Callback callback, Resources resources) {
            if (cVar != null) {
                this.f53462a = cVar.f53462a;
                C20729i iVar = cVar.f53463b;
                if (iVar != null) {
                    Drawable.ConstantState constantState = iVar.getConstantState();
                    if (resources != null) {
                        this.f53463b = (C20729i) constantState.newDrawable(resources);
                    } else {
                        this.f53463b = (C20729i) constantState.newDrawable();
                    }
                    C20729i iVar2 = (C20729i) this.f53463b.mutate();
                    this.f53463b = iVar2;
                    iVar2.setCallback(callback);
                    this.f53463b.setBounds(cVar.f53463b.getBounds());
                    this.f53463b.mo62040m(false);
                }
                ArrayList<Animator> arrayList = cVar.f53465d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f53465d = new ArrayList<>(size);
                    this.f53466e = new C1866a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = cVar.f53465d.get(i);
                        Animator clone = animator.clone();
                        String str = cVar.f53466e.get(animator);
                        clone.setTarget(this.f53463b.mo62031h(str));
                        this.f53465d.add(clone);
                        this.f53466e.put(clone, str);
                    }
                    mo62004a();
                }
            }
        }

        /* renamed from: a */
        public void mo62004a() {
            if (this.f53464c == null) {
                this.f53464c = new AnimatorSet();
            }
            this.f53464c.playTogether(this.f53465d);
        }

        public int getChangingConfigurations() {
            return this.f53462a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public C20718c() {
        this((Context) null, (C20721c) null, (Resources) null);
    }

    /* renamed from: a */
    public static void m96176a(Drawable drawable) {
        if (drawable instanceof Animatable) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
        }
    }

    @C0363p0
    /* renamed from: e */
    public static C20718c m96177e(@C0359n0 Context context, @C0375v int i) {
        C20718c cVar = new C20718c(context);
        Drawable g = C17465i.m80175g(context.getResources(), i, context.getTheme());
        cVar.f53484a = g;
        g.setCallback(cVar.f53459v);
        cVar.f53456e = new C20722d(cVar.f53484a.getConstantState());
        return cVar;
    }

    /* renamed from: f */
    public static C20718c m96178f(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C20718c cVar = new C20718c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    /* renamed from: g */
    public static void m96179g(Drawable drawable, C20715b.C20716a aVar) {
        if (drawable != null && aVar != null && (drawable instanceof Animatable)) {
            m96180h((AnimatedVectorDrawable) drawable, aVar);
        }
    }

    @C0376v0(23)
    /* renamed from: h */
    public static void m96180h(@C0359n0 AnimatedVectorDrawable animatedVectorDrawable, @C0359n0 C20715b.C20716a aVar) {
        animatedVectorDrawable.registerAnimationCallback(aVar.mo61952a());
    }

    /* renamed from: l */
    public static boolean m96181l(Drawable drawable, C20715b.C20716a aVar) {
        if (drawable == null || aVar == null || !(drawable instanceof Animatable)) {
            return false;
        }
        return m96182m((AnimatedVectorDrawable) drawable, aVar);
    }

    @C0376v0(23)
    /* renamed from: m */
    public static boolean m96182m(AnimatedVectorDrawable animatedVectorDrawable, C20715b.C20716a aVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(aVar.mo61952a());
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            C17549d.m80439a(drawable, theme);
        }
    }

    /* renamed from: b */
    public void mo61949b(@C0359n0 C20715b.C20716a aVar) {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            m96180h((AnimatedVectorDrawable) drawable, aVar);
        } else if (aVar != null) {
            if (this.f53458g == null) {
                this.f53458g = new ArrayList<>();
            }
            if (!this.f53458g.contains(aVar)) {
                this.f53458g.add(aVar);
                if (this.f53457f == null) {
                    this.f53457f = new C20720b();
                }
                this.f53453b.f53464c.addListener(this.f53457f);
            }
        }
    }

    /* renamed from: c */
    public void mo61950c() {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            return;
        }
        mo61974i();
        ArrayList<C20715b.C20716a> arrayList = this.f53458g;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            return C17549d.m80440b(drawable);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* renamed from: d */
    public boolean mo61951d(@C0359n0 C20715b.C20716a aVar) {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            m96182m((AnimatedVectorDrawable) drawable, aVar);
        }
        ArrayList<C20715b.C20716a> arrayList = this.f53458g;
        if (arrayList == null || aVar == null) {
            return false;
        }
        boolean remove = arrayList.remove(aVar);
        if (this.f53458g.size() == 0) {
            mo61974i();
        }
        return remove;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f53453b.f53463b.draw(canvas);
        if (this.f53453b.f53464c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            return C17549d.m80442d(drawable);
        }
        return this.f53453b.f53463b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f53453b.f53462a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            return C17549d.m80443e(drawable);
        }
        return this.f53453b.f53463b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f53484a != null) {
            return new C20722d(this.f53484a.getConstantState());
        }
        return null;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f53453b.f53463b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f53453b.f53463b.getIntrinsicWidth();
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
        return this.f53453b.f53463b.getOpacity();
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

    /* renamed from: i */
    public final void mo61974i() {
        Animator.AnimatorListener animatorListener = this.f53457f;
        if (animatorListener != null) {
            this.f53453b.f53464c.removeListener(animatorListener);
            this.f53457f = null;
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            C17549d.m80445g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (f53450x.equals(name)) {
                    TypedArray s = C17483q.m80243s(resources, theme, attributeSet, C20714a.f53381M);
                    int resourceId = s.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C20729i e = C20729i.m96219e(resources, resourceId, theme);
                        e.mo62040m(false);
                        e.setCallback(this.f53459v);
                        C20729i iVar = this.f53453b.f53463b;
                        if (iVar != null) {
                            iVar.setCallback((Drawable.Callback) null);
                        }
                        this.f53453b.f53463b = e;
                    }
                    s.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C20714a.f53383O);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f53454c;
                        if (context != null) {
                            mo61980j(string, C20724e.m96201j(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f53453b.mo62004a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            return C17549d.m80446h(drawable);
        }
        return this.f53453b.f53463b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f53453b.f53464c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f53453b.f53463b.isStateful();
    }

    /* renamed from: j */
    public final void mo61980j(String str, Animator animator) {
        animator.setTarget(this.f53453b.f53463b.mo62031h(str));
        C20721c cVar = this.f53453b;
        if (cVar.f53465d == null) {
            cVar.f53465d = new ArrayList<>();
            this.f53453b.f53466e = new C1866a<>();
        }
        this.f53453b.f53465d.add(animator);
        this.f53453b.f53466e.put(animator, str);
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    /* renamed from: k */
    public final void mo61982k(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                mo61982k(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f53455d == null) {
                    this.f53455d = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f53455d);
            }
        }
    }

    public Drawable mutate() {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f53453b.f53463b.setBounds(rect);
        }
    }

    public boolean onLevelChange(int i) {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.f53453b.f53463b.setLevel(i);
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f53453b.f53463b.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f53453b.f53463b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            C17549d.m80448j(drawable, z);
        } else {
            this.f53453b.f53463b.setAutoMirrored(z);
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
            this.f53453b.f53463b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            C17549d.m80453o(drawable, colorStateList);
        } else {
            this.f53453b.f53463b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            C17549d.m80454p(drawable, mode);
        } else {
            this.f53453b.f53463b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f53453b.f53463b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f53453b.f53464c.isStarted()) {
            this.f53453b.f53464c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f53453b.f53464c.end();
        }
    }

    public C20718c(@C0363p0 Context context) {
        this(context, (C20721c) null, (Resources) null);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f53484a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f53453b.f53463b.setColorFilter(colorFilter);
        }
    }

    @C0376v0(24)
    /* renamed from: androidx.vectordrawable.graphics.drawable.c$d */
    public static class C20722d extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f53467a;

        public C20722d(Drawable.ConstantState constantState) {
            this.f53467a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f53467a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f53467a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C20718c cVar = new C20718c();
            Drawable newDrawable = this.f53467a.newDrawable();
            cVar.f53484a = newDrawable;
            newDrawable.setCallback(cVar.f53459v);
            return cVar;
        }

        public Drawable newDrawable(Resources resources) {
            C20718c cVar = new C20718c();
            Drawable newDrawable = this.f53467a.newDrawable(resources);
            cVar.f53484a = newDrawable;
            newDrawable.setCallback(cVar.f53459v);
            return cVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C20718c cVar = new C20718c();
            Drawable newDrawable = this.f53467a.newDrawable(resources, theme);
            cVar.f53484a = newDrawable;
            newDrawable.setCallback(cVar.f53459v);
            return cVar;
        }
    }

    public C20718c(@C0363p0 Context context, @C0363p0 C20721c cVar, @C0363p0 Resources resources) {
        this.f53455d = null;
        this.f53457f = null;
        this.f53458g = null;
        C20719a aVar = new C20719a();
        this.f53459v = aVar;
        this.f53454c = context;
        if (cVar != null) {
            this.f53453b = cVar;
        } else {
            this.f53453b = new C20721c(context, cVar, aVar, resources);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }
}
