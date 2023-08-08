package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.annotation.C0346i;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.lifecycle.C19392a1;
import androidx.lifecycle.C19395b1;
import androidx.lifecycle.C19455p;
import androidx.lifecycle.C19463r0;
import androidx.lifecycle.C19502x0;
import androidx.lifecycle.C19512y;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.viewmodel.C19477a;
import androidx.lifecycle.viewmodel.C19492e;
import androidx.savedstate.C20431c;
import androidx.savedstate.C20435d;
import androidx.savedstate.C20437e;

/* renamed from: androidx.fragment.app.m0 */
public class C19254m0 implements C19455p, C20437e, C19395b1 {

    /* renamed from: a */
    public final Fragment f49557a;

    /* renamed from: b */
    public final C19392a1 f49558b;

    /* renamed from: c */
    public C19502x0.C19506b f49559c;

    /* renamed from: d */
    public C19512y f49560d = null;

    /* renamed from: e */
    public C20435d f49561e = null;

    public C19254m0(@C0359n0 Fragment fragment, @C0359n0 C19392a1 a1Var) {
        this.f49557a = fragment;
        this.f49558b = a1Var;
    }

    /* renamed from: a */
    public void mo57320a(@C0359n0 Lifecycle.C19372Event event) {
        this.f49560d.mo57705l(event);
    }

    /* renamed from: b */
    public void mo57321b() {
        if (this.f49560d == null) {
            this.f49560d = new C19512y(this);
            C20435d a = C20435d.m95271a(this);
            this.f49561e = a;
            a.mo61296c();
        }
    }

    /* renamed from: c */
    public boolean mo57322c() {
        return this.f49560d != null;
    }

    /* renamed from: d */
    public void mo57323d(@C0363p0 Bundle bundle) {
        this.f49561e.mo61297d(bundle);
    }

    /* renamed from: e */
    public void mo57324e(@C0359n0 Bundle bundle) {
        this.f49561e.mo61298e(bundle);
    }

    /* renamed from: f */
    public void mo57325f(@C0359n0 Lifecycle.State state) {
        this.f49560d.mo57711s(state);
    }

    @C0359n0
    @C0346i
    public C19477a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f49557a.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        C19492e eVar = new C19492e();
        if (application != null) {
            eVar.mo57690c(C19502x0.C19503a.f49893i, application);
        }
        eVar.mo57690c(SavedStateHandleSupport.f49731c, this.f49557a);
        eVar.mo57690c(SavedStateHandleSupport.f49732d, this);
        if (this.f49557a.getArguments() != null) {
            eVar.mo57690c(SavedStateHandleSupport.f49733e, this.f49557a.getArguments());
        }
        return eVar;
    }

    @C0359n0
    public C19502x0.C19506b getDefaultViewModelProviderFactory() {
        Application application;
        C19502x0.C19506b defaultViewModelProviderFactory = this.f49557a.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f49557a.mDefaultFactory)) {
            this.f49559c = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f49559c == null) {
            Context applicationContext = this.f49557a.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                } else if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                } else {
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                }
            }
            Fragment fragment = this.f49557a;
            this.f49559c = new C19463r0(application, fragment, fragment.getArguments());
        }
        return this.f49559c;
    }

    @C0359n0
    public Lifecycle getLifecycle() {
        mo57321b();
        return this.f49560d;
    }

    @C0359n0
    public C20431c getSavedStateRegistry() {
        mo57321b();
        return this.f49561e.mo61295b();
    }

    @C0359n0
    public C19392a1 getViewModelStore() {
        mo57321b();
        return this.f49558b;
    }
}
