package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.C0324b1;
import androidx.annotation.C0327c1;
import androidx.annotation.C0331e;
import androidx.annotation.C0336f;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0375v;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.appcompat.app.AlertController;

/* renamed from: androidx.appcompat.app.d */
public class C0467d extends C0492q implements DialogInterface {

    /* renamed from: g */
    public static final int f1169g = 0;

    /* renamed from: v */
    public static final int f1170v = 1;

    /* renamed from: f */
    public final AlertController f1171f;

    /* renamed from: androidx.appcompat.app.d$a */
    public static class C0468a {

        /* renamed from: a */
        public final AlertController.C0406f f1172a;

        /* renamed from: b */
        public final int f1173b;

        public C0468a(@C0359n0 Context context) {
            this(context, C0467d.m2000o(context, 0));
        }

        /* renamed from: A */
        public C0468a mo1388A(DialogInterface.OnKeyListener onKeyListener) {
            this.f1172a.f969u = onKeyListener;
            return this;
        }

        /* renamed from: B */
        public C0468a mo1389B(@C0324b1 int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0406f fVar = this.f1172a;
            fVar.f957i = fVar.f949a.getText(i);
            this.f1172a.f959k = onClickListener;
            return this;
        }

        /* renamed from: C */
        public C0468a mo1390C(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0406f fVar = this.f1172a;
            fVar.f957i = charSequence;
            fVar.f959k = onClickListener;
            return this;
        }

        /* renamed from: D */
        public C0468a mo1391D(Drawable drawable) {
            this.f1172a.f958j = drawable;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: E */
        public C0468a mo1392E(boolean z) {
            this.f1172a.f948Q = z;
            return this;
        }

        /* renamed from: F */
        public C0468a mo1393F(@C0331e int i, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0406f fVar = this.f1172a;
            fVar.f970v = fVar.f949a.getResources().getTextArray(i);
            AlertController.C0406f fVar2 = this.f1172a;
            fVar2.f972x = onClickListener;
            fVar2.f940I = i2;
            fVar2.f939H = true;
            return this;
        }

        /* renamed from: G */
        public C0468a mo1394G(Cursor cursor, int i, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0406f fVar = this.f1172a;
            fVar.f942K = cursor;
            fVar.f972x = onClickListener;
            fVar.f940I = i;
            fVar.f943L = str;
            fVar.f939H = true;
            return this;
        }

        /* renamed from: H */
        public C0468a mo1395H(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0406f fVar = this.f1172a;
            fVar.f971w = listAdapter;
            fVar.f972x = onClickListener;
            fVar.f940I = i;
            fVar.f939H = true;
            return this;
        }

        /* renamed from: I */
        public C0468a mo1396I(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0406f fVar = this.f1172a;
            fVar.f970v = charSequenceArr;
            fVar.f972x = onClickListener;
            fVar.f940I = i;
            fVar.f939H = true;
            return this;
        }

        /* renamed from: J */
        public C0468a mo1397J(@C0324b1 int i) {
            AlertController.C0406f fVar = this.f1172a;
            fVar.f954f = fVar.f949a.getText(i);
            return this;
        }

        /* renamed from: K */
        public C0468a mo1398K(@C0363p0 CharSequence charSequence) {
            this.f1172a.f954f = charSequence;
            return this;
        }

        /* renamed from: L */
        public C0468a mo1399L(int i) {
            AlertController.C0406f fVar = this.f1172a;
            fVar.f974z = null;
            fVar.f973y = i;
            fVar.f936E = false;
            return this;
        }

        /* renamed from: M */
        public C0468a mo1400M(View view) {
            AlertController.C0406f fVar = this.f1172a;
            fVar.f974z = view;
            fVar.f973y = 0;
            fVar.f936E = false;
            return this;
        }

        @Deprecated
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* renamed from: N */
        public C0468a mo1401N(View view, int i, int i2, int i3, int i4) {
            AlertController.C0406f fVar = this.f1172a;
            fVar.f974z = view;
            fVar.f973y = 0;
            fVar.f936E = true;
            fVar.f932A = i;
            fVar.f933B = i2;
            fVar.f934C = i3;
            fVar.f935D = i4;
            return this;
        }

        /* renamed from: O */
        public C0467d mo1402O() {
            C0467d a = mo1403a();
            a.show();
            return a;
        }

        @C0359n0
        /* renamed from: a */
        public C0467d mo1403a() {
            C0467d dVar = new C0467d(this.f1172a.f949a, this.f1173b);
            this.f1172a.mo1060a(dVar.f1171f);
            dVar.setCancelable(this.f1172a.f966r);
            if (this.f1172a.f966r) {
                dVar.setCanceledOnTouchOutside(true);
            }
            dVar.setOnCancelListener(this.f1172a.f967s);
            dVar.setOnDismissListener(this.f1172a.f968t);
            DialogInterface.OnKeyListener onKeyListener = this.f1172a.f969u;
            if (onKeyListener != null) {
                dVar.setOnKeyListener(onKeyListener);
            }
            return dVar;
        }

        @C0359n0
        /* renamed from: b */
        public Context mo1404b() {
            return this.f1172a.f949a;
        }

        /* renamed from: c */
        public C0468a mo1405c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0406f fVar = this.f1172a;
            fVar.f971w = listAdapter;
            fVar.f972x = onClickListener;
            return this;
        }

        /* renamed from: d */
        public C0468a mo1406d(boolean z) {
            this.f1172a.f966r = z;
            return this;
        }

        /* renamed from: e */
        public C0468a mo1407e(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.C0406f fVar = this.f1172a;
            fVar.f942K = cursor;
            fVar.f943L = str;
            fVar.f972x = onClickListener;
            return this;
        }

        /* renamed from: f */
        public C0468a mo1408f(@C0363p0 View view) {
            this.f1172a.f955g = view;
            return this;
        }

        /* renamed from: g */
        public C0468a mo1409g(@C0375v int i) {
            this.f1172a.f951c = i;
            return this;
        }

        /* renamed from: h */
        public C0468a mo1410h(@C0363p0 Drawable drawable) {
            this.f1172a.f952d = drawable;
            return this;
        }

        /* renamed from: i */
        public C0468a mo1411i(@C0336f int i) {
            TypedValue typedValue = new TypedValue();
            this.f1172a.f949a.getTheme().resolveAttribute(i, typedValue, true);
            this.f1172a.f951c = typedValue.resourceId;
            return this;
        }

        @Deprecated
        /* renamed from: j */
        public C0468a mo1412j(boolean z) {
            this.f1172a.f945N = z;
            return this;
        }

        /* renamed from: k */
        public C0468a mo1413k(@C0331e int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0406f fVar = this.f1172a;
            fVar.f970v = fVar.f949a.getResources().getTextArray(i);
            this.f1172a.f972x = onClickListener;
            return this;
        }

        /* renamed from: l */
        public C0468a mo1414l(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0406f fVar = this.f1172a;
            fVar.f970v = charSequenceArr;
            fVar.f972x = onClickListener;
            return this;
        }

        /* renamed from: m */
        public C0468a mo1415m(@C0324b1 int i) {
            AlertController.C0406f fVar = this.f1172a;
            fVar.f956h = fVar.f949a.getText(i);
            return this;
        }

        /* renamed from: n */
        public C0468a mo1416n(@C0363p0 CharSequence charSequence) {
            this.f1172a.f956h = charSequence;
            return this;
        }

        /* renamed from: o */
        public C0468a mo1417o(@C0331e int i, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.C0406f fVar = this.f1172a;
            fVar.f970v = fVar.f949a.getResources().getTextArray(i);
            AlertController.C0406f fVar2 = this.f1172a;
            fVar2.f941J = onMultiChoiceClickListener;
            fVar2.f937F = zArr;
            fVar2.f938G = true;
            return this;
        }

        /* renamed from: p */
        public C0468a mo1418p(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.C0406f fVar = this.f1172a;
            fVar.f942K = cursor;
            fVar.f941J = onMultiChoiceClickListener;
            fVar.f944M = str;
            fVar.f943L = str2;
            fVar.f938G = true;
            return this;
        }

        /* renamed from: q */
        public C0468a mo1419q(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.C0406f fVar = this.f1172a;
            fVar.f970v = charSequenceArr;
            fVar.f941J = onMultiChoiceClickListener;
            fVar.f937F = zArr;
            fVar.f938G = true;
            return this;
        }

        /* renamed from: r */
        public C0468a mo1420r(@C0324b1 int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0406f fVar = this.f1172a;
            fVar.f960l = fVar.f949a.getText(i);
            this.f1172a.f962n = onClickListener;
            return this;
        }

        /* renamed from: s */
        public C0468a mo1421s(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0406f fVar = this.f1172a;
            fVar.f960l = charSequence;
            fVar.f962n = onClickListener;
            return this;
        }

        /* renamed from: t */
        public C0468a mo1422t(Drawable drawable) {
            this.f1172a.f961m = drawable;
            return this;
        }

        /* renamed from: u */
        public C0468a mo1423u(@C0324b1 int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0406f fVar = this.f1172a;
            fVar.f963o = fVar.f949a.getText(i);
            this.f1172a.f965q = onClickListener;
            return this;
        }

        /* renamed from: v */
        public C0468a mo1424v(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0406f fVar = this.f1172a;
            fVar.f963o = charSequence;
            fVar.f965q = onClickListener;
            return this;
        }

        /* renamed from: w */
        public C0468a mo1425w(Drawable drawable) {
            this.f1172a.f964p = drawable;
            return this;
        }

        /* renamed from: x */
        public C0468a mo1426x(DialogInterface.OnCancelListener onCancelListener) {
            this.f1172a.f967s = onCancelListener;
            return this;
        }

        /* renamed from: y */
        public C0468a mo1427y(DialogInterface.OnDismissListener onDismissListener) {
            this.f1172a.f968t = onDismissListener;
            return this;
        }

        /* renamed from: z */
        public C0468a mo1428z(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.f1172a.f946O = onItemSelectedListener;
            return this;
        }

        public C0468a(@C0359n0 Context context, @C0327c1 int i) {
            this.f1172a = new AlertController.C0406f(new ContextThemeWrapper(context, C0467d.m2000o(context, i)));
            this.f1173b = i;
        }
    }

    public C0467d(@C0359n0 Context context) {
        this(context, 0);
    }

    /* renamed from: o */
    public static int m2000o(@C0359n0 Context context, @C0327c1 int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0387a.C0389b.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: A */
    public void mo1372A(View view) {
        this.f1171f.mo1047u(view);
    }

    /* renamed from: B */
    public void mo1373B(View view, int i, int i2, int i3, int i4) {
        this.f1171f.mo1048v(view, i, i2, i3, i4);
    }

    /* renamed from: m */
    public Button mo1374m(int i) {
        return this.f1171f.mo1030c(i);
    }

    /* renamed from: n */
    public ListView mo1375n() {
        return this.f1171f.mo1032e();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1171f.mo1033f();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f1171f.mo1034h(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f1171f.mo1035i(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* renamed from: p */
    public void mo1378p(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f1171f.mo1038l(i, charSequence, onClickListener, (Message) null, (Drawable) null);
    }

    /* renamed from: q */
    public void mo1379q(int i, CharSequence charSequence, Drawable drawable, DialogInterface.OnClickListener onClickListener) {
        this.f1171f.mo1038l(i, charSequence, onClickListener, (Message) null, drawable);
    }

    /* renamed from: r */
    public void mo1380r(int i, CharSequence charSequence, Message message) {
        this.f1171f.mo1038l(i, charSequence, (DialogInterface.OnClickListener) null, message, (Drawable) null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: s */
    public void mo1381s(int i) {
        this.f1171f.mo1039m(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f1171f.mo1045s(charSequence);
    }

    /* renamed from: t */
    public void mo1383t(View view) {
        this.f1171f.mo1040n(view);
    }

    /* renamed from: u */
    public void mo1384u(int i) {
        this.f1171f.mo1041o(i);
    }

    /* renamed from: v */
    public void mo1385v(Drawable drawable) {
        this.f1171f.mo1042p(drawable);
    }

    /* renamed from: w */
    public void mo1386w(int i) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i, typedValue, true);
        this.f1171f.mo1041o(typedValue.resourceId);
    }

    /* renamed from: x */
    public void mo1387x(CharSequence charSequence) {
        this.f1171f.mo1043q(charSequence);
    }

    public C0467d(@C0359n0 Context context, @C0327c1 int i) {
        super(context, m2000o(context, i));
        this.f1171f = new AlertController(getContext(), this, getWindow());
    }

    public C0467d(@C0359n0 Context context, boolean z, @C0363p0 DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }
}
