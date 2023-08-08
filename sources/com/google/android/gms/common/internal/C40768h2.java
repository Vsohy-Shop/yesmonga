package com.google.android.gms.common.internal;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.C0363p0;
import com.carrefour.fid.android.presentation.p035ui.account.consent.C22925d;

/* renamed from: com.google.android.gms.common.internal.h2 */
public final class C40768h2 {

    /* renamed from: a */
    public static final Uri f103875a;

    /* renamed from: b */
    public static final Uri f103876b;

    static {
        Uri parse = Uri.parse("https://plus.google.com/");
        f103875a = parse;
        f103876b = parse.buildUpon().appendPath("circles").appendPath("find").build();
    }

    /* renamed from: a */
    public static Intent m165893a() {
        Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }

    /* renamed from: b */
    public static Intent m165894b(String str, @C0363p0 String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(str2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", str2);
        }
        intent.setData(appendQueryParameter.build());
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }

    /* renamed from: c */
    public static Intent m165895c(String str) {
        Uri fromParts = Uri.fromParts(C22925d.f58520a, "com.google.android.gms", (String) null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }
}
