package com.google.android.play.core.appupdate;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.C32014a;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.install.C32019a;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.install.model.C32022b;
import com.google.android.play.core.tasks.C32227d;
import com.google.android.play.core.tasks.C32229f;
import com.google.android.play.core.tasks.C32239p;

/* renamed from: com.google.android.play.core.appupdate.h */
public final class C31874h implements C31868c {

    /* renamed from: a */
    public final C31885s f77720a;

    /* renamed from: b */
    public final C31872f f77721b;

    /* renamed from: c */
    public final Context f77722c;

    /* renamed from: d */
    public final Handler f77723d = new Handler(Looper.getMainLooper());

    public C31874h(C31885s sVar, C31872f fVar, Context context) {
        this.f77720a = sVar;
        this.f77721b = fVar;
        this.f77722c = context;
    }

    /* renamed from: a */
    public final boolean mo92400a(C31865a aVar, Activity activity, C31870e eVar, int i) throws IntentSender.SendIntentException {
        return mo92405f(aVar, new C31873g(activity), eVar, i);
    }

    /* renamed from: b */
    public final boolean mo92401b(C31865a aVar, @C32022b int i, C32014a aVar2, int i2) throws IntentSender.SendIntentException {
        return mo92405f(aVar, aVar2, C31870e.m129279c(i), i2);
    }

    /* renamed from: c */
    public final C32227d<Void> mo92402c() {
        return this.f77720a.mo92424b(this.f77722c.getPackageName());
    }

    /* renamed from: d */
    public final C32227d<C31865a> mo92403d() {
        return this.f77720a.mo92423a(this.f77722c.getPackageName());
    }

    /* renamed from: e */
    public final synchronized void mo92404e(C32019a aVar) {
        this.f77721b.mo92850d(aVar);
    }

    /* renamed from: f */
    public final boolean mo92405f(C31865a aVar, C32014a aVar2, C31870e eVar, int i) throws IntentSender.SendIntentException {
        if (!aVar.mo92393o(eVar)) {
            return false;
        }
        aVar2.mo92415a(aVar.mo92389k(eVar).getIntentSender(), i, (Intent) null, 0, 0, 0, (Bundle) null);
        return true;
    }

    /* renamed from: g */
    public final C32227d<Integer> mo92406g(C31865a aVar, Activity activity, C31870e eVar) {
        PlayCoreDialogWrapperActivity.m129736a(this.f77722c);
        if (!aVar.mo92393o(eVar)) {
            return C32229f.m130361d(new InstallException(-6));
        }
        Intent intent = new Intent(activity, PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", aVar.mo92389k(eVar));
        C32239p pVar = new C32239p();
        intent.putExtra("result_receiver", new C31867b(this.f77723d, pVar));
        activity.startActivity(intent);
        return pVar.mo93032c();
    }

    /* renamed from: h */
    public final boolean mo92407h(C31865a aVar, @C32022b int i, Activity activity, int i2) throws IntentSender.SendIntentException {
        return mo92405f(aVar, new C31873g(activity), C31870e.m129279c(i), i2);
    }

    /* renamed from: i */
    public final synchronized void mo92408i(C32019a aVar) {
        this.f77721b.mo92851e(aVar);
    }
}
