package com.google.firebase;

import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C40650y;

@C40473a
/* renamed from: com.google.firebase.m */
public class C33151m implements C40650y {
    @C0359n0
    /* renamed from: a */
    public final Exception mo95924a(@C0359n0 Status status) {
        if (status.mo133648W() == 8) {
            return new FirebaseException(status.mo133645A0());
        }
        return new FirebaseApiNotAvailableException(status.mo133645A0());
    }
}
