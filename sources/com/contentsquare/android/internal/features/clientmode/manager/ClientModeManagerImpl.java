package com.contentsquare.android.internal.features.clientmode.manager;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.C19427i;
import androidx.lifecycle.C19499w;
import com.contentsquare.android.internal.features.clientmode.p024ui.deactivationdialog.DeactivationActivity;
import com.contentsquare.android.internal.features.clientmode.p024ui.developer.DeveloperActivationActivity;
import com.contentsquare.android.internal.features.clientmode.p024ui.settings.SettingsActivity;
import com.contentsquare.android.internal.features.clientmode.p024ui.tutorial.ClientModeTutorialActivity;
import com.contentsquare.android.sdk.C14213b7;
import com.contentsquare.android.sdk.C14281df;
import com.contentsquare.android.sdk.C14453jf;
import com.contentsquare.android.sdk.C14466k4;
import com.contentsquare.android.sdk.C14477k8;
import com.contentsquare.android.sdk.C14549na;
import com.contentsquare.android.sdk.C14563o1;
import com.contentsquare.android.sdk.C14663r3;
import com.contentsquare.android.sdk.C14771u6;
import java.util.HashSet;
import java.util.Set;

public class ClientModeManagerImpl implements C14281df, C14213b7.C14214a {

    /* renamed from: a */
    public final C14453jf f34935a = new C14453jf("ClientModeManagerImpl");

    /* renamed from: b */
    public final C14563o1 f34936b;

    /* renamed from: c */
    public final C14771u6 f34937c;

    /* renamed from: d */
    public boolean f34938d = false;

    public class ClientModeProcessLifecycleMonitor implements C19427i {
        public ClientModeProcessLifecycleMonitor() {
        }

        /* renamed from: v */
        public void mo34383v(C19499w wVar) {
            ClientModeManagerImpl clientModeManagerImpl = ClientModeManagerImpl.this;
            if (clientModeManagerImpl.f34938d) {
                clientModeManagerImpl.f34936b.mo36021h();
            }
        }

        /* renamed from: y */
        public void mo34384y(C19499w wVar) {
            ClientModeManagerImpl clientModeManagerImpl = ClientModeManagerImpl.this;
            if (clientModeManagerImpl.f34938d) {
                clientModeManagerImpl.f34936b.mo36024k();
            }
        }
    }

    /* renamed from: com.contentsquare.android.internal.features.clientmode.manager.ClientModeManagerImpl$a */
    public static class C14125a implements C14663r3<Activity> {

        /* renamed from: a */
        public static final Set<Class<?>> f34940a;

        static {
            HashSet hashSet = new HashSet();
            f34940a = hashSet;
            hashSet.add(ClientModeTutorialActivity.class);
            hashSet.add(SettingsActivity.class);
            hashSet.add(DeactivationActivity.class);
            hashSet.add(DeveloperActivationActivity.class);
        }

        /* renamed from: a */
        public boolean mo34386b(Activity activity) {
            return f34940a.contains(activity.getClass());
        }
    }

    public ClientModeManagerImpl(C14563o1 o1Var, Context context, C19499w wVar) {
        C14549na a = C14549na.m62703a(context.getApplicationContext());
        this.f34936b = o1Var;
        this.f34937c = a.mo35983c();
        a.mo35986g().mo34675g(this);
        wVar.getLifecycle().mo57464a(new ClientModeProcessLifecycleMonitor());
        mo34381b();
    }

    /* renamed from: a */
    public C14663r3<Activity> mo34380a() {
        return new C14125a();
    }

    /* renamed from: b */
    public final void mo34381b() {
        C14466k4 c = this.f34937c.mo36561c();
        if (c == null) {
            return;
        }
        if (c.mo35711e().mo35728f().mo35722c()) {
            this.f34936b.mo36019f();
            this.f34938d = true;
            this.f34935a.mo35679i("Contentsquare in-app features configuration is enabled", new Object[0]);
            return;
        }
        this.f34938d = false;
        this.f34935a.mo35679i("Contentsquare in-app features configuration is disabled", new Object[0]);
    }

    /* renamed from: d */
    public void mo34382d(String str) {
        if (C14477k8.RAW_CONFIGURATION_AS_JSON.mo35776b(str)) {
            mo34381b();
        }
    }
}
