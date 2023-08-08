package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C19502x0;

@Deprecated
/* renamed from: androidx.lifecycle.z0 */
public class C19517z0 {

    @Deprecated
    /* renamed from: androidx.lifecycle.z0$a */
    public static class C19518a extends C19502x0.C19503a {
        @Deprecated
        public C19518a(@C0359n0 Application application) {
            super(application);
        }
    }

    @C0353k0
    @C0359n0
    @Deprecated
    /* renamed from: a */
    public static C19502x0 m90896a(@C0359n0 Fragment fragment) {
        return new C19502x0(fragment);
    }

    @C0353k0
    @C0359n0
    @Deprecated
    /* renamed from: b */
    public static C19502x0 m90897b(@C0359n0 Fragment fragment, @C0363p0 C19502x0.C19506b bVar) {
        if (bVar == null) {
            bVar = fragment.getDefaultViewModelProviderFactory();
        }
        return new C19502x0(fragment.getViewModelStore(), bVar);
    }

    @C0353k0
    @C0359n0
    @Deprecated
    /* renamed from: c */
    public static C19502x0 m90898c(@C0359n0 C19232h hVar) {
        return new C19502x0(hVar);
    }

    @C0353k0
    @C0359n0
    @Deprecated
    /* renamed from: d */
    public static C19502x0 m90899d(@C0359n0 C19232h hVar, @C0363p0 C19502x0.C19506b bVar) {
        if (bVar == null) {
            bVar = hVar.getDefaultViewModelProviderFactory();
        }
        return new C19502x0(hVar.getViewModelStore(), bVar);
    }
}
