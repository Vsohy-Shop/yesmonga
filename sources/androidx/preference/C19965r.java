package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.InflateException;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.preference.r */
public class C19965r {

    /* renamed from: e */
    public static final Class<?>[] f51090e = {Context.class, AttributeSet.class};

    /* renamed from: f */
    public static final HashMap<String, Constructor<?>> f51091f = new HashMap<>();

    /* renamed from: g */
    public static final String f51092g = "intent";

    /* renamed from: h */
    public static final String f51093h = "extra";
    @C0359n0

    /* renamed from: a */
    public final Context f51094a;

    /* renamed from: b */
    public final Object[] f51095b = new Object[2];

    /* renamed from: c */
    public C19966s f51096c;

    /* renamed from: d */
    public String[] f51097d;

    public C19965r(@C0359n0 Context context, C19966s sVar) {
        this.f51094a = context;
        mo59176g(sVar);
    }

    /* renamed from: l */
    public static void m92844l(@C0359n0 XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0078, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0079, code lost:
        r0 = new android.view.InflateException(r13.getPositionDescription() + ": Error inflating class " + r11);
        r0.initCause(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0097, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0098, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0099, code lost:
        throw r11;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0078 A[ExcHandler: Exception (r12v4 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:2:0x000d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.preference.Preference mo59170a(@androidx.annotation.C0359n0 java.lang.String r11, @androidx.annotation.C0363p0 java.lang.String[] r12, android.util.AttributeSet r13) throws java.lang.ClassNotFoundException, android.view.InflateException {
        /*
            r10 = this;
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<?>> r0 = f51091f
            java.lang.Object r0 = r0.get(r11)
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            java.lang.String r1 = ": Error inflating class "
            r2 = 1
            if (r0 != 0) goto L_0x006d
            android.content.Context r0 = r10.f51094a     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r3 = 0
            if (r12 == 0) goto L_0x005b
            int r4 = r12.length     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            if (r4 != 0) goto L_0x001a
            goto L_0x005b
        L_0x001a:
            int r4 = r12.length     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r5 = 0
            r6 = r3
            r7 = r5
        L_0x001e:
            if (r6 >= r4) goto L_0x003a
            r8 = r12[r6]     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0036, Exception -> 0x0078 }
            r9.<init>()     // Catch:{ ClassNotFoundException -> 0x0036, Exception -> 0x0078 }
            r9.append(r8)     // Catch:{ ClassNotFoundException -> 0x0036, Exception -> 0x0078 }
            r9.append(r11)     // Catch:{ ClassNotFoundException -> 0x0036, Exception -> 0x0078 }
            java.lang.String r8 = r9.toString()     // Catch:{ ClassNotFoundException -> 0x0036, Exception -> 0x0078 }
            java.lang.Class r5 = java.lang.Class.forName(r8, r3, r0)     // Catch:{ ClassNotFoundException -> 0x0036, Exception -> 0x0078 }
            goto L_0x003a
        L_0x0036:
            r7 = move-exception
            int r6 = r6 + 1
            goto L_0x001e
        L_0x003a:
            if (r5 != 0) goto L_0x005f
            if (r7 != 0) goto L_0x005a
            android.view.InflateException r12 = new android.view.InflateException     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r0.<init>()     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            java.lang.String r2 = r13.getPositionDescription()     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r0.append(r2)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r0.append(r1)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r0.append(r11)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            java.lang.String r0 = r0.toString()     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r12.<init>(r0)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            throw r12     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
        L_0x005a:
            throw r7     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
        L_0x005b:
            java.lang.Class r5 = java.lang.Class.forName(r11, r3, r0)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
        L_0x005f:
            java.lang.Class<?>[] r12 = f51090e     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            java.lang.reflect.Constructor r0 = r5.getConstructor(r12)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r0.setAccessible(r2)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<?>> r12 = f51091f     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r12.put(r11, r0)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
        L_0x006d:
            java.lang.Object[] r12 = r10.f51095b     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r12[r2] = r13     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            java.lang.Object r12 = r0.newInstance(r12)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            androidx.preference.Preference r12 = (androidx.preference.Preference) r12     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            return r12
        L_0x0078:
            r12 = move-exception
            android.view.InflateException r0 = new android.view.InflateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r13 = r13.getPositionDescription()
            r2.append(r13)
            r2.append(r1)
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            r0.<init>(r11)
            r0.initCause(r12)
            throw r0
        L_0x0098:
            r11 = move-exception
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.C19965r.mo59170a(java.lang.String, java.lang.String[], android.util.AttributeSet):androidx.preference.Preference");
    }

    /* renamed from: b */
    public final Preference mo59171b(String str, AttributeSet attributeSet) {
        try {
            if (-1 == str.indexOf(46)) {
                return mo59177h(str, attributeSet);
            }
            return mo59170a(str, (String[]) null, attributeSet);
        } catch (InflateException e) {
            throw e;
        } catch (ClassNotFoundException e2) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e2);
            throw inflateException;
        } catch (Exception e3) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e3);
            throw inflateException2;
        }
    }

    @C0359n0
    /* renamed from: c */
    public Context mo59172c() {
        return this.f51094a;
    }

    /* renamed from: d */
    public String[] mo59173d() {
        return this.f51097d;
    }

    @C0359n0
    /* renamed from: e */
    public Preference mo59174e(int i, @C0363p0 PreferenceGroup preferenceGroup) {
        XmlResourceParser xml = mo59172c().getResources().getXml(i);
        try {
            return mo59175f(xml, preferenceGroup);
        } finally {
            xml.close();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001a A[Catch:{ InflateException -> 0x007c, XmlPullParserException -> 0x006e, IOException -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[SYNTHETIC, Splitter:B:14:0x002d] */
    @androidx.annotation.C0359n0
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.preference.Preference mo59175f(org.xmlpull.v1.XmlPullParser r6, @androidx.annotation.C0363p0 androidx.preference.PreferenceGroup r7) {
        /*
            r5 = this;
            java.lang.Object[] r0 = r5.f51095b
            monitor-enter(r0)
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r6)     // Catch:{ all -> 0x007e }
            java.lang.Object[] r2 = r5.f51095b     // Catch:{ all -> 0x007e }
            android.content.Context r3 = r5.f51094a     // Catch:{ all -> 0x007e }
            r4 = 0
            r2[r4] = r3     // Catch:{ all -> 0x007e }
        L_0x000e:
            int r2 = r6.next()     // Catch:{ InflateException -> 0x007c, XmlPullParserException -> 0x006e, IOException -> 0x0048 }
            r3 = 2
            if (r2 == r3) goto L_0x0018
            r4 = 1
            if (r2 != r4) goto L_0x000e
        L_0x0018:
            if (r2 != r3) goto L_0x002d
            java.lang.String r2 = r6.getName()     // Catch:{ InflateException -> 0x007c, XmlPullParserException -> 0x006e, IOException -> 0x0048 }
            androidx.preference.Preference r2 = r5.mo59171b(r2, r1)     // Catch:{ InflateException -> 0x007c, XmlPullParserException -> 0x006e, IOException -> 0x0048 }
            androidx.preference.PreferenceGroup r2 = (androidx.preference.PreferenceGroup) r2     // Catch:{ InflateException -> 0x007c, XmlPullParserException -> 0x006e, IOException -> 0x0048 }
            androidx.preference.PreferenceGroup r7 = r5.mo59178i(r7, r2)     // Catch:{ InflateException -> 0x007c, XmlPullParserException -> 0x006e, IOException -> 0x0048 }
            r5.mo59179j(r6, r7, r1)     // Catch:{ InflateException -> 0x007c, XmlPullParserException -> 0x006e, IOException -> 0x0048 }
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            return r7
        L_0x002d:
            android.view.InflateException r7 = new android.view.InflateException     // Catch:{ InflateException -> 0x007c, XmlPullParserException -> 0x006e, IOException -> 0x0048 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ InflateException -> 0x007c, XmlPullParserException -> 0x006e, IOException -> 0x0048 }
            r1.<init>()     // Catch:{ InflateException -> 0x007c, XmlPullParserException -> 0x006e, IOException -> 0x0048 }
            java.lang.String r2 = r6.getPositionDescription()     // Catch:{ InflateException -> 0x007c, XmlPullParserException -> 0x006e, IOException -> 0x0048 }
            r1.append(r2)     // Catch:{ InflateException -> 0x007c, XmlPullParserException -> 0x006e, IOException -> 0x0048 }
            java.lang.String r2 = ": No start tag found!"
            r1.append(r2)     // Catch:{ InflateException -> 0x007c, XmlPullParserException -> 0x006e, IOException -> 0x0048 }
            java.lang.String r1 = r1.toString()     // Catch:{ InflateException -> 0x007c, XmlPullParserException -> 0x006e, IOException -> 0x0048 }
            r7.<init>(r1)     // Catch:{ InflateException -> 0x007c, XmlPullParserException -> 0x006e, IOException -> 0x0048 }
            throw r7     // Catch:{ InflateException -> 0x007c, XmlPullParserException -> 0x006e, IOException -> 0x0048 }
        L_0x0048:
            r7 = move-exception
            android.view.InflateException r1 = new android.view.InflateException     // Catch:{ all -> 0x007e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
            r2.<init>()     // Catch:{ all -> 0x007e }
            java.lang.String r6 = r6.getPositionDescription()     // Catch:{ all -> 0x007e }
            r2.append(r6)     // Catch:{ all -> 0x007e }
            java.lang.String r6 = ": "
            r2.append(r6)     // Catch:{ all -> 0x007e }
            java.lang.String r6 = r7.getMessage()     // Catch:{ all -> 0x007e }
            r2.append(r6)     // Catch:{ all -> 0x007e }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x007e }
            r1.<init>(r6)     // Catch:{ all -> 0x007e }
            r1.initCause(r7)     // Catch:{ all -> 0x007e }
            throw r1     // Catch:{ all -> 0x007e }
        L_0x006e:
            r6 = move-exception
            android.view.InflateException r7 = new android.view.InflateException     // Catch:{ all -> 0x007e }
            java.lang.String r1 = r6.getMessage()     // Catch:{ all -> 0x007e }
            r7.<init>(r1)     // Catch:{ all -> 0x007e }
            r7.initCause(r6)     // Catch:{ all -> 0x007e }
            throw r7     // Catch:{ all -> 0x007e }
        L_0x007c:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x007e }
        L_0x007e:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.C19965r.mo59175f(org.xmlpull.v1.XmlPullParser, androidx.preference.PreferenceGroup):androidx.preference.Preference");
    }

    /* renamed from: g */
    public final void mo59176g(C19966s sVar) {
        this.f51096c = sVar;
        mo59180k(new String[]{Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."});
    }

    /* renamed from: h */
    public Preference mo59177h(String str, AttributeSet attributeSet) throws ClassNotFoundException {
        return mo59170a(str, this.f51097d, attributeSet);
    }

    @C0359n0
    /* renamed from: i */
    public final PreferenceGroup mo59178i(PreferenceGroup preferenceGroup, @C0359n0 PreferenceGroup preferenceGroup2) {
        if (preferenceGroup != null) {
            return preferenceGroup;
        }
        preferenceGroup2.mo58846M1(this.f51096c);
        return preferenceGroup2;
    }

    /* renamed from: j */
    public final void mo59179j(@C0359n0 XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if (f51092g.equals(name)) {
                    try {
                        preference.mo58841K2(Intent.parseIntent(mo59172c().getResources(), xmlPullParser, attributeSet));
                    } catch (IOException e) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    mo59172c().getResources().parseBundleExtra("extra", attributeSet, preference.mo58864X());
                    try {
                        m92844l(xmlPullParser);
                    } catch (IOException e2) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e2);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference b = mo59171b(name, attributeSet);
                    ((PreferenceGroup) preference).mo58936k3(b);
                    mo59179j(xmlPullParser, b, attributeSet);
                }
            }
        }
    }

    /* renamed from: k */
    public void mo59180k(String[] strArr) {
        this.f51097d = strArr;
    }
}
