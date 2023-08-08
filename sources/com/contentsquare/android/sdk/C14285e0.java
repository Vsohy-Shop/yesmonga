package com.contentsquare.android.sdk;

import android.graphics.Bitmap;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.e0 */
public final class C14285e0 {

    /* renamed from: b */
    public static final C14286a f35276b = new C14286a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final C14453jf f35277a = new C14453jf("BitmapCompressorReusable");

    /* renamed from: com.contentsquare.android.sdk.e0$a */
    public static final class C14286a {
        public C14286a() {
        }

        /* renamed from: b */
        public final String mo35010b(C14507le leVar) {
            Intrinsics.checkNotNullParameter(leVar, "viewLight");
            return mo35011c(leVar).mo35012g();
        }

        /* renamed from: c */
        public final C14287b mo35011c(C14507le leVar) {
            return leVar.mo35841L() == 1.0f ? C14287b.WEBP_MEDIUM_QUALITY : C14287b.WEBP_LOW_QUALITY;
        }

        public /* synthetic */ C14286a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo22516d2 = {"Lcom/contentsquare/android/sdk/e0$b;", "", "", "perceptualHashSuffix", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "library_release"}, mo22517k = 1, mo22518mv = {1, 4, 3})
    /* renamed from: com.contentsquare.android.sdk.e0$b */
    public enum C14287b {
        WEBP_MEDIUM_QUALITY("wpm"),
        WEBP_LOW_QUALITY("wpl");
        

        /* renamed from: a */
        public final String f35281a;

        /* access modifiers changed from: public */
        C14287b(String str) {
            this.f35281a = str;
        }

        /* renamed from: g */
        public final String mo35012g() {
            return this.f35281a;
        }
    }

    /* renamed from: a */
    public final void mo35008a(Bitmap bitmap, int i, ByteArrayOutputStream byteArrayOutputStream) {
        bitmap.compress(Build.VERSION.SDK_INT >= 30 ? Bitmap.CompressFormat.WEBP_LOSSY : Bitmap.CompressFormat.WEBP, i, byteArrayOutputStream);
    }

    /* renamed from: b */
    public final byte[] mo35009b(C14507le leVar, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(leVar, "viewLight");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = C14694s2.f36377a[f35276b.mo35011c(leVar).ordinal()];
        if (i == 1) {
            mo35008a(bitmap, 10, byteArrayOutputStream);
        } else if (i == 2) {
            mo35008a(bitmap, 0, byteArrayOutputStream);
        }
        try {
            byteArrayOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.f35277a.mo35674c("Cannot encode bitmap", e);
            return null;
        }
    }
}
