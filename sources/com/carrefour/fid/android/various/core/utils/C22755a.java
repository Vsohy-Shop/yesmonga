package com.carrefour.fid.android.various.core.utils;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import androidx.fragment.app.C19215c;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.carrefour.fid.android.domain.models.usabilla.UsabillaEventType;
import com.carrefour.fid.android.shared.C28444b;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.C9771d;
import com.usabilla.sdk.ubform.C9826e;
import com.usabilla.sdk.ubform.Usabilla;
import com.usabilla.sdk.ubform.sdk.form.C10048a;
import com.usabilla.sdk.ubform.sdk.form.model.UsabillaTheme;
import kotlin.C11078d1;
import kotlin.collections.C10975r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.various.core.utils.a */
public final class C22755a {
    @C12579k

    /* renamed from: a */
    public static final C22755a f58271a = new C22755a();
    @C12579k

    /* renamed from: b */
    public static final String f58272b = "5fb3d46d66856e6de275d4f2";
    @C12579k

    /* renamed from: c */
    public static final String f58273c = "USABILLA_FORM";
    @C12579k

    /* renamed from: d */
    public static final String f58274d = "sessionId";

    /* renamed from: com.carrefour.fid.android.various.core.utils.a$a */
    public static final class C22756a implements C9826e {

        /* renamed from: a */
        public final /* synthetic */ C19232h f58275a;

        public C22756a(C19232h hVar) {
            this.f58275a = hVar;
        }

        /* renamed from: a */
        public void mo20163a() {
        }

        /* renamed from: b */
        public void mo20164b(@C12579k C10048a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "form");
            C19215c u = aVar.mo21160u();
            C19232h hVar = this.f58275a;
            u.setStyle(1, C28444b.C28463s.FullScreenDialogTheme);
            u.show(hVar.mo57175g0(), C22755a.f58273c);
        }

        /* renamed from: c */
        public void mo20165c(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "text");
        }
    }

    @C12579k
    /* renamed from: a */
    public final IntentFilter mo67148a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(C9771d.f26774b);
        return intentFilter;
    }

    /* renamed from: b */
    public final void mo67149b(@C12579k C19232h hVar, @C12580l String str) {
        C19215c cVar;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        if (Intrinsics.areEqual((Object) str, (Object) C9771d.f26774b)) {
            Fragment s0 = hVar.mo57175g0().mo56903s0(f58273c);
            if (s0 instanceof C19215c) {
                cVar = (C19215c) s0;
            } else {
                cVar = null;
            }
            if (cVar != null) {
                cVar.dismiss();
            }
        }
    }

    /* renamed from: c */
    public final void mo67150c(@C12579k Context context, @C12579k UsabillaEventType usabillaEventType) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(usabillaEventType, "eventType");
        Usabilla.f26653a.sendEvent(context, usabillaEventType.mo119573q());
    }

    /* renamed from: d */
    public final void mo67151d(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "sessionId");
        Usabilla.f26653a.setCustomVariables(C10975r0.m41401k(C11078d1.m42659a("sessionId", str)));
    }

    /* renamed from: e */
    public final void mo67152e(@C12579k C19232h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Usabilla.loadFeedbackForm$default(Usabilla.f26653a, f58272b, (Bitmap) null, (UsabillaTheme) null, new C22756a(hVar), 6, (Object) null);
    }

    /* renamed from: f */
    public final void mo67153f(@C12579k C19232h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Usabilla usabilla = Usabilla.f26653a;
        FragmentManager g0 = hVar.mo57175g0();
        Intrinsics.checkNotNullExpressionValue(g0, "supportFragmentManager");
        usabilla.updateFragmentManager(g0);
    }
}
