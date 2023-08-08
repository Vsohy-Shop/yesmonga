package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.n */
public interface C0585n {

    /* renamed from: androidx.appcompat.view.menu.n$a */
    public interface C0586a {
        /* renamed from: b */
        void mo1207b(@C0359n0 C0568g gVar, boolean z);

        /* renamed from: c */
        boolean mo1208c(@C0359n0 C0568g gVar);
    }

    /* renamed from: b */
    void mo1936b(C0568g gVar, boolean z);

    /* renamed from: d */
    boolean mo1938d(C0568g gVar, C0573j jVar);

    /* renamed from: e */
    void mo1939e(C0586a aVar);

    /* renamed from: f */
    void mo1969f(Parcelable parcelable);

    /* renamed from: g */
    boolean mo1940g(C0594s sVar);

    int getId();

    /* renamed from: h */
    C0587o mo1942h(ViewGroup viewGroup);

    /* renamed from: i */
    Parcelable mo1970i();

    /* renamed from: j */
    void mo1943j(boolean z);

    /* renamed from: k */
    boolean mo1944k();

    /* renamed from: l */
    boolean mo1945l(C0568g gVar, C0573j jVar);

    /* renamed from: m */
    void mo1946m(Context context, C0568g gVar);
}
