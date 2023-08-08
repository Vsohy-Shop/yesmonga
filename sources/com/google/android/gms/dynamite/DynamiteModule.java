package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.C40715h;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;

@C40473a
public final class DynamiteModule {
    @C40473a

    /* renamed from: b */
    public static final int f104315b = -1;
    @C40473a

    /* renamed from: c */
    public static final int f104316c = 1;
    @C40473a

    /* renamed from: d */
    public static final int f104317d = 0;
    @C40473a

    /* renamed from: e */
    public static final int f104318e = 0;
    @C40473a
    @C0359n0

    /* renamed from: f */
    public static final C41032a f104319f = new C41042h();
    @C40473a
    @C0359n0

    /* renamed from: g */
    public static final C41032a f104320g = new C41043i();
    @C40473a
    @C0359n0

    /* renamed from: h */
    public static final C41032a f104321h = new C41044j();
    @C40473a
    @C0359n0

    /* renamed from: i */
    public static final C41032a f104322i = new C41045k();
    @C40473a
    @C0359n0

    /* renamed from: j */
    public static final C41032a f104323j = new C41046l();
    @C40473a
    @C0359n0

    /* renamed from: k */
    public static final C41032a f104324k = new C41047m();
    @C0363p0
    @GuardedBy("DynamiteModule.class")

    /* renamed from: l */
    public static Boolean f104325l = null;
    @C0363p0
    @GuardedBy("DynamiteModule.class")

    /* renamed from: m */
    public static String f104326m = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: n */
    public static boolean f104327n = false;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: o */
    public static int f104328o = -1;
    @C0363p0
    @GuardedBy("DynamiteModule.class")

    /* renamed from: p */
    public static Boolean f104329p;

    /* renamed from: q */
    public static final ThreadLocal f104330q = new ThreadLocal();

    /* renamed from: r */
    public static final ThreadLocal f104331r = new C41040f();

    /* renamed from: s */
    public static final C41032a.C41033a f104332s = new C41041g();
    @C0359n0

    /* renamed from: t */
    public static final C41032a f104333t = new C41048n();
    @C0363p0
    @GuardedBy("DynamiteModule.class")

    /* renamed from: u */
    public static C41053s f104334u;
    @C0363p0
    @GuardedBy("DynamiteModule.class")

    /* renamed from: v */
    public static C41054t f104335v;

    /* renamed from: a */
    public final Context f104336a;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        @C0363p0
        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    @C40473a
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, C41052r rVar) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th, C41052r rVar) {
            super(str, th);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    public interface C41032a {

        @C40473a
        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a */
        public interface C41033a {
            /* renamed from: a */
            int mo134844a(@C0359n0 Context context, @C0359n0 String str, boolean z) throws LoadingException;

            /* renamed from: b */
            int mo134845b(@C0359n0 Context context, @C0359n0 String str);
        }

        @C40473a
        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$b */
        public static class C41034b {
            @C40473a

            /* renamed from: a */
            public int f104337a = 0;
            @C40473a

            /* renamed from: b */
            public int f104338b = 0;
            @C40473a

            /* renamed from: c */
            public int f104339c = 0;
        }

        @C40473a
        @C0359n0
        /* renamed from: a */
        C41034b mo134843a(@C0359n0 Context context, @C0359n0 String str, @C0359n0 C41033a aVar) throws LoadingException;
    }

    public DynamiteModule(Context context) {
        C40843u.m166202l(context);
        this.f104336a = context;
    }

    @C40473a
    /* renamed from: a */
    public static int m166877a(@C0359n0 Context context, @C0359n0 String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (C40808s.m166010b(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder sb = new StringBuilder();
            sb.append("Module descriptor id '");
            sb.append(valueOf);
            sb.append("' didn't match expected id '");
            sb.append(str);
            sb.append("'");
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Local module descriptor class for ");
            sb2.append(str);
            sb2.append(" not found.");
            return 0;
        } catch (Exception e) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage()));
            return 0;
        }
    }

    @C40473a
    /* renamed from: c */
    public static int m166878c(@C0359n0 Context context, @C0359n0 String str) {
        return m166880f(context, str, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:159:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02b6  */
    @com.google.android.gms.common.annotation.C40473a
    @androidx.annotation.C0359n0
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.dynamite.DynamiteModule m166879e(@androidx.annotation.C0359n0 android.content.Context r18, @androidx.annotation.C0359n0 com.google.android.gms.dynamite.DynamiteModule.C41032a r19, @androidx.annotation.C0359n0 java.lang.String r20) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r1 = r18
            r2 = r19
            r3 = r20
            java.lang.ThreadLocal r0 = f104330q
            java.lang.Object r4 = r0.get()
            com.google.android.gms.dynamite.p r4 = (com.google.android.gms.dynamite.C41050p) r4
            com.google.android.gms.dynamite.p r5 = new com.google.android.gms.dynamite.p
            r6 = 0
            r5.<init>(r6)
            r0.set(r5)
            java.lang.ThreadLocal r7 = f104331r
            java.lang.Object r8 = r7.get()
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            r10 = 0
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x029d }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x029d }
            r7.set(r12)     // Catch:{ all -> 0x029d }
            com.google.android.gms.dynamite.DynamiteModule$a$a r12 = f104332s     // Catch:{ all -> 0x029d }
            com.google.android.gms.dynamite.DynamiteModule$a$b r12 = r2.mo134843a(r1, r3, r12)     // Catch:{ all -> 0x029d }
            int r13 = r12.f104337a     // Catch:{ all -> 0x029d }
            int r14 = r12.f104338b     // Catch:{ all -> 0x029d }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x029d }
            r15.<init>()     // Catch:{ all -> 0x029d }
            java.lang.String r6 = "Considering local module "
            r15.append(r6)     // Catch:{ all -> 0x029d }
            r15.append(r3)     // Catch:{ all -> 0x029d }
            java.lang.String r6 = ":"
            r15.append(r6)     // Catch:{ all -> 0x029d }
            r15.append(r13)     // Catch:{ all -> 0x029d }
            java.lang.String r6 = " and remote module "
            r15.append(r6)     // Catch:{ all -> 0x029d }
            r15.append(r3)     // Catch:{ all -> 0x029d }
            java.lang.String r6 = ":"
            r15.append(r6)     // Catch:{ all -> 0x029d }
            r15.append(r14)     // Catch:{ all -> 0x029d }
            int r6 = r12.f104339c     // Catch:{ all -> 0x029d }
            if (r6 == 0) goto L_0x0268
            r13 = -1
            if (r6 != r13) goto L_0x006b
            int r6 = r12.f104337a     // Catch:{ all -> 0x029d }
            if (r6 == 0) goto L_0x0268
            r6 = r13
        L_0x006b:
            r14 = 1
            if (r6 != r14) goto L_0x0072
            int r15 = r12.f104338b     // Catch:{ all -> 0x029d }
            if (r15 == 0) goto L_0x0268
        L_0x0072:
            if (r6 != r13) goto L_0x0092
            com.google.android.gms.dynamite.DynamiteModule r1 = m166882h(r1, r3)     // Catch:{ all -> 0x029d }
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x0080
            r7.remove()
            goto L_0x0087
        L_0x0080:
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r7.set(r2)
        L_0x0087:
            android.database.Cursor r2 = r5.f104342a
            if (r2 == 0) goto L_0x008e
            r2.close()
        L_0x008e:
            r0.set(r4)
            return r1
        L_0x0092:
            if (r6 != r14) goto L_0x0250
            int r15 = r12.f104338b     // Catch:{ LoadingException -> 0x01fa }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r16 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r16)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            boolean r17 = m166885k(r18)     // Catch:{ all -> 0x01de }
            if (r17 == 0) goto L_0x01d5
            java.lang.Boolean r17 = f104325l     // Catch:{ all -> 0x01de }
            monitor-exit(r16)     // Catch:{ all -> 0x01de }
            if (r17 == 0) goto L_0x01cc
            boolean r16 = r17.booleanValue()     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            r14 = 2
            if (r16 == 0) goto L_0x013c
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            r13.<init>()     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            java.lang.String r6 = "Selected remote version of "
            r13.append(r6)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            r13.append(r3)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            java.lang.String r6 = ", version >= "
            r13.append(r6)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            r13.append(r15)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r6 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r6)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            com.google.android.gms.dynamite.t r13 = f104335v     // Catch:{ all -> 0x0139 }
            monitor-exit(r6)     // Catch:{ all -> 0x0139 }
            if (r13 == 0) goto L_0x0130
            java.lang.Object r6 = r0.get()     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            com.google.android.gms.dynamite.p r6 = (com.google.android.gms.dynamite.C41050p) r6     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            if (r6 == 0) goto L_0x0127
            android.database.Cursor r10 = r6.f104342a     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            if (r10 == 0) goto L_0x0127
            android.content.Context r10 = r18.getApplicationContext()     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            android.database.Cursor r6 = r6.f104342a     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            r11 = 0
            com.google.android.gms.dynamic.C41019f.m166811T6(r11)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r11 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r11)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            int r2 = f104328o     // Catch:{ all -> 0x0124 }
            if (r2 < r14) goto L_0x00e7
            r14 = 1
            goto L_0x00e8
        L_0x00e7:
            r14 = 0
        L_0x00e8:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r14)     // Catch:{ all -> 0x0124 }
            monitor-exit(r11)     // Catch:{ all -> 0x0124 }
            boolean r2 = r2.booleanValue()     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            if (r2 == 0) goto L_0x0100
            com.google.android.gms.dynamic.d r2 = com.google.android.gms.dynamic.C41019f.m166811T6(r10)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            com.google.android.gms.dynamic.d r6 = com.google.android.gms.dynamic.C41019f.m166811T6(r6)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            com.google.android.gms.dynamic.d r2 = r13.mo134857F8(r2, r3, r15, r6)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            goto L_0x010c
        L_0x0100:
            com.google.android.gms.dynamic.d r2 = com.google.android.gms.dynamic.C41019f.m166811T6(r10)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            com.google.android.gms.dynamic.d r6 = com.google.android.gms.dynamic.C41019f.m166811T6(r6)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            com.google.android.gms.dynamic.d r2 = r13.mo134856E8(r2, r3, r15, r6)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
        L_0x010c:
            java.lang.Object r2 = com.google.android.gms.dynamic.C41019f.m166810O0(r2)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            android.content.Context r2 = (android.content.Context) r2     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            if (r2 == 0) goto L_0x011b
            com.google.android.gms.dynamite.DynamiteModule r6 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            r6.<init>(r2)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            goto L_0x019e
        L_0x011b:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            java.lang.String r2 = "Failed to get module context"
            r6 = 0
            r0.<init>(r2, r6)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            throw r0     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
        L_0x0124:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0124 }
            throw r0     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
        L_0x0127:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            java.lang.String r2 = "No result cursor"
            r6 = 0
            r0.<init>(r2, r6)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            throw r0     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
        L_0x0130:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            java.lang.String r2 = "DynamiteLoaderV2 was not cached."
            r6 = 0
            r0.<init>(r2, r6)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            throw r0     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
        L_0x0139:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0139 }
            throw r0     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
        L_0x013c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            r2.<init>()     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            java.lang.String r6 = "Selected remote version of "
            r2.append(r6)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            r2.append(r3)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            java.lang.String r6 = ", version >= "
            r2.append(r6)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            r2.append(r15)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            com.google.android.gms.dynamite.s r2 = m166886l(r18)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            if (r2 == 0) goto L_0x01c3
            int r6 = r2.mo134855f()     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            r10 = 3
            if (r6 < r10) goto L_0x017e
            java.lang.Object r6 = r0.get()     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            com.google.android.gms.dynamite.p r6 = (com.google.android.gms.dynamite.C41050p) r6     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            if (r6 == 0) goto L_0x0175
            com.google.android.gms.dynamic.d r10 = com.google.android.gms.dynamic.C41019f.m166811T6(r18)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            android.database.Cursor r6 = r6.f104342a     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            com.google.android.gms.dynamic.d r6 = com.google.android.gms.dynamic.C41019f.m166811T6(r6)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            com.google.android.gms.dynamic.d r2 = r2.mo134852H8(r10, r3, r15, r6)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            goto L_0x0191
        L_0x0175:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            java.lang.String r2 = "No cached result cursor holder"
            r6 = 0
            r0.<init>(r2, r6)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            throw r0     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
        L_0x017e:
            if (r6 != r14) goto L_0x0189
            com.google.android.gms.dynamic.d r6 = com.google.android.gms.dynamic.C41019f.m166811T6(r18)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            com.google.android.gms.dynamic.d r2 = r2.mo134853I8(r6, r3, r15)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            goto L_0x0191
        L_0x0189:
            com.google.android.gms.dynamic.d r6 = com.google.android.gms.dynamic.C41019f.m166811T6(r18)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            com.google.android.gms.dynamic.d r2 = r2.mo134851G8(r6, r3, r15)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
        L_0x0191:
            java.lang.Object r2 = com.google.android.gms.dynamic.C41019f.m166810O0(r2)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            if (r2 == 0) goto L_0x01ba
            com.google.android.gms.dynamite.DynamiteModule r6 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            android.content.Context r2 = (android.content.Context) r2     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            r6.<init>(r2)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
        L_0x019e:
            r1 = 0
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x01a8
            r7.remove()
            goto L_0x01af
        L_0x01a8:
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r7.set(r1)
        L_0x01af:
            android.database.Cursor r1 = r5.f104342a
            if (r1 == 0) goto L_0x01b6
            r1.close()
        L_0x01b6:
            r0.set(r4)
            return r6
        L_0x01ba:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            java.lang.String r2 = "Failed to load remote module."
            r6 = 0
            r0.<init>(r2, r6)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            throw r0     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
        L_0x01c3:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            java.lang.String r2 = "Failed to create IDynamiteLoader."
            r6 = 0
            r0.<init>(r2, r6)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            throw r0     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
        L_0x01cc:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            java.lang.String r2 = "Failed to determine which loading route to use."
            r6 = 0
            r0.<init>(r2, r6)     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
            throw r0     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
        L_0x01d5:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x01de }
            java.lang.String r2 = "Remote loading disabled"
            r6 = 0
            r0.<init>(r2, r6)     // Catch:{ all -> 0x01de }
            throw r0     // Catch:{ all -> 0x01de }
        L_0x01de:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x01de }
            throw r0     // Catch:{ RemoteException -> 0x01f0, LoadingException -> 0x01ee, all -> 0x01e1 }
        L_0x01e1:
            r0 = move-exception
            com.google.android.gms.common.util.C40983i.m166633a(r1, r0)     // Catch:{ all -> 0x0299 }
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r2 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x0299 }
            java.lang.String r6 = "Failed to load remote module."
            r7 = 0
            r2.<init>(r6, r0, r7)     // Catch:{ all -> 0x0299 }
            throw r2     // Catch:{ all -> 0x0299 }
        L_0x01ee:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0299 }
        L_0x01f0:
            r0 = move-exception
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r2 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x0299 }
            java.lang.String r6 = "Failed to load remote module."
            r7 = 0
            r2.<init>(r6, r0, r7)     // Catch:{ all -> 0x0299 }
            throw r2     // Catch:{ all -> 0x0299 }
        L_0x01fa:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()     // Catch:{  }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{  }
            r6.<init>()     // Catch:{  }
            java.lang.String r7 = "Failed to load remote module: "
            r6.append(r7)     // Catch:{  }
            r6.append(r2)     // Catch:{  }
            int r2 = r12.f104337a     // Catch:{  }
            if (r2 == 0) goto L_0x0247
            com.google.android.gms.dynamite.q r6 = new com.google.android.gms.dynamite.q     // Catch:{  }
            r7 = 0
            r6.<init>(r2, r7)     // Catch:{  }
            r2 = r19
            com.google.android.gms.dynamite.DynamiteModule$a$b r2 = r2.mo134843a(r1, r3, r6)     // Catch:{  }
            int r2 = r2.f104339c     // Catch:{  }
            r6 = -1
            if (r2 != r6) goto L_0x0247
            com.google.android.gms.dynamite.DynamiteModule r0 = m166882h(r1, r3)     // Catch:{  }
            r1 = 0
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0231
            java.lang.ThreadLocal r1 = f104331r
            r1.remove()
            goto L_0x023a
        L_0x0231:
            java.lang.ThreadLocal r1 = f104331r
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r1.set(r2)
        L_0x023a:
            android.database.Cursor r1 = r5.f104342a
            if (r1 == 0) goto L_0x0241
            r1.close()
        L_0x0241:
            java.lang.ThreadLocal r1 = f104330q
            r1.set(r4)
            return r0
        L_0x0247:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r1 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{  }
            java.lang.String r2 = "Remote load failed. No local fallback found."
            r3 = 0
            r1.<init>(r2, r0, r3)     // Catch:{  }
            throw r1     // Catch:{  }
        L_0x0250:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{  }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{  }
            r1.<init>()     // Catch:{  }
            java.lang.String r2 = "VersionPolicy returned invalid code:"
            r1.append(r2)     // Catch:{  }
            r1.append(r6)     // Catch:{  }
            java.lang.String r1 = r1.toString()     // Catch:{  }
            r2 = 0
            r0.<init>(r1, r2)     // Catch:{  }
            throw r0     // Catch:{  }
        L_0x0268:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{  }
            int r1 = r12.f104337a     // Catch:{  }
            int r2 = r12.f104338b     // Catch:{  }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{  }
            r6.<init>()     // Catch:{  }
            java.lang.String r7 = "No acceptable module "
            r6.append(r7)     // Catch:{  }
            r6.append(r3)     // Catch:{  }
            java.lang.String r3 = " found. Local version is "
            r6.append(r3)     // Catch:{  }
            r6.append(r1)     // Catch:{  }
            java.lang.String r1 = " and remote version is "
            r6.append(r1)     // Catch:{  }
            r6.append(r2)     // Catch:{  }
            java.lang.String r1 = "."
            r6.append(r1)     // Catch:{  }
            java.lang.String r1 = r6.toString()     // Catch:{  }
            r2 = 0
            r0.<init>(r1, r2)     // Catch:{  }
            throw r0     // Catch:{  }
        L_0x0299:
            r0 = move-exception
            r1 = 0
            goto L_0x029f
        L_0x029d:
            r0 = move-exception
            r1 = r10
        L_0x029f:
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x02a9
            java.lang.ThreadLocal r1 = f104331r
            r1.remove()
            goto L_0x02b2
        L_0x02a9:
            java.lang.ThreadLocal r1 = f104331r
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r1.set(r2)
        L_0x02b2:
            android.database.Cursor r1 = r5.f104342a
            if (r1 == 0) goto L_0x02b9
            r1.close()
        L_0x02b9:
            java.lang.ThreadLocal r1 = f104330q
            r1.set(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m166879e(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$a, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x0056=Splitter:B:31:0x0056, B:17:0x003b=Splitter:B:17:0x003b, B:50:0x009c=Splitter:B:50:0x009c} */
    /* renamed from: f */
    public static int m166880f(@androidx.annotation.C0359n0 android.content.Context r10, @androidx.annotation.C0359n0 java.lang.String r11, boolean r12) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x0194 }
            java.lang.Boolean r1 = f104325l     // Catch:{ all -> 0x0191 }
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x00d1
            android.content.Context r1 = r10.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00bb, IllegalAccessException -> 0x00b9, NoSuchFieldException -> 0x00b7 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00bb, IllegalAccessException -> 0x00b9, NoSuchFieldException -> 0x00b7 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r4 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r4 = r4.getName()     // Catch:{ ClassNotFoundException -> 0x00bb, IllegalAccessException -> 0x00b9, NoSuchFieldException -> 0x00b7 }
            java.lang.Class r1 = r1.loadClass(r4)     // Catch:{ ClassNotFoundException -> 0x00bb, IllegalAccessException -> 0x00b9, NoSuchFieldException -> 0x00b7 }
            java.lang.String r4 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r4)     // Catch:{ ClassNotFoundException -> 0x00bb, IllegalAccessException -> 0x00b9, NoSuchFieldException -> 0x00b7 }
            java.lang.Class r4 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00bb, IllegalAccessException -> 0x00b9, NoSuchFieldException -> 0x00b7 }
            monitor-enter(r4)     // Catch:{ ClassNotFoundException -> 0x00bb, IllegalAccessException -> 0x00b9, NoSuchFieldException -> 0x00b7 }
            java.lang.Object r5 = r1.get(r2)     // Catch:{ all -> 0x00b4 }
            java.lang.ClassLoader r5 = (java.lang.ClassLoader) r5     // Catch:{ all -> 0x00b4 }
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b4 }
            if (r5 != r6) goto L_0x0036
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b4 }
            goto L_0x00b2
        L_0x0036:
            if (r5 == 0) goto L_0x003f
            m166883i(r5)     // Catch:{ LoadingException -> 0x003b }
        L_0x003b:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00b4 }
            goto L_0x00b2
        L_0x003f:
            boolean r5 = m166885k(r10)     // Catch:{ all -> 0x00b4 }
            if (r5 != 0) goto L_0x0048
            monitor-exit(r4)     // Catch:{ all -> 0x00b4 }
            monitor-exit(r0)     // Catch:{ all -> 0x0191 }
            return r3
        L_0x0048:
            boolean r5 = f104327n     // Catch:{ all -> 0x00b4 }
            if (r5 != 0) goto L_0x00a9
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00b4 }
            boolean r6 = r5.equals(r2)     // Catch:{ all -> 0x00b4 }
            if (r6 == 0) goto L_0x0055
            goto L_0x00a9
        L_0x0055:
            r6 = 1
            int r6 = m166881g(r10, r11, r12, r6)     // Catch:{ LoadingException -> 0x009f }
            java.lang.String r7 = f104326m     // Catch:{ LoadingException -> 0x009f }
            if (r7 == 0) goto L_0x009c
            boolean r7 = r7.isEmpty()     // Catch:{ LoadingException -> 0x009f }
            if (r7 == 0) goto L_0x0065
            goto L_0x009c
        L_0x0065:
            java.lang.ClassLoader r7 = com.google.android.gms.dynamite.C41038d.m166894a()     // Catch:{ LoadingException -> 0x009f }
            if (r7 == 0) goto L_0x006c
            goto L_0x0091
        L_0x006c:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ LoadingException -> 0x009f }
            r8 = 29
            if (r7 < r8) goto L_0x0083
            com.google.android.gms.dynamite.C41036b.m166893a()     // Catch:{ LoadingException -> 0x009f }
            java.lang.String r7 = f104326m     // Catch:{ LoadingException -> 0x009f }
            com.google.android.gms.common.internal.C40843u.m166202l(r7)     // Catch:{ LoadingException -> 0x009f }
            java.lang.ClassLoader r8 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x009f }
            dalvik.system.DelegateLastClassLoader r7 = com.google.android.gms.dynamite.C41035a.m166892a(r7, r8)     // Catch:{ LoadingException -> 0x009f }
            goto L_0x0091
        L_0x0083:
            com.google.android.gms.dynamite.e r7 = new com.google.android.gms.dynamite.e     // Catch:{ LoadingException -> 0x009f }
            java.lang.String r8 = f104326m     // Catch:{ LoadingException -> 0x009f }
            com.google.android.gms.common.internal.C40843u.m166202l(r8)     // Catch:{ LoadingException -> 0x009f }
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x009f }
            r7.<init>(r8, r9)     // Catch:{ LoadingException -> 0x009f }
        L_0x0091:
            m166883i(r7)     // Catch:{ LoadingException -> 0x009f }
            r1.set(r2, r7)     // Catch:{ LoadingException -> 0x009f }
            f104325l = r5     // Catch:{ LoadingException -> 0x009f }
            monitor-exit(r4)     // Catch:{ all -> 0x00b4 }
            monitor-exit(r0)     // Catch:{ all -> 0x0191 }
            return r6
        L_0x009c:
            monitor-exit(r4)     // Catch:{ all -> 0x00b4 }
            monitor-exit(r0)     // Catch:{ all -> 0x0191 }
            return r6
        L_0x009f:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b4 }
            r1.set(r2, r5)     // Catch:{ all -> 0x00b4 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b4 }
            goto L_0x00b2
        L_0x00a9:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b4 }
            r1.set(r2, r5)     // Catch:{ all -> 0x00b4 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b4 }
        L_0x00b2:
            monitor-exit(r4)     // Catch:{ all -> 0x00b4 }
            goto L_0x00cf
        L_0x00b4:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00b4 }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00bb, IllegalAccessException -> 0x00b9, NoSuchFieldException -> 0x00b7 }
        L_0x00b7:
            r1 = move-exception
            goto L_0x00bc
        L_0x00b9:
            r1 = move-exception
            goto L_0x00bc
        L_0x00bb:
            r1 = move-exception
        L_0x00bc:
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0191 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0191 }
            r4.<init>()     // Catch:{ all -> 0x0191 }
            java.lang.String r5 = "Failed to load module via V2: "
            r4.append(r5)     // Catch:{ all -> 0x0191 }
            r4.append(r1)     // Catch:{ all -> 0x0191 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0191 }
        L_0x00cf:
            f104325l = r1     // Catch:{ all -> 0x0191 }
        L_0x00d1:
            monitor-exit(r0)     // Catch:{ all -> 0x0191 }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x0194 }
            if (r0 == 0) goto L_0x00f0
            int r10 = m166881g(r10, r11, r12, r3)     // Catch:{ LoadingException -> 0x00dd }
            return r10
        L_0x00dd:
            r11 = move-exception
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x0194 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0194 }
            r12.<init>()     // Catch:{ all -> 0x0194 }
            java.lang.String r0 = "Failed to retrieve remote module version: "
            r12.append(r0)     // Catch:{ all -> 0x0194 }
            r12.append(r11)     // Catch:{ all -> 0x0194 }
            return r3
        L_0x00f0:
            com.google.android.gms.dynamite.s r4 = m166886l(r10)     // Catch:{ all -> 0x0194 }
            if (r4 != 0) goto L_0x00f8
            goto L_0x0188
        L_0x00f8:
            int r0 = r4.mo134855f()     // Catch:{ RemoteException -> 0x0170 }
            r1 = 3
            if (r0 < r1) goto L_0x0159
            java.lang.ThreadLocal r0 = f104330q     // Catch:{ RemoteException -> 0x0170 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0170 }
            com.google.android.gms.dynamite.p r0 = (com.google.android.gms.dynamite.C41050p) r0     // Catch:{ RemoteException -> 0x0170 }
            if (r0 == 0) goto L_0x0113
            android.database.Cursor r0 = r0.f104342a     // Catch:{ RemoteException -> 0x0170 }
            if (r0 == 0) goto L_0x0113
            int r3 = r0.getInt(r3)     // Catch:{ RemoteException -> 0x0170 }
            goto L_0x0188
        L_0x0113:
            com.google.android.gms.dynamic.d r5 = com.google.android.gms.dynamic.C41019f.m166811T6(r10)     // Catch:{ RemoteException -> 0x0170 }
            java.lang.ThreadLocal r0 = f104331r     // Catch:{ RemoteException -> 0x0170 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0170 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ RemoteException -> 0x0170 }
            long r8 = r0.longValue()     // Catch:{ RemoteException -> 0x0170 }
            r6 = r11
            r7 = r12
            com.google.android.gms.dynamic.d r11 = r4.mo134854J8(r5, r6, r7, r8)     // Catch:{ RemoteException -> 0x0170 }
            java.lang.Object r11 = com.google.android.gms.dynamic.C41019f.m166810O0(r11)     // Catch:{ RemoteException -> 0x0170 }
            android.database.Cursor r11 = (android.database.Cursor) r11     // Catch:{ RemoteException -> 0x0170 }
            if (r11 == 0) goto L_0x0153
            boolean r12 = r11.moveToFirst()     // Catch:{ RemoteException -> 0x0150, all -> 0x014d }
            if (r12 != 0) goto L_0x0138
            goto L_0x0153
        L_0x0138:
            int r12 = r11.getInt(r3)     // Catch:{ RemoteException -> 0x0150, all -> 0x014d }
            if (r12 <= 0) goto L_0x0145
            boolean r0 = m166884j(r11)     // Catch:{ RemoteException -> 0x0150, all -> 0x014d }
            if (r0 == 0) goto L_0x0145
            goto L_0x0146
        L_0x0145:
            r2 = r11
        L_0x0146:
            if (r2 == 0) goto L_0x014b
            r2.close()     // Catch:{ all -> 0x0194 }
        L_0x014b:
            r3 = r12
            goto L_0x0188
        L_0x014d:
            r12 = move-exception
            r2 = r11
            goto L_0x018b
        L_0x0150:
            r12 = move-exception
            r2 = r11
            goto L_0x0172
        L_0x0153:
            if (r11 == 0) goto L_0x0188
            r11.close()     // Catch:{ all -> 0x0194 }
            goto L_0x0188
        L_0x0159:
            r1 = 2
            if (r0 != r1) goto L_0x0165
            com.google.android.gms.dynamic.d r0 = com.google.android.gms.dynamic.C41019f.m166811T6(r10)     // Catch:{ RemoteException -> 0x0170 }
            int r3 = r4.mo134850F8(r0, r11, r12)     // Catch:{ RemoteException -> 0x0170 }
            goto L_0x0188
        L_0x0165:
            com.google.android.gms.dynamic.d r0 = com.google.android.gms.dynamic.C41019f.m166811T6(r10)     // Catch:{ RemoteException -> 0x0170 }
            int r3 = r4.mo134849E8(r0, r11, r12)     // Catch:{ RemoteException -> 0x0170 }
            goto L_0x0188
        L_0x016e:
            r12 = r11
            goto L_0x018b
        L_0x0170:
            r11 = move-exception
            r12 = r11
        L_0x0172:
            java.lang.String r11 = r12.getMessage()     // Catch:{ all -> 0x0189 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0189 }
            r12.<init>()     // Catch:{ all -> 0x0189 }
            java.lang.String r0 = "Failed to retrieve remote module version: "
            r12.append(r0)     // Catch:{ all -> 0x0189 }
            r12.append(r11)     // Catch:{ all -> 0x0189 }
            if (r2 == 0) goto L_0x0188
            r2.close()     // Catch:{ all -> 0x0194 }
        L_0x0188:
            return r3
        L_0x0189:
            r11 = move-exception
            goto L_0x016e
        L_0x018b:
            if (r2 == 0) goto L_0x0190
            r2.close()     // Catch:{ all -> 0x0194 }
        L_0x0190:
            throw r12     // Catch:{ all -> 0x0194 }
        L_0x0191:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0191 }
            throw r11     // Catch:{ all -> 0x0194 }
        L_0x0194:
            r11 = move-exception
            com.google.android.gms.common.util.C40983i.m166633a(r10, r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m166880f(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b5 A[Catch:{ all -> 0x00be }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b6 A[Catch:{ all -> 0x00be }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00c2  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m166881g(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r0 = 0
            java.lang.ThreadLocal r1 = f104331r     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L_0x0019
            r10 = r4
        L_0x0019:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            r12.<init>()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.net.Uri r4 = r10.build()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            if (r10 == 0) goto L_0x00a3
            boolean r11 = r10.moveToFirst()     // Catch:{ Exception -> 0x009b }
            if (r11 == 0) goto L_0x00a3
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch:{ Exception -> 0x009b }
            if (r12 <= 0) goto L_0x008e
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch:{ Exception -> 0x009b }
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch:{ all -> 0x008b }
            f104326m = r2     // Catch:{ all -> 0x008b }
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x006f
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            f104328o = r2     // Catch:{ all -> 0x008b }
        L_0x006f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader2"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x0082
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r9 = r11
        L_0x007f:
            f104327n = r9     // Catch:{ all -> 0x008b }
            r11 = r9
        L_0x0082:
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            boolean r1 = m166884j(r10)     // Catch:{ Exception -> 0x009b }
            if (r1 == 0) goto L_0x008e
            r10 = r0
            goto L_0x008e
        L_0x008b:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x008e:
            if (r13 == 0) goto L_0x009d
            if (r11 != 0) goto L_0x0093
            goto L_0x009d
        L_0x0093:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x009b }
            java.lang.String r12 = "forcing fallback to container DynamiteLoader impl"
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x009b:
            r11 = move-exception
            goto L_0x00b1
        L_0x009d:
            if (r10 == 0) goto L_0x00a2
            r10.close()
        L_0x00a2:
            return r12
        L_0x00a3:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x009b }
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x00ab:
            r10 = move-exception
            r11 = r10
            goto L_0x00c0
        L_0x00ae:
            r10 = move-exception
            r11 = r10
            r10 = r0
        L_0x00b1:
            boolean r12 = r11 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch:{ all -> 0x00be }
            if (r12 == 0) goto L_0x00b6
            throw r11     // Catch:{ all -> 0x00be }
        L_0x00b6:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r12 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x00be }
            java.lang.String r13 = "V2 version check failed"
            r12.<init>(r13, r11, r0)     // Catch:{ all -> 0x00be }
            throw r12     // Catch:{ all -> 0x00be }
        L_0x00be:
            r11 = move-exception
            r0 = r10
        L_0x00c0:
            if (r0 == 0) goto L_0x00c5
            r0.close()
        L_0x00c5:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m166881g(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    /* renamed from: h */
    public static DynamiteModule m166882h(Context context, String str) {
        "Selected local version of ".concat(String.valueOf(str));
        return new DynamiteModule(context.getApplicationContext());
    }

    @GuardedBy("DynamiteModule.class")
    /* renamed from: i */
    public static void m166883i(ClassLoader classLoader) throws LoadingException {
        C41054t tVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                tVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof C41054t) {
                    tVar = (C41054t) queryLocalInterface;
                } else {
                    tVar = new C41054t(iBinder);
                }
            }
            f104335v = tVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e, (C41052r) null);
        }
    }

    /* renamed from: j */
    public static boolean m166884j(Cursor cursor) {
        C41050p pVar = (C41050p) f104330q.get();
        if (pVar == null || pVar.f104342a != null) {
            return false;
        }
        pVar.f104342a = cursor;
        return true;
    }

    @GuardedBy("DynamiteModule.class")
    /* renamed from: k */
    public static boolean m166885k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals((Object) null) || bool.equals(f104329p)) {
            return true;
        }
        boolean z = false;
        if (f104329p == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (C40715h.m165670i().mo134209k(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            f104329p = valueOf;
            z = valueOf.booleanValue();
            if (z && resolveContentProvider != null && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                f104327n = true;
            }
        }
        return z;
    }

    @C0363p0
    /* renamed from: l */
    public static C41053s m166886l(Context context) {
        C41053s sVar;
        synchronized (DynamiteModule.class) {
            C41053s sVar2 = f104334u;
            if (sVar2 != null) {
                return sVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    sVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof C41053s) {
                        sVar = (C41053s) queryLocalInterface;
                    } else {
                        sVar = new C41053s(iBinder);
                    }
                }
                if (sVar != null) {
                    f104334u = sVar;
                    return sVar;
                }
            } catch (Exception e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
            }
        }
        return null;
    }

    @C40473a
    @C0359n0
    /* renamed from: b */
    public Context mo134841b() {
        return this.f104336a;
    }

    @C40473a
    @C0359n0
    /* renamed from: d */
    public IBinder mo134842d(@C0359n0 String str) throws LoadingException {
        try {
            return (IBinder) this.f104336a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e, (C41052r) null);
        }
    }
}
