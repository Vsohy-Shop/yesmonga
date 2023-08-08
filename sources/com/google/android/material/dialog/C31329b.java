package com.google.android.material.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.annotation.C0324b1;
import androidx.annotation.C0327c1;
import androidx.annotation.C0331e;
import androidx.annotation.C0336f;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0366r;
import androidx.annotation.C0372t0;
import androidx.annotation.C0375v;
import androidx.appcompat.app.C0467d;
import androidx.appcompat.view.C0538d;
import androidx.core.view.C18196h2;
import com.google.android.material.C31076a;
import com.google.android.material.color.C31266s;
import com.google.android.material.resources.C31499b;
import com.google.android.material.shape.C31525j;
import com.google.android.material.theme.overlay.C31683a;

/* renamed from: com.google.android.material.dialog.b */
public class C31329b extends C0467d.C0468a {
    @C0336f

    /* renamed from: e */
    public static final int f75504e = C31076a.C31079c.alertDialogStyle;
    @C0327c1

    /* renamed from: f */
    public static final int f75505f = C31076a.C31090n.MaterialAlertDialog_MaterialComponents;
    @C0336f

    /* renamed from: g */
    public static final int f75506g = C31076a.C31079c.materialAlertDialogTheme;
    @C0363p0

    /* renamed from: c */
    public Drawable f75507c;
    @C0366r
    @C0359n0

    /* renamed from: d */
    public final Rect f75508d;

    public C31329b(@C0359n0 Context context) {
        this(context, 0);
    }

    /* renamed from: P */
    public static Context m126286P(@C0359n0 Context context) {
        int R = m126287R(context);
        Context c = C31683a.m128455c(context, (AttributeSet) null, f75504e, f75505f);
        if (R == 0) {
            return c;
        }
        return new C0538d(c, R);
    }

    /* renamed from: R */
    public static int m126287R(@C0359n0 Context context) {
        TypedValue a = C31499b.m127355a(context, f75506g);
        if (a == null) {
            return 0;
        }
        return a.data;
    }

    /* renamed from: S */
    public static int m126288S(@C0359n0 Context context, int i) {
        return i == 0 ? m126287R(context) : i;
    }

    @C0359n0
    /* renamed from: A0 */
    public C31329b mo1394G(@C0363p0 Cursor cursor, int i, @C0359n0 String str, @C0363p0 DialogInterface.OnClickListener onClickListener) {
        return (C31329b) super.mo1394G(cursor, i, str, onClickListener);
    }

    @C0359n0
    /* renamed from: B0 */
    public C31329b mo1395H(@C0363p0 ListAdapter listAdapter, int i, @C0363p0 DialogInterface.OnClickListener onClickListener) {
        return (C31329b) super.mo1395H(listAdapter, i, onClickListener);
    }

    @C0359n0
    /* renamed from: C0 */
    public C31329b mo1396I(@C0363p0 CharSequence[] charSequenceArr, int i, @C0363p0 DialogInterface.OnClickListener onClickListener) {
        return (C31329b) super.mo1396I(charSequenceArr, i, onClickListener);
    }

    @C0359n0
    /* renamed from: D0 */
    public C31329b mo1397J(@C0324b1 int i) {
        return (C31329b) super.mo1397J(i);
    }

    @C0359n0
    /* renamed from: E0 */
    public C31329b mo1398K(@C0363p0 CharSequence charSequence) {
        return (C31329b) super.mo1398K(charSequence);
    }

    @C0359n0
    /* renamed from: F0 */
    public C31329b mo1399L(int i) {
        return (C31329b) super.mo1399L(i);
    }

    @C0359n0
    /* renamed from: G0 */
    public C31329b mo1400M(@C0363p0 View view) {
        return (C31329b) super.mo1400M(view);
    }

    @C0363p0
    /* renamed from: Q */
    public Drawable mo89478Q() {
        return this.f75507c;
    }

    @C0359n0
    /* renamed from: T */
    public C31329b mo1405c(@C0363p0 ListAdapter listAdapter, @C0363p0 DialogInterface.OnClickListener onClickListener) {
        return (C31329b) super.mo1405c(listAdapter, onClickListener);
    }

    @C0359n0
    /* renamed from: U */
    public C31329b mo89480U(@C0363p0 Drawable drawable) {
        this.f75507c = drawable;
        return this;
    }

    @C0359n0
    /* renamed from: V */
    public C31329b mo89481V(@C0372t0 int i) {
        this.f75508d.bottom = i;
        return this;
    }

    @C0359n0
    /* renamed from: W */
    public C31329b mo89482W(@C0372t0 int i) {
        if (mo1404b().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.f75508d.left = i;
        } else {
            this.f75508d.right = i;
        }
        return this;
    }

    @C0359n0
    /* renamed from: X */
    public C31329b mo89483X(@C0372t0 int i) {
        if (mo1404b().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.f75508d.right = i;
        } else {
            this.f75508d.left = i;
        }
        return this;
    }

    @C0359n0
    /* renamed from: Y */
    public C31329b mo89484Y(@C0372t0 int i) {
        this.f75508d.top = i;
        return this;
    }

    @C0359n0
    /* renamed from: Z */
    public C31329b mo1406d(boolean z) {
        return (C31329b) super.mo1406d(z);
    }

    @C0359n0
    /* renamed from: a */
    public C0467d mo1403a() {
        C0467d a = super.mo1403a();
        Window window = a.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.f75507c;
        if (drawable instanceof C31525j) {
            ((C31525j) drawable).mo90775n0(C18196h2.m82529R(decorView));
        }
        window.setBackgroundDrawable(C31330c.m126367b(this.f75507c, this.f75508d));
        decorView.setOnTouchListener(new C31328a(a, this.f75508d));
        return a;
    }

    @C0359n0
    /* renamed from: a0 */
    public C31329b mo1407e(@C0363p0 Cursor cursor, @C0363p0 DialogInterface.OnClickListener onClickListener, @C0359n0 String str) {
        return (C31329b) super.mo1407e(cursor, onClickListener, str);
    }

    @C0359n0
    /* renamed from: b0 */
    public C31329b mo1408f(@C0363p0 View view) {
        return (C31329b) super.mo1408f(view);
    }

    @C0359n0
    /* renamed from: c0 */
    public C31329b mo1409g(@C0375v int i) {
        return (C31329b) super.mo1409g(i);
    }

    @C0359n0
    /* renamed from: d0 */
    public C31329b mo1410h(@C0363p0 Drawable drawable) {
        return (C31329b) super.mo1410h(drawable);
    }

    @C0359n0
    /* renamed from: e0 */
    public C31329b mo1411i(@C0336f int i) {
        return (C31329b) super.mo1411i(i);
    }

    @C0359n0
    /* renamed from: f0 */
    public C31329b mo1413k(@C0331e int i, @C0363p0 DialogInterface.OnClickListener onClickListener) {
        return (C31329b) super.mo1413k(i, onClickListener);
    }

    @C0359n0
    /* renamed from: g0 */
    public C31329b mo1414l(@C0363p0 CharSequence[] charSequenceArr, @C0363p0 DialogInterface.OnClickListener onClickListener) {
        return (C31329b) super.mo1414l(charSequenceArr, onClickListener);
    }

    @C0359n0
    /* renamed from: h0 */
    public C31329b mo1415m(@C0324b1 int i) {
        return (C31329b) super.mo1415m(i);
    }

    @C0359n0
    /* renamed from: i0 */
    public C31329b mo1416n(@C0363p0 CharSequence charSequence) {
        return (C31329b) super.mo1416n(charSequence);
    }

    @C0359n0
    /* renamed from: j0 */
    public C31329b mo1417o(@C0331e int i, @C0363p0 boolean[] zArr, @C0363p0 DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (C31329b) super.mo1417o(i, zArr, onMultiChoiceClickListener);
    }

    @C0359n0
    /* renamed from: k0 */
    public C31329b mo1418p(@C0363p0 Cursor cursor, @C0359n0 String str, @C0359n0 String str2, @C0363p0 DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (C31329b) super.mo1418p(cursor, str, str2, onMultiChoiceClickListener);
    }

    @C0359n0
    /* renamed from: l0 */
    public C31329b mo1419q(@C0363p0 CharSequence[] charSequenceArr, @C0363p0 boolean[] zArr, @C0363p0 DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (C31329b) super.mo1419q(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    @C0359n0
    /* renamed from: m0 */
    public C31329b mo1420r(@C0324b1 int i, @C0363p0 DialogInterface.OnClickListener onClickListener) {
        return (C31329b) super.mo1420r(i, onClickListener);
    }

    @C0359n0
    /* renamed from: n0 */
    public C31329b mo1421s(@C0363p0 CharSequence charSequence, @C0363p0 DialogInterface.OnClickListener onClickListener) {
        return (C31329b) super.mo1421s(charSequence, onClickListener);
    }

    @C0359n0
    /* renamed from: o0 */
    public C31329b mo1422t(@C0363p0 Drawable drawable) {
        return (C31329b) super.mo1422t(drawable);
    }

    @C0359n0
    /* renamed from: p0 */
    public C31329b mo1423u(@C0324b1 int i, @C0363p0 DialogInterface.OnClickListener onClickListener) {
        return (C31329b) super.mo1423u(i, onClickListener);
    }

    @C0359n0
    /* renamed from: q0 */
    public C31329b mo1424v(@C0363p0 CharSequence charSequence, @C0363p0 DialogInterface.OnClickListener onClickListener) {
        return (C31329b) super.mo1424v(charSequence, onClickListener);
    }

    @C0359n0
    /* renamed from: r0 */
    public C31329b mo1425w(@C0363p0 Drawable drawable) {
        return (C31329b) super.mo1425w(drawable);
    }

    @C0359n0
    /* renamed from: s0 */
    public C31329b mo1426x(@C0363p0 DialogInterface.OnCancelListener onCancelListener) {
        return (C31329b) super.mo1426x(onCancelListener);
    }

    @C0359n0
    /* renamed from: t0 */
    public C31329b mo1427y(@C0363p0 DialogInterface.OnDismissListener onDismissListener) {
        return (C31329b) super.mo1427y(onDismissListener);
    }

    @C0359n0
    /* renamed from: u0 */
    public C31329b mo1428z(@C0363p0 AdapterView.OnItemSelectedListener onItemSelectedListener) {
        return (C31329b) super.mo1428z(onItemSelectedListener);
    }

    @C0359n0
    /* renamed from: v0 */
    public C31329b mo1388A(@C0363p0 DialogInterface.OnKeyListener onKeyListener) {
        return (C31329b) super.mo1388A(onKeyListener);
    }

    @C0359n0
    /* renamed from: w0 */
    public C31329b mo1389B(@C0324b1 int i, @C0363p0 DialogInterface.OnClickListener onClickListener) {
        return (C31329b) super.mo1389B(i, onClickListener);
    }

    @C0359n0
    /* renamed from: x0 */
    public C31329b mo1390C(@C0363p0 CharSequence charSequence, @C0363p0 DialogInterface.OnClickListener onClickListener) {
        return (C31329b) super.mo1390C(charSequence, onClickListener);
    }

    @C0359n0
    /* renamed from: y0 */
    public C31329b mo1391D(@C0363p0 Drawable drawable) {
        return (C31329b) super.mo1391D(drawable);
    }

    @C0359n0
    /* renamed from: z0 */
    public C31329b mo1393F(@C0331e int i, int i2, @C0363p0 DialogInterface.OnClickListener onClickListener) {
        return (C31329b) super.mo1393F(i, i2, onClickListener);
    }

    public C31329b(@C0359n0 Context context, int i) {
        super(m126286P(context), m126288S(context, i));
        Context b = mo1404b();
        Resources.Theme theme = b.getTheme();
        int i2 = f75504e;
        int i3 = f75505f;
        this.f75508d = C31330c.m126366a(b, i2, i3);
        int c = C31266s.m125952c(b, C31076a.C31079c.colorSurface, getClass().getCanonicalName());
        C31525j jVar = new C31525j(b, (AttributeSet) null, i2, i3);
        jVar.mo90750Z(b);
        jVar.mo90777o0(ColorStateList.valueOf(c));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(16844145, typedValue, true);
            float dimension = typedValue.getDimension(mo1404b().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                jVar.mo90770k0(dimension);
            }
        }
        this.f75507c = jVar;
    }
}
