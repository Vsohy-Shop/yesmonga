package androidx.browser.trusted;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.browser.trusted.u */
public final class C0981u {
    @C0359n0

    /* renamed from: a */
    public final byte[] f3055a;
    @C0363p0

    /* renamed from: b */
    public String f3056b;
    @C0363p0

    /* renamed from: c */
    public List<byte[]> f3057c;

    public C0981u(@C0359n0 byte[] bArr) {
        this.f3055a = bArr;
    }

    /* renamed from: b */
    public static int m4337b(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return 0;
        }
        if (bArr == null) {
            return -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        for (int i = 0; i < Math.min(bArr.length, bArr2.length); i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return 0;
    }

    @C0359n0
    /* renamed from: c */
    public static C0981u m4338c(String str, List<byte[]> list) throws IOException {
        return new C0981u(m4339d(str, list), str, list);
    }

    @C0359n0
    /* renamed from: d */
    public static byte[] m4339d(@C0359n0 String str, @C0359n0 List<byte[]> list) throws IOException {
        Collections.sort(list, new C0980t());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF(str);
        dataOutputStream.writeInt(list.size());
        for (byte[] next : list) {
            dataOutputStream.writeInt(next.length);
            dataOutputStream.write(next);
        }
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    @C0359n0
    /* renamed from: e */
    public static C0981u m4340e(@C0359n0 byte[] bArr) {
        return new C0981u(bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0981u.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f3055a, ((C0981u) obj).f3055a);
    }

    @C0359n0
    /* renamed from: f */
    public byte[] mo4067f(int i) throws IOException {
        mo4071i();
        List<byte[]> list = this.f3057c;
        if (list != null) {
            return Arrays.copyOf(list.get(i), this.f3057c.get(i).length);
        }
        throw new IllegalStateException();
    }

    /* renamed from: g */
    public int mo4068g() throws IOException {
        mo4071i();
        List<byte[]> list = this.f3057c;
        if (list != null) {
            return list.size();
        }
        throw new IllegalStateException();
    }

    @C0359n0
    /* renamed from: h */
    public String mo4069h() throws IOException {
        mo4071i();
        String str = this.f3056b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return Arrays.hashCode(this.f3055a);
    }

    /* renamed from: i */
    public final void mo4071i() throws IOException {
        if (this.f3056b == null) {
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(this.f3055a));
            this.f3056b = dataInputStream.readUTF();
            int readInt = dataInputStream.readInt();
            this.f3057c = new ArrayList(readInt);
            int i = 0;
            while (i < readInt) {
                int readInt2 = dataInputStream.readInt();
                byte[] bArr = new byte[readInt2];
                if (dataInputStream.read(bArr) == readInt2) {
                    this.f3057c.add(bArr);
                    i++;
                } else {
                    throw new IllegalStateException("Could not read fingerprint");
                }
            }
        }
    }

    @C0359n0
    /* renamed from: j */
    public byte[] mo4072j() {
        byte[] bArr = this.f3055a;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public C0981u(@C0359n0 byte[] bArr, @C0359n0 String str, @C0359n0 List<byte[]> list) {
        this.f3055a = bArr;
        this.f3056b = str;
        this.f3057c = new ArrayList(list.size());
        for (byte[] next : list) {
            this.f3057c.add(Arrays.copyOf(next, next.length));
        }
    }
}
