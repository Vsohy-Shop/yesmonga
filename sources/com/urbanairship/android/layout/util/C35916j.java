package com.urbanairship.android.layout.util;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0379x;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.graphics.C17586h0;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.color.C31266s;
import com.google.android.material.shape.C31525j;
import com.google.android.material.shape.C31534o;
import com.urbanairship.C36058l;
import com.urbanairship.android.layout.C35625g;
import com.urbanairship.android.layout.model.BaseModel;
import com.urbanairship.android.layout.model.C35800g;
import com.urbanairship.android.layout.model.C35801h;
import com.urbanairship.android.layout.model.TextInputModel;
import com.urbanairship.android.layout.property.C35830c;
import com.urbanairship.android.layout.property.C35835f;
import com.urbanairship.android.layout.property.C35849p;
import com.urbanairship.android.layout.property.C35850q;
import com.urbanairship.android.layout.property.FormInputType;
import com.urbanairship.android.layout.property.TextStyle;
import com.urbanairship.android.layout.widget.C36008d;
import com.urbanairship.util.C9669o0;
import java.util.Iterator;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.android.layout.util.j */
public final class C35916j {

    /* renamed from: a */
    public static final float f88809a = 0.2f;

    /* renamed from: b */
    public static final int f88810b = 2;

    /* renamed from: c */
    public static final int f88811c = 0;

    /* renamed from: d */
    public static final float f88812d = 1.0f;

    /* renamed from: e */
    public static final float f88813e = 0.32f;

    /* renamed from: f */
    public static final float f88814f = 0.38f;

    /* renamed from: g */
    public static final String f88815g = " ";

    /* renamed from: h */
    public static final String f88816h = " ";

    /* renamed from: com.urbanairship.android.layout.util.j$a */
    public class C35917a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ Runnable f88817a;

        public C35917a(Runnable runnable) {
            this.f88817a = runnable;
        }

        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            this.f88817a.run();
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: com.urbanairship.android.layout.util.j$b */
    public static /* synthetic */ class C35918b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f88818a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f88819b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                com.urbanairship.android.layout.property.TextAlignment[] r0 = com.urbanairship.android.layout.property.TextAlignment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f88819b = r0
                r1 = 1
                com.urbanairship.android.layout.property.TextAlignment r2 = com.urbanairship.android.layout.property.TextAlignment.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f88819b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.urbanairship.android.layout.property.TextAlignment r3 = com.urbanairship.android.layout.property.TextAlignment.START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f88819b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.urbanairship.android.layout.property.TextAlignment r4 = com.urbanairship.android.layout.property.TextAlignment.END     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.urbanairship.android.layout.property.TextStyle[] r3 = com.urbanairship.android.layout.property.TextStyle.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f88818a = r3
                com.urbanairship.android.layout.property.TextStyle r4 = com.urbanairship.android.layout.property.TextStyle.BOLD     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f88818a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.urbanairship.android.layout.property.TextStyle r3 = com.urbanairship.android.layout.property.TextStyle.ITALIC     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f88818a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.urbanairship.android.layout.property.TextStyle r1 = com.urbanairship.android.layout.property.TextStyle.UNDERLINE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.util.C35916j.C35918b.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m148083a(@C0359n0 View view, int i) {
        m148084b(view, i, i, i, i);
    }

    /* renamed from: b */
    public static void m148084b(@C0359n0 View view, int i, int i2, int i3, int i4) {
        view.setPadding(view.getPaddingLeft() + i, view.getPaddingTop() + i2, view.getPaddingRight() + i3, view.getPaddingBottom() + i4);
    }

    /* renamed from: c */
    public static void m148085c(@C0359n0 View view, @C0359n0 BaseModel<?, ?> baseModel) {
        m148086d(view, baseModel.mo106995j(), baseModel.mo106994i());
    }

    /* renamed from: d */
    public static void m148086d(@C0359n0 View view, @C0363p0 C35830c cVar, @C0363p0 C35835f fVar) {
        float f;
        int i;
        Context context = view.getContext();
        if (cVar != null) {
            if (cVar.mo107334b() == null) {
                f = 0.0f;
            } else {
                f = C35921m.m148111a(context, cVar.mo107334b().intValue());
            }
            int i2 = 0;
            C31525j jVar = new C31525j(C31534o.m127561a().mo90846q(0, f).mo90843m());
            if (view instanceof C36008d) {
                ((C36008d) view).setClipPathBorderRadius(f);
            }
            if (cVar.mo107336d() != null) {
                float a = C35921m.m148111a(context, cVar.mo107336d().intValue());
                jVar.mo90727I0(a);
                i = (int) a;
            } else {
                i = -1;
            }
            if (cVar.mo107335c() != null) {
                jVar.mo90721F0(ColorStateList.valueOf(cVar.mo107335c().mo107342d(context)));
            }
            if (fVar != null) {
                i2 = fVar.mo107342d(context);
            }
            jVar.mo90777o0(ColorStateList.valueOf(i2));
            m148100r(view, jVar);
            if (i > -1) {
                m148083a(view, i);
            }
        } else if (fVar != null) {
            m148100r(view, new ColorDrawable(fVar.mo107342d(context)));
        }
    }

    /* renamed from: e */
    public static void m148087e(@C0359n0 MaterialButton materialButton, @C0359n0 C35800g gVar) {
        int i;
        int i2;
        int i3;
        int i4;
        m148088f(materialButton, gVar.mo107212a0());
        Context context = materialButton.getContext();
        int d = gVar.mo107212a0().mo107216M().mo107372c().mo107342d(context);
        if (gVar.mo106994i() == null) {
            i = 0;
        } else {
            i = gVar.mo106994i().mo107342d(materialButton.getContext());
        }
        int B = C17586h0.m80563B(d, Math.round(C35835f.m147755a(d) * 0.2f));
        int m = m148095m(i);
        if (gVar.mo106995j() == null || gVar.mo106995j().mo107336d() == null) {
            i2 = 2;
        } else {
            i2 = gVar.mo106995j().mo107336d().intValue();
        }
        if (gVar.mo106995j() == null || gVar.mo106995j().mo107335c() == null) {
            i3 = i;
        } else {
            i3 = gVar.mo106995j().mo107335c().mo107342d(context);
        }
        int m2 = m148095m(i3);
        if (gVar.mo106995j() == null || gVar.mo106995j().mo107334b() == null) {
            i4 = 0;
        } else {
            i4 = gVar.mo106995j().mo107334b().intValue();
        }
        materialButton.setBackgroundTintList(new C35907b().mo107549b(m, -16842910).mo107548a(i).mo107550c());
        materialButton.setRippleColor(ColorStateList.valueOf(B));
        int a = (int) C35921m.m148111a(context, i2);
        materialButton.setStrokeWidth(a);
        if (a > 0) {
            m148083a(materialButton, a);
        }
        materialButton.setStrokeColor(new C35907b().mo107549b(m2, -16842910).mo107548a(i3).mo107550c());
        materialButton.setCornerRadius((int) C35921m.m148111a(context, i4));
    }

    /* renamed from: f */
    public static void m148088f(@C0359n0 TextView textView, @C0359n0 C35801h hVar) {
        boolean z;
        C35850q M = hVar.mo107216M();
        String L = hVar.mo107215L();
        m148090h(textView, M);
        C36058l d = C36058l.m148401d(textView.getContext());
        Iterator<String> it = M.mo107373d().iterator();
        while (true) {
            if (it.hasNext()) {
                if (!d.mo107815c(it.next())) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        boolean contains = M.mo107375f().contains(TextStyle.ITALIC);
        if (z && contains) {
            L = L + f88815g;
        } else if (z || contains) {
            L = L + f88816h;
        }
        textView.setText(L);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: g */
    public static void m148089g(@C0359n0 SwitchCompat switchCompat, @C0359n0 C35849p pVar) {
        Context context = switchCompat.getContext();
        int d = pVar.mo107370e().mo107342d(context);
        int d2 = pVar.mo107369d().mo107342d(context);
        int m = C31266s.m125962m(-1, d, 0.32f);
        int m2 = C31266s.m125962m(-1, d2, 0.32f);
        switchCompat.setTrackTintList(m148092j(d, d2));
        switchCompat.setThumbTintList(m148092j(m, m2));
        switchCompat.setBackgroundResource(C35625g.C35632g.ua_layout_imagebutton_ripple);
        switchCompat.setGravity(17);
    }

    /* renamed from: h */
    public static void m148090h(@C0359n0 TextView textView, @C0359n0 C35850q qVar) {
        Context context = textView.getContext();
        textView.setTextSize((float) qVar.mo107374e());
        int d = qVar.mo107372c().mo107342d(context);
        int i = 0;
        int n = m148096n(0, d);
        textView.setTextColor(new C35907b().mo107549b(n, -16842910).mo107548a(d).mo107550c());
        int i2 = 129;
        for (TextStyle ordinal : qVar.mo107375f()) {
            int i3 = C35918b.f88818a[ordinal.ordinal()];
            if (i3 == 1) {
                i |= 1;
            } else if (i3 == 2) {
                i |= 2;
            } else if (i3 == 3) {
                i2 |= 8;
            }
        }
        int i4 = C35918b.f88819b[qVar.mo107371b().ordinal()];
        if (i4 == 1) {
            textView.setGravity(17);
        } else if (i4 == 2) {
            textView.setGravity(8388627);
        } else if (i4 == 3) {
            textView.setGravity(8388629);
        }
        textView.setTypeface(m148099q(textView.getContext(), qVar.mo107373d()), i);
        textView.setPaintFlags(i2);
    }

    /* renamed from: i */
    public static void m148091i(@C0359n0 AppCompatEditText appCompatEditText, @C0359n0 TextInputModel textInputModel) {
        boolean z;
        m148085c(appCompatEditText, textInputModel);
        m148090h(appCompatEditText, textInputModel.mo107155Q());
        int a = (int) C35921m.m148111a(appCompatEditText.getContext(), 8);
        appCompatEditText.setPadding(a, a, a, a);
        appCompatEditText.setInputType(textInputModel.mo107154P().mo107272g());
        if (textInputModel.mo107154P() != FormInputType.TEXT_MULTILINE) {
            z = true;
        } else {
            z = false;
        }
        appCompatEditText.setSingleLine(z);
        appCompatEditText.setGravity(appCompatEditText.getGravity() | 48);
        if (!C9669o0.m36224e(textInputModel.mo107152N())) {
            appCompatEditText.setHint(textInputModel.mo107152N());
            C35835f h = textInputModel.mo107155Q().mo107376h();
            if (h != null) {
                appCompatEditText.setHintTextColor(h.mo107342d(appCompatEditText.getContext()));
            }
        }
        if (!C9669o0.m36224e(textInputModel.mo107151M())) {
            appCompatEditText.setContentDescription(textInputModel.mo107151M());
        }
    }

    /* renamed from: j */
    public static ColorStateList m148092j(@C0354l int i, @C0354l int i2) {
        return new C35907b().mo107549b(i, 16842912).mo107548a(i2).mo107550c();
    }

    /* renamed from: k */
    public static void m148093k(@C0359n0 View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* renamed from: l */
    public static void m148094l(@C0359n0 View view, @C0359n0 Runnable runnable) {
        view.addOnAttachStateChangeListener(new C35917a(runnable));
    }

    @C0354l
    /* renamed from: m */
    public static int m148095m(@C0354l int i) {
        return m148096n(i, -1);
    }

    @C0354l
    /* renamed from: n */
    public static int m148096n(@C0354l int i, @C0354l int i2) {
        return m148101s(i, i2, 0.38f);
    }

    @C0354l
    /* renamed from: o */
    public static int m148097o(@C0354l int i) {
        return m148098p(i, -1);
    }

    @C0354l
    /* renamed from: p */
    public static int m148098p(@C0354l int i, @C0354l int i2) {
        return m148101s(i, i2, 0.2f);
    }

    @C0363p0
    /* renamed from: q */
    public static Typeface m148099q(@C0359n0 Context context, @C0359n0 List<String> list) {
        Typeface b;
        for (String next : list) {
            if (!C9669o0.m36224e(next) && (b = C36058l.m148401d(context).mo107814b(next)) != null) {
                return b;
            }
        }
        return null;
    }

    /* renamed from: r */
    public static void m148100r(@C0359n0 View view, @C0359n0 Drawable drawable) {
        if (view.getBackground() != null) {
            drawable = new LayerDrawable(new Drawable[]{view.getBackground(), drawable});
        }
        view.setBackground(drawable);
    }

    @C0354l
    /* renamed from: s */
    public static int m148101s(@C0354l int i, @C0354l int i2, @C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        return C17586h0.m80583t(C17586h0.m80563B(i2, Math.round(C35835f.m147755a(i2) * f)), i);
    }
}
