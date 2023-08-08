package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.C0329d0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

/* renamed from: androidx.fragment.app.j */
public abstract class C19240j {
    @C0359n0
    @Deprecated
    /* renamed from: b */
    public Fragment mo57233b(@C0359n0 Context context, @C0359n0 String str, @C0363p0 Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }

    @C0363p0
    /* renamed from: c */
    public abstract View mo56759c(@C0329d0 int i);

    /* renamed from: g */
    public abstract boolean mo56760g();
}
