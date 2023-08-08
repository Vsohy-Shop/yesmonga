package com.urbanairship.permission;

import androidx.core.util.C17970d;
import com.urbanairship.C36098y;

/* renamed from: com.urbanairship.permission.l */
public final /* synthetic */ class C9435l implements C36098y {

    /* renamed from: a */
    public final /* synthetic */ C17970d f25779a;

    public /* synthetic */ C9435l(C17970d dVar) {
        this.f25779a = dVar;
    }

    public final void onResult(Object obj) {
        this.f25779a.accept((PermissionStatus) obj);
    }
}
