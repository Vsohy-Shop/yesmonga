package com.appsflyer;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import com.carrefour.fid.android.shared.util.keystore.C28939a;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Calendar;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;

public class AFKeystoreWrapper {
    private Context AFInAppEventParameterName;
    public int AFInAppEventType;
    public KeyStore AFKeystoreWrapper;
    public final Object valueOf = new Object();
    public String values;

    public AFKeystoreWrapper(Context context) {
        this.AFInAppEventParameterName = context;
        this.values = "";
        this.AFInAppEventType = 0;
        AFLogger.AFKeystoreWrapper("Initialising KeyStore..");
        try {
            KeyStore instance = KeyStore.getInstance(C28939a.f70952e);
            this.AFKeystoreWrapper = instance;
            instance.load((KeyStore.LoadStoreParameter) null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.AFKeystoreWrapper("Couldn't load keystore instance of type: AndroidKeyStore", e);
        }
    }

    private static boolean AFKeystoreWrapper(String str) {
        return str.startsWith("com.appsflyer");
    }

    public final boolean AFInAppEventParameterName() {
        boolean z;
        synchronized (this.valueOf) {
            KeyStore keyStore = this.AFKeystoreWrapper;
            z = false;
            if (keyStore != null) {
                try {
                    Enumeration<String> aliases = keyStore.aliases();
                    while (true) {
                        if (!aliases.hasMoreElements()) {
                            break;
                        }
                        String nextElement = aliases.nextElement();
                        if (nextElement != null && AFKeystoreWrapper(nextElement)) {
                            String[] split = nextElement.split(",");
                            if (split.length == 3) {
                                AFLogger.AFKeystoreWrapper("Found a matching AF key with alias:\n".concat(nextElement));
                                z = true;
                                String[] split2 = split[1].trim().split("=");
                                String[] split3 = split[2].trim().split("=");
                                if (split2.length == 2 && split3.length == 2) {
                                    this.values = split2[1].trim();
                                    this.AFInAppEventType = Integer.parseInt(split3[1].trim());
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    StringBuilder sb = new StringBuilder("Couldn't list KeyStore Aliases: ");
                    sb.append(th.getClass().getName());
                    AFLogger.AFKeystoreWrapper(sb.toString(), th);
                }
            }
        }
        return z;
    }

    public final int AFInAppEventType() {
        int i;
        synchronized (this.valueOf) {
            i = this.AFInAppEventType;
        }
        return i;
    }

    public final String valueOf() {
        String str;
        synchronized (this.valueOf) {
            str = this.values;
        }
        return str;
    }

    public final void values(String str) {
        AFLogger.AFKeystoreWrapper("Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Calendar instance = Calendar.getInstance();
            Calendar instance2 = Calendar.getInstance();
            instance2.add(1, 5);
            synchronized (this.valueOf) {
                if (!this.AFKeystoreWrapper.containsAlias(str)) {
                    KeyGenParameterSpec build = new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(instance.getTime()).setCertificateNotAfter(instance2.getTime()).build();
                    KeyPairGenerator instance3 = KeyPairGenerator.getInstance(C28939a.f70953f, C28939a.f70952e);
                    instance3.initialize(build);
                    instance3.generateKeyPair();
                } else {
                    AFLogger.AFKeystoreWrapper("Alias already exists: ".concat(String.valueOf(str)));
                }
            }
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Exception ");
            sb.append(th.getMessage());
            sb.append(" occurred");
            AFLogger.AFKeystoreWrapper(sb.toString(), th);
        }
    }

    public final String AFKeystoreWrapper() {
        StringBuilder sb = new StringBuilder();
        sb.append("com.appsflyer,");
        synchronized (this.valueOf) {
            sb.append("KSAppsFlyerId=");
            sb.append(this.values);
            sb.append(",");
            sb.append("KSAppsFlyerRICounter=");
            sb.append(this.AFInAppEventType);
        }
        return sb.toString();
    }
}
