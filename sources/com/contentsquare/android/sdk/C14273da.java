package com.contentsquare.android.sdk;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.da */
public final class C14273da {

    /* renamed from: a */
    public final byte[] f35233a;

    /* renamed from: b */
    public final String f35234b;

    public C14273da(byte[] bArr, String str) {
        Intrinsics.checkNotNullParameter(bArr, "mEvent");
        Intrinsics.checkNotNullParameter(str, "mServicePath");
        this.f35233a = bArr;
        this.f35234b = str;
    }

    /* renamed from: a */
    public final byte[] mo34914a() {
        return this.f35233a;
    }

    /* renamed from: b */
    public final String mo34915b() {
        return this.f35234b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual((Object) C14273da.class, (Object) obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            C14273da daVar = (C14273da) obj;
            return Arrays.equals(this.f35233a, daVar.f35233a) && !(Intrinsics.areEqual((Object) this.f35234b, (Object) daVar.f35234b) ^ true);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.contentsquare.android.internal.features.sessionreplay.processing.dispatcher.ProcessingData");
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f35233a) * 31) + this.f35234b.hashCode();
    }

    public String toString() {
        String arrays = Arrays.toString(this.f35233a);
        String str = this.f35234b;
        return "ProcessingData(mEvent=" + arrays + ", mServicePath=" + str + ")";
    }
}
