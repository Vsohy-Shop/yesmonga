package com.carrefour.fid.android.shared.util;

import android.util.Base64;
import androidx.compose.runtime.internal.C8567o;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11602d;
import kotlin.text.Regex;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.util.g */
public final class C28930g {
    @C12579k

    /* renamed from: b */
    public static final C28931a f70884b = new C28931a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f70885c = 8;
    @C12579k

    /* renamed from: d */
    public static final String f70886d = "CipherWrapper";
    @C12579k

    /* renamed from: e */
    public static final String f70887e = "AES/CBC/PKCS7Padding";
    @C12579k

    /* renamed from: f */
    public static final String f70888f = "RSA/NONE/PKCS1Padding";
    @C12579k

    /* renamed from: g */
    public static final String f70889g = "]";
    @C12579k

    /* renamed from: a */
    public final Cipher f70890a;

    /* renamed from: com.carrefour.fid.android.shared.util.g$a */
    public static final class C28931a {
        public /* synthetic */ C28931a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C28931a() {
        }
    }

    public C28930g() {
        Cipher instance = Cipher.getInstance(f70887e);
        Intrinsics.checkNotNullExpressionValue(instance, "getInstance(TRANSFORMATION_SYMMETRIC)");
        this.f70890a = instance;
    }

    @C12580l
    /* renamed from: a */
    public final String mo84206a(@C12579k String str, @C12580l Key key) {
        Intrinsics.checkNotNullParameter(str, "data");
        if (key == null) {
            return null;
        }
        List<String> p = new Regex("]").mo23339p(str, 0);
        if (p.size() != 2) {
            return "";
        }
        this.f70890a.init(2, key, new IvParameterSpec(Base64.decode(p.get(0), 0)));
        try {
            byte[] doFinal = this.f70890a.doFinal(Base64.decode(p.get(1), 0));
            Intrinsics.checkNotNullExpressionValue(doFinal, "decodedData");
            return new String(doFinal, C11602d.f28868b);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @C12579k
    /* renamed from: b */
    public final String mo84207b(@C12579k String str, @C12579k PrivateKey privateKey) {
        Intrinsics.checkNotNullParameter(str, "data");
        Intrinsics.checkNotNullParameter(privateKey, "privateKey");
        try {
            Cipher instance = Cipher.getInstance(f70888f);
            instance.init(2, privateKey);
            byte[] doFinal = instance.doFinal(Base64.decode(str, 2));
            Intrinsics.checkNotNullExpressionValue(doFinal, "c.doFinal(Base64.decode(data, Base64.NO_WRAP))");
            return new String(doFinal, C11602d.f28868b);
        } catch (Exception e) {
            Exception exc = e;
            C28935i iVar = C28935i.f70940a;
            String message = exc.getMessage();
            C28935i.m119705e(iVar, "RSA decryption error: [ " + message + " ]", exc, 0, 4, (Object) null);
            return "";
        }
    }

    @C12579k
    /* renamed from: c */
    public final String mo84208c(@C12579k String str, @C12580l Key key) {
        Intrinsics.checkNotNullParameter(str, "data");
        if (key == null) {
            C28935i.m119704b(C28935i.f70940a, "Symetric key is null", (Throwable) null, 0, 6, (Object) null);
            return "";
        }
        this.f70890a.init(1, key);
        String str2 = Base64.encodeToString(this.f70890a.getIV(), 0) + "]";
        Cipher cipher = this.f70890a;
        byte[] bytes = str.getBytes(C11602d.f28868b);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return str2 + Base64.encodeToString(cipher.doFinal(bytes), 0);
    }

    @C12579k
    /* renamed from: d */
    public final String mo84209d(@C12579k String str, @C12579k PublicKey publicKey) {
        byte[] bArr;
        Intrinsics.checkNotNullParameter(str, "data");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        try {
            Cipher instance = Cipher.getInstance(f70888f);
            instance.init(1, publicKey);
            byte[] bytes = str.getBytes(C11602d.f28868b);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            bArr = instance.doFinal(bytes);
        } catch (Exception e) {
            C28935i.m119705e(C28935i.f70940a, "RSA encryption error", e, 0, 4, (Object) null);
            bArr = null;
        }
        String encodeToString = Base64.encodeToString(bArr, 0);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(encodedBytes, Base64.DEFAULT)");
        return encodeToString;
    }
}
