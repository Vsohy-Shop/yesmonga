package androidx.appcompat.graphics.drawable;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.graphics.drawable.C0516b;
import androidx.appcompat.graphics.drawable.C0524e;
import androidx.appcompat.resources.C0526a;
import androidx.appcompat.resources.C0530b;
import androidx.appcompat.widget.C0806w0;
import androidx.collection.C1875h;
import androidx.collection.C1887m;
import androidx.core.content.res.C17483q;
import androidx.core.graphics.drawable.C17567r;
import androidx.core.util.C17992m;
import androidx.vectordrawable.graphics.drawable.C20718c;
import androidx.vectordrawable.graphics.drawable.C20729i;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.appcompat.graphics.drawable.a */
public class C0508a extends C0524e implements C17567r {

    /* renamed from: N0 */
    public static final String f1294N0 = "a";

    /* renamed from: O0 */
    public static final String f1295O0 = "transition";

    /* renamed from: P0 */
    public static final String f1296P0 = "item";

    /* renamed from: Q0 */
    public static final String f1297Q0 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";

    /* renamed from: R0 */
    public static final String f1298R0 = ": <transition> tag requires 'fromId' & 'toId' attributes";

    /* renamed from: S0 */
    public static final String f1299S0 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";

    /* renamed from: I0 */
    public C0511c f1300I0;

    /* renamed from: J0 */
    public C0515g f1301J0;

    /* renamed from: K0 */
    public int f1302K0;

    /* renamed from: L0 */
    public int f1303L0;

    /* renamed from: M0 */
    public boolean f1304M0;

    /* renamed from: androidx.appcompat.graphics.drawable.a$b */
    public static class C0510b extends C0515g {

        /* renamed from: a */
        public final Animatable f1305a;

        public C0510b(Animatable animatable) {
            super();
            this.f1305a = animatable;
        }

        /* renamed from: c */
        public void mo1580c() {
            this.f1305a.start();
        }

        /* renamed from: d */
        public void mo1581d() {
            this.f1305a.stop();
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.a$c */
    public static class C0511c extends C0524e.C0525a {

        /* renamed from: M */
        public static final long f1306M = 4294967296L;

        /* renamed from: N */
        public static final long f1307N = 8589934592L;

        /* renamed from: K */
        public C1875h<Long> f1308K;

        /* renamed from: L */
        public C1887m<Integer> f1309L;

        public C0511c(@C0363p0 C0511c cVar, @C0359n0 C0508a aVar, @C0363p0 Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.f1308K = cVar.f1308K;
                this.f1309L = cVar.f1309L;
                return;
            }
            this.f1308K = new C1875h<>();
            this.f1309L = new C1887m<>();
        }

        /* renamed from: H */
        public static long m2365H(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        /* renamed from: F */
        public int mo1582F(@C0359n0 int[] iArr, @C0359n0 Drawable drawable, int i) {
            int D = super.mo1742D(iArr, drawable);
            this.f1309L.mo6369t(D, Integer.valueOf(i));
            return D;
        }

        /* renamed from: G */
        public int mo1583G(int i, int i2, @C0359n0 Drawable drawable, boolean z) {
            long j;
            int a = super.mo1646a(drawable);
            long H = m2365H(i, i2);
            if (z) {
                j = 8589934592L;
            } else {
                j = 0;
            }
            long j2 = (long) a;
            this.f1308K.mo6215b(H, Long.valueOf(j2 | j));
            if (z) {
                this.f1308K.mo6215b(m2365H(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a;
        }

        /* renamed from: I */
        public int mo1584I(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f1309L.mo6364l(i, 0).intValue();
        }

        /* renamed from: J */
        public int mo1585J(@C0359n0 int[] iArr) {
            int E = super.mo1743E(iArr);
            if (E >= 0) {
                return E;
            }
            return super.mo1743E(StateSet.WILD_CARD);
        }

        /* renamed from: K */
        public int mo1586K(int i, int i2) {
            return (int) this.f1308K.mo6224l(m2365H(i, i2), -1L).longValue();
        }

        /* renamed from: L */
        public boolean mo1587L(int i, int i2) {
            if ((this.f1308K.mo6224l(m2365H(i, i2), -1L).longValue() & 4294967296L) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: M */
        public boolean mo1588M(int i, int i2) {
            if ((this.f1308K.mo6224l(m2365H(i, i2), -1L).longValue() & 8589934592L) != 0) {
                return true;
            }
            return false;
        }

        @C0359n0
        public Drawable newDrawable() {
            return new C0508a(this, (Resources) null);
        }

        /* renamed from: v */
        public void mo1591v() {
            this.f1308K = this.f1308K.clone();
            this.f1309L = this.f1309L.clone();
        }

        @C0359n0
        public Drawable newDrawable(Resources resources) {
            return new C0508a(this, resources);
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.a$d */
    public static class C0512d extends C0515g {

        /* renamed from: a */
        public final C20718c f1310a;

        public C0512d(C20718c cVar) {
            super();
            this.f1310a = cVar;
        }

        /* renamed from: c */
        public void mo1580c() {
            this.f1310a.start();
        }

        /* renamed from: d */
        public void mo1581d() {
            this.f1310a.stop();
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.a$e */
    public static class C0513e extends C0515g {

        /* renamed from: a */
        public final ObjectAnimator f1311a;

        /* renamed from: b */
        public final boolean f1312b;

        public C0513e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int i;
            int i2;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            if (z) {
                i = numberOfFrames - 1;
            } else {
                i = 0;
            }
            if (z) {
                i2 = 0;
            } else {
                i2 = numberOfFrames - 1;
            }
            C0514f fVar = new C0514f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            C0526a.C0528b.m2474a(ofInt, true);
            ofInt.setDuration((long) fVar.mo1594a());
            ofInt.setInterpolator(fVar);
            this.f1312b = z2;
            this.f1311a = ofInt;
        }

        /* renamed from: a */
        public boolean mo1592a() {
            return this.f1312b;
        }

        /* renamed from: b */
        public void mo1593b() {
            this.f1311a.reverse();
        }

        /* renamed from: c */
        public void mo1580c() {
            this.f1311a.start();
        }

        /* renamed from: d */
        public void mo1581d() {
            this.f1311a.cancel();
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.a$f */
    public static class C0514f implements TimeInterpolator {

        /* renamed from: a */
        public int[] f1313a;

        /* renamed from: b */
        public int f1314b;

        /* renamed from: c */
        public int f1315c;

        public C0514f(AnimationDrawable animationDrawable, boolean z) {
            mo1595b(animationDrawable, z);
        }

        /* renamed from: a */
        public int mo1594a() {
            return this.f1315c;
        }

        /* renamed from: b */
        public int mo1595b(AnimationDrawable animationDrawable, boolean z) {
            int i;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f1314b = numberOfFrames;
            int[] iArr = this.f1313a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f1313a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f1313a;
            int i2 = 0;
            for (int i3 = 0; i3 < numberOfFrames; i3++) {
                if (z) {
                    i = (numberOfFrames - i3) - 1;
                } else {
                    i = i3;
                }
                int duration = animationDrawable.getDuration(i);
                iArr2[i3] = duration;
                i2 += duration;
            }
            this.f1315c = i2;
            return i2;
        }

        public float getInterpolation(float f) {
            float f2;
            int i = (int) ((f * ((float) this.f1315c)) + 0.5f);
            int i2 = this.f1314b;
            int[] iArr = this.f1313a;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = iArr[i3];
                if (i < i4) {
                    break;
                }
                i -= i4;
                i3++;
            }
            if (i3 < i2) {
                f2 = ((float) i) / ((float) this.f1315c);
            } else {
                f2 = 0.0f;
            }
            return (((float) i3) / ((float) i2)) + f2;
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.a$g */
    public static abstract class C0515g {
        public C0515g() {
        }

        /* renamed from: a */
        public boolean mo1592a() {
            return false;
        }

        /* renamed from: b */
        public void mo1593b() {
        }

        /* renamed from: c */
        public abstract void mo1580c();

        /* renamed from: d */
        public abstract void mo1581d();
    }

    public C0508a() {
        this((C0511c) null, (Resources) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e A[Catch:{ IOException | XmlPullParserException -> 0x0026 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0019 A[Catch:{ IOException | XmlPullParserException -> 0x0026 }] */
    @androidx.annotation.C0363p0
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.appcompat.graphics.drawable.C0508a m2347B(@androidx.annotation.C0359n0 android.content.Context r5, @androidx.annotation.C0375v int r6, @androidx.annotation.C0363p0 android.content.res.Resources.Theme r7) {
        /*
            android.content.res.Resources r0 = r5.getResources()     // Catch:{ IOException | XmlPullParserException -> 0x0026 }
            android.content.res.XmlResourceParser r6 = r0.getXml(r6)     // Catch:{ IOException | XmlPullParserException -> 0x0026 }
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r6)     // Catch:{ IOException | XmlPullParserException -> 0x0026 }
        L_0x000c:
            int r2 = r6.next()     // Catch:{ IOException | XmlPullParserException -> 0x0026 }
            r3 = 2
            if (r2 == r3) goto L_0x0017
            r4 = 1
            if (r2 == r4) goto L_0x0017
            goto L_0x000c
        L_0x0017:
            if (r2 != r3) goto L_0x001e
            androidx.appcompat.graphics.drawable.a r5 = m2348C(r5, r0, r6, r1, r7)     // Catch:{ IOException | XmlPullParserException -> 0x0026 }
            return r5
        L_0x001e:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException | XmlPullParserException -> 0x0026 }
            java.lang.String r6 = "No start tag found"
            r5.<init>(r6)     // Catch:{ IOException | XmlPullParserException -> 0x0026 }
            throw r5     // Catch:{ IOException | XmlPullParserException -> 0x0026 }
        L_0x0026:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.C0508a.m2347B(android.content.Context, int, android.content.res.Resources$Theme):androidx.appcompat.graphics.drawable.a");
    }

    @C0359n0
    /* renamed from: C */
    public static C0508a m2348C(@C0359n0 Context context, @C0359n0 Resources resources, @C0359n0 XmlPullParser xmlPullParser, @C0359n0 AttributeSet attributeSet, @C0363p0 Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C0508a aVar = new C0508a();
            aVar.mo1577v(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* renamed from: w */
    private void m2349w(@C0359n0 Context context, @C0359n0 Resources resources, @C0359n0 XmlPullParser xmlPullParser, @C0359n0 AttributeSet attributeSet, @C0363p0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        mo1565E(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals(f1295O0)) {
                        mo1566F(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: x */
    private void m2350x(TypedArray typedArray) {
        C0511c cVar = this.f1300I0;
        cVar.f1345d |= C0526a.C0529c.m2476b(typedArray);
        cVar.mo1644B(typedArray.getBoolean(C0530b.C0532b.AnimatedStateListDrawableCompat_android_variablePadding, cVar.f1350i));
        cVar.mo1670x(typedArray.getBoolean(C0530b.C0532b.AnimatedStateListDrawableCompat_android_constantSize, cVar.f1353l));
        cVar.mo1671y(typedArray.getInt(C0530b.C0532b.AnimatedStateListDrawableCompat_android_enterFadeDuration, cVar.f1333A));
        cVar.mo1672z(typedArray.getInt(C0530b.C0532b.AnimatedStateListDrawableCompat_android_exitFadeDuration, cVar.f1334B));
        setDither(typedArray.getBoolean(C0530b.C0532b.AnimatedStateListDrawableCompat_android_dither, cVar.f1365x));
    }

    /* renamed from: A */
    public C0511c mo1574o() {
        return new C0511c(this.f1300I0, this, (Resources) null);
    }

    /* renamed from: D */
    public final void mo1564D() {
        onStateChange(getState());
    }

    /* renamed from: E */
    public final int mo1565E(@C0359n0 Context context, @C0359n0 Resources resources, @C0359n0 XmlPullParser xmlPullParser, @C0359n0 AttributeSet attributeSet, @C0363p0 Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable;
        int next;
        TypedArray s = C17483q.m80243s(resources, theme, attributeSet, C0530b.C0532b.AnimatedStateListDrawableItem);
        int resourceId = s.getResourceId(C0530b.C0532b.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = s.getResourceId(C0530b.C0532b.AnimatedStateListDrawableItem_android_drawable, -1);
        if (resourceId2 > 0) {
            drawable = C0806w0.m3884h().mo3744j(context, resourceId2);
        } else {
            drawable = null;
        }
        s.recycle();
        int[] p = mo1734p(attributeSet);
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f1299S0);
            } else if (xmlPullParser.getName().equals(C20729i.f53485E0)) {
                drawable = C20729i.m96220f(resources, xmlPullParser, attributeSet, theme);
            } else {
                drawable = C0526a.C0529c.m2475a(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawable != null) {
            return this.f1300I0.mo1582F(p, drawable, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f1299S0);
    }

    /* renamed from: F */
    public final int mo1566F(@C0359n0 Context context, @C0359n0 Resources resources, @C0359n0 XmlPullParser xmlPullParser, @C0359n0 AttributeSet attributeSet, @C0363p0 Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable;
        int next;
        TypedArray s = C17483q.m80243s(resources, theme, attributeSet, C0530b.C0532b.AnimatedStateListDrawableTransition);
        int resourceId = s.getResourceId(C0530b.C0532b.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = s.getResourceId(C0530b.C0532b.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = s.getResourceId(C0530b.C0532b.AnimatedStateListDrawableTransition_android_drawable, -1);
        if (resourceId3 > 0) {
            drawable = C0806w0.m3884h().mo3744j(context, resourceId3);
        } else {
            drawable = null;
        }
        boolean z = s.getBoolean(C0530b.C0532b.AnimatedStateListDrawableTransition_android_reversible, false);
        s.recycle();
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f1297Q0);
            } else if (xmlPullParser.getName().equals(C20718c.f53450x)) {
                drawable = C20718c.m96178f(context, resources, xmlPullParser, attributeSet, theme);
            } else {
                drawable = C0526a.C0529c.m2475a(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawable == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f1297Q0);
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f1300I0.mo1583G(resourceId, resourceId2, drawable, z);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f1298R0);
        }
    }

    /* renamed from: G */
    public final boolean mo1567G(int i) {
        int i2;
        int K;
        C0515g gVar;
        C0515g gVar2 = this.f1301J0;
        if (gVar2 == null) {
            i2 = mo1600d();
        } else if (i == this.f1302K0) {
            return true;
        } else {
            if (i != this.f1303L0 || !gVar2.mo1592a()) {
                i2 = this.f1302K0;
                gVar2.mo1581d();
            } else {
                gVar2.mo1593b();
                this.f1302K0 = this.f1303L0;
                this.f1303L0 = i;
                return true;
            }
        }
        this.f1301J0 = null;
        this.f1303L0 = -1;
        this.f1302K0 = -1;
        C0511c cVar = this.f1300I0;
        int I = cVar.mo1584I(i2);
        int I2 = cVar.mo1584I(i);
        if (I2 == 0 || I == 0 || (K = cVar.mo1586K(I, I2)) < 0) {
            return false;
        }
        boolean M = cVar.mo1588M(I, I2);
        mo1616h(K);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            gVar = new C0513e((AnimationDrawable) current, cVar.mo1587L(I, I2), M);
        } else if (current instanceof C20718c) {
            gVar = new C0512d((C20718c) current);
        } else {
            if (current instanceof Animatable) {
                gVar = new C0510b((Animatable) current);
            }
            return false;
        }
        gVar.mo1580c();
        this.f1301J0 = gVar;
        this.f1303L0 = i2;
        this.f1302K0 = i;
        return true;
    }

    /* renamed from: b */
    public void mo1568b() {
        super.mo1568b();
        this.f1304M0 = false;
    }

    /* renamed from: i */
    public void mo1570i(@C0359n0 C0516b.C0520d dVar) {
        super.mo1570i(dVar);
        if (dVar instanceof C0511c) {
            this.f1300I0 = (C0511c) dVar;
        }
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        C0515g gVar = this.f1301J0;
        if (gVar != null) {
            gVar.mo1581d();
            this.f1301J0 = null;
            mo1616h(this.f1302K0);
            this.f1302K0 = -1;
            this.f1303L0 = -1;
        }
    }

    @C0359n0
    public Drawable mutate() {
        if (!this.f1304M0 && super.mutate() == this) {
            this.f1300I0.mo1591v();
            this.f1304M0 = true;
        }
        return this;
    }

    public boolean onStateChange(@C0359n0 int[] iArr) {
        boolean z;
        int J = this.f1300I0.mo1585J(iArr);
        if (J == mo1600d() || (!mo1567G(J) && !mo1616h(J))) {
            z = false;
        } else {
            z = true;
        }
        Drawable current = getCurrent();
        if (current != null) {
            return z | current.setState(iArr);
        }
        return z;
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        C0515g gVar = this.f1301J0;
        if (gVar != null && (visible || z2)) {
            if (z) {
                gVar.mo1580c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    /* renamed from: v */
    public void mo1577v(@C0359n0 Context context, @C0359n0 Resources resources, @C0359n0 XmlPullParser xmlPullParser, @C0359n0 AttributeSet attributeSet, @C0363p0 Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray s = C17483q.m80243s(resources, theme, attributeSet, C0530b.C0532b.AnimatedStateListDrawableCompat);
        setVisible(s.getBoolean(C0530b.C0532b.AnimatedStateListDrawableCompat_android_visible, true), true);
        m2350x(s);
        mo1622m(resources);
        s.recycle();
        m2349w(context, resources, xmlPullParser, attributeSet, theme);
        mo1564D();
    }

    /* renamed from: y */
    public void mo1578y(@C0359n0 int[] iArr, @C0359n0 Drawable drawable, int i) {
        C17992m.m81743d(drawable);
        this.f1300I0.mo1582F(iArr, drawable, i);
        onStateChange(getState());
    }

    /* renamed from: z */
    public <T extends Drawable & Animatable> void mo1579z(int i, int i2, @C0359n0 T t, boolean z) {
        C17992m.m81743d(t);
        this.f1300I0.mo1583G(i, i2, t, z);
    }

    public C0508a(@C0363p0 C0511c cVar, @C0363p0 Resources resources) {
        super((C0524e.C0525a) null);
        this.f1302K0 = -1;
        this.f1303L0 = -1;
        mo1570i(new C0511c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
