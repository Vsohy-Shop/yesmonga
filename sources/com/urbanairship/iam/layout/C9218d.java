package com.urbanairship.iam.layout;

import androidx.arch.core.util.C0843a;
import com.urbanairship.actions.PermissionResultReceiver;
import com.urbanairship.iam.layout.AirshipLayoutDisplayAdapter;

/* renamed from: com.urbanairship.iam.layout.d */
public final /* synthetic */ class C9218d implements C0843a {

    /* renamed from: a */
    public final /* synthetic */ PermissionResultReceiver f25095a;

    public /* synthetic */ C9218d(PermissionResultReceiver permissionResultReceiver) {
        this.f25095a = permissionResultReceiver;
    }

    public final Object apply(Object obj) {
        return AirshipLayoutDisplayAdapter.Listener.m34594m(this.f25095a, (String) obj);
    }
}
