package com.carrefour.sslpinning;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11602d;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.sslpinning.d */
public final class C22850d {
    /* renamed from: a */
    public final Cipher mo67316a(String str) {
        byte[] c = mo67318c(str);
        SecretKeySpec secretKeySpec = new SecretKeySpec(c, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(c, 0, 16);
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(2, secretKeySpec, ivParameterSpec);
        Intrinsics.checkExpressionValueIsNotNull(instance, "cipher");
        return instance;
    }

    @C12579k
    /* renamed from: b */
    public final List<String> mo67317b(@C12579k byte[] bArr, @C12580l String str) throws PublicKeysDecryptorException {
        if (bArr.length == 0) {
            throw new PublicKeysDecryptorException("File is too small.");
        } else if (str != null) {
            try {
                byte[] doFinal = mo67316a(str).doFinal(bArr);
                Intrinsics.checkExpressionValueIsNotNull(doFinal, "cipher(salt).doFinal(bytes)");
                return StringsKt__StringsKt.lines(new String(doFinal, C11602d.f28868b));
            } catch (BadPaddingException unused) {
                throw new PublicKeysDecryptorException("Key is invalid.");
            } catch (Exception unused2) {
                throw new PublicKeysDecryptorException("File can not be decrypted.");
            }
        } else {
            throw new PublicKeysDecryptorException("slat is null.");
        }
    }

    /* renamed from: c */
    public final byte[] mo67318c(String str) {
        Charset charset = C11602d.f28868b;
        if (str != null) {
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(bytes);
            Intrinsics.checkExpressionValueIsNotNull(digest, "md.digest(bytes)");
            return digest;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}
