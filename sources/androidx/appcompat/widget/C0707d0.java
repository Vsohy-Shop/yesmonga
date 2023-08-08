package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.C0568g;
import androidx.appcompat.view.menu.C0585n;
import androidx.core.view.C18402w3;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.d0 */
public interface C0707d0 {
    /* renamed from: A */
    void mo3345A();

    /* renamed from: B */
    View mo3346B();

    /* renamed from: C */
    void mo3347C(ScrollingTabContainerView scrollingTabContainerView);

    /* renamed from: D */
    void mo3348D(Drawable drawable);

    /* renamed from: E */
    void mo3349E(Drawable drawable);

    /* renamed from: F */
    void mo3350F(SparseArray<Parcelable> sparseArray);

    /* renamed from: G */
    boolean mo3351G();

    /* renamed from: H */
    void mo3352H(int i);

    /* renamed from: I */
    void mo3353I(int i);

    /* renamed from: J */
    void mo3354J(C0585n.C0586a aVar, C0568g.C0569a aVar2);

    /* renamed from: K */
    void mo3355K(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener);

    /* renamed from: L */
    void mo3356L(SparseArray<Parcelable> sparseArray);

    /* renamed from: M */
    CharSequence mo3357M();

    /* renamed from: N */
    int mo3358N();

    /* renamed from: O */
    void mo3359O(View view);

    /* renamed from: P */
    void mo3360P();

    /* renamed from: Q */
    void mo3361Q(Drawable drawable);

    /* renamed from: a */
    Menu mo3362a();

    /* renamed from: b */
    void mo3363b(Drawable drawable);

    /* renamed from: c */
    boolean mo3364c();

    void collapseActionView();

    /* renamed from: d */
    boolean mo3366d();

    /* renamed from: e */
    boolean mo3367e();

    /* renamed from: f */
    boolean mo3368f();

    /* renamed from: g */
    boolean mo3369g();

    Context getContext();

    int getHeight();

    CharSequence getTitle();

    int getVisibility();

    /* renamed from: h */
    boolean mo3374h();

    /* renamed from: i */
    boolean mo3375i();

    /* renamed from: j */
    boolean mo3376j();

    /* renamed from: k */
    boolean mo3377k();

    /* renamed from: l */
    void mo3378l(int i);

    /* renamed from: m */
    void mo3379m(CharSequence charSequence);

    /* renamed from: n */
    void mo3380n(CharSequence charSequence);

    /* renamed from: o */
    void mo3381o(int i);

    /* renamed from: p */
    int mo3382p();

    /* renamed from: q */
    C18402w3 mo3383q(int i, long j);

    /* renamed from: r */
    void mo3384r(int i);

    /* renamed from: s */
    ViewGroup mo3385s();

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setLogo(int i);

    void setMenu(Menu menu, C0585n.C0586a aVar);

    void setMenuPrepared();

    void setTitle(CharSequence charSequence);

    void setVisibility(int i);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    /* renamed from: t */
    void mo3395t(boolean z);

    /* renamed from: u */
    int mo3396u();

    /* renamed from: v */
    void mo3397v(int i);

    /* renamed from: w */
    void mo3398w();

    /* renamed from: x */
    int mo3399x();

    /* renamed from: y */
    void mo3400y(boolean z);

    /* renamed from: z */
    void mo3401z(int i);
}
