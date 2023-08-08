package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0249p;
import androidx.annotation.C0329d0;
import androidx.annotation.C0347i0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.appcompat.view.C0535b;
import androidx.core.view.C18325o0;

/* renamed from: androidx.appcompat.app.q */
public class C0492q extends C0249p implements C0478f {

    /* renamed from: d */
    public C0481i f1257d;

    /* renamed from: e */
    public final C18325o0.C18326a f1258e;

    public C0492q(@C0359n0 Context context) {
        this(context, 0);
    }

    /* renamed from: j */
    public static int m2293j(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0387a.C0389b.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @C0363p0
    /* renamed from: E */
    public C0535b mo1476E(C0535b.C0536a aVar) {
        return null;
    }

    public void addContentView(@C0359n0 View view, ViewGroup.LayoutParams layoutParams) {
        mo1524h().mo1121f(view, layoutParams);
    }

    public void dismiss() {
        super.dismiss();
        mo1524h().mo1090N();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C18325o0.m83027e(this.f1258e, getWindow().getDecorView(), this, keyEvent);
    }

    @C0363p0
    public <T extends View> T findViewById(@C0329d0 int i) {
        return mo1524h().mo1153s(i);
    }

    @C0359n0
    /* renamed from: h */
    public C0481i mo1524h() {
        if (this.f1257d == null) {
            this.f1257d = C0481i.m2242o(this, this);
        }
        return this.f1257d;
    }

    /* renamed from: i */
    public C0441a mo1525i() {
        return mo1524h().mo1073C();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void invalidateOptionsMenu() {
        mo1524h().mo1079F();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo1527k(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: l */
    public boolean mo1528l(int i) {
        return mo1524h().mo1104V(i);
    }

    public void onCreate(Bundle bundle) {
        mo1524h().mo1077E();
        super.onCreate(bundle);
        mo1524h().mo1088M(bundle);
    }

    public void onStop() {
        super.onStop();
        mo1524h().mo1100S();
    }

    public void setContentView(@C0347i0 int i) {
        mo1524h().mo1109Z(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo1524h().mo1132j0(charSequence);
    }

    /* renamed from: y */
    public void mo1513y(C0535b bVar) {
    }

    /* renamed from: z */
    public void mo1514z(C0535b bVar) {
    }

    public C0492q(@C0359n0 Context context, int i) {
        super(context, m2293j(context, i));
        this.f1258e = new C0491p(this);
        C0481i h = mo1524h();
        h.mo1130i0(m2293j(context, i));
        h.mo1088M((Bundle) null);
    }

    public void setContentView(@C0359n0 View view) {
        mo1524h().mo1112a0(view);
    }

    public void setContentView(@C0359n0 View view, ViewGroup.LayoutParams layoutParams) {
        mo1524h().mo1115b0(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        mo1524h().mo1132j0(getContext().getString(i));
    }

    public C0492q(@C0359n0 Context context, boolean z, @C0363p0 DialogInterface.OnCancelListener onCancelListener) {
        super(context);
        this.f1258e = new C0491p(this);
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }
}
