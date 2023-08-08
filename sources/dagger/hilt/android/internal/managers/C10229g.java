package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import dagger.hilt.C10262b;
import dagger.hilt.C10263c;
import dagger.hilt.C10267e;
import dagger.hilt.android.components.C10166a;
import dagger.hilt.android.internal.builders.C10188c;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.internal.C10274c;
import dagger.hilt.internal.C10280f;

/* renamed from: dagger.hilt.android.internal.managers.g */
public class C10229g implements C10274c<Object> {

    /* renamed from: a */
    public volatile Object f27947a;

    /* renamed from: b */
    public final Object f27948b = new Object();

    /* renamed from: c */
    public final Fragment f27949c;

    @C10267e({C10166a.class})
    @C10262b
    /* renamed from: dagger.hilt.android.internal.managers.g$a */
    public interface C10230a {
        /* renamed from: k */
        C10188c mo21677k();
    }

    public C10229g(Fragment fragment) {
        this.f27949c = fragment;
    }

    /* renamed from: b */
    public static ContextWrapper m38469b(Context context, Fragment fragment) {
        return new ViewComponentManager.FragmentContextWrapper(context, fragment);
    }

    /* renamed from: c */
    public static ContextWrapper m38470c(LayoutInflater layoutInflater, Fragment fragment) {
        return new ViewComponentManager.FragmentContextWrapper(layoutInflater, fragment);
    }

    /* renamed from: d */
    public static final Context m38471d(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    /* renamed from: e */
    public static final void m38472e(Fragment fragment) {
        C10280f.m38506b(fragment);
        if (fragment.getArguments() == null) {
            fragment.setArguments(new Bundle());
        }
    }

    /* renamed from: a */
    public final Object mo21675a() {
        C10280f.m38507c(this.f27949c.getHost(), "Hilt Fragments must be attached before creating the component.");
        C10280f.m38508d(this.f27949c.getHost() instanceof C10274c, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", this.f27949c.getHost().getClass());
        mo21676f(this.f27949c);
        return ((C10230a) C10263c.m38503a(this.f27949c.getHost(), C10230a.class)).mo21677k().mo21622a(this.f27949c).mo21623g();
    }

    /* renamed from: f */
    public void mo21676f(Fragment fragment) {
    }

    public Object generatedComponent() {
        if (this.f27947a == null) {
            synchronized (this.f27948b) {
                if (this.f27947a == null) {
                    this.f27947a = mo21675a();
                }
            }
        }
        return this.f27947a;
    }
}
