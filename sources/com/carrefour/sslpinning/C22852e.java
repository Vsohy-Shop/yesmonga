package com.carrefour.sslpinning;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.sslpinning.e */
public final class C22852e {

    /* renamed from: a */
    public final InputStream f58436a;

    public C22852e(@C12579k InputStream inputStream) {
        this.f58436a = inputStream;
    }

    @C12579k
    /* renamed from: a */
    public final byte[] mo67321a() throws IOException {
        this.f58436a.skip(7558);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        Ref.IntRef intRef = new Ref.IntRef();
        while (true) {
            int read = this.f58436a.read(bArr);
            intRef.element = read;
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.close();
                this.f58436a.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkExpressionValueIsNotNull(byteArray, "outputStream.toByteArray()");
                return byteArray;
            }
        }
    }
}
