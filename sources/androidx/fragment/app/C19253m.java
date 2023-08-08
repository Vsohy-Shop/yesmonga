package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.app.C17018b;
import androidx.core.content.C17318d;
import androidx.core.util.C18001r;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.fragment.app.m */
public abstract class C19253m<E> extends C19240j {
    @C0363p0

    /* renamed from: a */
    public final Activity f49552a;
    @C0359n0

    /* renamed from: b */
    public final Context f49553b;
    @C0359n0

    /* renamed from: c */
    public final Handler f49554c;

    /* renamed from: d */
    public final int f49555d;

    /* renamed from: e */
    public final FragmentManager f49556e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C19253m(@C0359n0 Context context, @C0359n0 Handler handler, int i) {
        this(context instanceof Activity ? (Activity) context : null, context, handler, i);
    }

    /* renamed from: A */
    public void mo57313A(@C0359n0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, @C0363p0 Bundle bundle) {
        if (i == -1) {
            C17318d.m79740w(this.f49553b, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    @Deprecated
    /* renamed from: B */
    public void mo57314B(@C0359n0 Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @C0363p0 Intent intent, int i2, int i3, int i4, @C0363p0 Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            C17018b.m78751R(this.f49552a, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
    }

    /* renamed from: D */
    public void mo57192D() {
    }

    @C0363p0
    /* renamed from: c */
    public View mo56759c(int i) {
        return null;
    }

    /* renamed from: g */
    public boolean mo56760g() {
        return true;
    }

    /* access modifiers changed from: package-private */
    @C0363p0
    /* renamed from: j */
    public Activity mo57315j() {
        return this.f49552a;
    }

    /* access modifiers changed from: package-private */
    @C0359n0
    /* renamed from: k */
    public Context mo57316k() {
        return this.f49553b;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: l */
    public Handler mo57317l() {
        return this.f49554c;
    }

    /* renamed from: m */
    public void mo57194m(@C0359n0 String str, @C0363p0 FileDescriptor fileDescriptor, @C0359n0 PrintWriter printWriter, @C0363p0 String[] strArr) {
    }

    @C0363p0
    /* renamed from: n */
    public abstract E mo57195n();

    @C0359n0
    /* renamed from: o */
    public LayoutInflater mo57196o() {
        return LayoutInflater.from(this.f49553b);
    }

    /* renamed from: q */
    public int mo57197q() {
        return this.f49555d;
    }

    /* renamed from: s */
    public boolean mo57198s() {
        return true;
    }

    @Deprecated
    /* renamed from: t */
    public void mo57318t(@C0359n0 Fragment fragment, @C0359n0 String[] strArr, int i) {
    }

    /* renamed from: w */
    public boolean mo57199w(@C0359n0 Fragment fragment) {
        return true;
    }

    /* renamed from: y */
    public boolean mo57200y(@C0359n0 String str) {
        return false;
    }

    /* renamed from: z */
    public void mo57319z(@C0359n0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        mo57313A(fragment, intent, i, (Bundle) null);
    }

    public C19253m(@C0359n0 C19232h hVar) {
        this(hVar, hVar, new Handler(), 0);
    }

    public C19253m(@C0363p0 Activity activity, @C0359n0 Context context, @C0359n0 Handler handler, int i) {
        this.f49556e = new C19278w();
        this.f49552a = activity;
        this.f49553b = (Context) C18001r.m81776m(context, "context == null");
        this.f49554c = (Handler) C18001r.m81776m(handler, "handler == null");
        this.f49555d = i;
    }
}
