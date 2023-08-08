package com.urbanairship.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.google.C9111c;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.util.e */
public final class C9646e {

    /* renamed from: a */
    public static final String f26431a = "https://play.google.com/store";

    /* renamed from: b */
    public static final String f26432b = "https://play.google.com/store/apps/details?id=";

    /* renamed from: c */
    public static final String f26433c = "com.android.vending";

    /* renamed from: d */
    public static final String f26434d = "amzn://apps/android?p=";

    @C0359n0
    /* renamed from: a */
    public static Intent m36140a(@C0359n0 Context context, int i, @C0359n0 AirshipConfigOptions airshipConfigOptions) {
        if (airshipConfigOptions.f87136i != null) {
            Intent intent = new Intent("android.intent.action.VIEW", airshipConfigOptions.f87136i);
            if (airshipConfigOptions.f87136i.toString().startsWith(f26431a) && m36141b(context)) {
                intent.setPackage("com.android.vending");
            }
            return intent;
        }
        String packageName = context.getPackageName();
        if (i == 1) {
            return new Intent("android.intent.action.VIEW", Uri.parse(f26434d + packageName));
        }
        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + packageName));
        if (m36141b(context)) {
            intent2.setPackage("com.android.vending");
        }
        return intent2;
    }

    /* renamed from: b */
    public static boolean m36141b(@C0359n0 Context context) {
        return C9111c.m34017f(context.getApplicationContext());
    }
}
