package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcelable;
import androidx.annotation.C0359n0;

public interface SafeParcelable extends Parcelable {
    @C0359n0
    public static final String NULL = "SAFE_PARCELABLE_NULL_STRING";

    /* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelable$a */
    public @interface C40812a {
        @C0359n0
        String creator();

        boolean doNotParcelTypeDefaultValues() default false;

        boolean validate() default false;
    }

    /* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelable$b */
    public @interface C40813b {
    }

    /* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelable$c */
    public @interface C40814c {
        @C0359n0
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        @C0359n0
        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        @C0359n0
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        /* renamed from: id */
        int mo134489id();

        @C0359n0
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelable$d */
    public @interface C40815d {
        @C0359n0
        String getter() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelable$e */
    public @interface C40816e {
        /* renamed from: id */
        int mo134492id();
    }

    /* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelable$f */
    public @interface C40817f {
        @C0359n0
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        @C0359n0
        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        /* renamed from: id */
        int mo134495id();
    }

    /* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelable$g */
    public @interface C40818g {
        @C0359n0
        int[] value();
    }

    /* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelable$h */
    public @interface C40819h {
        @C0359n0
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        /* renamed from: id */
        int mo134498id();

        @C0359n0
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }
}
