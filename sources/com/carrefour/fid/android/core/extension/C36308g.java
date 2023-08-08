package com.carrefour.fid.android.core.extension;

import android.content.Context;
import androidx.core.content.C17318d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.core.extension.g */
public final class C36308g {
    /* renamed from: a */
    public static final boolean m148959a(@C12579k Context context, @C12579k String str) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(str, "permission");
        if (C17318d.m79718a(context, str) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m148960b(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (!m148959a(context, "android.permission.READ_EXTERNAL_STORAGE") || !m148959a(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            return false;
        }
        return true;
    }
}
