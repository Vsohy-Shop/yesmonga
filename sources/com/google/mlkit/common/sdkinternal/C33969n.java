package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_common.zzan;
import java.util.List;

@C40473a
/* renamed from: com.google.mlkit.common.sdkinternal.n */
public class C33969n {
    @RecentlyNonNull
    @C40473a

    /* renamed from: a */
    public static final String f82456a = "com.google.android.gms.vision.dynamite";
    @RecentlyNonNull
    @C40473a

    /* renamed from: b */
    public static final String f82457b = "com.google.android.gms.tflite_dynamite";
    @RecentlyNonNull
    @C40473a

    /* renamed from: c */
    public static final String f82458c = "com.google.android.gms.mlkit.nlclassifier";
    @RecentlyNonNull
    @C40473a

    /* renamed from: d */
    public static final String f82459d = "barcode";
    @RecentlyNonNull
    @C40473a

    /* renamed from: e */
    public static final String f82460e = "custom_ica";
    @RecentlyNonNull
    @C40473a

    /* renamed from: f */
    public static final String f82461f = "face";
    @RecentlyNonNull
    @C40473a

    /* renamed from: g */
    public static final String f82462g = "ica";
    @RecentlyNonNull
    @C40473a

    /* renamed from: h */
    public static final String f82463h = "ocr";
    @RecentlyNonNull
    @C40473a

    /* renamed from: i */
    public static final String f82464i = "langid";
    @RecentlyNonNull
    @C40473a

    /* renamed from: j */
    public static final String f82465j = "nlclassifier";
    @RecentlyNonNull
    @C40473a

    /* renamed from: k */
    public static final String f82466k = "tflite_dynamite";

    @C40473a
    /* renamed from: a */
    public static boolean m136699a(@RecentlyNonNull Context context, @RecentlyNonNull List<String> list) {
        try {
            for (String e : list) {
                DynamiteModule.m166879e(context, DynamiteModule.f104319f, e);
            }
            return true;
        } catch (DynamiteModule.LoadingException unused) {
            return false;
        }
    }

    @C40473a
    /* renamed from: b */
    public static void m136700b(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        m136701c(context, zzan.m171767A(str));
    }

    @C40473a
    /* renamed from: c */
    public static void m136701c(@RecentlyNonNull Context context, @RecentlyNonNull List<String> list) {
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
        context.sendBroadcast(intent);
    }
}
