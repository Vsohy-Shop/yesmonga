package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import androidx.annotation.C0323b0;
import androidx.profileinstaller.C20006f;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.common.util.C40996v;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31053n;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@C40473a
/* renamed from: com.google.firebase.messaging.n */
public class C33215n {

    /* renamed from: c */
    public static final String f80757c = "rawData";

    /* renamed from: d */
    public static final String f80758d = "gcm.rawData64";

    /* renamed from: e */
    public static final Object f80759e = new Object();
    @C0323b0("lock")

    /* renamed from: f */
    public static C33213m1 f80760f;

    /* renamed from: a */
    public final Context f80761a;

    /* renamed from: b */
    public final Executor f80762b;

    public C33215n(Context context) {
        this.f80761a = context;
        this.f80762b = new C20006f();
    }

    /* renamed from: d */
    public static C31047k<Integer> m134003d(Context context, Intent intent) {
        if (C33254w0.m134108b().mo96214e(context)) {
            C33196h1.m133902i(context, m134004e(context, "com.google.firebase.MESSAGING_EVENT"), intent);
        } else {
            m134004e(context, "com.google.firebase.MESSAGING_EVENT").mo96137c(intent);
        }
        return C31053n.m124525g(-1);
    }

    /* renamed from: e */
    public static C33213m1 m134004e(Context context, String str) {
        C33213m1 m1Var;
        synchronized (f80759e) {
            if (f80760f == null) {
                f80760f = new C33213m1(context, str);
            }
            m1Var = f80760f;
        }
        return m1Var;
    }

    /* renamed from: g */
    public static /* synthetic */ Integer m134006g(C31047k kVar) throws Exception {
        return 403;
    }

    /* renamed from: h */
    public static /* synthetic */ C31047k m134007h(Context context, Intent intent, C31047k kVar) throws Exception {
        if (!C40996v.m166689n() || ((Integer) kVar.mo87734r()).intValue() != 402) {
            return kVar;
        }
        return m134003d(context, intent).mo87730n(new C20006f(), new C33211m());
    }

    @C40974d0
    /* renamed from: j */
    public static void m134008j() {
        synchronized (f80759e) {
            f80760f = null;
        }
    }

    @C40473a
    /* renamed from: i */
    public C31047k<Integer> mo96144i(Intent intent) {
        String stringExtra = intent.getStringExtra(f80758d);
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra(f80758d);
        }
        return mo96145k(this.f80761a, intent);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: k */
    public C31047k<Integer> mo96145k(Context context, Intent intent) {
        boolean z;
        boolean z2 = true;
        if (!C40996v.m166689n() || context.getApplicationInfo().targetSdkVersion < 26) {
            z = false;
        } else {
            z = true;
        }
        if ((intent.getFlags() & 268435456) == 0) {
            z2 = false;
        }
        if (!z || z2) {
            return C31053n.m124522d(this.f80762b, new C33205k(context, intent)).mo87732p(this.f80762b, new C33208l(context, intent));
        }
        return m134003d(context, intent);
    }

    public C33215n(Context context, ExecutorService executorService) {
        this.f80761a = context;
        this.f80762b = executorService;
    }
}
