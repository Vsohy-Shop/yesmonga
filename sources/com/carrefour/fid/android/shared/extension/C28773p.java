package com.carrefour.fid.android.shared.extension;

import android.content.Context;
import android.nfc.NfcManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nConnectivityDevice.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectivityDevice.kt\ncom/carrefour/fid/android/shared/extension/ConnectivityDeviceKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,18:1\n766#2:19\n857#2,2:20\n*S KotlinDebug\n*F\n+ 1 ConnectivityDevice.kt\ncom/carrefour/fid/android/shared/extension/ConnectivityDeviceKt\n*L\n17#1:19\n17#1:20,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.shared.extension.p */
public final class C28773p {
    @C12579k
    /* renamed from: a */
    public static final List<String> m119090a() {
        String[] strArr = Build.SUPPORTED_ABIS;
        Intrinsics.checkNotNullExpressionValue(strArr, "SUPPORTED_ABIS");
        ArrayList arrayList = new ArrayList();
        for (Object next : ArraysKt___ArraysKt.m40241ub(strArr)) {
            if (!C11622t.isBlank((String) next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final boolean m119091b(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        NfcManager nfcManager = (NfcManager) context.getSystemService("nfc");
        if (nfcManager == null || nfcManager.getDefaultAdapter() == null || !nfcManager.getDefaultAdapter().isEnabled()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m119092c(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        NfcManager nfcManager = (NfcManager) context.getSystemService("nfc");
        if (nfcManager == null || nfcManager.getDefaultAdapter() == null) {
            return false;
        }
        return true;
    }
}
