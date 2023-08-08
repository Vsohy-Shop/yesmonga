package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.Window;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.C0585n;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.c0 */
public interface C0704c0 {
    /* renamed from: c */
    boolean mo2370c();

    /* renamed from: d */
    boolean mo2372d();

    /* renamed from: e */
    boolean mo2374e();

    /* renamed from: f */
    boolean mo2375f();

    /* renamed from: g */
    boolean mo2377g();

    CharSequence getTitle();

    /* renamed from: h */
    boolean mo2384h();

    /* renamed from: i */
    boolean mo2385i();

    /* renamed from: j */
    void mo2386j(SparseArray<Parcelable> sparseArray);

    /* renamed from: k */
    void mo2387k(int i);

    /* renamed from: l */
    void mo2388l();

    /* renamed from: p */
    void mo2406p(SparseArray<Parcelable> sparseArray);

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setLogo(int i);

    void setMenu(Menu menu, C0585n.C0586a aVar);

    void setMenuPrepared();

    void setUiOptions(int i);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
