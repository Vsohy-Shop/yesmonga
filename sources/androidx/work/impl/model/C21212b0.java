package androidx.work.impl.model;

import android.os.Build;
import androidx.room.C20315g2;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.work.impl.model.b0 */
public final class C21212b0 {
    @C12579k

    /* renamed from: a */
    public static final C21212b0 f54739a = new C21212b0();

    /* renamed from: androidx.work.impl.model.b0$a */
    public static final class C21213a {
        @C12579k

        /* renamed from: a */
        public static final C21213a f54740a = new C21213a();

        /* renamed from: b */
        public static final int f54741b = 0;

        /* renamed from: c */
        public static final int f54742c = 1;
    }

    /* renamed from: androidx.work.impl.model.b0$b */
    public static final class C21214b {
        @C12579k

        /* renamed from: a */
        public static final C21214b f54743a = new C21214b();

        /* renamed from: b */
        public static final int f54744b = 0;

        /* renamed from: c */
        public static final int f54745c = 1;

        /* renamed from: d */
        public static final int f54746d = 2;

        /* renamed from: e */
        public static final int f54747e = 3;

        /* renamed from: f */
        public static final int f54748f = 4;

        /* renamed from: g */
        public static final int f54749g = 5;
    }

    /* renamed from: androidx.work.impl.model.b0$c */
    public static final class C21215c {
        @C12579k

        /* renamed from: a */
        public static final C21215c f54750a = new C21215c();

        /* renamed from: b */
        public static final int f54751b = 0;

        /* renamed from: c */
        public static final int f54752c = 1;
    }

    /* renamed from: androidx.work.impl.model.b0$d */
    public static final class C21216d {
        @C12579k

        /* renamed from: a */
        public static final C21216d f54753a = new C21216d();

        /* renamed from: b */
        public static final int f54754b = 0;

        /* renamed from: c */
        public static final int f54755c = 1;

        /* renamed from: d */
        public static final int f54756d = 2;

        /* renamed from: e */
        public static final int f54757e = 3;

        /* renamed from: f */
        public static final int f54758f = 4;

        /* renamed from: g */
        public static final int f54759g = 5;
        @C12579k

        /* renamed from: h */
        public static final String f54760h = "(2, 3, 5)";
    }

    /* renamed from: androidx.work.impl.model.b0$e */
    public /* synthetic */ class C21217e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|(2:19|20)|21|23|24|(2:25|26)|27|29|30|31|32|33|34|35|36|37|38|39|41|42|(2:43|44)|45|47) */
        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|(2:19|20)|21|23|24|25|26|27|29|30|31|32|33|34|35|36|37|38|39|41|42|43|44|45|47) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x007f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0098 */
        static {
            /*
                androidx.work.WorkInfo$State[] r0 = androidx.work.WorkInfo.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                androidx.work.WorkInfo$State r2 = androidx.work.WorkInfo.State.ENQUEUED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                androidx.work.WorkInfo$State r3 = androidx.work.WorkInfo.State.f54360b     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                androidx.work.WorkInfo$State r4 = androidx.work.WorkInfo.State.SUCCEEDED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                androidx.work.WorkInfo$State r5 = androidx.work.WorkInfo.State.FAILED     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                r5 = 5
                androidx.work.WorkInfo$State r6 = androidx.work.WorkInfo.State.BLOCKED     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r0[r6] = r5     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                androidx.work.WorkInfo$State r6 = androidx.work.WorkInfo.State.CANCELLED     // Catch:{ NoSuchFieldError -> 0x003d }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r7 = 6
                r0[r6] = r7     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                $EnumSwitchMapping$0 = r0
                androidx.work.BackoffPolicy[] r0 = androidx.work.BackoffPolicy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.work.BackoffPolicy r6 = androidx.work.BackoffPolicy.EXPONENTIAL     // Catch:{ NoSuchFieldError -> 0x004e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r0[r6] = r1     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                androidx.work.BackoffPolicy r6 = androidx.work.BackoffPolicy.LINEAR     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r0[r6] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                $EnumSwitchMapping$1 = r0
                androidx.work.NetworkType[] r0 = androidx.work.NetworkType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.work.NetworkType r6 = androidx.work.NetworkType.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0067 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0067 }
                r0[r6] = r1     // Catch:{ NoSuchFieldError -> 0x0067 }
            L_0x0067:
                androidx.work.NetworkType r6 = androidx.work.NetworkType.CONNECTED     // Catch:{ NoSuchFieldError -> 0x006f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r0[r6] = r2     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                androidx.work.NetworkType r6 = androidx.work.NetworkType.UNMETERED     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r0[r6] = r3     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                androidx.work.NetworkType r3 = androidx.work.NetworkType.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x007f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x007f }
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x007f }
            L_0x007f:
                androidx.work.NetworkType r3 = androidx.work.NetworkType.METERED     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r0[r3] = r5     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                $EnumSwitchMapping$2 = r0
                androidx.work.OutOfQuotaPolicy[] r0 = androidx.work.OutOfQuotaPolicy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.work.OutOfQuotaPolicy r3 = androidx.work.OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST     // Catch:{ NoSuchFieldError -> 0x0098 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0098 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0098 }
            L_0x0098:
                androidx.work.OutOfQuotaPolicy r1 = androidx.work.OutOfQuotaPolicy.DROP_WORK_REQUEST     // Catch:{ NoSuchFieldError -> 0x00a0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a0 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a0 }
            L_0x00a0:
                $EnumSwitchMapping$3 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.C21212b0.C21217e.<clinit>():void");
        }
    }

    @C20315g2
    @C11384m
    /* renamed from: a */
    public static final int m98008a(@C12579k BackoffPolicy backoffPolicy) {
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        int i = C21217e.$EnumSwitchMapping$1[backoffPolicy.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        kotlin.p010io.C11133b.m42950a(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005c, code lost:
        kotlin.p010io.C11133b.m42950a(r1, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005f, code lost:
        throw r0;
     */
    @androidx.room.C20315g2
    @org.jetbrains.annotations.C12579k
    @kotlin.jvm.C11384m
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Set<androidx.work.C21087c.C21090c> m98009b(@org.jetbrains.annotations.C12579k byte[] r9) {
        /*
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            int r1 = r9.length
            r2 = 0
            if (r1 != 0) goto L_0x0010
            r1 = 1
            goto L_0x0011
        L_0x0010:
            r1 = r2
        L_0x0011:
            if (r1 == 0) goto L_0x0014
            return r0
        L_0x0014:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r9)
            r9 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0050 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x0050 }
            int r4 = r3.readInt()     // Catch:{ all -> 0x0047 }
        L_0x0023:
            if (r2 >= r4) goto L_0x0041
            java.lang.String r5 = r3.readUTF()     // Catch:{ all -> 0x0047 }
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ all -> 0x0047 }
            boolean r6 = r3.readBoolean()     // Catch:{ all -> 0x0047 }
            androidx.work.c$c r7 = new androidx.work.c$c     // Catch:{ all -> 0x0047 }
            java.lang.String r8 = "uri"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r8)     // Catch:{ all -> 0x0047 }
            r7.<init>(r5, r6)     // Catch:{ all -> 0x0047 }
            r0.add(r7)     // Catch:{ all -> 0x0047 }
            int r2 = r2 + 1
            goto L_0x0023
        L_0x0041:
            kotlin.d2 r2 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0047 }
            kotlin.p010io.C11133b.m42950a(r3, r9)     // Catch:{ IOException -> 0x0050 }
            goto L_0x0054
        L_0x0047:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r4 = move-exception
            kotlin.p010io.C11133b.m42950a(r3, r2)     // Catch:{ IOException -> 0x0050 }
            throw r4     // Catch:{ IOException -> 0x0050 }
        L_0x004e:
            r9 = move-exception
            goto L_0x005a
        L_0x0050:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ all -> 0x004e }
        L_0x0054:
            kotlin.d2 r2 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x004e }
            kotlin.p010io.C11133b.m42950a(r1, r9)
            return r0
        L_0x005a:
            throw r9     // Catch:{ all -> 0x005b }
        L_0x005b:
            r0 = move-exception
            kotlin.p010io.C11133b.m42950a(r1, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.C21212b0.m98009b(byte[]):java.util.Set");
    }

    @C20315g2
    @C12579k
    @C11384m
    /* renamed from: c */
    public static final BackoffPolicy m98010c(int i) {
        if (i == 0) {
            return BackoffPolicy.EXPONENTIAL;
        }
        if (i == 1) {
            return BackoffPolicy.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to BackoffPolicy");
    }

    @C20315g2
    @C12579k
    @C11384m
    /* renamed from: d */
    public static final NetworkType m98011d(int i) {
        if (i == 0) {
            return NetworkType.NOT_REQUIRED;
        }
        if (i == 1) {
            return NetworkType.CONNECTED;
        }
        if (i == 2) {
            return NetworkType.UNMETERED;
        }
        if (i == 3) {
            return NetworkType.NOT_ROAMING;
        }
        if (i == 4) {
            return NetworkType.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return NetworkType.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to NetworkType");
    }

    @C20315g2
    @C12579k
    @C11384m
    /* renamed from: e */
    public static final OutOfQuotaPolicy m98012e(int i) {
        if (i == 0) {
            return OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i == 1) {
            return OutOfQuotaPolicy.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to OutOfQuotaPolicy");
    }

    @C20315g2
    @C12579k
    @C11384m
    /* renamed from: f */
    public static final WorkInfo.State m98013f(int i) {
        if (i == 0) {
            return WorkInfo.State.ENQUEUED;
        }
        if (i == 1) {
            return WorkInfo.State.f54360b;
        }
        if (i == 2) {
            return WorkInfo.State.SUCCEEDED;
        }
        if (i == 3) {
            return WorkInfo.State.FAILED;
        }
        if (i == 4) {
            return WorkInfo.State.BLOCKED;
        }
        if (i == 5) {
            return WorkInfo.State.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to State");
    }

    @C20315g2
    @C11384m
    /* renamed from: g */
    public static final int m98014g(@C12579k NetworkType networkType) {
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        int i = C21217e.$EnumSwitchMapping$2[networkType.ordinal()];
        if (i == 1) {
            return 0;
        }
        int i2 = 2;
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            i2 = 4;
            if (i == 4) {
                return 3;
            }
            if (i != 5) {
                if (Build.VERSION.SDK_INT >= 30 && networkType == NetworkType.TEMPORARILY_UNMETERED) {
                    return 5;
                }
                throw new IllegalArgumentException("Could not convert " + networkType + " to int");
            }
        }
        return i2;
    }

    @C20315g2
    @C11384m
    /* renamed from: h */
    public static final int m98015h(@C12579k OutOfQuotaPolicy outOfQuotaPolicy) {
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "policy");
        int i = C21217e.$EnumSwitchMapping$3[outOfQuotaPolicy.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        kotlin.p010io.C11133b.m42950a(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0060, code lost:
        kotlin.p010io.C11133b.m42950a(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0063, code lost:
        throw r1;
     */
    @androidx.room.C20315g2
    @org.jetbrains.annotations.C12579k
    @kotlin.jvm.C11384m
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] m98016i(@org.jetbrains.annotations.C12579k java.util.Set<androidx.work.C21087c.C21090c> r4) {
        /*
            java.lang.String r0 = "triggers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x000f
            r4 = 0
            byte[] r4 = new byte[r4]
            return r4
        L_0x000f:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x005d }
            r1.<init>(r0)     // Catch:{ all -> 0x005d }
            int r2 = r4.size()     // Catch:{ all -> 0x0056 }
            r1.writeInt(r2)     // Catch:{ all -> 0x0056 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0056 }
        L_0x0024:
            boolean r2 = r4.hasNext()     // Catch:{ all -> 0x0056 }
            if (r2 == 0) goto L_0x0043
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x0056 }
            androidx.work.c$c r2 = (androidx.work.C21087c.C21090c) r2     // Catch:{ all -> 0x0056 }
            android.net.Uri r3 = r2.mo63147a()     // Catch:{ all -> 0x0056 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0056 }
            r1.writeUTF(r3)     // Catch:{ all -> 0x0056 }
            boolean r2 = r2.mo63148b()     // Catch:{ all -> 0x0056 }
            r1.writeBoolean(r2)     // Catch:{ all -> 0x0056 }
            goto L_0x0024
        L_0x0043:
            kotlin.d2 r4 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0056 }
            r4 = 0
            kotlin.p010io.C11133b.m42950a(r1, r4)     // Catch:{ all -> 0x005d }
            kotlin.p010io.C11133b.m42950a(r0, r4)
            byte[] r4 = r0.toByteArray()
            java.lang.String r0 = "outputStream.toByteArray()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            return r4
        L_0x0056:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r2 = move-exception
            kotlin.p010io.C11133b.m42950a(r1, r4)     // Catch:{ all -> 0x005d }
            throw r2     // Catch:{ all -> 0x005d }
        L_0x005d:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x005f }
        L_0x005f:
            r1 = move-exception
            kotlin.p010io.C11133b.m42950a(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.C21212b0.m98016i(java.util.Set):byte[]");
    }

    @C20315g2
    @C11384m
    /* renamed from: j */
    public static final int m98017j(@C12579k WorkInfo.State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        switch (C21217e.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
