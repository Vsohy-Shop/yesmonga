package com.google.android.gms.common.internal;

import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.C40660j;
import com.google.android.gms.tasks.C31047k;
import com.google.errorprone.annotations.C32497f;
import com.google.errorprone.annotations.RestrictedInheritance;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", explanation = "Use canonical fakes instead.", link = "go/gmscore-restrictedinheritance")
@C32497f("Use canonical fakes instead. go/cheezhead-testing-methodology")
@C40473a
/* renamed from: com.google.android.gms.common.internal.b0 */
public interface C40734b0 extends C40660j<C40738c0> {
    @C40473a
    @C0359n0
    /* renamed from: a */
    C31047k<Void> mo134307a(@C0359n0 TelemetryData telemetryData);
}
