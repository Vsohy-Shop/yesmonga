package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Shader;
import androidx.annotation.C0354l;
import androidx.annotation.C0358n;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.content.res.d */
public final class C17453d {

    /* renamed from: d */
    public static final String f45732d = "ComplexColorCompat";

    /* renamed from: a */
    public final Shader f45733a;

    /* renamed from: b */
    public final ColorStateList f45734b;

    /* renamed from: c */
    public int f45735c;

    public C17453d(Shader shader, ColorStateList colorStateList, @C0354l int i) {
        this.f45733a = shader;
        this.f45734b = colorStateList;
        this.f45735c = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015  */
    @androidx.annotation.C0359n0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.core.content.res.C17453d m80122a(@androidx.annotation.C0359n0 android.content.res.Resources r4, @androidx.annotation.C0358n int r5, @androidx.annotation.C0363p0 android.content.res.Resources.Theme r6) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            android.content.res.XmlResourceParser r5 = r4.getXml(r5)
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0008:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x0013
            r3 = 1
            if (r1 == r3) goto L_0x0013
            goto L_0x0008
        L_0x0013:
            if (r1 != r2) goto L_0x005c
            java.lang.String r1 = r5.getName()
            r1.hashCode()
            java.lang.String r2 = "gradient"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0053
            java.lang.String r2 = "selector"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0035
            android.content.res.ColorStateList r4 = androidx.core.content.res.C17452c.m80115b(r4, r5, r0, r6)
            androidx.core.content.res.d r4 = m80124c(r4)
            return r4
        L_0x0035:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r5 = r5.getPositionDescription()
            r6.append(r5)
            java.lang.String r5 = ": unsupported complex color tag "
            r6.append(r5)
            r6.append(r1)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L_0x0053:
            android.graphics.Shader r4 = androidx.core.content.res.C17462g.m80157c(r4, r5, r0, r6)
            androidx.core.content.res.d r4 = m80125d(r4)
            return r4
        L_0x005c:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C17453d.m80122a(android.content.res.Resources, int, android.content.res.Resources$Theme):androidx.core.content.res.d");
    }

    /* renamed from: b */
    public static C17453d m80123b(@C0354l int i) {
        return new C17453d((Shader) null, (ColorStateList) null, i);
    }

    /* renamed from: c */
    public static C17453d m80124c(@C0359n0 ColorStateList colorStateList) {
        return new C17453d((Shader) null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: d */
    public static C17453d m80125d(@C0359n0 Shader shader) {
        return new C17453d(shader, (ColorStateList) null, 0);
    }

    @C0363p0
    /* renamed from: g */
    public static C17453d m80126g(@C0359n0 Resources resources, @C0358n int i, @C0363p0 Resources.Theme theme) {
        try {
            return m80122a(resources, i, theme);
        } catch (Exception unused) {
            return null;
        }
    }

    @C0354l
    /* renamed from: e */
    public int mo51880e() {
        return this.f45735c;
    }

    @C0363p0
    /* renamed from: f */
    public Shader mo51881f() {
        return this.f45733a;
    }

    /* renamed from: h */
    public boolean mo51882h() {
        return this.f45733a != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f45734b;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo51883i() {
        /*
            r1 = this;
            android.graphics.Shader r0 = r1.f45733a
            if (r0 != 0) goto L_0x0010
            android.content.res.ColorStateList r0 = r1.f45734b
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C17453d.mo51883i():boolean");
    }

    /* renamed from: j */
    public boolean mo51884j(int[] iArr) {
        if (mo51883i()) {
            ColorStateList colorStateList = this.f45734b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f45735c) {
                this.f45735c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void mo51885k(@C0354l int i) {
        this.f45735c = i;
    }

    /* renamed from: l */
    public boolean mo51886l() {
        return mo51882h() || this.f45735c != 0;
    }
}
