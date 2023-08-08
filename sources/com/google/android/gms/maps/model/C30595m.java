package com.google.android.gms.maps.model;

import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.maps.C41838p;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* renamed from: com.google.android.gms.maps.model.m */
public abstract class C30595m implements C30594l {

    /* renamed from: b */
    public final int f73142b;

    /* renamed from: c */
    public final int f73143c;

    public C30595m(int i, int i2) {
        this.f73142b = i;
        this.f73143c = i2;
    }

    /* JADX INFO: finally extract failed */
    @C0363p0
    /* renamed from: a */
    public final Tile mo86552a(int i, int i2, int i3) {
        URL b = mo86657b(i, i2, i3);
        if (b == null) {
            return C30594l.f73141a;
        }
        try {
            C41838p.m169459b(4352);
            int i4 = this.f73142b;
            int i5 = this.f73143c;
            InputStream inputStream = b.openConnection().getInputStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C40843u.m166203m(inputStream, "from must not be null.");
            C40843u.m166203m(byteArrayOutputStream, "to must not be null.");
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    Tile tile = new Tile(i4, i5, byteArrayOutputStream.toByteArray());
                    C41838p.m169458a();
                    return tile;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException unused) {
            C41838p.m169458a();
            return null;
        } catch (Throwable th) {
            C41838p.m169458a();
            throw th;
        }
    }

    @C0363p0
    /* renamed from: b */
    public abstract URL mo86657b(int i, int i2, int i3);
}
