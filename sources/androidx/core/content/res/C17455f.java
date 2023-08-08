package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import androidx.annotation.C0331e;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.C16986a;
import androidx.core.provider.C17859f;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.content.res.f */
public class C17455f {

    /* renamed from: a */
    public static final int f45736a = 400;

    /* renamed from: b */
    public static final int f45737b = 1;

    /* renamed from: c */
    public static final int f45738c = 0;

    /* renamed from: d */
    public static final int f45739d = 1;

    /* renamed from: e */
    public static final int f45740e = -1;

    /* renamed from: f */
    public static final int f45741f = 500;

    @C0376v0(21)
    /* renamed from: androidx.core.content.res.f$a */
    public static class C17456a {
        @C0373u
        /* renamed from: a */
        public static int m80143a(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    /* renamed from: androidx.core.content.res.f$b */
    public interface C17457b {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.content.res.f$c */
    public @interface C17458c {
    }

    /* renamed from: androidx.core.content.res.f$d */
    public static final class C17459d implements C17457b {
        @C0359n0

        /* renamed from: a */
        public final C17460e[] f45742a;

        public C17459d(@C0359n0 C17460e[] eVarArr) {
            this.f45742a = eVarArr;
        }

        @C0359n0
        /* renamed from: a */
        public C17460e[] mo51887a() {
            return this.f45742a;
        }
    }

    /* renamed from: androidx.core.content.res.f$e */
    public static final class C17460e {
        @C0359n0

        /* renamed from: a */
        public final String f45743a;

        /* renamed from: b */
        public final int f45744b;

        /* renamed from: c */
        public final boolean f45745c;

        /* renamed from: d */
        public final String f45746d;

        /* renamed from: e */
        public final int f45747e;

        /* renamed from: f */
        public final int f45748f;

        public C17460e(@C0359n0 String str, int i, boolean z, @C0363p0 String str2, int i2, int i3) {
            this.f45743a = str;
            this.f45744b = i;
            this.f45745c = z;
            this.f45746d = str2;
            this.f45747e = i2;
            this.f45748f = i3;
        }

        @C0359n0
        /* renamed from: a */
        public String mo51888a() {
            return this.f45743a;
        }

        /* renamed from: b */
        public int mo51889b() {
            return this.f45748f;
        }

        /* renamed from: c */
        public int mo51890c() {
            return this.f45747e;
        }

        @C0363p0
        /* renamed from: d */
        public String mo51891d() {
            return this.f45746d;
        }

        /* renamed from: e */
        public int mo51892e() {
            return this.f45744b;
        }

        /* renamed from: f */
        public boolean mo51893f() {
            return this.f45745c;
        }
    }

    /* renamed from: a */
    public static int m80135a(TypedArray typedArray, int i) {
        return C17456a.m80143a(typedArray, i);
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    @androidx.annotation.C0363p0
    /* renamed from: b */
    public static androidx.core.content.res.C17455f.C17457b m80136b(@androidx.annotation.C0359n0 org.xmlpull.v1.XmlPullParser r3, @androidx.annotation.C0359n0 android.content.res.Resources r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
        L_0x0000:
            int r0 = r3.next()
            r1 = 2
            if (r0 == r1) goto L_0x000b
            r2 = 1
            if (r0 == r2) goto L_0x000b
            goto L_0x0000
        L_0x000b:
            if (r0 != r1) goto L_0x0012
            androidx.core.content.res.f$b r3 = m80138d(r3, r4)
            return r3
        L_0x0012:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C17455f.m80136b(org.xmlpull.v1.XmlPullParser, android.content.res.Resources):androidx.core.content.res.f$b");
    }

    @C0359n0
    /* renamed from: c */
    public static List<List<byte[]>> m80137c(@C0359n0 Resources resources, @C0331e int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m80135a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m80142h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m80142h(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    @C0363p0
    /* renamed from: d */
    public static C17457b m80138d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, (String) null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m80139e(xmlPullParser, resources);
        }
        m80141g(xmlPullParser);
        return null;
    }

    @C0363p0
    /* renamed from: e */
    public static C17457b m80139e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C16986a.C16996j.FontFamily);
        String string = obtainAttributes.getString(C16986a.C16996j.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(C16986a.C16996j.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(C16986a.C16996j.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(C16986a.C16996j.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(C16986a.C16996j.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(C16986a.C16996j.FontFamily_fontProviderFetchTimeout, 500);
        String string4 = obtainAttributes.getString(C16986a.C16996j.FontFamily_fontProviderSystemFontFamily);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m80140f(xmlPullParser, resources));
                    } else {
                        m80141g(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C17459d((C17460e[]) arrayList.toArray(new C17460e[0]));
        }
        while (xmlPullParser.next() != 3) {
            m80141g(xmlPullParser);
        }
        return new C17461f(new C17859f(string, string2, string3, m80137c(resources, resourceId)), integer, integer2, string4);
    }

    /* renamed from: f */
    public static C17460e m80140f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        boolean z;
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C16986a.C16996j.FontFamilyFont);
        int i = C16986a.C16996j.FontFamilyFont_fontWeight;
        if (!obtainAttributes.hasValue(i)) {
            i = C16986a.C16996j.FontFamilyFont_android_fontWeight;
        }
        int i2 = obtainAttributes.getInt(i, 400);
        int i3 = C16986a.C16996j.FontFamilyFont_fontStyle;
        if (!obtainAttributes.hasValue(i3)) {
            i3 = C16986a.C16996j.FontFamilyFont_android_fontStyle;
        }
        if (1 == obtainAttributes.getInt(i3, 0)) {
            z = true;
        } else {
            z = false;
        }
        int i4 = C16986a.C16996j.FontFamilyFont_ttcIndex;
        if (!obtainAttributes.hasValue(i4)) {
            i4 = C16986a.C16996j.FontFamilyFont_android_ttcIndex;
        }
        int i5 = C16986a.C16996j.FontFamilyFont_fontVariationSettings;
        if (!obtainAttributes.hasValue(i5)) {
            i5 = C16986a.C16996j.FontFamilyFont_android_fontVariationSettings;
        }
        String string = obtainAttributes.getString(i5);
        int i6 = obtainAttributes.getInt(i4, 0);
        int i7 = C16986a.C16996j.FontFamilyFont_font;
        if (!obtainAttributes.hasValue(i7)) {
            i7 = C16986a.C16996j.FontFamilyFont_android_font;
        }
        int resourceId = obtainAttributes.getResourceId(i7, 0);
        String string2 = obtainAttributes.getString(i7);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m80141g(xmlPullParser);
        }
        return new C17460e(string2, i2, z, string, i6, resourceId);
    }

    /* renamed from: g */
    public static void m80141g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: h */
    public static List<byte[]> m80142h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    /* renamed from: androidx.core.content.res.f$f */
    public static final class C17461f implements C17457b {
        @C0359n0

        /* renamed from: a */
        public final C17859f f45749a;

        /* renamed from: b */
        public final int f45750b;

        /* renamed from: c */
        public final int f45751c;
        @C0363p0

        /* renamed from: d */
        public final String f45752d;

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public C17461f(@C0359n0 C17859f fVar, int i, int i2, @C0363p0 String str) {
            this.f45749a = fVar;
            this.f45751c = i;
            this.f45750b = i2;
            this.f45752d = str;
        }

        /* renamed from: a */
        public int mo51894a() {
            return this.f45751c;
        }

        @C0359n0
        /* renamed from: b */
        public C17859f mo51895b() {
            return this.f45749a;
        }

        @C0363p0
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* renamed from: c */
        public String mo51896c() {
            return this.f45752d;
        }

        /* renamed from: d */
        public int mo51897d() {
            return this.f45750b;
        }

        public C17461f(@C0359n0 C17859f fVar, int i, int i2) {
            this(fVar, i, i2, (String) null);
        }
    }
}
