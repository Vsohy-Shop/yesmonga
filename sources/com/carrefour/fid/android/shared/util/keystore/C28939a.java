package com.carrefour.fid.android.shared.util.keystore;

import android.annotation.TargetApi;
import android.app.KeyguardManager;
import android.content.Context;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.util.C28935i;
import com.urbanairship.iam.events.C9175a;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PublicKey;
import java.util.GregorianCalendar;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@TargetApi(23)
@C8567o(parameters = 0)
@C11363r0({"SMAP\nAndroidKeyStoreManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidKeyStoreManager.kt\ncom/carrefour/fid/android/shared/util/keystore/AndroidKeyStoreManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1#2:139\n*E\n"})
/* renamed from: com.carrefour.fid.android.shared.util.keystore.a */
public final class C28939a implements C28941b {
    @C12579k

    /* renamed from: b */
    public static final C28940a f70949b = new C28940a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f70950c = 8;
    @C12579k

    /* renamed from: d */
    public static final String f70951d = "AndroidKeyStoreManager";
    @C12579k

    /* renamed from: e */
    public static final String f70952e = "AndroidKeyStore";
    @C12579k

    /* renamed from: f */
    public static final String f70953f = "RSA";
    @C12579k

    /* renamed from: g */
    public static final String f70954g = "CARREFOUR ONE CLIENT";
    @C12579k

    /* renamed from: a */
    public final KeyStore f70955a = mo84273f();

    /* renamed from: com.carrefour.fid.android.shared.util.keystore.a$a */
    public static final class C28940a {
        public /* synthetic */ C28940a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C28940a() {
        }
    }

    @C12580l
    /* renamed from: a */
    public PublicKey mo84268a() {
        KeyStore.PrivateKeyEntry c = mo84270c("CARREFOUR ONE CLIENT");
        if (c == null) {
            return null;
        }
        return c.getCertificate().getPublicKey();
    }

    /* renamed from: b */
    public boolean mo84269b(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C28935i iVar = C28935i.f70940a;
        C28935i.m119704b(iVar, "createAsymetricKeys() called.", (Throwable) null, 0, 6, (Object) null);
        if (this.f70955a.containsAlias("CARREFOUR ONE CLIENT")) {
            return false;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.add(1, 35);
        long timeInMillis = gregorianCalendar2.getTimeInMillis();
        C28935i.m119704b(iVar, "endDate is " + timeInMillis, (Throwable) null, 0, 6, (Object) null);
        KeyPairGenerator instance = KeyPairGenerator.getInstance(f70953f, f70952e);
        KeyPairGeneratorSpec.Builder builder = new KeyPairGeneratorSpec.Builder(context);
        Object systemService = context.getSystemService("keyguard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        if (((KeyguardManager) systemService).isKeyguardSecure()) {
            builder.setEncryptionRequired();
        }
        KeyPairGeneratorSpec build = builder.setAlias("CARREFOUR ONE CLIENT").setSubject(new X500Principal("CN=CARREFOUR ONE CLIENT")).setSerialNumber(BigInteger.valueOf(1337)).setStartDate(gregorianCalendar.getTime()).setEndDate(gregorianCalendar2.getTime()).build();
        Intrinsics.checkNotNullExpressionValue(build, "builder\n            .set…ime)\n            .build()");
        instance.initialize(build);
        C28935i.m119704b(iVar, "will generate KeyPair.", (Throwable) null, 0, 6, (Object) null);
        instance.generateKeyPair();
        return true;
    }

    @C12580l
    /* renamed from: c */
    public KeyStore.PrivateKeyEntry mo84270c(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "alias");
        try {
            KeyStore instance = KeyStore.getInstance(f70952e);
            instance.load((KeyStore.LoadStoreParameter) null);
            KeyStore.Entry entry = instance.getEntry(str, (KeyStore.ProtectionParameter) null);
            if (entry == null) {
                C28935i iVar = C28935i.f70940a;
                C28935i.m119704b(iVar, "No key found under alias: " + str, (Throwable) null, 0, 6, (Object) null);
                C28935i.m119704b(iVar, "Exiting signData()...", (Throwable) null, 0, 6, (Object) null);
                return null;
            } else if (entry instanceof KeyStore.PrivateKeyEntry) {
                return (KeyStore.PrivateKeyEntry) entry;
            } else {
                C28935i iVar2 = C28935i.f70940a;
                C28935i.m119704b(iVar2, "Not an instance of a PrivateKeyEntry", (Throwable) null, 0, 6, (Object) null);
                C28935i.m119704b(iVar2, "Exiting signData()...", (Throwable) null, 0, 6, (Object) null);
                return null;
            }
        } catch (Exception e) {
            Exception exc = e;
            C28935i iVar3 = C28935i.f70940a;
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            C28935i.m119705e(iVar3, message, exc, 0, 4, (Object) null);
            return null;
        }
    }

    @C12580l
    @TargetApi(23)
    /* renamed from: d */
    public final SecretKey mo84271d(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "alias");
        if (this.f70955a.containsAlias(str)) {
            return mo84272e(str);
        }
        KeyGenerator instance = KeyGenerator.getInstance("AES", f70952e);
        KeyGenParameterSpec.Builder encryptionPaddings = new KeyGenParameterSpec.Builder(str, 3).setBlockModes(new String[]{"CBC"}).setEncryptionPaddings(new String[]{"PKCS7Padding"});
        Intrinsics.checkNotNullExpressionValue(encryptionPaddings, "Builder(alias, KeyProper…ENCRYPTION_PADDING_PKCS7)");
        instance.init(encryptionPaddings.build());
        return instance.generateKey();
    }

    @C12580l
    /* renamed from: e */
    public final SecretKey mo84272e(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "alias");
        Key key = this.f70955a.getKey(str, (char[]) null);
        if (key instanceof SecretKey) {
            return (SecretKey) key;
        }
        return null;
    }

    /* renamed from: f */
    public final KeyStore mo84273f() {
        KeyStore instance = KeyStore.getInstance(f70952e);
        instance.load((KeyStore.LoadStoreParameter) null);
        Intrinsics.checkNotNullExpressionValue(instance, "getInstance(ANDROID_KEYSTORE).apply { load(null) }");
        return instance;
    }
}
