package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.annotation.C0323b0;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.browser.trusted.C0957i;
import androidx.browser.trusted.C0958j;
import androidx.compose.runtime.C8698y1;
import androidx.core.app.C17075f2;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.Fragment;
import com.carrefour.fid.android.presentation.p035ui.account.consent.C22925d;
import com.google.android.gms.base.C40426a;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.C40504h;
import com.google.android.gms.common.api.C40660j;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.C40522b2;
import com.google.android.gms.common.api.internal.C40528c2;
import com.google.android.gms.common.api.internal.C40564i;
import com.google.android.gms.common.api.internal.C40567i2;
import com.google.android.gms.common.api.internal.C40587m;
import com.google.android.gms.common.internal.C40774j0;
import com.google.android.gms.common.internal.C40781l;
import com.google.android.gms.common.internal.C40792n0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.common.util.C40986l;
import com.google.android.gms.common.util.C40996v;
import com.google.android.gms.common.wrappers.C41005a;
import com.google.android.gms.internal.base.C41067d;
import com.google.android.gms.internal.base.C41068e;
import com.google.android.gms.internal.base.C41078o;
import com.google.android.gms.internal.base.C41079p;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31053n;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.firebase.messaging.C33202j0;
import com.urbanairship.util.RetryingExecutor;
import java.util.ArrayList;
import java.util.Arrays;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {C41067d.class, C41068e.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
/* renamed from: com.google.android.gms.common.g */
public class C40713g extends C40715h {

    /* renamed from: h */
    public static final int f103690h = C40715h.f103695a;
    @C0359n0

    /* renamed from: i */
    public static final String f103691i = "com.google.android.gms";

    /* renamed from: j */
    public static final Object f103692j = new Object();

    /* renamed from: k */
    public static final C40713g f103693k = new C40713g();
    @C0323b0("mLock")

    /* renamed from: g */
    public String f103694g;

    @C0359n0
    /* renamed from: M */
    public static final C31047k m165639M(@C0359n0 C40660j jVar, @C0359n0 C40660j... jVarArr) {
        C40843u.m166203m(jVar, "Requested API must not be null.");
        for (C40660j m : jVarArr) {
            C40843u.m166203m(m, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(jVarArr.length + 1);
        arrayList.add(jVar);
        arrayList.addAll(Arrays.asList(jVarArr));
        return C40564i.m165101y().mo133939B(arrayList);
    }

    @C0359n0
    /* renamed from: x */
    public static C40713g m165640x() {
        return f103693k;
    }

    /* renamed from: A */
    public boolean mo134192A(@C0359n0 Activity activity, int i, int i2) {
        return mo134193B(activity, i, i2, (DialogInterface.OnCancelListener) null);
    }

    /* renamed from: B */
    public boolean mo134193B(@C0359n0 Activity activity, int i, int i2, @C0363p0 DialogInterface.OnCancelListener onCancelListener) {
        Dialog t = mo134214t(activity, i, i2, onCancelListener);
        if (t == null) {
            return false;
        }
        mo134199H(activity, t, C40717i.f103701k, onCancelListener);
        return true;
    }

    /* renamed from: C */
    public void mo134194C(@C0359n0 Context context, int i) {
        mo134200I(context, i, (String) null, mo134223g(context, i, 0, "n"));
    }

    /* renamed from: D */
    public void mo134195D(@C0359n0 Context context, @C0359n0 ConnectionResult connectionResult) {
        mo134200I(context, connectionResult.mo133591M(), (String) null, mo134217w(context, connectionResult));
    }

    @C0363p0
    /* renamed from: E */
    public final Dialog mo134196E(@C0359n0 Context context, int i, C40792n0 n0Var, @C0363p0 DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C40774j0.m165927d(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c = C40774j0.m165926c(context, i);
        if (c != null) {
            builder.setPositiveButton(c, n0Var);
        }
        String g = C40774j0.m165930g(context, i);
        if (g != null) {
            builder.setTitle(g);
        }
        String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[]{Integer.valueOf(i)});
        new IllegalArgumentException();
        return builder.create();
    }

    @C0359n0
    /* renamed from: F */
    public final Dialog mo134197F(@C0359n0 Activity activity, @C0359n0 DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C40774j0.m165927d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        mo134199H(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    @C0363p0
    /* renamed from: G */
    public final C40528c2 mo134198G(Context context, C40522b2 b2Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme(C22925d.f58520a);
        C40528c2 c2Var = new C40528c2(b2Var);
        C41078o.m166946y(context, c2Var, intentFilter);
        c2Var.mo133847a(context);
        if (mo134226n(context, "com.google.android.gms")) {
            return c2Var;
        }
        b2Var.mo133839a();
        c2Var.mo133848b();
        return null;
    }

    /* renamed from: H */
    public final void mo134199H(Activity activity, Dialog dialog, String str, @C0363p0 DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof C19232h) {
                C40930s.m166378L0(dialog, onCancelListener).show(((C19232h) activity).mo57175g0(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        C40680c.m165542b(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    /* renamed from: I */
    public final void mo134200I(Context context, int i, @C0363p0 String str, @C0363p0 PendingIntent pendingIntent) {
        int i2;
        String str2;
        String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i), null});
        new IllegalArgumentException();
        if (i == 18) {
            mo134201J(context);
        } else if (pendingIntent != null) {
            String f = C40774j0.m165929f(context, i);
            String e = C40774j0.m165928e(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) C40843u.m166202l(context.getSystemService(C33202j0.f80718b));
            C17075f2.C17092g z0 = new C17075f2.C17092g(context).mo51384e0(true).mo51346D(true).mo51364P(f).mo51425z0(new C17075f2.C17087e().mo51319A(e));
            if (C40986l.m166650k(context)) {
                C40843u.m166208r(C40996v.m166684i());
                z0.mo51414t0(context.getApplicationInfo().icon).mo51396k0(2);
                if (C40986l.m166651l(context)) {
                    z0.mo51375a(C40426a.C40429c.common_full_open_on_phone, resources.getString(C40426a.C40431e.common_open_on_phone), pendingIntent);
                } else {
                    z0.mo51362N(pendingIntent);
                }
            } else {
                z0.mo51414t0(17301642).mo51343B0(resources.getString(C40426a.C40431e.common_google_play_services_notification_ticker)).mo51355H0(System.currentTimeMillis()).mo51362N(pendingIntent).mo51363O(e);
            }
            if (C40996v.m166689n()) {
                C40843u.m166208r(C40996v.m166689n());
                synchronized (f103692j) {
                    str2 = this.f103694g;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel a = notificationManager.getNotificationChannel(str2);
                    String b = C40774j0.m165925b(context);
                    if (a == null) {
                        C0958j.m4306a();
                        notificationManager.createNotificationChannel(C0957i.m4305a(str2, b, 4));
                    } else if (!b.contentEquals(a.getName())) {
                        a.setName(b);
                        notificationManager.createNotificationChannel(a);
                    }
                }
                z0.mo51354H(str2);
            }
            Notification h = z0.mo51389h();
            if (i == 1 || i == 2 || i == 3) {
                C40864j.f103991g.set(false);
                i2 = C40864j.f103990f;
            } else {
                i2 = C40864j.f103989e;
            }
            notificationManager.notify(i2, h);
        }
    }

    /* renamed from: J */
    public final void mo134201J(Context context) {
        new C41001v(this, context).sendEmptyMessageDelayed(1, RetryingExecutor.f26394v);
    }

    /* renamed from: K */
    public final boolean mo134202K(@C0359n0 Activity activity, @C0359n0 C40587m mVar, int i, int i2, @C0363p0 DialogInterface.OnCancelListener onCancelListener) {
        Dialog E = mo134196E(activity, i, C40792n0.m165974d(mVar, mo134205e(activity, i, "d"), 2), onCancelListener);
        if (E == null) {
            return false;
        }
        mo134199H(activity, E, C40717i.f103701k, onCancelListener);
        return true;
    }

    /* renamed from: L */
    public final boolean mo134203L(@C0359n0 Context context, @C0359n0 ConnectionResult connectionResult, int i) {
        PendingIntent w;
        if (C41005a.m166705a(context) || (w = mo134217w(context, connectionResult)) == null) {
            return false;
        }
        mo134200I(context, connectionResult.mo133591M(), (String) null, PendingIntent.getActivity(context, 0, GoogleApiActivity.m164700a(context, w, i, true), C41079p.f104372a | C8698y1.f23301m));
        return true;
    }

    @C40473a
    @C40858y
    /* renamed from: c */
    public int mo134204c(@C0359n0 Context context) {
        return super.mo134204c(context);
    }

    @C0363p0
    @C40473a
    @C40858y
    /* renamed from: e */
    public Intent mo134205e(@C0363p0 Context context, int i, @C0363p0 String str) {
        return super.mo134205e(context, i, str);
    }

    @C0363p0
    /* renamed from: f */
    public PendingIntent mo134206f(@C0359n0 Context context, int i, int i2) {
        return super.mo134206f(context, i, i2);
    }

    @C0359n0
    /* renamed from: h */
    public final String mo134207h(int i) {
        return super.mo134207h(i);
    }

    @C40781l
    /* renamed from: j */
    public int mo134208j(@C0359n0 Context context) {
        return super.mo134208j(context);
    }

    @C40473a
    @C40858y
    /* renamed from: k */
    public int mo134209k(@C0359n0 Context context, int i) {
        return super.mo134209k(context, i);
    }

    /* renamed from: o */
    public final boolean mo134210o(int i) {
        return super.mo134210o(i);
    }

    @C0359n0
    /* renamed from: q */
    public C31047k<Void> mo134211q(@C0359n0 C40504h<?> hVar, @C0359n0 C40504h<?>... hVarArr) {
        return m165639M(hVar, hVarArr).mo87739w(C40961u.f104203a);
    }

    @C0359n0
    /* renamed from: r */
    public C31047k<Void> mo134212r(@C0359n0 C40660j<?> jVar, @C0359n0 C40660j<?>... jVarArr) {
        return m165639M(jVar, jVarArr).mo87739w(C40959t.f104202a);
    }

    @C0363p0
    /* renamed from: s */
    public Dialog mo134213s(@C0359n0 Activity activity, int i, int i2) {
        return mo134214t(activity, i, i2, (DialogInterface.OnCancelListener) null);
    }

    @C0363p0
    /* renamed from: t */
    public Dialog mo134214t(@C0359n0 Activity activity, int i, int i2, @C0363p0 DialogInterface.OnCancelListener onCancelListener) {
        return mo134196E(activity, i, C40792n0.m165972b(activity, mo134205e(activity, i, "d"), i2), onCancelListener);
    }

    @C0363p0
    /* renamed from: u */
    public Dialog mo134215u(@C0359n0 Fragment fragment, int i, int i2) {
        return mo134216v(fragment, i, i2, (DialogInterface.OnCancelListener) null);
    }

    @C0363p0
    /* renamed from: v */
    public Dialog mo134216v(@C0359n0 Fragment fragment, int i, int i2, @C0363p0 DialogInterface.OnCancelListener onCancelListener) {
        return mo134196E(fragment.requireContext(), i, C40792n0.m165973c(fragment, mo134205e(fragment.requireContext(), i, "d"), i2), onCancelListener);
    }

    @C0363p0
    /* renamed from: w */
    public PendingIntent mo134217w(@C0359n0 Context context, @C0359n0 ConnectionResult connectionResult) {
        if (connectionResult.mo133594X()) {
            return connectionResult.mo133593W();
        }
        return mo134206f(context, connectionResult.mo133591M(), 0);
    }

    @C0353k0
    @C0359n0
    /* renamed from: y */
    public C31047k<Void> mo134218y(@C0359n0 Activity activity) {
        int i = f103690h;
        C40843u.m166197g("makeGooglePlayServicesAvailable must be called from the main thread");
        int k = mo134209k(activity, i);
        if (k == 0) {
            return C31053n.m124525g(null);
        }
        C40567i2 u = C40567i2.m165132u(activity);
        u.mo134078t(new ConnectionResult(k, (PendingIntent) null), 0);
        return u.mo133964v();
    }

    @TargetApi(26)
    /* renamed from: z */
    public void mo134219z(@C0359n0 Context context, @C0359n0 String str) {
        if (C40996v.m166689n()) {
            C40843u.m166202l(((NotificationManager) C40843u.m166202l(context.getSystemService(C33202j0.f80718b))).getNotificationChannel(str));
        }
        synchronized (f103692j) {
            this.f103694g = str;
        }
    }
}
