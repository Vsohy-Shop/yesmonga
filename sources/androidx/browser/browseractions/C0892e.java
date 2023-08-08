package androidx.browser.browseractions;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.C8698y1;
import androidx.core.content.C17318d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Deprecated
/* renamed from: androidx.browser.browseractions.e */
public class C0892e {

    /* renamed from: b */
    public static final String f2759b = "BrowserActions";

    /* renamed from: c */
    public static final String f2760c = "https://www.example.com";

    /* renamed from: d */
    public static final String f2761d = "androidx.browser.browseractions.APP_ID";

    /* renamed from: e */
    public static final String f2762e = "androidx.browser.browseractions.browser_action_open";

    /* renamed from: f */
    public static final String f2763f = "androidx.browser.browseractions.ICON_ID";

    /* renamed from: g */
    public static final String f2764g = "androidx.browser.browseractions.ICON_URI";

    /* renamed from: h */
    public static final String f2765h = "androidx.browser.browseractions.TITLE";

    /* renamed from: i */
    public static final String f2766i = "androidx.browser.browseractions.ACTION";

    /* renamed from: j */
    public static final String f2767j = "androidx.browser.browseractions.extra.TYPE";

    /* renamed from: k */
    public static final String f2768k = "androidx.browser.browseractions.extra.MENU_ITEMS";

    /* renamed from: l */
    public static final String f2769l = "androidx.browser.browseractions.extra.SELECTED_ACTION_PENDING_INTENT";
    @SuppressLint({"MinMaxConstant"})

    /* renamed from: m */
    public static final int f2770m = 5;

    /* renamed from: n */
    public static final int f2771n = 0;

    /* renamed from: o */
    public static final int f2772o = 1;

    /* renamed from: p */
    public static final int f2773p = 2;

    /* renamed from: q */
    public static final int f2774q = 3;

    /* renamed from: r */
    public static final int f2775r = 4;

    /* renamed from: s */
    public static final int f2776s = 5;

    /* renamed from: t */
    public static final int f2777t = -1;

    /* renamed from: u */
    public static final int f2778u = 0;

    /* renamed from: v */
    public static final int f2779v = 1;

    /* renamed from: w */
    public static final int f2780w = 2;

    /* renamed from: x */
    public static final int f2781x = 3;

    /* renamed from: y */
    public static final int f2782y = 4;
    @C0363p0

    /* renamed from: z */
    public static C0893a f2783z;
    @C0359n0

    /* renamed from: a */
    public final Intent f2784a;

    @C0344h1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.browser.browseractions.e$a */
    public interface C0893a {
        /* renamed from: a */
        void mo3873a();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.browser.browseractions.e$b */
    public @interface C0894b {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.browser.browseractions.e$c */
    public @interface C0895c {
    }

    /* renamed from: androidx.browser.browseractions.e$d */
    public static final class C0896d {

        /* renamed from: a */
        public final Intent f2785a = new Intent(C0892e.f2762e);

        /* renamed from: b */
        public Context f2786b;

        /* renamed from: c */
        public Uri f2787c;

        /* renamed from: d */
        public int f2788d = 0;

        /* renamed from: e */
        public ArrayList<Bundle> f2789e = new ArrayList<>();
        @C0363p0

        /* renamed from: f */
        public PendingIntent f2790f = null;

        /* renamed from: g */
        public List<Uri> f2791g = new ArrayList();

        public C0896d(@C0359n0 Context context, @C0359n0 Uri uri) {
            this.f2786b = context;
            this.f2787c = uri;
        }

        @C0359n0
        /* renamed from: a */
        public C0892e mo3874a() {
            this.f2785a.setData(this.f2787c);
            this.f2785a.putExtra(C0892e.f2767j, this.f2788d);
            this.f2785a.putParcelableArrayListExtra(C0892e.f2768k, this.f2789e);
            this.f2785a.putExtra(C0892e.f2761d, PendingIntent.getActivity(this.f2786b, 0, new Intent(), C8698y1.f23302n));
            PendingIntent pendingIntent = this.f2790f;
            if (pendingIntent != null) {
                this.f2785a.putExtra(C0892e.f2769l, pendingIntent);
            }
            C0897f.m4055k(this.f2785a, this.f2791g, this.f2786b);
            return new C0892e(this.f2785a);
        }

        @C0359n0
        /* renamed from: b */
        public final Bundle mo3875b(@C0359n0 C0880a aVar) {
            Bundle bundle = new Bundle();
            bundle.putString(C0892e.f2765h, aVar.mo3848e());
            bundle.putParcelable(C0892e.f2766i, aVar.mo3844a());
            if (aVar.mo3845b() != 0) {
                bundle.putInt(C0892e.f2763f, aVar.mo3845b());
            }
            if (aVar.mo3846c() != null) {
                bundle.putParcelable(C0892e.f2764g, aVar.mo3846c());
            }
            return bundle;
        }

        @C0359n0
        /* renamed from: c */
        public C0896d mo3876c(@C0359n0 ArrayList<C0880a> arrayList) {
            if (arrayList.size() <= 5) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (TextUtils.isEmpty(arrayList.get(i).mo3848e()) || arrayList.get(i).mo3844a() == null) {
                        throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
                    }
                    this.f2789e.add(mo3875b(arrayList.get(i)));
                    if (arrayList.get(i).mo3846c() != null) {
                        this.f2791g.add(arrayList.get(i).mo3846c());
                    }
                }
                return this;
            }
            throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
        }

        @C0359n0
        /* renamed from: d */
        public C0896d mo3877d(@C0359n0 C0880a... aVarArr) {
            return mo3876c(new ArrayList(Arrays.asList(aVarArr)));
        }

        @C0359n0
        /* renamed from: e */
        public C0896d mo3878e(@C0359n0 PendingIntent pendingIntent) {
            this.f2790f = pendingIntent;
            return this;
        }

        @C0359n0
        /* renamed from: f */
        public C0896d mo3879f(int i) {
            this.f2788d = i;
            return this;
        }
    }

    public C0892e(@C0359n0 Intent intent) {
        this.f2784a = intent;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: a */
    public static List<ResolveInfo> m4035a(@C0359n0 Context context) {
        return context.getPackageManager().queryIntentActivities(new Intent(f2762e, Uri.parse(f2760c)), 131072);
    }

    @C0363p0
    @Deprecated
    /* renamed from: b */
    public static String m4036b(@C0359n0 Intent intent) {
        return m4037d(intent);
    }

    @C0363p0
    /* renamed from: d */
    public static String m4037d(@C0359n0 Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(f2761d);
        if (pendingIntent != null) {
            return pendingIntent.getCreatorPackage();
        }
        return null;
    }

    /* renamed from: e */
    public static void m4038e(@C0359n0 Context context, @C0359n0 Intent intent) {
        m4039f(context, intent, m4035a(context));
    }

    @C0344h1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: f */
    public static void m4039f(Context context, Intent intent, List<ResolveInfo> list) {
        if (list == null || list.size() == 0) {
            m4042i(context, intent);
            return;
        }
        int i = 0;
        if (list.size() == 1) {
            intent.setPackage(list.get(0).activityInfo.packageName);
        } else {
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(f2760c)), 65536);
            if (resolveActivity != null) {
                String str = resolveActivity.activityInfo.packageName;
                while (true) {
                    if (i >= list.size()) {
                        break;
                    } else if (str.equals(list.get(i).activityInfo.packageName)) {
                        intent.setPackage(str);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        C17318d.m79740w(context, intent, (Bundle) null);
    }

    /* renamed from: g */
    public static void m4040g(@C0359n0 Context context, @C0359n0 Uri uri) {
        m4038e(context, new C0896d(context, uri).mo3874a().mo3872c());
    }

    /* renamed from: h */
    public static void m4041h(@C0359n0 Context context, @C0359n0 Uri uri, int i, @C0359n0 ArrayList<C0880a> arrayList, @C0359n0 PendingIntent pendingIntent) {
        m4038e(context, new C0896d(context, uri).mo3879f(i).mo3876c(arrayList).mo3878e(pendingIntent).mo3874a().mo3872c());
    }

    /* renamed from: i */
    public static void m4042i(Context context, Intent intent) {
        List<C0880a> list;
        Uri data = intent.getData();
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(f2768k);
        if (parcelableArrayListExtra != null) {
            list = m4044k(parcelableArrayListExtra);
        } else {
            list = null;
        }
        m4043j(context, data, list);
    }

    /* renamed from: j */
    public static void m4043j(Context context, Uri uri, List<C0880a> list) {
        new C0887d(context, uri, list).mo3864e();
        C0893a aVar = f2783z;
        if (aVar != null) {
            aVar.mo3873a();
        }
    }

    @C0359n0
    /* renamed from: k */
    public static List<C0880a> m4044k(@C0359n0 ArrayList<Bundle> arrayList) {
        C0880a aVar;
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            Bundle bundle = arrayList.get(i);
            String string = bundle.getString(f2765h);
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(f2766i);
            int i2 = bundle.getInt(f2763f);
            Uri uri = (Uri) bundle.getParcelable(f2764g);
            if (TextUtils.isEmpty(string) || pendingIntent == null) {
                throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
            }
            if (i2 != 0) {
                aVar = new C0880a(string, pendingIntent, i2);
            } else {
                aVar = new C0880a(string, pendingIntent, uri);
            }
            arrayList2.add(aVar);
        }
        return arrayList2;
    }

    @C0344h1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: l */
    public static void m4045l(C0893a aVar) {
        f2783z = aVar;
    }

    @C0359n0
    /* renamed from: c */
    public Intent mo3872c() {
        return this.f2784a;
    }
}
