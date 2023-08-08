package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.collection.C1866a;
import androidx.versionedparcelable.VersionedParcel;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.versionedparcelable.f */
public class C20746f extends VersionedParcel {

    /* renamed from: C */
    public static final Charset f53601C = Charset.forName("UTF-16");

    /* renamed from: D */
    public static final int f53602D = 0;

    /* renamed from: E */
    public static final int f53603E = 1;

    /* renamed from: F */
    public static final int f53604F = 2;

    /* renamed from: G */
    public static final int f53605G = 3;

    /* renamed from: H */
    public static final int f53606H = 4;

    /* renamed from: I */
    public static final int f53607I = 5;

    /* renamed from: J */
    public static final int f53608J = 6;

    /* renamed from: K */
    public static final int f53609K = 7;

    /* renamed from: L */
    public static final int f53610L = 8;

    /* renamed from: M */
    public static final int f53611M = 9;

    /* renamed from: N */
    public static final int f53612N = 10;

    /* renamed from: O */
    public static final int f53613O = 11;

    /* renamed from: P */
    public static final int f53614P = 12;

    /* renamed from: Q */
    public static final int f53615Q = 13;

    /* renamed from: R */
    public static final int f53616R = 14;

    /* renamed from: A */
    public int f53617A;

    /* renamed from: B */
    public int f53618B;

    /* renamed from: t */
    public final DataInputStream f53619t;

    /* renamed from: u */
    public final DataOutputStream f53620u;

    /* renamed from: v */
    public DataInputStream f53621v;

    /* renamed from: w */
    public DataOutputStream f53622w;

    /* renamed from: x */
    public C20748b f53623x;

    /* renamed from: y */
    public boolean f53624y;

    /* renamed from: z */
    public int f53625z;

    /* renamed from: androidx.versionedparcelable.f$b */
    public static class C20748b {

        /* renamed from: a */
        public final ByteArrayOutputStream f53627a;

        /* renamed from: b */
        public final DataOutputStream f53628b;

        /* renamed from: c */
        public final int f53629c;

        /* renamed from: d */
        public final DataOutputStream f53630d;

        public C20748b(int i, DataOutputStream dataOutputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f53627a = byteArrayOutputStream;
            this.f53628b = new DataOutputStream(byteArrayOutputStream);
            this.f53629c = i;
            this.f53630d = dataOutputStream;
        }

        /* renamed from: a */
        public void mo62263a() throws IOException {
            int i;
            this.f53628b.flush();
            int size = this.f53627a.size();
            int i2 = this.f53629c << 16;
            if (size >= 65535) {
                i = 65535;
            } else {
                i = size;
            }
            this.f53630d.writeInt(i2 | i);
            if (size >= 65535) {
                this.f53630d.writeInt(size);
            }
            this.f53627a.writeTo(this.f53630d);
        }
    }

    public C20746f(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, new C1866a(), new C1866a(), new C1866a());
    }

    /* renamed from: C0 */
    public void mo62143C0(double d) {
        try {
            this.f53622w.writeDouble(d);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    /* renamed from: F */
    public boolean mo62148F(int i) {
        while (true) {
            try {
                int i2 = this.f53617A;
                if (i2 == i) {
                    return true;
                }
                if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                    return false;
                }
                int i3 = this.f53625z;
                int i4 = this.f53618B;
                if (i3 < i4) {
                    this.f53619t.skip((long) (i4 - i3));
                }
                this.f53618B = -1;
                int readInt = this.f53619t.readInt();
                this.f53625z = 0;
                int i5 = readInt & 65535;
                if (i5 == 65535) {
                    i5 = this.f53619t.readInt();
                }
                this.f53617A = (readInt >> 16) & 65535;
                this.f53618B = i5;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    /* renamed from: G */
    public float mo62150G() {
        try {
            return this.f53621v.readFloat();
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    /* renamed from: H0 */
    public void mo62153H0(float f) {
        try {
            this.f53622w.writeFloat(f);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    /* renamed from: L */
    public int mo62160L() {
        try {
            return this.f53621v.readInt();
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    /* renamed from: L0 */
    public void mo62161L0(int i) {
        try {
            this.f53622w.writeInt(i);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    /* renamed from: Q */
    public long mo62170Q() {
        try {
            return this.f53621v.readLong();
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    /* renamed from: Q0 */
    public void mo62171Q0(long j) {
        try {
            this.f53622w.writeLong(j);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    /* renamed from: V */
    public <T extends Parcelable> T mo62180V() {
        return null;
    }

    /* renamed from: W0 */
    public void mo62183W0(Parcelable parcelable) {
        if (!this.f53624y) {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    /* renamed from: a */
    public void mo62190a() {
        C20748b bVar = this.f53623x;
        if (bVar != null) {
            try {
                if (bVar.f53627a.size() != 0) {
                    this.f53623x.mo62263a();
                }
                this.f53623x = null;
            } catch (IOException e) {
                throw new VersionedParcel.ParcelException(e);
            }
        }
    }

    /* renamed from: c */
    public VersionedParcel mo62196c() {
        return new C20746f(this.f53621v, this.f53622w, this.f53586a, this.f53587b, this.f53588c);
    }

    /* renamed from: c0 */
    public String mo62197c0() {
        try {
            int readInt = this.f53621v.readInt();
            if (readInt <= 0) {
                return null;
            }
            byte[] bArr = new byte[readInt];
            this.f53621v.readFully(bArr);
            return new String(bArr, f53601C);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    /* renamed from: e0 */
    public IBinder mo62203e0() {
        return null;
    }

    /* renamed from: e1 */
    public void mo62204e1(String str) {
        if (str != null) {
            try {
                byte[] bytes = str.getBytes(f53601C);
                this.f53622w.writeInt(bytes.length);
                this.f53622w.write(bytes);
            } catch (IOException e) {
                throw new VersionedParcel.ParcelException(e);
            }
        } else {
            this.f53622w.writeInt(-1);
        }
    }

    /* renamed from: g1 */
    public void mo62209g1(IBinder iBinder) {
        if (!this.f53624y) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    /* renamed from: i */
    public boolean mo62213i() {
        return true;
    }

    /* renamed from: i0 */
    public void mo62214i0(int i) {
        mo62190a();
        C20748b bVar = new C20748b(i, this.f53620u);
        this.f53623x = bVar;
        this.f53622w = bVar.f53628b;
    }

    /* renamed from: i1 */
    public void mo62215i1(IInterface iInterface) {
        if (!this.f53624y) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    /* renamed from: j0 */
    public void mo62217j0(boolean z, boolean z2) {
        if (z) {
            this.f53624y = z2;
            return;
        }
        throw new RuntimeException("Serialization of this object is not allowed");
    }

    /* renamed from: l */
    public boolean mo62222l() {
        try {
            return this.f53621v.readBoolean();
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    /* renamed from: m0 */
    public void mo62226m0(boolean z) {
        try {
            this.f53622w.writeBoolean(z);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    /* renamed from: o1 */
    public final void mo62258o1(int i, String str, Bundle bundle) {
        switch (i) {
            case 0:
                bundle.putParcelable(str, (Parcelable) null);
                return;
            case 1:
                bundle.putBundle(str, mo62233p());
                return;
            case 2:
                bundle.putBundle(str, mo62233p());
                return;
            case 3:
                bundle.putString(str, mo62197c0());
                return;
            case 4:
                bundle.putStringArray(str, (String[]) mo62216j(new String[0]));
                return;
            case 5:
                bundle.putBoolean(str, mo62222l());
                return;
            case 6:
                bundle.putBooleanArray(str, mo62228n());
                return;
            case 7:
                bundle.putDouble(str, mo62251y());
                return;
            case 8:
                bundle.putDoubleArray(str, mo62138A());
                return;
            case 9:
                bundle.putInt(str, mo62160L());
                return;
            case 10:
                bundle.putIntArray(str, mo62164N());
                return;
            case 11:
                bundle.putLong(str, mo62170Q());
                return;
            case 12:
                bundle.putLongArray(str, mo62174S());
                return;
            case 13:
                bundle.putFloat(str, mo62150G());
                return;
            case 14:
                bundle.putFloatArray(str, mo62154I());
                return;
            default:
                throw new RuntimeException("Unknown type " + i);
        }
    }

    /* renamed from: p */
    public Bundle mo62233p() {
        int L = mo62160L();
        if (L < 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (int i = 0; i < L; i++) {
            mo62258o1(mo62160L(), mo62197c0(), bundle);
        }
        return bundle;
    }

    /* renamed from: p1 */
    public final void mo62259p1(Object obj) {
        if (obj == null) {
            mo62161L0(0);
        } else if (obj instanceof Bundle) {
            mo62161L0(1);
            mo62236q0((Bundle) obj);
        } else if (obj instanceof String) {
            mo62161L0(3);
            mo62204e1((String) obj);
        } else if (obj instanceof String[]) {
            mo62161L0(4);
            mo62220k0((String[]) obj);
        } else if (obj instanceof Boolean) {
            mo62161L0(5);
            mo62226m0(((Boolean) obj).booleanValue());
        } else if (obj instanceof boolean[]) {
            mo62161L0(6);
            mo62232o0((boolean[]) obj);
        } else if (obj instanceof Double) {
            mo62161L0(7);
            mo62143C0(((Double) obj).doubleValue());
        } else if (obj instanceof double[]) {
            mo62161L0(8);
            mo62147E0((double[]) obj);
        } else if (obj instanceof Integer) {
            mo62161L0(9);
            mo62161L0(((Integer) obj).intValue());
        } else if (obj instanceof int[]) {
            mo62161L0(10);
            mo62165N0((int[]) obj);
        } else if (obj instanceof Long) {
            mo62161L0(11);
            mo62171Q0(((Long) obj).longValue());
        } else if (obj instanceof long[]) {
            mo62161L0(12);
            mo62175S0((long[]) obj);
        } else if (obj instanceof Float) {
            mo62161L0(13);
            mo62153H0(((Float) obj).floatValue());
        } else if (obj instanceof float[]) {
            mo62161L0(14);
            mo62157J0((float[]) obj);
        } else {
            throw new IllegalArgumentException("Unsupported type " + obj.getClass());
        }
    }

    /* renamed from: q0 */
    public void mo62236q0(Bundle bundle) {
        if (bundle != null) {
            try {
                Set<String> keySet = bundle.keySet();
                this.f53622w.writeInt(keySet.size());
                for (String next : keySet) {
                    mo62204e1(next);
                    mo62259p1(bundle.get(next));
                }
            } catch (IOException e) {
                throw new VersionedParcel.ParcelException(e);
            }
        } else {
            this.f53622w.writeInt(-1);
        }
    }

    /* renamed from: s */
    public byte[] mo62239s() {
        try {
            int readInt = this.f53621v.readInt();
            if (readInt <= 0) {
                return null;
            }
            byte[] bArr = new byte[readInt];
            this.f53621v.readFully(bArr);
            return bArr;
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    /* renamed from: t0 */
    public void mo62242t0(byte[] bArr) {
        if (bArr != null) {
            try {
                this.f53622w.writeInt(bArr.length);
                this.f53622w.write(bArr);
            } catch (IOException e) {
                throw new VersionedParcel.ParcelException(e);
            }
        } else {
            this.f53622w.writeInt(-1);
        }
    }

    /* renamed from: v */
    public CharSequence mo62245v() {
        return null;
    }

    /* renamed from: v0 */
    public void mo62246v0(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            try {
                this.f53622w.writeInt(i2);
                this.f53622w.write(bArr, i, i2);
            } catch (IOException e) {
                throw new VersionedParcel.ParcelException(e);
            }
        } else {
            this.f53622w.writeInt(-1);
        }
    }

    /* renamed from: y */
    public double mo62251y() {
        try {
            return this.f53621v.readDouble();
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    /* renamed from: y0 */
    public void mo62252y0(CharSequence charSequence) {
        if (!this.f53624y) {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }

    public C20746f(InputStream inputStream, OutputStream outputStream, C1866a<String, Method> aVar, C1866a<String, Method> aVar2, C1866a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f53625z = 0;
        this.f53617A = -1;
        this.f53618B = -1;
        DataOutputStream dataOutputStream = null;
        DataInputStream dataInputStream = inputStream != null ? new DataInputStream(new C20747a(inputStream)) : null;
        this.f53619t = dataInputStream;
        dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : dataOutputStream;
        this.f53620u = dataOutputStream;
        this.f53621v = dataInputStream;
        this.f53622w = dataOutputStream;
    }

    /* renamed from: androidx.versionedparcelable.f$a */
    public class C20747a extends FilterInputStream {
        public C20747a(InputStream inputStream) {
            super(inputStream);
        }

        public int read() throws IOException {
            C20746f fVar = C20746f.this;
            int i = fVar.f53618B;
            if (i == -1 || fVar.f53625z < i) {
                int read = super.read();
                C20746f.this.f53625z++;
                return read;
            }
            throw new IOException();
        }

        public long skip(long j) throws IOException {
            C20746f fVar = C20746f.this;
            int i = fVar.f53618B;
            if (i == -1 || fVar.f53625z < i) {
                long skip = super.skip(j);
                if (skip > 0) {
                    C20746f.this.f53625z += (int) skip;
                }
                return skip;
            }
            throw new IOException();
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            C20746f fVar = C20746f.this;
            int i3 = fVar.f53618B;
            if (i3 == -1 || fVar.f53625z < i3) {
                int read = super.read(bArr, i, i2);
                if (read > 0) {
                    C20746f.this.f53625z += read;
                }
                return read;
            }
            throw new IOException();
        }
    }
}
