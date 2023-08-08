package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.tasks.C31047k;
import com.google.mlkit.common.model.C33916b;
import com.google.mlkit.common.model.C33920d;
import java.util.Set;

@C40473a
/* renamed from: com.google.mlkit.common.sdkinternal.model.k */
public interface C33964k<RemoteT extends C33920d> {
    @RecentlyNonNull
    @C40473a
    /* renamed from: a */
    C31047k<Void> mo98646a(@RecentlyNonNull RemoteT remotet, @RecentlyNonNull C33916b bVar);

    @RecentlyNonNull
    @C40473a
    /* renamed from: b */
    C31047k<Set<RemoteT>> mo98647b();

    @RecentlyNonNull
    @C40473a
    /* renamed from: c */
    C31047k<Void> mo98648c(@RecentlyNonNull RemoteT remotet);

    @RecentlyNonNull
    @C40473a
    /* renamed from: d */
    C31047k<Boolean> mo98649d(@RecentlyNonNull RemoteT remotet);
}
