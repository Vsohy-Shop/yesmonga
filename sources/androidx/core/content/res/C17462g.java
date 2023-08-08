package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.C16986a;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.content.res.g */
public final class C17462g {

    /* renamed from: a */
    public static final int f45753a = 0;

    /* renamed from: b */
    public static final int f45754b = 1;

    /* renamed from: c */
    public static final int f45755c = 2;

    /* renamed from: a */
    public static C17463a m80155a(@C0363p0 C17463a aVar, @C0354l int i, @C0354l int i2, boolean z, @C0354l int i3) {
        if (aVar != null) {
            return aVar;
        }
        if (z) {
            return new C17463a(i, i3, i2);
        }
        return new C17463a(i, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Shader m80156b(@androidx.annotation.C0359n0 android.content.res.Resources r4, @androidx.annotation.C0359n0 org.xmlpull.v1.XmlPullParser r5, @androidx.annotation.C0363p0 android.content.res.Resources.Theme r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0004:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x000f
            r3 = 1
            if (r1 == r3) goto L_0x000f
            goto L_0x0004
        L_0x000f:
            if (r1 != r2) goto L_0x0016
            android.graphics.Shader r4 = m80157c(r4, r5, r0, r6)
            return r4
        L_0x0016:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C17462g.m80156b(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme):android.graphics.Shader");
    }

    /* renamed from: c */
    public static Shader m80157c(@C0359n0 Resources resources, @C0359n0 XmlPullParser xmlPullParser, @C0359n0 AttributeSet attributeSet, @C0363p0 Resources.Theme theme) throws IOException, XmlPullParserException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            Resources.Theme theme2 = theme;
            TypedArray s = C17483q.m80243s(resources, theme2, attributeSet, C16986a.C16996j.GradientColor);
            float j = C17483q.m80234j(s, xmlPullParser2, "startX", C16986a.C16996j.GradientColor_android_startX, 0.0f);
            float j2 = C17483q.m80234j(s, xmlPullParser2, "startY", C16986a.C16996j.GradientColor_android_startY, 0.0f);
            float j3 = C17483q.m80234j(s, xmlPullParser2, "endX", C16986a.C16996j.GradientColor_android_endX, 0.0f);
            float j4 = C17483q.m80234j(s, xmlPullParser2, "endY", C16986a.C16996j.GradientColor_android_endY, 0.0f);
            float j5 = C17483q.m80234j(s, xmlPullParser2, "centerX", C16986a.C16996j.GradientColor_android_centerX, 0.0f);
            float j6 = C17483q.m80234j(s, xmlPullParser2, "centerY", C16986a.C16996j.GradientColor_android_centerY, 0.0f);
            int k = C17483q.m80235k(s, xmlPullParser2, "type", C16986a.C16996j.GradientColor_android_type, 0);
            int f = C17483q.m80230f(s, xmlPullParser2, "startColor", C16986a.C16996j.GradientColor_android_startColor, 0);
            boolean r = C17483q.m80242r(xmlPullParser2, "centerColor");
            int f2 = C17483q.m80230f(s, xmlPullParser2, "centerColor", C16986a.C16996j.GradientColor_android_centerColor, 0);
            int f3 = C17483q.m80230f(s, xmlPullParser2, "endColor", C16986a.C16996j.GradientColor_android_endColor, 0);
            int k2 = C17483q.m80235k(s, xmlPullParser2, "tileMode", C16986a.C16996j.GradientColor_android_tileMode, 0);
            float f4 = j5;
            float j7 = C17483q.m80234j(s, xmlPullParser2, "gradientRadius", C16986a.C16996j.GradientColor_android_gradientRadius, 0.0f);
            s.recycle();
            C17463a a = m80155a(m80158d(resources, xmlPullParser, attributeSet, theme), f, f3, r, f2);
            if (k == 1) {
                float f5 = f4;
                if (j7 > 0.0f) {
                    int[] iArr = a.f45756a;
                    return new RadialGradient(f5, j6, j7, iArr, a.f45757b, m80159e(k2));
                }
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            } else if (k != 2) {
                return new LinearGradient(j, j2, j3, j4, a.f45756a, a.f45757b, m80159e(k2));
            } else {
                return new SweepGradient(f4, j6, a.f45756a, a.f45757b);
            }
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0080, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.core.content.res.C17462g.C17463a m80158d(@androidx.annotation.C0359n0 android.content.res.Resources r9, @androidx.annotation.C0359n0 org.xmlpull.v1.XmlPullParser r10, @androidx.annotation.C0359n0 android.util.AttributeSet r11, @androidx.annotation.C0363p0 android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r10.next()
            if (r3 == r1) goto L_0x0081
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x0081
        L_0x0021:
            r6 = 2
            if (r3 == r6) goto L_0x0025
            goto L_0x0012
        L_0x0025:
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0034
            goto L_0x0012
        L_0x0034:
            int[] r3 = androidx.core.C16986a.C16996j.GradientColorItem
            android.content.res.TypedArray r3 = androidx.core.content.res.C17483q.m80243s(r9, r12, r11, r3)
            int r5 = androidx.core.C16986a.C16996j.GradientColorItem_android_color
            boolean r6 = r3.hasValue(r5)
            int r7 = androidx.core.C16986a.C16996j.GradientColorItem_android_offset
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L_0x0066
            if (r8 == 0) goto L_0x0066
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x0066:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L_0x0081:
            int r9 = r4.size()
            if (r9 <= 0) goto L_0x008d
            androidx.core.content.res.g$a r9 = new androidx.core.content.res.g$a
            r9.<init>((java.util.List<java.lang.Integer>) r4, (java.util.List<java.lang.Float>) r2)
            return r9
        L_0x008d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C17462g.m80158d(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.res.g$a");
    }

    /* renamed from: e */
    public static Shader.TileMode m80159e(int i) {
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i != 2) {
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.MIRROR;
    }

    /* renamed from: androidx.core.content.res.g$a */
    public static final class C17463a {

        /* renamed from: a */
        public final int[] f45756a;

        /* renamed from: b */
        public final float[] f45757b;

        public C17463a(@C0359n0 List<Integer> list, @C0359n0 List<Float> list2) {
            int size = list.size();
            this.f45756a = new int[size];
            this.f45757b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f45756a[i] = list.get(i).intValue();
                this.f45757b[i] = list2.get(i).floatValue();
            }
        }

        public C17463a(@C0354l int i, @C0354l int i2) {
            this.f45756a = new int[]{i, i2};
            this.f45757b = new float[]{0.0f, 1.0f};
        }

        public C17463a(@C0354l int i, @C0354l int i2, @C0354l int i3) {
            this.f45756a = new int[]{i, i2, i3};
            this.f45757b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
