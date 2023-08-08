package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.annotation.C0319a;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.browser.customtabs.C0901a;
import androidx.browser.customtabs.C0924h;
import androidx.core.app.C17125i;
import androidx.core.app.C17195p;
import androidx.core.content.C17318d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* renamed from: androidx.browser.customtabs.d */
public final class C0912d {

    /* renamed from: A */
    public static final int f2852A = 0;

    /* renamed from: B */
    public static final int f2853B = 1;

    /* renamed from: C */
    public static final int f2854C = 2;

    /* renamed from: D */
    public static final int f2855D = 2;

    /* renamed from: E */
    public static final String f2856E = "androidx.browser.customtabs.extra.SHARE_STATE";
    @Deprecated

    /* renamed from: F */
    public static final String f2857F = "android.support.customtabs.extra.SHARE_MENU_ITEM";

    /* renamed from: G */
    public static final String f2858G = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS";

    /* renamed from: H */
    public static final String f2859H = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS";

    /* renamed from: I */
    public static final String f2860I = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT";

    /* renamed from: J */
    public static final String f2861J = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_CLICKED_ID";

    /* renamed from: K */
    public static final String f2862K = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS";

    /* renamed from: L */
    public static final String f2863L = "androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS";

    /* renamed from: M */
    public static final String f2864M = "androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR";

    /* renamed from: N */
    public static final String f2865N = "androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR";

    /* renamed from: O */
    public static final String f2866O = "android.support.customtabs.customaction.ID";

    /* renamed from: P */
    public static final int f2867P = 0;

    /* renamed from: Q */
    public static final int f2868Q = 5;

    /* renamed from: c */
    public static final String f2869c = "android.support.customtabs.extra.user_opt_out";

    /* renamed from: d */
    public static final String f2870d = "android.support.customtabs.extra.SESSION";
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: e */
    public static final String f2871e = "android.support.customtabs.extra.SESSION_ID";

    /* renamed from: f */
    public static final int f2872f = 0;

    /* renamed from: g */
    public static final int f2873g = 1;

    /* renamed from: h */
    public static final int f2874h = 2;

    /* renamed from: i */
    public static final int f2875i = 2;

    /* renamed from: j */
    public static final String f2876j = "androidx.browser.customtabs.extra.COLOR_SCHEME";

    /* renamed from: k */
    public static final String f2877k = "android.support.customtabs.extra.TOOLBAR_COLOR";

    /* renamed from: l */
    public static final String f2878l = "android.support.customtabs.extra.ENABLE_URLBAR_HIDING";

    /* renamed from: m */
    public static final String f2879m = "android.support.customtabs.extra.CLOSE_BUTTON_ICON";

    /* renamed from: n */
    public static final String f2880n = "android.support.customtabs.extra.TITLE_VISIBILITY";

    /* renamed from: o */
    public static final int f2881o = 0;

    /* renamed from: p */
    public static final int f2882p = 1;

    /* renamed from: q */
    public static final String f2883q = "android.support.customtabs.extra.ACTION_BUTTON_BUNDLE";

    /* renamed from: r */
    public static final String f2884r = "android.support.customtabs.extra.TOOLBAR_ITEMS";

    /* renamed from: s */
    public static final String f2885s = "android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR";

    /* renamed from: t */
    public static final String f2886t = "android.support.customtabs.customaction.ICON";

    /* renamed from: u */
    public static final String f2887u = "android.support.customtabs.customaction.DESCRIPTION";

    /* renamed from: v */
    public static final String f2888v = "android.support.customtabs.customaction.PENDING_INTENT";

    /* renamed from: w */
    public static final String f2889w = "android.support.customtabs.extra.TINT_ACTION_BUTTON";

    /* renamed from: x */
    public static final String f2890x = "android.support.customtabs.extra.MENU_ITEMS";

    /* renamed from: y */
    public static final String f2891y = "android.support.customtabs.customaction.MENU_ITEM_TITLE";

    /* renamed from: z */
    public static final String f2892z = "android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE";
    @C0359n0

    /* renamed from: a */
    public final Intent f2893a;
    @C0363p0

    /* renamed from: b */
    public final Bundle f2894b;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.browser.customtabs.d$b */
    public @interface C0914b {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.browser.customtabs.d$c */
    public @interface C0915c {
    }

    public C0912d(@C0359n0 Intent intent, @C0363p0 Bundle bundle) {
        this.f2893a = intent;
        this.f2894b = bundle;
    }

    @C0359n0
    /* renamed from: a */
    public static C0901a m4100a(@C0359n0 Intent intent, int i) {
        Bundle bundle;
        if (i < 0 || i > 2 || i == 0) {
            throw new IllegalArgumentException("Invalid colorScheme: " + i);
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return C0901a.m4065a((Bundle) null);
        }
        C0901a a = C0901a.m4065a(extras);
        SparseArray sparseParcelableArray = extras.getSparseParcelableArray(f2863L);
        if (sparseParcelableArray == null || (bundle = (Bundle) sparseParcelableArray.get(i)) == null) {
            return a;
        }
        return C0901a.m4065a(bundle).mo3890c(a);
    }

    /* renamed from: b */
    public static int m4101b() {
        return 5;
    }

    @C0359n0
    /* renamed from: d */
    public static Intent m4102d(@C0363p0 Intent intent) {
        if (intent == null) {
            intent = new Intent("android.intent.action.VIEW");
        }
        intent.addFlags(268435456);
        intent.putExtra(f2869c, true);
        return intent;
    }

    /* renamed from: e */
    public static boolean m4103e(@C0359n0 Intent intent) {
        if (!intent.getBooleanExtra(f2869c, false) || (intent.getFlags() & 268435456) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public void mo3916c(@C0359n0 Context context, @C0359n0 Uri uri) {
        this.f2893a.setData(uri);
        C17318d.m79740w(context, this.f2893a, this.f2894b);
    }

    /* renamed from: androidx.browser.customtabs.d$a */
    public static final class C0913a {

        /* renamed from: a */
        public final Intent f2895a = new Intent("android.intent.action.VIEW");

        /* renamed from: b */
        public final C0901a.C0902a f2896b = new C0901a.C0902a();
        @C0363p0

        /* renamed from: c */
        public ArrayList<Bundle> f2897c;
        @C0363p0

        /* renamed from: d */
        public Bundle f2898d;
        @C0363p0

        /* renamed from: e */
        public ArrayList<Bundle> f2899e;
        @C0363p0

        /* renamed from: f */
        public SparseArray<Bundle> f2900f;
        @C0363p0

        /* renamed from: g */
        public Bundle f2901g;

        /* renamed from: h */
        public int f2902h = 0;

        /* renamed from: i */
        public boolean f2903i = true;

        public C0913a() {
        }

        @C0359n0
        @Deprecated
        /* renamed from: a */
        public C0913a mo3917a() {
            mo3938v(1);
            return this;
        }

        @C0359n0
        /* renamed from: b */
        public C0913a mo3918b(@C0359n0 String str, @C0359n0 PendingIntent pendingIntent) {
            if (this.f2897c == null) {
                this.f2897c = new ArrayList<>();
            }
            Bundle bundle = new Bundle();
            bundle.putString(C0912d.f2891y, str);
            bundle.putParcelable(C0912d.f2888v, pendingIntent);
            this.f2897c.add(bundle);
            return this;
        }

        @C0359n0
        @Deprecated
        /* renamed from: c */
        public C0913a mo3919c(int i, @C0359n0 Bitmap bitmap, @C0359n0 String str, @C0359n0 PendingIntent pendingIntent) throws IllegalStateException {
            if (this.f2899e == null) {
                this.f2899e = new ArrayList<>();
            }
            if (this.f2899e.size() < 5) {
                Bundle bundle = new Bundle();
                bundle.putInt(C0912d.f2866O, i);
                bundle.putParcelable(C0912d.f2886t, bitmap);
                bundle.putString(C0912d.f2887u, str);
                bundle.putParcelable(C0912d.f2888v, pendingIntent);
                this.f2899e.add(bundle);
                return this;
            }
            throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
        }

        @C0359n0
        /* renamed from: d */
        public C0912d mo3920d() {
            if (!this.f2895a.hasExtra(C0912d.f2870d)) {
                mo3937u((IBinder) null, (PendingIntent) null);
            }
            ArrayList<Bundle> arrayList = this.f2897c;
            if (arrayList != null) {
                this.f2895a.putParcelableArrayListExtra(C0912d.f2890x, arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f2899e;
            if (arrayList2 != null) {
                this.f2895a.putParcelableArrayListExtra(C0912d.f2884r, arrayList2);
            }
            this.f2895a.putExtra(C0912d.f2862K, this.f2903i);
            this.f2895a.putExtras(this.f2896b.mo3891a().mo3889b());
            Bundle bundle = this.f2901g;
            if (bundle != null) {
                this.f2895a.putExtras(bundle);
            }
            if (this.f2900f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray(C0912d.f2863L, this.f2900f);
                this.f2895a.putExtras(bundle2);
            }
            this.f2895a.putExtra(C0912d.f2856E, this.f2902h);
            return new C0912d(this.f2895a, this.f2898d);
        }

        @C0359n0
        @Deprecated
        /* renamed from: e */
        public C0913a mo3921e() {
            this.f2895a.putExtra(C0912d.f2878l, true);
            return this;
        }

        @C0359n0
        /* renamed from: f */
        public C0913a mo3922f(@C0359n0 Bitmap bitmap, @C0359n0 String str, @C0359n0 PendingIntent pendingIntent) {
            return mo3923g(bitmap, str, pendingIntent, false);
        }

        @C0359n0
        /* renamed from: g */
        public C0913a mo3923g(@C0359n0 Bitmap bitmap, @C0359n0 String str, @C0359n0 PendingIntent pendingIntent, boolean z) {
            Bundle bundle = new Bundle();
            bundle.putInt(C0912d.f2866O, 0);
            bundle.putParcelable(C0912d.f2886t, bitmap);
            bundle.putString(C0912d.f2887u, str);
            bundle.putParcelable(C0912d.f2888v, pendingIntent);
            this.f2895a.putExtra(C0912d.f2883q, bundle);
            this.f2895a.putExtra(C0912d.f2889w, z);
            return this;
        }

        @C0359n0
        /* renamed from: h */
        public C0913a mo3924h(@C0359n0 Bitmap bitmap) {
            this.f2895a.putExtra(C0912d.f2879m, bitmap);
            return this;
        }

        @C0359n0
        /* renamed from: i */
        public C0913a mo3925i(int i) {
            if (i < 0 || i > 2) {
                throw new IllegalArgumentException("Invalid value for the colorScheme argument");
            }
            this.f2895a.putExtra(C0912d.f2876j, i);
            return this;
        }

        @C0359n0
        /* renamed from: j */
        public C0913a mo3926j(int i, @C0359n0 C0901a aVar) {
            if (i < 0 || i > 2 || i == 0) {
                throw new IllegalArgumentException("Invalid colorScheme: " + i);
            }
            if (this.f2900f == null) {
                this.f2900f = new SparseArray<>();
            }
            this.f2900f.put(i, aVar.mo3889b());
            return this;
        }

        @C0359n0
        /* renamed from: k */
        public C0913a mo3927k(@C0359n0 C0901a aVar) {
            this.f2901g = aVar.mo3889b();
            return this;
        }

        @C0359n0
        @Deprecated
        /* renamed from: l */
        public C0913a mo3928l(boolean z) {
            if (z) {
                mo3938v(1);
            } else {
                mo3938v(2);
            }
            return this;
        }

        @C0359n0
        /* renamed from: m */
        public C0913a mo3929m(@C0359n0 Context context, @C0319a int i, @C0319a int i2) {
            this.f2895a.putExtra(C0912d.f2892z, C17125i.m79331d(context, i, i2).mo51574l());
            return this;
        }

        @C0359n0
        /* renamed from: n */
        public C0913a mo3930n(boolean z) {
            this.f2903i = z;
            return this;
        }

        @C0359n0
        @Deprecated
        /* renamed from: o */
        public C0913a mo3931o(@C0354l int i) {
            this.f2896b.mo3892b(i);
            return this;
        }

        @C0359n0
        @Deprecated
        /* renamed from: p */
        public C0913a mo3932p(@C0354l int i) {
            this.f2896b.mo3893c(i);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* renamed from: q */
        public C0913a mo3933q(@C0359n0 C0924h.C0926b bVar) {
            mo3937u((IBinder) null, bVar.mo3974b());
            return this;
        }

        @C0359n0
        @Deprecated
        /* renamed from: r */
        public C0913a mo3934r(@C0354l int i) {
            this.f2896b.mo3894d(i);
            return this;
        }

        @C0359n0
        /* renamed from: s */
        public C0913a mo3935s(@C0359n0 RemoteViews remoteViews, @C0363p0 int[] iArr, @C0363p0 PendingIntent pendingIntent) {
            this.f2895a.putExtra(C0912d.f2858G, remoteViews);
            this.f2895a.putExtra(C0912d.f2859H, iArr);
            this.f2895a.putExtra(C0912d.f2860I, pendingIntent);
            return this;
        }

        @C0359n0
        /* renamed from: t */
        public C0913a mo3936t(@C0359n0 C0924h hVar) {
            this.f2895a.setPackage(hVar.mo3963e().getPackageName());
            mo3937u(hVar.mo3962d(), hVar.mo3964f());
            return this;
        }

        /* renamed from: u */
        public final void mo3937u(@C0363p0 IBinder iBinder, @C0363p0 PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            C17195p.m79487b(bundle, C0912d.f2870d, iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable(C0912d.f2871e, pendingIntent);
            }
            this.f2895a.putExtras(bundle);
        }

        @C0359n0
        /* renamed from: v */
        public C0913a mo3938v(int i) {
            if (i < 0 || i > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.f2902h = i;
            if (i == 1) {
                this.f2895a.putExtra(C0912d.f2857F, true);
            } else if (i == 2) {
                this.f2895a.putExtra(C0912d.f2857F, false);
            } else {
                this.f2895a.removeExtra(C0912d.f2857F);
            }
            return this;
        }

        @C0359n0
        /* renamed from: w */
        public C0913a mo3939w(boolean z) {
            this.f2895a.putExtra(C0912d.f2880n, z ? 1 : 0);
            return this;
        }

        @C0359n0
        /* renamed from: x */
        public C0913a mo3940x(@C0359n0 Context context, @C0319a int i, @C0319a int i2) {
            this.f2898d = C17125i.m79331d(context, i, i2).mo51574l();
            return this;
        }

        @C0359n0
        @Deprecated
        /* renamed from: y */
        public C0913a mo3941y(@C0354l int i) {
            this.f2896b.mo3895e(i);
            return this;
        }

        @C0359n0
        /* renamed from: z */
        public C0913a mo3942z(boolean z) {
            this.f2895a.putExtra(C0912d.f2878l, z);
            return this;
        }

        public C0913a(@C0363p0 C0924h hVar) {
            if (hVar != null) {
                mo3936t(hVar);
            }
        }
    }
}
