package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.provider.C17859f;
import androidx.core.util.C18001r;
import androidx.emoji2.text.C19019f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.emoji2.text.d */
public final class C19013d {

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: androidx.emoji2.text.d$a */
    public static class C19014a {
        @C0359n0

        /* renamed from: b */
        public static final String f48368b = "emoji2.text.DefaultEmojiConfig";
        @C0359n0

        /* renamed from: c */
        public static final String f48369c = "androidx.content.action.LOAD_EMOJI_FONT";
        @C0359n0

        /* renamed from: d */
        public static final String f48370d = "emojicompat-emoji-font";

        /* renamed from: a */
        public final C19015b f48371a;

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public C19014a(@C0363p0 C19015b bVar) {
            this.f48371a = bVar == null ? m88843e() : bVar;
        }

        @C0359n0
        /* renamed from: e */
        public static C19015b m88843e() {
            if (Build.VERSION.SDK_INT >= 28) {
                return new C19017d();
            }
            return new C19016c();
        }

        @C0363p0
        /* renamed from: a */
        public final C19019f.C19024d mo55945a(@C0359n0 Context context, @C0363p0 C17859f fVar) {
            if (fVar == null) {
                return null;
            }
            return new C19092l(context, fVar);
        }

        @C0359n0
        /* renamed from: b */
        public final List<List<byte[]>> mo55946b(@C0359n0 Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature byteArray : signatureArr) {
                arrayList.add(byteArray.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        @C0363p0
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* renamed from: c */
        public C19019f.C19024d mo55947c(@C0359n0 Context context) {
            return mo55945a(context, mo55951h(context));
        }

        @C0359n0
        /* renamed from: d */
        public final C17859f mo55948d(@C0359n0 ProviderInfo providerInfo, @C0359n0 PackageManager packageManager) throws PackageManager.NameNotFoundException {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new C17859f(str, str2, f48370d, mo55946b(this.f48371a.mo55953b(packageManager, str2)));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
            r2 = r2.applicationInfo;
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo55949f(@androidx.annotation.C0363p0 android.content.pm.ProviderInfo r2) {
            /*
                r1 = this;
                if (r2 == 0) goto L_0x000d
                android.content.pm.ApplicationInfo r2 = r2.applicationInfo
                if (r2 == 0) goto L_0x000d
                int r2 = r2.flags
                r0 = 1
                r2 = r2 & r0
                if (r2 != r0) goto L_0x000d
                goto L_0x000e
            L_0x000d:
                r0 = 0
            L_0x000e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C19013d.C19014a.mo55949f(android.content.pm.ProviderInfo):boolean");
        }

        @C0363p0
        /* renamed from: g */
        public final ProviderInfo mo55950g(@C0359n0 PackageManager packageManager) {
            for (ResolveInfo a : this.f48371a.mo55954c(packageManager, new Intent(f48369c), 0)) {
                ProviderInfo a2 = this.f48371a.mo55952a(a);
                if (mo55949f(a2)) {
                    return a2;
                }
            }
            return null;
        }

        @C0363p0
        @C0344h1
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* renamed from: h */
        public C17859f mo55951h(@C0359n0 Context context) {
            PackageManager packageManager = context.getPackageManager();
            C18001r.m81776m(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo g = mo55950g(packageManager);
            if (g == null) {
                return null;
            }
            try {
                return mo55948d(g, packageManager);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf(f48368b, e);
                return null;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: androidx.emoji2.text.d$b */
    public static class C19015b {
        @C0363p0
        /* renamed from: a */
        public ProviderInfo mo55952a(@C0359n0 ResolveInfo resolveInfo) {
            throw new IllegalStateException("Unable to get provider info prior to API 19");
        }

        @C0359n0
        /* renamed from: b */
        public Signature[] mo55953b(@C0359n0 PackageManager packageManager, @C0359n0 String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        @C0359n0
        /* renamed from: c */
        public List<ResolveInfo> mo55954c(@C0359n0 PackageManager packageManager, @C0359n0 Intent intent, int i) {
            return Collections.emptyList();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @C0376v0(19)
    /* renamed from: androidx.emoji2.text.d$c */
    public static class C19016c extends C19015b {
        @C0363p0
        /* renamed from: a */
        public ProviderInfo mo55952a(@C0359n0 ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @C0359n0
        /* renamed from: c */
        public List<ResolveInfo> mo55954c(@C0359n0 PackageManager packageManager, @C0359n0 Intent intent, int i) {
            return packageManager.queryIntentContentProviders(intent, i);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @C0376v0(28)
    /* renamed from: androidx.emoji2.text.d$d */
    public static class C19017d extends C19016c {
        @C0359n0
        /* renamed from: b */
        public Signature[] mo55953b(@C0359n0 PackageManager packageManager, @C0359n0 String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    @C0363p0
    /* renamed from: a */
    public static C19092l m88842a(@C0359n0 Context context) {
        return (C19092l) new C19014a((C19015b) null).mo55947c(context);
    }
}
