package com.urbanairship.util;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.C8698y1;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.util.e0 */
public class C9647e0 {

    /* renamed from: a */
    public static final int f26435a = 33554432;

    /* renamed from: a */
    public static int m36142a(int i) {
        return (33554432 & i) == 0 ? i | C8698y1.f23302n : i;
    }

    /* renamed from: b */
    public static PendingIntent m36143b(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getActivity(context, i, intent, m36142a(i2));
    }

    /* renamed from: c */
    public static PendingIntent m36144c(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getBroadcast(context, i, intent, m36142a(i2));
    }

    /* renamed from: d */
    public static PendingIntent m36145d(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getService(context, i, intent, m36142a(i2));
    }
}
