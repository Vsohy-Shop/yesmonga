package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.util.C18001r;
import androidx.versionedparcelable.C20749g;

public final class RemoteActionCompat implements C20749g {
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: a */
    public IconCompat f44948a;
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: b */
    public CharSequence f44949b;
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: c */
    public CharSequence f44950c;
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: d */
    public PendingIntent f44951d;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: e */
    public boolean f44952e;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: f */
    public boolean f44953f;

    @C0376v0(26)
    /* renamed from: androidx.core.app.RemoteActionCompat$a */
    public static class C17006a {
        @C0373u
        /* renamed from: a */
        public static RemoteAction m78718a(Icon icon, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
            C17203p5.m79498a();
            return C17194o5.m79485a(icon, charSequence, charSequence2, pendingIntent);
        }

        @C0373u
        /* renamed from: b */
        public static PendingIntent m78719b(RemoteAction remoteAction) {
            return remoteAction.getActionIntent();
        }

        @C0373u
        /* renamed from: c */
        public static CharSequence m78720c(RemoteAction remoteAction) {
            return remoteAction.getContentDescription();
        }

        @C0373u
        /* renamed from: d */
        public static Icon m78721d(RemoteAction remoteAction) {
            return remoteAction.getIcon();
        }

        @C0373u
        /* renamed from: e */
        public static CharSequence m78722e(RemoteAction remoteAction) {
            return remoteAction.getTitle();
        }

        @C0373u
        /* renamed from: f */
        public static boolean m78723f(RemoteAction remoteAction) {
            return remoteAction.isEnabled();
        }

        @C0373u
        /* renamed from: g */
        public static void m78724g(RemoteAction remoteAction, boolean z) {
            remoteAction.setEnabled(z);
        }
    }

    @C0376v0(28)
    /* renamed from: androidx.core.app.RemoteActionCompat$b */
    public static class C17007b {
        @C0373u
        /* renamed from: a */
        public static void m78725a(RemoteAction remoteAction, boolean z) {
            remoteAction.setShouldShowIcon(z);
        }

        @C0373u
        /* renamed from: b */
        public static boolean m78726b(RemoteAction remoteAction) {
            return remoteAction.shouldShowIcon();
        }
    }

    public RemoteActionCompat(@C0359n0 IconCompat iconCompat, @C0359n0 CharSequence charSequence, @C0359n0 CharSequence charSequence2, @C0359n0 PendingIntent pendingIntent) {
        this.f44948a = (IconCompat) C18001r.m81775l(iconCompat);
        this.f44949b = (CharSequence) C18001r.m81775l(charSequence);
        this.f44950c = (CharSequence) C18001r.m81775l(charSequence2);
        this.f44951d = (PendingIntent) C18001r.m81775l(pendingIntent);
        this.f44952e = true;
        this.f44953f = true;
    }

    @C0359n0
    @C0376v0(26)
    /* renamed from: f */
    public static RemoteActionCompat m78708f(@C0359n0 RemoteAction remoteAction) {
        C18001r.m81775l(remoteAction);
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat(IconCompat.m80390l(C17006a.m78721d(remoteAction)), C17006a.m78722e(remoteAction), C17006a.m78720c(remoteAction), C17006a.m78719b(remoteAction));
        remoteActionCompat.mo51182l(C17006a.m78723f(remoteAction));
        if (Build.VERSION.SDK_INT >= 28) {
            remoteActionCompat.mo51183m(C17007b.m78726b(remoteAction));
        }
        return remoteActionCompat;
    }

    @C0359n0
    /* renamed from: g */
    public PendingIntent mo51177g() {
        return this.f44951d;
    }

    @C0359n0
    /* renamed from: h */
    public CharSequence mo51178h() {
        return this.f44950c;
    }

    @C0359n0
    /* renamed from: i */
    public IconCompat mo51179i() {
        return this.f44948a;
    }

    @C0359n0
    /* renamed from: j */
    public CharSequence mo51180j() {
        return this.f44949b;
    }

    /* renamed from: k */
    public boolean mo51181k() {
        return this.f44952e;
    }

    /* renamed from: l */
    public void mo51182l(boolean z) {
        this.f44952e = z;
    }

    /* renamed from: m */
    public void mo51183m(boolean z) {
        this.f44953f = z;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    /* renamed from: n */
    public boolean mo51184n() {
        return this.f44953f;
    }

    @C0359n0
    @C0376v0(26)
    /* renamed from: o */
    public RemoteAction mo51185o() {
        RemoteAction a = C17006a.m78718a(this.f44948a.mo51938K(), this.f44949b, this.f44950c, this.f44951d);
        C17006a.m78724g(a, mo51181k());
        if (Build.VERSION.SDK_INT >= 28) {
            C17007b.m78725a(a, mo51184n());
        }
        return a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public RemoteActionCompat() {
    }

    public RemoteActionCompat(@C0359n0 RemoteActionCompat remoteActionCompat) {
        C18001r.m81775l(remoteActionCompat);
        this.f44948a = remoteActionCompat.f44948a;
        this.f44949b = remoteActionCompat.f44949b;
        this.f44950c = remoteActionCompat.f44950c;
        this.f44951d = remoteActionCompat.f44951d;
        this.f44952e = remoteActionCompat.f44952e;
        this.f44953f = remoteActionCompat.f44953f;
    }
}
