package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.appcompat.graphics.drawable.C0508a;
import androidx.collection.C1866a;
import androidx.constraintlayout.core.motion.utils.C16717v;
import androidx.core.content.res.C17483q;
import com.urbanairship.actions.C35491d;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.transition.i0 */
public class C20623i0 {

    /* renamed from: b */
    public static final Class<?>[] f53199b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    public static final C1866a<String, Constructor<?>> f53200c = new C1866a<>();

    /* renamed from: a */
    public final Context f53201a;

    public C20623i0(@C0359n0 Context context) {
        this.f53201a = context;
    }

    @C0359n0
    /* renamed from: d */
    public static C20623i0 m95903d(@C0359n0 Context context) {
        return new C20623i0(context);
    }

    /* renamed from: a */
    public final Object mo61802a(AttributeSet attributeSet, Class<?> cls, String str) {
        Object newInstance;
        Class<? extends U> asSubclass;
        String attributeValue = attributeSet.getAttributeValue((String) null, C35491d.f87525c);
        if (attributeValue != null) {
            try {
                C1866a<String, Constructor<?>> aVar = f53200c;
                synchronized (aVar) {
                    Constructor<? extends U> constructor = aVar.get(attributeValue);
                    if (constructor == null && (asSubclass = Class.forName(attributeValue, false, this.f53201a.getClassLoader()).asSubclass(cls)) != null) {
                        constructor = asSubclass.getConstructor(f53199b);
                        constructor.setAccessible(true);
                        aVar.put(attributeValue, constructor);
                    }
                    newInstance = constructor.newInstance(new Object[]{this.f53201a, attributeSet});
                }
                return newInstance;
            } catch (Exception e) {
                throw new InflateException("Could not instantiate " + cls + " class " + attributeValue, e);
            }
        } else {
            throw new InflateException(str + " tag must have a 'class' attribute");
        }
    }

    /* renamed from: b */
    public final C20606h0 mo61803b(XmlPullParser xmlPullParser, AttributeSet attributeSet, C20606h0 h0Var) throws XmlPullParserException, IOException {
        C20639m0 m0Var;
        C20606h0 h0Var2;
        int depth = xmlPullParser.getDepth();
        if (h0Var instanceof C20639m0) {
            m0Var = (C20639m0) h0Var;
        } else {
            m0Var = null;
        }
        loop0:
        while (true) {
            h0Var2 = null;
            while (true) {
                int next = xmlPullParser.next();
                if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                    if (next == 2) {
                        String name = xmlPullParser.getName();
                        if ("fade".equals(name)) {
                            h0Var2 = new C20633l(this.f53201a, attributeSet);
                        } else if ("changeBounds".equals(name)) {
                            h0Var2 = new C20560e(this.f53201a, attributeSet);
                        } else if ("slide".equals(name)) {
                            h0Var2 = new C20576f0(this.f53201a, attributeSet);
                        } else if ("explode".equals(name)) {
                            h0Var2 = new C20628k(this.f53201a, attributeSet);
                        } else if ("changeImageTransform".equals(name)) {
                            h0Var2 = new C20588g(this.f53201a, attributeSet);
                        } else if ("changeTransform".equals(name)) {
                            h0Var2 = new C20616i(this.f53201a, attributeSet);
                        } else if ("changeClipBounds".equals(name)) {
                            h0Var2 = new C20574f(this.f53201a, attributeSet);
                        } else if (C16717v.C16725h.f42321f.equals(name)) {
                            h0Var2 = new C20552c(this.f53201a, attributeSet);
                        } else if ("changeScroll".equals(name)) {
                            h0Var2 = new C20605h(this.f53201a, attributeSet);
                        } else if ("transitionSet".equals(name)) {
                            h0Var2 = new C20639m0(this.f53201a, attributeSet);
                        } else if (C0508a.f1295O0.equals(name)) {
                            h0Var2 = (C20606h0) mo61802a(attributeSet, C20606h0.class, C0508a.f1295O0);
                        } else if ("targets".equals(name)) {
                            mo61805e(xmlPullParser, attributeSet, h0Var);
                        } else if ("arcMotion".equals(name)) {
                            if (h0Var != null) {
                                h0Var.mo61725Q0(new C20537b(this.f53201a, attributeSet));
                            } else {
                                throw new RuntimeException("Invalid use of arcMotion element");
                            }
                        } else if ("pathMotion".equals(name)) {
                            if (h0Var != null) {
                                h0Var.mo61725Q0((C20684x) mo61802a(attributeSet, C20684x.class, "pathMotion"));
                            } else {
                                throw new RuntimeException("Invalid use of pathMotion element");
                            }
                        } else if (!"patternPathMotion".equals(name)) {
                            throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                        } else if (h0Var != null) {
                            h0Var.mo61725Q0(new C20689z(this.f53201a, attributeSet));
                        } else {
                            throw new RuntimeException("Invalid use of patternPathMotion element");
                        }
                        if (h0Var2 == null) {
                            continue;
                        } else {
                            if (!xmlPullParser.isEmptyElementTag()) {
                                mo61803b(xmlPullParser, attributeSet, h0Var2);
                            }
                            if (m0Var != null) {
                                break;
                            } else if (h0Var != null) {
                                throw new InflateException("Could not add transition to another transition.");
                            }
                        }
                    }
                }
            }
            m0Var.mo61835a1(h0Var2);
        }
        return h0Var2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        return r1;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.transition.C20629k0 mo61804c(org.xmlpull.v1.XmlPullParser r5, android.util.AttributeSet r6, android.view.ViewGroup r7) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r4 = this;
            int r0 = r5.getDepth()
            r1 = 0
        L_0x0005:
            int r2 = r5.next()
            r3 = 3
            if (r2 != r3) goto L_0x0012
            int r3 = r5.getDepth()
            if (r3 <= r0) goto L_0x0054
        L_0x0012:
            r3 = 1
            if (r2 == r3) goto L_0x0054
            r3 = 2
            if (r2 == r3) goto L_0x0019
            goto L_0x0005
        L_0x0019:
            java.lang.String r2 = r5.getName()
            java.lang.String r3 = "transitionManager"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x002b
            androidx.transition.k0 r1 = new androidx.transition.k0
            r1.<init>()
            goto L_0x0005
        L_0x002b:
            java.lang.String r3 = "transition"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x0039
            r4.mo61808h(r6, r5, r7, r1)
            goto L_0x0005
        L_0x0039:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Unknown scene name: "
            r7.append(r0)
            java.lang.String r5 = r5.getName()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        L_0x0054:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.C20623i0.mo61804c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.ViewGroup):androidx.transition.k0");
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: e */
    public final void mo61805e(XmlPullParser xmlPullParser, AttributeSet attributeSet, C20606h0 h0Var) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                if (xmlPullParser.getName().equals("target")) {
                    TypedArray obtainStyledAttributes = this.f53201a.obtainStyledAttributes(attributeSet, C20592g0.f53070a);
                    int l = C17483q.m80236l(obtainStyledAttributes, xmlPullParser, "targetId", 1, 0);
                    if (l != 0) {
                        h0Var.mo61739c(l);
                    } else {
                        int l2 = C17483q.m80236l(obtainStyledAttributes, xmlPullParser, "excludeId", 2, 0);
                        if (l2 != 0) {
                            h0Var.mo61710H(l2, true);
                        } else {
                            String m = C17483q.m80237m(obtainStyledAttributes, xmlPullParser, "targetName", 4);
                            if (m != null) {
                                h0Var.mo61747h(m);
                            } else {
                                String m2 = C17483q.m80237m(obtainStyledAttributes, xmlPullParser, "excludeName", 5);
                                if (m2 != null) {
                                    h0Var.mo61716K(m2, true);
                                } else {
                                    String m3 = C17483q.m80237m(obtainStyledAttributes, xmlPullParser, "excludeClass", 3);
                                    if (m3 != null) {
                                        try {
                                            h0Var.mo61714J(Class.forName(m3), true);
                                        } catch (ClassNotFoundException e) {
                                            obtainStyledAttributes.recycle();
                                            throw new RuntimeException("Could not create " + m3, e);
                                        }
                                    } else {
                                        String m4 = C17483q.m80237m(obtainStyledAttributes, xmlPullParser, "targetClass", 0);
                                        if (m4 != null) {
                                            h0Var.mo61745f(Class.forName(m4));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    obtainStyledAttributes.recycle();
                } else {
                    throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                }
            }
        }
    }

    /* renamed from: f */
    public C20606h0 mo61806f(int i) {
        XmlResourceParser xml = this.f53201a.getResources().getXml(i);
        try {
            C20606h0 b = mo61803b(xml, Xml.asAttributeSet(xml), (C20606h0) null);
            xml.close();
            return b;
        } catch (XmlPullParserException e) {
            throw new InflateException(e.getMessage(), e);
        } catch (IOException e2) {
            throw new InflateException(xml.getPositionDescription() + ": " + e2.getMessage(), e2);
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }

    /* renamed from: g */
    public C20629k0 mo61807g(int i, ViewGroup viewGroup) {
        XmlResourceParser xml = this.f53201a.getResources().getXml(i);
        try {
            C20629k0 c = mo61804c(xml, Xml.asAttributeSet(xml), viewGroup);
            xml.close();
            return c;
        } catch (XmlPullParserException e) {
            InflateException inflateException = new InflateException(e.getMessage());
            inflateException.initCause(e);
            throw inflateException;
        } catch (IOException e2) {
            InflateException inflateException2 = new InflateException(xml.getPositionDescription() + ": " + e2.getMessage());
            inflateException2.initCause(e2);
            throw inflateException2;
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: h */
    public final void mo61808h(AttributeSet attributeSet, XmlPullParser xmlPullParser, ViewGroup viewGroup, C20629k0 k0Var) throws Resources.NotFoundException {
        C20558d0 d0Var;
        C20606h0 f;
        TypedArray obtainStyledAttributes = this.f53201a.obtainStyledAttributes(attributeSet, C20592g0.f53071b);
        int l = C17483q.m80236l(obtainStyledAttributes, xmlPullParser, C0508a.f1295O0, 2, -1);
        int l2 = C17483q.m80236l(obtainStyledAttributes, xmlPullParser, "fromScene", 0, -1);
        C20558d0 d0Var2 = null;
        if (l2 < 0) {
            d0Var = null;
        } else {
            d0Var = C20558d0.m95701d(viewGroup, l2, this.f53201a);
        }
        int l3 = C17483q.m80236l(obtainStyledAttributes, xmlPullParser, "toScene", 1, -1);
        if (l3 >= 0) {
            d0Var2 = C20558d0.m95701d(viewGroup, l3, this.f53201a);
        }
        if (l >= 0 && (f = mo61806f(l)) != null) {
            if (d0Var2 == null) {
                throw new RuntimeException("No toScene for transition ID " + l);
            } else if (d0Var == null) {
                k0Var.mo61816l(d0Var2, f);
            } else {
                k0Var.mo61815k(d0Var, d0Var2, f);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
