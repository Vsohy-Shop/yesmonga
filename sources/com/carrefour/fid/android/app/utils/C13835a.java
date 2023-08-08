package com.carrefour.fid.android.app.utils;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.widget.C0696c;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19758j0;
import com.carrefour.fid.android.navigation.BottomNavActivity;
import com.carrefour.fid.android.shared.util.C28903a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.app.utils.a */
public final class C13835a implements C28903a {

    /* renamed from: a */
    public static final int f33759a = 0;

    /* renamed from: a */
    public void mo32774a(@C12579k Activity activity, @C12579k String str) {
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        Intrinsics.checkNotNullParameter(str, C19758j0.f50575e);
        try {
            Intent intent = new Intent(activity, BottomNavActivity.class);
            intent.setData(Uri.parse(str));
            intent.addFlags(65536);
            activity.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
        }
    }
}
