package com.urbanairship.actions;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import androidx.annotation.C0359n0;
import com.urbanairship.C36059m;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.permission.Permission;
import com.urbanairship.permission.PermissionStatus;

public abstract class PermissionResultReceiver extends ResultReceiver {
    public PermissionResultReceiver(@C0359n0 Handler handler) {
        super(handler);
    }

    @C0359n0
    /* renamed from: b */
    public static Permission m146363b(Bundle bundle, String str) throws JsonException {
        return Permission.m35418b(JsonValue.m34960C(bundle.getString(str)));
    }

    @C0359n0
    /* renamed from: c */
    public static PermissionStatus m146364c(Bundle bundle, String str) throws JsonException {
        return PermissionStatus.m35421b(JsonValue.m34960C(bundle.getString(str)));
    }

    /* renamed from: a */
    public abstract void mo18506a(@C0359n0 Permission permission, @C0359n0 PermissionStatus permissionStatus, @C0359n0 PermissionStatus permissionStatus2);

    public final void onReceiveResult(int i, Bundle bundle) {
        super.onReceiveResult(i, bundle);
        try {
            mo18506a(m146363b(bundle, "permission"), m146364c(bundle, PromptPermissionAction.f87451p), m146364c(bundle, PromptPermissionAction.f87452q));
        } catch (JsonException e) {
            C36059m.m148411g(e, "Failed to parse result", new Object[0]);
        }
    }
}
