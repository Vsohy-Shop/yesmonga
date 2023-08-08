package com.urbanairship.iam;

import android.content.Context;
import androidx.annotation.C0348i1;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import com.urbanairship.iam.assets.Assets;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: com.urbanairship.iam.l */
public interface C9207l {

    /* renamed from: a */
    public static final int f25069a = 0;

    /* renamed from: b */
    public static final int f25070b = 1;

    /* renamed from: c */
    public static final int f25071c = 2;

    /* renamed from: com.urbanairship.iam.l$a */
    public interface C9208a {
        @C0359n0
        /* renamed from: a */
        C9207l mo18338a(@C0359n0 InAppMessage inAppMessage);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.iam.l$b */
    public @interface C9209b {
    }

    @C0348i1
    /* renamed from: a */
    void mo18457a(@C0359n0 Context context);

    @C0353k0
    /* renamed from: b */
    void mo18322b(@C0359n0 Context context, @C0359n0 DisplayHandler displayHandler);

    @C0348i1
    /* renamed from: c */
    int mo18458c(@C0359n0 Context context, @C0359n0 Assets assets);

    /* renamed from: d */
    boolean mo18323d(@C0359n0 Context context);
}
