package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import androidx.appcompat.app.C0481i;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* renamed from: androidx.appcompat.app.v */
public class C0499v {

    /* renamed from: a */
    public static final String f1274a = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file";

    /* renamed from: b */
    public static final String f1275b = "application_locales";

    /* renamed from: c */
    public static final String f1276c = "locales";

    /* renamed from: d */
    public static final String f1277d = "androidx.appcompat.app.AppLocalesMetadataHolderService";

    /* renamed from: e */
    public static final String f1278e = "AppLocalesStorageHelper";

    /* renamed from: androidx.appcompat.app.v$a */
    public static class C0500a implements Executor {

        /* renamed from: a */
        public final Object f1279a = new Object();

        /* renamed from: b */
        public final Queue<Runnable> f1280b = new ArrayDeque();

        /* renamed from: c */
        public final Executor f1281c;

        /* renamed from: d */
        public Runnable f1282d;

        public C0500a(Executor executor) {
            this.f1281c = executor;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m2330b(Runnable runnable) {
            try {
                runnable.run();
            } finally {
                mo1557c();
            }
        }

        /* renamed from: c */
        public void mo1557c() {
            synchronized (this.f1279a) {
                Runnable poll = this.f1280b.poll();
                this.f1282d = poll;
                if (poll != null) {
                    this.f1281c.execute(poll);
                }
            }
        }

        public void execute(Runnable runnable) {
            synchronized (this.f1279a) {
                this.f1280b.add(new C0498u(this, runnable));
                if (this.f1282d == null) {
                    mo1557c();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.app.v$b */
    public static class C0501b implements Executor {
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append("Storing App Locales : Failed to persist app-locales: ");
        r0.append(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        if (r5 != null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x004c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m2326a(@androidx.annotation.C0359n0 android.content.Context r5, @androidx.annotation.C0359n0 java.lang.String r6) {
        /*
            java.lang.String r0 = "locales"
            java.lang.String r1 = ""
            boolean r1 = r6.equals(r1)
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            if (r1 == 0) goto L_0x0010
            r5.deleteFile(r2)
            return
        L_0x0010:
            r1 = 0
            java.io.FileOutputStream r5 = r5.openFileOutput(r2, r1)     // Catch:{ FileNotFoundException -> 0x0063 }
            org.xmlpull.v1.XmlSerializer r1 = android.util.Xml.newSerializer()
            r2 = 0
            r1.setOutput(r5, r2)     // Catch:{ Exception -> 0x004c }
            java.lang.String r3 = "UTF-8"
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x004c }
            r1.startDocument(r3, r4)     // Catch:{ Exception -> 0x004c }
            r1.startTag(r2, r0)     // Catch:{ Exception -> 0x004c }
            java.lang.String r3 = "application_locales"
            r1.attribute(r2, r3, r6)     // Catch:{ Exception -> 0x004c }
            r1.endTag(r2, r0)     // Catch:{ Exception -> 0x004c }
            r1.endDocument()     // Catch:{ Exception -> 0x004c }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004c }
            r0.<init>()     // Catch:{ Exception -> 0x004c }
            java.lang.String r1 = "Storing App Locales : app-locales: "
            r0.append(r1)     // Catch:{ Exception -> 0x004c }
            r0.append(r6)     // Catch:{ Exception -> 0x004c }
            java.lang.String r1 = " persisted successfully."
            r0.append(r1)     // Catch:{ Exception -> 0x004c }
            if (r5 == 0) goto L_0x005c
        L_0x0046:
            r5.close()     // Catch:{ IOException -> 0x005c }
            goto L_0x005c
        L_0x004a:
            r6 = move-exception
            goto L_0x005d
        L_0x004c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x004a }
            r0.<init>()     // Catch:{ all -> 0x004a }
            java.lang.String r1 = "Storing App Locales : Failed to persist app-locales: "
            r0.append(r1)     // Catch:{ all -> 0x004a }
            r0.append(r6)     // Catch:{ all -> 0x004a }
            if (r5 == 0) goto L_0x005c
            goto L_0x0046
        L_0x005c:
            return
        L_0x005d:
            if (r5 == 0) goto L_0x0062
            r5.close()     // Catch:{ IOException -> 0x0062 }
        L_0x0062:
            throw r6
        L_0x0063:
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r1] = r2
            java.lang.String r6 = "Storing App Locales : FileNotFoundException: Cannot open file %s for writing "
            java.lang.String.format(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0499v.m2326a(android.content.Context, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r2 != null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
        if (r2 == null) goto L_0x004e;
     */
    @androidx.annotation.C0359n0
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m2327b(@androidx.annotation.C0359n0 android.content.Context r8) {
        /*
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r1 = ""
            java.io.FileInputStream r2 = r8.openFileInput(r0)     // Catch:{ FileNotFoundException -> 0x0065 }
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch:{ IOException | XmlPullParserException -> 0x004b, all -> 0x0044 }
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch:{ IOException | XmlPullParserException -> 0x004b, all -> 0x0044 }
            int r4 = r3.getDepth()     // Catch:{ IOException | XmlPullParserException -> 0x004b, all -> 0x0044 }
        L_0x0015:
            int r5 = r3.next()     // Catch:{ IOException | XmlPullParserException -> 0x004b, all -> 0x0044 }
            r6 = 1
            if (r5 == r6) goto L_0x003e
            r6 = 3
            if (r5 != r6) goto L_0x0025
            int r7 = r3.getDepth()     // Catch:{ IOException | XmlPullParserException -> 0x004b, all -> 0x0044 }
            if (r7 <= r4) goto L_0x003e
        L_0x0025:
            if (r5 == r6) goto L_0x0015
            r6 = 4
            if (r5 != r6) goto L_0x002b
            goto L_0x0015
        L_0x002b:
            java.lang.String r5 = r3.getName()     // Catch:{ IOException | XmlPullParserException -> 0x004b, all -> 0x0044 }
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch:{ IOException | XmlPullParserException -> 0x004b, all -> 0x0044 }
            if (r5 == 0) goto L_0x0015
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch:{ IOException | XmlPullParserException -> 0x004b, all -> 0x0044 }
        L_0x003e:
            if (r2 == 0) goto L_0x004e
        L_0x0040:
            r2.close()     // Catch:{ IOException -> 0x004e }
            goto L_0x004e
        L_0x0044:
            r8 = move-exception
            if (r2 == 0) goto L_0x004a
            r2.close()     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            throw r8
        L_0x004b:
            if (r2 == 0) goto L_0x004e
            goto L_0x0040
        L_0x004e:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x0062
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: "
            r8.append(r0)
            r8.append(r1)
            goto L_0x0065
        L_0x0062:
            r8.deleteFile(r0)
        L_0x0065:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0499v.m2327b(android.content.Context):java.lang.String");
    }

    /* renamed from: c */
    public static void m2328c(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, f1277d);
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (C0481i.m2245t().mo52238j()) {
                    String b = m2327b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        C0481i.C0483b.m2286b(systemService, C0481i.C0482a.m2284a(b));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }
}
