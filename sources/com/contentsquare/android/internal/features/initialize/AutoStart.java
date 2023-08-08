package com.contentsquare.android.internal.features.initialize;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.net.Uri;
import androidx.lifecycle.C19441m0;
import androidx.lifecycle.C19475v;
import androidx.lifecycle.C19499w;
import com.contentsquare.android.sdk.C14453jf;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.C10976s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@C11076d0(mo22515d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 (2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0016JM\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J1\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J;\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u001b\u001a\u00020\u001aH\u0014J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002J\u0010\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0018H\u0002R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010$¨\u0006)"}, mo22516d2 = {"Lcom/contentsquare/android/internal/features/initialize/AutoStart;", "Landroid/content/ContentProvider;", "", "onCreate", "Landroid/net/Uri;", "uri", "", "", "projection", "selection", "selectionArgs", "sortOrder", "Landroid/database/Cursor;", "query", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "getType", "Landroid/content/ContentValues;", "values", "insert", "", "delete", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "Landroid/content/Context;", "f", "Landroidx/lifecycle/w;", "a", "", "Lcom/contentsquare/android/sdk/qd;", "e", "context", "c", "Ljava/util/List;", "modulesAutostart", "Landroidx/lifecycle/v;", "Landroidx/lifecycle/v;", "mLifecycleObserver", "<init>", "()V", "d", "library_release"}, mo22517k = 1, mo22518mv = {1, 4, 3})
public class AutoStart extends ContentProvider {

    /* renamed from: d */
    public static final C14138a f34975d = new C14138a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final List<String> f34976a = C10976s.m41419k("ErrorAutoStarter");

    /* renamed from: b */
    public final C14453jf f34977b = new C14453jf();

    /* renamed from: c */
    public final C19475v f34978c = new AutoStart$mLifecycleObserver$1(this);

    /* renamed from: com.contentsquare.android.internal.features.initialize.AutoStart$a */
    public static final class C14138a {
        public C14138a() {
        }

        public /* synthetic */ C14138a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public C19499w mo34420a() {
        C19499w l = C19441m0.m90725l();
        Intrinsics.checkNotNullExpressionValue(l, "ProcessLifecycleOwner.get()");
        return l;
    }

    /* renamed from: c */
    public final boolean mo34421c(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "context.packageManager.g…T_META_DATA\n            )");
            return applicationInfo.metaData.getBoolean("com.contentsquare.android.autostart", true);
        } catch (Exception e) {
            this.f34977b.mo35679i("Failed to get meta data. %s", e);
            return true;
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x000f A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.contentsquare.android.sdk.C14654qd> mo34423e() {
        /*
            r9 = this;
            java.lang.String r0 = " is not available"
            java.lang.String r1 = "Module "
            java.util.List<java.lang.String> r2 = r9.f34976a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x000f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0092
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            r5 = 0
            com.contentsquare.android.sdk.jf r6 = r9.f34977b     // Catch:{ ClassNotFoundException -> 0x006f, IllegalAccessException -> 0x0062, InstantiationException -> 0x0055 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x006f, IllegalAccessException -> 0x0062, InstantiationException -> 0x0055 }
            r7.<init>()     // Catch:{ ClassNotFoundException -> 0x006f, IllegalAccessException -> 0x0062, InstantiationException -> 0x0055 }
            java.lang.String r8 = "Starting module "
            r7.append(r8)     // Catch:{ ClassNotFoundException -> 0x006f, IllegalAccessException -> 0x0062, InstantiationException -> 0x0055 }
            r7.append(r4)     // Catch:{ ClassNotFoundException -> 0x006f, IllegalAccessException -> 0x0062, InstantiationException -> 0x0055 }
            java.lang.String r7 = r7.toString()     // Catch:{ ClassNotFoundException -> 0x006f, IllegalAccessException -> 0x0062, InstantiationException -> 0x0055 }
            r6.mo35676e(r7)     // Catch:{ ClassNotFoundException -> 0x006f, IllegalAccessException -> 0x0062, InstantiationException -> 0x0055 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x006f, IllegalAccessException -> 0x0062, InstantiationException -> 0x0055 }
            r6.<init>()     // Catch:{ ClassNotFoundException -> 0x006f, IllegalAccessException -> 0x0062, InstantiationException -> 0x0055 }
            java.lang.String r7 = "com.contentsquare.android.start."
            r6.append(r7)     // Catch:{ ClassNotFoundException -> 0x006f, IllegalAccessException -> 0x0062, InstantiationException -> 0x0055 }
            r6.append(r4)     // Catch:{ ClassNotFoundException -> 0x006f, IllegalAccessException -> 0x0062, InstantiationException -> 0x0055 }
            java.lang.String r4 = r6.toString()     // Catch:{ ClassNotFoundException -> 0x006f, IllegalAccessException -> 0x0062, InstantiationException -> 0x0055 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException -> 0x006f, IllegalAccessException -> 0x0062, InstantiationException -> 0x0055 }
            java.lang.Class<com.contentsquare.android.sdk.qd> r6 = com.contentsquare.android.sdk.C14654qd.class
            java.lang.Class r4 = r4.asSubclass(r6)     // Catch:{ ClassNotFoundException -> 0x006f, IllegalAccessException -> 0x0062, InstantiationException -> 0x0055 }
            java.lang.Object r4 = r4.newInstance()     // Catch:{ ClassNotFoundException -> 0x006f, IllegalAccessException -> 0x0062, InstantiationException -> 0x0055 }
            com.contentsquare.android.sdk.qd r4 = (com.contentsquare.android.sdk.C14654qd) r4     // Catch:{ ClassNotFoundException -> 0x006f, IllegalAccessException -> 0x0062, InstantiationException -> 0x0055 }
            r5 = r4
            goto L_0x008b
        L_0x0055:
            r4 = move-exception
            com.contentsquare.android.sdk.jf r6 = r9.f34977b
            java.lang.String r4 = r4.getMessage()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            goto L_0x007b
        L_0x0062:
            r4 = move-exception
            com.contentsquare.android.sdk.jf r6 = r9.f34977b
            java.lang.String r4 = r4.getMessage()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            goto L_0x007b
        L_0x006f:
            r4 = move-exception
            com.contentsquare.android.sdk.jf r6 = r9.f34977b
            java.lang.String r4 = r4.getMessage()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
        L_0x007b:
            r7.append(r1)
            r7.append(r4)
            r7.append(r0)
            java.lang.String r4 = r7.toString()
            r6.mo35676e(r4)
        L_0x008b:
            if (r5 == 0) goto L_0x000f
            r3.add(r5)
            goto L_0x000f
        L_0x0092:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.internal.features.initialize.AutoStart.mo34423e():java.util.List");
    }

    /* renamed from: f */
    public Context mo34424f() {
        return getContext();
    }

    public String getType(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    public boolean onCreate() {
        mo34420a().getLifecycle().mo57464a(this.f34978c);
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }
}
