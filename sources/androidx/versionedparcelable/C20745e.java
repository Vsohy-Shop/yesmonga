package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.annotation.RestrictTo;
import androidx.collection.C1866a;
import com.bumptech.glide.load.engine.GlideException;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.versionedparcelable.e */
public class C20745e extends VersionedParcel {

    /* renamed from: B */
    public static final boolean f53591B = false;

    /* renamed from: C */
    public static final String f53592C = "VersionedParcelParcel";

    /* renamed from: A */
    public int f53593A;

    /* renamed from: t */
    public final SparseIntArray f53594t;

    /* renamed from: u */
    public final Parcel f53595u;

    /* renamed from: v */
    public final int f53596v;

    /* renamed from: w */
    public final int f53597w;

    /* renamed from: x */
    public final String f53598x;

    /* renamed from: y */
    public int f53599y;

    /* renamed from: z */
    public int f53600z;

    public C20745e(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1866a(), new C1866a(), new C1866a());
    }

    /* renamed from: C0 */
    public void mo62143C0(double d) {
        this.f53595u.writeDouble(d);
    }

    /* renamed from: F */
    public boolean mo62148F(int i) {
        while (this.f53600z < this.f53597w) {
            int i2 = this.f53593A;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f53595u.setDataPosition(this.f53600z);
            int readInt = this.f53595u.readInt();
            this.f53593A = this.f53595u.readInt();
            this.f53600z += readInt;
        }
        if (this.f53593A == i) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public float mo62150G() {
        return this.f53595u.readFloat();
    }

    /* renamed from: H0 */
    public void mo62153H0(float f) {
        this.f53595u.writeFloat(f);
    }

    /* renamed from: L */
    public int mo62160L() {
        return this.f53595u.readInt();
    }

    /* renamed from: L0 */
    public void mo62161L0(int i) {
        this.f53595u.writeInt(i);
    }

    /* renamed from: Q */
    public long mo62170Q() {
        return this.f53595u.readLong();
    }

    /* renamed from: Q0 */
    public void mo62171Q0(long j) {
        this.f53595u.writeLong(j);
    }

    /* renamed from: V */
    public <T extends Parcelable> T mo62180V() {
        return this.f53595u.readParcelable(getClass().getClassLoader());
    }

    /* renamed from: W0 */
    public void mo62183W0(Parcelable parcelable) {
        this.f53595u.writeParcelable(parcelable, 0);
    }

    /* renamed from: a */
    public void mo62190a() {
        int i = this.f53599y;
        if (i >= 0) {
            int i2 = this.f53594t.get(i);
            int dataPosition = this.f53595u.dataPosition();
            this.f53595u.setDataPosition(i2);
            this.f53595u.writeInt(dataPosition - i2);
            this.f53595u.setDataPosition(dataPosition);
        }
    }

    /* renamed from: c */
    public VersionedParcel mo62196c() {
        Parcel parcel = this.f53595u;
        int dataPosition = parcel.dataPosition();
        int i = this.f53600z;
        if (i == this.f53596v) {
            i = this.f53597w;
        }
        int i2 = i;
        return new C20745e(parcel, dataPosition, i2, this.f53598x + GlideException.C22148a.f56917d, this.f53586a, this.f53587b, this.f53588c);
    }

    /* renamed from: c0 */
    public String mo62197c0() {
        return this.f53595u.readString();
    }

    /* renamed from: e0 */
    public IBinder mo62203e0() {
        return this.f53595u.readStrongBinder();
    }

    /* renamed from: e1 */
    public void mo62204e1(String str) {
        this.f53595u.writeString(str);
    }

    /* renamed from: g1 */
    public void mo62209g1(IBinder iBinder) {
        this.f53595u.writeStrongBinder(iBinder);
    }

    /* renamed from: i0 */
    public void mo62214i0(int i) {
        mo62190a();
        this.f53599y = i;
        this.f53594t.put(i, this.f53595u.dataPosition());
        mo62161L0(0);
        mo62161L0(i);
    }

    /* renamed from: i1 */
    public void mo62215i1(IInterface iInterface) {
        this.f53595u.writeStrongInterface(iInterface);
    }

    /* renamed from: l */
    public boolean mo62222l() {
        return this.f53595u.readInt() != 0;
    }

    /* renamed from: m0 */
    public void mo62226m0(boolean z) {
        this.f53595u.writeInt(z ? 1 : 0);
    }

    /* renamed from: p */
    public Bundle mo62233p() {
        return this.f53595u.readBundle(getClass().getClassLoader());
    }

    /* renamed from: q0 */
    public void mo62236q0(Bundle bundle) {
        this.f53595u.writeBundle(bundle);
    }

    /* renamed from: s */
    public byte[] mo62239s() {
        int readInt = this.f53595u.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f53595u.readByteArray(bArr);
        return bArr;
    }

    /* renamed from: t0 */
    public void mo62242t0(byte[] bArr) {
        if (bArr != null) {
            this.f53595u.writeInt(bArr.length);
            this.f53595u.writeByteArray(bArr);
            return;
        }
        this.f53595u.writeInt(-1);
    }

    /* renamed from: v */
    public CharSequence mo62245v() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f53595u);
    }

    /* renamed from: v0 */
    public void mo62246v0(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            this.f53595u.writeInt(bArr.length);
            this.f53595u.writeByteArray(bArr, i, i2);
            return;
        }
        this.f53595u.writeInt(-1);
    }

    /* renamed from: y */
    public double mo62251y() {
        return this.f53595u.readDouble();
    }

    /* renamed from: y0 */
    public void mo62252y0(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f53595u, 0);
    }

    public C20745e(Parcel parcel, int i, int i2, String str, C1866a<String, Method> aVar, C1866a<String, Method> aVar2, C1866a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f53594t = new SparseIntArray();
        this.f53599y = -1;
        this.f53593A = -1;
        this.f53595u = parcel;
        this.f53596v = i;
        this.f53597w = i2;
        this.f53600z = i;
        this.f53598x = str;
    }
}
