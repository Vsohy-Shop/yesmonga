package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.C0387a;
import androidx.appcompat.view.C0538d;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.appcompat.widget.C0712e1;
import androidx.collection.C1886l;
import androidx.core.view.C18196h2;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.actions.C35491d;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.app.s */
public class C0494s {

    /* renamed from: b */
    public static final Class<?>[] f1259b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    public static final int[] f1260c = {16843375};

    /* renamed from: d */
    public static final int[] f1261d = {16844160};

    /* renamed from: e */
    public static final int[] f1262e = {16844156};

    /* renamed from: f */
    public static final int[] f1263f = {16844148};

    /* renamed from: g */
    public static final String[] f1264g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h */
    public static final String f1265h = "AppCompatViewInflater";

    /* renamed from: i */
    public static final C1886l<String, Constructor<? extends View>> f1266i = new C1886l<>();

    /* renamed from: a */
    public final Object[] f1267a = new Object[2];

    /* renamed from: androidx.appcompat.app.s$a */
    public static class C0495a implements View.OnClickListener {

        /* renamed from: a */
        public final View f1268a;

        /* renamed from: b */
        public final String f1269b;

        /* renamed from: c */
        public Method f1270c;

        /* renamed from: d */
        public Context f1271d;

        public C0495a(@C0359n0 View view, @C0359n0 String str) {
            this.f1268a = view;
            this.f1269b = str;
        }

        /* renamed from: a */
        public final void mo1553a(@C0363p0 Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f1269b, new Class[]{View.class})) != null) {
                        this.f1270c = method;
                        this.f1271d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    context = null;
                }
            }
            int id = this.f1268a.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f1268a.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f1269b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f1268a.getClass() + str);
        }

        public void onClick(@C0359n0 View view) {
            if (this.f1270c == null) {
                mo1553a(this.f1268a.getContext());
            }
            try {
                this.f1270c.invoke(this.f1271d, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* renamed from: u */
    public static Context m2301u(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        int i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0387a.C0400m.View, 0, 0);
        if (z) {
            i = obtainStyledAttributes.getResourceId(C0387a.C0400m.View_android_theme, 0);
        } else {
            i = 0;
        }
        if (z2 && i == 0) {
            i = obtainStyledAttributes.getResourceId(C0387a.C0400m.View_theme, 0);
        }
        obtainStyledAttributes.recycle();
        if (i == 0) {
            return context;
        }
        if (!(context instanceof C0538d) || ((C0538d) context).mo1762c() != i) {
            return new C0538d(context, i);
        }
        return context;
    }

    /* renamed from: a */
    public final void mo1532a(@C0359n0 Context context, @C0359n0 View view, @C0359n0 AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT <= 28) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1261d);
            if (obtainStyledAttributes.hasValue(0)) {
                C18196h2.m82478C1(view, obtainStyledAttributes.getBoolean(0, false));
            }
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f1262e);
            if (obtainStyledAttributes2.hasValue(0)) {
                C18196h2.m82486E1(view, obtainStyledAttributes2.getString(0));
            }
            obtainStyledAttributes2.recycle();
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f1263f);
            if (obtainStyledAttributes3.hasValue(0)) {
                C18196h2.m82611n2(view, obtainStyledAttributes3.getBoolean(0, false));
            }
            obtainStyledAttributes3.recycle();
        }
    }

    /* renamed from: b */
    public final void mo1533b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && C18196h2.m82509K0(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1260c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new C0495a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    @C0359n0
    /* renamed from: c */
    public AppCompatAutoCompleteTextView mo1534c(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    @C0359n0
    /* renamed from: d */
    public AppCompatButton mo1535d(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    @C0359n0
    /* renamed from: e */
    public AppCompatCheckBox mo1536e(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    @C0359n0
    /* renamed from: f */
    public AppCompatCheckedTextView mo1537f(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckedTextView(context, attributeSet);
    }

    @C0359n0
    /* renamed from: g */
    public AppCompatEditText mo1538g(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    @C0359n0
    /* renamed from: h */
    public AppCompatImageButton mo1539h(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    @C0359n0
    /* renamed from: i */
    public AppCompatImageView mo1540i(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    @C0359n0
    /* renamed from: j */
    public AppCompatMultiAutoCompleteTextView mo1541j(Context context, AttributeSet attributeSet) {
        return new AppCompatMultiAutoCompleteTextView(context, attributeSet);
    }

    @C0359n0
    /* renamed from: k */
    public AppCompatRadioButton mo1542k(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    @C0359n0
    /* renamed from: l */
    public AppCompatRatingBar mo1543l(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    @C0359n0
    /* renamed from: m */
    public AppCompatSeekBar mo1544m(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    @C0359n0
    /* renamed from: n */
    public AppCompatSpinner mo1545n(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    @C0359n0
    /* renamed from: o */
    public AppCompatTextView mo1546o(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    @C0359n0
    /* renamed from: p */
    public AppCompatToggleButton mo1547p(Context context, AttributeSet attributeSet) {
        return new AppCompatToggleButton(context, attributeSet);
    }

    @C0363p0
    /* renamed from: q */
    public View mo1548q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    @C0363p0
    /* renamed from: r */
    public final View mo1549r(@C0363p0 View view, @C0359n0 String str, @C0359n0 Context context, @C0359n0 AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        Context context2;
        View view2;
        if (!z || view == null) {
            context2 = context;
        } else {
            context2 = view.getContext();
        }
        if (z2 || z3) {
            context2 = m2301u(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C0712e1.m3494b(context2);
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = 8;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 9;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = 10;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 12;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 13;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = mo1543l(context2, attributeSet);
                mo1552v(view2, str);
                break;
            case 1:
                view2 = mo1537f(context2, attributeSet);
                mo1552v(view2, str);
                break;
            case 2:
                view2 = mo1541j(context2, attributeSet);
                mo1552v(view2, str);
                break;
            case 3:
                view2 = mo1546o(context2, attributeSet);
                mo1552v(view2, str);
                break;
            case 4:
                view2 = mo1539h(context2, attributeSet);
                mo1552v(view2, str);
                break;
            case 5:
                view2 = mo1544m(context2, attributeSet);
                mo1552v(view2, str);
                break;
            case 6:
                view2 = mo1545n(context2, attributeSet);
                mo1552v(view2, str);
                break;
            case 7:
                view2 = mo1542k(context2, attributeSet);
                mo1552v(view2, str);
                break;
            case 8:
                view2 = mo1547p(context2, attributeSet);
                mo1552v(view2, str);
                break;
            case 9:
                view2 = mo1540i(context2, attributeSet);
                mo1552v(view2, str);
                break;
            case 10:
                view2 = mo1534c(context2, attributeSet);
                mo1552v(view2, str);
                break;
            case 11:
                view2 = mo1536e(context2, attributeSet);
                mo1552v(view2, str);
                break;
            case 12:
                view2 = mo1538g(context2, attributeSet);
                mo1552v(view2, str);
                break;
            case 13:
                view2 = mo1535d(context2, attributeSet);
                mo1552v(view2, str);
                break;
            default:
                view2 = mo1548q(context2, str, attributeSet);
                break;
        }
        if (view2 == null && context != context2) {
            view2 = mo1551t(context2, str, attributeSet);
        }
        if (view2 != null) {
            mo1533b(view2, attributeSet);
            mo1532a(context2, view2, attributeSet);
        }
        return view2;
    }

    /* renamed from: s */
    public final View mo1550s(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        C1886l<String, Constructor<? extends View>> lVar = f1266i;
        Constructor<? extends U> constructor = lVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f1259b);
            lVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f1267a);
    }

    /* renamed from: t */
    public final View mo1551t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals(C40383c.f102945c)) {
            str = attributeSet.getAttributeValue((String) null, C35491d.f87525c);
        }
        try {
            Object[] objArr = this.f1267a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                int i = 0;
                while (true) {
                    String[] strArr = f1264g;
                    if (i < strArr.length) {
                        View s = mo1550s(context, str, strArr[i]);
                        if (s != null) {
                            return s;
                        }
                        i++;
                    } else {
                        Object[] objArr2 = this.f1267a;
                        objArr2[0] = null;
                        objArr2[1] = null;
                        return null;
                    }
                }
            } else {
                View s2 = mo1550s(context, str, (String) null);
                Object[] objArr3 = this.f1267a;
                objArr3[0] = null;
                objArr3[1] = null;
                return s2;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr4 = this.f1267a;
            objArr4[0] = null;
            objArr4[1] = null;
        }
    }

    /* renamed from: v */
    public final void mo1552v(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }
}
