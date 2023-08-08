package com.urbanairship.actions;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.Keep;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;
import com.urbanairship.app.C36035g;
import com.urbanairship.app.C36039i;
import com.urbanairship.base.C9002b;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.permission.C9426c;
import com.urbanairship.permission.C9439p;
import com.urbanairship.permission.Permission;
import com.urbanairship.permission.PermissionStatus;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

public class PromptPermissionAction extends C35487a {

    /* renamed from: i */
    public static final String f87444i = "com.urbanairship.actions.PromptPermissionActionReceiver";
    @C0359n0

    /* renamed from: j */
    public static final String f87445j = "prompt_permission_action";
    @C0359n0

    /* renamed from: k */
    public static final String f87446k = "^pp";
    @C0359n0

    /* renamed from: l */
    public static final String f87447l = "permission";
    @C0359n0

    /* renamed from: m */
    public static final String f87448m = "enable_airship_usage";
    @C0359n0

    /* renamed from: n */
    public static final String f87449n = "fallback_system_settings";
    @C0359n0

    /* renamed from: o */
    public static final String f87450o = "permission";
    @C0359n0

    /* renamed from: p */
    public static final String f87451p = "before";
    @C0359n0

    /* renamed from: q */
    public static final String f87452q = "after";

    /* renamed from: h */
    public final C9002b<C9439p> f87453h;

    /* renamed from: com.urbanairship.actions.PromptPermissionAction$a */
    public class C35478a extends C36039i {

        /* renamed from: a */
        public final /* synthetic */ C9439p f87454a;

        /* renamed from: b */
        public final /* synthetic */ C35479b f87455b;

        /* renamed from: c */
        public final /* synthetic */ PermissionStatus f87456c;

        /* renamed from: d */
        public final /* synthetic */ ResultReceiver f87457d;

        /* renamed from: e */
        public final /* synthetic */ C36035g f87458e;

        public C35478a(C9439p pVar, C35479b bVar, PermissionStatus permissionStatus, ResultReceiver resultReceiver, C36035g gVar) {
            this.f87454a = pVar;
            this.f87455b = bVar;
            this.f87456c = permissionStatus;
            this.f87457d = resultReceiver;
            this.f87458e = gVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m146383d(C35479b bVar, PermissionStatus permissionStatus, ResultReceiver resultReceiver, C36035g gVar, PermissionStatus permissionStatus2) {
            PromptPermissionAction.this.mo106324r(bVar.f87462c, permissionStatus, permissionStatus2, resultReceiver);
            gVar.mo18481b(this);
        }

        /* renamed from: a */
        public void mo17410a(long j) {
            C9439p pVar = this.f87454a;
            C35479b bVar = this.f87455b;
            pVar.mo19143m(bVar.f87462c, new C35511q(this, bVar, this.f87456c, this.f87457d, this.f87458e));
        }
    }

    /* renamed from: com.urbanairship.actions.PromptPermissionAction$b */
    public static class C35479b {

        /* renamed from: a */
        public final boolean f87460a;

        /* renamed from: b */
        public final boolean f87461b;

        /* renamed from: c */
        public final Permission f87462c;

        public C35479b(@C0359n0 Permission permission, boolean z, boolean z2) {
            this.f87462c = permission;
            this.f87460a = z;
            this.f87461b = z2;
        }

        @C0359n0
        /* renamed from: a */
        public static C35479b m146385a(JsonValue jsonValue) throws JsonException {
            return new C35479b(Permission.m35418b(jsonValue.mo18752E().mo18801A("permission")), jsonValue.mo18752E().mo18801A(PromptPermissionAction.f87448m).mo18757c(false), jsonValue.mo18752E().mo18801A(PromptPermissionAction.f87449n).mo18757c(false));
        }
    }

    public PromptPermissionAction(@C0359n0 C9002b<C9439p> bVar) {
        this.f87453h = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m146370k(C35479b bVar, C9439p pVar, PermissionStatus permissionStatus, ResultReceiver resultReceiver, C9426c cVar) {
        if (mo106325s(bVar, cVar)) {
            m146372m(bVar.f87462c);
            C36035g t = C36035g.m148341t(UAirship.m146200l());
            t.mo18485f(new C35478a(pVar, bVar, permissionStatus, resultReceiver, t));
            return;
        }
        mo106324r(bVar.f87462c, permissionStatus, cVar.mo19126b(), resultReceiver);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m146371l(C9439p pVar, C35479b bVar, ResultReceiver resultReceiver, PermissionStatus permissionStatus) {
        pVar.mo19136E(bVar.f87462c, bVar.f87460a, new C35509o(this, bVar, pVar, permissionStatus, resultReceiver));
    }

    @C0353k0
    /* renamed from: m */
    public static void m146372m(@C0359n0 Permission permission) {
        if (permission == Permission.DISPLAY_NOTIFICATIONS) {
            m146374o();
        } else {
            m146373n();
        }
    }

    /* renamed from: n */
    public static void m146373n() {
        Context l = UAirship.m146200l();
        Intent addFlags = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").addCategory("android.intent.category.DEFAULT").addFlags(268435456);
        try {
            l.startActivity(addFlags.setData(Uri.parse("package:" + UAirship.m146180A())));
        } catch (ActivityNotFoundException e) {
            C36059m.m148411g(e, "Unable to launch settings details activity.", new Object[0]);
        }
        Intent addFlags2 = new Intent("android.settings.APPLICATION_SETTINGS").addCategory("android.intent.category.DEFAULT").addFlags(268435456);
        try {
            l.startActivity(addFlags2.setData(Uri.parse("package:" + UAirship.m146180A())));
        } catch (ActivityNotFoundException e2) {
            C36059m.m148411g(e2, "Unable to launch settings activity.", new Object[0]);
        }
    }

    @C0353k0
    /* renamed from: o */
    public static void m146374o() {
        Context l = UAirship.m146200l();
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                l.startActivity(new Intent("android.settings.APP_NOTIFICATION_SETTINGS").putExtra(ActivityKt.f70306b, UAirship.m146180A()).addFlags(268435456));
                return;
            } catch (ActivityNotFoundException e) {
                C36059m.m148407c(e, "Failed to launch notification settings.", new Object[0]);
            }
        }
        try {
            l.startActivity(new Intent("android.settings.APP_NOTIFICATION_SETTINGS").putExtra(ActivityKt.f70307c, UAirship.m146180A()).addFlags(268435456).putExtra(ActivityKt.f70308d, UAirship.m146197i().uid));
        } catch (ActivityNotFoundException e2) {
            C36059m.m148407c(e2, "Failed to launch notification settings.", new Object[0]);
            m146373n();
        }
    }

    /* renamed from: a */
    public boolean mo17301a(@C0359n0 C35489b bVar) {
        int b = bVar.mo106348b();
        return b == 0 || b == 6 || b == 2 || b == 3 || b == 4;
    }

    @C0359n0
    /* renamed from: d */
    public final C35495f mo17302d(@C0359n0 C35489b bVar) {
        try {
            mo106323q(mo106321p(bVar), (ResultReceiver) bVar.mo106347a().getParcelable(f87444i));
            return C35495f.m146456d();
        } catch (Exception e) {
            return C35495f.m146458f(e);
        }
    }

    /* renamed from: f */
    public boolean mo18905f() {
        return true;
    }

    /* renamed from: p */
    public C35479b mo106321p(C35489b bVar) throws JsonException, IllegalArgumentException {
        return C35479b.m146385a(bVar.mo106349c().mo17264q());
    }

    /* renamed from: q */
    public void mo106323q(@C0359n0 C35479b bVar, @C0363p0 ResultReceiver resultReceiver) throws ExecutionException, InterruptedException {
        C9439p pVar = this.f87453h.get();
        Objects.requireNonNull(pVar);
        pVar.mo19143m(bVar.f87462c, new C35508n(this, pVar, bVar, resultReceiver));
    }

    /* renamed from: r */
    public void mo106324r(@C0359n0 Permission permission, @C0359n0 PermissionStatus permissionStatus, @C0359n0 PermissionStatus permissionStatus2, @C0363p0 ResultReceiver resultReceiver) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putString("permission", permission.mo17264q().toString());
            bundle.putString(f87451p, permissionStatus.mo17264q().toString());
            bundle.putString(f87452q, permissionStatus2.mo17264q().toString());
            resultReceiver.send(-1, bundle);
        }
    }

    /* renamed from: s */
    public boolean mo106325s(@C0359n0 C35479b bVar, @C0359n0 C9426c cVar) {
        if (!bVar.f87461b || cVar.mo19126b() != PermissionStatus.DENIED || !cVar.mo19127d()) {
            return false;
        }
        return true;
    }

    @Keep
    public PromptPermissionAction() {
        this(new C35510p());
    }
}
