package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.C0347i0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.appcompat.view.menu.C0573j;
import androidx.appcompat.view.menu.C0575k;
import androidx.appcompat.widget.C0722h1;
import androidx.appcompat.widget.C0725i0;
import androidx.core.internal.view.C17673a;
import androidx.core.view.C18119b;
import androidx.core.view.C18420y0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.g */
public class C0543g extends MenuInflater {

    /* renamed from: e */
    public static final String f1414e = "SupportMenuInflater";

    /* renamed from: f */
    public static final String f1415f = "menu";

    /* renamed from: g */
    public static final String f1416g = "group";

    /* renamed from: h */
    public static final String f1417h = "item";

    /* renamed from: i */
    public static final int f1418i = 0;

    /* renamed from: j */
    public static final Class<?>[] f1419j;

    /* renamed from: k */
    public static final Class<?>[] f1420k;

    /* renamed from: a */
    public final Object[] f1421a;

    /* renamed from: b */
    public final Object[] f1422b;

    /* renamed from: c */
    public Context f1423c;

    /* renamed from: d */
    public Object f1424d;

    /* renamed from: androidx.appcompat.view.g$a */
    public static class C0544a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        public static final Class<?>[] f1425c = {MenuItem.class};

        /* renamed from: a */
        public Object f1426a;

        /* renamed from: b */
        public Method f1427b;

        public C0544a(Object obj, String str) {
            this.f1426a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f1427b = cls.getMethod(str, f1425c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f1427b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f1427b.invoke(this.f1426a, new Object[]{menuItem})).booleanValue();
                }
                this.f1427b.invoke(this.f1426a, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: androidx.appcompat.view.g$b */
    public class C0545b {

        /* renamed from: G */
        public static final int f1428G = 0;

        /* renamed from: H */
        public static final int f1429H = 0;

        /* renamed from: I */
        public static final int f1430I = 0;

        /* renamed from: J */
        public static final int f1431J = 0;

        /* renamed from: K */
        public static final int f1432K = 0;

        /* renamed from: L */
        public static final boolean f1433L = false;

        /* renamed from: M */
        public static final boolean f1434M = true;

        /* renamed from: N */
        public static final boolean f1435N = true;

        /* renamed from: A */
        public C18119b f1436A;

        /* renamed from: B */
        public CharSequence f1437B;

        /* renamed from: C */
        public CharSequence f1438C;

        /* renamed from: D */
        public ColorStateList f1439D = null;

        /* renamed from: E */
        public PorterDuff.Mode f1440E = null;

        /* renamed from: a */
        public Menu f1442a;

        /* renamed from: b */
        public int f1443b;

        /* renamed from: c */
        public int f1444c;

        /* renamed from: d */
        public int f1445d;

        /* renamed from: e */
        public int f1446e;

        /* renamed from: f */
        public boolean f1447f;

        /* renamed from: g */
        public boolean f1448g;

        /* renamed from: h */
        public boolean f1449h;

        /* renamed from: i */
        public int f1450i;

        /* renamed from: j */
        public int f1451j;

        /* renamed from: k */
        public CharSequence f1452k;

        /* renamed from: l */
        public CharSequence f1453l;

        /* renamed from: m */
        public int f1454m;

        /* renamed from: n */
        public char f1455n;

        /* renamed from: o */
        public int f1456o;

        /* renamed from: p */
        public char f1457p;

        /* renamed from: q */
        public int f1458q;

        /* renamed from: r */
        public int f1459r;

        /* renamed from: s */
        public boolean f1460s;

        /* renamed from: t */
        public boolean f1461t;

        /* renamed from: u */
        public boolean f1462u;

        /* renamed from: v */
        public int f1463v;

        /* renamed from: w */
        public int f1464w;

        /* renamed from: x */
        public String f1465x;

        /* renamed from: y */
        public String f1466y;

        /* renamed from: z */
        public String f1467z;

        public C0545b(Menu menu) {
            this.f1442a = menu;
            mo1804h();
        }

        /* renamed from: a */
        public void mo1797a() {
            this.f1449h = true;
            mo1805i(this.f1442a.add(this.f1443b, this.f1450i, this.f1451j, this.f1452k));
        }

        /* renamed from: b */
        public SubMenu mo1798b() {
            this.f1449h = true;
            SubMenu addSubMenu = this.f1442a.addSubMenu(this.f1443b, this.f1450i, this.f1451j, this.f1452k);
            mo1805i(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: c */
        public final char mo1799c(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        /* renamed from: d */
        public boolean mo1800d() {
            return this.f1449h;
        }

        /* renamed from: e */
        public final <T> T mo1801e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C0543g.this.f1423c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot instantiate class: ");
                sb.append(str);
                return null;
            }
        }

        /* renamed from: f */
        public void mo1802f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0543g.this.f1423c.obtainStyledAttributes(attributeSet, C0387a.C0400m.MenuGroup);
            this.f1443b = obtainStyledAttributes.getResourceId(C0387a.C0400m.MenuGroup_android_id, 0);
            this.f1444c = obtainStyledAttributes.getInt(C0387a.C0400m.MenuGroup_android_menuCategory, 0);
            this.f1445d = obtainStyledAttributes.getInt(C0387a.C0400m.MenuGroup_android_orderInCategory, 0);
            this.f1446e = obtainStyledAttributes.getInt(C0387a.C0400m.MenuGroup_android_checkableBehavior, 0);
            this.f1447f = obtainStyledAttributes.getBoolean(C0387a.C0400m.MenuGroup_android_visible, true);
            this.f1448g = obtainStyledAttributes.getBoolean(C0387a.C0400m.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: g */
        public void mo1803g(AttributeSet attributeSet) {
            boolean z;
            C0722h1 F = C0722h1.m3538F(C0543g.this.f1423c, attributeSet, C0387a.C0400m.MenuItem);
            this.f1450i = F.mo3479u(C0387a.C0400m.MenuItem_android_id, 0);
            this.f1451j = (F.mo3473o(C0387a.C0400m.MenuItem_android_menuCategory, this.f1444c) & C17673a.f46025c) | (F.mo3473o(C0387a.C0400m.MenuItem_android_orderInCategory, this.f1445d) & 65535);
            this.f1452k = F.mo3482x(C0387a.C0400m.MenuItem_android_title);
            this.f1453l = F.mo3482x(C0387a.C0400m.MenuItem_android_titleCondensed);
            this.f1454m = F.mo3479u(C0387a.C0400m.MenuItem_android_icon, 0);
            this.f1455n = mo1799c(F.mo3481w(C0387a.C0400m.MenuItem_android_alphabeticShortcut));
            this.f1456o = F.mo3473o(C0387a.C0400m.MenuItem_alphabeticModifiers, 4096);
            this.f1457p = mo1799c(F.mo3481w(C0387a.C0400m.MenuItem_android_numericShortcut));
            this.f1458q = F.mo3473o(C0387a.C0400m.MenuItem_numericModifiers, 4096);
            int i = C0387a.C0400m.MenuItem_android_checkable;
            if (F.mo3455C(i)) {
                this.f1459r = F.mo3459a(i, false) ? 1 : 0;
            } else {
                this.f1459r = this.f1446e;
            }
            this.f1460s = F.mo3459a(C0387a.C0400m.MenuItem_android_checked, false);
            this.f1461t = F.mo3459a(C0387a.C0400m.MenuItem_android_visible, this.f1447f);
            this.f1462u = F.mo3459a(C0387a.C0400m.MenuItem_android_enabled, this.f1448g);
            this.f1463v = F.mo3473o(C0387a.C0400m.MenuItem_showAsAction, -1);
            this.f1467z = F.mo3481w(C0387a.C0400m.MenuItem_android_onClick);
            this.f1464w = F.mo3479u(C0387a.C0400m.MenuItem_actionLayout, 0);
            this.f1465x = F.mo3481w(C0387a.C0400m.MenuItem_actionViewClass);
            String w = F.mo3481w(C0387a.C0400m.MenuItem_actionProviderClass);
            this.f1466y = w;
            if (w != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && this.f1464w == 0 && this.f1465x == null) {
                this.f1436A = (C18119b) mo1801e(w, C0543g.f1420k, C0543g.this.f1422b);
            } else {
                this.f1436A = null;
            }
            this.f1437B = F.mo3482x(C0387a.C0400m.MenuItem_contentDescription);
            this.f1438C = F.mo3482x(C0387a.C0400m.MenuItem_tooltipText);
            int i2 = C0387a.C0400m.MenuItem_iconTintMode;
            if (F.mo3455C(i2)) {
                this.f1440E = C0725i0.m3584e(F.mo3473o(i2, -1), this.f1440E);
            } else {
                this.f1440E = null;
            }
            int i3 = C0387a.C0400m.MenuItem_iconTint;
            if (F.mo3455C(i3)) {
                this.f1439D = F.mo3462d(i3);
            } else {
                this.f1439D = null;
            }
            F.mo3458I();
            this.f1449h = false;
        }

        /* renamed from: h */
        public void mo1804h() {
            this.f1443b = 0;
            this.f1444c = 0;
            this.f1445d = 0;
            this.f1446e = 0;
            this.f1447f = true;
            this.f1448g = true;
        }

        /* renamed from: i */
        public final void mo1805i(MenuItem menuItem) {
            boolean z;
            MenuItem enabled = menuItem.setChecked(this.f1460s).setVisible(this.f1461t).setEnabled(this.f1462u);
            boolean z2 = false;
            if (this.f1459r >= 1) {
                z = true;
            } else {
                z = false;
            }
            enabled.setCheckable(z).setTitleCondensed(this.f1453l).setIcon(this.f1454m);
            int i = this.f1463v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f1467z != null) {
                if (!C0543g.this.f1423c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new C0544a(C0543g.this.mo1793b(), this.f1467z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f1459r >= 2) {
                if (menuItem instanceof C0573j) {
                    ((C0573j) menuItem).mo2167w(true);
                } else if (menuItem instanceof C0575k) {
                    ((C0575k) menuItem).mo2199j(true);
                }
            }
            String str = this.f1465x;
            if (str != null) {
                menuItem.setActionView((View) mo1801e(str, C0543g.f1419j, C0543g.this.f1421a));
                z2 = true;
            }
            int i2 = this.f1464w;
            if (i2 > 0 && !z2) {
                menuItem.setActionView(i2);
            }
            C18119b bVar = this.f1436A;
            if (bVar != null) {
                C18420y0.m83307l(menuItem, bVar);
            }
            C18420y0.m83311p(menuItem, this.f1437B);
            C18420y0.m83318w(menuItem, this.f1438C);
            C18420y0.m83310o(menuItem, this.f1455n, this.f1456o);
            C18420y0.m83314s(menuItem, this.f1457p, this.f1458q);
            PorterDuff.Mode mode = this.f1440E;
            if (mode != null) {
                C18420y0.m83313r(menuItem, mode);
            }
            ColorStateList colorStateList = this.f1439D;
            if (colorStateList != null) {
                C18420y0.m83312q(menuItem, colorStateList);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            f1419j = r0
            f1420k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.C0543g.<clinit>():void");
    }

    public C0543g(Context context) {
        super(context);
        this.f1423c = context;
        Object[] objArr = {context};
        this.f1421a = objArr;
        this.f1422b = objArr;
    }

    /* renamed from: a */
    public final Object mo1792a(Object obj) {
        if (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
            return mo1792a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    /* renamed from: b */
    public Object mo1793b() {
        if (this.f1424d == null) {
            this.f1424d = mo1792a(this.f1423c);
        }
        return this.f1424d;
    }

    /* renamed from: c */
    public final void mo1794c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        C0545b bVar = new C0545b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals(f1415f)) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            z2 = false;
                            str = null;
                        } else if (name2.equals("group")) {
                            bVar.mo1804h();
                        } else if (name2.equals("item")) {
                            if (!bVar.mo1800d()) {
                                C18119b bVar2 = bVar.f1436A;
                                if (bVar2 == null || !bVar2.mo2227b()) {
                                    bVar.mo1797a();
                                } else {
                                    bVar.mo1798b();
                                }
                            }
                        } else if (name2.equals(f1415f)) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.mo1802f(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.mo1803g(attributeSet);
                    } else if (name3.equals(f1415f)) {
                        mo1794c(xmlPullParser, attributeSet, bVar.mo1798b());
                    } else {
                        str = name3;
                        z2 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public void inflate(@C0347i0 int i, Menu menu) {
        if (!(menu instanceof C17673a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f1423c.getResources().getLayout(i);
            mo1794c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e) {
            throw new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
