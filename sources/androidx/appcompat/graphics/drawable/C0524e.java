package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.appcompat.graphics.drawable.C0516b;
import androidx.appcompat.resources.C0526a;
import androidx.appcompat.resources.C0530b;
import androidx.appcompat.widget.C0806w0;
import androidx.core.content.res.C17483q;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.appcompat.graphics.drawable.e */
public class C0524e extends C0516b {

    /* renamed from: G0 */
    public static final String f1386G0 = "StateListDrawableCompat";

    /* renamed from: H0 */
    public static final boolean f1387H0 = false;

    /* renamed from: E0 */
    public C0525a f1388E0;

    /* renamed from: F0 */
    public boolean f1389F0;

    /* renamed from: androidx.appcompat.graphics.drawable.e$a */
    public static class C0525a extends C0516b.C0520d {

        /* renamed from: J */
        public int[][] f1390J;

        public C0525a(C0525a aVar, C0524e eVar, Resources resources) {
            super(aVar, eVar, resources);
            if (aVar != null) {
                this.f1390J = aVar.f1390J;
            } else {
                this.f1390J = new int[mo1653g()][];
            }
        }

        /* renamed from: D */
        public int mo1742D(int[] iArr, Drawable drawable) {
            int a = mo1646a(drawable);
            this.f1390J[a] = iArr;
            return a;
        }

        /* renamed from: E */
        public int mo1743E(int[] iArr) {
            int[][] iArr2 = this.f1390J;
            int i = mo1656i();
            for (int i2 = 0; i2 < i; i2++) {
                if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                    return i2;
                }
            }
            return -1;
        }

        @C0359n0
        public Drawable newDrawable() {
            return new C0524e(this, (Resources) null);
        }

        /* renamed from: r */
        public void mo1665r(int i, int i2) {
            super.mo1665r(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f1390J, 0, iArr, 0, i);
            this.f1390J = iArr;
        }

        /* renamed from: v */
        public void mo1591v() {
            int[] iArr;
            int[][] iArr2 = this.f1390J;
            int[][] iArr3 = new int[iArr2.length][];
            for (int length = iArr2.length - 1; length >= 0; length--) {
                int[] iArr4 = this.f1390J[length];
                if (iArr4 != null) {
                    iArr = (int[]) iArr4.clone();
                } else {
                    iArr = null;
                }
                iArr3[length] = iArr;
            }
            this.f1390J = iArr3;
        }

        @C0359n0
        public Drawable newDrawable(Resources resources) {
            return new C0524e(this, resources);
        }
    }

    public C0524e() {
        this((C0525a) null, (Resources) null);
    }

    @C0376v0(21)
    public void applyTheme(@C0359n0 Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* renamed from: b */
    public void mo1568b() {
        super.mo1568b();
        this.f1389F0 = false;
    }

    /* renamed from: i */
    public void mo1570i(@C0359n0 C0516b.C0520d dVar) {
        super.mo1570i(dVar);
        if (dVar instanceof C0525a) {
            this.f1388E0 = (C0525a) dVar;
        }
    }

    public boolean isStateful() {
        return true;
    }

    @C0359n0
    public Drawable mutate() {
        if (!this.f1389F0 && super.mutate() == this) {
            this.f1388E0.mo1591v();
            this.f1389F0 = true;
        }
        return this;
    }

    /* renamed from: n */
    public void mo1733n(int[] iArr, Drawable drawable) {
        if (drawable != null) {
            this.f1388E0.mo1742D(iArr, drawable);
            onStateChange(getState());
        }
    }

    /* renamed from: o */
    public C0525a mo1569c() {
        return new C0525a(this.f1388E0, this, (Resources) null);
    }

    public boolean onStateChange(@C0359n0 int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int E = this.f1388E0.mo1743E(iArr);
        if (E < 0) {
            E = this.f1388E0.mo1743E(StateSet.WILD_CARD);
        }
        if (mo1616h(E) || onStateChange) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public int[] mo1734p(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    /* renamed from: q */
    public int mo1735q() {
        return this.f1388E0.mo1656i();
    }

    /* renamed from: r */
    public Drawable mo1736r(int i) {
        return this.f1388E0.mo1655h(i);
    }

    /* renamed from: s */
    public int mo1737s(int[] iArr) {
        return this.f1388E0.mo1743E(iArr);
    }

    /* renamed from: t */
    public C0525a mo1738t() {
        return this.f1388E0;
    }

    /* renamed from: u */
    public int[] mo1739u(int i) {
        return this.f1388E0.f1390J[i];
    }

    /* renamed from: v */
    public void mo1577v(@C0359n0 Context context, @C0359n0 Resources resources, @C0359n0 XmlPullParser xmlPullParser, @C0359n0 AttributeSet attributeSet, @C0363p0 Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray s = C17483q.m80243s(resources, theme, attributeSet, C0530b.C0532b.StateListDrawable);
        setVisible(s.getBoolean(C0530b.C0532b.StateListDrawable_android_visible, true), true);
        mo1741x(s);
        mo1622m(resources);
        s.recycle();
        mo1740w(context, resources, xmlPullParser, attributeSet, theme);
        onStateChange(getState());
    }

    /* renamed from: w */
    public final void mo1740w(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable;
        int next;
        C0525a aVar = this.f1388E0;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next2 == 3) {
                    return;
                }
                if (next2 == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                    TypedArray s = C17483q.m80243s(resources, theme, attributeSet, C0530b.C0532b.StateListDrawableItem);
                    int resourceId = s.getResourceId(C0530b.C0532b.StateListDrawableItem_android_drawable, -1);
                    if (resourceId > 0) {
                        drawable = C0806w0.m3884h().mo3744j(context, resourceId);
                    } else {
                        drawable = null;
                    }
                    s.recycle();
                    int[] p = mo1734p(attributeSet);
                    if (drawable == null) {
                        do {
                            next = xmlPullParser.next();
                        } while (next == 4);
                        if (next == 2) {
                            drawable = C0526a.C0529c.m2475a(resources, xmlPullParser, attributeSet, theme);
                        } else {
                            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + C0508a.f1299S0);
                        }
                    }
                    aVar.mo1742D(p, drawable);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: x */
    public final void mo1741x(TypedArray typedArray) {
        C0525a aVar = this.f1388E0;
        aVar.f1345d |= C0526a.C0529c.m2476b(typedArray);
        aVar.f1350i = typedArray.getBoolean(C0530b.C0532b.StateListDrawable_android_variablePadding, aVar.f1350i);
        aVar.f1353l = typedArray.getBoolean(C0530b.C0532b.StateListDrawable_android_constantSize, aVar.f1353l);
        aVar.f1333A = typedArray.getInt(C0530b.C0532b.StateListDrawable_android_enterFadeDuration, aVar.f1333A);
        aVar.f1334B = typedArray.getInt(C0530b.C0532b.StateListDrawable_android_exitFadeDuration, aVar.f1334B);
        aVar.f1365x = typedArray.getBoolean(C0530b.C0532b.StateListDrawable_android_dither, aVar.f1365x);
    }

    public C0524e(C0525a aVar, Resources resources) {
        mo1570i(new C0525a(aVar, this, resources));
        onStateChange(getState());
    }

    public C0524e(@C0363p0 C0525a aVar) {
        if (aVar != null) {
            mo1570i(aVar);
        }
    }
}
