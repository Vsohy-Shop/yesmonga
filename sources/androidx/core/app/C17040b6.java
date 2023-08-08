package androidx.core.app;

import android.app.Activity;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Html;
import android.text.Spanned;
import android.view.ActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ShareActionProvider;
import androidx.annotation.C0324b1;
import androidx.annotation.C0329d0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.core.content.C17344j;
import androidx.core.util.C18001r;
import java.util.ArrayList;

/* renamed from: androidx.core.app.b6 */
public final class C17040b6 {

    /* renamed from: a */
    public static final String f44994a = "androidx.core.app.EXTRA_CALLING_PACKAGE";

    /* renamed from: b */
    public static final String f44995b = "android.support.v4.app.EXTRA_CALLING_PACKAGE";

    /* renamed from: c */
    public static final String f44996c = "androidx.core.app.EXTRA_CALLING_ACTIVITY";

    /* renamed from: d */
    public static final String f44997d = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";

    /* renamed from: e */
    public static final String f44998e = ".sharecompat_";

    @C0376v0(16)
    /* renamed from: androidx.core.app.b6$a */
    public static class C17041a {
        @C0373u
        /* renamed from: a */
        public static String m78807a(CharSequence charSequence) {
            return Html.escapeHtml(charSequence);
        }

        @C0373u
        /* renamed from: b */
        public static void m78808b(@C0359n0 Intent intent, @C0359n0 ArrayList<Uri> arrayList) {
            ClipData clipData = new ClipData((CharSequence) null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra(C17344j.f45612b), (Intent) null, arrayList.get(0)));
            int size = arrayList.size();
            for (int i = 1; i < size; i++) {
                clipData.addItem(new ClipData.Item(arrayList.get(i)));
            }
            intent.setClipData(clipData);
            intent.addFlags(1);
        }

        @C0373u
        /* renamed from: c */
        public static void m78809c(@C0359n0 Intent intent) {
            intent.setClipData((ClipData) null);
            intent.setFlags(intent.getFlags() & -2);
        }
    }

    /* renamed from: androidx.core.app.b6$b */
    public static class C17042b {
        @C0359n0

        /* renamed from: a */
        public final Context f44999a;
        @C0359n0

        /* renamed from: b */
        public final Intent f45000b;
        @C0363p0

        /* renamed from: c */
        public CharSequence f45001c;
        @C0363p0

        /* renamed from: d */
        public ArrayList<String> f45002d;
        @C0363p0

        /* renamed from: e */
        public ArrayList<String> f45003e;
        @C0363p0

        /* renamed from: f */
        public ArrayList<String> f45004f;
        @C0363p0

        /* renamed from: g */
        public ArrayList<Uri> f45005g;

        public C17042b(@C0359n0 Context context) {
            Activity activity;
            this.f44999a = (Context) C18001r.m81775l(context);
            Intent action = new Intent().setAction("android.intent.action.SEND");
            this.f45000b = action;
            action.putExtra(C17040b6.f44994a, context.getPackageName());
            action.putExtra(C17040b6.f44995b, context.getPackageName());
            action.addFlags(524288);
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                ComponentName componentName = activity.getComponentName();
                this.f45000b.putExtra(C17040b6.f44996c, componentName);
                this.f45000b.putExtra(C17040b6.f44997d, componentName);
            }
        }

        @C0359n0
        @Deprecated
        /* renamed from: k */
        public static C17042b m78810k(@C0359n0 Activity activity) {
            return new C17042b(activity);
        }

        @C0359n0
        /* renamed from: a */
        public C17042b mo51198a(@C0359n0 String str) {
            if (this.f45004f == null) {
                this.f45004f = new ArrayList<>();
            }
            this.f45004f.add(str);
            return this;
        }

        @C0359n0
        /* renamed from: b */
        public C17042b mo51199b(@C0359n0 String[] strArr) {
            mo51206i("android.intent.extra.BCC", strArr);
            return this;
        }

        @C0359n0
        /* renamed from: c */
        public C17042b mo51200c(@C0359n0 String str) {
            if (this.f45003e == null) {
                this.f45003e = new ArrayList<>();
            }
            this.f45003e.add(str);
            return this;
        }

        @C0359n0
        /* renamed from: d */
        public C17042b mo51201d(@C0359n0 String[] strArr) {
            mo51206i("android.intent.extra.CC", strArr);
            return this;
        }

        @C0359n0
        /* renamed from: e */
        public C17042b mo51202e(@C0359n0 String str) {
            if (this.f45002d == null) {
                this.f45002d = new ArrayList<>();
            }
            this.f45002d.add(str);
            return this;
        }

        @C0359n0
        /* renamed from: f */
        public C17042b mo51203f(@C0359n0 String[] strArr) {
            mo51206i("android.intent.extra.EMAIL", strArr);
            return this;
        }

        @C0359n0
        /* renamed from: g */
        public C17042b mo51204g(@C0359n0 Uri uri) {
            if (this.f45005g == null) {
                this.f45005g = new ArrayList<>();
            }
            this.f45005g.add(uri);
            return this;
        }

        /* renamed from: h */
        public final void mo51205h(String str, ArrayList<String> arrayList) {
            int i;
            String[] stringArrayExtra = this.f45000b.getStringArrayExtra(str);
            if (stringArrayExtra != null) {
                i = stringArrayExtra.length;
            } else {
                i = 0;
            }
            String[] strArr = new String[(arrayList.size() + i)];
            arrayList.toArray(strArr);
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), i);
            }
            this.f45000b.putExtra(str, strArr);
        }

        /* renamed from: i */
        public final void mo51206i(@C0363p0 String str, @C0359n0 String[] strArr) {
            int i;
            Intent m = mo51209m();
            String[] stringArrayExtra = m.getStringArrayExtra(str);
            if (stringArrayExtra != null) {
                i = stringArrayExtra.length;
            } else {
                i = 0;
            }
            String[] strArr2 = new String[(strArr.length + i)];
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr2, 0, i);
            }
            System.arraycopy(strArr, 0, strArr2, i, strArr.length);
            m.putExtra(str, strArr2);
        }

        @C0359n0
        /* renamed from: j */
        public Intent mo51207j() {
            return Intent.createChooser(mo51209m(), this.f45001c);
        }

        @C0359n0
        /* renamed from: l */
        public Context mo51208l() {
            return this.f44999a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
            if (r0.size() > 1) goto L_0x0030;
         */
        @androidx.annotation.C0359n0
        /* renamed from: m */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.content.Intent mo51209m() {
            /*
                r4 = this;
                java.util.ArrayList<java.lang.String> r0 = r4.f45002d
                r1 = 0
                if (r0 == 0) goto L_0x000c
                java.lang.String r2 = "android.intent.extra.EMAIL"
                r4.mo51205h(r2, r0)
                r4.f45002d = r1
            L_0x000c:
                java.util.ArrayList<java.lang.String> r0 = r4.f45003e
                if (r0 == 0) goto L_0x0017
                java.lang.String r2 = "android.intent.extra.CC"
                r4.mo51205h(r2, r0)
                r4.f45003e = r1
            L_0x0017:
                java.util.ArrayList<java.lang.String> r0 = r4.f45004f
                if (r0 == 0) goto L_0x0022
                java.lang.String r2 = "android.intent.extra.BCC"
                r4.mo51205h(r2, r0)
                r4.f45004f = r1
            L_0x0022:
                java.util.ArrayList<android.net.Uri> r0 = r4.f45005g
                r1 = 0
                if (r0 == 0) goto L_0x002f
                int r0 = r0.size()
                r2 = 1
                if (r0 <= r2) goto L_0x002f
                goto L_0x0030
            L_0x002f:
                r2 = r1
            L_0x0030:
                java.lang.String r0 = "android.intent.extra.STREAM"
                if (r2 != 0) goto L_0x0065
                android.content.Intent r2 = r4.f45000b
                java.lang.String r3 = "android.intent.action.SEND"
                r2.setAction(r3)
                java.util.ArrayList<android.net.Uri> r2 = r4.f45005g
                if (r2 == 0) goto L_0x005a
                boolean r2 = r2.isEmpty()
                if (r2 != 0) goto L_0x005a
                android.content.Intent r2 = r4.f45000b
                java.util.ArrayList<android.net.Uri> r3 = r4.f45005g
                java.lang.Object r1 = r3.get(r1)
                android.os.Parcelable r1 = (android.os.Parcelable) r1
                r2.putExtra(r0, r1)
                android.content.Intent r0 = r4.f45000b
                java.util.ArrayList<android.net.Uri> r1 = r4.f45005g
                androidx.core.app.C17040b6.C17041a.m78808b(r0, r1)
                goto L_0x007a
            L_0x005a:
                android.content.Intent r1 = r4.f45000b
                r1.removeExtra(r0)
                android.content.Intent r0 = r4.f45000b
                androidx.core.app.C17040b6.C17041a.m78809c(r0)
                goto L_0x007a
            L_0x0065:
                android.content.Intent r1 = r4.f45000b
                java.lang.String r2 = "android.intent.action.SEND_MULTIPLE"
                r1.setAction(r2)
                android.content.Intent r1 = r4.f45000b
                java.util.ArrayList<android.net.Uri> r2 = r4.f45005g
                r1.putParcelableArrayListExtra(r0, r2)
                android.content.Intent r0 = r4.f45000b
                java.util.ArrayList<android.net.Uri> r1 = r4.f45005g
                androidx.core.app.C17040b6.C17041a.m78808b(r0, r1)
            L_0x007a:
                android.content.Intent r0 = r4.f45000b
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.C17040b6.C17042b.mo51209m():android.content.Intent");
        }

        @C0359n0
        /* renamed from: n */
        public C17042b mo51210n(@C0324b1 int i) {
            return mo51211o(this.f44999a.getText(i));
        }

        @C0359n0
        /* renamed from: o */
        public C17042b mo51211o(@C0363p0 CharSequence charSequence) {
            this.f45001c = charSequence;
            return this;
        }

        @C0359n0
        /* renamed from: p */
        public C17042b mo51212p(@C0363p0 String[] strArr) {
            this.f45000b.putExtra("android.intent.extra.BCC", strArr);
            return this;
        }

        @C0359n0
        /* renamed from: q */
        public C17042b mo51213q(@C0363p0 String[] strArr) {
            this.f45000b.putExtra("android.intent.extra.CC", strArr);
            return this;
        }

        @C0359n0
        /* renamed from: r */
        public C17042b mo51214r(@C0363p0 String[] strArr) {
            if (this.f45002d != null) {
                this.f45002d = null;
            }
            this.f45000b.putExtra("android.intent.extra.EMAIL", strArr);
            return this;
        }

        @C0359n0
        /* renamed from: s */
        public C17042b mo51215s(@C0363p0 String str) {
            this.f45000b.putExtra(C17344j.f45612b, str);
            if (!this.f45000b.hasExtra("android.intent.extra.TEXT")) {
                mo51218v(Html.fromHtml(str));
            }
            return this;
        }

        @C0359n0
        /* renamed from: t */
        public C17042b mo51216t(@C0363p0 Uri uri) {
            this.f45005g = null;
            if (uri != null) {
                mo51204g(uri);
            }
            return this;
        }

        @C0359n0
        /* renamed from: u */
        public C17042b mo51217u(@C0363p0 String str) {
            this.f45000b.putExtra("android.intent.extra.SUBJECT", str);
            return this;
        }

        @C0359n0
        /* renamed from: v */
        public C17042b mo51218v(@C0363p0 CharSequence charSequence) {
            this.f45000b.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }

        @C0359n0
        /* renamed from: w */
        public C17042b mo51219w(@C0363p0 String str) {
            this.f45000b.setType(str);
            return this;
        }

        /* renamed from: x */
        public void mo51220x() {
            this.f44999a.startActivity(mo51207j());
        }
    }

    /* renamed from: androidx.core.app.b6$c */
    public static class C17043c {

        /* renamed from: f */
        public static final String f45006f = "IntentReader";
        @C0359n0

        /* renamed from: a */
        public final Context f45007a;
        @C0359n0

        /* renamed from: b */
        public final Intent f45008b;
        @C0363p0

        /* renamed from: c */
        public final String f45009c;
        @C0363p0

        /* renamed from: d */
        public final ComponentName f45010d;
        @C0363p0

        /* renamed from: e */
        public ArrayList<Uri> f45011e;

        public C17043c(@C0359n0 Activity activity) {
            this((Context) C18001r.m81775l(activity), activity.getIntent());
        }

        @C0359n0
        @Deprecated
        /* renamed from: a */
        public static C17043c m78834a(@C0359n0 Activity activity) {
            return new C17043c(activity);
        }

        /* renamed from: t */
        public static void m78835t(StringBuilder sb, CharSequence charSequence, int i, int i2) {
            while (i < i2) {
                char charAt = charSequence.charAt(i);
                if (charAt == '<') {
                    sb.append("&lt;");
                } else if (charAt == '>') {
                    sb.append("&gt;");
                } else if (charAt == '&') {
                    sb.append("&amp;");
                } else if (charAt > '~' || charAt < ' ') {
                    sb.append("&#");
                    sb.append(charAt);
                    sb.append(";");
                } else if (charAt == ' ') {
                    while (true) {
                        int i3 = i + 1;
                        if (i3 >= i2 || charSequence.charAt(i3) != ' ') {
                            sb.append(' ');
                        } else {
                            sb.append("&nbsp;");
                            i = i3;
                        }
                    }
                    sb.append(' ');
                } else {
                    sb.append(charAt);
                }
                i++;
            }
        }

        @C0363p0
        /* renamed from: b */
        public ComponentName mo51221b() {
            return this.f45010d;
        }

        @C0363p0
        /* renamed from: c */
        public Drawable mo51222c() {
            if (this.f45010d == null) {
                return null;
            }
            try {
                return this.f45007a.getPackageManager().getActivityIcon(this.f45010d);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @C0363p0
        /* renamed from: d */
        public Drawable mo51223d() {
            if (this.f45009c == null) {
                return null;
            }
            try {
                return this.f45007a.getPackageManager().getApplicationIcon(this.f45009c);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @C0363p0
        /* renamed from: e */
        public CharSequence mo51224e() {
            if (this.f45009c == null) {
                return null;
            }
            PackageManager packageManager = this.f45007a.getPackageManager();
            try {
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f45009c, 0));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @C0363p0
        /* renamed from: f */
        public String mo51225f() {
            return this.f45009c;
        }

        @C0363p0
        /* renamed from: g */
        public String[] mo51226g() {
            return this.f45008b.getStringArrayExtra("android.intent.extra.BCC");
        }

        @C0363p0
        /* renamed from: h */
        public String[] mo51227h() {
            return this.f45008b.getStringArrayExtra("android.intent.extra.CC");
        }

        @C0363p0
        /* renamed from: i */
        public String[] mo51228i() {
            return this.f45008b.getStringArrayExtra("android.intent.extra.EMAIL");
        }

        @C0363p0
        /* renamed from: j */
        public String mo51229j() {
            String stringExtra = this.f45008b.getStringExtra(C17344j.f45612b);
            if (stringExtra != null) {
                return stringExtra;
            }
            CharSequence o = mo51234o();
            if (o instanceof Spanned) {
                return Html.toHtml((Spanned) o);
            }
            if (o != null) {
                return C17041a.m78807a(o);
            }
            return stringExtra;
        }

        @C0363p0
        /* renamed from: k */
        public Uri mo51230k() {
            return (Uri) this.f45008b.getParcelableExtra("android.intent.extra.STREAM");
        }

        @C0363p0
        /* renamed from: l */
        public Uri mo51231l(int i) {
            if (this.f45011e == null && mo51236q()) {
                this.f45011e = this.f45008b.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.f45011e;
            if (arrayList != null) {
                return arrayList.get(i);
            }
            if (i == 0) {
                return (Uri) this.f45008b.getParcelableExtra("android.intent.extra.STREAM");
            }
            throw new IndexOutOfBoundsException("Stream items available: " + mo51232m() + " index requested: " + i);
        }

        /* renamed from: m */
        public int mo51232m() {
            if (this.f45011e == null && mo51236q()) {
                this.f45011e = this.f45008b.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.f45011e;
            if (arrayList != null) {
                return arrayList.size();
            }
            return this.f45008b.hasExtra("android.intent.extra.STREAM") ? 1 : 0;
        }

        @C0363p0
        /* renamed from: n */
        public String mo51233n() {
            return this.f45008b.getStringExtra("android.intent.extra.SUBJECT");
        }

        @C0363p0
        /* renamed from: o */
        public CharSequence mo51234o() {
            return this.f45008b.getCharSequenceExtra("android.intent.extra.TEXT");
        }

        @C0363p0
        /* renamed from: p */
        public String mo51235p() {
            return this.f45008b.getType();
        }

        /* renamed from: q */
        public boolean mo51236q() {
            return "android.intent.action.SEND_MULTIPLE".equals(this.f45008b.getAction());
        }

        /* renamed from: r */
        public boolean mo51237r() {
            String action = this.f45008b.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                return true;
            }
            return false;
        }

        /* renamed from: s */
        public boolean mo51238s() {
            return "android.intent.action.SEND".equals(this.f45008b.getAction());
        }

        public C17043c(@C0359n0 Context context, @C0359n0 Intent intent) {
            this.f45007a = (Context) C18001r.m81775l(context);
            this.f45008b = (Intent) C18001r.m81775l(intent);
            this.f45009c = C17040b6.m78806f(intent);
            this.f45010d = C17040b6.m78804d(intent);
        }
    }

    @Deprecated
    /* renamed from: a */
    public static void m78801a(@C0359n0 Menu menu, @C0329d0 int i, @C0359n0 C17042b bVar) {
        MenuItem findItem = menu.findItem(i);
        if (findItem != null) {
            m78802b(findItem, bVar);
            return;
        }
        throw new IllegalArgumentException("Could not find menu item with id " + i + " in the supplied menu");
    }

    @Deprecated
    /* renamed from: b */
    public static void m78802b(@C0359n0 MenuItem menuItem, @C0359n0 C17042b bVar) {
        ShareActionProvider shareActionProvider;
        ActionProvider actionProvider = menuItem.getActionProvider();
        if (!(actionProvider instanceof ShareActionProvider)) {
            shareActionProvider = new ShareActionProvider(bVar.mo51208l());
        } else {
            shareActionProvider = (ShareActionProvider) actionProvider;
        }
        shareActionProvider.setShareHistoryFileName(f44998e + bVar.mo51208l().getClass().getName());
        shareActionProvider.setShareIntent(bVar.mo51209m());
        menuItem.setActionProvider(shareActionProvider);
    }

    @C0363p0
    /* renamed from: c */
    public static ComponentName m78803c(@C0359n0 Activity activity) {
        Intent intent = activity.getIntent();
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return m78804d(intent);
        }
        return callingActivity;
    }

    @C0363p0
    /* renamed from: d */
    public static ComponentName m78804d(@C0359n0 Intent intent) {
        ComponentName componentName = (ComponentName) intent.getParcelableExtra(f44996c);
        if (componentName == null) {
            return (ComponentName) intent.getParcelableExtra(f44997d);
        }
        return componentName;
    }

    @C0363p0
    /* renamed from: e */
    public static String m78805e(@C0359n0 Activity activity) {
        Intent intent = activity.getIntent();
        String callingPackage = activity.getCallingPackage();
        if (callingPackage != null || intent == null) {
            return callingPackage;
        }
        return m78806f(intent);
    }

    @C0363p0
    /* renamed from: f */
    public static String m78806f(@C0359n0 Intent intent) {
        String stringExtra = intent.getStringExtra(f44994a);
        if (stringExtra == null) {
            return intent.getStringExtra(f44995b);
        }
        return stringExtra;
    }
}
