package com.carrefour.sslpinning;

import android.content.Context;
import android.util.Base64;
import com.carrefour.sslpinning.decrypt.C22851a;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.CertificatePinner;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.sslpinning.c */
public final class C22849c {

    /* renamed from: a */
    public final C22852e f58431a;

    /* renamed from: b */
    public final C22850d f58432b;

    /* renamed from: c */
    public final C22847a f58433c;

    /* renamed from: d */
    public final List<String> f58434d;
    @C12580l

    /* renamed from: e */
    public C22851a f58435e;

    public C22849c(@C12579k C22851a aVar, @C12579k Context context, @C12579k List<String> list) {
        InputStream openRawResource = context.getResources().openRawResource(aVar.mo67319a());
        Intrinsics.checkExpressionValueIsNotNull(openRawResource, "context.resources.openRa…urce(config.getCertRes())");
        this.f58431a = new C22852e(openRawResource);
        this.f58432b = new C22850d();
        this.f58433c = new C22847a();
        this.f58435e = aVar;
        this.f58434d = list;
    }

    @C12579k
    /* renamed from: a */
    public final CertificatePinner mo67312a() throws CarrefourCertificatePinnerGeneratorException {
        boolean z;
        String str;
        byte[] bArr;
        byte[] a = this.f58431a.mo67321a();
        if (a.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            try {
                C22850d dVar = this.f58432b;
                C22851a aVar = this.f58435e;
                if (aVar != null) {
                    str = aVar.getKey();
                } else {
                    str = null;
                }
                List<String> b = dVar.mo67317b(a, str);
                ArrayList<byte[]> arrayList = new ArrayList<>();
                for (String a2 : b) {
                    try {
                        bArr = this.f58433c.mo67311a(a2);
                    } catch (Throwable unused) {
                        bArr = null;
                    }
                    if (bArr != null) {
                        arrayList.add(bArr);
                    }
                }
                if (arrayList.size() != 0) {
                    MessageDigest instance = MessageDigest.getInstance("SHA-256");
                    ArrayList<String> arrayList2 = new ArrayList<>(C10978t.m41495Y(arrayList, 10));
                    for (byte[] digest : arrayList) {
                        arrayList2.add(Base64.encodeToString(instance.digest(digest), 0));
                    }
                    List<String> list = this.f58434d;
                    ArrayList arrayList3 = new ArrayList(C10978t.m41495Y(arrayList2, 10));
                    for (String str2 : arrayList2) {
                        arrayList3.add("sha256/" + str2);
                    }
                    Object[] array = arrayList3.toArray(new String[0]);
                    if (array != null) {
                        return mo67314c(list, (String[]) array).build();
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                throw new CarrefourCertificatePinnerGeneratorException("Unable to decode a single public key.", (String) null, 2, (DefaultConstructorMarker) null);
            } catch (Exception e) {
                e.printStackTrace();
                throw new CarrefourCertificatePinnerGeneratorException("Something went wrong during decryption.", e.getMessage());
            }
        } else {
            throw new CarrefourCertificatePinnerGeneratorException("Can not read public keys file.", (String) null, 2, (DefaultConstructorMarker) null);
        }
    }

    @C12580l
    /* renamed from: b */
    public final C22851a mo67313b() {
        return this.f58435e;
    }

    /* renamed from: c */
    public final CertificatePinner.Builder mo67314c(List<String> list, String[] strArr) {
        CertificatePinner.Builder builder = new CertificatePinner.Builder();
        for (String str : list) {
            StringBuilder sb = new StringBuilder();
            sb.append("hosts added : ");
            sb.append(str);
            builder.add(str, (String[]) Arrays.copyOf(strArr, strArr.length));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("hashedPublicKeys: ");
            sb2.append(strArr);
        }
        return builder;
    }

    /* renamed from: d */
    public final void mo67315d(@C12580l C22851a aVar) {
        this.f58435e = aVar;
    }

    public C22849c(@C12579k C22852e eVar, @C12579k C22850d dVar, @C12579k C22847a aVar, @C12579k List<String> list) {
        this.f58431a = eVar;
        this.f58432b = dVar;
        this.f58433c = aVar;
        this.f58434d = list;
    }
}
