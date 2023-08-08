package com.urbanairship.google;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.security.C30971a;

/* renamed from: com.urbanairship.google.d */
public class C9112d {
    /* renamed from: a */
    public static int m34019a(Context context) {
        try {
            C30971a.m124376a(context);
            return 0;
        } catch (GooglePlayServicesRepairableException unused) {
            return 1;
        } catch (GooglePlayServicesNotAvailableException unused2) {
            return 2;
        }
    }
}
