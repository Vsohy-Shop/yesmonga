package com.urbanairship.android.layout.environment;

import android.app.Activity;
import android.webkit.WebChromeClient;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36064q;
import com.urbanairship.android.layout.util.C35910d;
import com.urbanairship.android.layout.util.C35911e;
import com.urbanairship.app.C36030b;
import com.urbanairship.webkit.C9711g;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.android.layout.environment.p */
public interface C35614p {
    @C0359n0
    /* renamed from: a */
    C35910d<WebChromeClient> mo106639a();

    @C0359n0
    /* renamed from: b */
    C35911e mo106640b();

    @C0359n0
    /* renamed from: c */
    C36030b mo106641c();

    @C0359n0
    /* renamed from: d */
    C36064q<Activity> mo106642d();

    @C0359n0
    /* renamed from: e */
    C35910d<C9711g> mo106643e();

    /* renamed from: f */
    boolean mo106644f();

    @C0359n0
    /* renamed from: g */
    Activity mo106645g();
}
