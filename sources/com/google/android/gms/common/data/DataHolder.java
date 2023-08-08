package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.C40743d;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.errorprone.annotations.C32488a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@SafeParcelable.C40812a(creator = "DataHolderCreator", validate = true)
@KeepName
@C40473a
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    @C40473a
    @C0359n0
    public static final Parcelable.Creator<DataHolder> CREATOR = new C40708q();

    /* renamed from: y */
    public static final C40690a f103656y = new C40705n(new String[0], (String) null);
    @SafeParcelable.C40819h(mo134498id = 1000)

    /* renamed from: a */
    public final int f103657a;
    @SafeParcelable.C40814c(getter = "getColumns", mo134489id = 1)

    /* renamed from: b */
    public final String[] f103658b;

    /* renamed from: c */
    public Bundle f103659c;
    @SafeParcelable.C40814c(getter = "getWindows", mo134489id = 2)

    /* renamed from: d */
    public final CursorWindow[] f103660d;
    @SafeParcelable.C40814c(getter = "getStatusCode", mo134489id = 3)

    /* renamed from: e */
    public final int f103661e;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getMetadata", mo134489id = 4)

    /* renamed from: f */
    public final Bundle f103662f;

    /* renamed from: g */
    public int[] f103663g;

    /* renamed from: v */
    public int f103664v;

    /* renamed from: w */
    public boolean f103665w;

    /* renamed from: x */
    public boolean f103666x;

    @C40473a
    /* renamed from: com.google.android.gms.common.data.DataHolder$a */
    public static class C40690a {

        /* renamed from: a */
        public final String[] f103667a;

        /* renamed from: b */
        public final ArrayList f103668b = new ArrayList();

        /* renamed from: c */
        public final HashMap f103669c = new HashMap();

        public /* synthetic */ C40690a(String[] strArr, String str, C40706o oVar) {
            this.f103667a = (String[]) C40843u.m166202l(strArr);
        }

        @C40473a
        @C0359n0
        /* renamed from: a */
        public DataHolder mo134146a(int i) {
            return new DataHolder(this, i);
        }

        @C40473a
        @C0359n0
        /* renamed from: b */
        public DataHolder mo134147b(int i, @C0359n0 Bundle bundle) {
            return new DataHolder(this, i, bundle);
        }

        @C40473a
        @C0359n0
        /* renamed from: c */
        public C40690a mo134148c(@C0359n0 ContentValues contentValues) {
            C40743d.m165779c(contentValues);
            HashMap hashMap = new HashMap(contentValues.size());
            for (Map.Entry next : contentValues.valueSet()) {
                hashMap.put((String) next.getKey(), next.getValue());
            }
            return mo134149d(hashMap);
        }

        @C0359n0
        @C32488a
        /* renamed from: d */
        public C40690a mo134149d(@C0359n0 HashMap hashMap) {
            C40743d.m165779c(hashMap);
            this.f103668b.add(hashMap);
            return this;
        }
    }

    /* renamed from: G1 */
    public static CursorWindow[] m165563G1(C40690a aVar, int i) {
        long j;
        if (aVar.f103667a.length == 0) {
            return new CursorWindow[0];
        }
        ArrayList e = aVar.f103668b;
        int size = e.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cursorWindow);
        cursorWindow.setNumColumns(aVar.f103667a.length);
        int i2 = 0;
        boolean z = false;
        while (i2 < size) {
            try {
                if (!cursorWindow.allocRow()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Allocating additional cursor window for large data set (row ");
                    sb.append(i2);
                    sb.append(")");
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i2);
                    cursorWindow.setNumColumns(aVar.f103667a.length);
                    arrayList.add(cursorWindow);
                    if (!cursorWindow.allocRow()) {
                        arrayList.remove(cursorWindow);
                        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
                    }
                }
                Map map = (Map) e.get(i2);
                int i3 = 0;
                boolean z2 = true;
                while (true) {
                    if (i3 < aVar.f103667a.length) {
                        if (!z2) {
                            break;
                        }
                        String str = aVar.f103667a[i3];
                        Object obj = map.get(str);
                        if (obj == null) {
                            z2 = cursorWindow.putNull(i2, i3);
                        } else if (obj instanceof String) {
                            z2 = cursorWindow.putString((String) obj, i2, i3);
                        } else if (obj instanceof Long) {
                            z2 = cursorWindow.putLong(((Long) obj).longValue(), i2, i3);
                        } else if (obj instanceof Integer) {
                            z2 = cursorWindow.putLong((long) ((Integer) obj).intValue(), i2, i3);
                        } else if (obj instanceof Boolean) {
                            if (true != ((Boolean) obj).booleanValue()) {
                                j = 0;
                            } else {
                                j = 1;
                            }
                            z2 = cursorWindow.putLong(j, i2, i3);
                        } else if (obj instanceof byte[]) {
                            z2 = cursorWindow.putBlob((byte[]) obj, i2, i3);
                        } else if (obj instanceof Double) {
                            z2 = cursorWindow.putDouble(((Double) obj).doubleValue(), i2, i3);
                        } else if (obj instanceof Float) {
                            z2 = cursorWindow.putDouble((double) ((Float) obj).floatValue(), i2, i3);
                        } else {
                            throw new IllegalArgumentException("Unsupported object for column " + str + ": " + obj.toString());
                        }
                        i3++;
                    } else if (z2) {
                        z = false;
                    }
                }
                if (!z) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Couldn't populate window data for row ");
                    sb2.append(i2);
                    sb2.append(" - allocating new window.");
                    cursorWindow.freeLastRow();
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i2);
                    cursorWindow.setNumColumns(aVar.f103667a.length);
                    arrayList.add(cursorWindow);
                    i2--;
                    z = true;
                    i2++;
                } else {
                    throw new zad("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                }
            } catch (RuntimeException e2) {
                int size2 = arrayList.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((CursorWindow) arrayList.get(i4)).close();
                }
                throw e2;
            }
        }
        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
    }

    @C40473a
    @C0359n0
    /* renamed from: M */
    public static C40690a m165564M(@C0359n0 String[] strArr) {
        return new C40690a(strArr, (String) null, (C40706o) null);
    }

    @C40473a
    @C0359n0
    /* renamed from: Q */
    public static DataHolder m165565Q(int i) {
        return new DataHolder(f103656y, i, (Bundle) null);
    }

    @C40473a
    /* renamed from: A0 */
    public boolean mo134126A0(@C0359n0 String str) {
        return this.f103659c.containsKey(str);
    }

    /* renamed from: A1 */
    public final void mo134127A1(String str, int i) {
        Bundle bundle = this.f103659c;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new IllegalArgumentException("No such column: ".concat(String.valueOf(str)));
        } else if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        } else if (i < 0 || i >= this.f103664v) {
            throw new CursorIndexOutOfBoundsException(i, this.f103664v);
        }
    }

    @C40473a
    /* renamed from: C0 */
    public boolean mo134128C0(@C0359n0 String str, int i, int i2) {
        mo134127A1(str, i);
        return this.f103660d[i2].isNull(i, this.f103659c.getInt(str));
    }

    /* renamed from: K0 */
    public final double mo134129K0(@C0359n0 String str, int i, int i2) {
        mo134127A1(str, i);
        return this.f103660d[i2].getDouble(i, this.f103659c.getInt(str));
    }

    /* renamed from: N0 */
    public final float mo134130N0(@C0359n0 String str, int i, int i2) {
        mo134127A1(str, i);
        return this.f103660d[i2].getFloat(i, this.f103659c.getInt(str));
    }

    @C40473a
    /* renamed from: W */
    public boolean mo134131W(@C0359n0 String str, int i, int i2) {
        mo134127A1(str, i);
        if (Long.valueOf(this.f103660d[i2].getLong(i, this.f103659c.getInt(str))).longValue() == 1) {
            return true;
        }
        return false;
    }

    @C40473a
    @C0359n0
    /* renamed from: X */
    public byte[] mo134132X(@C0359n0 String str, int i, int i2) {
        mo134127A1(str, i);
        return this.f103660d[i2].getBlob(i, this.f103659c.getInt(str));
    }

    @C40473a
    public void close() {
        synchronized (this) {
            if (!this.f103665w) {
                this.f103665w = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.f103660d;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    @C40473a
    /* renamed from: e0 */
    public int mo134134e0(@C0359n0 String str, int i, int i2) {
        mo134127A1(str, i);
        return this.f103660d[i2].getInt(i, this.f103659c.getInt(str));
    }

    @C40473a
    /* renamed from: f0 */
    public long mo134135f0(@C0359n0 String str, int i, int i2) {
        mo134127A1(str, i);
        return this.f103660d[i2].getLong(i, this.f103659c.getInt(str));
    }

    public final void finalize() throws Throwable {
        try {
            if (this.f103666x && this.f103660d.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder();
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
            }
        } finally {
            super.finalize();
        }
    }

    @C40473a
    public int getCount() {
        return this.f103664v;
    }

    @C0363p0
    @C40473a
    public Bundle getMetadata() {
        return this.f103662f;
    }

    @C40473a
    public boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.f103665w;
        }
        return z;
    }

    /* renamed from: j1 */
    public final void mo134140j1(@C0359n0 String str, int i, int i2, @C0359n0 CharArrayBuffer charArrayBuffer) {
        mo134127A1(str, i);
        this.f103660d[i2].copyStringToBuffer(i, this.f103659c.getInt(str), charArrayBuffer);
    }

    /* renamed from: k1 */
    public final void mo134141k1() {
        this.f103659c = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.f103658b;
            if (i2 >= strArr.length) {
                break;
            }
            this.f103659c.putInt(strArr[i2], i2);
            i2++;
        }
        this.f103663g = new int[this.f103660d.length];
        int i3 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f103660d;
            if (i < cursorWindowArr.length) {
                this.f103663g[i] = i3;
                i3 += this.f103660d[i].getNumRows() - (i3 - cursorWindowArr[i].getStartPosition());
                i++;
            } else {
                this.f103664v = i3;
                return;
            }
        }
    }

    @C40473a
    /* renamed from: n0 */
    public int mo134142n0() {
        return this.f103661e;
    }

    @C40473a
    @C0359n0
    /* renamed from: p0 */
    public String mo134143p0(@C0359n0 String str, int i, int i2) {
        mo134127A1(str, i);
        return this.f103660d[i2].getString(i, this.f103659c.getInt(str));
    }

    @C40473a
    /* renamed from: t0 */
    public int mo134144t0(int i) {
        boolean z;
        int length;
        int i2 = 0;
        if (i < 0 || i >= this.f103664v) {
            z = false;
        } else {
            z = true;
        }
        C40843u.m166208r(z);
        while (true) {
            int[] iArr = this.f103663g;
            length = iArr.length;
            if (i2 >= length) {
                break;
            } else if (i < iArr[i2]) {
                i2--;
                break;
            } else {
                i2++;
            }
        }
        if (i2 == length) {
            return i2 - 1;
        }
        return i2;
    }

    public final void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166109Z(parcel, 1, this.f103658b, false);
        C40820a.m166115c0(parcel, 2, this.f103660d, i, false);
        C40820a.m166089F(parcel, 3, mo134142n0());
        C40820a.m166129k(parcel, 4, getMetadata(), false);
        C40820a.m166089F(parcel, 1000, this.f103657a);
        C40820a.m166112b(parcel, a);
        if ((i & 1) != 0) {
            close();
        }
    }

    @SafeParcelable.C40813b
    public DataHolder(@SafeParcelable.C40816e(mo134492id = 1000) int i, @SafeParcelable.C40816e(mo134492id = 1) String[] strArr, @SafeParcelable.C40816e(mo134492id = 2) CursorWindow[] cursorWindowArr, @SafeParcelable.C40816e(mo134492id = 3) int i2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 4) Bundle bundle) {
        this.f103665w = false;
        this.f103666x = true;
        this.f103657a = i;
        this.f103658b = strArr;
        this.f103660d = cursorWindowArr;
        this.f103661e = i2;
        this.f103662f = bundle;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.C40473a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DataHolder(@androidx.annotation.C0359n0 android.database.Cursor r8, int r9, @androidx.annotation.C0363p0 android.os.Bundle r10) {
        /*
            r7 = this;
            com.google.android.gms.common.sqlite.a r0 = new com.google.android.gms.common.sqlite.a
            r0.<init>(r8)
            java.lang.String[] r8 = r0.getColumnNames()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.getCount()     // Catch:{ all -> 0x0076 }
            android.database.CursorWindow r3 = r0.getWindow()     // Catch:{ all -> 0x0076 }
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L_0x002e
            int r6 = r3.getStartPosition()     // Catch:{ all -> 0x0076 }
            if (r6 != 0) goto L_0x002e
            r3.acquireReference()     // Catch:{ all -> 0x0076 }
            r0.mo134740a(r4)     // Catch:{ all -> 0x0076 }
            r1.add(r3)     // Catch:{ all -> 0x0076 }
            int r3 = r3.getNumRows()     // Catch:{ all -> 0x0076 }
            goto L_0x002f
        L_0x002e:
            r3 = r5
        L_0x002f:
            if (r3 >= r2) goto L_0x0063
            boolean r6 = r0.moveToPosition(r3)     // Catch:{ all -> 0x0076 }
            if (r6 == 0) goto L_0x0063
            android.database.CursorWindow r6 = r0.getWindow()     // Catch:{ all -> 0x0076 }
            if (r6 == 0) goto L_0x0044
            r6.acquireReference()     // Catch:{ all -> 0x0076 }
            r0.mo134740a(r4)     // Catch:{ all -> 0x0076 }
            goto L_0x004f
        L_0x0044:
            android.database.CursorWindow r6 = new android.database.CursorWindow     // Catch:{ all -> 0x0076 }
            r6.<init>(r5)     // Catch:{ all -> 0x0076 }
            r6.setStartPosition(r3)     // Catch:{ all -> 0x0076 }
            r0.fillWindow(r3, r6)     // Catch:{ all -> 0x0076 }
        L_0x004f:
            int r3 = r6.getNumRows()     // Catch:{ all -> 0x0076 }
            if (r3 != 0) goto L_0x0056
            goto L_0x0063
        L_0x0056:
            r1.add(r6)     // Catch:{ all -> 0x0076 }
            int r3 = r6.getStartPosition()     // Catch:{ all -> 0x0076 }
            int r6 = r6.getNumRows()     // Catch:{ all -> 0x0076 }
            int r3 = r3 + r6
            goto L_0x002f
        L_0x0063:
            r0.close()
            int r0 = r1.size()
            android.database.CursorWindow[] r0 = new android.database.CursorWindow[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            android.database.CursorWindow[] r0 = (android.database.CursorWindow[]) r0
            r7.<init>((java.lang.String[]) r8, (android.database.CursorWindow[]) r0, (int) r9, (android.os.Bundle) r10)
            return
        L_0x0076:
            r8 = move-exception
            r0.close()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.DataHolder.<init>(android.database.Cursor, int, android.os.Bundle):void");
    }

    public DataHolder(C40690a aVar, int i, @C0363p0 Bundle bundle) {
        this(aVar.f103667a, m165563G1(aVar, -1), i, (Bundle) null);
    }

    @C40473a
    public DataHolder(@C0359n0 String[] strArr, @C0359n0 CursorWindow[] cursorWindowArr, int i, @C0363p0 Bundle bundle) {
        this.f103665w = false;
        this.f103666x = true;
        this.f103657a = 1;
        this.f103658b = (String[]) C40843u.m166202l(strArr);
        this.f103660d = (CursorWindow[]) C40843u.m166202l(cursorWindowArr);
        this.f103661e = i;
        this.f103662f = bundle;
        mo134141k1();
    }
}
